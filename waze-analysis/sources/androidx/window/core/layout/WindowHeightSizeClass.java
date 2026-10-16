package androidx.window.core.layout;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowHeightSizeClass {
    private final int rawValue;
    public static final Companion Companion = new Companion(null);
    public static final WindowHeightSizeClass COMPACT = new WindowHeightSizeClass(0);
    public static final WindowHeightSizeClass MEDIUM = new WindowHeightSizeClass(1);
    public static final WindowHeightSizeClass EXPANDED = new WindowHeightSizeClass(2);

    private WindowHeightSizeClass(int i2) {
        this.rawValue = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.rawValue == ((WindowHeightSizeClass) obj).rawValue;
    }

    public int hashCode() {
        return this.rawValue;
    }

    public String toString() {
        return "WindowHeightSizeClass: ".concat(x.n(this, COMPACT) ? "COMPACT" : x.n(this, MEDIUM) ? "MEDIUM" : x.n(this, EXPANDED) ? "EXPANDED" : "UNKNOWN");
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

        public final WindowHeightSizeClass compute$window_core(float f2) {
            if (f2 >= 0.0f) {
                return f2 < 480.0f ? WindowHeightSizeClass.COMPACT : f2 < 900.0f ? WindowHeightSizeClass.MEDIUM : WindowHeightSizeClass.EXPANDED;
            }
            throw new IllegalArgumentException("Height must be positive, received " + f2);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
