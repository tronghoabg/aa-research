package com.waze.ac;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final p f13862a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13863b;

    public k(p pVar, String str) {
        this.f13862a = pVar;
        this.f13863b = str;
    }

    public final p a() {
        return this.f13862a;
    }

    public final String b() {
        return this.f13863b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return x.n(this.f13862a, kVar.f13862a) && x.n(this.f13863b, kVar.f13863b);
    }

    public final int hashCode() {
        int iHashCode = this.f13862a.hashCode() * 31;
        String str = this.f13863b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "EncouragementInfoData(encouragementType=" + this.f13862a + ", encouragementImageUrl=" + this.f13863b + ")";
    }
}
