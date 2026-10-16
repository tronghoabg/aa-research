package x;

import androidx.datastore.preferences.protobuf.i0;
import j$.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4412e extends C4429v implements Map, j$.util.Map {

    /* renamed from: d, reason: collision with root package name */
    public i0 f47501d;

    /* renamed from: e, reason: collision with root package name */
    public C4409b f47502e;

    /* renamed from: f, reason: collision with root package name */
    public C4411d f47503f;

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

    @Override // java.util.Map
    public final Set entrySet() {
        i0 i0Var = this.f47501d;
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(2, this);
        this.f47501d = i0Var2;
        return i0Var2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Set keySet() {
        C4409b c4409b = this.f47502e;
        if (c4409b != null) {
            return c4409b;
        }
        C4409b c4409b2 = new C4409b(this);
        this.f47502e = c4409b2;
        return c4409b2;
    }

    public final boolean l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean m(Collection collection) {
        int i5 = this.f47563c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i5 != this.f47563c;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final boolean n(Collection collection) {
        int i5 = this.f47563c;
        for (int i10 = i5 - 1; i10 >= 0; i10--) {
            if (!collection.contains(g(i10))) {
                i(i10);
            }
        }
        return i5 != this.f47563c;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        c(map.size() + this.f47563c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        C4411d c4411d = this.f47503f;
        if (c4411d != null) {
            return c4411d;
        }
        C4411d c4411d2 = new C4411d(this);
        this.f47503f = c4411d2;
        return c4411d2;
    }
}
