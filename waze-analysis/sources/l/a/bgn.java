package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgn extends com.google.v.dm<bgo, bgn> implements com.google.v.fj {
    /* synthetic */ bgn(byte[] bArr) {
        super(bgo.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((bgo) this.instance).setLoginSessionInBackground(z);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((bgo) this.instance).setResponseProcessingTimeMs(j2);
    }

    private bgn() {
        throw null;
    }
}
