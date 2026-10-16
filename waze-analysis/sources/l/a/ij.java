package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ij extends com.google.v.dm<ik, ij> implements com.google.v.fj {
    /* synthetic */ ij(byte[] bArr) {
        super(ik.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((ik) this.instance).setAllowBluetoothPermissions(z);
    }

    public final void b(in inVar) {
        copyOnWrite();
        ((ik) this.instance).setRequestTrigger(inVar);
    }

    private ij() {
        throw null;
    }
}
