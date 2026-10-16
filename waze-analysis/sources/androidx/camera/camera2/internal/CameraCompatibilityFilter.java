package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import h.a.c;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraCompatibilityFilter {
    public static final CameraCompatibilityFilter INSTANCE = new CameraCompatibilityFilter();

    private CameraCompatibilityFilter() {
    }

    public static final List<String> getBackwardCompatibleCameraIds(CameraDevices cameraDevices, List<String> list) {
        x.f(cameraDevices, "cameraDevices");
        x.f(list, "availableCameraIds");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (x.n(str, "0") || x.n(str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                arrayList.add(str);
            } else if (isBackwardCompatible(str, cameraDevices)) {
                arrayList.add(str);
            } else {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            }
        }
        return arrayList;
    }

    public static final boolean isBackwardCompatible(String str, CameraDevices cameraDevices) throws InitializationException {
        x.f(str, "cameraId");
        x.f(cameraDevices, "cameraDevices");
        if (x.n(Build.FINGERPRINT, "robolectric")) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (!Logger.isDebugEnabled(Log.TAG)) {
                return true;
            }
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "isBackwardCompatible method returns true because robolectric build detected.");
            return true;
        }
        try {
            CameraId.m547constructorimpl(str);
            CameraMetadata cameraMetadataMo434awaitCameraMetadataEfqyGwQ = cameraDevices.mo434awaitCameraMetadataEfqyGwQ(str);
            if (cameraMetadataMo434awaitCameraMetadataEfqyGwQ == null) {
                throw new IllegalStateException("Required value was null.");
            }
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            x.e(key, "REQUEST_AVAILABLE_CAPABILITIES");
            int[] iArr = (int[]) cameraMetadataMo434awaitCameraMetadataEfqyGwQ.get(key);
            if (iArr != null) {
                return c.ah(iArr, 0);
            }
            return false;
        } catch (CameraAccessException e2) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            CameraAccessException cameraAccessException = e2;
            if (Logger.isErrorEnabled(Log.TAG)) {
                android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "Error while accessing metadata for cameraID: ".concat(String.valueOf(str)), cameraAccessException);
            }
            throw new InitializationException(cameraAccessException);
        }
    }
}
