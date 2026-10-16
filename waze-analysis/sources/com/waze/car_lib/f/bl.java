package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bl extends bn {

    /* renamed from: a, reason: collision with root package name */
    private final String f19427a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19428b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19429c;

    public bl(String str, boolean z, String str2) {
        super(null);
        this.f19427a = str;
        this.f19428b = z;
        this.f19429c = str2;
    }

    public final String a() {
        return this.f19429c;
    }

    public final String b() {
        return this.f19427a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl)) {
            return false;
        }
        bl blVar = (bl) obj;
        return h.g.b.x.n(this.f19427a, blVar.f19427a) && this.f19428b == blVar.f19428b && h.g.b.x.n(this.f19429c, blVar.f19429c);
    }

    public final int hashCode() {
        String str = this.f19427a;
        int iHashCode = str == null ? 0 : str.hashCode();
        boolean z = this.f19428b;
        String str2 = this.f19429c;
        return (((iHashCode * 31) + a.a.a(z)) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Phrase(searchTerm=" + this.f19427a + ", isVoiceSearch=" + this.f19428b + ", forcedSearchId=" + this.f19429c + ")";
    }
}
