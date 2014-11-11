package bean;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class LifeCycleListener implements PhaseListener
{

	public void afterPhase(PhaseEvent even) 
	{
		System.out.println("END PHASE "+even.getPhaseId());
		
	}

	public void beforePhase(PhaseEvent even) 
	{

		System.out.println("START PHASE "+even.getPhaseId());
		
	}

	public PhaseId getPhaseId() 
	{
		return PhaseId.ANY_PHASE;
	}

}
