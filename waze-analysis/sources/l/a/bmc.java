package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bmc extends com.google.v.dm<bmd, bmc> implements com.google.v.fj {
    /* synthetic */ bmc(byte[] bArr) {
        super(bmd.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((bmd) this.instance).setCacheItemsCount(j2);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((bmd) this.instance).setCacheTotalSizeKb(j2);
    }

    private bmc() {
        throw null;
    }
}
