package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PagerState;
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
/* loaded from: classes2.dex */
public final class CarouselPagerState extends PagerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<CarouselPagerState, ?> Saver = ListSaverKt.listSaver(new p() { // from class: androidx.compose.material3.carousel.CarouselPagerState$$ExternalSyntheticLambda1
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            CarouselPagerState carouselPagerState = (CarouselPagerState) obj2;
            return i.i(Integer.valueOf(carouselPagerState.getCurrentPage()), Float.valueOf(n.g(carouselPagerState.getCurrentPageOffsetFraction(), -0.5f, 0.5f)), carouselPagerState.pageCountState.getValue());
        }
    }, new l() { // from class: androidx.compose.material3.carousel.CarouselPagerState$$ExternalSyntheticLambda2
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return CarouselPagerState.Saver$lambda$1((List) obj);
        }
    });
    private MutableState<a<Integer>> pageCountState;

    public CarouselPagerState(int i2, float f2, a<Integer> aVar) {
        super(i2, f2);
        this.pageCountState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(aVar, null, 2, null);
    }

    static final CarouselPagerState Saver$lambda$1(final List list) {
        Object obj = list.get(0);
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        x.d(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new CarouselPagerState(iIntValue, ((Float) obj2).floatValue(), new a() { // from class: androidx.compose.material3.carousel.CarouselPagerState$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Integer.valueOf(CarouselPagerState.Saver$lambda$1$0(list));
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

        public final Saver<CarouselPagerState, ?> getSaver() {
            return CarouselPagerState.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
