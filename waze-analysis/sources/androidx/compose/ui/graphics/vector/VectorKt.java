package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import h.a.i;
import h.ab;
import h.g.a.l;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorKt {
    public static final String DefaultGroupName = "";
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;
    private static final List<PathNode> EmptyPath = i.h();
    private static final int DefaultStrokeLineCap = StrokeCap.Companion.m8632getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.Companion.m8643getMiterLxFBmk8();
    private static final int DefaultTintBlendMode = BlendMode.Companion.m8166getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.Companion.m8263getTransparent0d7_KjU();
    private static final int DefaultFillType = PathFillType.Companion.m8555getNonZeroRgk1Os();

    public static final List<PathNode> PathData(l<? super PathBuilder, ab> lVar) {
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    public static final List<PathNode> addPathNodes(String str) {
        if (str == null) {
            return EmptyPath;
        }
        PathParser pathParser = new PathParser();
        pathParser.parsePathString(str);
        return pathParser.toNodes();
    }

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultTintBlendMode() {
        return DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return DefaultTintColor;
    }

    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }

    /* renamed from: rgbEqual--OWjLjI, reason: not valid java name */
    public static final boolean m9013rgbEqualOWjLjI(long j2, long j3) {
        return Color.m8234getRedimpl(j2) == Color.m8234getRedimpl(j3) && Color.m8233getGreenimpl(j2) == Color.m8233getGreenimpl(j3) && Color.m8231getBlueimpl(j2) == Color.m8231getBlueimpl(j3);
    }

    public static final boolean tintableWithAlphaMask(ColorFilter colorFilter) {
        if (!(colorFilter instanceof BlendModeColorFilter)) {
            return colorFilter == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
        return BlendMode.m8137equalsimpl0(blendModeColorFilter.m8170getBlendMode0nO6VwU(), BlendMode.Companion.m8166getSrcIn0nO6VwU()) || BlendMode.m8137equalsimpl0(blendModeColorFilter.m8170getBlendMode0nO6VwU(), BlendMode.Companion.m8168getSrcOver0nO6VwU());
    }

    /* renamed from: toOpaque-8_81llA, reason: not valid java name */
    public static final long m9014toOpaque8_81llA(long j2) {
        return Color.m8230getAlphaimpl(j2) == 1.0f ? j2 : Color.m8227copywmQWz5c$default(j2, 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
