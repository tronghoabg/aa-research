package androidx.constraintlayout.compose;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SwipeMode {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final SwipeMode Spring;
    private static final SwipeMode Velocity;
    private final float maxAcceleration;
    private final float maxVelocity;
    private final String name;
    private final SpringBoundary springBoundary;
    private final float springDamping;
    private final float springMass;
    private final float springStiffness;
    private final float springThreshold;

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        Velocity = Companion.velocity$default(companion, 0.0f, 0.0f, 3, null);
        Spring = Companion.spring$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, null, 31, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SwipeMode(String str, float f2, float f3, float f4, float f5, SpringBoundary springBoundary, float f6, float f7, int i2, o oVar) {
        SpringBoundary overshoot = (i2 & 32) != 0 ? SpringBoundary.Companion.getOvershoot() : springBoundary;
        int i3 = i2 & 8;
        int i4 = i2 & 4;
        int i5 = i2 & 2;
        float f8 = (i2 & 16) != 0 ? 0.01f : f5;
        float f9 = i3 != 0 ? 10.0f : f4;
        float f10 = i4 != 0 ? 400.0f : f3;
        float f11 = i5 != 0 ? 1.0f : f2;
        float f12 = f10;
        float f13 = f11;
        this(str, f13, f12, f9, f8, overshoot, (i2 & 64) != 0 ? 4.0f : f6, (i2 & 128) != 0 ? 1.2f : f7);
    }

    public final float getMaxAcceleration$constraintlayout_compose() {
        return this.maxAcceleration;
    }

    public final float getMaxVelocity$constraintlayout_compose() {
        return this.maxVelocity;
    }

    public final String getName() {
        return this.name;
    }

    public final SpringBoundary getSpringBoundary$constraintlayout_compose() {
        return this.springBoundary;
    }

    public final float getSpringDamping$constraintlayout_compose() {
        return this.springDamping;
    }

    public final float getSpringMass$constraintlayout_compose() {
        return this.springMass;
    }

    public final float getSpringStiffness$constraintlayout_compose() {
        return this.springStiffness;
    }

    public final float getSpringThreshold$constraintlayout_compose() {
        return this.springThreshold;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ SwipeMode spring$default(Companion companion, float f2, float f3, float f4, float f5, SpringBoundary springBoundary, int i2, Object obj) {
            if ((i2 & 16) != 0) {
                springBoundary = SpringBoundary.Companion.getOvershoot();
            }
            SpringBoundary springBoundary2 = springBoundary;
            int i3 = i2 & 8;
            int i4 = i2 & 4;
            int i5 = i2 & 2;
            int i6 = i2 & 1;
            if (i3 != 0) {
                f5 = 0.01f;
            }
            float f6 = f5;
            if (i4 != 0) {
                f4 = 10.0f;
            }
            float f7 = f4;
            if (i5 != 0) {
                f3 = 400.0f;
            }
            float f8 = f3;
            if (1 == i6) {
                f2 = 1.0f;
            }
            return companion.spring(f2, f8, f7, f6, springBoundary2);
        }

        public static /* synthetic */ SwipeMode velocity$default(Companion companion, float f2, float f3, int i2, Object obj) {
            if (1 == (i2 & 1)) {
                f2 = 4.0f;
            }
            if ((i2 & 2) != 0) {
                f3 = 1.2f;
            }
            return companion.velocity(f2, f3);
        }

        public final SwipeMode getSpring() {
            return SwipeMode.Spring;
        }

        public final SwipeMode getVelocity() {
            return SwipeMode.Velocity;
        }

        public final SwipeMode spring(float f2, float f3, float f4, float f5, SpringBoundary springBoundary) {
            return new SwipeMode("spring", f2, f3, f4, f5, springBoundary, 0.0f, 0.0f, 192, null);
        }

        public final SwipeMode velocity(float f2, float f3) {
            return new SwipeMode("velocity", 0.0f, 0.0f, 0.0f, 0.0f, null, f2, f3, 62, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public SwipeMode(String str, float f2, float f3, float f4, float f5, SpringBoundary springBoundary, float f6, float f7) {
        this.name = str;
        this.springMass = f2;
        this.springStiffness = f3;
        this.springDamping = f4;
        this.springThreshold = f5;
        this.springBoundary = springBoundary;
        this.maxVelocity = f6;
        this.maxAcceleration = f7;
    }
}
