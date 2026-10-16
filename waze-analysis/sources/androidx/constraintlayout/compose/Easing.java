package androidx.constraintlayout.compose;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Easing implements NamedPropertyOrValue {
    public static final int $stable = 0;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final Easing Standard = new Easing("standard");
    private static final Easing Accelerate = new Easing("accelerate");
    private static final Easing Decelerate = new Easing("decelerate");
    private static final Easing Linear = new Easing("linear");
    private static final Easing Anticipate = new Easing("anticipate");
    private static final Easing Overshoot = new Easing("overshoot");

    public Easing(String str) {
        this.name = str;
    }

    @Override // androidx.constraintlayout.compose.NamedPropertyOrValue
    public String getName() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Easing cubic(float f2, float f3, float f4, float f5) {
            return new Easing("cubic(" + f2 + ", " + f3 + ", " + f4 + ", " + f5 + ')');
        }

        public final Easing getAccelerate() {
            return Easing.Accelerate;
        }

        public final Easing getAnticipate() {
            return Easing.Anticipate;
        }

        public final Easing getDecelerate() {
            return Easing.Decelerate;
        }

        public final Easing getLinear() {
            return Easing.Linear;
        }

        public final Easing getOvershoot() {
            return Easing.Overshoot;
        }

        public final Easing getStandard() {
            return Easing.Standard;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
