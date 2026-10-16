package androidx.compose.material.icons;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class IconsKt {
    public static final float MaterialIconDimension = 24.0f;

    /* renamed from: materialPath-YwgOQQI, reason: not valid java name */
    public static final ImageVector.Builder m4281materialPathYwgOQQI(ImageVector.Builder builder, float f2, float f3, int i2, l<? super PathBuilder, ab> lVar) {
        SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
        int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
        int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), i2, "", solidColor, f2, null, f3, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        return builder;
    }

    /* renamed from: materialPath-YwgOQQI$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m4282materialPathYwgOQQI$default(ImageVector.Builder builder, float f2, float f3, int i2, l lVar, int i3, Object obj) {
        int defaultFillType = (i3 & 4) != 0 ? VectorKt.getDefaultFillType() : i2;
        int i4 = i3 & 1;
        float f4 = (i3 & 2) != 0 ? 1.0f : f3;
        float f5 = 1 == i4 ? 1.0f : f2;
        SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
        int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
        int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, f5, null, f4, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        return builder;
    }

    public static /* synthetic */ void getMaterialIconDimension$annotations() {
    }

    public static final ImageVector materialIcon(String str, boolean z, l<? super ImageVector.Builder, ImageVector.Builder> lVar) {
        return lVar.invoke(new ImageVector.Builder(str, 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, z, 96, null)).build();
    }
}
