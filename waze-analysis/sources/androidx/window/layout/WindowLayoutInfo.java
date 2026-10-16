package androidx.window.layout;

import e.c.d.a;
import h.a.c;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowLayoutInfo {
    private final List<DisplayFeature> displayFeatures;
    private final Set<EngagementMode> engagementModes;

    public /* synthetic */ WindowLayoutInfo(List list, Set set, int i2, o oVar) {
        this(list, (i2 & 2) != 0 ? a.r(EngagementMode.VISUALS_ON, EngagementMode.AUDIO_ON) : set);
    }

    public static /* synthetic */ void getEngagementModes$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowLayoutInfo)) {
            return false;
        }
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        return x.n(this.displayFeatures, windowLayoutInfo.displayFeatures) && x.n(this.engagementModes, windowLayoutInfo.engagementModes);
    }

    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
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
        return (this.displayFeatures.hashCode() * 31) + this.engagementModes.hashCode();
    }

    public String toString() throws IOException {
        return "WindowLayoutInfo{ DisplayFeatures[" + i.aM(this.displayFeatures, null, null, null, 0, null, 63) + "], engagementModes=" + this.engagementModes + " }";
    }

    /* compiled from: WazeSource */
    public final class EngagementMode {
        private final int id;
        public static final Companion Companion = new Companion(null);
        public static final EngagementMode VISUALS_ON = new EngagementMode(1);
        public static final EngagementMode AUDIO_ON = new EngagementMode(2);

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
            return "UNKNOWN(" + i2 + ")";
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public static /* synthetic */ void getAUDIO_ON$annotations() {
            }

            public static /* synthetic */ void getVISUALS_ON$annotations() {
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WindowLayoutInfo(List<? extends DisplayFeature> list, Set<EngagementMode> set) {
        x.f(list, "displayFeatures");
        x.f(set, "engagementModes");
        this.displayFeatures = list;
        this.engagementModes = set;
    }
}
