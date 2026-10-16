package com.waze.ui.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements p {

    /* renamed from: a, reason: collision with root package name */
    private final y f41893a;

    public m(y yVar) {
        h.g.b.x.f(yVar, "voice");
        this.f41893a = yVar;
    }

    public final y a() {
        return this.f41893a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && h.g.b.x.n(this.f41893a, ((m) obj).f41893a);
    }

    public final int hashCode() {
        return this.f41893a.hashCode();
    }

    public final String toString() {
        return "UserRecordedVoicePreviewClicked(voice=" + this.f41893a + ")";
    }
}
