package com.waze.ui.f;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae extends ak {

    /* renamed from: a, reason: collision with root package name */
    private final Float f42277a;

    public ae(Float f2) {
        super(null);
        this.f42277a = f2;
    }

    public final Float a() {
        return this.f42277a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae) && h.g.b.x.n(this.f42277a, ((ae) obj).f42277a);
    }

    public final int hashCode() {
        Float f2 = this.f42277a;
        if (f2 == null) {
            return 0;
        }
        return f2.hashCode();
    }

    public final String toString() {
        return "Listening(amplitude=" + this.f42277a + ")";
    }
}
