package androidx.camera.camera2.pipe;

import h.ab;
import h.c.e;
import h.g.b.x;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.am;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraDevices {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.CameraDevices$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static List $default$awaitCameraIds(CameraDevices cameraDevices) {
            return cameraDevices.mo433awaitCameraIdsSeavPBo(null);
        }

        /* renamed from: $default$awaitCameraMetadata-EfqyGwQ, reason: not valid java name */
        public static CameraMetadata m451$default$awaitCameraMetadataEfqyGwQ(CameraDevices cameraDevices, String str) {
            x.f(str, "cameraId");
            return cameraDevices.mo435awaitCameraMetadataFpsL5FU(str, null);
        }

        public static Set $default$awaitConcurrentCameraIds(CameraDevices cameraDevices) {
            return cameraDevices.mo436awaitConcurrentCameraIdsSeavPBo(null);
        }

        public static k $default$cameraIdsFlow(CameraDevices cameraDevices) {
            return cameraDevices.mo438cameraIdsFlowSeavPBo(null);
        }

        /* renamed from: $default$disconnect-EfqyGwQ, reason: not valid java name */
        public static void m452$default$disconnectEfqyGwQ(CameraDevices cameraDevices, String str) {
            x.f(str, "cameraId");
            cameraDevices.mo440disconnectFpsL5FU(str, null);
        }

        public static am $default$disconnectAllAsync(CameraDevices cameraDevices) {
            return cameraDevices.mo442disconnectAllAsyncSeavPBo(null);
        }

        /* renamed from: $default$disconnectAsync-EfqyGwQ, reason: not valid java name */
        public static am m453$default$disconnectAsyncEfqyGwQ(CameraDevices cameraDevices, String str) {
            x.f(str, "cameraId");
            return cameraDevices.mo444disconnectAsyncFpsL5FU(str, null);
        }

        /* renamed from: $default$prewarm-EfqyGwQ, reason: not valid java name */
        public static void m454$default$prewarmEfqyGwQ(CameraDevices cameraDevices, String str) {
            x.f(str, "cameraId");
            cameraDevices.mo450prewarmFpsL5FU(str, null);
        }

        /* renamed from: getCameraIds-iAq86To$default, reason: not valid java name */
        public static /* synthetic */ Object m459getCameraIdsiAq86To$default(CameraDevices cameraDevices, String str, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCameraIds-iAq86To");
            }
            if (1 == (i2 & 1)) {
                str = null;
            }
            return cameraDevices.mo445getCameraIdsiAq86To(str, eVar);
        }

        /* renamed from: getCameraMetadata-_mltaTw$default, reason: not valid java name */
        public static /* synthetic */ Object m460getCameraMetadata_mltaTw$default(CameraDevices cameraDevices, String str, String str2, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCameraMetadata-_mltaTw");
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            return cameraDevices.mo446getCameraMetadata_mltaTw(str, str2, eVar);
        }

        /* renamed from: getConcurrentCameraIds-iAq86To$default, reason: not valid java name */
        public static /* synthetic */ Object m461getConcurrentCameraIdsiAq86To$default(CameraDevices cameraDevices, String str, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConcurrentCameraIds-iAq86To");
            }
            if (1 == (i2 & 1)) {
                str = null;
            }
            return cameraDevices.mo447getConcurrentCameraIdsiAq86To(str, eVar);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static List<CameraId> awaitCameraIds(CameraDevices cameraDevices) {
            return CC.$default$awaitCameraIds(cameraDevices);
        }

        @Deprecated
        /* renamed from: awaitCameraMetadata-EfqyGwQ, reason: not valid java name */
        public static CameraMetadata m462awaitCameraMetadataEfqyGwQ(CameraDevices cameraDevices, String str) {
            x.f(str, "cameraId");
            return CC.m451$default$awaitCameraMetadataEfqyGwQ(cameraDevices, str);
        }

        @Deprecated
        public static Set<Set<CameraId>> awaitConcurrentCameraIds(CameraDevices cameraDevices) {
            return CC.$default$awaitConcurrentCameraIds(cameraDevices);
        }

        @Deprecated
        public static k<List<CameraId>> cameraIdsFlow(CameraDevices cameraDevices) {
            return CC.$default$cameraIdsFlow(cameraDevices);
        }

        @Deprecated
        /* renamed from: disconnect-EfqyGwQ, reason: not valid java name */
        public static void m463disconnectEfqyGwQ(CameraDevices cameraDevices, String str) {
            x.f(str, "cameraId");
            CC.m452$default$disconnectEfqyGwQ(cameraDevices, str);
        }

        @Deprecated
        public static void disconnectAll(CameraDevices cameraDevices) {
            cameraDevices.mo441disconnectAllSeavPBo(null);
        }

        @Deprecated
        public static am<ab> disconnectAllAsync(CameraDevices cameraDevices) {
            return CC.$default$disconnectAllAsync(cameraDevices);
        }

        @Deprecated
        /* renamed from: disconnectAsync-EfqyGwQ, reason: not valid java name */
        public static am<ab> m464disconnectAsyncEfqyGwQ(CameraDevices cameraDevices, String str) {
            x.f(str, "cameraId");
            return CC.m453$default$disconnectAsyncEfqyGwQ(cameraDevices, str);
        }

        @Deprecated
        /* renamed from: prewarm-EfqyGwQ, reason: not valid java name */
        public static void m468prewarmEfqyGwQ(CameraDevices cameraDevices, String str) {
            x.f(str, "cameraId");
            CC.m454$default$prewarmEfqyGwQ(cameraDevices, str);
        }
    }

    List<CameraId> awaitCameraIds();

    /* renamed from: awaitCameraIds-SeavPBo, reason: not valid java name */
    List<CameraId> mo433awaitCameraIdsSeavPBo(String str);

    /* renamed from: awaitCameraMetadata-EfqyGwQ, reason: not valid java name */
    CameraMetadata mo434awaitCameraMetadataEfqyGwQ(String str);

    /* renamed from: awaitCameraMetadata-FpsL5FU, reason: not valid java name */
    CameraMetadata mo435awaitCameraMetadataFpsL5FU(String str, String str2);

    Set<Set<CameraId>> awaitConcurrentCameraIds();

    /* renamed from: awaitConcurrentCameraIds-SeavPBo, reason: not valid java name */
    Set<Set<CameraId>> mo436awaitConcurrentCameraIdsSeavPBo(String str);

    /* renamed from: awaitMetadata-EfqyGwQ, reason: not valid java name */
    CameraMetadata mo437awaitMetadataEfqyGwQ(String str);

    k<List<CameraId>> cameraIdsFlow();

    /* renamed from: cameraIdsFlow-SeavPBo, reason: not valid java name */
    k<List<CameraId>> mo438cameraIdsFlowSeavPBo(String str);

    /* renamed from: disconnect-EfqyGwQ, reason: not valid java name */
    void mo439disconnectEfqyGwQ(String str);

    /* renamed from: disconnect-FpsL5FU, reason: not valid java name */
    void mo440disconnectFpsL5FU(String str, String str2);

    void disconnectAll();

    /* renamed from: disconnectAll-SeavPBo, reason: not valid java name */
    void mo441disconnectAllSeavPBo(String str);

    am<ab> disconnectAllAsync();

    /* renamed from: disconnectAllAsync-SeavPBo, reason: not valid java name */
    am<ab> mo442disconnectAllAsyncSeavPBo(String str);

    /* renamed from: disconnectAsync-EfqyGwQ, reason: not valid java name */
    am<ab> mo443disconnectAsyncEfqyGwQ(String str);

    /* renamed from: disconnectAsync-FpsL5FU, reason: not valid java name */
    am<ab> mo444disconnectAsyncFpsL5FU(String str, String str2);

    List<CameraId> findAll();

    /* renamed from: getCameraIds-iAq86To, reason: not valid java name */
    Object mo445getCameraIdsiAq86To(String str, e<? super List<CameraId>> eVar);

    /* renamed from: getCameraMetadata-_mltaTw, reason: not valid java name */
    Object mo446getCameraMetadata_mltaTw(String str, String str2, e<? super CameraMetadata> eVar);

    /* renamed from: getConcurrentCameraIds-iAq86To, reason: not valid java name */
    Object mo447getConcurrentCameraIdsiAq86To(String str, e<? super Set<? extends Set<CameraId>>> eVar);

    /* renamed from: getMetadata-0r8Bogc, reason: not valid java name */
    Object mo448getMetadata0r8Bogc(String str, e<? super CameraMetadata> eVar);

    Object ids(e<? super List<CameraId>> eVar);

    /* renamed from: prewarm-EfqyGwQ, reason: not valid java name */
    void mo449prewarmEfqyGwQ(String str);

    /* renamed from: prewarm-FpsL5FU, reason: not valid java name */
    void mo450prewarmFpsL5FU(String str, String str2);
}
