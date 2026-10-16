package com.waze.sharedui.h;

import com.waze.sharedui.profile.UserProfile;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final k f39055a = new k(false, com.waze.sharedui.profile.a.f39070a);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39056b;

    /* renamed from: c, reason: collision with root package name */
    private final UserProfile f39057c;

    public k(boolean z, UserProfile userProfile) {
        x.f(userProfile, "profile");
        this.f39056b = z;
        this.f39057c = userProfile;
    }

    public static /* synthetic */ k c(k kVar, boolean z, UserProfile userProfile, int i2) {
        if ((i2 & 1) != 0) {
            z = kVar.f39056b;
        }
        if ((i2 & 2) != 0) {
            userProfile = kVar.f39057c;
        }
        x.f(userProfile, "profile");
        return new k(z, userProfile);
    }

    public final boolean b() {
        return this.f39056b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f39056b == kVar.f39056b && x.n(this.f39057c, kVar.f39057c);
    }

    public final int hashCode() {
        return (a.a.a(this.f39056b) * 31) + this.f39057c.hashCode();
    }

    public final String toString() {
        return "WazeSessionState(loggedIn=" + this.f39056b + ", profile=" + this.f39057c + ")";
    }
}
