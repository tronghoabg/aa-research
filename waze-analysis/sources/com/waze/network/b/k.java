package com.waze.network.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f32072b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32073c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32074d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(byte[] bArr) {
        super("no active network");
        h.g.b.x.f("no active network", "searchPattern");
        this.f32072b = DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_1;
        this.f32073c = "no active network";
        this.f32074d = "no active network";
    }

    @Override // com.waze.network.b.q
    public final int a() {
        return DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_1;
    }

    @Override // com.waze.network.b.q
    public final String b() {
        return this.f32073c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        int i2 = kVar.f32072b;
        return h.g.b.x.n(this.f32073c, kVar.f32073c) && h.g.b.x.n(this.f32074d, kVar.f32074d);
    }

    public final int hashCode() {
        return ((this.f32073c.hashCode() + 6510) * 31) + this.f32074d.hashCode();
    }

    public final String toString() {
        return "NoActiveNetwork(errorCode=210, errorMessage=" + this.f32073c + ", searchPattern=" + this.f32074d + ")";
    }

    public k() {
        this(null);
    }
}
