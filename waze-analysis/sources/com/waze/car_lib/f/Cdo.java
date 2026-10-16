package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* renamed from: com.waze.car_lib.f.do, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Cdo extends com.waze.ab.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19495a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19496b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cdo(boolean z, String str) {
        super(null);
        h.g.b.x.f(str, "appDownloadUrl");
        this.f19495a = z;
        this.f19496b = str;
    }

    public final String a() {
        return this.f19496b;
    }

    public final boolean b() {
        return this.f19495a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cdo)) {
            return false;
        }
        Cdo cdo = (Cdo) obj;
        return this.f19495a == cdo.f19495a && h.g.b.x.n(this.f19496b, cdo.f19496b);
    }

    public final int hashCode() {
        return (a.a.a(this.f19495a) * 31) + this.f19496b.hashCode();
    }

    public final String toString() {
        return "ForceUpgrade(hasUnsupportedOs=" + this.f19495a + ", appDownloadUrl=" + this.f19496b + ")";
    }
}
