package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nfi extends android.hardware.camera2.CameraManager.AvailabilityCallback {
    final /* synthetic */ defpackage.nfj a;

    public nfi(defpackage.nfj nfjVar) {
        this.a = nfjVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(java.lang.String str) {
        str.getClass();
        defpackage.nfj nfjVar = this.a;
        java.util.Set set = nfjVar.a;
        set.remove(str);
        nfjVar.m(java.lang.Boolean.valueOf(!set.isEmpty()));
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(java.lang.String str) {
        str.getClass();
        defpackage.nfj nfjVar = this.a;
        nfjVar.a.add(str);
        nfjVar.m(java.lang.Boolean.TRUE);
    }
}
