package com.waze.main_screen.ab;

import com.waze.jni.protos.rtalerts.RtAlertItem;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    private final RtAlertItem f25657a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25658b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25659c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25660d;

    public e(RtAlertItem rtAlertItem, boolean z, String str, int i2) {
        x.f(rtAlertItem, "alertData");
        this.f25657a = rtAlertItem;
        this.f25658b = z;
        this.f25659c = str;
        this.f25660d = i2;
    }

    public final int a() {
        return this.f25660d;
    }

    public final RtAlertItem b() {
        return this.f25657a;
    }

    public final String c() {
        return this.f25659c;
    }

    public final boolean d() {
        return this.f25658b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return x.n(this.f25657a, eVar.f25657a) && this.f25658b == eVar.f25658b && x.n(this.f25659c, eVar.f25659c) && this.f25660d == eVar.f25660d;
    }

    public final int hashCode() {
        int iHashCode = this.f25657a.hashCode() * 31;
        String str = this.f25659c;
        return ((((iHashCode + a.a.a(this.f25658b)) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.f25660d;
    }

    public final String toString() {
        return "PingPopup(alertData=" + this.f25657a + ", private=" + this.f25658b + ", userImageUrl=" + this.f25659c + ", timeout=" + this.f25660d + ")";
    }
}
