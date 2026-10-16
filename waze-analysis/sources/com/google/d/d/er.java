package com.google.d.d;

import java.io.Serializable;
import java.lang.Comparable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class er<C extends Comparable> implements Serializable, com.google.d.b.ab {

    /* renamed from: c, reason: collision with root package name */
    private static final er f7579c = new er(aw.f7441b, au.f7440b);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final ay f7580a;

    /* renamed from: b, reason: collision with root package name */
    final ay f7581b;

    private er(ay ayVar, ay ayVar2) {
        this.f7580a = ayVar;
        this.f7581b = ayVar2;
        if (ayVar.compareTo(ayVar2) > 0 || ayVar == au.f7440b || ayVar2 == aw.f7441b) {
            throw new IllegalArgumentException("Invalid range: ".concat(j(ayVar, ayVar2)));
        }
    }

    static int a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static er b() {
        return f7579c;
    }

    public static er c(Comparable comparable, Comparable comparable2) {
        return new er(new ax(comparable), new av(comparable2));
    }

    public static er d(Comparable comparable, Comparable comparable2) {
        return new er(new ax(comparable), new ax(comparable2));
    }

    static er e(ay ayVar, ay ayVar2) {
        return new er(ayVar, ayVar2);
    }

    private static String j(ay ayVar, ay ayVar2) {
        StringBuilder sb = new StringBuilder(16);
        ayVar.d(sb);
        sb.append("..");
        ayVar2.e(sb);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof er) {
            er erVar = (er) obj;
            if (this.f7580a.equals(erVar.f7580a) && this.f7581b.equals(erVar.f7581b)) {
                return true;
            }
        }
        return false;
    }

    public final Comparable f() {
        return this.f7581b.c();
    }

    @Override // com.google.d.b.ab
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean apply(Comparable comparable) {
        com.google.d.b.an.B(comparable);
        return this.f7580a.f(comparable) && !this.f7581b.f(comparable);
    }

    public final boolean h() {
        return this.f7581b != au.f7440b;
    }

    public final int hashCode() {
        return (this.f7580a.hashCode() * 31) + this.f7581b.hashCode();
    }

    public final boolean i() {
        return this.f7580a.equals(this.f7581b);
    }

    Object readResolve() {
        er erVar = f7579c;
        return equals(erVar) ? erVar : this;
    }

    public final String toString() {
        return j(this.f7580a, this.f7581b);
    }
}
