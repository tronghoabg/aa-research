package com.waze.network.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f32078b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32079c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32080d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(byte[] bArr) {
        super("android.net.ParseException: Not an answer packet");
        h.g.b.x.f("android.net.ParseException: Not an answer packet", "searchPattern");
        this.f32078b = DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_9;
        this.f32079c = "ParseException: Not an answer packet";
        this.f32080d = "android.net.ParseException: Not an answer packet";
    }

    @Override // com.waze.network.b.q
    public final int a() {
        return DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_9;
    }

    @Override // com.waze.network.b.q
    public final String b() {
        return this.f32079c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        int i2 = mVar.f32078b;
        return h.g.b.x.n(this.f32079c, mVar.f32079c) && h.g.b.x.n(this.f32080d, mVar.f32080d);
    }

    public final int hashCode() {
        return ((this.f32079c.hashCode() + 6758) * 31) + this.f32080d.hashCode();
    }

    public final String toString() {
        return "ParseExNotAPacket(errorCode=218, errorMessage=" + this.f32079c + ", searchPattern=" + this.f32080d + ")";
    }

    public m() {
        this(null);
    }
}
