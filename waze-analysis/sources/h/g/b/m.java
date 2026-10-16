package h.g.b;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements h.l.c, l {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f48123a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f48124b;

    static {
        int i2 = 0;
        List listI = h.a.i.i(h.g.a.a.class, h.g.a.l.class, h.g.a.p.class, h.g.a.q.class, h.g.a.r.class, h.g.a.s.class, h.g.a.t.class, h.g.a.u.class, h.g.a.v.class, h.g.a.w.class, h.g.a.b.class, h.g.a.c.class, h.g.a.d.class, h.g.a.e.class, h.g.a.f.class, h.g.a.g.class, h.g.a.h.class, h.g.a.i.class, h.g.a.j.class, h.g.a.k.class, h.g.a.m.class, h.g.a.n.class, h.g.a.o.class);
        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
        for (Object obj : listI) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.i.p();
            }
            arrayList.add(new h.k((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f48123a = h.a.r.q(arrayList);
    }

    public m(Class cls) {
        x.f(cls, "jClass");
        this.f48124b = cls;
    }

    @Override // h.g.b.l
    public final Class a() {
        return this.f48124b;
    }

    @Override // h.l.c
    public final String b() {
        return o.p(this.f48124b);
    }

    @Override // h.l.c
    public final String c() {
        return o.q(this.f48124b);
    }

    @Override // h.l.c
    public final boolean d(Object obj) {
        Class clsX = this.f48124b;
        x.f(clsX, "jClass");
        Map map = f48123a;
        x.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsX);
        if (num != null) {
            return au.e(obj, num.intValue());
        }
        if (clsX.isPrimitive()) {
            clsX = o.x(o.y(clsX));
        }
        return clsX.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && x.n(o.x(this), o.x((h.l.c) obj));
    }

    @Override // h.l.a
    public final List<Annotation> getAnnotations() {
        throw null;
    }

    @Override // h.l.c
    public final int hashCode() {
        return o.x(this).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f48124b.toString()).concat(" (Kotlin reflection is not available)");
    }
}
