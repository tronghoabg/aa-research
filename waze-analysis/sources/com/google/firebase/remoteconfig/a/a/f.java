package com.google.firebase.remoteconfig.a.a;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Set f10601a;

    f(Set set) {
        this.f10601a = set;
    }

    public static f a(Set set) {
        return new f(set);
    }

    public final Set b() {
        return this.f10601a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f10601a.equals(((f) obj).f10601a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10601a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f10601a.toString() + "}";
    }

    public f() {
        throw null;
    }
}
