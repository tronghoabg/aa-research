package com.waze.ui.w.a;

import com.waze.ui.f.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends x {

    /* renamed from: a, reason: collision with root package name */
    private final String f43523a;

    public d(String str) {
        h.g.b.x.f(str, "message");
        this.f43523a = str;
    }

    public final String a() {
        return this.f43523a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && h.g.b.x.n(this.f43523a, ((d) obj).f43523a);
    }

    public final int hashCode() {
        return this.f43523a.hashCode();
    }

    public final String toString() {
        return "BardinioPausedReason(message=" + this.f43523a + ")";
    }
}
