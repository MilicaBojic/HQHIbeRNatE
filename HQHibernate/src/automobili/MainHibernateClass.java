package automobili;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.Car;


public class MainHibernateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//Na samom pocetku, ovde ce biti kreirana fabrika, otvorena sesija, zapocet unos u bazu.

		        //BITNO!!!

		//Kada se nesto PRVI PUT UNOSI U BAZU, OBRATITI PAZNJU NA XML FILE jer u njemu treba da pise CREATE.
		// Drop and re-create the database schema on startup -->Cim se zavrsi prvi unos, potrebno je prepraviti na UPDATE!!!
		
		

		SessionFactory factory= new Configuration().configure().buildSessionFactory();


Car car= new Car ("bugatti", "veyron", 2015, 1.8, true);	//objekat
		
		
	Session sesija= factory.openSession();
            sesija.beginTransaction();
		
            try {
            sesija.save(car);
            System.out.println("Uneli ste auto u bazu");
            sesija.getTransaction().commit(); // ovaj komit se odnosi na BAZU!!!
            
            }
            catch   (Exception e) {


        	sesija.getTransaction().rollback();

        		}
            sesija.close();


            }}
		
	
