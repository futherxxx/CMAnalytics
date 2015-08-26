package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by SOAlade on 8/1/2015.
 */
@Entity
public class CommitmentArea extends Model {
    @Id
    public Long Id;
    public String commitmentAreaName;
}
