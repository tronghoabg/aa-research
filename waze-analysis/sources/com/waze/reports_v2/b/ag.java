package com.waze.reports_v2.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag extends com.waze.bm.a.a.ad {

    /* renamed from: a, reason: collision with root package name */
    private final q f34049a;

    /* renamed from: b, reason: collision with root package name */
    private final List f34050b;

    /* JADX WARN: Illegal instructions before constructor call */
    public ag(q qVar, List list) {
        h.g.b.x.f(qVar, "group");
        h.g.b.x.f(list, "subtypes");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f34049a = qVar;
        this.f34050b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return this.f34049a == agVar.f34049a && h.g.b.x.n(this.f34050b, agVar.f34050b);
    }

    public final q g() {
        return this.f34049a;
    }

    public final List h() {
        return this.f34050b;
    }

    public final int hashCode() {
        return (this.f34049a.hashCode() * 31) + this.f34050b.hashCode();
    }

    public final String toString() {
        return "CategoryWithSubtypes(group=" + this.f34049a + ", subtypes=" + this.f34050b + ")";
    }
}
