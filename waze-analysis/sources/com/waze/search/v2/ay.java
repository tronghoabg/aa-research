package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ay extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final String f36168a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(String str) {
        super(null);
        h.g.b.x.f(str, "gasBrand");
        this.f36168a = str;
    }

    public final String a() {
        return this.f36168a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay) && h.g.b.x.n(this.f36168a, ((ay) obj).f36168a);
    }

    public final int hashCode() {
        return this.f36168a.hashCode();
    }

    public final String toString() {
        return "SetPreferredGasBrand(gasBrand=" + this.f36168a + ")";
    }
}
