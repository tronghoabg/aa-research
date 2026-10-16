package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class afrz {
    public static final List<afhr> computeParameters(afry<?> afryVar, List<agoq> list, agol agolVar, List<agoq> list2, afvq afvqVar, boolean z) {
        afryVar.getClass();
        list.getClass();
        list2.getClass();
        afvqVar.getClass();
        afbt afbtVar = new afbt(10);
        if (z) {
            Object container = afryVar.getContainer();
            if (container instanceof afqw) {
                if (afuh.isConstructor(afryVar)) {
                    if (((afqw) container).isInner()) {
                        Class<?> declaringClass = affa.h((afhe) container).getDeclaringClass();
                        declaringClass.getClass();
                        afbtVar.add(new afnd(afryVar, affa.l(declaringClass)));
                    }
                } else if (!isLocalDelegatedProperty(afryVar)) {
                    throw new IllegalArgumentException("Only top-level callables are supported for now: " + container + '/' + afryVar.getName());
                }
            }
            Iterator<agoq> it = list.iterator();
            while (it.hasNext()) {
                afbtVar.add(new afsw(afryVar, it.next(), afbtVar.b, afhq.b, afvqVar));
            }
            if (agolVar != null) {
                String strAsString = ahnm.THIS.asString();
                strAsString.getClass();
                agoq agoqVar = new agoq(strAsString);
                agoqVar.setType(agolVar);
                afbtVar.add(new afsw(afryVar, agoqVar, afbtVar.b, afhq.c, afvqVar));
            }
        }
        Iterator<agoq> it2 = list2.iterator();
        while (it2.hasNext()) {
            afbtVar.add(new afsw(afryVar, it2.next(), afbtVar.b, afhq.d, afvqVar));
        }
        return afbtVar.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean isLocalDelegatedProperty(afry<?> afryVar) {
        return (afryVar instanceof aftr) && afuo.isLocalDelegated((afun) afryVar);
    }
}
