package com.waze.network.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f32081b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32082c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(byte[] bArr) {
        super("android.net.ParseException: Failed to parse name");
        h.g.b.x.f("android.net.ParseException: Failed to parse name", "searchPattern");
        this.f32081b = DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_10;
        this.f32082c = "ParseException: Failed to parse name, too many labels";
        this.f32083d = "android.net.ParseException: Failed to parse name";
    }

    @Override // com.waze.network.b.q
    public final int a() {
        return DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_10;
    }

    @Override // com.waze.network.b.q
    public final String b() {
        return this.f32082c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        int i2 = nVar.f32081b;
        return h.g.b.x.n(this.f32082c, nVar.f32082c) && h.g.b.x.n(this.f32083d, nVar.f32083d);
    }

    public final int hashCode() {
        return ((this.f32082c.hashCode() + 6789) * 31) + this.f32083d.hashCode();
    }

    public final String toString() {
        return "ParseExTooManyLabels(errorCode=219, errorMessage=" + this.f32082c + ", searchPattern=" + this.f32083d + ")";
    }

    public n() {
        this(null);
    }
}
