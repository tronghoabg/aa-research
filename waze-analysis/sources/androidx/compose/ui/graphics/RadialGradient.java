package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RadialGradient extends ShaderBrush implements Interpolatable {
    public static final int $stable = 0;
    private final long center;
    private final List<Color> colors;
    private final float radius;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j2, float f2, int i2, int i3, o oVar) {
        this(list, (i3 & 2) != 0 ? null : list2, j2, f2, (i3 & 16) != 0 ? TileMode.Companion.m8653getClamp3opZhB0() : i2, null);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo8197createShaderuvyYCjk(long j2) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j3 = this.center;
        if ((9223372034707292159L & j3) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            long jM8059getCenteruvyYCjk = SizeKt.m8059getCenteruvyYCjk(j2);
            long j4 = jM8059getCenteruvyYCjk >> 32;
            int i2 = (int) (jM8059getCenteruvyYCjk & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            fIntBitsToFloat = Float.intBitsToFloat((int) j4);
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j3 >> 32)) == Float.POSITIVE_INFINITY ? j2 >> 32 : this.center >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.center & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) == Float.POSITIVE_INFINITY ? j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE : this.center & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
        long j5 = jFloatToRawIntBits << 32;
        long j6 = MuxerUtil.UNSIGNED_INT_MAX_VALUE & jFloatToRawIntBits2;
        float fM8048getMinDimensionimpl = this.radius;
        if (fM8048getMinDimensionimpl == Float.POSITIVE_INFINITY) {
            fM8048getMinDimensionimpl = Size.m8048getMinDimensionimpl(j2) / 2.0f;
        }
        return ShaderKt.m8594RadialGradientShader8uybcMk(j5 | j6, fM8048getMinDimensionimpl, list, list2, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        return x.n(this.colors, radialGradient.colors) && x.n(this.stops, radialGradient.stops) && Offset.m7977equalsimpl0(this.center, radialGradient.center) && this.radius == radialGradient.radius && TileMode.m8649equalsimpl0(this.tileMode, radialGradient.tileMode);
    }

    /* renamed from: getCenter-F1C5BW0$ui_graphics, reason: not valid java name */
    public final long m8580getCenterF1C5BW0$ui_graphics() {
        return this.center;
    }

    public final List<Color> getColors$ui_graphics() {
        return this.colors;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo8174getIntrinsicSizeNHjbRc() {
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) >= 2139095040) {
            return Size.Companion.m8057getUnspecifiedNHjbRc();
        }
        float f2 = this.radius;
        float f3 = f2 + f2;
        return (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public final float getRadius$ui_graphics() {
        return this.radius;
    }

    public final List<Float> getStops$ui_graphics() {
        return this.stops;
    }

    /* renamed from: getTileMode-3opZhB0$ui_graphics, reason: not valid java name */
    public final int m8581getTileMode3opZhB0$ui_graphics() {
        return this.tileMode;
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m7982hashCodeimpl(this.center)) * 31) + Float.floatToIntBits(this.radius)) * 31) + this.tileMode;
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f2) {
        o oVar = null;
        if (obj == null) {
            obj = new SolidColor(Color.Companion.m8263getTransparent0d7_KjU(), oVar);
        }
        if (obj instanceof SolidColor) {
            List<Color> list = this.colors;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).m8238unboximpl();
                arrayList.add(Color.m8218boximpl(((SolidColor) obj).m8614getValue0d7_KjU()));
            }
            obj = new RadialGradient(arrayList, this.stops, this.center, this.radius, this.tileMode, null);
        }
        if (!(obj instanceof RadialGradient)) {
            return null;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        return new RadialGradient(BrushKt.lerpColorList(this.colors, radialGradient.colors, f2), BrushKt.lerpNullableFloatList(this.stops, radialGradient.stops, f2), OffsetKt.m8003lerpWko1d7g(this.center, radialGradient.center, f2), MathHelpersKt.lerp(this.radius, radialGradient.radius, f2), f2 < 0.5f ? this.tileMode : radialGradient.tileMode, null);
    }

    public String toString() {
        String str;
        String str2 = "";
        if ((this.center & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            str = "center=" + ((Object) Offset.m7988toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m8651toStringimpl(this.tileMode)) + ')';
    }

    private RadialGradient(List<Color> list, List<Float> list2, long j2, float f2, int i2) {
        this.colors = list;
        this.stops = list2;
        this.center = j2;
        this.radius = f2;
        this.tileMode = i2;
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j2, float f2, int i2, o oVar) {
        this(list, list2, j2, f2, i2);
    }
}
