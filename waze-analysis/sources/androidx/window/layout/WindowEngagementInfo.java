package androidx.window.layout;

import e.c.d.a;
import h.a.c;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowEngagementInfo {
    private final Set<EngagementMode> engagementModes;

    public /* synthetic */ WindowEngagementInfo(Set set, int i2, o oVar) {
        this((i2 & 1) != 0 ? a.r(EngagementMode.VISUALS_ON, EngagementMode.AUDIO_ON) : set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowEngagementInfo) {
            return x.n(this.engagementModes, ((WindowEngagementInfo) obj).engagementModes);
        }
        return false;
    }

    public final Set<EngagementMode> getEngagementModes() {
        return this.engagementModes;
    }

    public final boolean hasEngagementMode(EngagementMode engagementMode) {
        x.f(engagementMode, "mode");
        return this.engagementModes.contains(engagementMode);
    }

    public final boolean hasEngagementModes(EngagementMode... engagementModeArr) {
        x.f(engagementModeArr, "modes");
        return this.engagementModes.containsAll(c.i(engagementModeArr));
    }

    public int hashCode() {
        return this.engagementModes.hashCode();
    }

    public String toString() {
        return "WindowEngagementInfo{ engagementModes=" + this.engagementModes + " }";
    }

    /* compiled from: WazeSource */
    public final class EngagementMode {
        private final int id;
        public static final Companion Companion = new Companion(null);
        public static final EngagementMode VISUALS_ON = new EngagementMode(1);
        public static final EngagementMode AUDIO_ON = new EngagementMode(2);
        public static final EngagementMode PRECISE_POINTER = new EngagementMode(3);
        public static final EngagementMode TOUCH = new EngagementMode(4);

        private EngagementMode(int i2) {
            this.id = i2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof EngagementMode) && this.id == ((EngagementMode) obj).id;
        }

        public int hashCode() {
            return this.id;
        }

        public String toString() {
            int i2 = this.id;
            if (i2 == 1) {
                return "VISUALS_ON";
            }
            if (i2 == 2) {
                return "AUDIO_ON";
            }
            if (i2 == 3) {
                return "PRECISE_POINTER";
            }
            if (i2 == 4) {
                return "TOUCH";
            }
            return "UNKNOWN(" + i2 + ")";
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

    public WindowEngagementInfo(Set<EngagementMode> set) {
        x.f(set, "engagementModes");
        this.engagementModes = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WindowEngagementInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
