package com.waze.h.b;

import com.waze.a.af;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends af {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f24322a;

    public f(Throwable th) {
        super(null);
        this.f24322a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && x.n(this.f24322a, ((f) obj).f24322a);
    }

    public final int hashCode() {
        Throwable th = this.f24322a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Error(throwable=" + this.f24322a + ")";
    }

    public f() {
        this(null);
    }
}
