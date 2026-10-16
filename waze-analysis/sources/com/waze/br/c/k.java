package com.waze.br.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Float f17398a;

    public k(Float f2) {
        this.f17398a = f2;
    }

    public final Float a() {
        return this.f17398a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && h.g.b.x.n(this.f17398a, ((k) obj).f17398a);
    }

    public final int hashCode() {
        Float f2 = this.f17398a;
        if (f2 == null) {
            return 0;
        }
        return f2.hashCode();
    }

    public final String toString() {
        return "RecordingUserSpeech(amplitude=" + this.f17398a + ")";
    }
}
