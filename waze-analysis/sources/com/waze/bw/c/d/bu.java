package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bu implements ce {

    /* renamed from: a, reason: collision with root package name */
    private final bt f18003a;

    public bu(bt btVar) {
        h.g.b.x.f(btVar, "voiceActionType");
        this.f18003a = btVar;
    }

    public final bt a() {
        return this.f18003a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu) && this.f18003a == ((bu) obj).f18003a;
    }

    public final int hashCode() {
        return this.f18003a.hashCode();
    }

    public final String toString() {
        return "ReadOnly(voiceActionType=" + this.f18003a + ")";
    }
}
