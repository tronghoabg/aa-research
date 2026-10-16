package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface MenuAnchorPosition {

    /* compiled from: WazeSource */
    public final class Above implements MenuAnchorPosition {
        public static final int $stable = 0;
        public static final Above INSTANCE = new Above();

        private Above() {
        }
    }

    /* compiled from: WazeSource */
    public final class Below implements MenuAnchorPosition {
        public static final int $stable = 0;
        public static final Below INSTANCE = new Below();

        private Below() {
        }
    }

    /* compiled from: WazeSource */
    public final class Custom implements MenuAnchorPosition {
        public static final int $stable = 0;
        private final q<IntRect, IntSize, IntSize, IntList> xCandidates;
        private final q<IntRect, IntSize, IntSize, IntList> yCandidates;

        /* JADX WARN: Multi-variable type inference failed */
        public Custom(q<? super IntRect, ? super IntSize, ? super IntSize, ? extends IntList> qVar, q<? super IntRect, ? super IntSize, ? super IntSize, ? extends IntList> qVar2) {
            this.xCandidates = qVar;
            this.yCandidates = qVar2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) obj;
            return this.xCandidates == custom.xCandidates && this.yCandidates == custom.yCandidates;
        }

        public final q<IntRect, IntSize, IntSize, IntList> getXCandidates() {
            return this.xCandidates;
        }

        public final q<IntRect, IntSize, IntSize, IntList> getYCandidates() {
            return this.yCandidates;
        }

        public int hashCode() {
            return (this.xCandidates.hashCode() * 31) + this.yCandidates.hashCode();
        }
    }

    /* compiled from: WazeSource */
    public final class End implements MenuAnchorPosition {
        public static final int $stable = 0;
        public static final End INSTANCE = new End();

        private End() {
        }
    }

    /* compiled from: WazeSource */
    public final class Left implements MenuAnchorPosition {
        public static final int $stable = 0;
        public static final Left INSTANCE = new Left();

        private Left() {
        }
    }

    /* compiled from: WazeSource */
    public final class Right implements MenuAnchorPosition {
        public static final int $stable = 0;
        public static final Right INSTANCE = new Right();

        private Right() {
        }
    }

    /* compiled from: WazeSource */
    public final class Start implements MenuAnchorPosition {
        public static final int $stable = 0;
        public static final Start INSTANCE = new Start();

        private Start() {
        }
    }
}
