package acme.features.patron.dashboards;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.framework.repositories.AbstractRepository;

@Repository
public interface PatronDashboardRepository extends AbstractRepository{
	
	
	
	@Query("select count(p) from Patronage p where acme.entities.patronagestatus.PROPOSED ")
	Double  numberOfProposedPatronages();
	
	@Query("select count(p) from Patronage p where acme.entities.patronagestatus.ACCEPTED ")
	Double  numberOfAcceptedPatronages();
	
	@Query("select count(p) from Patronage p where acme.entities.patronagestatus.DENIED ")
	Double  numberOfDeniedPatronages();
	
	
	// AVERAGE
	
	@Query("select avg(p.budget) from Patronage p group by acme.entities.patronagestatus.PROPOSED ")
	Double averageBudgetProposedPatronages();
	
	@Query("select avg(p.budget) from Patronage p group by acme.entities.patronagestatus.ACCEPTED ")
	Double averageBudgetAcceptedPatronages();
	
	@Query("select avg(p.budget) from Patronage p group by acme.entities.patronagestatus.DENIED ")
	Double averageBudgetDeniedPatronages();
	
	
	// DEVIATION
	
	@Query("select stdev(p.budget) from Patronage p group by acme.entities.patronagestatus.PROPOSED ")
	Double deviationBudgetProposedPatronages();
	
	@Query("select stdev(p.budget) from Patronage p group by acme.entities.patronagestatus.ACCEPTED ")
	Double deviationBudgetAcceptedPatronages();
	
	@Query("select stdev(p.budget) from Patronage p group by acme.entities.patronagestatus.DENIED ")
	Double deviationBudgetDeniedPatronages();
	
	
	
	//MINIMUN
	
	@Query("select min(p.budget) from Patronage p group by acme.entities.patronagestatus.PROPOSED ")
	Double minBudgetProposedPatronages();
	
	@Query("select min(p.budget) from Patronage p group by acme.entities.patronagestatus.ACCEPTED ")
	Double minBudgetAcceptedPatronages();
	
	@Query("select min(p.budget) from Patronage p group by acme.entities.patronagestatus.DENIED ")
	Double minBudgetDeniedPatronages();
	
	//MAXIMUM
	
	@Query("select max(p.budget) from Patronage p group by acme.entities.patronagestatus.PROPOSED ")
	Double maxBudgetProposedPatronages();
	
	@Query("select max(p.budget) from Patronage p group by acme.entities.patronagestatus.ACCEPTED ")
	Double maxBudgetAcceptedPatronages();
	
	@Query("select max(p.budget) from Patronage p group by acme.entities.patronagestatus.DENIED ")
	Double maxBudgetDeniedPatronages();

}