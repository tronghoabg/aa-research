package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import h.g.b.ar;
import h.g.b.m;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidPaint_androidKt {

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final Paint asComposePaint(android.graphics.Paint paint) {
        return new AndroidPaint(paint);
    }

    public static final float getNativeAlpha(android.graphics.Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(android.graphics.Paint paint) {
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(android.graphics.Paint paint) {
        return WrapperVerificationHelperMethods.INSTANCE.m8684getColorvNxB06k(paint);
    }

    public static final int getNativeFilterQuality(android.graphics.Paint paint) {
        return !paint.isFilterBitmap() ? FilterQuality.Companion.m8330getNonefv9h1I() : FilterQuality.Companion.m8328getLowfv9h1I();
    }

    public static final android.graphics.Paint getNativePaint(Paint paint) {
        if (!(paint instanceof AndroidPaint)) {
            Class<?> cls = paint.getClass();
            int i2 = ar.f48106a;
            InlineClassHelperKt.throwIllegalArgumentException("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received ".concat(String.valueOf(new m(cls).b())));
        }
        return ((AndroidPaint) paint).getInternalPaint$ui_graphics();
    }

    public static final int getNativeStrokeCap(android.graphics.Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
            if (i2 == 1) {
                return StrokeCap.Companion.m8632getButtKaPHkGw();
            }
            if (i2 == 2) {
                return StrokeCap.Companion.m8633getRoundKaPHkGw();
            }
            if (i2 == 3) {
                return StrokeCap.Companion.m8634getSquareKaPHkGw();
            }
        }
        return StrokeCap.Companion.m8632getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(android.graphics.Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
            if (i2 == 1) {
                return StrokeJoin.Companion.m8643getMiterLxFBmk8();
            }
            if (i2 == 2) {
                return StrokeJoin.Companion.m8642getBevelLxFBmk8();
            }
            if (i2 == 3) {
                return StrokeJoin.Companion.m8644getRoundLxFBmk8();
            }
        }
        return StrokeJoin.Companion.m8643getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(android.graphics.Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(android.graphics.Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(android.graphics.Paint paint) {
        Paint.Style style = paint.getStyle();
        return (style != null && WhenMappings.$EnumSwitchMapping$0[style.ordinal()] == 1) ? PaintingStyle.Companion.m8539getStrokeTiuSbCo() : PaintingStyle.Companion.m8538getFillTiuSbCo();
    }

    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    public static final void setNativeAlpha(android.graphics.Paint paint, float f2) {
        paint.setAlpha((int) Math.rint(f2 * 255.0f));
    }

    public static final void setNativeAntiAlias(android.graphics.Paint paint, boolean z) {
        paint.setAntiAlias(z);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m8109setNativeBlendModeGB0RdKg(android.graphics.Paint paint, int i2) {
        WrapperVerificationHelperMethods.INSTANCE.m8685setBlendModeGB0RdKg(paint, i2);
    }

    /* renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m8110setNativeColor4WTKRHQ(android.graphics.Paint paint, long j2) {
        WrapperVerificationHelperMethods.INSTANCE.m8686setColor4WTKRHQ(paint, j2);
    }

    public static final void setNativeColorFilter(android.graphics.Paint paint, ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    /* renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m8111setNativeFilterQuality50PEsBU(android.graphics.Paint paint, int i2) {
        paint.setFilterBitmap(!FilterQuality.m8323equalsimpl0(i2, FilterQuality.Companion.m8330getNonefv9h1I()));
    }

    public static final void setNativePathEffect(android.graphics.Paint paint, PathEffect pathEffect) {
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }

    public static final void setNativeShader(android.graphics.Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m8112setNativeStrokeCapCSYIeUk(android.graphics.Paint paint, int i2) {
        Paint.Cap cap;
        if (StrokeCap.m8628equalsimpl0(i2, StrokeCap.Companion.m8634getSquareKaPHkGw())) {
            cap = Paint.Cap.SQUARE;
        } else if (StrokeCap.m8628equalsimpl0(i2, StrokeCap.Companion.m8633getRoundKaPHkGw())) {
            cap = Paint.Cap.ROUND;
        } else {
            StrokeCap.m8628equalsimpl0(i2, StrokeCap.Companion.m8632getButtKaPHkGw());
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m8113setNativeStrokeJoinkLtJ_vA(android.graphics.Paint paint, int i2) {
        paint.setStrokeJoin(StrokeJoin.m8638equalsimpl0(i2, StrokeJoin.Companion.m8643getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m8638equalsimpl0(i2, StrokeJoin.Companion.m8642getBevelLxFBmk8()) ? Paint.Join.BEVEL : StrokeJoin.m8638equalsimpl0(i2, StrokeJoin.Companion.m8644getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void setNativeStrokeMiterLimit(android.graphics.Paint paint, float f2) {
        paint.setStrokeMiter(f2);
    }

    public static final void setNativeStrokeWidth(android.graphics.Paint paint, float f2) {
        paint.setStrokeWidth(f2);
    }

    /* renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m8114setNativeStyle5YerkU(android.graphics.Paint paint, int i2) {
        paint.setStyle(PaintingStyle.m8534equalsimpl0(i2, PaintingStyle.Companion.m8539getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public static /* synthetic */ void NativePaint$annotations() {
    }
}
