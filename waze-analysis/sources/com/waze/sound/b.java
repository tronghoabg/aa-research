package com.waze.sound;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends fb {

    /* renamed from: a, reason: collision with root package name */
    private final CompletableDeferred f39492a;

    public b(CompletableDeferred completableDeferred) {
        h.g.b.x.f(completableDeferred, "result");
        this.f39492a = completableDeferred;
    }

    @Override // com.waze.sound.fb
    public final CompletableDeferred a() {
        return this.f39492a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && h.g.b.x.n(this.f39492a, ((b) obj).f39492a);
    }

    public final int hashCode() {
        return this.f39492a.hashCode();
    }

    public final String toString() {
        return "Speak(result=" + this.f39492a + ")";
    }
}
