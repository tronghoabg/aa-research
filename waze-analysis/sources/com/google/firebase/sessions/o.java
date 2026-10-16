package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final String f10977a;

    public o(String str) {
        this.f10977a = str;
    }

    public final String a() {
        return this.f10977a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && h.g.b.x.n(this.f10977a, ((o) obj).f10977a);
    }

    public final int hashCode() {
        String str = this.f10977a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f10977a + ")";
    }
}
