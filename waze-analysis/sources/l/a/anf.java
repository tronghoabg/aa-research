package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class anf extends com.google.v.dm<anh, anf> implements com.google.v.fj {
    /* synthetic */ anf(byte[] bArr) {
        super(anh.DEFAULT_INSTANCE);
    }

    public final void a(double d2) {
        copyOnWrite();
        ((anh) this.instance).setAccuracy(d2);
    }

    public final void b(ang angVar) {
        copyOnWrite();
        ((anh) this.instance).setConnectionType(angVar);
    }

    public final void c(afx afxVar) {
        copyOnWrite();
        ((anh) this.instance).setCoordinates(afxVar);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((anh) this.instance).setIpv4(z);
    }

    public final void e(boolean z) {
        copyOnWrite();
        ((anh) this.instance).setIpv6(z);
    }

    public final void f(long j2) {
        copyOnWrite();
        ((anh) this.instance).setMobileCountryCode(j2);
    }

    public final void g(long j2) {
        copyOnWrite();
        ((anh) this.instance).setMobileNetworkCode(j2);
    }

    private anf() {
        throw null;
    }
}
