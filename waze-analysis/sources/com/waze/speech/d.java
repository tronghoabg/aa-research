package com.waze.speech;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    private final String f40433a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str) {
        super(null);
        h.g.b.x.f(str, "userSpeech");
        this.f40433a = str;
    }

    public final String a() {
        return this.f40433a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && h.g.b.x.n(this.f40433a, ((d) obj).f40433a);
    }

    public final int hashCode() {
        return this.f40433a.hashCode();
    }

    public final String toString() {
        return "Success(userSpeech=" + this.f40433a + ")";
    }
}
