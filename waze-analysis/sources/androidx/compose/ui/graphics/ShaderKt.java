package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ShaderKt {
    /* renamed from: CompositeShader-7EN7VTw, reason: not valid java name */
    public static final Shader m8589CompositeShader7EN7VTw(Shader shader, Shader shader2, int i2) {
        return AndroidShader_androidKt.m8125ActualCompositeShader7EN7VTw(shader, shader2, i2);
    }

    /* renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m8590ImageShaderF49vj9s(ImageBitmap imageBitmap, int i2, int i3) {
        return AndroidShader_androidKt.m8126ActualImageShaderF49vj9s(imageBitmap, i2, i3);
    }

    /* renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m8591ImageShaderF49vj9s$default(ImageBitmap imageBitmap, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = TileMode.Companion.m8653getClamp3opZhB0();
        }
        if ((i4 & 4) != 0) {
            i3 = TileMode.Companion.m8653getClamp3opZhB0();
        }
        return m8590ImageShaderF49vj9s(imageBitmap, i2, i3);
    }

    /* renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m8592LinearGradientShaderVjE6UOU(long j2, long j3, List<Color> list, List<Float> list2, int i2) {
        return AndroidShader_androidKt.m8127ActualLinearGradientShaderVjE6UOU(j2, j3, list, list2, i2);
    }

    /* renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m8593LinearGradientShaderVjE6UOU$default(long j2, long j3, List list, List list2, int i2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = TileMode.Companion.m8653getClamp3opZhB0();
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            list2 = null;
        }
        return m8592LinearGradientShaderVjE6UOU(j2, j3, list, list2, i4);
    }

    /* renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m8594RadialGradientShader8uybcMk(long j2, float f2, List<Color> list, List<Float> list2, int i2) {
        return AndroidShader_androidKt.m8128ActualRadialGradientShader8uybcMk(j2, f2, list, list2, i2);
    }

    /* renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m8595RadialGradientShader8uybcMk$default(long j2, float f2, List list, List list2, int i2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = TileMode.Companion.m8653getClamp3opZhB0();
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            list2 = null;
        }
        return m8594RadialGradientShader8uybcMk(j2, f2, list, list2, i4);
    }

    /* renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m8596SweepGradientShader9KIMszo(long j2, List<Color> list, List<Float> list2) {
        return AndroidShader_androidKt.m8129ActualSweepGradientShader9KIMszo(j2, list, list2);
    }

    /* renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m8597SweepGradientShader9KIMszo$default(long j2, List list, List list2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list2 = null;
        }
        return m8596SweepGradientShader9KIMszo(j2, list, list2);
    }
}
