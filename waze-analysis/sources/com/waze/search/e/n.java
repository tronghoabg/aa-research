package com.waze.search.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n extends com.waze.settings.v {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.i f35632a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.n f35633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.waze.ui.ac.i iVar, com.waze.ui.ac.n nVar) {
        super(null, null);
        h.g.b.x.f(iVar, "image");
        h.g.b.x.f(nVar, "text");
        this.f35632a = iVar;
        this.f35633b = nVar;
    }

    public final com.waze.ui.ac.i a() {
        return this.f35632a;
    }

    public final com.waze.ui.ac.n b() {
        return this.f35633b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return h.g.b.x.n(this.f35632a, nVar.f35632a) && h.g.b.x.n(this.f35633b, nVar.f35633b);
    }

    public final int hashCode() {
        return (this.f35632a.hashCode() * 31) + this.f35633b.hashCode();
    }

    public final String toString() {
        return "TextWithImage(image=" + this.f35632a + ", text=" + this.f35633b + ")";
    }
}
