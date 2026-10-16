package S;

import j$.util.Map;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4295e;

/* loaded from: classes.dex */
public class e extends AbstractMap implements Q.c, Map, java.util.Map, InterfaceC4295e {

    /* renamed from: a, reason: collision with root package name */
    public c f10805a;

    /* renamed from: b, reason: collision with root package name */
    public U.b f10806b = new U.b();

    /* renamed from: c, reason: collision with root package name */
    public n f10807c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10808d;

    /* renamed from: e, reason: collision with root package name */
    public int f10809e;

    /* renamed from: f, reason: collision with root package name */
    public int f10810f;

    public e(c cVar) {
        this.f10805a = cVar;
        this.f10807c = cVar.f10800a;
        cVar.getClass();
        this.f10810f = cVar.f10801b;
    }

    @Override // Q.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c build() {
        n nVar = this.f10807c;
        c cVar = this.f10805a;
        if (nVar != cVar.f10800a) {
            this.f10806b = new U.b();
            cVar = new c(this.f10807c, this.f10810f);
        }
        this.f10805a = cVar;
        return cVar;
    }

    public final void c(int i5) {
        this.f10810f = i5;
        this.f10809e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f10807c = n.f10824e;
        c(0);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f10807c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new g(0, this);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f10807c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new g(1, this);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f10808d = null;
        this.f10807c = this.f10807c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f10808d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        c cVarBuild = null;
        c cVar = map instanceof c ? (c) map : null;
        if (cVar == null) {
            e eVar = map instanceof e ? (e) map : null;
            if (eVar != null) {
                cVarBuild = eVar.build();
            }
        } else {
            cVarBuild = cVar;
        }
        if (cVarBuild == null) {
            super.putAll(map);
            return;
        }
        U.a aVar = new U.a();
        aVar.f11897a = 0;
        int i5 = this.f10810f;
        n nVar = this.f10807c;
        n nVar2 = cVarBuild.f10800a;
        AbstractC3340k.c(nVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f10807c = nVar.m(nVar2, 0, aVar, this);
        int i10 = (cVarBuild.f10801b + i5) - aVar.f11897a;
        if (i5 != i10) {
            c(i10);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i5 = this.f10810f;
        n nVarO = this.f10807c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (nVarO == null) {
            nVarO = n.f10824e;
        }
        this.f10807c = nVarO;
        return i5 != this.f10810f;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f10810f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new j(this, 0);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f10808d = null;
        n nVarN = this.f10807c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (nVarN == null) {
            nVarN = n.f10824e;
        }
        this.f10807c = nVarN;
        return this.f10808d;
    }
}
