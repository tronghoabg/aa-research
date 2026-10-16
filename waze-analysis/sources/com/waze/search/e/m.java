package com.waze.search.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends com.waze.settings.v {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f35631a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.waze.ui.ac.n nVar) {
        super(null, null);
        h.g.b.x.f(nVar, "text");
        this.f35631a = nVar;
    }

    public final com.waze.ui.ac.n a() {
        return this.f35631a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && h.g.b.x.n(this.f35631a, ((m) obj).f35631a);
    }

    public final int hashCode() {
        return this.f35631a.hashCode();
    }

    public final String toString() {
        return "PlainText(text=" + this.f35631a + ")";
    }
}
