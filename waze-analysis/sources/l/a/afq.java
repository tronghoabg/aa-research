package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class afq extends com.google.v.dm<afr, afq> implements com.google.v.fj {
    /* synthetic */ afq(byte[] bArr) {
        super(afr.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((afr) this.instance).setEstimatedArrivalTimestampUnixSeconds(j2);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((afr) this.instance).setTimeToCrossSeconds(j2);
    }

    private afq() {
        throw null;
    }
}
