package com.waze.planned_drive;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.jni.protos.navigate.DriveTo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cb extends cf {

    /* renamed from: a, reason: collision with root package name */
    private final DriveTo.DangerZoneType f33298a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.l f33299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(DriveTo.DangerZoneType dangerZoneType, h.g.a.l lVar) {
        super(null);
        h.g.b.x.f(dangerZoneType, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(lVar, "onResult");
        this.f33298a = dangerZoneType;
        this.f33299b = lVar;
    }

    public final DriveTo.DangerZoneType a() {
        return this.f33298a;
    }

    public final h.g.a.l b() {
        return this.f33299b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return this.f33298a == cbVar.f33298a && h.g.b.x.n(this.f33299b, cbVar.f33299b);
    }

    public final int hashCode() {
        return (this.f33298a.hashCode() * 31) + this.f33299b.hashCode();
    }

    public final String toString() {
        return "ConfirmDangerZone(type=" + this.f33298a + ", onResult=" + this.f33299b + ")";
    }
}
