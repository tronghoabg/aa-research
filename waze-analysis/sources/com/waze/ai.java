package com.waze;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private final String f14062a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14063b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14064c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14065d;

    public ai(String str, boolean z, String str2, String str3) {
        h.g.b.x.f(str, "address");
        h.g.b.x.f(str2, "beginTime");
        h.g.b.x.f(str3, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f14062a = str;
        this.f14063b = z;
        this.f14064c = str2;
        this.f14065d = str3;
    }

    public final String a() {
        return this.f14062a;
    }

    public final String b() {
        return this.f14064c;
    }

    public final String c() {
        return this.f14065d;
    }

    public final boolean d() {
        return this.f14063b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return h.g.b.x.n(this.f14062a, aiVar.f14062a) && this.f14063b == aiVar.f14063b && h.g.b.x.n(this.f14064c, aiVar.f14064c) && h.g.b.x.n(this.f14065d, aiVar.f14065d);
    }

    public final int hashCode() {
        return (((((this.f14062a.hashCode() * 31) + a.a.a(this.f14063b)) * 31) + this.f14064c.hashCode()) * 31) + this.f14065d.hashCode();
    }

    public final String toString() {
        return "CalendarEvent(address=" + this.f14062a + ", recurring=" + this.f14063b + ", beginTime=" + this.f14064c + ", title=" + this.f14065d + ")";
    }
}
