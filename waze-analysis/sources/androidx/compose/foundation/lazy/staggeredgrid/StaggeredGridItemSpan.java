package androidx.compose.foundation.lazy.staggeredgrid;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StaggeredGridItemSpan {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final StaggeredGridItemSpan FullLine = new StaggeredGridItemSpan(0);
    private static final StaggeredGridItemSpan SingleLane = new StaggeredGridItemSpan(1);
    private final int value;

    private StaggeredGridItemSpan(int i2) {
        this.value = i2;
    }

    public final int getValue$foundation() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final StaggeredGridItemSpan getFullLine() {
            return StaggeredGridItemSpan.FullLine;
        }

        public final StaggeredGridItemSpan getSingleLane() {
            return StaggeredGridItemSpan.SingleLane;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
