package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class hf extends com.google.v.dm<hg, hf> implements com.google.v.fj {
    /* synthetic */ hf(byte[] bArr) {
        super(hg.DEFAULT_INSTANCE);
    }

    public final void a(he heVar) {
        copyOnWrite();
        ((hg) this.instance).setBannerSource(heVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((hg) this.instance).setId(str);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((hg) this.instance).setIndex(j2);
    }

    public final void d(String str) {
        copyOnWrite();
        ((hg) this.instance).setText(str);
    }

    private hf() {
        throw null;
    }
}
