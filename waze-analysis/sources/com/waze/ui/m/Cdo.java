package com.waze.ui.m;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: WazeSource */
/* renamed from: com.waze.ui.m.do, reason: invalid class name */
/* loaded from: classes7.dex */
public final class Cdo {

    /* renamed from: a, reason: collision with root package name */
    private final String f42993a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42994b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42995c;

    public Cdo(String str, String str2, String str3) {
        h.g.b.x.f(str, TypedValues.TransitionType.S_DURATION);
        h.g.b.x.f(str2, "standardRate");
        this.f42993a = str;
        this.f42994b = str2;
        this.f42995c = str3;
    }

    public final String a() {
        return this.f42995c;
    }

    public final String b() {
        return this.f42993a;
    }

    public final String c() {
        return this.f42994b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cdo)) {
            return false;
        }
        Cdo cdo = (Cdo) obj;
        return h.g.b.x.n(this.f42993a, cdo.f42993a) && h.g.b.x.n(this.f42994b, cdo.f42994b) && h.g.b.x.n(this.f42995c, cdo.f42995c);
    }

    public final int hashCode() {
        int iHashCode = (this.f42993a.hashCode() * 31) + this.f42994b.hashCode();
        String str = this.f42995c;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ParkingRate(duration=" + this.f42993a + ", standardRate=" + this.f42994b + ", discountedRate=" + this.f42995c + ")";
    }
}
