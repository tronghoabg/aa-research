package com.waze.an.b;

import com.waze.an.a.p;
import com.waze.an.a.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final f f14629a = new f(null, null);

    /* renamed from: b, reason: collision with root package name */
    private final r f14630b;

    /* renamed from: c, reason: collision with root package name */
    private final p f14631c;

    public f(r rVar, p pVar) {
        this.f14630b = rVar;
        this.f14631c = pVar;
    }

    public final p a() {
        return this.f14631c;
    }

    public final r b() {
        return this.f14630b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f14630b, fVar.f14630b) && x.n(this.f14631c, fVar.f14631c);
    }

    public final int hashCode() {
        r rVar = this.f14630b;
        int iHashCode = rVar == null ? 0 : rVar.hashCode();
        p pVar = this.f14631c;
        return (iHashCode * 31) + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "SelectedInsight(insightDescriptor=" + this.f14630b + ", segmentInsightDescriptor=" + this.f14631c + ")";
    }
}
