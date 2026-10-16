package androidx.compose.material3.internal;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface BackEventProgress {

    /* compiled from: WazeSource */
    public final class Completed implements BackEventProgress {
        public static final int $stable = 0;
        public static final Completed INSTANCE = new Completed();

        private Completed() {
        }
    }

    /* compiled from: WazeSource */
    public final class InProgress implements BackEventProgress {
        public static final int $stable = 0;
        private final float progress;
        private final SwipeEdge swipeEdge;
        private final float touchX;
        private final float touchY;

        public InProgress(float f2, float f3, float f4, SwipeEdge swipeEdge) {
            this.touchX = f2;
            this.touchY = f3;
            this.progress = f4;
            this.swipeEdge = swipeEdge;
        }

        public static /* synthetic */ InProgress copy$default(InProgress inProgress, float f2, float f3, float f4, SwipeEdge swipeEdge, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = inProgress.touchX;
            }
            if ((i2 & 2) != 0) {
                f3 = inProgress.touchY;
            }
            if ((i2 & 4) != 0) {
                f4 = inProgress.progress;
            }
            if ((i2 & 8) != 0) {
                swipeEdge = inProgress.swipeEdge;
            }
            return inProgress.copy(f2, f3, f4, swipeEdge);
        }

        public final float component1() {
            return this.touchX;
        }

        public final float component2() {
            return this.touchY;
        }

        public final float component3() {
            return this.progress;
        }

        public final SwipeEdge component4() {
            return this.swipeEdge;
        }

        public final InProgress copy(float f2, float f3, float f4, SwipeEdge swipeEdge) {
            return new InProgress(f2, f3, f4, swipeEdge);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InProgress)) {
                return false;
            }
            InProgress inProgress = (InProgress) obj;
            return Float.compare(this.touchX, inProgress.touchX) == 0 && Float.compare(this.touchY, inProgress.touchY) == 0 && Float.compare(this.progress, inProgress.progress) == 0 && this.swipeEdge == inProgress.swipeEdge;
        }

        public final float getProgress() {
            return this.progress;
        }

        public final SwipeEdge getSwipeEdge() {
            return this.swipeEdge;
        }

        public final float getTouchX() {
            return this.touchX;
        }

        public final float getTouchY() {
            return this.touchY;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.touchX) * 31) + Float.floatToIntBits(this.touchY)) * 31) + Float.floatToIntBits(this.progress)) * 31) + this.swipeEdge.hashCode();
        }

        public String toString() {
            return "InProgress(touchX=" + this.touchX + ", touchY=" + this.touchY + ", progress=" + this.progress + ", swipeEdge=" + this.swipeEdge + ')';
        }
    }

    /* compiled from: WazeSource */
    public final class NotRunning implements BackEventProgress {
        public static final int $stable = 0;
        public static final NotRunning INSTANCE = new NotRunning();

        private NotRunning() {
        }
    }
}
