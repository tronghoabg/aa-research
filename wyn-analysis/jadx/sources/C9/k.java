package c9;

import A7.C0295v;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class k extends c {

    /* renamed from: a, reason: collision with root package name */
    public final g f19814a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f19815b;

    public k(g gVar, Comparator comparator) {
        this.f19814a = gVar;
        this.f19815b = comparator;
    }

    @Override // c9.c
    public final boolean a(Object obj) {
        return j(obj) != null;
    }

    @Override // c9.c
    public final Object b(s9.h hVar) {
        g gVarJ = j(hVar);
        if (gVarJ != null) {
            return gVarJ.getValue();
        }
        return null;
    }

    @Override // c9.c
    public final Comparator c() {
        return this.f19815b;
    }

    @Override // c9.c
    public final Object d() {
        return this.f19814a.h().getKey();
    }

    @Override // c9.c
    public final Object e() {
        return this.f19814a.g().getKey();
    }

    @Override // c9.c
    public final int f(s9.k kVar) {
        g gVarA = this.f19814a;
        int i5 = 0;
        while (!gVarA.isEmpty()) {
            int iCompare = this.f19815b.compare(kVar, gVarA.getKey());
            if (iCompare == 0) {
                return gVarA.a().size() + i5;
            }
            if (iCompare < 0) {
                gVarA = gVarA.a();
            } else {
                int size = gVarA.a().size() + 1 + i5;
                gVarA = gVarA.b();
                i5 = size;
            }
        }
        return -1;
    }

    @Override // c9.c
    public final c g(Object obj, Object obj2) {
        g gVar = this.f19814a;
        Comparator comparator = this.f19815b;
        return new k(((i) gVar.e(obj, obj2, comparator)).c(2, null, null), comparator);
    }

    @Override // c9.c
    public final Iterator h(Object obj) {
        return new C0295v(this.f19814a, obj, this.f19815b);
    }

    @Override // c9.c
    public final c i(Object obj) {
        if (!a(obj)) {
            return this;
        }
        g gVar = this.f19814a;
        Comparator comparator = this.f19815b;
        return new k(gVar.f(obj, comparator).c(2, null, null), comparator);
    }

    @Override // c9.c
    public final boolean isEmpty() {
        return this.f19814a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0295v(this.f19814a, null, this.f19815b);
    }

    public final g j(Object obj) {
        g gVarA = this.f19814a;
        while (!gVarA.isEmpty()) {
            int iCompare = this.f19815b.compare(obj, gVarA.getKey());
            if (iCompare < 0) {
                gVarA = gVarA.a();
            } else {
                if (iCompare == 0) {
                    return gVarA;
                }
                gVarA = gVarA.b();
            }
        }
        return null;
    }

    @Override // c9.c
    public final int size() {
        return this.f19814a.size();
    }
}
