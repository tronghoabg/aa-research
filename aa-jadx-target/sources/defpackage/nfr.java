package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nfr extends android.hardware.camera2.CameraManager.TorchCallback {
    final /* synthetic */ defpackage.nfs a;

    public nfr(defpackage.nfs nfsVar) {
        this.a = nfsVar;
    }

    @Override // android.hardware.camera2.CameraManager.TorchCallback
    public final void onTorchModeChanged(java.lang.String str, boolean z) {
        str.getClass();
        defpackage.nfs nfsVar = this.a;
        if (z) {
            nfsVar.a.add(str);
        } else {
            nfsVar.a.remove(str);
        }
        defpackage.nfs nfsVar2 = this.a;
        nfsVar2.m(java.lang.Boolean.valueOf(!nfsVar2.a.isEmpty()));
    }
}
