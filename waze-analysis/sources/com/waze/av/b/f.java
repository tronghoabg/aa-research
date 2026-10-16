package com.waze.av.b;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f extends h {

    /* renamed from: a, reason: collision with root package name */
    private final long f15949a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15950b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15951c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j2, String str, long j3, int i2) {
        super(null);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f15949a = j2;
        this.f15950b = str;
        this.f15951c = j3;
        this.f15952d = i2;
    }

    @Override // com.waze.av.b.h
    public final long a() {
        return this.f15949a;
    }

    @Override // com.waze.av.b.h
    public final long b() {
        return this.f15951c;
    }

    public final int c() {
        return this.f15952d;
    }

    public final String d() {
        return this.f15950b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f15949a == fVar.f15949a && h.g.b.x.n(this.f15950b, fVar.f15950b) && this.f15951c == fVar.f15951c && this.f15952d == fVar.f15952d;
    }

    public final int hashCode() {
        return (((((a.a.b(this.f15949a) * 31) + this.f15950b.hashCode()) * 31) + a.a.b(this.f15951c)) * 31) + this.f15952d;
    }

    public final String toString() {
        return "Named(id=" + this.f15949a + ", name=" + this.f15950b + ", serverId=" + this.f15951c + ", userDefinedRank=" + this.f15952d + ")";
    }
}
