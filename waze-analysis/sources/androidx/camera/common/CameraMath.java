package androidx.camera.common;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import com.waze.strings.DisplayStrings;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.x;
import h.h.a;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraMath {
    public static final int DEFAULT_MIN_SENSOR_PIXELS = 32;
    public static final float DEFAULT_POINT_TO_RECT_RATIO = 0.18375f;
    public static final CameraMath INSTANCE = new CameraMath();

    private CameraMath() {
    }

    public static final int computeSensorRotationToDisplayOrientation(int i2, int i3, boolean z) {
        if (z) {
            DiscreteRotation.Companion.m1299fromREjCm4(i3);
            DiscreteRotation.Companion.m1299fromREjCm4(i2);
            return (i3 + i2) % DisplayStrings.DS_ONE_DAY_AGO;
        }
        DiscreteRotation.Companion.m1299fromREjCm4(i3);
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        return ((i3 - i2) + DisplayStrings.DS_ONE_DAY_AGO) % DisplayStrings.DS_ONE_DAY_AGO;
    }

    public static final int computeSensorRotationToJpegOrientation(int i2, int i3, boolean z) {
        if (z) {
            DiscreteRotation.Companion.m1299fromREjCm4(i3);
            DiscreteRotation.Companion.m1299fromREjCm4(i2);
            return ((i3 - i2) + DisplayStrings.DS_ONE_DAY_AGO) % DisplayStrings.DS_ONE_DAY_AGO;
        }
        DiscreteRotation.Companion.m1299fromREjCm4(i3);
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        return (i3 + i2) % DisplayStrings.DS_ONE_DAY_AGO;
    }

    public static final PointF mapSensorPointToStreamPointF(Point point, Size size, Rect rect) {
        x.f(point, "sensorPoint");
        x.f(size, "streamSize");
        x.f(rect, "sensorCrop");
        int i2 = point.x;
        int i3 = point.y;
        int width = size.getWidth();
        int height = size.getHeight();
        int i4 = rect.left;
        int i5 = rect.top;
        float fMin = Math.min(rect.width() / width, rect.height() / height);
        return new PointF((i2 - (i4 + ((int) ((r4 - (r1 * fMin)) / 2.0f)))) / fMin, (i3 - (i5 + ((int) ((r9 - (r8 * fMin)) / 2.0f)))) / fMin);
    }

    public static final PointF mapSensorPointToUiPointF(Point point, Size size, Size size2, boolean z, int i2, Rect rect) {
        float f2;
        x.f(point, "sensorPoint");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        x.f(rect, "sensorCrop");
        int i3 = point.x;
        int i4 = point.y;
        int width = size.getWidth();
        int height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        int i5 = rect.left;
        int i6 = rect.top;
        float f3 = width2;
        float f4 = height2;
        float fMin = Math.min(rect.width() / f3, rect.height() / f4);
        float f5 = ((i4 - (i6 + ((int) ((r15 - (f4 * fMin)) / 2.0f)))) / fMin) / f4;
        float f6 = ((i3 - (i5 + ((int) ((r5 - (f3 * fMin)) / 2.0f)))) / fMin) / f3;
        if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f2 = f5;
            f5 = f6;
        } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            f5 = 1.0f - f5;
            f2 = f6;
        } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f2 = 1.0f - f5;
            f5 = 1.0f - f6;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i2)));
            }
            f2 = 1.0f - f6;
        }
        float f7 = width;
        return new PointF(!z ? f5 * f7 : (1.0f - f5) * f7, f2 * height);
    }

    public static final RectF mapSensorRectToStreamRectF(Rect rect, Size size, Rect rect2) {
        x.f(rect, "sensorRect");
        x.f(size, "streamSize");
        x.f(rect2, "sensorCrop");
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        int width = size.getWidth();
        int height = size.getHeight();
        int i6 = rect2.left;
        int i7 = rect2.top;
        float fWidth = rect2.width();
        float f2 = width;
        float fHeight = rect2.height();
        float f3 = height;
        float fMin = Math.min(fWidth / f2, fHeight / f3);
        int i8 = i7 + ((int) ((fHeight - (f3 * fMin)) / 2.0f));
        float f4 = i6 + ((int) ((fWidth - (f2 * fMin)) / 2.0f));
        float f5 = (i2 - f4) / fMin;
        float f6 = i3;
        float f7 = i8;
        return new RectF(f5, (f6 - f7) / fMin, (i4 - f4) / fMin, (i5 - f7) / fMin);
    }

    public static final RectF mapSensorRectToUiRectF(Rect rect, Size size, Size size2, boolean z, int i2, Rect rect2) {
        float f2;
        float f3;
        float f4;
        x.f(rect, "sensorRect");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        x.f(rect2, "sensorCrop");
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        int width = size.getWidth();
        int height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        int i7 = rect2.left;
        int i8 = rect2.top;
        float fWidth = rect2.width();
        float f5 = width2;
        float fHeight = rect2.height();
        float f6 = height2;
        float fMin = Math.min(fWidth / f5, fHeight / f6);
        int i9 = i8 + ((int) ((fHeight - (f6 * fMin)) / 2.0f));
        float f7 = i3;
        float f8 = i7 + ((int) ((fWidth - (f5 * fMin)) / 2.0f));
        float f9 = i9;
        float f10 = ((i6 - f9) / fMin) / f6;
        float f11 = ((i4 - f9) / fMin) / f6;
        float f12 = ((i5 - f8) / fMin) / f5;
        float f13 = ((f7 - f8) / fMin) / f5;
        if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f11 = f13;
            f13 = f11;
            f2 = f10;
            f10 = f12;
        } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            float f14 = 1.0f - f11;
            f11 = 1.0f - f10;
            f10 = f14;
            f2 = f12;
        } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            float f15 = 1.0f - f13;
            float f16 = 1.0f - f11;
            f11 = 1.0f - f12;
            f13 = 1.0f - f10;
            f10 = f15;
            f2 = f16;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i2)));
            }
            f2 = 1.0f - f13;
            f13 = 1.0f - f12;
        }
        float f17 = width;
        if (z) {
            float f18 = (1.0f - f11) * f17;
            f3 = (1.0f - f10) * f17;
            f4 = f18;
        } else {
            f3 = f11 * f17;
            f4 = f10 * f17;
        }
        float f19 = height;
        return new RectF(f3, f13 * f19, f4, f2 * f19);
    }

    public static final SizeF mapSensorSizeToStreamSizeF(Size size, Size size2, int i2, int i3) {
        x.f(size, "size");
        x.f(size2, "streamSize");
        int width = size.getWidth();
        int height = size.getHeight();
        float fMin = Math.min(i2 / size2.getWidth(), i3 / size2.getHeight());
        return new SizeF(width / fMin, height / fMin);
    }

    public static final SizeF mapSensorSizeToUiSizeF(Size size, Size size2, Size size3, int i2, int i3, int i4) {
        x.f(size, "size");
        x.f(size2, "uiSize");
        x.f(size3, "streamSize");
        int width = size.getWidth();
        int height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        int width3 = size3.getWidth();
        int height3 = size3.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        float f2 = width3;
        float f3 = height3;
        float fMin = Math.min(i3 / f2, i4 / f3);
        float f4 = (width / fMin) / f2;
        float f5 = (height / fMin) / f3;
        if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY()) && !DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f4 = f5;
            f5 = f4;
        }
        return new SizeF(f4 * width2, f5 * height2);
    }

    public static final Point mapStreamPointToSensorPoint(PointF pointF, Size size, Rect rect, boolean z) {
        x.f(pointF, "streamPoint");
        x.f(size, "streamSize");
        x.f(rect, "sensorCrop");
        float f2 = pointF.x;
        float f3 = pointF.y;
        int width = size.getWidth();
        int height = size.getHeight();
        int i2 = rect.left;
        int i3 = rect.top;
        int iWidth = rect.width();
        float f4 = iWidth;
        float f5 = width;
        int iHeight = rect.height();
        float f6 = iHeight;
        float f7 = height;
        float fMin = Math.min(f4 / f5, f6 / f7);
        int iB = a.b(f2 * fMin) + ((int) ((f4 - (f5 * fMin)) / 2.0f)) + i2;
        int iB2 = a.b(f3 * fMin) + ((int) ((f6 - (f7 * fMin)) / 2.0f)) + i3;
        if (z) {
            iB = n.j(iB, i2, iWidth + i2);
            iB2 = n.j(iB2, i3, iHeight + i3);
        }
        return new Point(iB, iB2);
    }

    public static /* synthetic */ Object mapStreamPointToSensorPoint$default(CameraMath cameraMath, float f2, float f3, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, p pVar, int i8, Object obj) {
        x.f(pVar, "toSensorPoint");
        float f4 = i7;
        float f5 = i3;
        float f6 = i6;
        float f7 = i2;
        float fMin = Math.min(f6 / f7, f4 / f5);
        int iB = a.b(f2 * fMin) + ((int) ((f6 - (f7 * fMin)) / 2.0f)) + i4;
        int iB2 = a.b(f3 * fMin) + ((int) ((f4 - (f5 * fMin)) / 2.0f)) + i5;
        if ((!((i8 & 256) == 0)) | z) {
            iB = n.j(iB, i4, i6 + i4);
            iB2 = n.j(iB2, i5, i7 + i5);
        }
        return pVar.invoke(Integer.valueOf(iB), Integer.valueOf(iB2));
    }

    public static final Rect mapStreamPointToSensorRect(PointF pointF, Size size, Rect rect, int i2, boolean z, float f2) {
        int i3;
        x.f(pointF, "streamPoint");
        x.f(size, "streamSize");
        x.f(rect, "sensorCrop");
        float f3 = pointF.x;
        float f4 = pointF.y;
        float width = size.getWidth();
        float height = size.getHeight();
        int i4 = rect.left;
        int i5 = rect.top;
        int iWidth = rect.width();
        int iHeight = rect.height();
        float fMin = Math.min(width, height) * f2;
        float f5 = fMin / 2.0f;
        float f6 = f3 - f5;
        float f7 = fMin - f5;
        float f8 = f3 + f7;
        float f9 = f4 - f5;
        float f10 = f4 + f7;
        float f11 = iWidth;
        float f12 = iHeight;
        float fMin2 = Math.min(f11 / width, f12 / height);
        int i6 = ((int) ((f11 - (width * fMin2)) / 2.0f)) + i4;
        int i7 = ((int) ((f12 - (height * fMin2)) / 2.0f)) + i5;
        int iB = a.b(f6 * fMin2) + i6;
        int iB2 = a.b(f8 * fMin2) + i6;
        int iB3 = a.b(f9 * fMin2) + i7;
        int iB4 = a.b(f10 * fMin2) + i7;
        if (i2 > 0) {
            int i8 = iB2 - iB;
            int i9 = iB4 - iB3;
            if (i8 < i2) {
                int i10 = i2 - i8;
                int i11 = i10 / 2;
                iB -= i11;
                iB2 += i10 - i11;
            }
            if (i9 < i2) {
                int i12 = i2 - i9;
                int i13 = i12 / 2;
                iB3 -= i13;
                iB4 += i12 - i13;
            }
        }
        if (z) {
            int i14 = iB2 - iB;
            int i15 = iB4 - iB3;
            int i16 = 0;
            if (i14 > iWidth) {
                i3 = (iWidth - i14) / 2;
            } else if (iB < i4) {
                i3 = i4 - iB;
            } else {
                int i17 = i4 + iWidth;
                i3 = iB2 > i17 ? i17 - iB2 : 0;
            }
            if (i15 > iHeight) {
                i16 = (iHeight - i15) / 2;
            } else if (iB3 < i5) {
                i16 = i5 - iB3;
            } else {
                int i18 = i5 + iHeight;
                if (iB4 > i18) {
                    i16 = i18 - iB4;
                }
            }
            iB += i3;
            iB2 += i3;
            iB3 += i16;
            iB4 += i16;
        }
        return new Rect(iB, iB3, iB2, iB4);
    }

    public static /* synthetic */ Object mapStreamPointToSensorRect$default(CameraMath cameraMath, float f2, float f3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, float f4, r rVar, int i9, Object obj) {
        int i10;
        x.f(rVar, "toSensorRect");
        float f5 = i2;
        float f6 = i3;
        float fMin = Math.min(f5, f6) * ((i9 & 1024) != 0 ? 0.18375f : f4);
        float f7 = i6;
        float f8 = i7;
        float fMin2 = Math.min(f7 / f5, f8 / f6);
        float f9 = fMin / 2.0f;
        int i11 = ((int) ((f7 - (f5 * fMin2)) / 2.0f)) + i4;
        int iB = a.b((f2 - f9) * fMin2) + i11;
        float f10 = fMin - f9;
        int iB2 = a.b((f2 + f10) * fMin2) + i11;
        int i12 = ((int) ((f8 - (f6 * fMin2)) / 2.0f)) + i5;
        int iB3 = a.b((f3 - f9) * fMin2) + i12;
        int iB4 = a.b((f3 + f10) * fMin2) + i12;
        int i13 = (i9 & 256) != 0 ? 32 : i8;
        if (i13 > 0) {
            int i14 = iB2 - iB;
            int i15 = iB4 - iB3;
            if (i14 < i13) {
                int i16 = i13 - i14;
                int i17 = i16 / 2;
                iB -= i17;
                iB2 += i16 - i17;
            }
            if (i15 < i13) {
                int i18 = i13 - i15;
                int i19 = i18 / 2;
                iB3 -= i19;
                iB4 += i18 - i19;
            }
        }
        int i20 = 0;
        if ((!((i9 & 512) == 0)) | z) {
            int i21 = iB2 - iB;
            int i22 = iB4 - iB3;
            if (i21 > i6) {
                i10 = (i6 - i21) / 2;
            } else if (iB < i4) {
                i10 = i4 - iB;
            } else {
                int i23 = i4 + i6;
                i10 = iB2 > i23 ? i23 - iB2 : 0;
            }
            if (i22 > i7) {
                i20 = (i7 - i22) / 2;
            } else if (iB3 < i5) {
                i20 = i5 - iB3;
            } else {
                int i24 = i5 + i7;
                if (iB4 > i24) {
                    i20 = i24 - iB4;
                }
            }
            iB += i10;
            iB2 += i10;
            iB3 += i20;
            iB4 += i20;
        }
        return rVar.invoke(Integer.valueOf(iB), Integer.valueOf(iB3), Integer.valueOf(iB2), Integer.valueOf(iB4));
    }

    public static final PointF mapStreamPointToUiPointF(PointF pointF, Size size, Size size2, boolean z, int i2) {
        x.f(pointF, "streamPoint");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        float f2 = pointF.x;
        float f3 = pointF.y;
        int width = size.getWidth();
        int height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        float f4 = f2 / width2;
        float f5 = f3 / height2;
        if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
                f5 = 1.0f - f5;
            } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
                f4 = 1.0f - f4;
                f5 = 1.0f - f5;
            } else {
                if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                    throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i2)));
                }
                f4 = 1.0f - f4;
            }
            float f6 = f4;
            f4 = f5;
            f5 = f6;
        }
        float f7 = width;
        return new PointF(!z ? f4 * f7 : (1.0f - f4) * f7, f5 * height);
    }

    public static final Rect mapStreamRectToSensorRect(RectF rectF, Size size, Rect rect, int i2, boolean z) {
        int i3;
        x.f(rectF, "streamRect");
        x.f(size, "streamSize");
        x.f(rect, "sensorCrop");
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        int width = size.getWidth();
        int height = size.getHeight();
        int i4 = rect.left;
        int i5 = rect.top;
        int iWidth = rect.width();
        float f6 = iWidth;
        float f7 = width;
        int iHeight = rect.height();
        float f8 = iHeight;
        float f9 = height;
        float fMin = Math.min(f6 / f7, f8 / f9);
        int i6 = ((int) ((f6 - (f7 * fMin)) / 2.0f)) + i4;
        int i7 = ((int) ((f8 - (f9 * fMin)) / 2.0f)) + i5;
        int iB = a.b(f2 * fMin) + i6;
        int iB2 = a.b(f4 * fMin) + i6;
        int iB3 = a.b(f3 * fMin) + i7;
        int iB4 = a.b(f5 * fMin) + i7;
        if (i2 > 0) {
            int i8 = iB2 - iB;
            int i9 = iB4 - iB3;
            if (i8 < i2) {
                int i10 = i2 - i8;
                int i11 = i10 / 2;
                iB -= i11;
                iB2 += i10 - i11;
            }
            if (i9 < i2) {
                int i12 = i2 - i9;
                int i13 = i12 / 2;
                iB3 -= i13;
                iB4 += i12 - i13;
            }
        }
        if (z) {
            int i14 = iB2 - iB;
            int i15 = iB4 - iB3;
            int i16 = 0;
            if (i14 > iWidth) {
                i3 = (iWidth - i14) / 2;
            } else if (iB < i4) {
                i3 = i4 - iB;
            } else {
                int i17 = i4 + iWidth;
                i3 = iB2 > i17 ? i17 - iB2 : 0;
            }
            if (i15 > iHeight) {
                i16 = (iHeight - i15) / 2;
            } else if (iB3 < i5) {
                i16 = i5 - iB3;
            } else {
                int i18 = i5 + iHeight;
                if (iB4 > i18) {
                    i16 = i18 - iB4;
                }
            }
            iB += i3;
            iB2 += i3;
            iB3 += i16;
            iB4 += i16;
        }
        return new Rect(iB, iB3, iB2, iB4);
    }

    public static /* synthetic */ Object mapStreamRectToSensorRect$default(CameraMath cameraMath, float f2, float f3, float f4, float f5, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, r rVar, int i9, Object obj) {
        int i10;
        x.f(rVar, "toSensorRect");
        float f6 = i7;
        float f7 = i3;
        float f8 = i6;
        float f9 = i2;
        float fMin = Math.min(f8 / f9, f6 / f7);
        int i11 = ((int) ((f8 - (f9 * fMin)) / 2.0f)) + i4;
        int iB = a.b(f2 * fMin) + i11;
        int iB2 = a.b(f4 * fMin) + i11;
        int i12 = ((int) ((f6 - (f7 * fMin)) / 2.0f)) + i5;
        int iB3 = a.b(f3 * fMin) + i12;
        int iB4 = a.b(f5 * fMin) + i12;
        int i13 = (i9 & 1024) != 0 ? 32 : i8;
        if (i13 > 0) {
            int i14 = iB2 - iB;
            int i15 = iB4 - iB3;
            if (i14 < i13) {
                int i16 = i13 - i14;
                int i17 = i16 / 2;
                iB -= i17;
                iB2 += i16 - i17;
            }
            if (i15 < i13) {
                int i18 = i13 - i15;
                int i19 = i18 / 2;
                iB3 -= i19;
                iB4 += i18 - i19;
            }
        }
        int i20 = 0;
        if ((!((i9 & 2048) == 0)) | z) {
            int i21 = iB2 - iB;
            int i22 = iB4 - iB3;
            if (i21 > i6) {
                i10 = (i6 - i21) / 2;
            } else if (iB < i4) {
                i10 = i4 - iB;
            } else {
                int i23 = i4 + i6;
                i10 = iB2 > i23 ? i23 - iB2 : 0;
            }
            if (i22 > i7) {
                i20 = (i7 - i22) / 2;
            } else if (iB3 < i5) {
                i20 = i5 - iB3;
            } else {
                int i24 = i5 + i7;
                if (iB4 > i24) {
                    i20 = i24 - iB4;
                }
            }
            iB += i10;
            iB2 += i10;
            iB3 += i20;
            iB4 += i20;
        }
        return rVar.invoke(Integer.valueOf(iB), Integer.valueOf(iB3), Integer.valueOf(iB2), Integer.valueOf(iB4));
    }

    public static final RectF mapStreamRectToUiRectF(RectF rectF, Size size, Size size2, boolean z, int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        x.f(rectF, "streamRect");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        float f7 = rectF.left;
        float f8 = rectF.top;
        float f9 = rectF.right;
        float f10 = rectF.bottom;
        int width = size.getWidth();
        int height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        float f11 = width2;
        float f12 = height2;
        float f13 = f7 / f11;
        float f14 = f8 / f12;
        float f15 = f9 / f11;
        float f16 = f10 / f12;
        if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f2 = f16;
            f3 = f14;
        } else {
            if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
                f4 = 1.0f - f14;
                f13 = 1.0f - f16;
                f3 = f13;
            } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
                f4 = 1.0f - f13;
                f13 = 1.0f - f15;
                f15 = 1.0f - f14;
                f3 = 1.0f - f16;
            } else {
                if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                    throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i2)));
                }
                f2 = 1.0f - f13;
                float f17 = 1.0f - f15;
                f15 = f16;
                f3 = f17;
                f13 = f14;
            }
            float f18 = f15;
            f15 = f4;
            f2 = f18;
        }
        float f19 = width;
        if (z) {
            float f20 = 1.0f - f15;
            f5 = (1.0f - f13) * f19;
            f6 = f20 * f19;
        } else {
            f6 = f13 * f19;
            f5 = f15 * f19;
        }
        float f21 = height;
        return new RectF(f6, f3 * f21, f5, f2 * f21);
    }

    public static final Size mapStreamSizeToSensorSize(Size size, Size size2, int i2, int i3) {
        x.f(size, "size");
        x.f(size2, "streamSize");
        float width = size.getWidth();
        float height = size.getHeight();
        float fMin = Math.min(i2 / size2.getWidth(), i3 / size2.getHeight());
        return new Size(a.b(width * fMin), a.b(height * fMin));
    }

    public static final SizeF mapStreamSizeToUiSizeF(Size size, Size size2, Size size3, int i2) {
        x.f(size, "size");
        x.f(size2, "uiSize");
        x.f(size3, "streamSize");
        float width = size.getWidth();
        float height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        int width3 = size3.getWidth();
        int height3 = size3.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        float f2 = width / width3;
        float f3 = height / height3;
        if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY()) && !DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f2 = f3;
            f3 = f2;
        }
        return new SizeF(f2 * width2, f3 * height2);
    }

    public static final Point mapUiPointToSensorPoint(Point point, Size size, Size size2, boolean z, int i2, Rect rect, boolean z2) {
        x.f(point, "uiPoint");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        x.f(rect, "sensorCrop");
        float f2 = point.x;
        float f3 = point.y;
        int width = size.getWidth();
        int height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        float f4 = width;
        float f5 = height;
        int i3 = rect.left;
        int i4 = rect.top;
        int iWidth = rect.width();
        int iHeight = rect.height();
        float f6 = !z ? f2 / f4 : (f4 - f2) / f4;
        float f7 = f3 / f5;
        if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
                float f8 = 1.0f - f6;
                f6 = f7;
                f7 = f8;
            } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
                f7 = 1.0f - f7;
                f6 = 1.0f - f6;
            } else {
                if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                    throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i2)));
                }
                float f9 = 1.0f - f7;
                f7 = f6;
                f6 = f9;
            }
        }
        float f10 = width2;
        float f11 = height2;
        float f12 = iWidth;
        float f13 = iHeight;
        float fMin = Math.min(f12 / f10, f13 / f11);
        int iB = a.b(f6 * f10 * fMin) + ((int) ((f12 - (f10 * fMin)) / 2.0f)) + i3;
        int iB2 = a.b(f7 * f11 * fMin) + ((int) ((f13 - (f11 * fMin)) / 2.0f)) + i4;
        if (z2) {
            iB = n.j(iB, i3, iWidth + i3);
            iB2 = n.j(iB2, i4, iHeight + i4);
        }
        return new Point(iB, iB2);
    }

    public static /* synthetic */ Point mapUiPointToSensorPoint$default(Point point, Size size, Size size2, boolean z, int i2, Rect rect, boolean z2, int i3, Object obj) {
        return mapUiPointToSensorPoint(point, size, size2, z, i2, rect, z2 | (!((i3 & 64) == 0)));
    }

    /* renamed from: mapUiPointToSensorPoint-y-WVLRc$default, reason: not valid java name */
    public static /* synthetic */ Object m1264mapUiPointToSensorPointyWVLRc$default(CameraMath cameraMath, float f2, float f3, int i2, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9, int i10, boolean z2, p pVar, int i11, Object obj) {
        float f4;
        x.f(pVar, "toSensorPoint");
        float f5 = i2;
        float f6 = !z ? f2 / f5 : (f5 - f2) / f5;
        float f7 = f3 / i3;
        if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f4 = f7;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            f4 = 1.0f - f6;
            f6 = f7;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f4 = 1.0f - f7;
            f6 = 1.0f - f6;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i6)));
            }
            f4 = f6;
            f6 = 1.0f - f7;
        }
        boolean z3 = (!((i11 & 4096) == 0)) | z2;
        float f8 = i4;
        float f9 = i5;
        float f10 = i9;
        float f11 = i10;
        float fMin = Math.min(f10 / f8, f11 / f9);
        int iB = a.b(f6 * f8 * fMin) + ((int) ((f10 - (f8 * fMin)) / 2.0f)) + i7;
        int iB2 = a.b(f4 * f9 * fMin) + ((int) ((f11 - (f9 * fMin)) / 2.0f)) + i8;
        if (z3) {
            iB = n.j(iB, i7, i9 + i7);
            iB2 = n.j(iB2, i8, i8 + i10);
        }
        return pVar.invoke(Integer.valueOf(iB), Integer.valueOf(iB2));
    }

    public static final Rect mapUiPointToSensorRect(Point point, Size size, Size size2, boolean z, int i2, Rect rect, int i3, boolean z2, float f2) {
        int i4;
        x.f(point, "uiPoint");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        x.f(rect, "sensorCrop");
        float f3 = point.x;
        float f4 = point.y;
        int width = size.getWidth();
        int height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        float f5 = width;
        float f6 = height;
        int i5 = rect.left;
        int i6 = rect.top;
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (z) {
            f3 = f5 - f3;
        }
        float f7 = f3 / f5;
        float f8 = f4 / f6;
        if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
                float f9 = 1.0f - f7;
                f7 = f8;
                f8 = f9;
            } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
                f8 = 1.0f - f8;
                f7 = 1.0f - f7;
            } else {
                if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                    throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i2)));
                }
                float f10 = 1.0f - f8;
                f8 = f7;
                f7 = f10;
            }
        }
        float f11 = width2;
        float f12 = height2;
        float fMin = Math.min(f11, f12) * f2;
        float f13 = iWidth;
        float f14 = iHeight;
        float fMin2 = Math.min(f13 / f11, f14 / f12);
        int i7 = ((int) ((f13 - (f11 * fMin2)) / 2.0f)) + i5;
        int i8 = ((int) ((f14 - (f12 * fMin2)) / 2.0f)) + i6;
        float f15 = f7 * f11;
        float f16 = fMin / 2.0f;
        int iB = a.b((f15 - f16) * fMin2) + i7;
        float f17 = fMin - f16;
        int iB2 = a.b((f15 + f17) * fMin2) + i7;
        float f18 = f8 * f12;
        int iB3 = a.b((f18 - f16) * fMin2) + i8;
        int iB4 = a.b((f18 + f17) * fMin2) + i8;
        if (i3 > 0) {
            int i9 = iB2 - iB;
            int i10 = iB4 - iB3;
            if (i9 < i3) {
                int i11 = i3 - i9;
                int i12 = i11 / 2;
                iB -= i12;
                iB2 += i11 - i12;
            }
            if (i10 < i3) {
                int i13 = i3 - i10;
                int i14 = i13 / 2;
                iB3 -= i14;
                iB4 += i13 - i14;
            }
        }
        if (z2) {
            int i15 = iB2 - iB;
            int i16 = iB4 - iB3;
            int i17 = 0;
            if (i15 > iWidth) {
                i4 = (iWidth - i15) / 2;
            } else if (iB < i5) {
                i4 = i5 - iB;
            } else {
                int i18 = i5 + iWidth;
                i4 = iB2 > i18 ? i18 - iB2 : 0;
            }
            if (i16 > iHeight) {
                i17 = (iHeight - i16) / 2;
            } else if (iB3 < i6) {
                i17 = i6 - iB3;
            } else {
                int i19 = i6 + iHeight;
                if (iB4 > i19) {
                    i17 = i19 - iB4;
                }
            }
            iB += i4;
            iB2 += i4;
            iB3 += i17;
            iB4 += i17;
        }
        return new Rect(iB, iB3, iB2, iB4);
    }

    public static /* synthetic */ Rect mapUiPointToSensorRect$default(Point point, Size size, Size size2, boolean z, int i2, Rect rect, int i3, boolean z2, float f2, int i4, Object obj) {
        return mapUiPointToSensorRect(point, size, size2, z, i2, rect, (i4 & 64) != 0 ? 32 : i3, (!((i4 & 128) == 0)) | z2, (i4 & 256) != 0 ? 0.18375f : f2);
    }

    /* renamed from: mapUiPointToSensorRect-lSILqjM$default, reason: not valid java name */
    public static /* synthetic */ Object m1265mapUiPointToSensorRectlSILqjM$default(CameraMath cameraMath, float f2, float f3, int i2, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2, float f4, r rVar, int i12, Object obj) {
        float f5;
        int i13;
        x.f(rVar, "toSensorRect");
        float f6 = i2;
        float f7 = !z ? f2 / f6 : (f6 - f2) / f6;
        float f8 = f3 / i3;
        if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f5 = f8;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            f5 = 1.0f - f7;
            f7 = f8;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f5 = 1.0f - f8;
            f7 = 1.0f - f7;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i6)));
            }
            f5 = f7;
            f7 = 1.0f - f8;
        }
        int i14 = i12 & 4096;
        float f9 = (i12 & 16384) != 0 ? 0.18375f : f4;
        int i15 = i14 != 0 ? 32 : i11;
        float f10 = i4;
        float f11 = i5;
        float fMin = Math.min(f10, f11) * f9;
        float f12 = i9;
        float f13 = i10;
        float fMin2 = Math.min(f12 / f10, f13 / f11);
        int i16 = ((int) ((f12 - (f10 * fMin2)) / 2.0f)) + i7;
        int i17 = ((int) ((f13 - (f11 * fMin2)) / 2.0f)) + i8;
        float f14 = f7 * f10;
        float f15 = fMin / 2.0f;
        int iB = a.b((f14 - f15) * fMin2) + i16;
        float f16 = fMin - f15;
        int iB2 = a.b((f14 + f16) * fMin2) + i16;
        float f17 = f5 * f11;
        int iB3 = a.b((f17 - f15) * fMin2) + i17;
        int iB4 = a.b((f17 + f16) * fMin2) + i17;
        if (i15 > 0) {
            int i18 = iB2 - iB;
            int i19 = iB4 - iB3;
            if (i18 < i15) {
                int i20 = i15 - i18;
                int i21 = i20 / 2;
                iB -= i21;
                iB2 += i20 - i21;
            }
            if (i19 < i15) {
                int i22 = i15 - i19;
                int i23 = i22 / 2;
                iB3 -= i23;
                iB4 += i22 - i23;
            }
        }
        int i24 = 0;
        if ((!((i12 & 8192) == 0)) | z2) {
            int i25 = iB2 - iB;
            int i26 = iB4 - iB3;
            if (i25 > i9) {
                i13 = (i9 - i25) / 2;
            } else if (iB < i7) {
                i13 = i7 - iB;
            } else {
                int i27 = i7 + i9;
                i13 = iB2 > i27 ? i27 - iB2 : 0;
            }
            if (i26 > i10) {
                i24 = (i10 - i26) / 2;
            } else if (iB3 < i8) {
                i24 = i8 - iB3;
            } else {
                int i28 = i8 + i10;
                if (iB4 > i28) {
                    i24 = i28 - iB4;
                }
            }
            iB += i13;
            iB2 += i13;
            iB3 += i24;
            iB4 += i24;
        }
        return rVar.invoke(Integer.valueOf(iB), Integer.valueOf(iB3), Integer.valueOf(iB2), Integer.valueOf(iB4));
    }

    public static final PointF mapUiPointToStreamPointF(Point point, Size size, Size size2, boolean z, int i2) {
        x.f(point, "uiPoint");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        float f2 = point.x;
        float f3 = point.y;
        int width = size.getWidth();
        int height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        float f4 = width;
        float f5 = height;
        float f6 = !z ? f2 / f4 : (f4 - f2) / f4;
        float f7 = f3 / f5;
        if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
                float f8 = 1.0f - f6;
                f6 = f7;
                f7 = f8;
            } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
                f7 = 1.0f - f7;
                f6 = 1.0f - f6;
            } else {
                if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                    throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i2)));
                }
                float f9 = 1.0f - f7;
                f7 = f6;
                f6 = f9;
            }
        }
        return new PointF(f6 * width2, f7 * height2);
    }

    /* renamed from: mapUiPointToStreamRect-WWnIsEo$default, reason: not valid java name */
    public static /* synthetic */ Object m1266mapUiPointToStreamRectWWnIsEo$default(CameraMath cameraMath, float f2, float f3, int i2, int i3, int i4, int i5, boolean z, int i6, float f4, r rVar, int i7, Object obj) {
        float f5;
        x.f(rVar, "toStreamRect");
        float f6 = i2;
        if (z) {
            f2 = f6 - f2;
        }
        float f7 = f2 / f6;
        float f8 = f3 / i3;
        if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f5 = f8;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            f5 = 1.0f - f7;
            f7 = f8;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f5 = 1.0f - f8;
            f7 = 1.0f - f7;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i6)));
            }
            f5 = f7;
            f7 = 1.0f - f8;
        }
        if ((i7 & 256) != 0) {
            f4 = 0.18375f;
        }
        float f9 = i4;
        float f10 = i5;
        float fMin = Math.min(f9, f10) * f4;
        float f11 = f5 * f10;
        float f12 = f7 * f9;
        float f13 = fMin / 2.0f;
        float f14 = fMin - f13;
        return rVar.invoke(Float.valueOf(f12 - f13), Float.valueOf(f11 - f13), Float.valueOf(f12 + f14), Float.valueOf(f11 + f14));
    }

    public static final RectF mapUiPointToStreamRectF(Point point, Size size, Size size2, boolean z, int i2, float f2) {
        x.f(point, "uiPoint");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        float f3 = point.x;
        float f4 = point.y;
        int width = size.getWidth();
        int height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        float f5 = width;
        float f6 = height;
        float f7 = !z ? f3 / f5 : (f5 - f3) / f5;
        float f8 = f4 / f6;
        if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
                float f9 = 1.0f - f7;
                f7 = f8;
                f8 = f9;
            } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
                f8 = 1.0f - f8;
                f7 = 1.0f - f7;
            } else {
                if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                    throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i2)));
                }
                float f10 = 1.0f - f8;
                f8 = f7;
                f7 = f10;
            }
        }
        float f11 = width2;
        float f12 = height2;
        float fMin = Math.min(f11, f12) * f2;
        float f13 = f8 * f12;
        float f14 = f7 * f11;
        float f15 = fMin / 2.0f;
        float f16 = fMin - f15;
        return new RectF(f14 - f15, f13 - f15, f14 + f16, f16 + f13);
    }

    public static /* synthetic */ RectF mapUiPointToStreamRectF$default(Point point, Size size, Size size2, boolean z, int i2, float f2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            f2 = 0.18375f;
        }
        return mapUiPointToStreamRectF(point, size, size2, z, i2, f2);
    }

    public static final Rect mapUiRectToSensorRect(RectF rectF, Size size, Size size2, boolean z, int i2, Rect rect, int i3, boolean z2) {
        float f2;
        float f3;
        float f4;
        float f5;
        int i4;
        x.f(rectF, "uiRect");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        x.f(rect, "sensorCrop");
        float f6 = rectF.left;
        float f7 = rectF.top;
        float f8 = rectF.right;
        float f9 = rectF.bottom;
        int width = size.getWidth();
        int height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        float f10 = width;
        float f11 = height;
        int i5 = rect.left;
        int i6 = rect.top;
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (z) {
            float f12 = (f10 - f8) / f10;
            f2 = (f10 - f6) / f10;
            f3 = f12;
        } else {
            f3 = f6 / f10;
            f2 = f8 / f10;
        }
        float f13 = f7 / f11;
        float f14 = f9 / f11;
        if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f4 = f14;
            f5 = f13;
        } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            f4 = 1.0f - f3;
            float f15 = 1.0f - f2;
            f2 = f14;
            f5 = f15;
            f3 = f13;
        } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f4 = 1.0f - f13;
            f5 = 1.0f - f14;
            float f16 = 1.0f - f2;
            f2 = 1.0f - f3;
            f3 = f16;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i2)));
            }
            float f17 = 1.0f - f14;
            float f18 = f2;
            f2 = 1.0f - f13;
            f4 = f18;
            f5 = f3;
            f3 = f17;
        }
        float f19 = width2;
        float f20 = height2;
        float f21 = iWidth;
        float f22 = iHeight;
        float fMin = Math.min(f21 / f19, f22 / f20);
        int i7 = ((int) ((f21 - (f19 * fMin)) / 2.0f)) + i5;
        int i8 = ((int) ((f22 - (f20 * fMin)) / 2.0f)) + i6;
        int iB = a.b(f3 * f19 * fMin) + i7;
        int iB2 = a.b(f2 * f19 * fMin) + i7;
        int iB3 = a.b(f5 * f20 * fMin) + i8;
        int iB4 = a.b(f4 * f20 * fMin) + i8;
        if (i3 > 0) {
            int i9 = iB2 - iB;
            int i10 = iB4 - iB3;
            if (i9 < i3) {
                int i11 = i3 - i9;
                int i12 = i11 / 2;
                iB -= i12;
                iB2 += i11 - i12;
            }
            if (i10 < i3) {
                int i13 = i3 - i10;
                int i14 = i13 / 2;
                iB3 -= i14;
                iB4 += i13 - i14;
            }
        }
        if (z2) {
            int i15 = iB2 - iB;
            int i16 = iB4 - iB3;
            int i17 = 0;
            if (i15 > iWidth) {
                i4 = (iWidth - i15) / 2;
            } else if (iB < i5) {
                i4 = i5 - iB;
            } else {
                int i18 = i5 + iWidth;
                i4 = iB2 > i18 ? i18 - iB2 : 0;
            }
            if (i16 > iHeight) {
                i17 = (iHeight - i16) / 2;
            } else if (iB3 < i6) {
                i17 = i6 - iB3;
            } else {
                int i19 = i6 + iHeight;
                if (iB4 > i19) {
                    i17 = i19 - iB4;
                }
            }
            iB += i4;
            iB2 += i4;
            iB3 += i17;
            iB4 += i17;
        }
        return new Rect(iB, iB3, iB2, iB4);
    }

    public static /* synthetic */ Rect mapUiRectToSensorRect$default(RectF rectF, Size size, Size size2, boolean z, int i2, Rect rect, int i3, boolean z2, int i4, Object obj) {
        return mapUiRectToSensorRect(rectF, size, size2, z, i2, rect, (i4 & 64) != 0 ? 32 : i3, (!((i4 & 128) == 0)) | z2);
    }

    /* renamed from: mapUiRectToSensorRect-ljOWZLo$default, reason: not valid java name */
    public static /* synthetic */ Object m1267mapUiRectToSensorRectljOWZLo$default(CameraMath cameraMath, float f2, float f3, float f4, float f5, int i2, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2, r rVar, int i12, Object obj) {
        float f6;
        float f7;
        float f8;
        float f9;
        int i13;
        x.f(rVar, "toSensorRect");
        float f10 = i2;
        if (z) {
            f6 = (f10 - f4) / f10;
            f7 = (f10 - f2) / f10;
        } else {
            f6 = f2 / f10;
            f7 = f4 / f10;
        }
        float f11 = i3;
        float f12 = f3 / f11;
        float f13 = f5 / f11;
        if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f8 = f13;
            f9 = f12;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            f8 = 1.0f - f6;
            float f14 = 1.0f - f7;
            f7 = f13;
            f9 = f14;
            f6 = f12;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f8 = 1.0f - f12;
            f9 = 1.0f - f13;
            float f15 = 1.0f - f6;
            f6 = 1.0f - f7;
            f7 = f15;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i6)));
            }
            float f16 = 1.0f - f13;
            float f17 = f7;
            f7 = 1.0f - f12;
            f8 = f17;
            f9 = f6;
            f6 = f16;
        }
        int i14 = (i12 & 16384) != 0 ? 32 : i11;
        float f18 = i4;
        float f19 = i5;
        float f20 = i9;
        float f21 = i10;
        float f22 = f8;
        float fMin = Math.min(f20 / f18, f21 / f19);
        int i15 = ((int) ((f20 - (f18 * fMin)) / 2.0f)) + i7;
        int i16 = ((int) ((f21 - (f19 * fMin)) / 2.0f)) + i8;
        int iB = a.b(f6 * f18 * fMin) + i15;
        int iB2 = a.b(f7 * f18 * fMin) + i15;
        int iB3 = a.b(f9 * f19 * fMin) + i16;
        int iB4 = a.b(f22 * f19 * fMin) + i16;
        if (i14 > 0) {
            int i17 = iB2 - iB;
            int i18 = iB4 - iB3;
            if (i17 < i14) {
                int i19 = i14 - i17;
                int i20 = i19 / 2;
                iB -= i20;
                iB2 += i19 - i20;
            }
            if (i18 < i14) {
                int i21 = i14 - i18;
                int i22 = i21 / 2;
                iB3 -= i22;
                iB4 += i21 - i22;
            }
        }
        int i23 = 0;
        if ((!((i12 & 32768) == 0)) | z2) {
            int i24 = iB2 - iB;
            int i25 = iB4 - iB3;
            if (i24 > i9) {
                i13 = (i9 - i24) / 2;
            } else if (iB < i7) {
                i13 = i7 - iB;
            } else {
                int i26 = i7 + i9;
                i13 = iB2 > i26 ? i26 - iB2 : 0;
            }
            if (i25 > i10) {
                i23 = (i10 - i25) / 2;
            } else if (iB3 < i8) {
                i23 = i8 - iB3;
            } else {
                int i27 = i8 + i10;
                if (iB4 > i27) {
                    i23 = i27 - iB4;
                }
            }
            iB += i13;
            iB2 += i13;
            iB3 += i23;
            iB4 += i23;
        }
        return rVar.invoke(Integer.valueOf(iB), Integer.valueOf(iB3), Integer.valueOf(iB2), Integer.valueOf(iB4));
    }

    public static final RectF mapUiRectToStreamRectF(RectF rectF, Size size, Size size2, boolean z, int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        x.f(rectF, "uiRect");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        float f6 = rectF.left;
        float f7 = rectF.top;
        float f8 = rectF.right;
        float f9 = rectF.bottom;
        int width = size.getWidth();
        int height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        float f10 = width;
        float f11 = height;
        if (z) {
            float f12 = (f10 - f8) / f10;
            f2 = (f10 - f6) / f10;
            f3 = f12;
        } else {
            f3 = f6 / f10;
            f2 = f8 / f10;
        }
        float f13 = f7 / f11;
        float f14 = f9 / f11;
        if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f4 = f14;
            f5 = f13;
        } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            f4 = 1.0f - f3;
            float f15 = 1.0f - f2;
            f2 = f14;
            f5 = f15;
            f3 = f13;
        } else if (DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f4 = 1.0f - f13;
            f5 = 1.0f - f14;
            float f16 = 1.0f - f3;
            f3 = 1.0f - f2;
            f2 = f16;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i2)));
            }
            float f17 = 1.0f - f14;
            float f18 = f2;
            f2 = 1.0f - f13;
            f4 = f18;
            f5 = f3;
            f3 = f17;
        }
        float f19 = width2;
        float f20 = height2;
        return new RectF(f3 * f19, f5 * f20, f2 * f19, f4 * f20);
    }

    public static final Size mapUiSizeToSensorSize(Size size, Size size2, Size size3, int i2, int i3, int i4) {
        x.f(size, "size");
        x.f(size2, "uiSize");
        x.f(size3, "streamSize");
        float width = size.getWidth();
        float height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        int width3 = size3.getWidth();
        int height3 = size3.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        float f2 = width / width2;
        float f3 = height / height2;
        if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY()) && !DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f2 = f3;
            f3 = f2;
        }
        float f4 = width3;
        float f5 = height3;
        float f6 = f2 * f4;
        float fMin = Math.min(i3 / f4, i4 / f5);
        return new Size(a.b(f6 * fMin), a.b(f3 * f5 * fMin));
    }

    public static final SizeF mapUiSizeToStreamSizeF(Size size, Size size2, Size size3, int i2) {
        x.f(size, "size");
        x.f(size2, "uiSize");
        x.f(size3, "streamSize");
        float width = size.getWidth();
        float height = size.getHeight();
        int width2 = size2.getWidth();
        int height2 = size2.getHeight();
        int width3 = size3.getWidth();
        int height3 = size3.getHeight();
        DiscreteRotation.Companion.m1299fromREjCm4(i2);
        float f2 = width / width2;
        float f3 = height / height2;
        if (!DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY()) && !DiscreteRotation.m1287equalsimpl0(i2, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f2 = f3;
            f3 = f2;
        }
        return new SizeF(f2 * width3, f3 * height3);
    }

    public final <T> T computeScaleAndOffsetWithinBounds(int i2, int i3, int i4, int i5, int i6, int i7, q<? super Float, ? super Integer, ? super Integer, ? extends T> qVar) {
        x.f(qVar, "transform");
        float f2 = i7;
        float f3 = i3;
        float f4 = i6;
        float f5 = i2;
        float fMin = Math.min(f4 / f5, f2 / f3);
        return qVar.invoke(Float.valueOf(fMin), Integer.valueOf(i4 + ((int) ((f4 - (f5 * fMin)) / 2.0f))), Integer.valueOf(i5 + ((int) ((f2 - (f3 * fMin)) / 2.0f))));
    }

    public final float computeScaleToFit(int i2, int i3, int i4, int i5) {
        return Math.min(i4 / i2, i5 / i3);
    }

    /* renamed from: computeSensorRotationToDisplayOrientation-vv0rJw8, reason: not valid java name */
    public final /* synthetic */ int m1268computeSensorRotationToDisplayOrientationvv0rJw8(int i2, int i3, boolean z) {
        return (z ? i3 + i2 : (i3 - i2) + DisplayStrings.DS_ONE_DAY_AGO) % DisplayStrings.DS_ONE_DAY_AGO;
    }

    /* renamed from: computeSensorRotationToJpegOrientation-vv0rJw8, reason: not valid java name */
    public final /* synthetic */ int m1269computeSensorRotationToJpegOrientationvv0rJw8(int i2, int i3, boolean z) {
        return (z ? (i3 - i2) + DisplayStrings.DS_ONE_DAY_AGO : i3 + i2) % DisplayStrings.DS_ONE_DAY_AGO;
    }

    public final /* synthetic */ <T> T mapSensorPointToStreamPoint(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, p<? super Float, ? super Float, ? extends T> pVar) {
        x.f(pVar, "toStreamPoint");
        float f2 = i8;
        float f3 = i4;
        float fMin = Math.min(f2 / f3, i9 / i5);
        return pVar.invoke(Float.valueOf((i2 - (i6 + ((int) ((f2 - (f3 * fMin)) / 2.0f)))) / fMin), Float.valueOf((i3 - (i7 + ((int) ((r1 - (r5 * fMin)) / 2.0f)))) / fMin));
    }

    /* renamed from: mapSensorPointToUiPoint-N9jg0Fw, reason: not valid java name */
    public final /* synthetic */ <T> T m1270mapSensorPointToUiPointN9jg0Fw(int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, int i9, int i10, int i11, int i12, p<? super Float, ? super Float, ? extends T> pVar) {
        float f2;
        x.f(pVar, "toUiPoint");
        float f3 = i7;
        float f4 = i11;
        float f5 = i6;
        float fMin = Math.min(f4 / f5, i12 / f3);
        float f6 = ((i3 - (i10 + ((int) ((r1 - (f3 * fMin)) / 2.0f)))) / fMin) / f3;
        float f7 = ((i2 - (i9 + ((int) ((f4 - (f5 * fMin)) / 2.0f)))) / fMin) / f5;
        if (DiscreteRotation.m1287equalsimpl0(i8, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f2 = f6;
            f6 = f7;
        } else if (DiscreteRotation.m1287equalsimpl0(i8, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            f6 = 1.0f - f6;
            f2 = f7;
        } else if (DiscreteRotation.m1287equalsimpl0(i8, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            float f8 = 1.0f - f6;
            f6 = 1.0f - f7;
            f2 = f8;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i8, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i8)));
            }
            f2 = 1.0f - f7;
        }
        float f9 = i4;
        return pVar.invoke(Float.valueOf(!z ? f6 * f9 : (1.0f - f6) * f9), Float.valueOf(f2 * i5));
    }

    public final /* synthetic */ <T> T mapSensorRectToStreamRect(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, r<? super Float, ? super Float, ? super Float, ? super Float, ? extends T> rVar) {
        x.f(rVar, "toStreamRect");
        float f2 = i11;
        float f3 = i7;
        float f4 = i10;
        float f5 = i6;
        float fMin = Math.min(f4 / f5, f2 / f3);
        float f6 = i8 + ((int) ((f4 - (f5 * fMin)) / 2.0f));
        int i12 = i9 + ((int) ((f2 - (f3 * fMin)) / 2.0f));
        float f7 = i3;
        float f8 = i12;
        return rVar.invoke(Float.valueOf((i2 - f6) / fMin), Float.valueOf((f7 - f8) / fMin), Float.valueOf((i4 - f6) / fMin), Float.valueOf((i5 - f8) / fMin));
    }

    /* renamed from: mapSensorRectToUiRect-lTeStnQ, reason: not valid java name */
    public final /* synthetic */ <T> T m1271mapSensorRectToUiRectlTeStnQ(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, int i11, int i12, int i13, int i14, r<? super Float, ? super Float, ? super Float, ? super Float, ? extends T> rVar) {
        float f2;
        float f3;
        float f4;
        x.f(rVar, "toUiRect");
        float f5 = i14;
        float f6 = i9;
        float f7 = i13;
        float f8 = i8;
        float fMin = Math.min(f7 / f8, f5 / f6);
        float f9 = i11 + ((int) ((f7 - (f8 * fMin)) / 2.0f));
        float f10 = i12 + ((int) ((f5 - (f6 * fMin)) / 2.0f));
        float f11 = ((i5 - f10) / fMin) / f6;
        float f12 = ((i3 - f10) / fMin) / f6;
        float f13 = ((i4 - f9) / fMin) / f8;
        float f14 = ((i2 - f9) / fMin) / f8;
        if (DiscreteRotation.m1287equalsimpl0(i10, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f12 = f14;
            f14 = f12;
            f2 = f11;
            f11 = f13;
        } else if (DiscreteRotation.m1287equalsimpl0(i10, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            float f15 = 1.0f - f12;
            f12 = 1.0f - f11;
            f11 = f15;
            f2 = f13;
        } else if (DiscreteRotation.m1287equalsimpl0(i10, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            float f16 = 1.0f - f14;
            float f17 = 1.0f - f13;
            float f18 = 1.0f - f11;
            f11 = f16;
            f2 = 1.0f - f12;
            f12 = f17;
            f14 = f18;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i10, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i10)));
            }
            f2 = 1.0f - f14;
            f14 = 1.0f - f13;
        }
        float f19 = i6;
        if (z) {
            float f20 = (1.0f - f12) * f19;
            float f21 = f19 * (1.0f - f11);
            f3 = f20;
            f4 = f21;
        } else {
            f4 = f12 * f19;
            f3 = f11 * f19;
        }
        float f22 = i7;
        return rVar.invoke(Float.valueOf(f4), Float.valueOf(f14 * f22), Float.valueOf(f3), Float.valueOf(f2 * f22));
    }

    public final /* synthetic */ <T> T mapSensorSizeToStreamSize(int i2, int i3, int i4, int i5, int i6, int i7, p<? super Float, ? super Float, ? extends T> pVar) {
        x.f(pVar, "toStreamSize");
        float f2 = i2;
        float fMin = Math.min(i6 / i4, i7 / i5);
        return pVar.invoke(Float.valueOf(f2 / fMin), Float.valueOf(i3 / fMin));
    }

    /* renamed from: mapSensorSizeToUiSize-cxLx2p8, reason: not valid java name */
    public final /* synthetic */ <T> T m1272mapSensorSizeToUiSizecxLx2p8(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, p<? super Float, ? super Float, ? extends T> pVar) {
        x.f(pVar, "toUiSize");
        float f2 = i2;
        float f3 = i7;
        float f4 = i6;
        float fMin = Math.min(i9 / f4, i10 / f3);
        float f5 = (f2 / fMin) / f4;
        float f6 = (i3 / fMin) / f3;
        if (!DiscreteRotation.m1287equalsimpl0(i8, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY()) && !DiscreteRotation.m1287equalsimpl0(i8, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f6 = f5;
            f5 = f6;
        }
        return pVar.invoke(Float.valueOf(f5 * i4), Float.valueOf(f6 * i5));
    }

    /* renamed from: mapStreamPointToUiPoint-HHsWsIo, reason: not valid java name */
    public final /* synthetic */ <T> T m1273mapStreamPointToUiPointHHsWsIo(float f2, float f3, int i2, int i3, int i4, int i5, boolean z, int i6, p<? super Float, ? super Float, ? extends T> pVar) {
        float f4;
        x.f(pVar, "toUiPoint");
        float f5 = f3 / i5;
        float f6 = f2 / i4;
        if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f4 = f5;
            f5 = f6;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            f5 = 1.0f - f5;
            f4 = f6;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            float f7 = 1.0f - f5;
            f5 = 1.0f - f6;
            f4 = f7;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i6)));
            }
            f4 = 1.0f - f6;
        }
        float f8 = i2;
        return pVar.invoke(Float.valueOf(!z ? f5 * f8 : (1.0f - f5) * f8), Float.valueOf(f4 * i3));
    }

    /* renamed from: mapStreamRectToUiRect-koXgLMo, reason: not valid java name */
    public final /* synthetic */ <T> T m1274mapStreamRectToUiRectkoXgLMo(float f2, float f3, float f4, float f5, int i2, int i3, int i4, int i5, boolean z, int i6, r<? super Float, ? super Float, ? super Float, ? super Float, ? extends T> rVar) {
        float f6;
        float f7;
        float f8;
        x.f(rVar, "toUiRect");
        float f9 = i5;
        float f10 = f5 / f9;
        float f11 = f3 / f9;
        float f12 = i4;
        float f13 = f4 / f12;
        float f14 = f2 / f12;
        if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f11 = f14;
            f14 = f11;
            f6 = f10;
            f10 = f13;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            float f15 = 1.0f - f11;
            f11 = 1.0f - f10;
            f10 = f15;
            f6 = f13;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            float f16 = 1.0f - f14;
            float f17 = 1.0f - f13;
            float f18 = 1.0f - f10;
            f10 = f16;
            f6 = 1.0f - f11;
            f11 = f17;
            f14 = f18;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i6)));
            }
            f6 = 1.0f - f14;
            f14 = 1.0f - f13;
        }
        float f19 = i2;
        if (z) {
            float f20 = (1.0f - f11) * f19;
            float f21 = f19 * (1.0f - f10);
            f7 = f20;
            f8 = f21;
        } else {
            f8 = f11 * f19;
            f7 = f10 * f19;
        }
        float f22 = i3;
        return rVar.invoke(Float.valueOf(f8), Float.valueOf(f14 * f22), Float.valueOf(f7), Float.valueOf(f6 * f22));
    }

    /* renamed from: mapStreamSizeToUiSize-8lHuTWI, reason: not valid java name */
    public final /* synthetic */ <T> T m1275mapStreamSizeToUiSize8lHuTWI(float f2, float f3, int i2, int i3, int i4, int i5, int i6, p<? super Float, ? super Float, ? extends T> pVar) {
        x.f(pVar, "toUiSize");
        float f4 = f2 / i4;
        float f5 = f3 / i5;
        if (!DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY()) && !DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f5 = f4;
            f4 = f5;
        }
        return pVar.invoke(Float.valueOf(f4 * i2), Float.valueOf(f5 * i3));
    }

    /* renamed from: mapUiPointToSensorPoint-y-WVLRc, reason: not valid java name */
    public final /* synthetic */ <T> T m1276mapUiPointToSensorPointyWVLRc(float f2, float f3, int i2, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9, int i10, boolean z2, p<? super Integer, ? super Integer, ? extends T> pVar) {
        float f4;
        x.f(pVar, "toSensorPoint");
        float f5 = i2;
        if (z) {
            f2 = f5 - f2;
        }
        float f6 = f2 / f5;
        float f7 = f3 / i3;
        if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f4 = f7;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            f4 = 1.0f - f6;
            f6 = f7;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f4 = 1.0f - f7;
            f6 = 1.0f - f6;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i6)));
            }
            f4 = f6;
            f6 = 1.0f - f7;
        }
        float f8 = i4;
        float f9 = i5;
        float f10 = i9;
        float f11 = i10;
        float fMin = Math.min(f10 / f8, f11 / f9);
        int iB = a.b(f6 * f8 * fMin) + ((int) ((f10 - (f8 * fMin)) / 2.0f)) + i7;
        int iB2 = a.b(f4 * f9 * fMin) + ((int) ((f11 - (f9 * fMin)) / 2.0f)) + i8;
        if (z2) {
            iB = n.j(iB, i7, i9 + i7);
            iB2 = n.j(iB2, i8, i10 + i8);
        }
        return pVar.invoke(Integer.valueOf(iB), Integer.valueOf(iB2));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* renamed from: mapUiPointToSensorRect-lSILqjM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ <T> T m1277mapUiPointToSensorRectlSILqjM(float r17, float r18, int r19, int r20, int r21, int r22, boolean r23, int r24, int r25, int r26, int r27, int r28, int r29, boolean r30, float r31, h.g.a.r<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r32) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.common.CameraMath.m1277mapUiPointToSensorRectlSILqjM(float, float, int, int, int, int, boolean, int, int, int, int, int, int, boolean, float, h.g.a.r):java.lang.Object");
    }

    /* renamed from: mapUiPointToStreamPoint-HHsWsIo, reason: not valid java name */
    public final /* synthetic */ <T> T m1278mapUiPointToStreamPointHHsWsIo(float f2, float f3, int i2, int i3, int i4, int i5, boolean z, int i6, p<? super Float, ? super Float, ? extends T> pVar) {
        float f4;
        x.f(pVar, "toStreamPoint");
        float f5 = i2;
        if (z) {
            f2 = f5 - f2;
        }
        float f6 = f2 / f5;
        float f7 = f3 / i3;
        if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f4 = f7;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            f4 = 1.0f - f6;
            f6 = f7;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f4 = 1.0f - f7;
            f6 = 1.0f - f6;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i6)));
            }
            f4 = f6;
            f6 = 1.0f - f7;
        }
        return pVar.invoke(Float.valueOf(f6 * i4), Float.valueOf(f4 * i5));
    }

    /* renamed from: mapUiPointToStreamRect-WWnIsEo, reason: not valid java name */
    public final /* synthetic */ <T> T m1279mapUiPointToStreamRectWWnIsEo(float f2, float f3, int i2, int i3, int i4, int i5, boolean z, int i6, float f4, r<? super Float, ? super Float, ? super Float, ? super Float, ? extends T> rVar) {
        float f5;
        x.f(rVar, "toStreamRect");
        float f6 = i2;
        if (z) {
            f2 = f6 - f2;
        }
        float f7 = f2 / f6;
        float f8 = f3 / i3;
        if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f5 = f8;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            f5 = 1.0f - f7;
            f7 = f8;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f5 = 1.0f - f8;
            f7 = 1.0f - f7;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i6)));
            }
            f5 = f7;
            f7 = 1.0f - f8;
        }
        float f9 = i4;
        float f10 = i5;
        float fMin = Math.min(f9, f10) * f4;
        float f11 = f7 * f9;
        float f12 = f5 * f10;
        float f13 = fMin / 2.0f;
        float f14 = fMin - f13;
        return rVar.invoke(Float.valueOf(f11 - f13), Float.valueOf(f12 - f13), Float.valueOf(f11 + f14), Float.valueOf(f12 + f14));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2  */
    /* renamed from: mapUiRectToSensorRect-ljOWZLo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ <T> T m1280mapUiRectToSensorRectljOWZLo(float r18, float r19, float r20, float r21, int r22, int r23, int r24, int r25, boolean r26, int r27, int r28, int r29, int r30, int r31, int r32, boolean r33, h.g.a.r<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r34) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.common.CameraMath.m1280mapUiRectToSensorRectljOWZLo(float, float, float, float, int, int, int, int, boolean, int, int, int, int, int, int, boolean, h.g.a.r):java.lang.Object");
    }

    /* renamed from: mapUiRectToStreamRect-koXgLMo, reason: not valid java name */
    public final /* synthetic */ <T> T m1281mapUiRectToStreamRectkoXgLMo(float f2, float f3, float f4, float f5, int i2, int i3, int i4, int i5, boolean z, int i6, r<? super Float, ? super Float, ? super Float, ? super Float, ? extends T> rVar) {
        float f6;
        float f7;
        float f8;
        x.f(rVar, "toStreamRect");
        float f9 = i2;
        if (z) {
            float f10 = (f9 - f4) / f9;
            float f11 = (f9 - f2) / f9;
            f6 = f10;
            f7 = f11;
        } else {
            f6 = f2 / f9;
            f7 = f4 / f9;
        }
        float f12 = i3;
        float f13 = f3 / f12;
        float f14 = f5 / f12;
        if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY())) {
            f8 = f14;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1304getROTATION_904VhhBrY())) {
            f8 = 1.0f - f6;
            f13 = 1.0f - f7;
            f6 = f13;
            f7 = f14;
        } else if (DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f8 = 1.0f - f13;
            f13 = 1.0f - f14;
            float f15 = 1.0f - f7;
            f7 = 1.0f - f6;
            f6 = f15;
        } else {
            if (!DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1303getROTATION_2704VhhBrY())) {
                throw new IllegalArgumentException("Unexpected degrees: ".concat(DiscreteRotation.m1293toStringimpl(i6)));
            }
            float f16 = 1.0f - f13;
            float f17 = f7;
            f7 = f16;
            f8 = f17;
            f13 = f6;
            f6 = 1.0f - f14;
        }
        float f18 = i4;
        float f19 = i5;
        return rVar.invoke(Float.valueOf(f6 * f18), Float.valueOf(f13 * f19), Float.valueOf(f7 * f18), Float.valueOf(f8 * f19));
    }

    /* renamed from: mapUiSizeToSensorSize-cxLx2p8, reason: not valid java name */
    public final /* synthetic */ <T> T m1282mapUiSizeToSensorSizecxLx2p8(float f2, float f3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, p<? super Integer, ? super Integer, ? extends T> pVar) {
        x.f(pVar, "toSensorSize");
        float f4 = f2 / i2;
        float f5 = f3 / i3;
        if (!DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY()) && !DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f5 = f4;
            f4 = f5;
        }
        float f6 = i4;
        float f7 = i5;
        float f8 = f4 * f6;
        float fMin = Math.min(i7 / f6, i8 / f7);
        return pVar.invoke(Integer.valueOf(a.b(f8 * fMin)), Integer.valueOf(a.b(f5 * f7 * fMin)));
    }

    /* renamed from: mapUiSizeToStreamSize-8lHuTWI, reason: not valid java name */
    public final /* synthetic */ <T> T m1283mapUiSizeToStreamSize8lHuTWI(float f2, float f3, int i2, int i3, int i4, int i5, int i6, p<? super Float, ? super Float, ? extends T> pVar) {
        x.f(pVar, "toStreamSize");
        float f4 = f2 / i2;
        float f5 = f3 / i3;
        if (!DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1301getROTATION_04VhhBrY()) && !DiscreteRotation.m1287equalsimpl0(i6, DiscreteRotation.Companion.m1302getROTATION_1804VhhBrY())) {
            f5 = f4;
            f4 = f5;
        }
        return pVar.invoke(Float.valueOf(f4 * i4), Float.valueOf(f5 * i5));
    }

    public final <T> T streamToSensorTransform(int i2, int i3, int i4, int i5, int i6, int i7, q<? super Float, ? super Integer, ? super Integer, ? extends T> qVar) {
        x.f(qVar, "transform");
        float f2 = i7;
        float f3 = i3;
        float f4 = i6;
        float f5 = i2;
        float fMin = Math.min(f4 / f5, f2 / f3);
        return qVar.invoke(Float.valueOf(fMin), Integer.valueOf(i4 + ((int) ((f4 - (f5 * fMin)) / 2.0f))), Integer.valueOf(i5 + ((int) ((f2 - (f3 * fMin)) / 2.0f))));
    }

    public final /* synthetic */ <T> T mapStreamSizeToSensorSize(float f2, float f3, int i2, int i3, int i4, int i5, p<? super Integer, ? super Integer, ? extends T> pVar) {
        x.f(pVar, "toSensorSize");
        float fMin = Math.min(i4 / i2, i5 / i3);
        return pVar.invoke(Integer.valueOf(a.b(f2 * fMin)), Integer.valueOf(a.b(f3 * fMin)));
    }

    public static /* synthetic */ Point mapStreamPointToSensorPoint$default(PointF pointF, Size size, Rect rect, boolean z, int i2, Object obj) {
        return mapStreamPointToSensorPoint(pointF, size, rect, z | (!((i2 & 8) == 0)));
    }

    public static final Point mapStreamPointToSensorPoint(PointF pointF, Size size, Rect rect) {
        x.f(pointF, "streamPoint");
        x.f(size, "streamSize");
        x.f(rect, "sensorCrop");
        return mapStreamPointToSensorPoint$default(pointF, size, rect, false, 8, null);
    }

    public final /* synthetic */ <T> T mapStreamPointToSensorPoint(float f2, float f3, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, p<? super Integer, ? super Integer, ? extends T> pVar) {
        x.f(pVar, "toSensorPoint");
        float f4 = i7;
        float f5 = i3;
        float f6 = i6;
        float f7 = i2;
        float fMin = Math.min(f6 / f7, f4 / f5);
        int iB = a.b(f2 * fMin) + ((int) ((f6 - (f7 * fMin)) / 2.0f)) + i4;
        int iB2 = a.b(f3 * fMin) + ((int) ((f4 - (f5 * fMin)) / 2.0f)) + i5;
        if (z) {
            iB = n.j(iB, i4, i6 + i4);
            iB2 = n.j(iB2, i5, i7 + i5);
        }
        return pVar.invoke(Integer.valueOf(iB), Integer.valueOf(iB2));
    }

    public static final RectF mapUiPointToStreamRectF(Point point, Size size, Size size2, boolean z, int i2) {
        x.f(point, "uiPoint");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        return mapUiPointToStreamRectF$default(point, size, size2, z, i2, 0.0f, 32, null);
    }

    public static final Rect mapStreamRectToSensorRect(RectF rectF, Size size, Rect rect, int i2) {
        x.f(rectF, "streamRect");
        x.f(size, "streamSize");
        x.f(rect, "sensorCrop");
        return mapStreamRectToSensorRect$default(rectF, size, rect, i2, false, 16, null);
    }

    public static final Rect mapStreamRectToSensorRect(RectF rectF, Size size, Rect rect) {
        x.f(rectF, "streamRect");
        x.f(size, "streamSize");
        x.f(rect, "sensorCrop");
        return mapStreamRectToSensorRect$default(rectF, size, rect, 0, false, 24, null);
    }

    public final /* synthetic */ <T> T mapStreamRectToSensorRect(float f2, float f3, float f4, float f5, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, r<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> rVar) {
        int i9;
        x.f(rVar, "toSensorRect");
        float f6 = i7;
        float f7 = i3;
        float f8 = i6;
        float f9 = i2;
        float fMin = Math.min(f8 / f9, f6 / f7);
        int i10 = ((int) ((f8 - (f9 * fMin)) / 2.0f)) + i4;
        int iB = a.b(f2 * fMin) + i10;
        int iB2 = a.b(f4 * fMin) + i10;
        int i11 = ((int) ((f6 - (f7 * fMin)) / 2.0f)) + i5;
        int iB3 = a.b(f3 * fMin) + i11;
        int iB4 = a.b(f5 * fMin) + i11;
        if (i8 > 0) {
            int i12 = iB2 - iB;
            int i13 = iB4 - iB3;
            if (i12 < i8) {
                int i14 = i8 - i12;
                int i15 = i14 / 2;
                iB -= i15;
                iB2 += i14 - i15;
            }
            if (i13 < i8) {
                int i16 = i8 - i13;
                int i17 = i16 / 2;
                iB3 -= i17;
                iB4 += i16 - i17;
            }
        }
        if (z) {
            int i18 = iB2 - iB;
            int i19 = iB4 - iB3;
            int i20 = 0;
            if (i18 > i6) {
                i9 = (i6 - i18) / 2;
            } else if (iB < i4) {
                i9 = i4 - iB;
            } else {
                int i21 = i4 + i6;
                i9 = iB2 > i21 ? i21 - iB2 : 0;
            }
            if (i19 > i7) {
                i20 = (i7 - i19) / 2;
            } else if (iB3 < i5) {
                i20 = i5 - iB3;
            } else {
                int i22 = i5 + i7;
                if (iB4 > i22) {
                    i20 = i22 - iB4;
                }
            }
            iB += i9;
            iB2 += i9;
            iB3 += i20;
            iB4 += i20;
        }
        return rVar.invoke(Integer.valueOf(iB), Integer.valueOf(iB3), Integer.valueOf(iB2), Integer.valueOf(iB4));
    }

    public static /* synthetic */ Rect mapStreamRectToSensorRect$default(RectF rectF, Size size, Rect rect, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 32;
        }
        return mapStreamRectToSensorRect(rectF, size, rect, i2, z | (!((i3 & 16) == 0)));
    }

    public static final Rect mapStreamPointToSensorRect(PointF pointF, Size size, Rect rect, int i2) {
        x.f(pointF, "streamPoint");
        x.f(size, "streamSize");
        x.f(rect, "sensorCrop");
        return mapStreamPointToSensorRect$default(pointF, size, rect, i2, false, 0.0f, 48, null);
    }

    public static final Rect mapStreamPointToSensorRect(PointF pointF, Size size, Rect rect, int i2, boolean z) {
        x.f(pointF, "streamPoint");
        x.f(size, "streamSize");
        x.f(rect, "sensorCrop");
        return mapStreamPointToSensorRect$default(pointF, size, rect, i2, z, 0.0f, 32, null);
    }

    public static final Rect mapStreamPointToSensorRect(PointF pointF, Size size, Rect rect) {
        x.f(pointF, "streamPoint");
        x.f(size, "streamSize");
        x.f(rect, "sensorCrop");
        return mapStreamPointToSensorRect$default(pointF, size, rect, 0, false, 0.0f, 56, null);
    }

    public final /* synthetic */ <T> T mapStreamPointToSensorRect(float f2, float f3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, float f4, r<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> rVar) {
        int i9;
        x.f(rVar, "toSensorRect");
        float f5 = i2;
        float f6 = i3;
        float fMin = Math.min(f5, f6) * f4;
        float f7 = i7;
        float f8 = i6;
        float fMin2 = Math.min(f8 / f5, f7 / f6);
        float f9 = fMin / 2.0f;
        int i10 = ((int) ((f8 - (f5 * fMin2)) / 2.0f)) + i4;
        int iB = a.b((f2 - f9) * fMin2) + i10;
        float f10 = fMin - f9;
        int iB2 = a.b((f2 + f10) * fMin2) + i10;
        int i11 = ((int) ((f7 - (f6 * fMin2)) / 2.0f)) + i5;
        int iB3 = a.b((f3 - f9) * fMin2) + i11;
        int iB4 = a.b((f3 + f10) * fMin2) + i11;
        if (i8 > 0) {
            int i12 = iB2 - iB;
            int i13 = iB4 - iB3;
            if (i12 < i8) {
                int i14 = i8 - i12;
                int i15 = i14 / 2;
                iB -= i15;
                iB2 += i14 - i15;
            }
            if (i13 < i8) {
                int i16 = i8 - i13;
                int i17 = i16 / 2;
                iB3 -= i17;
                iB4 += i16 - i17;
            }
        }
        if (z) {
            int i18 = iB2 - iB;
            int i19 = iB4 - iB3;
            int i20 = 0;
            if (i18 > i6) {
                i9 = (i6 - i18) / 2;
            } else if (iB < i4) {
                i9 = i4 - iB;
            } else {
                int i21 = i4 + i6;
                i9 = iB2 > i21 ? i21 - iB2 : 0;
            }
            if (i19 > i7) {
                i20 = (i7 - i19) / 2;
            } else if (iB3 < i5) {
                i20 = i5 - iB3;
            } else {
                int i22 = i5 + i7;
                if (iB4 > i22) {
                    i20 = i22 - iB4;
                }
            }
            iB += i9;
            iB2 += i9;
            iB3 += i20;
            iB4 += i20;
        }
        return rVar.invoke(Integer.valueOf(iB), Integer.valueOf(iB3), Integer.valueOf(iB2), Integer.valueOf(iB4));
    }

    public static /* synthetic */ Rect mapStreamPointToSensorRect$default(PointF pointF, Size size, Rect rect, int i2, boolean z, float f2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 32;
        }
        boolean z2 = z | (!((i3 & 16) == 0));
        if ((i3 & 32) != 0) {
            f2 = 0.18375f;
        }
        return mapStreamPointToSensorRect(pointF, size, rect, i2, z2, f2);
    }

    public static final Point mapUiPointToSensorPoint(Point point, Size size, Size size2, boolean z, int i2, Rect rect) {
        x.f(point, "uiPoint");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        x.f(rect, "sensorCrop");
        return mapUiPointToSensorPoint$default(point, size, size2, z, i2, rect, false, 64, null);
    }

    public static final Rect mapUiPointToSensorRect(Point point, Size size, Size size2, boolean z, int i2, Rect rect, int i3) {
        x.f(point, "uiPoint");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        x.f(rect, "sensorCrop");
        return mapUiPointToSensorRect$default(point, size, size2, z, i2, rect, i3, false, 0.0f, 384, null);
    }

    public static final Rect mapUiPointToSensorRect(Point point, Size size, Size size2, boolean z, int i2, Rect rect, int i3, boolean z2) {
        x.f(point, "uiPoint");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        x.f(rect, "sensorCrop");
        return mapUiPointToSensorRect$default(point, size, size2, z, i2, rect, i3, z2, 0.0f, 256, null);
    }

    public static final Rect mapUiPointToSensorRect(Point point, Size size, Size size2, boolean z, int i2, Rect rect) {
        x.f(point, "uiPoint");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        x.f(rect, "sensorCrop");
        return mapUiPointToSensorRect$default(point, size, size2, z, i2, rect, 0, false, 0.0f, DisplayStrings.DS_ACCIDENT, null);
    }

    public static final Rect mapUiRectToSensorRect(RectF rectF, Size size, Size size2, boolean z, int i2, Rect rect, int i3) {
        x.f(rectF, "uiRect");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        x.f(rect, "sensorCrop");
        return mapUiRectToSensorRect$default(rectF, size, size2, z, i2, rect, i3, false, 128, null);
    }

    public static final Rect mapUiRectToSensorRect(RectF rectF, Size size, Size size2, boolean z, int i2, Rect rect) {
        x.f(rectF, "uiRect");
        x.f(size, "uiSize");
        x.f(size2, "streamSize");
        x.f(rect, "sensorCrop");
        return mapUiRectToSensorRect$default(rectF, size, size2, z, i2, rect, 0, false, 192, null);
    }
}
