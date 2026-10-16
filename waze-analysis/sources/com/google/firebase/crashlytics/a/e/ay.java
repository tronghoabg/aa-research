package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ay extends cn {

    /* renamed from: a, reason: collision with root package name */
    private final List f9402a;

    @Override // com.google.firebase.crashlytics.a.e.cn
    public final List a() {
        return this.f9402a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cn) {
            return this.f9402a.equals(((cn) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f9402a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f9402a.toString() + "}";
    }
}
