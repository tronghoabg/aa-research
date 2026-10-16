package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jql extends defpackage.rxn {
    public boolean a;
    public boolean b;
    private final android.content.Context c;
    private final defpackage.xzi d;

    public jql(android.content.Context context, defpackage.xzi xziVar) {
        this.c = context;
        this.d = xziVar;
    }

    public final synchronized defpackage.jqk a() {
        defpackage.ysr.bk(!this.b, "Delegate has already been torn down");
        this.a = true;
        return (defpackage.jqk) this.d.fF();
    }

    @Override // defpackage.rxo
    public final defpackage.qvl b() {
        return a().b();
    }

    @Override // defpackage.rxo
    public final defpackage.rxi c(defpackage.rxl rxlVar) {
        return a().c(rxlVar);
    }

    @Override // defpackage.rxo
    public final void d(long j, int i, android.os.Bundle bundle, defpackage.rxr rxrVar) {
        a().d(j, i, bundle, rxrVar);
    }

    @Override // defpackage.rxo
    public final void f() {
        a().f();
    }

    @Override // defpackage.rxo
    public final void g(long j, android.os.ParcelFileDescriptor parcelFileDescriptor, defpackage.rxr rxrVar) {
        a().g(j, parcelFileDescriptor, rxrVar);
    }

    @Override // defpackage.rxo
    public final void h(long j, defpackage.rxr rxrVar) {
        a().h(j, rxrVar);
    }

    @Override // defpackage.rxo
    public final void i(long j, int i) {
        a().i(j, i);
    }

    @Override // defpackage.rxo
    public final void j(long j, java.util.List list, java.util.List list2, defpackage.rxf rxfVar) {
        a().j(j, list, list2, rxfVar);
    }

    @Override // defpackage.rxo
    public final void k(long j, java.util.List list, android.os.ParcelFileDescriptor parcelFileDescriptor, defpackage.rxf rxfVar) {
        a().k(j, list, parcelFileDescriptor, rxfVar);
    }

    @Override // defpackage.rxo
    public final void l(long j, java.util.List list, java.util.List list2, android.os.ParcelFileDescriptor parcelFileDescriptor, defpackage.rxf rxfVar) {
        a().l(j, list, list2, parcelFileDescriptor, rxfVar);
    }

    @Override // defpackage.rxo
    public final void m(long j) {
        a().m(j);
    }

    @Override // defpackage.rxo
    public final void n(long j, android.os.Bundle bundle) {
        a().n(j, bundle);
    }

    @Override // defpackage.rxo
    public final void o(boolean z, boolean z2) {
        a().o(z, z2);
    }

    @Override // defpackage.ijw, android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        int callingUid = android.os.Binder.getCallingUid();
        if (!defpackage.acsj.a.fF().g() || android.os.Process.myUid() == callingUid || defpackage.slj.a(this.c).c(callingUid)) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        throw new java.lang.SecurityException("Caller is not Google-signed.");
    }

    @Override // defpackage.rxo
    public final boolean r(long j) {
        a().r(j);
        return true;
    }

    @Override // defpackage.rxo
    public final boolean s(int i, int i2, android.os.ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        return a().s(i, i2, parcelFileDescriptor, bArr);
    }

    @Override // defpackage.rxo
    public final void t() {
        a();
    }

    @Override // defpackage.rxo
    public final void u() {
        a();
    }
}
