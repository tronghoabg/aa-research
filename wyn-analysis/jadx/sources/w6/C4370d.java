package w6;

import A7.C0237b0;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* renamed from: w6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4370d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f47310a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f47311b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f47312c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f47313d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    public final Display f47314e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4369c[] f47315f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f47316g;

    public C4370d(Display display, InterfaceC4369c... interfaceC4369cArr) {
        this.f47314e = display;
        this.f47315f = interfaceC4369cArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i5;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f47310a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f47314e.getRotation();
        float[] fArr3 = this.f47311b;
        if (rotation != 0) {
            int i10 = Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE;
            if (rotation != 1) {
                i5 = Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i10 = 130;
                    i5 = 1;
                }
            } else {
                i5 = 129;
                i10 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i10, i5, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, fArr3);
        float[] fArr4 = this.f47313d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f10 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        boolean z2 = this.f47316g;
        float[] fArr5 = this.f47312c;
        if (!z2) {
            C0237b0.m(fArr5, fArr2);
            this.f47316g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        InterfaceC4369c[] interfaceC4369cArr = this.f47315f;
        for (int i11 = 0; i11 < 2; i11++) {
            interfaceC4369cArr[i11].a(fArr2, f10);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i5) {
    }
}
