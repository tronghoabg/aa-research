package com.waze;

import com.waze.jni.protos.navigate.DriveTo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jz extends ka {

    /* renamed from: a, reason: collision with root package name */
    private final DriveTo.DangerZoneType f24998a;

    /* renamed from: b, reason: collision with root package name */
    private final fq f24999b;

    public jz(DriveTo.DangerZoneType dangerZoneType, fq fqVar) {
        h.g.b.x.f(fqVar, "callback");
        this.f24998a = dangerZoneType;
        this.f24999b = fqVar;
    }

    public final fq b() {
        return this.f24999b;
    }

    public final DriveTo.DangerZoneType c() {
        return this.f24998a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz)) {
            return false;
        }
        jz jzVar = (jz) obj;
        return this.f24998a == jzVar.f24998a && h.g.b.x.n(this.f24999b, jzVar.f24999b);
    }

    public final int hashCode() {
        DriveTo.DangerZoneType dangerZoneType = this.f24998a;
        return ((dangerZoneType == null ? 0 : dangerZoneType.hashCode()) * 31) + this.f24999b.hashCode();
    }

    public final String toString() {
        return "ViaDangerZonePopup(dangerZoneType=" + this.f24998a + ", callback=" + this.f24999b + ")";
    }
}
