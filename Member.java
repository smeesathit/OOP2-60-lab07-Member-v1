/**
 * An istance of this class represents a member.
 */

import java.util.GregorianCalendar;

public class Member 
{
    // class variables
    private static final String INITIAL = "MB";
    private static final String DEFAULT_STRING = "Unassigned";

    // instance variables
    /** the id of this memeber */
    private String  memberId;
    /** the name of this memeber */
    private String  memberName;
    /** the expiry date of the membership for this memeber */
    private GregorianCalendar expiryDate;
    /** the current point of this memeber */
    private int     point;

    //-------------------
    // Constructors
    //-------------------

    /**
     * Constructor.
     *
     * @param memberId      the id of this memeber
     * @param memberName    the name of this memeber
     * @param expiryDate    the expiry date of the membership for this memeber
     *
     */
    public Member(String memberId, String memberName, GregorianCalendar expiryDate) 
    {
        this.setMemberId(memberId);
        setMemberName(memberName);
        setExpiryDate(expiryDate);
        addPoint(0);
    } // end three-argument Member constructor

    public void setMemberId( String id){
        memberId = id;
    }

    /**
     * Returns the id of this memeber
     *
     * @return the id of this memeber
     */ 
    public String getMemberId( ){
        return memberId;
    }

    /**
     * Sets the name of this memeber
     * 
     * @param name the name of this memeber
     */ 
    public void setMemberName( String name){
        memberName = name;
    }

    /**
     * Returns the name of this memeber
     *
     * @return the name of this memeber
     */
    public String getMemberName( ){
        return memberName;
    }   

    public void setExpiryDate(GregorianCalendar date){
        expiryDate = date;
    }

    public GregorianCalendar getExpiryDate(){
        return expiryDate;
    }

    public int getPoint( ){
        return point;
    }   

    public void addPoint( int point )
    {
        this.point += point;

    } // end addPoint

    public void redeemPoint( int point )
    {
        this.point = this.point - point;
    } // end redeemPoint

    public String toString(){
        String s = String.format("%1$td/%1$tm/%1$ty", getExpiryDate());

        return String.format("%10s  %30s    %10s    %6d", getMemberId(), getMemberName(), s, getPoint());
    } // end toString
} // end Member
