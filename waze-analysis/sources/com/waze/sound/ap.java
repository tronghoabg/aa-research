package com.waze.sound;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private final List f39454a;

    public ap(List list) {
        h.g.b.x.f(list, "chunks");
        this.f39454a = list;
    }

    public final List a() {
        return this.f39454a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap) && h.g.b.x.n(this.f39454a, ((ap) obj).f39454a);
    }

    public final int hashCode() {
        return this.f39454a.hashCode();
    }

    public final String toString() {
        return "ClientVoiceAsset(chunks=" + this.f39454a + ")";
    }
}
