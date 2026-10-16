package com.waze.planned_drive;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n extends o {

    /* renamed from: a, reason: collision with root package name */
    private final m f33349a;

    public n(m mVar) {
        h.g.b.x.f(mVar, "result");
        this.f33349a = mVar;
    }

    @Override // com.waze.planned_drive.o
    public final m a() {
        return this.f33349a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && h.g.b.x.n(this.f33349a, ((n) obj).f33349a);
    }

    public final int hashCode() {
        return this.f33349a.hashCode();
    }

    public final String toString() {
        return "Update(result=" + this.f33349a + ")";
    }
}
