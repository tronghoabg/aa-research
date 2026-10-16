package com.waze.car_lib.screens;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cx extends com.waze.car_lib.r.co {

    /* renamed from: a, reason: collision with root package name */
    private final String f21986a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21987b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(String str, String str2) {
        super(null);
        h.g.b.x.f(str, "searchPhrase");
        this.f21986a = str;
        this.f21987b = str2;
    }

    public final String a() {
        return this.f21987b;
    }

    public final String b() {
        return this.f21986a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx)) {
            return false;
        }
        cx cxVar = (cx) obj;
        return h.g.b.x.n(this.f21986a, cxVar.f21986a) && h.g.b.x.n(this.f21987b, cxVar.f21987b);
    }

    public final int hashCode() {
        int iHashCode = this.f21986a.hashCode() * 31;
        String str = this.f21987b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Phrase(searchPhrase=" + this.f21986a + ", forcedSearchId=" + this.f21987b + ")";
    }
}
