package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahug implements defpackage.affc {
    final /* synthetic */ defpackage.agbx val$overrider;
    final /* synthetic */ defpackage.ahtz val$strategy;

    public ahug(defpackage.ahtz ahtzVar, defpackage.agbx agbxVar) {
        this.val$strategy = ahtzVar;
        this.val$overrider = agbxVar;
    }

    @Override // defpackage.affc
    public defpackage.afbk invoke(defpackage.agbx agbxVar) {
        this.val$strategy.inheritanceConflict(this.val$overrider, agbxVar);
        return defpackage.afbk.a;
    }
}
