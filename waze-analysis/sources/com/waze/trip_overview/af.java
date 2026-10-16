package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class af extends com.waze.uid.c.al {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40994a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40995b;

    public af(boolean z, boolean z2) {
        super((byte[]) null);
        this.f40994a = z;
        this.f40995b = z2;
    }

    public final boolean a() {
        return this.f40994a;
    }

    public final boolean b() {
        return this.f40995b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return this.f40994a == afVar.f40994a && this.f40995b == afVar.f40995b;
    }

    public final int hashCode() {
        return (a.a.a(this.f40994a) * 31) + a.a.a(this.f40995b);
    }

    public final String toString() {
        return "RouteSettingsDisabledRoutesDialog(ferriesReceived=" + this.f40994a + ", tollsReceived=" + this.f40995b + ")";
    }
}
