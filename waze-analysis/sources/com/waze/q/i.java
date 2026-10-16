package com.waze.q;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends com.waze.calendar.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f33474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super(null, null);
        x.f(str, "url");
        this.f33474a = str;
    }

    public final String a() {
        return this.f33474a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && x.n(this.f33474a, ((i) obj).f33474a);
    }

    public final int hashCode() {
        return this.f33474a.hashCode();
    }

    public final String toString() {
        return "OpenUrl(url=" + this.f33474a + ")";
    }
}
