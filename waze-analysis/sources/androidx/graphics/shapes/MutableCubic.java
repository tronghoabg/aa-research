package androidx.graphics.shapes;

import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MutableCubic extends Cubic {
    public MutableCubic() {
        super(null, 1, null);
    }

    private final void transformOnePoint(PointTransformer pointTransformer, int i2) {
        int i3 = i2 + 1;
        long jMo6289transformXgqJiTY = pointTransformer.mo6289transformXgqJiTY(getPoints$graphics_shapes()[i2], getPoints$graphics_shapes()[i3]);
        getPoints$graphics_shapes()[i2] = Float.intBitsToFloat((int) (jMo6289transformXgqJiTY >> 32));
        getPoints$graphics_shapes()[i3] = Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jMo6289transformXgqJiTY));
    }

    public final void interpolate(Cubic cubic, Cubic cubic2, float f2) {
        x.f(cubic, "c1");
        x.f(cubic2, "c2");
        for (int i2 = 0; i2 < 8; i2++) {
            getPoints$graphics_shapes()[i2] = Utils.interpolate(cubic.getPoints$graphics_shapes()[i2], cubic2.getPoints$graphics_shapes()[i2], f2);
        }
    }

    public final void transform(PointTransformer pointTransformer) {
        x.f(pointTransformer, "f");
        transformOnePoint(pointTransformer, 0);
        transformOnePoint(pointTransformer, 2);
        transformOnePoint(pointTransformer, 4);
        transformOnePoint(pointTransformer, 6);
    }
}
