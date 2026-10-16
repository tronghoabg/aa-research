package com.waze.bw.a.c;

import androidx.autofill.HintConstants;
import com.waze.sharedui.web.at;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends at {

    /* renamed from: a, reason: collision with root package name */
    private final long f17654a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17655b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j2, String str) {
        super(null);
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f17654a = j2;
        this.f17655b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f17654a == lVar.f17654a && x.n(this.f17655b, lVar.f17655b);
    }

    public final int hashCode() {
        return (a.a.b(this.f17654a) * 31) + this.f17655b.hashCode();
    }

    public final long s() {
        return this.f17654a;
    }

    public final String t() {
        return this.f17655b;
    }

    public final String toString() {
        return "Named(id=" + this.f17654a + ", name=" + this.f17655b + ")";
    }
}
