package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;

/* compiled from: WazeSource */
@LazyGridScopeMarker
/* loaded from: classes.dex */
public interface LazyGridScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void item$default(LazyGridScope lazyGridScope, Object obj, l lVar, Object obj2, q qVar, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if (1 == (i2 & 1)) {
                obj = null;
            }
            if ((i2 & 2) != 0) {
                lVar = null;
            }
            if ((i2 & 4) != 0) {
                obj2 = null;
            }
            lazyGridScope.item(obj, lVar, obj2, qVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, int i2, l lVar, p pVar, l lVar2, r rVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
            }
            if ((i3 & 2) != 0) {
                lVar = null;
            }
            if ((i3 & 4) != 0) {
                pVar = null;
            }
            if ((i3 & 8) != 0) {
                lVar2 = new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScope.items.1
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
            lazyGridScope.items(i2, lVar, pVar, lVar2, rVar);
        }

        public static /* synthetic */ void stickyHeader$default(LazyGridScope lazyGridScope, Object obj, Object obj2, r rVar, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
            }
            if (1 == (i2 & 1)) {
                obj = null;
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            lazyGridScope.stickyHeader(obj, obj2, rVar);
        }
    }

    void item(Object obj, l<? super LazyGridItemSpanScope, GridItemSpan> lVar, Object obj2, q<? super LazyGridItemScope, ? super Composer, ? super Integer, ab> qVar);

    void items(int i2, l<? super Integer, ? extends Object> lVar, p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> pVar, l<? super Integer, ? extends Object> lVar2, r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar);

    void stickyHeader(Object obj, Object obj2, r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar);
}
