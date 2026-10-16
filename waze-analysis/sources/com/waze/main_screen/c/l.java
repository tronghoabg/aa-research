package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l extends com.waze.location.q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.b.a.f f26257a;

    public l(com.waze.main_screen.b.a.f fVar) {
        h.g.b.x.f(fVar, "audioSdkButtonStateHolder");
        this.f26257a = fVar;
    }

    public final com.waze.main_screen.b.a.f b() {
        return this.f26257a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && h.g.b.x.n(this.f26257a, ((l) obj).f26257a);
    }

    public final int hashCode() {
        return this.f26257a.hashCode();
    }

    public final String toString() {
        return "AudioSdk(audioSdkButtonStateHolder=" + this.f26257a + ")";
    }
}
