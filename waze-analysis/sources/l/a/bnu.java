package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bnu extends com.google.v.dm<bnw, bnu> implements com.google.v.fj {
    /* synthetic */ bnu(byte[] bArr) {
        super(bnw.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((bnw) this.instance).addAllReasons(iterable);
    }

    private bnu() {
        throw null;
    }
}
