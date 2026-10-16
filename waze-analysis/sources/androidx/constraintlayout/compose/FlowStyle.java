package androidx.constraintlayout.compose;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FlowStyle {
    public static final int $stable = 0;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final FlowStyle Spread = new FlowStyle("spread");
    private static final FlowStyle SpreadInside = new FlowStyle("spread_inside");
    private static final FlowStyle Packed = new FlowStyle("packed");

    public FlowStyle(String str) {
        this.name = str;
    }

    public final String getName$constraintlayout_compose() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final FlowStyle getPacked() {
            return FlowStyle.Packed;
        }

        public final FlowStyle getSpread() {
            return FlowStyle.Spread;
        }

        public final FlowStyle getSpreadInside() {
            return FlowStyle.SpreadInside;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
