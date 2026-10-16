package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.vector.ImageVector;
import h.ab;
import h.g.a.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ImageVectorKt {
    public static final ImageVector.Builder group(ImageVector.Builder builder, String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<? extends PathNode> list, l<? super ImageVector.Builder, ab> lVar) {
        builder.addGroup(str, f2, f3, f4, f5, f6, f7, f8, list);
        lVar.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, l lVar, int i2, Object obj) {
        List emptyPath = (i2 & 256) != 0 ? VectorKt.getEmptyPath() : list;
        int i3 = i2 & 64;
        int i4 = i2 & 32;
        int i5 = i2 & 16;
        int i6 = i2 & 8;
        int i7 = i2 & 4;
        int i8 = i2 & 2;
        int i9 = i2 & 1;
        float f9 = (i2 & 128) != 0 ? 0.0f : f8;
        float f10 = i3 != 0 ? 0.0f : f7;
        float f11 = i4 != 0 ? 1.0f : f6;
        float f12 = i5 == 0 ? f5 : 1.0f;
        float f13 = i6 != 0 ? 0.0f : f4;
        float f14 = i7 != 0 ? 0.0f : f3;
        if (i8 != 0) {
            f2 = 0.0f;
        }
        if (1 == i9) {
            str = "";
        }
        builder.addGroup(str, f2, f14, f13, f12, f11, f10, f9, emptyPath);
        lVar.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    /* renamed from: path-R_LF-3I, reason: not valid java name */
    public static final ImageVector.Builder m8998pathR_LF3I(ImageVector.Builder builder, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i2, int i3, float f5, int i4, l<? super PathBuilder, ab> lVar) {
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), i4, str, brush, f2, brush2, f3, f4, i2, i3, f5, 0.0f, 0.0f, 0.0f, 14336, null);
        return builder;
    }

    /* renamed from: path-R_LF-3I$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m8999pathR_LF3I$default(ImageVector.Builder builder, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i2, int i3, float f5, int i4, l lVar, int i5, Object obj) {
        int defaultStrokeLineCap = (i5 & 64) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2;
        int defaultStrokeLineJoin = (i5 & 128) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3;
        float f6 = (i5 & 256) != 0 ? 4.0f : f5;
        int defaultFillType = (i5 & 512) != 0 ? VectorKt.getDefaultFillType() : i4;
        int i6 = i5 & 16;
        int i7 = i5 & 8;
        int i8 = i5 & 4;
        int i9 = i5 & 2;
        int i10 = i5 & 1;
        float f7 = (i5 & 32) != 0 ? 0.0f : f4;
        float f8 = i6 != 0 ? 1.0f : f3;
        Brush brush3 = i7 != 0 ? null : brush2;
        float f9 = i8 == 0 ? f2 : 1.0f;
        Brush brush4 = i9 != 0 ? null : brush;
        String str2 = 1 == i10 ? "" : str;
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, str2, brush4, f9, brush3, f8, f7, defaultStrokeLineCap, defaultStrokeLineJoin, f6, 0.0f, 0.0f, 0.0f, 14336, null);
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean push(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }
}
