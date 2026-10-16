package com.waze.planned_drive;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j extends o {

    /* renamed from: a, reason: collision with root package name */
    private final m f33345a;

    public j(m mVar) {
        h.g.b.x.f(mVar, "result");
        this.f33345a = mVar;
    }

    @Override // com.waze.planned_drive.o
    public final m a() {
        return this.f33345a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && h.g.b.x.n(this.f33345a, ((j) obj).f33345a);
    }

    public final int hashCode() {
        return this.f33345a.hashCode();
    }

    public final String toString() {
        return "Delete(result=" + this.f33345a + ")";
    }
}
