package com.waze.shared_infra.r;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t extends com.waze.shared_infra.h.b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37996a;

    public t(boolean z) {
        super(null);
        this.f37996a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f37996a == ((t) obj).f37996a;
    }

    public final int hashCode() {
        return a.a.a(this.f37996a);
    }

    public final boolean j() {
        return this.f37996a;
    }

    public final String toString() {
        return "LOGGED_OUT(signUpEnabled=" + this.f37996a + ")";
    }

    public t() {
        this(true);
    }
}
