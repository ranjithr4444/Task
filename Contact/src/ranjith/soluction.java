package ranjith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


		public class soluction {

			public static void main(String[] args) throws NumberFormatException, IOException {
				SessionFactory sf=new Configuration().configure().buildSessionFactory(); 
				Session session=sf.openSession();
		  System.out.println("1.insert/n 2.update /n3.delete /n 4.viewall");
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  int num=Integer.valueOf(br.readLine());
		  switch(num)
		  {
		  case 1:
		  {
			  System.out.println("value inserted\n");
			  item it = new item();
			  System.out.println("Enter productid:");
			  it.setProductid(Integer.parseInt(br.readLine()));
			  System.out.println("Enter productName:");
			  it.setProductname(br.readLine());
			  System.out.println("Enter quanity:");
			  it.setQuanity(br.readLine());
			  System.out.println("Enter manufacturing_date:");
			  it.setManufacturing_date(br.readLine());
			  System.out.println("Enter expri_date:");
			  it.setExpri_date(br.readLine());
			  System.out.println("Enter price:");
			  it.setPrice(Double.parseDouble(br.readLine()));
			  session.beginTransaction();
				session.save(it);
				session.getTransaction().commit();
		  }
		  case 2:
		  {
			  System.out.println("product update");
			  
			  session.beginTransaction();
			  System.out.println("Enter prouctid:");
			  Integer productid=Integer.parseInt(br.readLine());
			  System.out.println("Enter Expri_date:");
			  String expri_date=br.readLine();
			  item update=session.get(item.class,productid);
			  session.update(expri_date);
				session.getTransaction().commit();
			  
		  }
		  case 3:
		  {
			  System.out.println("product Delete");
			  session.beginTransaction();
			  item del=new item();
			  del.setProductid(Integer.parseInt(br.readLine()));
			  session.delete(del);
			  session.getTransaction().commit();
			  
		  }
		  case 4:
		  {
			  System.out.println("view all");
			  Query query=session.createQuery("from item");
			  List<item> View = query.getResultList();
			  for(item each:View)
			  {
				  System.out.println(each);
			  }
		  }
		  }
			}

	}

