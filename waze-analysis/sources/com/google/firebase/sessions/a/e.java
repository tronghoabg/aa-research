package com.google.firebase.sessions.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f10780a;

    public e(String str) {
        x.f(str, "sessionId");
        this.f10780a = str;
    }

    public final String a() {
        return this.f10780a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && x.n(this.f10780a, ((e) obj).f10780a);
    }

    public final int hashCode() {
        return this.f10780a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f10780a + ")";
    }
}
