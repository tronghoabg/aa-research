package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class hu extends com.google.v.dm<hw, hu> implements com.google.v.fj {
    /* synthetic */ hu(byte[] bArr) {
        super(hw.DEFAULT_INSTANCE);
    }

    public final void a(hr hrVar) {
        copyOnWrite();
        ((hw) this.instance).setBeaconScanningStarted(hrVar);
    }

    public final void b(ht htVar) {
        copyOnWrite();
        ((hw) this.instance).setBeaconScanningStopped(htVar);
    }

    private hu() {
        throw null;
    }
}
