package com.waze.planned_drive;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    private final m f33344a;

    public i(m mVar) {
        h.g.b.x.f(mVar, "result");
        this.f33344a = mVar;
    }

    @Override // com.waze.planned_drive.o
    public final m a() {
        return this.f33344a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && h.g.b.x.n(this.f33344a, ((i) obj).f33344a);
    }

    public final int hashCode() {
        return this.f33344a.hashCode();
    }

    public final String toString() {
        return "Create(result=" + this.f33344a + ")";
    }
}
