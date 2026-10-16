package com.waze.t.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t extends u {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.e.a f40642a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.waze.shared_infra.e.a aVar) {
        super(null);
        x.f(aVar, "audioData");
        this.f40642a = aVar;
    }

    public final com.waze.shared_infra.e.a a() {
        return this.f40642a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && x.n(this.f40642a, ((t) obj).f40642a);
    }

    public final int hashCode() {
        return this.f40642a.hashCode();
    }

    public final String toString() {
        return "PlayAudio(audioData=" + this.f40642a + ")";
    }
}
