package Kc;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import t6.q;
import yc.AbstractC4575E;
import zc.AbstractC4660a;

/* loaded from: classes5.dex */
public final class a extends AbstractC4660a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6726b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f6727c;

    /* renamed from: d, reason: collision with root package name */
    public Float f6728d;

    /* renamed from: e, reason: collision with root package name */
    public final Float f6729e;

    /* renamed from: f, reason: collision with root package name */
    public final Float f6730f;

    public a(q qVar) {
        super(qVar);
        Float fValueOf = Float.valueOf(1.0f);
        this.f6728d = fValueOf;
        this.f6729e = fValueOf;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) qVar.f45906a;
        Rect rect = (Rect) cameraCharacteristics.get(key);
        this.f6727c = rect;
        if (rect == null) {
            this.f6730f = fValueOf;
            this.f6726b = false;
            return;
        }
        if (AbstractC4575E.f48077a >= 30) {
            Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            this.f6729e = range != null ? (Float) range.getLower() : null;
            Range range2 = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            this.f6730f = range2 != null ? (Float) range2.getUpper() : null;
        } else {
            this.f6729e = fValueOf;
            Float f10 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f10 != null && f10.floatValue() >= 1.0f) {
                fValueOf = f10;
            }
            this.f6730f = fValueOf;
        }
        this.f6726b = Float.compare(this.f6730f.floatValue(), this.f6729e.floatValue()) > 0;
    }

    @Override // zc.AbstractC4660a
    public final void a(CaptureRequest.Builder builder) {
        if (this.f6726b) {
            boolean z2 = AbstractC4575E.f48077a >= 30;
            Float f10 = this.f6729e;
            Float f11 = this.f6730f;
            if (z2) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
                float fFloatValue = this.f6728d.floatValue();
                float fFloatValue2 = f10.floatValue();
                float fFloatValue3 = f11.floatValue();
                if (fFloatValue < fFloatValue2) {
                    fFloatValue = fFloatValue2;
                } else if (fFloatValue > fFloatValue3) {
                    fFloatValue = fFloatValue3;
                }
                builder.set(key, Float.valueOf(fFloatValue));
                return;
            }
            float fFloatValue4 = this.f6728d.floatValue();
            float fFloatValue5 = f10.floatValue();
            float fFloatValue6 = f11.floatValue();
            if (fFloatValue4 < fFloatValue5) {
                fFloatValue4 = fFloatValue5;
            } else if (fFloatValue4 > fFloatValue6) {
                fFloatValue4 = fFloatValue6;
            }
            Rect rect = this.f6727c;
            int iWidth = rect.width() / 2;
            int iHeight = rect.height() / 2;
            int iWidth2 = (int) ((rect.width() * 0.5f) / fFloatValue4);
            int iHeight2 = (int) ((rect.height() * 0.5f) / fFloatValue4);
            builder.set(CaptureRequest.SCALER_CROP_REGION, new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2));
        }
    }
}
