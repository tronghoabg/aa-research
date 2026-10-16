package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bfi extends com.google.v.dm<bfk, bfi> implements com.google.v.fj {
    /* synthetic */ bfi(byte[] bArr) {
        super(bfk.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((bfk) this.instance).setFailureReason(str);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((bfk) this.instance).setSuccess(z);
    }

    private bfi() {
        throw null;
    }
}
