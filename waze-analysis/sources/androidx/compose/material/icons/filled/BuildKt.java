package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BuildKt {
    private static ImageVector _build;

    public static final ImageVector getBuild(Icons.Filled filled) {
        ImageVector imageVector = _build;
        if (imageVector != null) {
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Build", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
        int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
        int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.7f, 19.0f);
        pathBuilder.lineToRelative(-9.1f, -9.1f);
        pathBuilder.curveToRelative(0.9f, -2.3f, 0.4f, -5.0f, -1.5f, -6.9f);
        pathBuilder.curveToRelative(-2.0f, -2.0f, -5.0f, -2.4f, -7.4f, -1.3f);
        pathBuilder.lineTo(9.0f, 6.0f);
        pathBuilder.lineTo(6.0f, 9.0f);
        pathBuilder.lineTo(1.6f, 4.7f);
        pathBuilder.curveTo(0.4f, 7.1f, 0.9f, 10.1f, 2.9f, 12.1f);
        pathBuilder.curveToRelative(1.9f, 1.9f, 4.6f, 2.4f, 6.9f, 1.5f);
        pathBuilder.lineToRelative(9.1f, 9.1f);
        pathBuilder.curveToRelative(0.4f, 0.4f, 1.0f, 0.4f, 1.4f, 0.0f);
        pathBuilder.lineToRelative(2.3f, -2.3f);
        pathBuilder.curveToRelative(0.5f, -0.4f, 0.5f, -1.1f, 0.1f, -1.4f);
        pathBuilder.close();
        ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector imageVectorBuild = builder.build();
        _build = imageVectorBuild;
        x.c(imageVectorBuild);
        return imageVectorBuild;
    }
}
