package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p extends com.waze.location.q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.c.f.i f26261a;

    public p(com.waze.main_screen.c.f.i iVar) {
        h.g.b.x.f(iVar, "soundButtonStateHolder");
        this.f26261a = iVar;
    }

    public final com.waze.main_screen.c.f.i b() {
        return this.f26261a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && h.g.b.x.n(this.f26261a, ((p) obj).f26261a);
    }

    public final int hashCode() {
        return this.f26261a.hashCode();
    }

    public final String toString() {
        return "SoundSettings(soundButtonStateHolder=" + this.f26261a + ")";
    }
}
