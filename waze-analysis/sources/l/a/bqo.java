package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqo extends com.google.v.dm<bqp, bqo> implements com.google.v.fj {
    /* synthetic */ bqo(byte[] bArr) {
        super(bqp.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((bqp) this.instance).setAutoSelected(z);
    }

    public final void b(String str) {
        copyOnWrite();
        ((bqp) this.instance).setLanguage(str);
    }

    private bqo() {
        throw null;
    }
}
