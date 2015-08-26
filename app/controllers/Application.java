package controllers;

import models.CommitmentArea;
import models.Person;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class Application extends Controller {

    Form<Person> newPerson=new Form(Person.class);

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    public Result register(){


        return ok(register.render("Registration Page",newPerson));
    }

    public Result processRegister(){
        Form<Person> providedUser=newPerson.bindFromRequest();
        if(providedUser.hasErrors()){
            return ok(register.render("Please Provide correct Information",providedUser));
        }

        Person savablePerson=providedUser.get();

        savablePerson.save();
        flash("Your response has been saved");
      return redirect("/");
    }

    public Result analytics()

    {
        return ok(analytics.render("Analytics Page"));
    }

    public Result about()

    {
        return ok(about.render("About Us Page"));
    }

    public Result loadCommitments(){
        String [] s={"GO as Full-time missionary","Join Operation Josua(OJ)","Join Christian Volunteer Service(CVS)",
                "Make General Financial Donation","Make Designated Financial Donation(Specify)","Join a CAST/Prayer Group for Missions",
                "Start a prayer Group for Missions","Be an Advocate for Missions","Need Training",
                "Want to Volunteer with my skills(Specify)","Subscribe for OCCUPY(N 1,000/25$ for $ editions per annum)"
        };

        CommitmentArea[] cloader=new CommitmentArea[s.length];

        for(int i=0;i<(s.length-1);i++){
            cloader[i]=new CommitmentArea();
            cloader[i].commitmentAreaName=s[i].toString();

            cloader[i].save();
            System.out.println(s[i].toString());

        }



        return ok("commitment loaded");
    }
}
