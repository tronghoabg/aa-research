package com.google.l;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l extends i {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.l.b.v f12460a = new com.google.l.b.v(null);

    public final Set b() {
        return this.f12460a.entrySet();
    }

    public final void d(String str, i iVar) {
        this.f12460a.put(str, iVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof l) && ((l) obj).f12460a.equals(this.f12460a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f12460a.hashCode();
    }
}
