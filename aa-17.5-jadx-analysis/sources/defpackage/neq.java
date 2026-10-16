package defpackage;

import android.hardware.camera2.CameraManager;

/* loaded from: classes.dex */
public final class neq extends CameraManager.AvailabilityCallback {
    final /* synthetic */ ner a;

    public neq(ner nerVar) {
        this.a = nerVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        str.getClass();
        ner nerVar = this.a;
        nerVar.a.remove(str);
        nerVar.m(Boolean.valueOf(!r0.isEmpty()));
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        str.getClass();
        ner nerVar = this.a;
        nerVar.a.add(str);
        nerVar.m(true);
    }
}
