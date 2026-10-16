package androidx.constraintlayout.compose;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RelativePosition implements NamedPropertyOrValue {
    public static final int $stable = 0;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final RelativePosition Delta = new RelativePosition("deltaRelative");
    private static final RelativePosition Path = new RelativePosition("pathRelative");
    private static final RelativePosition Parent = new RelativePosition("parentRelative");

    public RelativePosition(String str) {
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

        public final RelativePosition getDelta() {
            return RelativePosition.Delta;
        }

        public final RelativePosition getParent() {
            return RelativePosition.Parent;
        }

        public final RelativePosition getPath() {
            return RelativePosition.Path;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
