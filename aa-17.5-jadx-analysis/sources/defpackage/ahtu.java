package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class ahtu {
    public static final agax findMemberWithMaxVisibility(Collection<? extends agax> collection) {
        Integer numCompare;
        collection.getClass();
        collection.isEmpty();
        agax agaxVar = null;
        for (agax agaxVar2 : collection) {
            if (agaxVar == null || ((numCompare = agcb.compare(agaxVar.getVisibility(), agaxVar2.getVisibility())) != null && numCompare.intValue() < 0)) {
                agaxVar = agaxVar2;
            }
        }
        agaxVar.getClass();
        return agaxVar;
    }
}
