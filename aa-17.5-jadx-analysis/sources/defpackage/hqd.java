package defpackage;

import android.service.personalcontext.insight.ContextInsight;

/* loaded from: classes2.dex */
public final class hqd {
    public final ContextInsight a;
    public final hqc b;

    public hqd(ContextInsight contextInsight, hqc hqcVar) {
        this.a = contextInsight;
        this.b = hqcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqd)) {
            return false;
        }
        hqd hqdVar = (hqd) obj;
        return affa.f(this.a, hqdVar.a) && this.b == hqdVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "InsightGridItem(insight=" + this.a + ", span=" + this.b + ")";
    }
}
