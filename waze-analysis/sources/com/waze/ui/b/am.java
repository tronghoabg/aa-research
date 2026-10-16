package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am extends aq {

    /* renamed from: a, reason: collision with root package name */
    private final String f42010a;

    public am(String str) {
        super(null);
        this.f42010a = str;
    }

    public final String a() {
        return this.f42010a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am) && h.g.b.x.n(this.f42010a, ((am) obj).f42010a);
    }

    public final int hashCode() {
        String str = this.f42010a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "RestrictedArea(areaName=" + this.f42010a + ")";
    }
}
