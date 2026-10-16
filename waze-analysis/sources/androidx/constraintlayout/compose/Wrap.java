package androidx.constraintlayout.compose;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Wrap {
    public static final int $stable = 0;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final Wrap None = new Wrap("none");
    private static final Wrap Chain = new Wrap("chain");
    private static final Wrap Aligned = new Wrap("aligned");

    public Wrap(String str) {
        this.name = str;
    }

    public final String getName$constraintlayout_compose() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Wrap getAligned() {
            return Wrap.Aligned;
        }

        public final Wrap getChain() {
            return Wrap.Chain;
        }

        public final Wrap getNone() {
            return Wrap.None;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
