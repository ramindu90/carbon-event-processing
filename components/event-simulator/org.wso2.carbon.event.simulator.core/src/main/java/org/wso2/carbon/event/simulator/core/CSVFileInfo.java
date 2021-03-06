/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.event.simulator.core;

/*To Store the CSV file path and file name
*/

public class CSVFileInfo {

    private String filePath;
    private String fileName;
    private String streamId;
    private String separateCharacter;
    private long delayBetweenEventsInMillis;
    public enum Status {STARTED, PAUSED, RESUMED, STOPPED}
    private Status status;

    public String getSeparateCharacter() {
        return separateCharacter;
    }

    public void setSeparateCharacter(String separateCharacter) {
        this.separateCharacter = separateCharacter;
    }

    public CSVFileInfo() {
        this.delayBetweenEventsInMillis = 0;
    }

    public String getStreamID() {
        return streamId;
    }

    public void setStreamID(String streamId) {
        this.streamId = streamId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getDelayBetweenEventsInMillis() {
        return delayBetweenEventsInMillis;
    }

    public void setDelayBetweenEventsInMillis(long delayBetweenEventsInMillis) {
        this.delayBetweenEventsInMillis = delayBetweenEventsInMillis;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
