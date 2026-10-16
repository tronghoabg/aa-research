package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Trace;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.Threads;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CameraOpener implements CameraOpener {
    private final g.a.a<CameraManager> cameraManager;
    private final Threads threads;

    public Camera2CameraOpener(g.a.a<CameraManager> aVar, Threads threads) {
        x.f(aVar, "cameraManager");
        x.f(threads, "threads");
        this.cameraManager = aVar;
        this.threads = threads;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraOpener
    /* renamed from: openCamera-RzXb1QE, reason: not valid java name */
    public Object mo1010openCameraRzXb1QE(String str, CameraDevice.StateCallback stateCallback, h.c.e<? super ab> eVar) {
        CameraManager cameraManager = this.cameraManager.get();
        try {
            Trace.beginSection(CameraId.m552toStringimpl(str).concat("#openCamera"));
            x.c(cameraManager);
            Api28Compat.openCamera(cameraManager, str, this.threads.getCamera2Executor(), stateCallback);
            Trace.endSection();
            return ab.f48028a;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
