package androidx.compose.foundation.pager;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import h.a.i;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultPagerState extends PagerState {
    public static final Companion Companion = new Companion(null);
    private static final Saver<DefaultPagerState, ?> Saver = ListSaverKt.listSaver(new p() { // from class: androidx.compose.foundation.pager.DefaultPagerState$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            DefaultPagerState defaultPagerState = (DefaultPagerState) obj2;
            return i.i(Integer.valueOf(defaultPagerState.getCurrentPage()), Float.valueOf(n.g(defaultPagerState.getCurrentPageOffsetFraction(), -0.5f, 0.5f)), Integer.valueOf(defaultPagerState.getPageCount()));
        }
    }, new l() { // from class: androidx.compose.foundation.pager.DefaultPagerState$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return DefaultPagerState.Saver$lambda$1((List) obj);
        }
    });
    private MutableState<a<Integer>> pageCountState;

    public DefaultPagerState(int i2, float f2, a<Integer> aVar) {
        super(i2, f2);
        this.pageCountState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(aVar, null, 2, null);
    }

    static final DefaultPagerState Saver$lambda$1(final List list) {
        Object obj = list.get(0);
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        x.d(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new DefaultPagerState(iIntValue, ((Float) obj2).floatValue(), new a() { // from class: androidx.compose.foundation.pager.DefaultPagerState$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Integer.valueOf(DefaultPagerState.Saver$lambda$1$0(list));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Saver$lambda$1$0(List list) {
        Object obj = list.get(2);
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) obj).intValue();
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public int getPageCount() {
        return this.pageCountState.getValue().invoke().intValue();
    }

    public final MutableState<a<Integer>> getPageCountState() {
        return this.pageCountState;
    }

    public final void setPageCountState(MutableState<a<Integer>> mutableState) {
        this.pageCountState = mutableState;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<DefaultPagerState, ?> getSaver() {
            return DefaultPagerState.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
