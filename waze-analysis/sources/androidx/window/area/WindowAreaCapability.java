package androidx.window.area;

import androidx.core.app.NotificationCompat;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowAreaCapability {
    private final Operation operation;
    private final Status status;

    public WindowAreaCapability(Operation operation, Status status) {
        x.f(operation, "operation");
        x.f(status, NotificationCompat.CATEGORY_STATUS);
        this.operation = operation;
        this.status = status;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WindowAreaCapability)) {
            return false;
        }
        WindowAreaCapability windowAreaCapability = (WindowAreaCapability) obj;
        return x.n(this.operation, windowAreaCapability.operation) && x.n(this.status, windowAreaCapability.status);
    }

    public final Operation getOperation() {
        return this.operation;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.operation.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "WindowAreaCapability [Operation: " + this.operation + ": Status: " + this.status + "]";
    }

    /* compiled from: WazeSource */
    public final class Operation {
        private final int rawValue;
        public static final Companion Companion = new Companion(null);
        public static final Operation OPERATION_TRANSFER_TO_AREA = new Operation(0);
        public static final Operation OPERATION_PRESENT_ON_AREA = new Operation(1);

        private Operation(int i2) {
            this.rawValue = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && obj.getClass() == Operation.class && this.rawValue == ((Operation) obj).rawValue;
        }

        public int hashCode() {
            return this.rawValue;
        }

        public String toString() {
            return x.n(this, OPERATION_TRANSFER_TO_AREA) ? "TRANSFER" : x.n(this, OPERATION_PRESENT_ON_AREA) ? "PRESENT" : "UNKNOWN";
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

    /* compiled from: WazeSource */
    public final class Status {
        private final int rawValue;
        public static final Companion Companion = new Companion(null);
        private static final Status WINDOW_AREA_STATUS_UNKNOWN = new Status(0);
        public static final Status WINDOW_AREA_STATUS_UNSUPPORTED = new Status(1);
        public static final Status WINDOW_AREA_STATUS_UNAVAILABLE = new Status(2);
        public static final Status WINDOW_AREA_STATUS_AVAILABLE = new Status(3);
        public static final Status WINDOW_AREA_STATUS_ACTIVE = new Status(4);

        private Status(int i2) {
            this.rawValue = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof Status) && this.rawValue == ((Status) obj).rawValue;
        }

        public int hashCode() {
            return this.rawValue;
        }

        public String toString() {
            return x.n(this, WINDOW_AREA_STATUS_UNSUPPORTED) ? "UNSUPPORTED" : x.n(this, WINDOW_AREA_STATUS_UNAVAILABLE) ? "UNAVAILABLE" : x.n(this, WINDOW_AREA_STATUS_AVAILABLE) ? "AVAILABLE" : x.n(this, WINDOW_AREA_STATUS_ACTIVE) ? "ACTIVE" : "UNKNOWN";
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final Status getWINDOW_AREA_STATUS_UNKNOWN$window() {
                return Status.WINDOW_AREA_STATUS_UNKNOWN;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }
}
