package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.core.util.Preconditions;
import com.waze.strings.DisplayStrings;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class IntrinsicZoomCalculatorImpl implements IntrinsicZoomCalculator {
    private final CameraDevices cameraDevices;

    public IntrinsicZoomCalculatorImpl(CameraDevices cameraDevices) {
        x.f(cameraDevices, "cameraDevices");
        this.cameraDevices = cameraDevices;
    }

    private final int focalLengthToViewAngleDegrees(float f2, float f3) {
        Preconditions.checkArgument(f2 > 0.0f, "Focal length should be positive.");
        Preconditions.checkArgument(f3 > 0.0f, "Sensor length should be positive.");
        double dAtan = Math.atan(f3 / (f2 + f2));
        int degrees = (int) Math.toDegrees(dAtan + dAtan);
        Preconditions.checkArgumentInRange(degrees, 0, DisplayStrings.DS_ONE_DAY_AGO, "The provided focal length and sensor length result in an invalid view angle degrees.");
        return degrees;
    }

    private final int getDefaultCameraDefaultViewAngleDegrees(CameraMetadata cameraMetadata) {
        try {
            List<CameraId> listAwaitCameraIds = this.cameraDevices.awaitCameraIds();
            Preconditions.checkNotNull(listAwaitCameraIds, "Failed to get available camera IDs");
            x.e(listAwaitCameraIds, "checkNotNull(...)");
            List<CameraId> list = listAwaitCameraIds;
            Iterator<T> it = listAwaitCameraIds.iterator();
            while (it.hasNext()) {
                String strM553unboximpl = ((CameraId) it.next()).m553unboximpl();
                CameraMetadata cameraMetadataMo434awaitCameraMetadataEfqyGwQ = this.cameraDevices.mo434awaitCameraMetadataEfqyGwQ(strM553unboximpl);
                Preconditions.checkNotNull(cameraMetadataMo434awaitCameraMetadataEfqyGwQ, "Failed to get CameraMetadata for " + CameraId.m552toStringimpl(strM553unboximpl));
                x.e(cameraMetadataMo434awaitCameraMetadataEfqyGwQ, "checkNotNull(...)");
                CameraMetadata cameraMetadata2 = cameraMetadataMo434awaitCameraMetadataEfqyGwQ;
                CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                x.e(key, "LENS_FACING");
                Object obj = cameraMetadataMo434awaitCameraMetadataEfqyGwQ.get((CameraCharacteristics.Key<Object>) key);
                Preconditions.checkNotNull(obj, "Failed to get CameraCharacteristics.LENS_FACING for " + CameraId.m552toStringimpl(strM553unboximpl));
                x.e(obj, "checkNotNull(...)");
                int iIntValue = ((Number) obj).intValue();
                CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_FACING;
                x.e(key2, "LENS_FACING");
                Object obj2 = cameraMetadata.get((CameraCharacteristics.Key<Object>) key2);
                Preconditions.checkNotNull(obj2, "Failed to get the required LENS_FACING for " + CameraId.m552toStringimpl(cameraMetadata.mo565getCameraDz_R5H8()));
                x.e(obj2, "checkNotNull(...)");
                if (iIntValue == ((Number) obj2).intValue()) {
                    return focalLengthToViewAngleDegrees(getDefaultFocalLength(cameraMetadataMo434awaitCameraMetadataEfqyGwQ), getSensorHorizontalLength(cameraMetadataMo434awaitCameraMetadataEfqyGwQ));
                }
            }
            throw new IllegalStateException("Could not find the default camera for " + CameraId.m552toStringimpl(cameraMetadata.mo565getCameraDz_R5H8()));
        } catch (Exception e2) {
            throw new IllegalStateException("Failed to get a valid view angle", e2);
        }
    }

    private final float getDefaultFocalLength(CameraMetadata cameraMetadata) {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS;
        x.e(key, "LENS_INFO_AVAILABLE_FOCAL_LENGTHS");
        Object obj = cameraMetadata.get((CameraCharacteristics.Key<Object>) key);
        Preconditions.checkNotNull(obj, "The focal lengths can not be empty.");
        x.e(obj, "checkNotNull(...)");
        float[] fArr = (float[]) obj;
        Preconditions.checkState(fArr.length != 0, "The focal lengths can not be empty.");
        return fArr[0];
    }

    private final int getDefaultViewAngleDegrees(CameraMetadata cameraMetadata) {
        try {
            return focalLengthToViewAngleDegrees(getDefaultFocalLength(cameraMetadata), getSensorHorizontalLength(cameraMetadata));
        } catch (Exception e2) {
            throw new IllegalStateException("Failed to get a valid view angle", e2);
        }
    }

    private final float getSensorHorizontalLength(CameraMetadata cameraMetadata) {
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE;
        x.e(key, "SENSOR_INFO_PHYSICAL_SIZE");
        Object obj = cameraMetadata.get((CameraCharacteristics.Key<Object>) key);
        Preconditions.checkNotNull(obj, "The sensor size can't be null.");
        x.e(obj, "checkNotNull(...)");
        SizeF sizeFReverseSizeF = (SizeF) obj;
        CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        x.e(key2, "SENSOR_INFO_ACTIVE_ARRAY_SIZE");
        Object obj2 = cameraMetadata.get((CameraCharacteristics.Key<Object>) key2);
        Preconditions.checkNotNull(obj2, "The sensor orientation can't be null.");
        x.e(obj2, "checkNotNull(...)");
        CameraCharacteristics.Key key3 = CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE;
        x.e(key3, "SENSOR_INFO_PIXEL_ARRAY_SIZE");
        Object obj3 = cameraMetadata.get((CameraCharacteristics.Key<Object>) key3);
        Preconditions.checkNotNull(obj3, "The active array size can't be null.");
        x.e(obj3, "checkNotNull(...)");
        Size sizeReverseSize = (Size) obj3;
        CameraCharacteristics.Key key4 = CameraCharacteristics.SENSOR_ORIENTATION;
        x.e(key4, "SENSOR_ORIENTATION");
        Object obj4 = cameraMetadata.get((CameraCharacteristics.Key<Object>) key4);
        Preconditions.checkNotNull(obj4, "The pixel array size can't be null.");
        x.e(obj4, "checkNotNull(...)");
        int iIntValue = ((Number) obj4).intValue();
        Size sizeRectToSize = TransformUtils.rectToSize((Rect) obj2);
        x.e(sizeRectToSize, "rectToSize(...)");
        if (TransformUtils.is90or270(iIntValue)) {
            sizeFReverseSizeF = TransformUtils.reverseSizeF(sizeFReverseSizeF);
            x.e(sizeFReverseSizeF, "reverseSizeF(...)");
            sizeRectToSize = TransformUtils.reverseSize(sizeRectToSize);
            x.e(sizeRectToSize, "reverseSize(...)");
            sizeReverseSize = TransformUtils.reverseSize(sizeReverseSize);
            x.e(sizeReverseSize, "reverseSize(...)");
        }
        return (sizeFReverseSizeF.getWidth() * sizeRectToSize.getWidth()) / sizeReverseSize.getWidth();
    }

    @Override // androidx.camera.camera2.internal.IntrinsicZoomCalculator
    public Float calculateIntrinsicZoomRatio(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "cameraMetadata");
        try {
            return Float.valueOf(getDefaultCameraDefaultViewAngleDegrees(cameraMetadata) / getDefaultViewAngleDegrees(cameraMetadata));
        } catch (Exception e2) {
            Exception exc = e2;
            if (!Log.INSTANCE.getERROR_LOGGABLE()) {
                return null;
            }
            android.util.Log.e(Log.TAG, "Failed to get the intrinsic zoom ratio", exc);
            return null;
        }
    }
}
