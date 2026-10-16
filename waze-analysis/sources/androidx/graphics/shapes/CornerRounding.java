package androidx.graphics.shapes;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CornerRounding {
    public static final Companion Companion;
    public static final CornerRounding Unrounded;
    private final float radius;
    private final float smoothing;

    static {
        o oVar = null;
        Companion = new Companion(oVar);
        float f2 = 0.0f;
        Unrounded = new CornerRounding(f2, f2, 3, oVar);
    }

    public /* synthetic */ CornerRounding(float f2, float f3, int i2, o oVar) {
        this(1 == (i2 & 1) ? 0.0f : f2, (i2 & 2) != 0 ? 0.0f : f3);
    }

    public final float getRadius() {
        return this.radius;
    }

    public final float getSmoothing() {
        return this.smoothing;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public CornerRounding(float f2, float f3) {
        this.radius = f2;
        this.smoothing = f3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CornerRounding() {
        float f2 = 0.0f;
        this(f2, f2, 3, null);
    }
}
