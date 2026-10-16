package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.config.CameraAppComponent;
import androidx.camera.camera2.config.CameraComponent;
import androidx.camera.camera2.config.CameraConfig;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.internal.StreamSpecsCalculator;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraSelectionOptimizer {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final String decideSkippedCameraIdByHeuristic(CameraDevices cameraDevices, Integer num) {
            if (num == null) {
                return null;
            }
            try {
                if (num.intValue() == 1) {
                    CameraId.m547constructorimpl("0");
                    CameraMetadata cameraMetadataMo434awaitCameraMetadataEfqyGwQ = cameraDevices.mo434awaitCameraMetadataEfqyGwQ("0");
                    if (cameraMetadataMo434awaitCameraMetadataEfqyGwQ == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                    x.e(key, "LENS_FACING");
                    Integer num2 = (Integer) cameraMetadataMo434awaitCameraMetadataEfqyGwQ.get(key);
                    if (num2 != null && num2.intValue() == 1) {
                        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    }
                    return null;
                }
                if (num.intValue() != 0) {
                    return null;
                }
                CameraId.m547constructorimpl(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                CameraMetadata cameraMetadataMo434awaitCameraMetadataEfqyGwQ2 = cameraDevices.mo434awaitCameraMetadataEfqyGwQ(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                if (cameraMetadataMo434awaitCameraMetadataEfqyGwQ2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_FACING;
                x.e(key2, "LENS_FACING");
                Integer num3 = (Integer) cameraMetadataMo434awaitCameraMetadataEfqyGwQ2.get(key2);
                if (num3 != null && num3.intValue() == 0) {
                    return "0";
                }
                return null;
            } catch (DoNotDisturbException unused) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (!Logger.isErrorEnabled(Log.TAG)) {
                    return null;
                }
                android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "Received Do Not Disturb exception while deciding camera id to skip. Please turn off Do Not Disturb mode");
                return null;
            }
        }

        public final List<String> getSelectedAvailableCameraIds(CameraAppComponent cameraAppComponent, CameraSelector cameraSelector, List<String> list, StreamSpecsCalculator streamSpecsCalculator) {
            String strDecideSkippedCameraIdByHeuristic;
            x.f(cameraAppComponent, "cameraAppComponent");
            x.f(list, "cameraIdList");
            x.f(streamSpecsCalculator, "streamSpecsCalculator");
            try {
                ArrayList arrayList = new ArrayList();
                CameraDevices cameraDevices = cameraAppComponent.getCameraDevices();
                if (cameraSelector == null) {
                    return list;
                }
                try {
                    strDecideSkippedCameraIdByHeuristic = decideSkippedCameraIdByHeuristic(cameraDevices, cameraSelector.getLensFacing());
                } catch (IllegalStateException e2) {
                    Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                    IllegalStateException illegalStateException = e2;
                    if (Logger.isDebugEnabled(Log.TAG)) {
                        android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Unable to get Metadata for cameraID 0 and/or 1", illegalStateException);
                    }
                    strDecideSkippedCameraIdByHeuristic = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : list) {
                    if (!x.n(str, strDecideSkippedCameraIdByHeuristic)) {
                        CameraComponent.Builder builderCameraBuilder = cameraAppComponent.cameraBuilder();
                        CameraId.m547constructorimpl(str);
                        CameraInfoInternal cameraInfoInternal = builderCameraBuilder.config(new CameraConfig(str, null)).streamSpecsCalculator(streamSpecsCalculator).build().getCameraInternal().getCameraInfoInternal();
                        x.e(cameraInfoInternal, "getCameraInfoInternal(...)");
                        arrayList2.add(cameraInfoInternal);
                    }
                }
                List<CameraInfo> listFilter = cameraSelector.filter(arrayList2);
                x.e(listFilter, "filter(...)");
                for (CameraInfo cameraInfo : listFilter) {
                    x.d(cameraInfo, "null cannot be cast to non-null type androidx.camera.core.impl.CameraInfoInternal");
                    String cameraId = ((CameraInfoInternal) cameraInfo).getCameraId();
                    x.e(cameraId, "getCameraId(...)");
                    arrayList.add(cameraId);
                }
                return arrayList;
            } catch (IllegalStateException e3) {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                IllegalStateException illegalStateException2 = e3;
                if (Logger.isErrorEnabled(Log.TAG)) {
                    android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "Error while accessing info about cameras.", illegalStateException2);
                }
                throw new InitializationException(illegalStateException2);
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final List<String> getSelectedAvailableCameraIds(CameraFactory cameraFactory, CameraSelector cameraSelector, StreamSpecsCalculator streamSpecsCalculator) {
            x.f(cameraFactory, "cameraFactory");
            x.f(streamSpecsCalculator, "streamSpecsCalculator");
            Object cameraManager = cameraFactory.getCameraManager();
            x.d(cameraManager, "null cannot be cast to non-null type androidx.camera.camera2.config.CameraAppComponent");
            CameraAppComponent cameraAppComponent = (CameraAppComponent) cameraManager;
            List<CameraId> listAwaitCameraIds = cameraAppComponent.getCameraDevices().awaitCameraIds();
            if (listAwaitCameraIds != null) {
                List<CameraId> list = listAwaitCameraIds;
                ArrayList arrayList = new ArrayList(i.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CameraId) it.next()).m553unboximpl());
                }
                return getSelectedAvailableCameraIds(cameraAppComponent, cameraSelector, arrayList, streamSpecsCalculator);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
