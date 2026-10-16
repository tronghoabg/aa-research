package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class hc extends com.google.v.dm<hd, hc> implements com.google.v.fj {
    /* synthetic */ hc(byte[] bArr) {
        super(hd.DEFAULT_INSTANCE);
    }

    public final void a(hb hbVar) {
        copyOnWrite();
        ((hd) this.instance).setAction(hbVar);
    }

    public final void b(hg hgVar) {
        copyOnWrite();
        ((hd) this.instance).setBannerInfo(hgVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((hd) this.instance).setUrl(str);
    }

    private hc() {
        throw null;
    }
}
