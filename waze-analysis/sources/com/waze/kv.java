package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kv {

    /* renamed from: a, reason: collision with root package name */
    private final String f25070a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25071b;

    public kv(String str, String str2) {
        this.f25070a = str;
        this.f25071b = str2;
    }

    public final String a() {
        return this.f25070a;
    }

    public final String b() {
        return this.f25071b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv)) {
            return false;
        }
        kv kvVar = (kv) obj;
        return h.g.b.x.n(this.f25070a, kvVar.f25070a) && h.g.b.x.n(this.f25071b, kvVar.f25071b);
    }

    public final int hashCode() {
        String str = this.f25070a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f25071b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "UcommInfo(pushCampaignName=" + this.f25070a + ", pushUcommId=" + this.f25071b + ")";
    }
}
