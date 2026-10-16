package androidx.camera.camera2.pipe.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0;
import android.util.ArrayMap;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraExtensionMetadata;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.config.CameraPipeContext;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Permissions;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import h.a.i;
import h.a.r;
import h.g.b.x;
import java.util.Arrays;
import java.util.Set;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2MetadataCache implements Camera2MetadataProvider {
    private final ArrayMap<String, CameraMetadata> cache;
    private final Context cameraPipeContext;
    private final ArrayMap<String, CameraExtensionMetadata> extensionCache;
    private final ArrayMap<String, CameraExtensionCharacteristics> extensionCharacteristicsCache;
    private final Permissions permissions;
    private final Threads threads;
    private final TimeSource timeSource;

    public Camera2MetadataCache(@CameraPipeContext Context context, Threads threads, Permissions permissions, TimeSource timeSource) {
        x.f(context, "cameraPipeContext");
        x.f(threads, "threads");
        x.f(permissions, "permissions");
        x.f(timeSource, "timeSource");
        this.cameraPipeContext = context;
        this.threads = threads;
        this.permissions = permissions;
        this.timeSource = timeSource;
        this.cache = new ArrayMap<>();
        this.extensionCache = new ArrayMap<>();
        this.extensionCharacteristicsCache = new ArrayMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createCameraExtensionMetadata-RzXb1QE, reason: not valid java name */
    public final Camera2CameraExtensionMetadata m1043createCameraExtensionMetadataRzXb1QE(String str, boolean z, int i2) {
        IllegalStateException illegalStateException;
        String strM552toStringimpl = CameraId.m552toStringimpl(str);
        long jMo1117nowvQl9yQU = this.timeSource.mo1117nowvQl9yQU();
        try {
            Trace.beginSection(strM552toStringimpl.concat("#readCameraExtensionMetadata"));
            try {
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Loading extension metadata for " + CameraId.m552toStringimpl(str));
                }
                Camera2CameraExtensionMetadata camera2CameraExtensionMetadata = new Camera2CameraExtensionMetadata(str, z, i2, m1045getCameraExtensionCharacteristicsEfqyGwQ(str), r.j(), null);
                if (Log.INSTANCE.getINFO_LOGGABLE()) {
                    long jMo1117nowvQl9yQU2 = this.timeSource.mo1117nowvQl9yQU();
                    h.o.c cVar = h.o.a.f48264a;
                    long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
                    String str2 = !z ? "" : " (redacted)";
                    String strM552toStringimpl2 = CameraId.m552toStringimpl(str);
                    String str3 = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(h.o.a.b(j2, h.o.d.f48272c))}, 1));
                    x.e(str3, "format(...)");
                    android.util.Log.i(Log.TAG, "Loaded extension metadata for " + strM552toStringimpl2 + " in " + str3 + str2);
                }
                return camera2CameraExtensionMetadata;
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createCameraMetadata-0r8Bogc, reason: not valid java name */
    public final Camera2CameraMetadata m1044createCameraMetadata0r8Bogc(String str, boolean z) {
        String strM552toStringimpl = CameraId.m552toStringimpl(str);
        long jMo1117nowvQl9yQU = this.timeSource.mo1117nowvQl9yQU();
        try {
            Trace.beginSection(strM552toStringimpl.concat("#readCameraMetadata"));
            try {
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Loading metadata for " + CameraId.m552toStringimpl(str));
                }
                Object systemService = this.cameraPipeContext.getSystemService("camera");
                x.d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                CameraCharacteristics cameraCharacteristics = ((CameraManager) systemService).getCameraCharacteristics(str);
                x.e(cameraCharacteristics, "getCameraCharacteristics(...)");
                if (cameraCharacteristics == null) {
                    throw new IllegalStateException(d.a(str, "Failed to get CameraCharacteristics for ", "!"));
                }
                Camera2CameraMetadata camera2CameraMetadata = new Camera2CameraMetadata(str, z, cameraCharacteristics, this, r.j(), shouldBlockSensorOrientationCache(cameraCharacteristics) ? e.c.d.a.o(CameraCharacteristics.SENSOR_ORIENTATION) : e.c.d.a.p(), null);
                if (Log.INSTANCE.getINFO_LOGGABLE()) {
                    long jMo1117nowvQl9yQU2 = this.timeSource.mo1117nowvQl9yQU();
                    h.o.c cVar = h.o.a.f48264a;
                    long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
                    String str2 = !z ? "" : " (redacted)";
                    String strM552toStringimpl2 = CameraId.m552toStringimpl(str);
                    String str3 = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(h.o.a.b(j2, h.o.d.f48272c))}, 1));
                    x.e(str3, "format(...)");
                    android.util.Log.i(Log.TAG, "Loaded metadata for " + strM552toStringimpl2 + " in " + str3 + str2);
                }
                return camera2CameraMetadata;
            } catch (Throwable th) {
                CameraError.Companion.shouldHandleDoNotDisturbException$camera_camera2_pipe(th);
                throw new IllegalStateException(d.a(str, "Failed to load metadata for ", "!"), th);
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCameraExtensionCharacteristics-EfqyGwQ, reason: not valid java name */
    public final CameraExtensionCharacteristics m1045getCameraExtensionCharacteristicsEfqyGwQ(String str) throws CameraAccessException {
        CameraExtensionCharacteristics cameraExtensionCharacteristicsM;
        synchronized (this.extensionCharacteristicsCache) {
            cameraExtensionCharacteristicsM = bi$$ExternalSyntheticApiModelOutline0.m((Object) this.extensionCharacteristicsCache.get(str));
        }
        if (cameraExtensionCharacteristicsM != null) {
            return cameraExtensionCharacteristicsM;
        }
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, "Retrieving CameraExtensionCharacteristics for ".concat(CameraId.m552toStringimpl(str)));
        }
        Object systemService = this.cameraPipeContext.getSystemService("camera");
        x.d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraExtensionCharacteristics cameraExtensionCharacteristics = Api31Compat.getCameraExtensionCharacteristics((CameraManager) systemService, str);
        if (cameraExtensionCharacteristics != null) {
            return cameraExtensionCharacteristics;
        }
        throw new IllegalStateException(d.a(str, "Failed to get CameraExtensionCharacteristics for ", "!"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMetadataRedacted() {
        return !this.permissions.getHasCameraPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldBlockSensorOrientationCache(CameraCharacteristics cameraCharacteristics) {
        return Build.VERSION.SDK_INT >= 32 && cameraCharacteristics.get(CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP) != null;
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2MetadataProvider
    /* renamed from: awaitCameraExtensionMetadata-0r8Bogc, reason: not valid java name */
    public CameraExtensionMetadata mo1046awaitCameraExtensionMetadata0r8Bogc(String str, int i2) throws Exception {
        Camera2CameraExtensionMetadata camera2CameraExtensionMetadataM1043createCameraExtensionMetadataRzXb1QE;
        x.f(str, "cameraId");
        if (Build.VERSION.SDK_INT < 31) {
            throw new Exception("Extension sessions are only supported on Android S or higher. Device SDK is " + Build.VERSION.SDK_INT);
        }
        try {
            Trace.beginSection(CameraId.m552toStringimpl(str).concat("#awaitExtensionMetadata"));
            synchronized (this.extensionCache) {
                camera2CameraExtensionMetadataM1043createCameraExtensionMetadataRzXb1QE = (CameraExtensionMetadata) this.extensionCache.get(str);
                if (camera2CameraExtensionMetadataM1043createCameraExtensionMetadataRzXb1QE == null) {
                    if (isMetadataRedacted()) {
                        camera2CameraExtensionMetadataM1043createCameraExtensionMetadataRzXb1QE = m1043createCameraExtensionMetadataRzXb1QE(str, true, i2);
                    } else {
                        Camera2CameraExtensionMetadata camera2CameraExtensionMetadataM1043createCameraExtensionMetadataRzXb1QE2 = m1043createCameraExtensionMetadataRzXb1QE(str, false, i2);
                        this.extensionCache.put(str, camera2CameraExtensionMetadataM1043createCameraExtensionMetadataRzXb1QE2);
                        camera2CameraExtensionMetadataM1043createCameraExtensionMetadataRzXb1QE = camera2CameraExtensionMetadataM1043createCameraExtensionMetadataRzXb1QE2;
                    }
                }
            }
            return camera2CameraExtensionMetadataM1043createCameraExtensionMetadataRzXb1QE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2MetadataProvider
    /* renamed from: awaitCameraMetadata-EfqyGwQ, reason: not valid java name */
    public CameraMetadata mo1047awaitCameraMetadataEfqyGwQ(String str) {
        Camera2CameraMetadata camera2CameraMetadataM1044createCameraMetadata0r8Bogc;
        x.f(str, "cameraId");
        try {
            Trace.beginSection(CameraId.m552toStringimpl(str).concat("#awaitMetadata"));
            synchronized (this.cache) {
                camera2CameraMetadataM1044createCameraMetadata0r8Bogc = (CameraMetadata) this.cache.get(str);
                if (camera2CameraMetadataM1044createCameraMetadata0r8Bogc == null) {
                    if (isMetadataRedacted()) {
                        camera2CameraMetadataM1044createCameraMetadata0r8Bogc = m1044createCameraMetadata0r8Bogc(str, true);
                    } else {
                        Camera2CameraMetadata camera2CameraMetadataM1044createCameraMetadata0r8Bogc2 = m1044createCameraMetadata0r8Bogc(str, false);
                        this.cache.put(str, camera2CameraMetadataM1044createCameraMetadata0r8Bogc2);
                        camera2CameraMetadataM1044createCameraMetadata0r8Bogc = camera2CameraMetadataM1044createCameraMetadata0r8Bogc2;
                    }
                }
            }
            return camera2CameraMetadataM1044createCameraMetadata0r8Bogc;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2MetadataProvider
    /* renamed from: getCameraExtensionMetadata-RzXb1QE, reason: not valid java name */
    public Object mo1048getCameraExtensionMetadataRzXb1QE(String str, int i2, h.c.e<? super CameraExtensionMetadata> eVar) {
        CameraExtensionMetadata cameraExtensionMetadata;
        synchronized (this.extensionCache) {
            cameraExtensionMetadata = this.extensionCache.get(str);
        }
        return cameraExtensionMetadata != null ? cameraExtensionMetadata : aj.v(this.threads.getBackgroundDispatcher(), new Camera2MetadataCache$getCameraExtensionMetadata$3(this, str, i2, null), eVar);
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2MetadataProvider
    /* renamed from: getCameraMetadata-0r8Bogc, reason: not valid java name */
    public Object mo1049getCameraMetadata0r8Bogc(String str, h.c.e<? super CameraMetadata> eVar) {
        CameraMetadata cameraMetadata;
        synchronized (this.cache) {
            cameraMetadata = this.cache.get(str);
        }
        return cameraMetadata != null ? cameraMetadata : aj.v(this.threads.getBackgroundDispatcher(), new Camera2MetadataCache$getCameraMetadata$3(this, str, null), eVar);
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2MetadataProvider
    /* renamed from: getSupportedCameraExtensions-EfqyGwQ, reason: not valid java name */
    public Set<Integer> mo1050getSupportedCameraExtensionsEfqyGwQ(String str) {
        x.f(str, "cameraId");
        return Build.VERSION.SDK_INT >= 31 ? i.au(Api31Compat.getSupportedExtensions(m1045getCameraExtensionCharacteristicsEfqyGwQ(str))) : e.c.d.a.p();
    }
}
