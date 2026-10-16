package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bng extends com.google.v.dm<bnh, bng> implements com.google.v.fj {
    /* synthetic */ bng(byte[] bArr) {
        super(bnh.DEFAULT_INSTANCE);
    }

    public final void a(bnf bnfVar) {
        copyOnWrite();
        ((bnh) this.instance).setAction(bnfVar);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((bnh) this.instance).setLockScreenMode(z);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((bnh) this.instance).setQuickClosureFlow(z);
    }

    public final void d(boc bocVar) {
        copyOnWrite();
        ((bnh) this.instance).setUgcTypeInfo(bocVar);
    }

    private bng() {
        throw null;
    }
}
