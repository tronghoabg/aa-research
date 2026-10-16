package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class tm extends com.google.v.dm<tn, tm> implements com.google.v.fj {
    /* synthetic */ tm(byte[] bArr) {
        super(tn.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((tn) this.instance).setElectricVehicleSlotsAvailable(j2);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((tn) this.instance).setElectricVehicleSlotsCapacity(j2);
    }

    private tm() {
        throw null;
    }
}
