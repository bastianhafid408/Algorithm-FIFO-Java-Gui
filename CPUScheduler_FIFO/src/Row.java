
public class Row{
    private String processName;
    private int arrivalTime;
    private int burstTime;
    private int waitingTime;
    private int responseTime;
    
    private Row(String processName, int arrivalTime, int burstTime, int waitingTime, int responseTime)
    {
        this.processName = processName;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.waitingTime = waitingTime;
        this.responseTime = responseTime;
    }
    
    public Row(String processName, int arrivalTime, int burstTime)
    {
        this(processName, arrivalTime, burstTime, 0, 0);
    }
    
    public void setBurstTime(int burstTime)
    {
        this.burstTime = burstTime;
    }
    
    public void setWaitingTime(int waitingTime)
    {
        this.waitingTime = waitingTime;
    }
    
    public void setResponseTime(int responseTime)
    {
        this.responseTime = responseTime;
    }
    
    public String getProcessName()
    {
        return this.processName;
    }
    
    public int getArrivalTime()
    {
        return this.arrivalTime;
    }
    
    public int getBurstTime()
    {
        return this.burstTime;
    }
    
    public int getWaitingTime()
    {
        return this.waitingTime;
    }
    
    public int getResponseTime()
    {
        return this.responseTime;
    }
}
