package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.graph.GraphListener;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompat;
import h.a.i;
import h.ab;
import h.c.e;
import h.g.b.x;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.am;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraBackend {
    List<CameraId> awaitCameraIds();

    /* renamed from: awaitCameraMetadata-EfqyGwQ, reason: not valid java name */
    CameraMetadata mo358awaitCameraMetadataEfqyGwQ(String str);

    Set<Set<CameraId>> awaitConcurrentCameraIds();

    CameraController createCameraController(CameraContext cameraContext, CameraGraphId cameraGraphId, CameraGraph.Config config, GraphListener graphListener, StreamGraph streamGraph, SurfaceTracker surfaceTracker);

    /* renamed from: disconnect-EfqyGwQ, reason: not valid java name */
    void mo359disconnectEfqyGwQ(String str);

    void disconnectAll();

    am<ab> disconnectAllAsync();

    /* renamed from: disconnectAsync-EfqyGwQ, reason: not valid java name */
    am<ab> mo360disconnectAsyncEfqyGwQ(String str);

    Object getCameraIds(e<? super List<CameraId>> eVar);

    k<List<CameraId>> getCameraIds();

    /* renamed from: getCameraMetadata-0r8Bogc, reason: not valid java name */
    Object mo361getCameraMetadata0r8Bogc(String str, e<? super CameraMetadata> eVar);

    Object getConcurrentCameraIds(e<? super Set<? extends Set<CameraId>>> eVar);

    /* renamed from: getId-QwmhuAM, reason: not valid java name */
    String mo362getIdQwmhuAM();

    /* renamed from: isConfigSupported-NpXggIU, reason: not valid java name */
    Object mo363isConfigSupportedNpXggIU(CameraGraph.Config config, e<? super ConfigQueryResult> eVar);

    /* renamed from: prewarm-EfqyGwQ, reason: not valid java name */
    void mo364prewarmEfqyGwQ(String str);

    /* renamed from: prewarmGraphConfigQuery-0r8Bogc, reason: not valid java name */
    Object mo365prewarmGraphConfigQuery0r8Bogc(String str, e<? super CameraDeviceSetupCompat> eVar);

    /* renamed from: prewarmIsConfigSupported-EfqyGwQ, reason: not valid java name */
    void mo366prewarmIsConfigSupportedEfqyGwQ(String str);

    am<ab> shutdownAsync();

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.CameraBackend$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static k $default$getCameraIds(CameraBackend cameraBackend) {
            List<CameraId> listAwaitCameraIds = cameraBackend.awaitCameraIds();
            if (listAwaitCameraIds == null) {
                listAwaitCameraIds = i.h();
            }
            return ai.G(listAwaitCameraIds);
        }

        /* renamed from: $default$prewarmGraphConfigQuery-0r8Bogc, reason: not valid java name */
        public static Object m369$default$prewarmGraphConfigQuery0r8Bogc(CameraBackend cameraBackend, String str, e eVar) {
            return null;
        }

        /* renamed from: access$prewarmGraphConfigQuery-0r8Bogc$jd, reason: not valid java name */
        public static /* synthetic */ Object m373access$prewarmGraphConfigQuery0r8Bogc$jd(CameraBackend cameraBackend, String str, e eVar) {
            return null;
        }

        public static /* synthetic */ Object getCameraIds$suspendImpl(CameraBackend cameraBackend, e<? super List<CameraId>> eVar) {
            return cameraBackend.awaitCameraIds();
        }

        /* renamed from: getCameraMetadata-0r8Bogc$suspendImpl, reason: not valid java name */
        public static /* synthetic */ Object m375getCameraMetadata0r8Bogc$suspendImpl(CameraBackend cameraBackend, String str, e<? super CameraMetadata> eVar) {
            return cameraBackend.mo358awaitCameraMetadataEfqyGwQ(str);
        }

        public static /* synthetic */ Object getConcurrentCameraIds$suspendImpl(CameraBackend cameraBackend, e<? super Set<? extends Set<CameraId>>> eVar) {
            return cameraBackend.awaitConcurrentCameraIds();
        }

        /* renamed from: isConfigSupported-NpXggIU$suspendImpl, reason: not valid java name */
        public static /* synthetic */ Object m376isConfigSupportedNpXggIU$suspendImpl(CameraBackend cameraBackend, CameraGraph.Config config, e<? super ConfigQueryResult> eVar) {
            return ConfigQueryResult.m596boximpl(ConfigQueryResult.Companion.m604getUNKNOWNXp6DSB4());
        }

        /* renamed from: prewarmGraphConfigQuery-0r8Bogc$suspendImpl, reason: not valid java name */
        public static /* synthetic */ Object m377prewarmGraphConfigQuery0r8Bogc$suspendImpl(CameraBackend cameraBackend, String str, e<? super CameraDeviceSetupCompat> eVar) {
            return null;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static k<List<CameraId>> getCameraIds(CameraBackend cameraBackend) {
            return CC.$default$getCameraIds(cameraBackend);
        }

        @Deprecated
        /* renamed from: getCameraMetadata-0r8Bogc, reason: not valid java name */
        public static Object m378getCameraMetadata0r8Bogc(CameraBackend cameraBackend, String str, e<? super CameraMetadata> eVar) {
            return CC.m375getCameraMetadata0r8Bogc$suspendImpl(cameraBackend, str, eVar);
        }

        @Deprecated
        public static Object getConcurrentCameraIds(CameraBackend cameraBackend, e<? super Set<? extends Set<CameraId>>> eVar) {
            return CC.getConcurrentCameraIds$suspendImpl(cameraBackend, eVar);
        }

        @Deprecated
        /* renamed from: isConfigSupported-NpXggIU, reason: not valid java name */
        public static Object m379isConfigSupportedNpXggIU(CameraBackend cameraBackend, CameraGraph.Config config, e<? super ConfigQueryResult> eVar) {
            return CC.m376isConfigSupportedNpXggIU$suspendImpl(cameraBackend, config, eVar);
        }

        @Deprecated
        /* renamed from: prewarmGraphConfigQuery-0r8Bogc, reason: not valid java name */
        public static Object m380prewarmGraphConfigQuery0r8Bogc(CameraBackend cameraBackend, String str, e<? super CameraDeviceSetupCompat> eVar) {
            return null;
        }

        @Deprecated
        /* renamed from: prewarmIsConfigSupported-EfqyGwQ, reason: not valid java name */
        public static void m381prewarmIsConfigSupportedEfqyGwQ(CameraBackend cameraBackend, String str) {
            x.f(str, "cameraId");
            x.f(str, "cameraId");
        }

        @Deprecated
        public static Object getCameraIds(CameraBackend cameraBackend, e<? super List<CameraId>> eVar) {
            return CC.getCameraIds$suspendImpl(cameraBackend, eVar);
        }
    }
}
