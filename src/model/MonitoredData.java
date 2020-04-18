package model;

public class MonitoredData {

    private String startTime;
    private String endTime;
    private String activityLabel;

    public MonitoredData(String startTime, String endTime, String activityLabel){
        this.startTime = startTime;
        this.endTime = endTime;
        this.activityLabel = activityLabel;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getActivityLabel() {
        return activityLabel.replaceAll("\\s+","");
    }

    @Override
    public String toString() {
        return "start_time='" + startTime + '\'' +
               ", end_time='" + endTime + '\'' +
               ", activity_label='" + activityLabel + "'";
    }
}
