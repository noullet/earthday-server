package earthday

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode
@ToString(includeNames=true)
class Point {

    String id
    List coordinates

    static mapping = {
        coordinates geoIndex:true
    }
}