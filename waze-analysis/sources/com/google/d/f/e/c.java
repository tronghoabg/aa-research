package com.google.d.f.e;

import com.google.d.d.fo;
import com.google.d.f.b.ag;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final ag f7836a;

    /* renamed from: b, reason: collision with root package name */
    private int f7837b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f7838c = -1;

    public c(ag agVar) {
        fo.o(agVar, "context");
        this.f7836a = agVar;
    }

    protected abstract Object a();

    protected abstract void b(int i2, int i3, com.google.d.f.d.c cVar);

    public final int h() {
        return this.f7838c + 1;
    }

    public final d i() {
        return this.f7836a.a();
    }

    public final Object j() {
        i().c(this);
        int i2 = this.f7837b;
        if (((i2 + 1) & i2) != 0 || (this.f7838c > 31 && i2 != -1)) {
            throw e.d(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i2))));
        }
        return a();
    }

    public final String k() {
        return this.f7836a.b();
    }

    public final void l(int i2, int i3, com.google.d.f.d.c cVar) {
        if (cVar.c() < 32) {
            this.f7837b |= 1 << cVar.c();
        }
        this.f7838c = Math.max(this.f7838c, cVar.c());
        b(i2, i3, cVar);
    }
}
