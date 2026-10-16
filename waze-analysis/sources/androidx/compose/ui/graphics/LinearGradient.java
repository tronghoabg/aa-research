package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LinearGradient extends ShaderBrush implements Interpolatable {
    public static final int $stable = 0;
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j2, long j3, int i2, int i3, o oVar) {
        this(list, (i3 & 2) != 0 ? null : list2, j2, j3, (i3 & 16) != 0 ? TileMode.Companion.m8653getClamp3opZhB0() : i2, null);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo8197createShaderuvyYCjk(long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start >> 32)) == Float.POSITIVE_INFINITY ? j2 >> 32 : this.start >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) == Float.POSITIVE_INFINITY ? j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE : this.start & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end >> 32)) == Float.POSITIVE_INFINITY ? j2 >> 32 : this.end >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) == Float.POSITIVE_INFINITY ? j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE : this.end & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return ShaderKt.m8592LinearGradientShaderVjE6UOU((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        return x.n(this.colors, linearGradient.colors) && x.n(this.stops, linearGradient.stops) && Offset.m7977equalsimpl0(this.start, linearGradient.start) && Offset.m7977equalsimpl0(this.end, linearGradient.end) && TileMode.m8649equalsimpl0(this.tileMode, linearGradient.tileMode);
    }

    public final List<Color> getColors$ui_graphics() {
        return this.colors;
    }

    /* renamed from: getEnd-F1C5BW0$ui_graphics, reason: not valid java name */
    public final long m8487getEndF1C5BW0$ui_graphics() {
        return this.end;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo8174getIntrinsicSizeNHjbRc() {
        float fAbs;
        float fAbs2 = Float.NaN;
        if (Math.abs(Float.intBitsToFloat((int) (this.start >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (this.end >> 32))) > Float.MAX_VALUE) {
            fAbs = Float.NaN;
        } else {
            fAbs = Math.abs(Float.intBitsToFloat((int) (this.start >> 32)) - Float.intBitsToFloat((int) (this.end >> 32)));
        }
        if (Math.abs(Float.intBitsToFloat((int) (this.start & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (this.end & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) <= Float.MAX_VALUE) {
            fAbs2 = Math.abs(Float.intBitsToFloat((int) (this.start & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - Float.intBitsToFloat((int) (this.end & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        }
        return (Float.floatToRawIntBits(fAbs) << 32) | (Float.floatToRawIntBits(fAbs2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getStart-F1C5BW0$ui_graphics, reason: not valid java name */
    public final long m8488getStartF1C5BW0$ui_graphics() {
        return this.start;
    }

    public final List<Float> getStops$ui_graphics() {
        return this.stops;
    }

    /* renamed from: getTileMode-3opZhB0$ui_graphics, reason: not valid java name */
    public final int m8489getTileMode3opZhB0$ui_graphics() {
        return this.tileMode;
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m7982hashCodeimpl(this.start)) * 31) + Offset.m7982hashCodeimpl(this.end)) * 31) + this.tileMode;
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f2) {
        Object solidColor = obj == null ? new SolidColor(Color.Companion.m8263getTransparent0d7_KjU(), null) : obj;
        if (solidColor instanceof SolidColor) {
            List<Color> list = this.colors;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).m8238unboximpl();
                arrayList.add(Color.m8218boximpl(((SolidColor) solidColor).m8614getValue0d7_KjU()));
            }
            solidColor = new LinearGradient(arrayList, this.stops, this.start, this.end, this.tileMode, null);
        }
        if (!(solidColor instanceof LinearGradient)) {
            return null;
        }
        LinearGradient linearGradient = (LinearGradient) solidColor;
        return new LinearGradient(BrushKt.lerpColorList(this.colors, linearGradient.colors, f2), BrushKt.lerpNullableFloatList(this.stops, linearGradient.stops, f2), BrushKt.m8196lerpSafeWko1d7g(this.start, linearGradient.start, f2), BrushKt.m8196lerpSafeWko1d7g(this.end, linearGradient.end, f2), f2 < 0.5f ? this.tileMode : linearGradient.tileMode, null);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (((((this.start & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) Offset.m7988toStringimpl(this.start)) + ", ";
        } else {
            str = "";
        }
        if ((((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (this.end & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) Offset.m7988toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m8651toStringimpl(this.tileMode)) + ')';
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j2, long j3, int i2) {
        this.colors = list;
        this.stops = list2;
        this.start = j2;
        this.end = j3;
        this.tileMode = i2;
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j2, long j3, int i2, o oVar) {
        this(list, list2, j2, j3, i2);
    }
}
