package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class imd implements android.os.IBinder.DeathRecipient {
    final /* synthetic */ defpackage.qxc a;
    final /* synthetic */ int b;
    final /* synthetic */ defpackage.imi c;

    public imd(defpackage.imi imiVar, defpackage.qxc qxcVar, int i) {
        this.a = qxcVar;
        this.b = i;
        this.c = imiVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        defpackage.imi imiVar = this.c;
        imiVar.aQ(this.a.asBinder());
        android.content.Context context = imiVar.k;
        defpackage.zaa zaaVar = defpackage.zaa.CAR_CONNECTION_LISTENER_BINDER_DIED;
        java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(this.b);
        java.lang.String str = packagesForUid != null ? packagesForUid[0] : "unknown";
        ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.h()).ai((char) 375)).y("Binder died: %s", str);
        imiVar.O.i(zaaVar, defpackage.zab.CS_BINDER_DIED, str);
    }
}
