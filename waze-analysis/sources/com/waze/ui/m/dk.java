package com.waze.ui.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dk {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.i f42974a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42975b;

    public dk(com.waze.ui.ac.i iVar, String str) {
        h.g.b.x.f(iVar, "icon");
        h.g.b.x.f(str, "label");
        this.f42974a = iVar;
        this.f42975b = str;
    }

    public final com.waze.ui.ac.i a() {
        return this.f42974a;
    }

    public final String b() {
        return this.f42975b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk)) {
            return false;
        }
        dk dkVar = (dk) obj;
        return h.g.b.x.n(this.f42974a, dkVar.f42974a) && h.g.b.x.n(this.f42975b, dkVar.f42975b);
    }

    public final int hashCode() {
        return (this.f42974a.hashCode() * 31) + this.f42975b.hashCode();
    }

    public final String toString() {
        return "LocationPreviewService(icon=" + this.f42974a + ", label=" + this.f42975b + ")";
    }
}
