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
final class AppBarOverflowStateImpl implements AppBarOverflowState {
    public static final Companion Companion = new Companion(null);
    private static final Saver<AppBarOverflowStateImpl, ?> Saver = SaverKt.Saver(new p() { // from class: androidx.compose.material3.AppBarOverflowStateImpl$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            AppBarOverflowStateImpl appBarOverflowStateImpl = (AppBarOverflowStateImpl) obj2;
            return i.i(Integer.valueOf(appBarOverflowStateImpl.getTotalItemCount()), Integer.valueOf(appBarOverflowStateImpl.getVisibleItemCount()));
        }
    }, new l() { // from class: androidx.compose.material3.AppBarOverflowStateImpl$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return AppBarOverflowStateImpl.Saver$lambda$1((List) obj);
        }
    });
    private final MutableIntState totalItemCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
    private final MutableIntState visibleItemCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);

    static final AppBarOverflowStateImpl Saver$lambda$1(List list) {
        AppBarOverflowStateImpl appBarOverflowStateImpl = new AppBarOverflowStateImpl();
        appBarOverflowStateImpl.setTotalItemCount(((Number) list.get(0)).intValue());
        appBarOverflowStateImpl.setVisibleItemCount(((Number) list.get(1)).intValue());
        return appBarOverflowStateImpl;
    }

    @Override // androidx.compose.material3.AppBarOverflowState
    public int getTotalItemCount() {
        return this.totalItemCount$delegate.getIntValue();
    }

    @Override // androidx.compose.material3.AppBarOverflowState
    public int getVisibleItemCount() {
        return this.visibleItemCount$delegate.getIntValue();
    }

    @Override // androidx.compose.material3.AppBarOverflowState
    public void setTotalItemCount(int i2) {
        this.totalItemCount$delegate.setIntValue(i2);
    }

    @Override // androidx.compose.material3.AppBarOverflowState
    public void setVisibleItemCount(int i2) {
        this.visibleItemCount$delegate.setIntValue(i2);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<AppBarOverflowStateImpl, ?> getSaver() {
            return AppBarOverflowStateImpl.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
