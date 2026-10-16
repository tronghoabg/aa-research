package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class agub {
    public static final agfc extractNullabilityAnnotationOnBoundedWildcard(agvu agvuVar, ahaa ahaaVar) {
        agfc next;
        agvuVar.getClass();
        ahaaVar.getClass();
        if (ahaaVar.getBound() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator<agfc> it = new agvq(agvuVar, ahaaVar, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            agfc agfcVar = next;
            for (ahnf ahnfVar : agsy.getRXJAVA3_ANNOTATIONS()) {
                if (affa.f(agfcVar.getFqName(), ahnfVar)) {
                    break loop0;
                }
            }
        }
        return next;
    }

    public static final boolean hasErasedValueParameters(agax agaxVar) {
        agaxVar.getClass();
        return (agaxVar instanceof agcj) && affa.f(agaxVar.getUserData(agve.HAS_ERASED_VALUE_PARAMETERS), true);
    }

    public static final boolean isJspecifyEnabledInStrictMode(agtd agtdVar) {
        agtdVar.getClass();
        return agtdVar.getGetReportLevelForAnnotation().invoke(agsy.getJSPECIFY_ANNOTATIONS_PACKAGE()) == agtq.STRICT;
    }

    public static final agcc toDescriptorVisibility(agey ageyVar) {
        ageyVar.getClass();
        return agsv.toDescriptorVisibility(ageyVar);
    }
}
