package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SweepGradient extends ShaderBrush implements Interpolatable {
    public static final int $stable = 0;
    private final long center;
    private final List<Color> colors;
    private final List<Float> stops;

    public /* synthetic */ SweepGradient(long j2, List list, List list2, int i2, o oVar) {
        this(j2, list, (i2 & 4) != 0 ? null : list2, null);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo8197createShaderuvyYCjk(long j2) {
        long jFloatToRawIntBits;
        long j3 = this.center;
        if ((9223372034707292159L & j3) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            jFloatToRawIntBits = SizeKt.m8059getCenteruvyYCjk(j2);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j3 >> 32)) == Float.POSITIVE_INFINITY ? j2 >> 32 : this.center >> 32));
            if (Float.intBitsToFloat((int) (this.center & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) != Float.POSITIVE_INFINITY) {
                j2 = this.center;
            }
            jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        return ShaderKt.m8596SweepGradientShader9KIMszo(jFloatToRawIntBits, this.colors, this.stops);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        return Offset.m7977equalsimpl0(this.center, sweepGradient.center) && x.n(this.colors, sweepGradient.colors) && x.n(this.stops, sweepGradient.stops);
    }

    /* renamed from: getCenter-F1C5BW0$ui_graphics, reason: not valid java name */
    public final long m8645getCenterF1C5BW0$ui_graphics() {
        return this.center;
    }

    public final List<Color> getColors$ui_graphics() {
        return this.colors;
    }

    public final List<Float> getStops$ui_graphics() {
        return this.stops;
    }

    public int hashCode() {
        int iM7982hashCodeimpl = (Offset.m7982hashCodeimpl(this.center) * 31) + this.colors.hashCode();
        List<Float> list = this.stops;
        return (iM7982hashCodeimpl * 31) + (list != null ? list.hashCode() : 0);
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f2) {
        o oVar = null;
        if (obj == null) {
            obj = new SolidColor(Color.Companion.m8263getTransparent0d7_KjU(), oVar);
        }
        if (obj instanceof SolidColor) {
            long j2 = this.center;
            List<Color> list = this.colors;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).m8238unboximpl();
                arrayList.add(Color.m8218boximpl(((SolidColor) obj).m8614getValue0d7_KjU()));
            }
            obj = new SweepGradient(j2, arrayList, this.stops, null);
        }
        if (!(obj instanceof SweepGradient)) {
            return null;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        return new SweepGradient(OffsetKt.m8003lerpWko1d7g(this.center, sweepGradient.center, f2), BrushKt.lerpColorList(this.colors, sweepGradient.colors, f2), BrushKt.lerpNullableFloatList(this.stops, sweepGradient.stops, f2), null);
    }

    public String toString() {
        String str;
        if ((this.center & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            str = "center=" + ((Object) Offset.m7988toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }

    private SweepGradient(long j2, List<Color> list, List<Float> list2) {
        this.center = j2;
        this.colors = list;
        this.stops = list2;
    }

    public /* synthetic */ SweepGradient(long j2, List list, List list2, o oVar) {
        this(j2, list, list2);
    }
}
