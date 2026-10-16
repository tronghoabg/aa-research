package androidx.graphics.shapes;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.collection.FloatFloatPair;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Shapes_androidKt {
    private static final void pathFromCubics(Path path, List<? extends Cubic> list) {
        path.rewind();
        int size = list.size();
        boolean z = true;
        int i2 = 0;
        while (i2 < size) {
            Cubic cubic = list.get(i2);
            if (z) {
                path.moveTo(cubic.getAnchor0X(), cubic.getAnchor0Y());
            }
            path.cubicTo(cubic.getControl0X(), cubic.getControl0Y(), cubic.getControl1X(), cubic.getControl1Y(), cubic.getAnchor1X(), cubic.getAnchor1Y());
            i2++;
            z = false;
        }
        path.close();
    }

    public static final Path toPath(Morph morph, float f2, Path path) {
        Path path2 = path;
        Morph morph2 = morph;
        x.f(morph2, "<this>");
        x.f(path2, "path");
        path2.rewind();
        MutableCubic mutableCubic = new MutableCubic();
        int size = morph2.getMorphMatch().size();
        boolean z = true;
        float control0X = 0.0f;
        float control0Y = 0.0f;
        float control1X = 0.0f;
        float control1Y = 0.0f;
        float anchor1X = 0.0f;
        float anchor0X = 0.0f;
        float anchor0Y = 0.0f;
        float anchor1Y = 0.0f;
        int i2 = 0;
        while (i2 < size) {
            mutableCubic.interpolate((Cubic) morph2.getMorphMatch().get(i2).c(), (Cubic) morph2.getMorphMatch().get(i2).d(), f2);
            if (z) {
                path2.moveTo(mutableCubic.getAnchor0X(), mutableCubic.getAnchor0Y());
                anchor0X = mutableCubic.getAnchor0X();
                anchor0Y = mutableCubic.getAnchor0Y();
            } else {
                path2.cubicTo(control0X, control0Y, control1X, control1Y, anchor1X, anchor1Y);
            }
            control0X = mutableCubic.getControl0X();
            control0Y = mutableCubic.getControl0Y();
            control1X = mutableCubic.getControl1X();
            control1Y = mutableCubic.getControl1Y();
            anchor1X = mutableCubic.getAnchor1X();
            anchor1Y = mutableCubic.getAnchor1Y();
            i2++;
            morph2 = morph;
            path2 = path;
            z = false;
        }
        if (!z) {
            path.cubicTo(control0X, control0Y, control1X, control1Y, anchor0X, anchor0Y);
        }
        path.close();
        return path;
    }

    public static /* synthetic */ Path toPath$default(Morph morph, float f2, Path path, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            path = new Path();
        }
        toPath(morph, f2, path);
        return path;
    }

    public static final RoundedPolygon transformed(RoundedPolygon roundedPolygon, final Matrix matrix) {
        x.f(roundedPolygon, "<this>");
        x.f(matrix, "matrix");
        final float[] fArr = new float[2];
        return roundedPolygon.transformed(new PointTransformer() { // from class: androidx.graphics.shapes.Shapes_androidKt.transformed.1
            @Override // androidx.graphics.shapes.PointTransformer
            /* renamed from: transform-XgqJiTY */
            public final long mo6289transformXgqJiTY(float f2, float f3) {
                float[] fArr2 = fArr;
                fArr2[0] = f2;
                fArr2[1] = f3;
                matrix.mapPoints(fArr2);
                float[] fArr3 = fArr;
                return FloatFloatPair.m1675constructorimpl(fArr3[0], fArr3[1]);
            }
        });
    }

    public static /* synthetic */ Path toPath$default(RoundedPolygon roundedPolygon, Path path, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            path = new Path();
        }
        toPath(roundedPolygon, path);
        return path;
    }

    public static final Path toPath(RoundedPolygon roundedPolygon) {
        x.f(roundedPolygon, "<this>");
        return toPath$default(roundedPolygon, null, 1, null);
    }

    public static final Path toPath(RoundedPolygon roundedPolygon, Path path) {
        x.f(roundedPolygon, "<this>");
        x.f(path, "path");
        pathFromCubics(path, roundedPolygon.getCubics());
        return path;
    }
}
