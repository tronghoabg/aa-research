package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.util.MathHelpersKt;
import h.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BrushKt {
    public static final ShaderBrush ShaderBrush(final Shader shader) {
        return new ShaderBrush() { // from class: androidx.compose.ui.graphics.BrushKt.ShaderBrush.1
            @Override // androidx.compose.ui.graphics.ShaderBrush
            /* renamed from: createShader-uvyYCjk, reason: not valid java name */
            public Shader mo8197createShaderuvyYCjk(long j2) {
                return shader;
            }
        };
    }

    public static final List<Color> lerpColorList(List<Color> list, List<Color> list2, float f2) {
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i2 = 0; i2 < iMax; i2++) {
            arrayList.add(Color.m8218boximpl(ColorKt.m8279lerpjxsXWHM(list.get(Math.min(i2, list.size() - 1)).m8238unboximpl(), list2.get(Math.min(i2, list2.size() - 1)).m8238unboximpl(), f2)));
        }
        return arrayList;
    }

    public static final List<Float> lerpFloatList(List<Float> list, List<Float> list2, float f2) {
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i2 = 0; i2 < iMax; i2++) {
            arrayList.add(Float.valueOf(MathHelpersKt.lerp(list.get(Math.min(i2, list.size() - 1)).floatValue(), list2.get(Math.min(i2, list2.size() - 1)).floatValue(), f2)));
        }
        return arrayList;
    }

    public static final List<Float> lerpNullableFloatList(List<Float> list, List<Float> list2, float f2) {
        if (list2 == null || list == null) {
            return null;
        }
        return lerpFloatList(list, list2, f2);
    }

    /* renamed from: lerpSafe-Wko1d7g, reason: not valid java name */
    public static final long m8196lerpSafeWko1d7g(long j2, long j3, float f2) {
        return (((((j2 & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) + (-4294967297L)) & (-9223372034707292160L)) == 0 && (((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (j3 & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) + (-4294967297L)) & (-9223372034707292160L)) == 0) ? OffsetKt.m8003lerpWko1d7g(j2, j3, f2) : f2 >= 0.5f ? j3 : j2;
    }

    public static final ShaderBrush toShaderBrush(Brush brush) {
        if (brush instanceof ShaderBrush) {
            return (ShaderBrush) brush;
        }
        if (!(brush instanceof SolidColor)) {
            throw new i();
        }
        SolidColor solidColor = (SolidColor) brush;
        return (ShaderBrush) Brush.Companion.m8183verticalGradient8A3gB4$default(Brush.Companion, h.a.i.i(Color.m8218boximpl(solidColor.m8614getValue0d7_KjU()), Color.m8218boximpl(solidColor.m8614getValue0d7_KjU())), 0.0f, 0.0f, 0, 14, (Object) null);
    }
}
