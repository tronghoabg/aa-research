package com.waze.sound;

import java.io.File;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends fb {

    /* renamed from: a, reason: collision with root package name */
    private final CompletableDeferred f39583a;

    /* renamed from: b, reason: collision with root package name */
    private final File f39584b;

    public c(CompletableDeferred completableDeferred, File file) {
        h.g.b.x.f(completableDeferred, "result");
        h.g.b.x.f(file, "file");
        this.f39583a = completableDeferred;
        this.f39584b = file;
    }

    @Override // com.waze.sound.fb
    public final CompletableDeferred a() {
        return this.f39583a;
    }

    public final File b() {
        return this.f39584b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.g.b.x.n(this.f39583a, cVar.f39583a) && h.g.b.x.n(this.f39584b, cVar.f39584b);
    }

    public final int hashCode() {
        return (this.f39583a.hashCode() * 31) + this.f39584b.hashCode();
    }

    public final String toString() {
        return "Synthesize(result=" + this.f39583a + ", file=" + this.f39584b + ")";
    }
}
