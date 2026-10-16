package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aft extends defpackage.agr {
    private final defpackage.bwx a;
    private final defpackage.bwx b;

    public aft(java.lang.Object obj) {
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, bxvVar);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, bxvVar);
    }

    @Override // defpackage.agr
    public final java.lang.Object a() {
        return this.a.a();
    }

    @Override // defpackage.agr
    public final java.lang.Object b() {
        return this.b.a();
    }

    @Override // defpackage.agr
    public final void c(java.lang.Object obj) {
        this.a.b(obj);
    }

    public final void d(java.lang.Object obj) {
        this.b.b(obj);
    }

    public final boolean e() {
        return defpackage.afga.f(a(), b()) && !g();
    }
}
