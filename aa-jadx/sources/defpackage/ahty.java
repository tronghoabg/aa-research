package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahty extends defpackage.ahtz {
    protected abstract void conflict(defpackage.agbx agbxVar, defpackage.agbx agbxVar2);

    @Override // defpackage.ahtz
    public void inheritanceConflict(defpackage.agbx agbxVar, defpackage.agbx agbxVar2) {
        agbxVar.getClass();
        agbxVar2.getClass();
        conflict(agbxVar, agbxVar2);
    }

    @Override // defpackage.ahtz
    public void overrideConflict(defpackage.agbx agbxVar, defpackage.agbx agbxVar2) {
        agbxVar.getClass();
        agbxVar2.getClass();
        conflict(agbxVar, agbxVar2);
    }
}
