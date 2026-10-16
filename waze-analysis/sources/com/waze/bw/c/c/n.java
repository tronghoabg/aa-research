package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n extends com.waze.sharedui.api.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f17855a;

    public n(String str) {
        super(null, null);
        this.f17855a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && h.g.b.x.n(this.f17855a, ((n) obj).f17855a);
    }

    public final String g() {
        return this.f17855a;
    }

    public final int hashCode() {
        String str = this.f17855a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "OpenSearchScreen(searchTerm=" + this.f17855a + ")";
    }
}
