package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.a.r;

/* compiled from: WazeSource */
@LazyStaggeredGridScopeMarker
/* loaded from: classes.dex */
public interface LazyStaggeredGridScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void item$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, q qVar, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if (1 == (i2 & 1)) {
                obj = null;
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            if ((i2 & 4) != 0) {
                staggeredGridItemSpan = null;
            }
            lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, qVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, int i2, l lVar, l lVar2, l lVar3, r rVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
            }
            if ((i3 & 2) != 0) {
                lVar = null;
            }
            if ((i3 & 4) != 0) {
                lVar2 = new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope.items.1
                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        ((Number) obj2).intValue();
                        return null;
                    }

                    public final Void invoke(int i4) {
                        return null;
                    }
                };
            }
            if ((i3 & 8) != 0) {
                lVar3 = null;
            }
            lazyStaggeredGridScope.items(i2, lVar, lVar2, lVar3, rVar);
        }
    }

    void item(Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, q<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, ab> qVar);

    void items(int i2, l<? super Integer, ? extends Object> lVar, l<? super Integer, ? extends Object> lVar2, l<? super Integer, StaggeredGridItemSpan> lVar3, r<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar);
}
