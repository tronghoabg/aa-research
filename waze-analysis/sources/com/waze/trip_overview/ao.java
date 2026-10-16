package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    private final String f41006a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41007b;

    public ao(String str, String str2) {
        h.g.b.x.f(str, "saves");
        h.g.b.x.f(str2, "saved");
        this.f41006a = str;
        this.f41007b = str2;
    }

    public final String a() {
        return this.f41007b;
    }

    public final String b() {
        return this.f41006a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return h.g.b.x.n(this.f41006a, aoVar.f41006a) && h.g.b.x.n(this.f41007b, aoVar.f41007b);
    }

    public final int hashCode() {
        return (this.f41006a.hashCode() * 31) + this.f41007b.hashCode();
    }

    public final String toString() {
        return "HovSavingTime(saves=" + this.f41006a + ", saved=" + this.f41007b + ")";
    }
}
