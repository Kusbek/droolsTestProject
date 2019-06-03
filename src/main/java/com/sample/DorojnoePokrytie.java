package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DorojnoePokrytie {

    public static void main(String[] args) {
    	KieServices ks = KieServices.Factory.get();
        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        execute( ks , kc );
    }
    
    public static void execute( KieServices ks, KieContainer kc ) {

    	
        KieSession ksession = kc.newKieSession( "recyclerRecyclingKS" );
	    Work work = new Work("id-4", "XX-XXXX-X5", "Ресайклер", "1", "m^3");
	    WorkParameter soilGroup = new WorkParameter();
	    soilGroup.setValue("25");
	    soilGroup.setWork("id-4");
	    soilGroup.setCode("THICKNESS");
	    
	    ksession.insert(soilGroup);
	    ksession.insert(work);

	    ksession.fireAllRules();
        ksession.dispose();    
    }  
   
}
