package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import h.g.b.o;
import h.k.j;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutNearestRangeState implements State<j> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private final int extraItemCount;
    private int lastFirstVisibleItem;
    private final int slidingWindowSize;
    private final MutableState value$delegate;

    public LazyLayoutNearestRangeState(int i2, int i3, int i4) {
        this.slidingWindowSize = i3;
        this.extraItemCount = i4;
        this.value$delegate = SnapshotStateKt.mutableStateOf(Companion.calculateNearestItemsRange(i2, i3, i4), SnapshotStateKt.structuralEqualityPolicy());
        this.lastFirstVisibleItem = i2;
    }

    private void setValue(j jVar) {
        this.value$delegate.setValue(jVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    public j getValue() {
        return (j) this.value$delegate.getValue();
    }

    public final void update(int i2) {
        if (i2 != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = i2;
            setValue(Companion.calculateNearestItemsRange(i2, this.slidingWindowSize, this.extraItemCount));
        }
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final j calculateNearestItemsRange(int i2, int i3, int i4) {
            int i5 = (i2 / i3) * i3;
            return n.u(Math.max(i5 - i4, 0), i5 + i3 + i4);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
