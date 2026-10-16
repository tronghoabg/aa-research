package androidx.compose.material.pullrefresh;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.a;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PullRefreshKt {
    public static final Modifier pullRefresh(Modifier modifier, PullRefreshState pullRefreshState, boolean z) {
        return pullRefresh(modifier, new AnonymousClass1(pullRefreshState), new AnonymousClass2(pullRefreshState), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object pullRefresh$onRelease(PullRefreshState pullRefreshState, float f2, e eVar) {
        return new Float(pullRefreshState.onRelease$material(f2));
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends u implements l<Float, Float> {
        AnonymousClass1(Object obj) {
            super(1, obj, PullRefreshState.class, "onPull", "onPull$material(F)F", 0);
        }

        public final Float invoke(float f2) {
            return Float.valueOf(((PullRefreshState) this.receiver).onPull$material(f2));
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
            return invoke(f2.floatValue());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends a implements p<Float, e<? super Float>, Object> {
        AnonymousClass2(Object obj) {
            super(2, obj, PullRefreshState.class, "onRelease", "onRelease$material(F)F", 4);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(Float f2, e<? super Float> eVar) {
            return invoke(f2.floatValue(), eVar);
        }

        public final Object invoke(float f2, e<? super Float> eVar) {
            return PullRefreshKt.pullRefresh$onRelease((PullRefreshState) this.receiver, f2, eVar);
        }
    }

    public static final Modifier pullRefresh(Modifier modifier, l<? super Float, Float> lVar, p<? super Float, ? super e<? super Float>, ? extends Object> pVar, boolean z) {
        return NestedScrollModifierKt.nestedScroll$default(modifier, new PullRefreshNestedScrollConnection(lVar, pVar, z), null, 2, null);
    }
}
