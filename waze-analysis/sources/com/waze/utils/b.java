package com.waze.utils;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f44857a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44858b;

    public b(String str, String str2) {
        h.g.b.x.f(str, "campaign");
        h.g.b.x.f(str2, "ucommId");
        this.f44857a = str;
        this.f44858b = str2;
    }

    public final String a() {
        return this.f44857a;
    }

    public final String b() {
        return this.f44858b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.g.b.x.n(this.f44857a, bVar.f44857a) && h.g.b.x.n(this.f44858b, bVar.f44858b);
    }

    public final int hashCode() {
        return (this.f44857a.hashCode() * 31) + this.f44858b.hashCode();
    }

    public final String toString() {
        return "CampaignUcommId(campaign=" + this.f44857a + ", ucommId=" + this.f44858b + ")";
    }
}
