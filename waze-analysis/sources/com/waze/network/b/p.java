package com.waze.network.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f32087b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32088c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(byte[] bArr) {
        super("EAGAIN");
        h.g.b.x.f("EAGAIN", "searchPattern");
        this.f32087b = DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_8;
        this.f32088c = "EAGAIN (Try again)";
        this.f32089d = "EAGAIN";
    }

    @Override // com.waze.network.b.q
    public final int a() {
        return DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_8;
    }

    @Override // com.waze.network.b.q
    public final String b() {
        return this.f32088c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        int i2 = pVar.f32087b;
        return h.g.b.x.n(this.f32088c, pVar.f32088c) && h.g.b.x.n(this.f32089d, pVar.f32089d);
    }

    public final int hashCode() {
        return ((this.f32088c.hashCode() + 6727) * 31) + this.f32089d.hashCode();
    }

    public final String toString() {
        return "TryAgain(errorCode=217, errorMessage=" + this.f32088c + ", searchPattern=" + this.f32089d + ")";
    }

    public p() {
        this(null);
    }
}
