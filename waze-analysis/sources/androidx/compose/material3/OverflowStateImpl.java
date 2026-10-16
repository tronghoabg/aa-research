package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import h.a.i;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class OverflowStateImpl implements ButtonGroupOverflowState {
    public static final Companion Companion = new Companion(null);
    private static final Saver<OverflowStateImpl, ?> Saver = SaverKt.Saver(new p() { // from class: androidx.compose.material3.OverflowStateImpl$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            OverflowStateImpl overflowStateImpl = (OverflowStateImpl) obj2;
            return i.i(Integer.valueOf(overflowStateImpl.getTotalItemCount()), Integer.valueOf(overflowStateImpl.getVisibleItemCount()));
        }
    }, new l() { // from class: androidx.compose.material3.OverflowStateImpl$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return OverflowStateImpl.Saver$lambda$1((List) obj);
        }
    });
    private final MutableIntState totalItemCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
    private final MutableIntState visibleItemCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);

    static final OverflowStateImpl Saver$lambda$1(List list) {
        OverflowStateImpl overflowStateImpl = new OverflowStateImpl();
        overflowStateImpl.setTotalItemCount(((Number) list.get(0)).intValue());
        overflowStateImpl.setVisibleItemCount(((Number) list.get(1)).intValue());
        return overflowStateImpl;
    }

    @Override // androidx.compose.material3.ButtonGroupOverflowState
    public int getTotalItemCount() {
        return this.totalItemCount$delegate.getIntValue();
    }

    @Override // androidx.compose.material3.ButtonGroupOverflowState
    public int getVisibleItemCount() {
        return this.visibleItemCount$delegate.getIntValue();
    }

    @Override // androidx.compose.material3.ButtonGroupOverflowState
    public void setTotalItemCount(int i2) {
        this.totalItemCount$delegate.setIntValue(i2);
    }

    @Override // androidx.compose.material3.ButtonGroupOverflowState
    public void setVisibleItemCount(int i2) {
        this.visibleItemCount$delegate.setIntValue(i2);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<OverflowStateImpl, ?> getSaver() {
            return OverflowStateImpl.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
