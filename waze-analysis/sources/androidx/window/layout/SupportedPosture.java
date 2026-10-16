package androidx.window.layout;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SupportedPosture {
    public static final Companion Companion = new Companion(null);
    public static final SupportedPosture TABLETOP = new SupportedPosture(0);
    private final int rawValue;

    public SupportedPosture(int i2) {
        this.rawValue = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && obj.getClass() == SupportedPosture.class && this.rawValue == ((SupportedPosture) obj).rawValue;
    }

    public int hashCode() {
        return this.rawValue;
    }

    public String toString() {
        return true != x.n(this, TABLETOP) ? "UNKNOWN" : "TABLETOP";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
