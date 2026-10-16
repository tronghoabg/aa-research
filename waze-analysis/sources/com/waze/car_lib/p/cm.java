package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cm {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f20734a;

    public cm(h.g.a.a aVar) {
        this.f20734a = aVar;
    }

    public final h.g.a.a a() {
        return this.f20734a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cm) && h.g.b.x.n(this.f20734a, ((cm) obj).f20734a);
    }

    public final int hashCode() {
        h.g.a.a aVar = this.f20734a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "SaveActionUiState(doSave=" + this.f20734a + ")";
    }
}
