package com.waze.network.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f32084b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32085c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(byte[] bArr) {
        super("ESRCH");
        h.g.b.x.f("ESRCH", "searchPattern");
        this.f32084b = DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_3;
        this.f32085c = "ESRCH (client process not found)";
        this.f32086d = "ESRCH";
    }

    @Override // com.waze.network.b.q
    public final int a() {
        return DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_3;
    }

    @Override // com.waze.network.b.q
    public final String b() {
        return this.f32085c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        int i2 = oVar.f32084b;
        return h.g.b.x.n(this.f32085c, oVar.f32085c) && h.g.b.x.n(this.f32086d, oVar.f32086d);
    }

    public final int hashCode() {
        return ((this.f32085c.hashCode() + 6572) * 31) + this.f32086d.hashCode();
    }

    public final String toString() {
        return "ProcessNotFound(errorCode=212, errorMessage=" + this.f32085c + ", searchPattern=" + this.f32086d + ")";
    }

    public o() {
        this(null);
    }
}
