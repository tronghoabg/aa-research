package com.waze.ui.w.a;

import com.waze.ui.f.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends l {

    /* renamed from: a, reason: collision with root package name */
    private final String f43522a;

    public c(String str) {
        x.f(str, "message");
        this.f43522a = str;
    }

    public final String a() {
        return this.f43522a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.n(this.f43522a, ((c) obj).f43522a);
    }

    public final int hashCode() {
        return this.f43522a.hashCode();
    }

    public final String toString() {
        return "BardinioError(message=" + this.f43522a + ")";
    }
}
