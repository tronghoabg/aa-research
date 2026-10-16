package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nfj extends defpackage.eqp {
    private final defpackage.nfi h = new defpackage.nfi(this);
    public final java.util.Set a = new java.util.LinkedHashSet();

    @Override // defpackage.eqp
    protected final void c() {
        java.lang.Object systemService = defpackage.mkp.a.c.getSystemService((java.lang.Class<java.lang.Object>) android.hardware.camera2.CameraManager.class);
        if (systemService == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        ((android.hardware.camera2.CameraManager) systemService).registerAvailabilityCallback(this.h, (android.os.Handler) null);
    }

    @Override // defpackage.eqp
    protected final void d() {
        java.lang.Object systemService = defpackage.mkp.a.c.getSystemService((java.lang.Class<java.lang.Object>) android.hardware.camera2.CameraManager.class);
        if (systemService == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        ((android.hardware.camera2.CameraManager) systemService).unregisterAvailabilityCallback(this.h);
    }
}
