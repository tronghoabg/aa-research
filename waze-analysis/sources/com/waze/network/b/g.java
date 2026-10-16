package com.waze.network.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f32060b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32061c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(byte[] bArr) {
        super("EBUSY");
        h.g.b.x.f("EBUSY", "searchPattern");
        this.f32060b = DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_7;
        this.f32061c = "EBUSY (Device or resource busy";
        this.f32062d = "EBUSY";
    }

    @Override // com.waze.network.b.q
    public final int a() {
        return DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_7;
    }

    @Override // com.waze.network.b.q
    public final String b() {
        return this.f32061c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        int i2 = gVar.f32060b;
        return h.g.b.x.n(this.f32061c, gVar.f32061c) && h.g.b.x.n(this.f32062d, gVar.f32062d);
    }

    public final int hashCode() {
        return ((this.f32061c.hashCode() + 6696) * 31) + this.f32062d.hashCode();
    }

    public final String toString() {
        return "Busy(errorCode=216, errorMessage=" + this.f32061c + ", searchPattern=" + this.f32062d + ")";
    }

    public g() {
        this(null);
    }
}
