package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqq extends com.google.v.dm<bqs, bqq> implements com.google.v.fj {
    /* synthetic */ bqq(byte[] bArr) {
        super(bqs.DEFAULT_INSTANCE);
    }

    public final void a(bfk bfkVar) {
        copyOnWrite();
        ((bqs) this.instance).setSoundPlayed(bfkVar);
    }

    public final void b(bmd bmdVar) {
        copyOnWrite();
        ((bqs) this.instance).setTtsCacheSize(bmdVar);
    }

    public final void c(bmg bmgVar) {
        copyOnWrite();
        ((bqs) this.instance).setTtsDownloadRequest(bmgVar);
    }

    private bqq() {
        throw null;
    }
}
