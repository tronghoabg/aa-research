package com.waze.ui.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements p {

    /* renamed from: a, reason: collision with root package name */
    private final y f41891a;

    public k(y yVar) {
        h.g.b.x.f(yVar, "voice");
        this.f41891a = yVar;
    }

    public final y a() {
        return this.f41891a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && h.g.b.x.n(this.f41891a, ((k) obj).f41891a);
    }

    public final int hashCode() {
        return this.f41891a.hashCode();
    }

    public final String toString() {
        return "UserRecordedVoiceEditClicked(voice=" + this.f41891a + ")";
    }
}
