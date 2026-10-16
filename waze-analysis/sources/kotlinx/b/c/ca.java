package kotlinx.b.c;

import androidx.autofill.HintConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ca {
    public static final int a(kotlinx.b.a.q qVar, kotlinx.b.a.q[] qVarArr) {
        h.g.b.x.f(qVar, "<this>");
        h.g.b.x.f(qVarArr, "typeParams");
        int iHashCode = (qVar.d().hashCode() * 31) + Arrays.hashCode(qVarArr);
        h.g.b.x.f(qVar, "<this>");
        int iHashCode2 = 1;
        kotlinx.b.a.u uVar = new kotlinx.b.a.u(qVar, 1);
        Iterator it = uVar.iterator();
        int i2 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i3 = i2 * 31;
            String strD = ((kotlinx.b.a.q) it.next()).d();
            if (strD != null) {
                iHashCode3 = strD.hashCode();
            }
            i2 = i3 + iHashCode3;
        }
        Iterator it2 = uVar.iterator();
        while (it2.hasNext()) {
            int i4 = iHashCode2 * 31;
            kotlinx.b.a.x xVarH = ((kotlinx.b.a.q) it2.next()).h();
            iHashCode2 = i4 + (xVarH != null ? xVarH.hashCode() : 0);
        }
        return (((iHashCode * 31) + i2) * 31) + iHashCode2;
    }

    public static final String b(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "<this>");
        return h.a.i.aM(h.k.n.u(0, qVar.b()), ", ", qVar.d() + '(', ")", 0, new com.waze.uid.b(qVar, 12), 24);
    }

    public static final Set c(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "<this>");
        return bp.a(qVar);
    }

    public static final kotlinx.b.a.q d(String str, kotlinx.b.b bVar) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(bVar, "primitiveSerializer");
        return new ao(str, new ap(bVar));
    }
}
