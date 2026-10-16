package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompat;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1 extends h.c.b.a.g implements p<af, h.c.e<? super CameraDeviceSetupCompat>, Object> {
    final /* synthetic */ String $cameraId;
    int label;
    final /* synthetic */ Camera2DeviceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1(String str, Camera2DeviceCache camera2DeviceCache, h.c.e<? super Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1> eVar) {
        super(2, eVar);
        this.$cameraId = str;
        this.this$0 = camera2DeviceCache;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1(this.$cameraId, this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super CameraDeviceSetupCompat> eVar) {
        return ((Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Exception {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.b.c.b(obj);
        String str = this.$cameraId;
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, "Initializing CameraDeviceSetupCompat for ".concat(CameraId.m552toStringimpl(str)));
        }
        String str2 = this.$cameraId;
        Camera2DeviceCache camera2DeviceCache = this.this$0;
        CameraErrorListener cameraErrorListener = camera2DeviceCache.cameraErrorListener;
        try {
            return camera2DeviceCache.getCameraDeviceSetupCompatFactory().getCameraDeviceSetupCompat(str2);
        } catch (Exception e2) {
            if (e2 instanceof CameraAccessException) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to execute call: Camera encountered an error: ".concat(String.valueOf(e2.getMessage())));
                }
                cameraErrorListener.mo1038onCameraError3M5Xam4(str2, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
            } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to execute call: Unexpected exception: ".concat(String.valueOf(e2.getMessage())));
                }
                cameraErrorListener.mo1038onCameraError3M5Xam4(str2, CameraError.Companion.m491getERROR_GRAPH_CONFIGv7Vf74A(), false);
            } else {
                if (!(e2 instanceof IllegalStateException)) {
                    throw e2;
                }
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Failed to execute call: Camera may be closed");
                    return null;
                }
            }
            return null;
        }
    }
}
