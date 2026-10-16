package com.waze.bw.c.d;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class df extends dh {

    /* renamed from: a, reason: collision with root package name */
    private final String f18089a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18090b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(String str, long j2) {
        super(null);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f18089a = str;
        this.f18090b = j2;
    }

    public final long a() {
        return this.f18090b;
    }

    public final String b() {
        return this.f18089a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df)) {
            return false;
        }
        df dfVar = (df) obj;
        return h.g.b.x.n(this.f18089a, dfVar.f18089a) && this.f18090b == dfVar.f18090b;
    }

    public final int hashCode() {
        return (this.f18089a.hashCode() * 31) + a.a.b(this.f18090b);
    }

    public final String toString() {
        return "Named(name=" + this.f18089a + ", id=" + this.f18090b + ")";
    }
}
