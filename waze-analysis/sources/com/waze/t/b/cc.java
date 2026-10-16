package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cc {

    /* renamed from: a, reason: collision with root package name */
    private final Float f40767a;

    public cc(Float f2) {
        this.f40767a = f2;
    }

    public final Float a() {
        return this.f40767a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc) && h.g.b.x.n(this.f40767a, ((cc) obj).f40767a);
    }

    public final int hashCode() {
        Float f2 = this.f40767a;
        if (f2 == null) {
            return 0;
        }
        return f2.hashCode();
    }

    public final String toString() {
        return "PlayingAudio(amplitude=" + this.f40767a + ")";
    }
}
