package org.a.d.c;

import h.a.i;
import h.g.a.p;
import h.g.b.x;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.z;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final org.a.d.i.a f56374a;

    /* renamed from: b, reason: collision with root package name */
    private final h.l.c f56375b;

    /* renamed from: c, reason: collision with root package name */
    private final org.a.d.i.a f56376c;

    /* renamed from: d, reason: collision with root package name */
    private final p f56377d;

    /* renamed from: e, reason: collision with root package name */
    private final c f56378e;

    /* renamed from: f, reason: collision with root package name */
    private List f56379f;

    /* renamed from: g, reason: collision with root package name */
    private b f56380g;

    public a(org.a.d.i.a aVar, h.l.c cVar, org.a.d.i.a aVar2, p pVar, c cVar2, List list) {
        x.f(aVar, "scopeQualifier");
        x.f(cVar, "primaryType");
        x.f(pVar, "definition");
        x.f(cVar2, "kind");
        x.f(list, "secondaryTypes");
        this.f56374a = aVar;
        this.f56375b = cVar;
        this.f56376c = aVar2;
        this.f56377d = pVar;
        this.f56378e = cVar2;
        this.f56379f = list;
        this.f56380g = new b((byte[]) null);
    }

    public final List a() {
        return this.f56379f;
    }

    public final p b() {
        return this.f56377d;
    }

    public final h.l.c c() {
        return this.f56375b;
    }

    public final b d() {
        return this.f56380g;
    }

    public final org.a.d.i.a e() {
        return this.f56376c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        x.d(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        a aVar = (a) obj;
        return x.n(this.f56375b, aVar.f56375b) && x.n(this.f56376c, aVar.f56376c) && x.n(this.f56374a, aVar.f56374a);
    }

    public final org.a.d.i.a f() {
        return this.f56374a;
    }

    public final void g(b bVar) {
        x.f(bVar, "<set-?>");
        this.f56380g = bVar;
    }

    public final void h(List list) {
        x.f(list, "<set-?>");
        this.f56379f = list;
    }

    public final int hashCode() {
        org.a.d.i.a aVar = this.f56376c;
        return ((((aVar != null ? aVar.hashCode() : 0) * 31) + this.f56375b.hashCode()) * 31) + this.f56374a.hashCode();
    }

    public final String toString() {
        String strConcat;
        String strConcat2;
        String string = this.f56378e.toString();
        String str = "'" + org.a.e.a.a(this.f56375b) + "'";
        org.a.d.i.a aVar = this.f56376c;
        if (aVar != null) {
            Objects.toString(aVar);
            strConcat = ",qualifier:".concat(aVar.toString());
        } else {
            strConcat = "";
        }
        org.a.d.i.a aVar2 = this.f56374a;
        if (x.n(aVar2, org.a.d.j.a.f56411b)) {
            strConcat2 = "";
        } else {
            Objects.toString(aVar2);
            strConcat2 = ",scope:".concat(String.valueOf(aVar2));
        }
        return "[" + string + ":" + str + strConcat + strConcat2 + (this.f56379f.isEmpty() ? "" : ",binds:".concat(i.aM(this.f56379f, ",", null, null, 0, new z(10), 30))) + "]";
    }
}
