package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class kl extends com.google.v.dm<kn, kl> implements com.google.v.fj {
    /* synthetic */ kl(byte[] bArr) {
        super(kn.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((kn) this.instance).setBoolVal(z);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((kn) this.instance).setIntVal(j2);
    }

    public final void c(String str) {
        copyOnWrite();
        ((kn) this.instance).setParameter(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((kn) this.instance).setStringVal(str);
    }

    private kl() {
        throw null;
    }
}
