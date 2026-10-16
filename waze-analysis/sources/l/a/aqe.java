package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aqe extends com.google.v.dm<aqg, aqe> implements com.google.v.fj {
    /* synthetic */ aqe(byte[] bArr) {
        super(aqg.DEFAULT_INSTANCE);
    }

    public final void a(ig igVar) {
        copyOnWrite();
        ((aqg) this.instance).setBluetoothPermissionRequestPopupClicked(igVar);
    }

    public final void b(ii iiVar) {
        copyOnWrite();
        ((aqg) this.instance).setBluetoothPermissionRequestPopupShown(iiVar);
    }

    public final void c(ik ikVar) {
        copyOnWrite();
        ((aqg) this.instance).setBluetoothPermissionRequestResponded(ikVar);
    }

    public final void d(im imVar) {
        copyOnWrite();
        ((aqg) this.instance).setBluetoothPermissionRequested(imVar);
    }

    public final void e(aou aouVar) {
        copyOnWrite();
        ((aqg) this.instance).setOsPermissions(aouVar);
    }

    private aqe() {
        throw null;
    }
}
