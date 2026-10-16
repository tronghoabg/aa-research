package androidx.window.area;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.window.area.WindowAreaCapability;
import androidx.window.layout.WindowMetrics;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowArea {
    private final Map<WindowAreaCapability.Operation, WindowAreaCapability> capabilityMap;
    private final WindowAreaToken token;
    private final Type type;
    private final WindowMetrics windowMetrics;

    public WindowArea(WindowMetrics windowMetrics, Type type, WindowAreaToken windowAreaToken, Map<WindowAreaCapability.Operation, WindowAreaCapability> map) {
        x.f(windowMetrics, "windowMetrics");
        x.f(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(windowAreaToken, "token");
        x.f(map, "capabilityMap");
        this.windowMetrics = windowMetrics;
        this.type = type;
        this.token = windowAreaToken;
        this.capabilityMap = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowArea)) {
            return false;
        }
        WindowArea windowArea = (WindowArea) obj;
        return x.n(this.windowMetrics, windowArea.windowMetrics) && x.n(this.token, windowArea.token) && x.n(this.type, windowArea.type) && x.n(this.capabilityMap.entrySet(), windowArea.capabilityMap.entrySet());
    }

    public final WindowAreaCapability getCapability(WindowAreaCapability.Operation operation) {
        x.f(operation, "operation");
        WindowAreaCapability windowAreaCapability = this.capabilityMap.get(operation);
        return windowAreaCapability == null ? new WindowAreaCapability(operation, WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED) : windowAreaCapability;
    }

    public final Map<WindowAreaCapability.Operation, WindowAreaCapability> getCapabilityMap$window() {
        return this.capabilityMap;
    }

    public final WindowAreaToken getToken() {
        return this.token;
    }

    public final Type getType() {
        return this.type;
    }

    public final WindowMetrics getWindowMetrics() {
        return this.windowMetrics;
    }

    public int hashCode() {
        return (((((this.windowMetrics.hashCode() * 31) + this.token.hashCode()) * 31) + this.type.hashCode()) * 31) + this.capabilityMap.entrySet().hashCode();
    }

    public String toString() {
        return "WindowAreaInfo{ Metrics: " + this.windowMetrics + ", type: " + this.type + ", Capabilities: " + this.capabilityMap.entrySet() + " }";
    }

    /* compiled from: WazeSource */
    public final class Type {
        public static final Companion Companion = new Companion(null);
        public static final Type TYPE_REAR_FACING = new Type(0);
        private final int rawValue;

        private Type(int i2) {
            this.rawValue = i2;
        }

        public String toString() {
            return true != x.n(this, TYPE_REAR_FACING) ? "UNKNOWN" : "REAR FACING";
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
}
