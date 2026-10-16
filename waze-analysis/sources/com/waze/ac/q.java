package com.waze.ac;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final String f13868a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13869b;

    public q(String str, String str2) {
        this.f13868a = str;
        this.f13869b = str2;
    }

    public final String a() {
        return this.f13868a;
    }

    public final String b() {
        return this.f13869b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return x.n(this.f13868a, qVar.f13868a) && x.n(this.f13869b, qVar.f13869b);
    }

    public final int hashCode() {
        String str = this.f13868a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f13869b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SimpleQuestionData(id=" + this.f13868a + ", key=" + this.f13869b + ")";
    }
}
