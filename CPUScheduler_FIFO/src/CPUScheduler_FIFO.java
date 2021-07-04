
import java.util.ArrayList;
import java.util.List;

public abstract class CPUScheduler_FIFO
{
    private final List<Row> rows;
    private final List<Event> timeline;
    
    public CPUScheduler_FIFO()
    {
        rows = new ArrayList();
        timeline = new ArrayList();
    
    }
    
    public boolean add(Row row)
    {
        return rows.add(row);
    }
    
    public double getAverageWaitingTime()
    {
        double avg = 0.0;
        
        for (Row row : rows)
        {
            avg += row.getWaitingTime();
        }
        
        return avg / rows.size();
    }
    
    public double getAverageResponseTime(){
        double avg = 0.0;
        
        for (Row row : rows)
        {
            avg += row.getResponseTime();
        }
        
        return avg / rows.size();
    }
    
    public Event getEvent(Row row)
    {
        for (Event event : timeline)
        {
            if (row.getProcessName().equals(event.getProcessName()))
            {
                return event;
            }
        }
        
        return null;
    }
    
    public Row getRow(String process)
    {
        for (Row row : rows)
        {
            if (row.getProcessName().equals(process))
            {
                return row;
            }
        }
        
        return null;
    }
    
    public List<Row> getRows()
    {
        return rows;
    }
    
    public List<Event> getTimeline()
    {
        return timeline;
    }
    
    public abstract void process();
}
