package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class ahsz {
    public abstract void addFakeOverride(agax agaxVar);

    public abstract void inheritanceConflict(agax agaxVar, agax agaxVar2);

    public abstract void overrideConflict(agax agaxVar, agax agaxVar2);

    public void setOverriddenDescriptors(agax agaxVar, Collection<? extends agax> collection) {
        agaxVar.getClass();
        collection.getClass();
        agaxVar.setOverriddenDescriptors(collection);
    }
}
