package T;

import Af.i;
import Q.e;
import S.c;
import ff.j;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends j implements e {

    /* renamed from: d, reason: collision with root package name */
    public static final b f11129d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f11130a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11131b;

    /* renamed from: c, reason: collision with root package name */
    public final c f11132c;

    static {
        U.b bVar = U.b.f11898a;
        f11129d = new b(bVar, bVar, c.f10799c);
    }

    public b(Object obj, Object obj2, c cVar) {
        this.f11130a = obj;
        this.f11131b = obj2;
        this.f11132c = cVar;
    }

    @Override // ff.AbstractC2646a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f11132c.containsKey(obj);
    }

    @Override // ff.AbstractC2646a
    public final int getSize() {
        c cVar = this.f11132c;
        cVar.getClass();
        return cVar.f10801b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new i(this.f11130a, this.f11132c);
    }
}
