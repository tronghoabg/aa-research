package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.a.r;

/* compiled from: WazeSource */
@LazyScopeMarker
/* loaded from: classes.dex */
public interface LazyListScope {
    /* synthetic */ void item(Object obj, q qVar);

    void item(Object obj, Object obj2, q<? super LazyItemScope, ? super Composer, ? super Integer, ab> qVar);

    void items(int i2, l<? super Integer, ? extends Object> lVar, l<? super Integer, ? extends Object> lVar2, r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar);

    /* synthetic */ void items(int i2, l lVar, r rVar);

    /* synthetic */ void stickyHeader(Object obj, Object obj2, q qVar);

    void stickyHeader(Object obj, Object obj2, r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyListScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$item(LazyListScope lazyListScope, Object obj, Object obj2, q qVar) {
            throw new IllegalStateException("The method is not implemented");
        }

        public static /* synthetic */ void $default$items(LazyListScope lazyListScope, int i2, l lVar, r rVar) {
            lazyListScope.items(i2, lVar, new l() { // from class: androidx.compose.foundation.lazy.LazyListScope$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    ((Integer) obj).intValue();
                    return null;
                }
            }, rVar);
        }

        public static /* synthetic */ void $default$stickyHeader(LazyListScope lazyListScope, Object obj, Object obj2, final q qVar) {
            lazyListScope.stickyHeader(obj, obj2, (r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, ab>) ComposableLambdaKt.composableLambdaInstance(-764088514, true, new r() { // from class: androidx.compose.foundation.lazy.LazyListScope$$ExternalSyntheticLambda0
                @Override // h.g.a.r
                public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                    return LazyListScope.CC.stickyHeader$lambda$0(qVar, (LazyItemScope) obj3, ((Integer) obj4).intValue(), (Composer) obj5, ((Integer) obj6).intValue());
                }
            }));
        }

        public static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, q qVar, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if (1 == (i2 & 1)) {
                obj = null;
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            lazyListScope.item(obj, obj2, qVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void items$default(LazyListScope lazyListScope, int i2, l lVar, l lVar2, r rVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
            }
            if ((i3 & 2) != 0) {
                lVar = null;
            }
            if ((i3 & 4) != 0) {
                lVar2 = new l() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.1
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
            lazyListScope.items(i2, lVar, lVar2, rVar);
        }

        public static Object items$lambda$0(int i2) {
            return null;
        }

        public static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, q qVar, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
            }
            if (1 == (i2 & 1)) {
                obj = null;
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            lazyListScope.stickyHeader(obj, obj2, qVar);
        }

        public static ab stickyHeader$lambda$0(q qVar, LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            if ((i3 & 6) == 0) {
                i3 |= true != composer.changed(lazyItemScope) ? 2 : 4;
            }
            if (composer.shouldExecute((i3 & 131) != 130, i3 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-764088514, i3, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:122)");
                }
                qVar.invoke(lazyItemScope, composer, Integer.valueOf(i3 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return ab.f48028a;
        }

        public static ab stickyHeader$lambda$1(r rVar, LazyItemScope lazyItemScope, Composer composer, int i2) {
            if ((i2 & 6) == 0) {
                i2 |= true != composer.changed(lazyItemScope) ? 2 : 4;
            }
            if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1691919627, i2, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:148)");
                }
                rVar.invoke(lazyItemScope, 0, composer, Integer.valueOf((i2 & 14) | 48));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return ab.f48028a;
        }

        public static void $default$items(LazyListScope lazyListScope, int i2, l lVar, l lVar2, r rVar) {
            throw new IllegalStateException("The method is not implemented");
        }

        public static void $default$stickyHeader(LazyListScope lazyListScope, Object obj, Object obj2, final r rVar) {
            lazyListScope.item(obj, obj2, ComposableLambdaKt.composableLambdaInstance(1691919627, true, new q() { // from class: androidx.compose.foundation.lazy.LazyListScope$$ExternalSyntheticLambda2
                @Override // h.g.a.q
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return LazyListScope.CC.stickyHeader$lambda$1(rVar, (LazyItemScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }));
        }

        public static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, q qVar, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if (1 == (i2 & 1)) {
                obj = null;
            }
            lazyListScope.item(obj, qVar);
        }

        public static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, r rVar, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
            }
            if (1 == (i2 & 1)) {
                obj = null;
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            lazyListScope.stickyHeader(obj, obj2, (r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, ab>) rVar);
        }

        public static /* synthetic */ void items$default(LazyListScope lazyListScope, int i2, l lVar, r rVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
            }
            if ((i3 & 2) != 0) {
                lVar = null;
            }
            lazyListScope.items(i2, lVar, rVar);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static void item(LazyListScope lazyListScope, Object obj, Object obj2, q<? super LazyItemScope, ? super Composer, ? super Integer, ab> qVar) {
            CC.$default$item(lazyListScope, obj, obj2, qVar);
        }

        @Deprecated
        public static void items(LazyListScope lazyListScope, int i2, l<? super Integer, ? extends Object> lVar, l<? super Integer, ? extends Object> lVar2, r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar) {
            CC.$default$items(lazyListScope, i2, lVar, lVar2, rVar);
        }

        @Deprecated
        public static void stickyHeader(LazyListScope lazyListScope, Object obj, Object obj2, r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, ab> rVar) {
            CC.$default$stickyHeader(lazyListScope, obj, obj2, rVar);
        }
    }
}
