package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final /* synthetic */ class jmi extends defpackage.affy implements defpackage.affc {
    public static final defpackage.jmi a = new defpackage.jmi();

    public jmi() {
        super(1, android.companion.virtual.VirtualDeviceManager.VirtualDevice.class, "close", "close()V", 0);
    }

    @Override // defpackage.affc
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        android.companion.virtual.VirtualDeviceManager.VirtualDevice virtualDevice = (android.companion.virtual.VirtualDeviceManager.VirtualDevice) obj;
        virtualDevice.getClass();
        virtualDevice.close();
        return defpackage.afbk.a;
    }
}
