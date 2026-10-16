package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bd implements bq {

    /* renamed from: a, reason: collision with root package name */
    private final String f17984a;

    public bd(String str) {
        h.g.b.x.f(str, "term");
        this.f17984a = str;
    }

    public final String a() {
        return this.f17984a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bd) && h.g.b.x.n(this.f17984a, ((bd) obj).f17984a);
    }

    public final int hashCode() {
        return this.f17984a.hashCode();
    }

    public final String toString() {
        return "SpeechRecognitionTermDetected(term=" + this.f17984a + ")";
    }
}
