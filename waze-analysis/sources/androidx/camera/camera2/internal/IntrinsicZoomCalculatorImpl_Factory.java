package androidx.camera.camera2.internal;

import androidx.camera.camera2.pipe.CameraDevices;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class IntrinsicZoomCalculatorImpl_Factory implements c<IntrinsicZoomCalculatorImpl> {
    private final e<CameraDevices> cameraDevicesProvider;

    private IntrinsicZoomCalculatorImpl_Factory(e<CameraDevices> eVar) {
        this.cameraDevicesProvider = eVar;
    }

    public static IntrinsicZoomCalculatorImpl_Factory create(e<CameraDevices> eVar) {
        return new IntrinsicZoomCalculatorImpl_Factory(eVar);
    }

    public static IntrinsicZoomCalculatorImpl newInstance(CameraDevices cameraDevices) {
        return new IntrinsicZoomCalculatorImpl(cameraDevices);
    }

    @Override // g.a.a, f.a.a
    public IntrinsicZoomCalculatorImpl get() {
        return newInstance(this.cameraDevicesProvider.get());
    }
}
