package com.waze.asks;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    private final String f15629a;

    /* renamed from: b, reason: collision with root package name */
    private final m f15630b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, m mVar) {
        super(null);
        h.g.b.x.f(str, "segmentId");
        h.g.b.x.f(mVar, "segmentType");
        this.f15629a = str;
        this.f15630b = mVar;
    }

    public final m a() {
        return this.f15630b;
    }

    public final String b() {
        return this.f15629a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return h.g.b.x.n(this.f15629a, oVar.f15629a) && this.f15630b == oVar.f15630b;
    }

    public final int hashCode() {
        return (this.f15629a.hashCode() * 31) + this.f15630b.hashCode();
    }

    public final String toString() {
        return "Segment(segmentId=" + this.f15629a + ", segmentType=" + this.f15630b + ")";
    }
}
