package com.waze.main_screen.ab;

import com.waze.user.FriendUserData;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    private final FriendUserData f25661a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25662b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25663c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25664d;

    public f(FriendUserData friendUserData, int i2, String str, String str2) {
        x.f(friendUserData, "user");
        this.f25661a = friendUserData;
        this.f25662b = i2;
        this.f25663c = str;
        this.f25664d = str2;
    }

    public final int a() {
        return this.f25662b;
    }

    public final FriendUserData b() {
        return this.f25661a;
    }

    public final String c() {
        return this.f25664d;
    }

    public final String d() {
        return this.f25663c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f25661a, fVar.f25661a) && this.f25662b == fVar.f25662b && x.n(this.f25663c, fVar.f25663c) && x.n(this.f25664d, fVar.f25664d);
    }

    public final int hashCode() {
        int iHashCode = this.f25661a.hashCode() * 31;
        String str = this.f25663c;
        int iHashCode2 = (((iHashCode + this.f25662b) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25664d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SharePopup(user=" + this.f25661a + ", type=" + this.f25662b + ", meeting=" + this.f25663c + ", locationText=" + this.f25664d + ")";
    }
}
