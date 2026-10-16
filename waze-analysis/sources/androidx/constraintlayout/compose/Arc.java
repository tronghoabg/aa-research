package androidx.constraintlayout.compose;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Arc {
    public static final int $stable = 0;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final Arc None = new Arc("none");
    private static final Arc StartVertical = new Arc("startVertical");
    private static final Arc StartHorizontal = new Arc("startHorizontal");
    private static final Arc Flip = new Arc("flip");
    private static final Arc Below = new Arc("below");
    private static final Arc Above = new Arc("above");

    public Arc(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Arc getAbove() {
            return Arc.Above;
        }

        public final Arc getBelow() {
            return Arc.Below;
        }

        public final Arc getFlip() {
            return Arc.Flip;
        }

        public final Arc getNone() {
            return Arc.None;
        }

        public final Arc getStartHorizontal() {
            return Arc.StartHorizontal;
        }

        public final Arc getStartVertical() {
            return Arc.StartVertical;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
