package com.waze.ui.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements p {

    /* renamed from: a, reason: collision with root package name */
    private final y f41892a;

    public l(y yVar) {
        h.g.b.x.f(yVar, "voice");
        this.f41892a = yVar;
    }

    public final y a() {
        return this.f41892a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && h.g.b.x.n(this.f41892a, ((l) obj).f41892a);
    }

    public final int hashCode() {
        return this.f41892a.hashCode();
    }

    public final String toString() {
        return "UserRecordedVoiceOptionClicked(voice=" + this.f41892a + ")";
    }
}
