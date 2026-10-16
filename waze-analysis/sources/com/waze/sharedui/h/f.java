package com.waze.sharedui.h;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends h {

    /* renamed from: a, reason: collision with root package name */
    private final String f39037a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f39038b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f39039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, Integer num, Boolean bool) {
        super(false);
        x.f(str, "failureReason");
        this.f39037a = str;
        this.f39038b = num;
        this.f39039c = bool;
    }

    public final Boolean a() {
        return this.f39039c;
    }

    public final Integer b() {
        return this.f39038b;
    }

    public final String c() {
        return this.f39037a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f39037a, fVar.f39037a) && x.n(this.f39038b, fVar.f39038b) && x.n(this.f39039c, fVar.f39039c);
    }

    public final int hashCode() {
        int iHashCode = this.f39037a.hashCode() * 31;
        Integer num = this.f39038b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f39039c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "Failure(failureReason=" + this.f39037a + ", errorCode=" + this.f39038b + ", isServerFailureReason=" + this.f39039c + ")";
    }

    public /* synthetic */ f(String str, Integer num, int i2) {
        this(str, (i2 & 2) != 0 ? null : num, (Boolean) null);
    }
}
