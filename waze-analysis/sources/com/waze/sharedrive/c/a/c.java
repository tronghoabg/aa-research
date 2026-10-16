package com.waze.sharedrive.c.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private final String f38062a;

    public c(String str) {
        x.f(str, "url");
        this.f38062a = str;
    }

    public final String a() {
        return this.f38062a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.n(this.f38062a, ((c) obj).f38062a);
    }

    public final int hashCode() {
        return this.f38062a.hashCode();
    }

    public final String toString() {
        return "Image(url=" + this.f38062a + ")";
    }
}
