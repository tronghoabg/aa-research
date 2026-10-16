package androidx.compose.material3.internal;

import androidx.collection.FloatFloatPair;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.graphics.shapes.Cubic;
import androidx.graphics.shapes.Morph;
import androidx.graphics.shapes.PointTransformer;
import androidx.graphics.shapes.RoundedPolygon;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ShapeUtilKt {
    private static final void pathFromCubics(Path path, int i2, boolean z, boolean z2, List<? extends Cubic> list, float f2, float f3) {
        path.rewind();
        List<? extends Cubic> list2 = list;
        int size = list2.size();
        int i3 = 0;
        Cubic cubic = null;
        boolean z3 = true;
        while (i3 < size) {
            Cubic cubic2 = list.get(i3);
            if (z3) {
                path.moveTo(cubic2.getAnchor0X(), cubic2.getAnchor0Y());
                if (i2 != 0) {
                    cubic = cubic2;
                }
            }
            path.cubicTo(cubic2.getControl0X(), cubic2.getControl0Y(), cubic2.getControl1X(), cubic2.getControl1Y(), cubic2.getAnchor1X(), cubic2.getAnchor1Y());
            i3++;
            z3 = false;
        }
        if (z) {
            int size2 = list2.size();
            int i4 = 0;
            boolean z4 = true;
            while (i4 < size2) {
                Cubic cubic3 = list.get(i4);
                if (z4) {
                    path.lineTo(cubic3.getAnchor0X(), cubic3.getAnchor0Y());
                }
                path.cubicTo(cubic3.getControl0X(), cubic3.getControl0Y(), cubic3.getControl1X(), cubic3.getControl1Y(), cubic3.getAnchor1X(), cubic3.getAnchor1Y());
                i4++;
                z4 = false;
            }
        }
        if (z2) {
            path.close();
        }
        if (i2 == 0 || cubic == null) {
            return;
        }
        float fAtan2 = (float) Math.atan2(list.get(0).getAnchor0Y() - f3, list.get(0).getAnchor0X() - f2);
        float[] fArrM8492constructorimpl$default = Matrix.m8492constructorimpl$default(null, 1, null);
        Matrix.m8506rotateZimpl(fArrM8492constructorimpl$default, (-radiansToDegrees(fAtan2)) + i2);
        path.mo8119transform58bKbWc(fArrM8492constructorimpl$default);
    }

    private static final float radiansToDegrees(float f2) {
        return (float) ((f2 * 180.0d) / 3.141592653589793d);
    }

    public static final Path toPath(RoundedPolygon roundedPolygon, Path path, int i2, boolean z, boolean z2) {
        pathFromCubics(path, i2, z, z2, roundedPolygon.getCubics(), roundedPolygon.getCenterX(), roundedPolygon.getCenterY());
        return path;
    }

    public static /* synthetic */ Path toPath$default(Morph morph, float f2, Path path, int i2, boolean z, boolean z2, float f3, float f4, int i3, Object obj) {
        Path Path = (i3 & 2) != 0 ? AndroidPath_androidKt.Path() : path;
        int i4 = (i3 & 4) != 0 ? DisplayStrings.DS_TRIP_OVERVIEW_NO_NAME_ORIGIN : i2;
        boolean z3 = ((i3 & 8) == 0) & z;
        Path path2 = Path;
        toPath(morph, f2, path2, i4, z3, (!((i3 & 16) == 0)) | z2, (i3 & 32) != 0 ? 0.0f : f3, (i3 & 64) != 0 ? 0.0f : f4);
        return path2;
    }

    /* renamed from: transformed-EL8BTi8, reason: not valid java name */
    public static final RoundedPolygon m6288transformedEL8BTi8(RoundedPolygon roundedPolygon, final float[] fArr) {
        return roundedPolygon.transformed(new PointTransformer() { // from class: androidx.compose.material3.internal.ShapeUtilKt$transformed$1
            @Override // androidx.graphics.shapes.PointTransformer
            /* renamed from: transform-XgqJiTY, reason: not valid java name */
            public final long mo6289transformXgqJiTY(float f2, float f3) {
                long jM8498mapMKHz9U = Matrix.m8498mapMKHz9U(fArr, (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32));
                return FloatFloatPair.m1675constructorimpl(Float.intBitsToFloat((int) (jM8498mapMKHz9U >> 32)), Float.intBitsToFloat((int) (jM8498mapMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            }
        });
    }

    public static final Path toPath(Morph morph, float f2, Path path, int i2, boolean z, boolean z2, float f3, float f4) {
        pathFromCubics(path, i2, z, z2, morph.asCubics(f2), f3, f4);
        return path;
    }

    public static /* synthetic */ Path toPath$default(RoundedPolygon roundedPolygon, Path path, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        if ((i3 & 2) != 0) {
            i2 = DisplayStrings.DS_TRIP_OVERVIEW_NO_NAME_ORIGIN;
        }
        toPath(roundedPolygon, path, i2, z & ((i3 & 4) == 0), z2 | (!((i3 & 8) == 0)));
        return path;
    }
}
