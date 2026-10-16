package com.waze.bd.a;

import androidx.autofill.HintConstants;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    private final long f16211a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16212b;

    public h(long j2, String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f16211a = j2;
        this.f16212b = str;
    }

    public final long a() {
        return this.f16211a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f16211a == hVar.f16211a && x.n(this.f16212b, hVar.f16212b);
    }

    public final int hashCode() {
        return (a.a.b(this.f16211a) * 31) + this.f16212b.hashCode();
    }

    public final String toString() {
        return "Named(id=" + this.f16211a + ", name=" + this.f16212b + ")";
    }
}
