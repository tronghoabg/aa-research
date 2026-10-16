package com.waze.ui.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n implements p {

    /* renamed from: a, reason: collision with root package name */
    private final y f41894a;

    public n(y yVar) {
        h.g.b.x.f(yVar, "voice");
        this.f41894a = yVar;
    }

    public final y a() {
        return this.f41894a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && h.g.b.x.n(this.f41894a, ((n) obj).f41894a);
    }

    public final int hashCode() {
        return this.f41894a.hashCode();
    }

    public final String toString() {
        return "UserRecordedVoiceShareClicked(voice=" + this.f41894a + ")";
    }
}
