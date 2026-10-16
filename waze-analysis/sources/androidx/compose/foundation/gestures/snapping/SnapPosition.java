package androidx.compose.foundation.gestures.snapping;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SnapPosition {

    /* compiled from: WazeSource */
    public final class Center implements SnapPosition {
        public static final int $stable = 0;
        public static final Center INSTANCE = new Center();

        private Center() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i2, int i3, int i4, int i5, int i6, int i7) {
            return (((i2 - i4) - i5) / 2) - (i3 / 2);
        }

        public String toString() {
            return "Center";
        }
    }

    /* compiled from: WazeSource */
    public final class End implements SnapPosition {
        public static final int $stable = 0;
        public static final End INSTANCE = new End();

        private End() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i2, int i3, int i4, int i5, int i6, int i7) {
            return ((i2 - i4) - i5) - i3;
        }

        public String toString() {
            return "End";
        }
    }

    /* compiled from: WazeSource */
    public final class Start implements SnapPosition {
        public static final int $stable = 0;
        public static final Start INSTANCE = new Start();

        private Start() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i2, int i3, int i4, int i5, int i6, int i7) {
            return 0;
        }

        public String toString() {
            return "Start";
        }
    }

    int position(int i2, int i3, int i4, int i5, int i6, int i7);
}
