#!/bin/bash

# コンテナ名またはIDを指定します
CONTAINER_NAME_OR_ID="your_container_name_or_id"

# コピー先のディレクトリパス
DESTINATION_PATH="/usr/local/tomcat/webapps/sample"

# コンテナ内で目的のディレクトリが存在するか確認し、存在しなければ作成
docker exec $CONTAINER_NAME_OR_ID mkdir -p $DESTINATION_PATH

# カレントディレクトリ内のすべてのWARファイルをコンテナの指定したディレクトリにコピー
for war_file in *.war; do
    if [[ -f "$war_file" ]]; then
        echo "Copying $war_file to $CONTAINER_NAME_OR_ID:$DESTINATION_PATH"
        docker cp "$war_file" "$CONTAINER_NAME_OR_ID:$DESTINATION_PATH"
    else
        echo "No WAR files found in the current directory."
        break
    fi
done

echo "Copy operation completed."
