package com.waze.bw.c.d;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bn {

    /* renamed from: a, reason: collision with root package name */
    private final long f17992a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17993b;

    public bn(long j2, String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f17992a = j2;
        this.f17993b = str;
    }

    public final long a() {
        return this.f17992a;
    }

    public final String b() {
        return this.f17993b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        return this.f17992a == bnVar.f17992a && h.g.b.x.n(this.f17993b, bnVar.f17993b);
    }

    public final int hashCode() {
        return (a.a.b(this.f17992a) * 31) + this.f17993b.hashCode();
    }

    public final String toString() {
        return "Favorite(id=" + this.f17992a + ", name=" + this.f17993b + ")";
    }
}
