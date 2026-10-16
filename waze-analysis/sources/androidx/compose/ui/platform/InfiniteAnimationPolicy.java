package androidx.compose.ui.platform;

import h.c.e;
import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface InfiniteAnimationPolicy extends h {
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicy$-CC, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static i $default$getKey(InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return InfiniteAnimationPolicy.Key;
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class DefaultImpls {
        public static <R> R fold(InfiniteAnimationPolicy infiniteAnimationPolicy, R r, p<? super R, ? super h, ? extends R> pVar) {
            return (R) h.c.a.h.e(infiniteAnimationPolicy, r, pVar);
        }

        public static <E extends h> E get(InfiniteAnimationPolicy infiniteAnimationPolicy, i<E> iVar) {
            return (E) h.c.a.h.f(infiniteAnimationPolicy, iVar);
        }

        @Deprecated
        public static i<?> getKey(InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return CC.$default$getKey(infiniteAnimationPolicy);
        }

        public static j minusKey(InfiniteAnimationPolicy infiniteAnimationPolicy, i<?> iVar) {
            return h.c.a.h.g(infiniteAnimationPolicy, iVar);
        }

        public static j plus(InfiniteAnimationPolicy infiniteAnimationPolicy, j jVar) {
            return h.c.a.h.h(infiniteAnimationPolicy, jVar);
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class Key implements i<InfiniteAnimationPolicy> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // h.c.h
    i<?> getKey();

    <R> Object onInfiniteOperation(l<? super e<? super R>, ? extends Object> lVar, e<? super R> eVar);
}
