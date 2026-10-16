package com.waze.sharedui.api;

import androidx.core.app.NotificationCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final PinCodeStatus f38801a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38802b;

    public f(PinCodeStatus pinCodeStatus, String str) {
        x.f(pinCodeStatus, NotificationCompat.CATEGORY_STATUS);
        x.f(str, "registrationToken");
        this.f38801a = pinCodeStatus;
        this.f38802b = str;
    }

    public final PinCodeStatus a() {
        return this.f38801a;
    }

    public final String b() {
        return this.f38802b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f38801a == fVar.f38801a && x.n(this.f38802b, fVar.f38802b);
    }

    public final int hashCode() {
        return (this.f38801a.hashCode() * 31) + this.f38802b.hashCode();
    }

    public final String toString() {
        return "CheckPinCodeResponse(status=" + this.f38801a + ", registrationToken=" + this.f38802b + ")";
    }
}
