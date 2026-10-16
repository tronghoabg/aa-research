package androidx.camera.camera2.compat.workaround;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.internal.ZoomMath;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraMetadataSafeGetterKt {
    public static final Rect getActiveArraySizeSafely(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "<this>");
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        x.e(key, "SENSOR_INFO_ACTIVE_ARRAY_SIZE");
        Rect rect = (Rect) cameraMetadata.get(key);
        if (rect != null) {
            return rect;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isWarnEnabled(Log.TAG)) {
            android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Failed to read SENSOR_INFO_ACTIVE_ARRAY_SIZE for " + CameraId.m552toStringimpl(cameraMetadata.mo565getCameraDz_R5H8()) + "!");
        }
        return new Rect(0, 0, 4000, 3000);
    }

    public static final Range<Float> getControlZoomRatioRangeSafely(CameraMetadata cameraMetadata) {
        Float fValueOf;
        Float fValueOf2;
        x.f(cameraMetadata, "<this>");
        try {
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            x.e(key, "CONTROL_ZOOM_RATIO_RANGE");
            Range range = (Range) cameraMetadata.get(key);
            if (range == null) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled(Log.TAG)) {
                    android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Failed to read CONTROL_ZOOM_RATIO_RANGE for " + CameraId.m552toStringimpl(cameraMetadata.mo565getCameraDz_R5H8()) + "!");
                }
                Float fValueOf3 = Float.valueOf(1.0f);
                return new Range<>(fValueOf3, fValueOf3);
            }
            ZoomMath zoomMath = ZoomMath.INSTANCE;
            Object lower = range.getLower();
            x.e(lower, "getLower(...)");
            if (zoomMath.nearZero$camera_camera2(((Number) lower).floatValue()) || ((Number) range.getLower()).floatValue() < 0.0f) {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled(Log.TAG)) {
                    android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Invalid lower zoom range detected: " + range.getLower());
                }
                fValueOf = Float.valueOf(1.0f);
            } else {
                fValueOf = (Float) range.getLower();
            }
            ZoomMath zoomMath2 = ZoomMath.INSTANCE;
            Object upper = range.getUpper();
            x.e(upper, "getUpper(...)");
            if (zoomMath2.nearZero$camera_camera2(((Number) upper).floatValue()) || ((Number) range.getUpper()).floatValue() < 0.0f) {
                Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled(Log.TAG)) {
                    android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Invalid upper zoom range detected: " + range.getUpper());
                }
                fValueOf2 = Float.valueOf(1.0f);
            } else {
                fValueOf2 = (Float) range.getUpper();
            }
            return new Range<>(fValueOf, fValueOf2);
        } catch (AssertionError e2) {
            if (DeviceQuirks.INSTANCE.get(ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
                Camera2Logger camera2Logger4 = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, a.a(new StringBuilder(), "Device is known to throw an exception while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE. CONTROL_ZOOM_RATIO_RANGE is not supported. [Manufacturer: ", "]."));
                }
            } else {
                Camera2Logger camera2Logger5 = Camera2Logger.INSTANCE;
                AssertionError assertionError = e2;
                if (Logger.isErrorEnabled(Log.TAG)) {
                    android.util.Log.e(Camera2Logger.TRUNCATED_TAG, a.a(new StringBuilder(), "Exception thrown while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE on devices not known to throw exceptions during this operation. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: ", "]. CONTROL_ZOOM_RATIO_RANGE is not available."), assertionError);
                }
            }
            AssertionError assertionError2 = e2;
            if (!Logger.isWarnEnabled(Log.TAG)) {
                return null;
            }
            android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "AssertionError: failed to get CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE", assertionError2);
            return null;
        }
    }

    public static final <T> T getSafely(CameraMetadata cameraMetadata, CameraCharacteristics.Key<T> key) {
        x.f(cameraMetadata, "<this>");
        x.f(key, "key");
        return (Build.VERSION.SDK_INT < 30 || !x.n(key, CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) ? x.n(key, CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE) ? (T) getActiveArraySizeSafely(cameraMetadata) : (T) cameraMetadata.get(key) : (T) getControlZoomRatioRangeSafely(cameraMetadata);
    }
}
