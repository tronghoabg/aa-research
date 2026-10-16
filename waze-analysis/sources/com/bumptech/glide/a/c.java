package com.bumptech.glide.a;

import j$.util.Objects;
import java.io.File;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f2705a;

    /* renamed from: b, reason: collision with root package name */
    private final d f2706b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f2707c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2708d;

    /* synthetic */ c(f fVar, d dVar) {
        Objects.requireNonNull(fVar);
        this.f2705a = fVar;
        this.f2706b = dVar;
        this.f2707c = dVar.f2714f ? null : new boolean[fVar.f2726h];
    }

    public final void b() {
        this.f2705a.p(this, false);
    }

    public final void c() {
        if (this.f2708d) {
            return;
        }
        try {
            b();
        } catch (IOException unused) {
        }
    }

    public final void d() {
        this.f2705a.p(this, true);
        this.f2708d = true;
    }

    public final File f() {
        File fileJ;
        f fVar = this.f2705a;
        synchronized (fVar) {
            d dVar = this.f2706b;
            if (dVar.f2715g != this) {
                throw new IllegalStateException();
            }
            if (!dVar.f2714f) {
                this.f2707c[0] = true;
            }
            fileJ = dVar.j();
            fVar.f2720b.mkdirs();
        }
        return fileJ;
    }
}
