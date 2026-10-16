package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class alg extends com.google.v.dm<alh, alg> implements com.google.v.fj {
    /* synthetic */ alg(byte[] bArr) {
        super(alh.DEFAULT_INSTANCE);
    }

    public final void a(alf alfVar) {
        copyOnWrite();
        ((alh) this.instance).setAction(alfVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((alh) this.instance).setConsentVersion(str);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((alh) this.instance).setExistingConsent(z);
    }

    public final void d(String str) {
        copyOnWrite();
        ((alh) this.instance).setExternalTripToken(str);
    }

    public final void e(ale aleVar) {
        copyOnWrite();
        ((alh) this.instance).setFlow(aleVar);
    }

    public final void f(boolean z) {
        copyOnWrite();
        ((alh) this.instance).setIsIsv(z);
    }

    public final void g(String str) {
        copyOnWrite();
        ((alh) this.instance).setPartnerAppId(str);
    }

    private alg() {
        throw null;
    }
}
