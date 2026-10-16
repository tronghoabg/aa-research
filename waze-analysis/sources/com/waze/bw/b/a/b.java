package com.waze.bw.b.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f17679a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17680b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17681c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17682d;

    public b(com.waze.shared_infra.h.c cVar, String str, String str2, String str3) {
        x.f(cVar, "coordinate");
        this.f17679a = cVar;
        this.f17680b = str;
        this.f17681c = str2;
        this.f17682d = str3;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f17679a;
    }

    public final String b() {
        return this.f17681c;
    }

    public final String c() {
        return this.f17680b;
    }

    public final String d() {
        return this.f17682d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f17679a, bVar.f17679a) && x.n(this.f17680b, bVar.f17680b) && x.n(this.f17681c, bVar.f17681c) && x.n(this.f17682d, bVar.f17682d);
    }

    public final int hashCode() {
        int iHashCode = this.f17679a.hashCode() * 31;
        String str = this.f17680b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17681c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17682d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "Location(coordinate=" + this.f17679a + ", state=" + this.f17680b + ", city=" + this.f17681c + ", street=" + this.f17682d + ")";
    }

    public /* synthetic */ b(com.waze.shared_infra.h.c cVar) {
        this(cVar, null, null, null);
    }
}
