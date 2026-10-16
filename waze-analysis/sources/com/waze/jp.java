package com.waze;

import com.waze.jni.protos.navigate.DriveTo;
import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jp extends ka {

    /* renamed from: a, reason: collision with root package name */
    private final DriveTo.DangerZoneType f24961a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24962b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.l f24963c;

    public jp(DriveTo.DangerZoneType dangerZoneType, boolean z, h.g.a.l lVar) {
        h.g.b.x.f(dangerZoneType, DriveToNativeManager.EXTRA_DANGER_ZONE_TYPE);
        h.g.b.x.f(lVar, "callback");
        this.f24961a = dangerZoneType;
        this.f24962b = z;
        this.f24963c = lVar;
    }

    public final DriveTo.DangerZoneType a() {
        return this.f24961a;
    }

    public final h.g.a.l b() {
        return this.f24963c;
    }

    public final boolean c() {
        return this.f24962b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp)) {
            return false;
        }
        jp jpVar = (jp) obj;
        return this.f24961a == jpVar.f24961a && this.f24962b == jpVar.f24962b && h.g.b.x.n(this.f24963c, jpVar.f24963c);
    }

    public final int hashCode() {
        return (((this.f24961a.hashCode() * 31) + a.a.a(this.f24962b)) * 31) + this.f24963c.hashCode();
    }

    public final String toString() {
        return "DestinationDangerZonePopup(dangerZoneType=" + this.f24961a + ", isIntendingToDrive=" + this.f24962b + ", callback=" + this.f24963c + ")";
    }
}
