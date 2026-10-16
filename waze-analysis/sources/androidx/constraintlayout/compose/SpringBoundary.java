package androidx.constraintlayout.compose;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SpringBoundary {
    public static final int $stable = 0;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final SpringBoundary Overshoot = new SpringBoundary("overshoot");
    private static final SpringBoundary BounceStart = new SpringBoundary("bounceStart");
    private static final SpringBoundary BounceEnd = new SpringBoundary("bounceEnd");
    private static final SpringBoundary BounceBoth = new SpringBoundary("bounceBoth");

    public SpringBoundary(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SpringBoundary getBounceBoth() {
            return SpringBoundary.BounceBoth;
        }

        public final SpringBoundary getBounceEnd() {
            return SpringBoundary.BounceEnd;
        }

        public final SpringBoundary getBounceStart() {
            return SpringBoundary.BounceStart;
        }

        public final SpringBoundary getOvershoot() {
            return SpringBoundary.Overshoot;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
