package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f22839a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22840b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22841c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f22842d;

    public l(String str, String str2, String str3, Long l2) {
        this.f22839a = str;
        this.f22840b = str2;
        this.f22841c = str3;
        this.f22842d = l2;
    }

    public final Long a() {
        return this.f22842d;
    }

    public final String b() {
        return this.f22839a;
    }

    public final String c() {
        return this.f22840b;
    }

    public final String d() {
        return this.f22841c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.g.b.x.n(this.f22839a, lVar.f22839a) && h.g.b.x.n(this.f22840b, lVar.f22840b) && h.g.b.x.n(this.f22841c, lVar.f22841c) && h.g.b.x.n(this.f22842d, lVar.f22842d);
    }

    public final int hashCode() {
        String str = this.f22839a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f22840b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        String str3 = this.f22841c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f22842d;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "CopilotSelectionRequestData(carId=" + this.f22839a + ", moodId=" + this.f22840b + ", voiceId=" + this.f22841c + ", campaignId=" + this.f22842d + ")";
    }
}
