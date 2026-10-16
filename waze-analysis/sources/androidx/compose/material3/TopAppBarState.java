package androidx.compose.material3;

import androidx.compose.material3.TopAppBarState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import h.a.i;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TopAppBarState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TopAppBarState, ?> Saver = ListSaverKt.listSaver(new p() { // from class: androidx.compose.material3.TopAppBarState$$ExternalSyntheticLambda1
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            TopAppBarState topAppBarState = (TopAppBarState) obj2;
            return i.i(Float.valueOf(topAppBarState.heightOffsetLimit), Float.valueOf(topAppBarState.getHeightOffset()), Float.valueOf(topAppBarState.getContentOffset()));
        }
    }, new l() { // from class: androidx.compose.material3.TopAppBarState$$ExternalSyntheticLambda2
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return TopAppBarState.Saver$lambda$1((List) obj);
        }
    });
    private MutableFloatState _heightOffset;
    private final MutableFloatState contentOffset$delegate;
    private float heightOffsetLimit;
    private a<Boolean> isScrollingContentAtStart = new a() { // from class: androidx.compose.material3.TopAppBarState$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            TopAppBarState.Companion companion = TopAppBarState.Companion;
            return true;
        }
    };

    public TopAppBarState(float f2, float f3, float f4) {
        this.heightOffsetLimit = f2;
        this.contentOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f4);
        this._heightOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(f3);
    }

    static final TopAppBarState Saver$lambda$1(List list) {
        return new TopAppBarState(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
    }

    static final boolean isScrollingContentAtStart$lambda$0() {
        return true;
    }

    public final float getCollapsedFraction() {
        if (this.heightOffsetLimit == 0.0f) {
            return 0.0f;
        }
        return getHeightOffset() / this.heightOffsetLimit;
    }

    public final float getContentOffset() {
        return this.contentOffset$delegate.getFloatValue();
    }

    public final float getHeightOffset() {
        return this._heightOffset.getFloatValue();
    }

    public final float getHeightOffsetLimit() {
        return this.heightOffsetLimit;
    }

    public final float getOverlappedFraction() {
        if (!this.isScrollingContentAtStart.invoke().booleanValue() && getContentOffset() == 0.0f) {
            return 1.0f;
        }
        float f2 = this.heightOffsetLimit;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return 1.0f - (n.g(f2 + Math.abs(getContentOffset()), this.heightOffsetLimit, 0.0f) / this.heightOffsetLimit);
    }

    public final a<Boolean> isScrollingContentAtStart$material3() {
        return this.isScrollingContentAtStart;
    }

    public final void setContentOffset(float f2) {
        this.contentOffset$delegate.setFloatValue(f2);
    }

    public final void setHeightOffset(float f2) {
        this._heightOffset.setFloatValue(n.g(f2, this.heightOffsetLimit, 0.0f));
    }

    public final void setHeightOffsetLimit(float f2) {
        this.heightOffsetLimit = f2;
    }

    public final void setScrollingContentAtStart$material3(a<Boolean> aVar) {
        this.isScrollingContentAtStart = aVar;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<TopAppBarState, ?> getSaver() {
            return TopAppBarState.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
