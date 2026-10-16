package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@evo(a = "navigation")
/* loaded from: classes.dex */
public class evb extends evp<eva> {
    private final evq b;

    public evb(evq evqVar) {
        evqVar.getClass();
        this.b = evqVar;
    }

    @Override // defpackage.evp
    public final /* synthetic */ euz a() {
        return new eva(this);
    }

    @Override // defpackage.evp
    public final void d(List list, eve eveVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            euq euqVar = (euq) it.next();
            euz euzVar = euqVar.a;
            euzVar.getClass();
            eva evaVar = (eva) euzVar;
            affv affvVar = new affv();
            affvVar.a = euqVar.a();
            int iJ = evaVar.j();
            if (iJ == 0) {
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(evaVar.n()));
            }
            euz euzVar2 = (euz) aav.a(evaVar.k(), iJ);
            if (euzVar2 == null) {
                admg admgVar = evaVar.a;
                if (admgVar.d == null) {
                    admgVar.d = String.valueOf(admgVar.b);
                }
                Object obj = admgVar.d;
                obj.getClass();
                throw new IllegalArgumentException(a.bq((String) obj, "navigation destination ", " is not a direct child of this NavGraph"));
            }
            evp evpVarA = this.b.a(euzVar2.c);
            List listSingletonList = Collections.singletonList(f().a(euzVar2, euzVar2.d((Bundle) affvVar.a)));
            listSingletonList.getClass();
            evpVarA.d(listSingletonList, eveVar);
        }
    }
}
