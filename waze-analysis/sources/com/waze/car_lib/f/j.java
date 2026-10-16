package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends com.waze.copilot.data.b.k {

    /* renamed from: a, reason: collision with root package name */
    private final jb f19735a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(jb jbVar) {
        super(null);
        h.g.b.x.f(jbVar, "errorType");
        this.f19735a = jbVar;
    }

    public final jb a() {
        return this.f19735a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f19735a == ((j) obj).f19735a;
    }

    public final int hashCode() {
        return this.f19735a.hashCode();
    }

    public final String toString() {
        return "Error(errorType=" + this.f19735a + ")";
    }

    public j() {
        this(jb.f19737a);
    }
}
