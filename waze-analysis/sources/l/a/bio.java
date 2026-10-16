package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bio extends com.google.v.dm<biq, bio> implements bir {
    /* synthetic */ bio(byte[] bArr) {
        super(biq.DEFAULT_INSTANCE);
    }

    public final void a(float f2) {
        copyOnWrite();
        ((biq) this.instance).setTimelineRelativeTrafficEndPosition(f2);
    }

    public final void b(float f2) {
        copyOnWrite();
        ((biq) this.instance).setTimelineRelativeTrafficStartPosition(f2);
    }

    public final void c(bip bipVar) {
        copyOnWrite();
        ((biq) this.instance).setTrafficIncidentLevel(bipVar);
    }

    private bio() {
        throw null;
    }
}
