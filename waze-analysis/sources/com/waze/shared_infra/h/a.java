package com.waze.shared_infra.h;

import h.a.i;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final a f37868a = new a(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private final int f37869b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37870c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37871d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37872e;

    public a(int i2, int i3, int i4, int i5) {
        this.f37869b = i2;
        this.f37870c = i3;
        this.f37871d = i4;
        this.f37872e = i5;
    }

    public final int a() {
        return this.f37871d;
    }

    public final int b() {
        return this.f37869b;
    }

    public final int c() {
        return this.f37870c;
    }

    public final int d() {
        return this.f37872e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f37869b == aVar.f37869b && this.f37870c == aVar.f37870c && this.f37871d == aVar.f37871d && this.f37872e == aVar.f37872e;
    }

    public final a f(a aVar) {
        x.f(aVar, "area");
        a aVar2 = f37868a;
        if (x.n(aVar, aVar2)) {
            return this;
        }
        if (x.n(this, aVar2)) {
            return aVar;
        }
        return new a(Math.max(this.f37869b, aVar.f37869b), Math.min(this.f37870c, aVar.f37870c), Math.max(this.f37871d, aVar.f37871d), Math.min(this.f37872e, aVar.f37872e));
    }

    public final a g(List list) {
        int iD;
        x.f(list, "positions");
        if (list.isEmpty()) {
            return this;
        }
        int iMax = this.f37869b;
        int iMin = this.f37870c;
        int iMax2 = this.f37871d;
        int iMin2 = this.f37872e;
        if (x.n(this, f37868a)) {
            c cVar = (c) i.P(list);
            iMax = cVar.c();
            iMin = cVar.c();
            iMax2 = cVar.d();
            iD = cVar.d();
            for (c cVar2 : i.ab(list, 1)) {
                iMax = Math.max(iMax, cVar2.c());
                iMin = Math.min(iMin, cVar2.c());
                iMax2 = Math.max(iMax2, cVar2.d());
                iD = Math.min(iD, cVar2.d());
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar3 = (c) it.next();
                iMax = Math.max(iMax, cVar3.c());
                iMin = Math.min(iMin, cVar3.c());
                iMax2 = Math.max(iMax2, cVar3.d());
                iMin2 = Math.min(iMin2, cVar3.d());
            }
            iD = iMin2;
        }
        return new a(iMax, iMin, iMax2, iD);
    }

    public final List h() {
        List listB = i.b();
        Iterator it = i.i(Integer.valueOf(this.f37869b), Integer.valueOf(this.f37870c)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Iterator it2 = i.i(Integer.valueOf(this.f37871d), Integer.valueOf(this.f37872e)).iterator();
            while (it2.hasNext()) {
                listB.add(new c(iIntValue, ((Number) it2.next()).intValue()));
            }
        }
        return i.a(listB);
    }

    public final int hashCode() {
        return (((((this.f37869b * 31) + this.f37870c) * 31) + this.f37871d) * 31) + this.f37872e;
    }

    public final boolean i() {
        return !x.n(this, f37868a);
    }

    public final String toString() {
        return "Area(north=" + this.f37869b + ", south=" + this.f37870c + ", east=" + this.f37871d + ", west=" + this.f37872e + ")";
    }
}
