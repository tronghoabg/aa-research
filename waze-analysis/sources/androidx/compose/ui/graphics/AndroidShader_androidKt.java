package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.ComposeShader;
import android.graphics.Shader;
import h.a.i;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidShader_androidKt {
    /* renamed from: ActualCompositeShader-7EN7VTw, reason: not valid java name */
    public static final Shader m8125ActualCompositeShader7EN7VTw(Shader shader, Shader shader2, int i2) {
        return new ComposeShader(shader, shader2, AndroidBlendMode_androidKt.m8072toAndroidBlendModes9anfk8(i2));
    }

    /* renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m8126ActualImageShaderF49vj9s(ImageBitmap imageBitmap, int i2, int i3) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m8131toAndroidTileMode0vamqd0(i2), AndroidTileMode_androidKt.m8131toAndroidTileMode0vamqd0(i3));
    }

    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m8127ActualLinearGradientShaderVjE6UOU(long j2, long j3, List<Color> list, List<Float> list2, int i2) {
        validateColorStops(list, list2);
        return GradientColorLongVerifier.INSTANCE.m8376createLinearGradientColorLongVjE6UOU(j2, j3, toPlatformLongArray(list), list2 != null ? i.az(list2) : null, i2);
    }

    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m8128ActualRadialGradientShader8uybcMk(long j2, float f2, List<Color> list, List<Float> list2, int i2) {
        validateColorStops(list, list2);
        return GradientColorLongVerifier.INSTANCE.m8377createRadialGradientColorLong8uybcMk(j2, f2, toPlatformLongArray(list), list2 != null ? i.az(list2) : null, i2);
    }

    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m8129ActualSweepGradientShader9KIMszo(long j2, List<Color> list, List<Float> list2) {
        validateColorStops(list, list2);
        return GradientColorLongVerifier.INSTANCE.m8378createSweepGradientColorLong9KIMszo(j2, toPlatformLongArray(list), list2 != null ? i.az(list2) : null);
    }

    public static final int countTransparentColors(List<Color> list) {
        return 0;
    }

    public static final int[] makeTransparentColors(List<Color> list, int i2) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ColorKt.m8282toArgb8_81llA(list.get(i3).m8238unboximpl());
        }
        return iArr;
    }

    public static final float[] makeTransparentStops(List<Float> list, List<Color> list2, int i2) {
        float fFloatValue;
        float fFloatValue2;
        float size;
        if (i2 == 0) {
            if (list != null) {
                return i.az(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i2];
        if (list != null) {
            fFloatValue = list.get(0).floatValue();
        } else {
            list = null;
            fFloatValue = 0.0f;
        }
        fArr[0] = fFloatValue;
        x.f(list2, "<this>");
        int size2 = list2.size() - 1;
        int i3 = 1;
        for (int i4 = 1; i4 < size2; i4++) {
            long jM8238unboximpl = list2.get(i4).m8238unboximpl();
            if (list != null) {
                size = list.get(i4).floatValue();
            } else {
                x.f(list2, "<this>");
                size = i4 / (list2.size() - 1);
            }
            int i5 = i3 + 1;
            fArr[i3] = size;
            if (Color.m8230getAlphaimpl(jM8238unboximpl) == 0.0f) {
                i3 += 2;
                fArr[i5] = size;
            } else {
                i3 = i5;
            }
        }
        if (list != null) {
            x.f(list2, "<this>");
            fFloatValue2 = list.get(list2.size() - 1).floatValue();
        } else {
            fFloatValue2 = 1.0f;
        }
        fArr[i3] = fFloatValue2;
        return fArr;
    }

    private static final long[] toPlatformLongArray(List<Color> list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = AndroidColor_androidKt.m8091toSupportedColorLong8_81llA(list.get(i2).m8238unboximpl());
        }
        return jArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static /* synthetic */ void Shader$annotations() {
    }
}
