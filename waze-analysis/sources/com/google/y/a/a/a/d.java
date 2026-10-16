package com.google.y.a.a.a;

import com.google.d.b.an;
import com.google.v.v;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    private final v f13419a;

    d(v vVar) {
        an.B(vVar);
        this.f13419a = vVar;
    }

    @Override // com.google.y.a.a.a.j
    protected final int a() {
        return d((byte) 64);
    }

    public final v c() {
        return this.f13419a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        j jVar = (j) obj;
        if (a() != jVar.a()) {
            return a() - jVar.a();
        }
        v vVar = this.f13419a;
        int iC = vVar.c();
        v vVar2 = ((d) jVar).f13419a;
        if (iC != vVar2.c()) {
            return vVar.c() - vVar2.c();
        }
        return com.google.d.l.j.c().compare(vVar.x(), vVar2.x());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f13419a.equals(((d) obj).f13419a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(a()), this.f13419a);
    }

    public final String toString() {
        return "h'" + com.google.d.h.f.l().i().o(this.f13419a.x()) + "'";
    }
}
