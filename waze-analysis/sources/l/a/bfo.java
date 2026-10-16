package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bfo extends com.google.v.dm<bfp, bfo> implements com.google.v.fj {
    /* synthetic */ bfo(byte[] bArr) {
        super(bfp.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((bfp) this.instance).setExitsCount(j2);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((bfp) this.instance).setRoadshieldsCount(j2);
    }

    private bfo() {
        throw null;
    }
}
