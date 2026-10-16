package androidx.camera.core;

import android.graphics.PointF;
import android.view.Display;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DisplayOrientedMeteringPointFactory extends MeteringPointFactory {
    private final CameraInfo mCameraInfo;
    private final Display mDisplay;
    private final float mHeight;
    private final float mWidth;

    public DisplayOrientedMeteringPointFactory(Display display, CameraInfo cameraInfo, float f2, float f3) {
        this.mWidth = f2;
        this.mHeight = f3;
        this.mDisplay = display;
        this.mCameraInfo = cameraInfo;
    }

    private int getRelativeCameraOrientation(boolean z) {
        try {
            int sensorRotationDegrees = this.mCameraInfo.getSensorRotationDegrees(this.mDisplay.getRotation());
            return z ? (360 - sensorRotationDegrees) % DisplayStrings.DS_ONE_DAY_AGO : sensorRotationDegrees;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // androidx.camera.core.MeteringPointFactory
    protected PointF convertPoint(float f2, float f3) {
        boolean z = this.mCameraInfo.getLensFacing() == 0;
        int relativeCameraOrientation = getRelativeCameraOrientation(z);
        float f4 = this.mWidth;
        float f5 = this.mHeight;
        if (relativeCameraOrientation != 90) {
            if (relativeCameraOrientation == 270) {
                relativeCameraOrientation = 270;
            } else {
                f4 = f5;
                f5 = f4;
                f3 = f2;
                f2 = f3;
            }
        }
        if (relativeCameraOrientation != 90) {
            if (relativeCameraOrientation == 180) {
                f2 = f4 - f2;
            } else if (relativeCameraOrientation == 270) {
            }
            f3 = f5 - f3;
        } else {
            f2 = f4 - f2;
        }
        if (z) {
            f3 = f5 - f3;
        }
        return new PointF(f3 / f5, f2 / f4);
    }
}
