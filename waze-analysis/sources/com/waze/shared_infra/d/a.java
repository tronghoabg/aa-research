package com.waze.shared_infra.d;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f37849a;

    public a(String str) {
        x.f(str, "googleSignInClientId");
        this.f37849a = str;
    }

    public final String a() {
        return this.f37849a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && x.n(this.f37849a, ((a) obj).f37849a);
    }

    public final int hashCode() {
        return this.f37849a.hashCode();
    }

    public final String toString() {
        return "WazeRuntimeConstants(googleSignInClientId=" + this.f37849a + ")";
    }
}
