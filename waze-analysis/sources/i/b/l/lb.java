package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class lb extends com.google.v.dm<lc, lb> implements com.google.v.fj {
    /* synthetic */ lb(byte[] bArr) {
        super(lc.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((lc) this.instance).setAdvertisingId(str);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((lc) this.instance).setOptedOutOfTracking(z);
    }

    private lb() {
        throw null;
    }
}
