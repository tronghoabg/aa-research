package defpackage;

import android.service.personalcontext.insight.ContextInsight;

/* loaded from: classes2.dex */
public final class hqe {
    public final ContextInsight a;
    private final String b;

    public hqe(String str, ContextInsight contextInsight) {
        this.b = str;
        this.a = contextInsight;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqe)) {
            return false;
        }
        hqe hqeVar = (hqe) obj;
        return affa.f(this.b, hqeVar.b) && affa.f(this.a, hqeVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        ContextInsight contextInsight = this.a;
        return iHashCode + (contextInsight == null ? 0 : contextInsight.hashCode());
    }

    public final String toString() {
        return "LabeledContextInsight(label=" + this.b + ", insight=" + this.a + ")";
    }
}
