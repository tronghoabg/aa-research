package kotlinx.b.c;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    private static final kotlinx.b.a.q[] f51005a = new kotlinx.b.a.q[0];

    public static final Set a(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "<this>");
        if (qVar instanceof m) {
            return ((m) qVar).m();
        }
        HashSet hashSet = new HashSet(qVar.b());
        int iB = qVar.b();
        for (int i2 = 0; i2 < iB; i2++) {
            hashSet.add(qVar.c(i2));
        }
        return hashSet;
    }

    public static final h.l.c b(h.l.s sVar) {
        h.g.b.x.f(sVar, "<this>");
        h.l.d dVarB = sVar.b();
        if (dVarB instanceof h.l.c) {
            return (h.l.c) dVarB;
        }
        if (!(dVarB instanceof h.l.t)) {
            Objects.toString(dVarB);
            throw new IllegalArgumentException("Only KClass supported as classifier, got ".concat(String.valueOf(dVarB)));
        }
        throw new IllegalArgumentException("Captured type parameter " + dVarB + " from generic non-reified function. Such functionality cannot be supported because " + dVarB + " is erased, either specify serializer explicitly or make calling function inline with reified " + dVarB + '.');
    }

    public static final kotlinx.b.a.q[] c(List list) {
        kotlinx.b.a.q[] qVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (qVarArr = (kotlinx.b.a.q[]) list.toArray(new kotlinx.b.a.q[0])) == null) ? f51005a : qVarArr;
    }

    public static final void d(h.l.c cVar) {
        h.g.b.x.f(cVar, "<this>");
        h.g.b.x.f(cVar, "<this>");
        String strC = cVar.c();
        if (strC == null) {
            strC = "<local class name not available>";
        }
        h.g.b.x.f(strC, "className");
        throw new kotlinx.b.k("Serializer for class '" + strC + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }
}
