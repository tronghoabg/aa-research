package com.waze.bw.c.d;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17994a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17995b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17996c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f17997d;

    /* renamed from: e, reason: collision with root package name */
    private final List f17998e;

    public bo(boolean z, boolean z2, boolean z3, boolean z4, List list) {
        h.g.b.x.f(list, "favorites");
        this.f17994a = z;
        this.f17995b = z2;
        this.f17996c = z3;
        this.f17997d = z4;
        this.f17998e = list;
    }

    public static /* synthetic */ bo f(bo boVar, boolean z, boolean z2, boolean z3, List list, int i2) {
        if ((i2 & 1) != 0) {
            z = boVar.f17994a;
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            z2 = boVar.f17995b;
        }
        boolean z5 = z2;
        boolean z6 = (i2 & 4) != 0 ? boVar.f17996c : false;
        if ((i2 & 8) != 0) {
            z3 = boVar.f17997d;
        }
        boolean z7 = z3;
        if ((i2 & 16) != 0) {
            list = boVar.f17998e;
        }
        List list2 = list;
        h.g.b.x.f(list2, "favorites");
        return new bo(z4, z5, z6, z7, list2);
    }

    public final List a() {
        return this.f17998e;
    }

    public final boolean b() {
        return this.f17997d;
    }

    public final boolean c() {
        return this.f17996c;
    }

    public final boolean d() {
        return this.f17994a;
    }

    public final boolean e() {
        return this.f17995b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo)) {
            return false;
        }
        bo boVar = (bo) obj;
        return this.f17994a == boVar.f17994a && this.f17995b == boVar.f17995b && this.f17996c == boVar.f17996c && this.f17997d == boVar.f17997d && h.g.b.x.n(this.f17998e, boVar.f17998e);
    }

    public final int hashCode() {
        int iA = a.a.a(this.f17994a);
        List list = this.f17998e;
        boolean z = this.f17997d;
        return (((((((iA * 31) + a.a.a(this.f17995b)) * 31) + a.a.a(this.f17996c)) * 31) + a.a.a(z)) * 31) + list.hashCode();
    }

    public final String toString() {
        return "Favorites(isHomeSet=" + this.f17994a + ", isWorkSet=" + this.f17995b + ", showHowWorkSubtitle=" + this.f17996c + ", areAnyFavoritesSaved=" + this.f17997d + ", favorites=" + this.f17998e + ")";
    }
}
