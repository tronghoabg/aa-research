package com.waze.copilot.data;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final String f23082a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23083b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23084c;

    public y(String str, String str2, String str3) {
        this.f23082a = str;
        this.f23083b = str2;
        this.f23084c = str3;
    }

    public final String a() {
        return this.f23082a;
    }

    public final String b() {
        return this.f23083b;
    }

    public final String c() {
        return this.f23084c;
    }

    public final String d() {
        return this.f23082a;
    }

    public final String e() {
        return this.f23083b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return h.g.b.x.n(this.f23082a, yVar.f23082a) && h.g.b.x.n(this.f23083b, yVar.f23083b) && h.g.b.x.n(this.f23084c, yVar.f23084c);
    }

    public final String f() {
        return this.f23084c;
    }

    public final boolean g() {
        return (this.f23082a == null && this.f23083b == null && this.f23084c == null) ? false : true;
    }

    public final int hashCode() {
        String str = this.f23082a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f23083b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        String str3 = this.f23084c;
        return ((i2 + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "CopilotAssetsIds(carName=" + this.f23082a + ", moodName=" + this.f23083b + ", voiceId=" + this.f23084c + ")";
    }

    public y() {
        this(null, null, null);
    }
}
