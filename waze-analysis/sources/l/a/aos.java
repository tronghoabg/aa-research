package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aos extends com.google.v.dm<aou, aos> implements com.google.v.fj {
    /* synthetic */ aos(byte[] bArr) {
        super(aou.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((aou) this.instance).setOsBluetoothConnectivityPermissionEnabled(z);
    }

    public final void b(aot aotVar) {
        copyOnWrite();
        ((aou) this.instance).setOsLocationPermission(aotVar);
    }

    private aos() {
        throw null;
    }
}
