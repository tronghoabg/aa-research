package androidx.collection;

import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LruCacheKt {
    private static final long MAX_SIZE = 2147483647L;

    /* compiled from: WazeSource */
    /* renamed from: androidx.collection.LruCacheKt$lruCache$4, reason: invalid class name */
    public final class AnonymousClass4 extends LruCache {
        final /* synthetic */ l $create;
        final /* synthetic */ r $onEntryRemoved;
        final /* synthetic */ p $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(int i2, p pVar, l lVar, r rVar) {
            super(i2);
            this.$sizeOf = pVar;
            this.$create = lVar;
            this.$onEntryRemoved = rVar;
        }

        @Override // androidx.collection.LruCache
        protected Object create(Object obj) {
            x.f(obj, "key");
            return this.$create.invoke(obj);
        }

        @Override // androidx.collection.LruCache
        protected void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            x.f(obj, "key");
            x.f(obj2, "oldValue");
            this.$onEntryRemoved.invoke(Boolean.valueOf(z), obj, obj2, obj3);
        }

        @Override // androidx.collection.LruCache
        protected int sizeOf(Object obj, Object obj2) {
            x.f(obj, "key");
            x.f(obj2, "value");
            return ((Number) this.$sizeOf.invoke(obj, obj2)).intValue();
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i2, p<? super K, ? super V, Integer> pVar, l<? super K, ? extends V> lVar, r<? super Boolean, ? super K, ? super V, ? super V, ab> rVar) {
        x.f(pVar, "sizeOf");
        x.f(lVar, "create");
        x.f(rVar, "onEntryRemoved");
        return new AnonymousClass4(i2, pVar, lVar, rVar);
    }

    public static /* synthetic */ LruCache lruCache$default(int i2, p pVar, l lVar, r rVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            pVar = new p() { // from class: androidx.collection.LruCacheKt.lruCache.1
                @Override // h.g.a.p
                public final Integer invoke(Object obj2, Object obj3) {
                    x.f(obj2, "<unused var>");
                    x.f(obj3, "<unused var>");
                    return 1;
                }
            };
        }
        if ((i3 & 4) != 0) {
            lVar = new l() { // from class: androidx.collection.LruCacheKt.lruCache.2
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    x.f(obj2, "it");
                    return null;
                }
            };
        }
        if ((i3 & 8) != 0) {
            rVar = new r() { // from class: androidx.collection.LruCacheKt.lruCache.3
                @Override // h.g.a.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Boolean) obj2).booleanValue(), obj3, obj4, obj5);
                    return ab.f48028a;
                }

                public final void invoke(boolean z, Object obj2, Object obj3, Object obj4) {
                    x.f(obj2, "<unused var>");
                    x.f(obj3, "<unused var>");
                }
            };
        }
        x.f(pVar, "sizeOf");
        x.f(lVar, "create");
        x.f(rVar, "onEntryRemoved");
        return new AnonymousClass4(i2, pVar, lVar, rVar);
    }
}
