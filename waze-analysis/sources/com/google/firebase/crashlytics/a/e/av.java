package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class av extends ci {

    /* renamed from: a, reason: collision with root package name */
    private final String f9395a;

    @Override // com.google.firebase.crashlytics.a.e.ci
    public final String a() {
        return this.f9395a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ci) {
            return this.f9395a.equals(((ci) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f9395a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Log{content=" + this.f9395a + "}";
    }
}
