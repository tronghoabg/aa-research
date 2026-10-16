package com.waze.ui.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h implements p {

    /* renamed from: a, reason: collision with root package name */
    private final q f41888a;

    public h(q qVar) {
        h.g.b.x.f(qVar, "voice");
        this.f41888a = qVar;
    }

    public final q a() {
        return this.f41888a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && h.g.b.x.n(this.f41888a, ((h) obj).f41888a);
    }

    public final int hashCode() {
        return this.f41888a.hashCode();
    }

    public final String toString() {
        return "PromptTtsVoiceOptionClicked(voice=" + this.f41888a + ")";
    }
}
