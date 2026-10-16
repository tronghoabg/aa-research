package androidx.compose.material.icons.twotone;

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
public final class ShoppingCartKt {
    private static ImageVector _shoppingCart;

    public static final ImageVector getShoppingCart(Icons.TwoTone twoTone) {
        ImageVector imageVector = _shoppingCart;
        if (imageVector != null) {
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ShoppingCart", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
        int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
        int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.55f, 11.0f);
        pathBuilder.lineToRelative(2.76f, -5.0f);
        pathBuilder.horizontalLineTo(6.16f);
        pathBuilder.lineToRelative(2.37f, 5.0f);
        pathBuilder.close();
        ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
        int iM8632getButtKaPHkGw2 = StrokeCap.Companion.m8632getButtKaPHkGw();
        int iM8642getBevelLxFBmk82 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.55f, 13.0f);
        pathBuilder2.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        pathBuilder2.lineToRelative(3.58f, -6.49f);
        pathBuilder2.curveToRelative(0.37f, -0.66f, -0.11f, -1.48f, -0.87f, -1.48f);
        pathBuilder2.lineTo(5.21f, 4.0f);
        pathBuilder2.lineToRelative(-0.94f, -2.0f);
        pathBuilder2.lineTo(1.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(3.6f, 7.59f);
        pathBuilder2.lineToRelative(-1.35f, 2.44f);
        pathBuilder2.curveTo(4.52f, 15.37f, 5.48f, 17.0f, 7.0f, 17.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.lineTo(7.0f, 15.0f);
        pathBuilder2.lineToRelative(1.1f, -2.0f);
        pathBuilder2.horizontalLineToRelative(7.45f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.16f, 6.0f);
        pathBuilder2.horizontalLineToRelative(12.15f);
        pathBuilder2.lineToRelative(-2.76f, 5.0f);
        pathBuilder2.lineTo(8.53f, 11.0f);
        pathBuilder2.lineTo(6.16f, 6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.0f, 18.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder2.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 18.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM8632getButtKaPHkGw2, iM8642getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector imageVectorBuild = builder.build();
        _shoppingCart = imageVectorBuild;
        x.c(imageVectorBuild);
        return imageVectorBuild;
    }
}
