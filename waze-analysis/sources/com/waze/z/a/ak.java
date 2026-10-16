package com.waze.z.a;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private final List f45636a;

    public ak(List list) {
        h.g.b.x.f(list, "actions");
        this.f45636a = list;
    }

    public final List a() {
        return this.f45636a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak) && h.g.b.x.n(this.f45636a, ((ak) obj).f45636a);
    }

    public final int hashCode() {
        return this.f45636a.hashCode();
    }

    public final String toString() {
        return "SwipeableContentActionsList(actions=" + this.f45636a + ")";
    }
}
