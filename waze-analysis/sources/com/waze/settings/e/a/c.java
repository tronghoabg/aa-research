package com.waze.settings.e.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    private final b f37131a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(null);
        x.f(bVar, "preset");
        this.f37131a = bVar;
    }

    public final b a() {
        return this.f37131a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f37131a == ((c) obj).f37131a;
    }

    public final int hashCode() {
        return this.f37131a.hashCode();
    }

    public final String toString() {
        return "PresetPermit(preset=" + this.f37131a + ")";
    }
}
