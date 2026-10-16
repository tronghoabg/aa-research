package com.waze.network.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f32063b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32064c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(byte[] bArr) {
        super("ECONNREFUSED");
        h.g.b.x.f("ECONNREFUSED", "searchPattern");
        this.f32063b = DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_5;
        this.f32064c = "ECONNREFUSED (Connection refused)";
        this.f32065d = "ECONNREFUSED";
    }

    @Override // com.waze.network.b.q
    public final int a() {
        return DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_5;
    }

    @Override // com.waze.network.b.q
    public final String b() {
        return this.f32064c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        int i2 = hVar.f32063b;
        return h.g.b.x.n(this.f32064c, hVar.f32064c) && h.g.b.x.n(this.f32065d, hVar.f32065d);
    }

    public final int hashCode() {
        return ((this.f32064c.hashCode() + 6634) * 31) + this.f32065d.hashCode();
    }

    public final String toString() {
        return "ConnectionRefused(errorCode=214, errorMessage=" + this.f32064c + ", searchPattern=" + this.f32065d + ")";
    }

    public h() {
        this(null);
    }
}
