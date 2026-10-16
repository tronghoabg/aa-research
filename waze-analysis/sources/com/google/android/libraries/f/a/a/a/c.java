package com.google.android.libraries.f.a.a.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final String f5927a;

    public c(String str) {
        x.f(str, "token");
        this.f5927a = str;
    }

    public final String a() {
        return this.f5927a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.n(this.f5927a, ((c) obj).f5927a);
    }

    public final int hashCode() {
        return this.f5927a.hashCode();
    }

    public final String toString() {
        return "Success(token=" + this.f5927a + ")";
    }
}
