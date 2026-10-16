package androidx.window.core.layout;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowWidthSizeClass {
    private final int rawValue;
    public static final Companion Companion = new Companion(null);
    public static final WindowWidthSizeClass COMPACT = new WindowWidthSizeClass(0);
    public static final WindowWidthSizeClass MEDIUM = new WindowWidthSizeClass(1);
    public static final WindowWidthSizeClass EXPANDED = new WindowWidthSizeClass(2);

    private WindowWidthSizeClass(int i2) {
        this.rawValue = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.rawValue == ((WindowWidthSizeClass) obj).rawValue;
    }

    public int hashCode() {
        return this.rawValue;
    }

    public String toString() {
        return "WindowWidthSizeClass: ".concat(x.n(this, COMPACT) ? "COMPACT" : x.n(this, MEDIUM) ? "MEDIUM" : x.n(this, EXPANDED) ? "EXPANDED" : "UNKNOWN");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getCOMPACT$annotations() {
        }

        public static /* synthetic */ void getEXPANDED$annotations() {
        }

        public static /* synthetic */ void getMEDIUM$annotations() {
        }

        public final WindowWidthSizeClass compute$window_core(float f2) {
            if (f2 >= 0.0f) {
                return f2 < 600.0f ? WindowWidthSizeClass.COMPACT : f2 < 840.0f ? WindowWidthSizeClass.MEDIUM : WindowWidthSizeClass.EXPANDED;
            }
            throw new IllegalArgumentException("Width must be positive, received " + f2);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
