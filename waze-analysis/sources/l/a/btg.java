package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class btg extends com.google.v.dm<bti, btg> implements com.google.v.fj {
    /* synthetic */ btg(byte[] bArr) {
        super(bti.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((bti) this.instance).setDistanceMeters(j2);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((bti) this.instance).setSilent(z);
    }

    public final void c(bth bthVar) {
        copyOnWrite();
        ((bti) this.instance).setZoneType(bthVar);
    }

    private btg() {
        throw null;
    }
}
