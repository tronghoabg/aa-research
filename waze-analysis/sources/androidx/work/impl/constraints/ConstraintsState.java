package androidx.work.impl.constraints;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class ConstraintsState {

    /* compiled from: WazeSource */
    public final class ConstraintsMet extends ConstraintsState {
        public static final ConstraintsMet INSTANCE = new ConstraintsMet();

        private ConstraintsMet() {
            super(null);
        }
    }

    /* compiled from: WazeSource */
    public final class ConstraintsNotMet extends ConstraintsState {
        private final int reason;

        public ConstraintsNotMet(int i2) {
            super(null);
            this.reason = i2;
        }

        public static /* synthetic */ ConstraintsNotMet copy$default(ConstraintsNotMet constraintsNotMet, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = constraintsNotMet.reason;
            }
            return constraintsNotMet.copy(i2);
        }

        public final int component1() {
            return this.reason;
        }

        public final ConstraintsNotMet copy(int i2) {
            return new ConstraintsNotMet(i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConstraintsNotMet) && this.reason == ((ConstraintsNotMet) obj).reason;
        }

        public final int getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason;
        }

        public String toString() {
            return "ConstraintsNotMet(reason=" + this.reason + ")";
        }
    }

    private ConstraintsState() {
    }

    public /* synthetic */ ConstraintsState(o oVar) {
        this();
    }
}
