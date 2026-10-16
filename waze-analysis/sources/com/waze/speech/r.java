package com.waze.speech;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends s {

    /* renamed from: a, reason: collision with root package name */
    private final String f40470a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str) {
        super(null);
        h.g.b.x.f(str, "term");
        this.f40470a = str;
    }

    public final String a() {
        return this.f40470a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && h.g.b.x.n(this.f40470a, ((r) obj).f40470a);
    }

    public final int hashCode() {
        return this.f40470a.hashCode();
    }

    public final String toString() {
        return "TermRecognized(term=" + this.f40470a + ")";
    }
}
