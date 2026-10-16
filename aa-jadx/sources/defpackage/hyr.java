package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hyr implements defpackage.hvf {
    private final byte[] a;
    private final defpackage.hyq b;

    public hyr(byte[] bArr, defpackage.hyq hyqVar) {
        this.a = bArr;
        this.b = hyqVar;
    }

    @Override // defpackage.hvf
    public final java.lang.Class a() {
        return this.b.a();
    }

    @Override // defpackage.hvf
    public final void d(defpackage.hsq hsqVar, defpackage.hve hveVar) {
        hveVar.f(this.b.b(this.a));
    }

    @Override // defpackage.hvf
    public final int e() {
        return 1;
    }

    @Override // defpackage.hvf
    public final void b() {
    }

    @Override // defpackage.hvf
    public final void c() {
    }
}
