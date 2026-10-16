package androidx.compose.material3;

import androidx.compose.foundation.pager.PagerState;
import h.ab;
import h.c.a.a;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ScrollFieldState {
    public static final int $stable = 0;
    private final int itemCount;
    private final PagerState pagerState;

    public ScrollFieldState(PagerState pagerState, int i2) {
        this.pagerState = pagerState;
        this.itemCount = i2;
    }

    private final int calculateTargetPage(int i2) {
        int currentPage = this.pagerState.getCurrentPage();
        return currentPage + (i2 - (currentPage % this.itemCount));
    }

    public final Object animateScrollToOption(int i2, e<? super ab> eVar) {
        Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(this.pagerState, calculateTargetPage(i2), 0.0f, null, eVar, 6, null);
        return objAnimateScrollToPage$default == a.f48038a ? objAnimateScrollToPage$default : ab.f48028a;
    }

    public final int getItemCount() {
        return this.itemCount;
    }

    public final PagerState getPagerState$material3() {
        return this.pagerState;
    }

    public final int getSelectedOption() {
        int i2 = this.itemCount;
        if (i2 > 0) {
            return this.pagerState.getCurrentPage() % i2;
        }
        return 0;
    }

    public final Object scrollToOption(int i2, e<? super ab> eVar) {
        Object objScrollToPage$default = PagerState.scrollToPage$default(this.pagerState, calculateTargetPage(i2), 0.0f, eVar, 2, null);
        return objScrollToPage$default == a.f48038a ? objScrollToPage$default : ab.f48028a;
    }
}
