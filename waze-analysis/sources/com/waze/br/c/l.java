package com.waze.br.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Float f17399a;

    public l(Float f2) {
        this.f17399a = f2;
    }

    public final Float a() {
        return this.f17399a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && h.g.b.x.n(this.f17399a, ((l) obj).f17399a);
    }

    public final int hashCode() {
        Float f2 = this.f17399a;
        if (f2 == null) {
            return 0;
        }
        return f2.hashCode();
    }

    public final String toString() {
        return "SpeakingToUser(amplitude=" + this.f17399a + ")";
    }
}
