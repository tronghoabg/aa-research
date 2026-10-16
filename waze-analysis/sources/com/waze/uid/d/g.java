package com.waze.uid.d;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f44452a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44453b;

    public g(String str, String str2) {
        this.f44452a = str;
        this.f44453b = str2;
    }

    public final String a() {
        return this.f44452a;
    }

    public final String b() {
        return this.f44453b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return x.n(this.f44452a, gVar.f44452a) && x.n(this.f44453b, gVar.f44453b);
    }

    public final int hashCode() {
        String str = this.f44452a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f44453b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "HomeWorkAddresses(home=" + this.f44452a + ", work=" + this.f44453b + ")";
    }
}
