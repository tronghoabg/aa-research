package com.waze.navigate.location_preview;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f31720a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31721b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31722c;

    public f(String str, long j2, boolean z) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f31720a = str;
        this.f31721b = j2;
        this.f31722c = z;
    }

    public final long a() {
        return this.f31721b;
    }

    public final String b() {
        return this.f31720a;
    }

    public final boolean c() {
        return this.f31722c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.g.b.x.n(this.f31720a, fVar.f31720a) && this.f31721b == fVar.f31721b && this.f31722c == fVar.f31722c;
    }

    public final int hashCode() {
        return (((this.f31720a.hashCode() * 31) + a.a.b(this.f31721b)) * 31) + a.a.a(this.f31722c);
    }

    public final String toString() {
        return "EventData(name=" + this.f31720a + ", time=" + this.f31721b + ", unverified=" + this.f31722c + ")";
    }
}
