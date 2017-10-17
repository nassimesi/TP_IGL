import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Bouguedra Adem on 13/10/2017.
 */
public class VecteurTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void trier() throws Exception {
        Vecteur vec=new Vecteur();
        int vect[]={1,4,3,5};
        int res []={1,3,4,5};
        vec.trier(vect);
        if (!Arrays.equals(vect,res)) {
            fail("faux");
        }

    }

    @org.junit.Test
    public void somme_vect() throws Exception {
        /*Vecteur vec=new Vecteur();
        int vect1[]={1,2,4,5,6};
        int vect2[]={1,2,4,5,6};
        int res[]={2,4,8,10,12};
        int vect[]={0,0,0,0,0};
        vec.somme_vect(vect1,vect2,vect);
        if (!Arrays.equals(res,vect))fail("resultat faux");*/



    }

    @org.junit.Test
    public void invers_vect() throws Exception {
        /*Vecteur vec=new Vecteur();
        int vect[]={1,2,3,4};
        int res[]={4,3,2,1};
        vec.invers_vect(vect);
        if (Arrays.equals(res,vect)) fail("resulta faux");*/

    }

    @org.junit.Test
    public void min_max() throws Exception {
        Vecteur vec=new Vecteur();
        int max=9;
        int min=1;
        int vect[]={4,8,3,9,1};
        int min_max[]={0,0,0};
        vec.min_max(vect,min_max);
        if (min!=min_max[1] && max!=min_max[2])fail("resulta faux");
    }

    @org.junit.Test
    public void formule() throws Exception {

    }

    @org.junit.Test
    public void ap_formule() throws Exception {

    }

}