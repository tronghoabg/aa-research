package com.waze.bl.c.c;

import com.waze.bl.b.c.r;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends r {

    /* renamed from: a, reason: collision with root package name */
    private final List f17028a;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(List list) {
        x.f(list, "closureCandidates");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f17028a = list;
    }

    public final List d() {
        return this.f17028a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && x.n(this.f17028a, ((f) obj).f17028a);
    }

    public final int hashCode() {
        return this.f17028a.hashCode();
    }

    public final String toString() {
        return "ClosureCandidates(closureCandidates=" + this.f17028a + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private f() {
        byte[] bArr = null;
        super(bArr, bArr);
    }
}
