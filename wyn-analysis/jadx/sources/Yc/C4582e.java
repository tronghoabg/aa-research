package yc;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.Iterator;
import o1.C3641c;
import zc.AbstractC4660a;

/* renamed from: yc.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4582e extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f48108a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f48109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4584g f48110c;

    public C4582e(C4584g c4584g, Runnable runnable) {
        this.f48110c = c4584g;
        this.f48109b = runnable;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        Log.i("Camera", "CameraCaptureSession onClosed");
        this.f48108a = true;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Log.i("Camera", "CameraCaptureSession onConfigureFailed");
        this.f48110c.f48119h.w("Failed to configure camera session.");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Log.i("Camera", "CameraCaptureSession onConfigured");
        C4584g c4584g = this.f48110c;
        if (c4584g.f48125o == null || this.f48108a) {
            c4584g.f48119h.w("The camera was closed during configuration.");
            return;
        }
        c4584g.f48126p = cameraCaptureSession;
        Log.i("Camera", "Updating builder settings");
        CaptureRequest.Builder builder = c4584g.f48129s;
        Iterator it = c4584g.f48112a.f5569a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC4660a) it.next()).a(builder);
        }
        c4584g.h(this.f48109b, new C3641c(this, 20));
    }
}
