package models;

import java.util.Set;

/**
 *
 * @author Sryl <cyril.lacote@gmail.com>
 */
public class Member {

    public String str;

    public Set<SharedLink> sharedLinks;

    public void setSharedLinks(Set<SharedLink> sharedLinks) {
        this.sharedLinks = sharedLinks;
    }
    
}
