package au.edu.sydney.brawndo.erp.spfea;

import au.edu.sydney.brawndo.erp.auth.AuthToken;
import au.edu.sydney.brawndo.erp.database.TestDatabase;
import au.edu.sydney.brawndo.erp.ordering.Customer;

public class CustomerImpl implements Customer {


    private final int id;
    private AuthToken token;
    private String fName;
    private String lName;
    private String phoneNumber;
    private String emailAddress;
    private String address;
    private String suburb;
    private String state;
    private String postCode;
    private String merchandiser;
    private String businessName;
    private String pigeonCoopID;

    public CustomerImpl(AuthToken token, int id) {
        this.token = token;
        this.id = id;
        this.fName = null;
        this.lName = null;
        this.phoneNumber = null;
        this.emailAddress = null;
        this.address = null;
        this.suburb = null;
        this.state = null;
        this.postCode = null;
        this.merchandiser = null;
        this.businessName = null;
        this.pigeonCoopID = null;
    }

    public int getId() {
        return id;
    }

    @Override
    public String getfName() {
        if(this.fName == null){
            this.fName = TestDatabase.getInstance().getCustomerField(token, id, "fName");
        }
        return this.fName;
    }

    @Override
    public String getlName() {
        if(this.lName == null){
            this.lName = TestDatabase.getInstance().getCustomerField(token, id, "lName");
        }
        return this.lName;
    }

    @Override
    public String getPhoneNumber() {
        if(this.phoneNumber == null){
            this.phoneNumber = TestDatabase.getInstance().getCustomerField(token, id, "phoneNumber");
        }
        return this.phoneNumber;
    }

    @Override
    public String getEmailAddress() {
        if(this.emailAddress == null){
            this.emailAddress = TestDatabase.getInstance().getCustomerField(token, id, "emailAddress");
        }
        return this.emailAddress;
    }

    @Override
    public String getAddress() {
        if(this.address == null){
            this.address = TestDatabase.getInstance().getCustomerField(token, id, "address");
        }
        return this.address;
    }

    @Override
    public String getSuburb() {
        if(this.suburb == null){
            this.suburb = TestDatabase.getInstance().getCustomerField(token, id, "suburb");
        }
        return this.suburb;
    }

    @Override
    public String getState() {
        if(this.state == null){
            this.state = TestDatabase.getInstance().getCustomerField(token, id, "state");
        }
        return this.state;
    }

    @Override
    public String getPostCode() {
        if(this.postCode == null){
            this.postCode = TestDatabase.getInstance().getCustomerField(token, id, "postCode");
        }
        return this.postCode;
    }

    @Override
    public String getMerchandiser() {
        if(this.merchandiser == null){
            this.merchandiser = TestDatabase.getInstance().getCustomerField(token, id, "merchandiser");
        }
        return this.merchandiser;
    }

    @Override
    public String getBusinessName() {
        if(this.businessName == null){
            this.businessName = TestDatabase.getInstance().getCustomerField(token, id, "businessName");
        }
        return this.businessName;
    }

    @Override
    public String getPigeonCoopID() {
        if(this.pigeonCoopID == null){
            this.pigeonCoopID = TestDatabase.getInstance().getCustomerField(token, id, "pigeonCoopID");
        }
        return this.pigeonCoopID;
    }
}

