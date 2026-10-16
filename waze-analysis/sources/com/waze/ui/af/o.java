package com.waze.ui.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o implements p {

    /* renamed from: a, reason: collision with root package name */
    private final y f41895a;

    public o(y yVar) {
        h.g.b.x.f(yVar, "voice");
        this.f41895a = yVar;
    }

    public final y a() {
        return this.f41895a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && h.g.b.x.n(this.f41895a, ((o) obj).f41895a);
    }

    public final int hashCode() {
        return this.f41895a.hashCode();
    }

    public final String toString() {
        return "UserRecordedVoiceShareDisclaimerClicked(voice=" + this.f41895a + ")";
    }
}
