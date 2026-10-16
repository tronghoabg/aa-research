package com.waze.ui.ac;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends n {

    /* renamed from: a, reason: collision with root package name */
    private final String f41769a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str) {
        super(null);
        x.f(str, "value");
        this.f41769a = str;
    }

    public final String a() {
        return this.f41769a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && x.n(this.f41769a, ((l) obj).f41769a);
    }

    public final int hashCode() {
        return this.f41769a.hashCode();
    }

    public final String toString() {
        return "ServerString(value=" + this.f41769a + ")";
    }
}
