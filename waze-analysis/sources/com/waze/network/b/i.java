package com.waze.network.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f32066b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32067c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(byte[] bArr) {
        super("TimeoutCancellationException");
        h.g.b.x.f("TimeoutCancellationException", "searchPattern");
        this.f32066b = DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_2;
        this.f32067c = "Dns resolver timed out";
        this.f32068d = "TimeoutCancellationException";
    }

    @Override // com.waze.network.b.q
    public final int a() {
        return DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_2;
    }

    @Override // com.waze.network.b.q
    public final String b() {
        return this.f32067c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        int i2 = iVar.f32066b;
        return h.g.b.x.n(this.f32067c, iVar.f32067c) && h.g.b.x.n(this.f32068d, iVar.f32068d);
    }

    public final int hashCode() {
        return ((this.f32067c.hashCode() + 6541) * 31) + this.f32068d.hashCode();
    }

    public final String toString() {
        return "DnsTimeOut(errorCode=211, errorMessage=" + this.f32067c + ", searchPattern=" + this.f32068d + ")";
    }

    public i() {
        this(null);
    }
}
