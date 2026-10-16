package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class baz extends com.google.v.dm<bba, baz> implements com.google.v.fj {
    /* synthetic */ baz(byte[] bArr) {
        super(bba.DEFAULT_INSTANCE);
    }

    public final void a() {
        copyOnWrite();
        ((bba) this.instance).setFreshLocationAvailable(true);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((bba) this.instance).setLocationTimestampMs(j2);
    }

    private baz() {
        throw null;
    }
}
