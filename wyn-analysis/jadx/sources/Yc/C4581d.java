package yc;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.Log;
import kd.RunnableC3307c;
import md.J;
import u0.w0;

/* renamed from: yc.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4581d extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ic.a f48106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4584g f48107b;

    public C4581d(C4584g c4584g, Ic.a aVar) {
        this.f48107b = c4584g;
        this.f48106a = aVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        Log.i("Camera", "open | onClosed");
        C4584g c4584g = this.f48107b;
        c4584g.f48125o = null;
        if (c4584g.f48126p != null) {
            Log.i("Camera", "closeCaptureSession");
            c4584g.f48126p.close();
            c4584g.f48126p = null;
        }
        J j8 = c4584g.f48119h;
        ((Handler) j8.f40580a).post(new RunnableC3307c(j8, 28));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        Log.i("Camera", "open | onDisconnected");
        C4584g c4584g = this.f48107b;
        c4584g.a();
        c4584g.f48119h.w("The camera was disconnected.");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i5) {
        Log.i("Camera", "open | onError");
        C4584g c4584g = this.f48107b;
        c4584g.a();
        c4584g.f48119h.w(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? "Unknown camera error" : "The camera service has encountered a fatal error." : "The camera device has encountered a fatal error" : "The camera device could not be opened due to a device policy." : "Max cameras in use" : "The camera device is in use already.");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        C4584g c4584g = this.f48107b;
        c4584g.f48125o = new w0(c4584g, cameraDevice);
        try {
            c4584g.p(c4584g.f48131u ? null : new RunnableC4579b(1, this, this.f48106a));
        } catch (Exception e7) {
            c4584g.f48119h.w(e7.getMessage() == null ? e7.getClass().getName().concat(" occurred while opening camera.") : e7.getMessage());
            c4584g.a();
        }
    }
}
