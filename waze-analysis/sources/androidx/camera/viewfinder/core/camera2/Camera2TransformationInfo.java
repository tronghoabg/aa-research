package androidx.camera.viewfinder.core.camera2;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.viewfinder.core.TransformationInfo;
import h.g.b.x;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2TransformationInfo {
    public static final Camera2TransformationInfo INSTANCE = new Camera2TransformationInfo();

    /* compiled from: WazeSource */
    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputConfigurationMirrorMode {
    }

    private Camera2TransformationInfo() {
    }

    public static final TransformationInfo createFromCharacteristics(CameraCharacteristics cameraCharacteristics, int i2) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        return createFromCharacteristics$default(cameraCharacteristics, i2, 0.0f, 0.0f, 0.0f, 0.0f, 60, null);
    }

    public static /* synthetic */ TransformationInfo createFromCharacteristics$default(CameraCharacteristics cameraCharacteristics, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 16) != 0) {
            f5 = Float.NaN;
        }
        return createFromCharacteristics(cameraCharacteristics, f2, f3, f4, f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.camera.viewfinder.core.TransformationInfo createFromCharacteristicsInternal(android.hardware.camera2.CameraCharacteristics r16, int r17, float r18, float r19, float r20, float r21) {
        /*
            r0 = r16
            r1 = r17
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r3 = "C2TransformationInfo"
            r4 = 0
            if (r2 == 0) goto L17
            int r2 = r2.intValue()
            r6 = r2
            goto L1d
        L17:
            java.lang.String r2 = "Unable to retrieve sensor rotation. Assuming rotation of 0"
            android.util.Log.e(r3, r2)
            r6 = r4
        L1d:
            r2 = 1
            if (r1 == 0) goto L2f
            r0 = 2
            if (r1 == r0) goto L2c
            r0 = 3
            if (r1 == r0) goto L29
        L26:
            r7 = r4
            r8 = r7
            goto L4e
        L29:
            r8 = r2
            r7 = r4
            goto L4e
        L2c:
            r7 = r2
            r8 = r4
            goto L4e
        L2f:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L48
            int r0 = r0.intValue()
            if (r0 != 0) goto L26
            r0 = 90
            if (r6 == r0) goto L29
            r0 = 270(0x10e, float:3.78E-43)
            if (r6 == r0) goto L29
            goto L2c
        L48:
            java.lang.String r0 = "Unable to retrieve lens facing. Assuming BACK camera."
            android.util.Log.e(r3, r0)
            goto L26
        L4e:
            androidx.camera.viewfinder.core.TransformationInfo r5 = new androidx.camera.viewfinder.core.TransformationInfo
            r14 = 128(0x80, float:1.8E-43)
            r15 = 0
            r13 = 0
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.viewfinder.core.camera2.Camera2TransformationInfo.createFromCharacteristicsInternal(android.hardware.camera2.CameraCharacteristics, int, float, float, float, float):androidx.camera.viewfinder.core.TransformationInfo");
    }

    static /* synthetic */ TransformationInfo createFromCharacteristicsInternal$default(CameraCharacteristics cameraCharacteristics, int i2, float f2, float f3, float f4, float f5, int i3, Object obj) {
        float f6;
        float f7;
        float f8;
        float f9;
        CameraCharacteristics cameraCharacteristics2;
        int i4;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            f2 = Float.NaN;
        }
        if ((i3 & 8) != 0) {
            f3 = Float.NaN;
        }
        if ((i3 & 16) != 0) {
            f4 = Float.NaN;
        }
        if ((i3 & 32) != 0) {
            f6 = Float.NaN;
            f9 = f3;
            f7 = f4;
            i4 = i2;
            f8 = f2;
            cameraCharacteristics2 = cameraCharacteristics;
        } else {
            f6 = f5;
            f7 = f4;
            f8 = f2;
            f9 = f3;
            cameraCharacteristics2 = cameraCharacteristics;
            i4 = i2;
        }
        return createFromCharacteristicsInternal(cameraCharacteristics2, i4, f8, f9, f7, f6);
    }

    public static final TransformationInfo createFromCharacteristics(CameraCharacteristics cameraCharacteristics, float f2) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        return createFromCharacteristics$default(cameraCharacteristics, f2, 0.0f, 0.0f, 0.0f, 28, null);
    }

    public static final TransformationInfo createFromCharacteristics(CameraCharacteristics cameraCharacteristics, float f2, float f3) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        return createFromCharacteristics$default(cameraCharacteristics, f2, f3, 0.0f, 0.0f, 24, null);
    }

    public static final TransformationInfo createFromCharacteristics(CameraCharacteristics cameraCharacteristics, float f2, float f3, float f4) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        return createFromCharacteristics$default(cameraCharacteristics, f2, f3, f4, 0.0f, 16, null);
    }

    public static final TransformationInfo createFromCharacteristics(CameraCharacteristics cameraCharacteristics) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        return createFromCharacteristics$default(cameraCharacteristics, 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
    }

    public static final TransformationInfo createFromCharacteristics(CameraCharacteristics cameraCharacteristics, int i2, float f2) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        return createFromCharacteristics$default(cameraCharacteristics, i2, f2, 0.0f, 0.0f, 0.0f, 56, null);
    }

    public static final TransformationInfo createFromCharacteristics(CameraCharacteristics cameraCharacteristics, int i2, float f2, float f3) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        return createFromCharacteristics$default(cameraCharacteristics, i2, f2, f3, 0.0f, 0.0f, 48, null);
    }

    public static final TransformationInfo createFromCharacteristics(CameraCharacteristics cameraCharacteristics, int i2, float f2, float f3, float f4) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        return createFromCharacteristics$default(cameraCharacteristics, i2, f2, f3, f4, 0.0f, 32, null);
    }

    public static final TransformationInfo createFromCharacteristics(CameraCharacteristics cameraCharacteristics, float f2, float f3, float f4, float f5) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        return createFromCharacteristicsInternal$default(cameraCharacteristics, 0, f2, f3, f4, f5, 2, null);
    }

    public static final TransformationInfo createFromCharacteristics(CameraCharacteristics cameraCharacteristics, int i2, float f2, float f3, float f4, float f5) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        return createFromCharacteristicsInternal(cameraCharacteristics, i2, f2, f3, f4, f5);
    }

    public static /* synthetic */ TransformationInfo createFromCharacteristics$default(CameraCharacteristics cameraCharacteristics, int i2, float f2, float f3, float f4, float f5, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f2 = Float.NaN;
        }
        if ((i3 & 8) != 0) {
            f3 = Float.NaN;
        }
        if ((i3 & 16) != 0) {
            f4 = Float.NaN;
        }
        if ((i3 & 32) != 0) {
            f5 = Float.NaN;
        }
        return createFromCharacteristics(cameraCharacteristics, i2, f2, f3, f4, f5);
    }
}
