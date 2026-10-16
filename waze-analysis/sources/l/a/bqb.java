package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqb extends com.google.v.dm<bqc, bqb> implements com.google.v.fj {
    /* synthetic */ bqb(byte[] bArr) {
        super(bqc.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((bqc) this.instance).setChangedFrom(str);
    }

    public final void b(fv fvVar) {
        copyOnWrite();
        ((bqc) this.instance).setChangedSource(fvVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((bqc) this.instance).setChangedTo(str);
    }

    private bqb() {
        throw null;
    }
}
