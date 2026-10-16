package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahtz {
    public abstract void addFakeOverride(defpackage.agbx agbxVar);

    public abstract void inheritanceConflict(defpackage.agbx agbxVar, defpackage.agbx agbxVar2);

    public abstract void overrideConflict(defpackage.agbx agbxVar, defpackage.agbx agbxVar2);

    public void setOverriddenDescriptors(defpackage.agbx agbxVar, java.util.Collection<? extends defpackage.agbx> collection) {
        agbxVar.getClass();
        collection.getClass();
        agbxVar.setOverriddenDescriptors(collection);
    }
}
