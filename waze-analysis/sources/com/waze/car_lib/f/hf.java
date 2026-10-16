package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hf extends com.waze.car_lib.o.ae {

    /* renamed from: a, reason: collision with root package name */
    private final String f19651a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19652b;

    public hf(String str, String str2) {
        super(null);
        this.f19651a = str;
        this.f19652b = str2;
    }

    public final String a() {
        return this.f19652b;
    }

    public final String b() {
        return this.f19651a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf)) {
            return false;
        }
        hf hfVar = (hf) obj;
        return h.g.b.x.n(this.f19651a, hfVar.f19651a) && h.g.b.x.n(this.f19652b, hfVar.f19652b);
    }

    public final int hashCode() {
        String str = this.f19651a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f19652b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "TextSearch(searchTerm=" + this.f19651a + ", forcedSearchId=" + this.f19652b + ")";
    }
}
