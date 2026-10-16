package com.google.b.d.a;

import com.google.d.m.a.af;
import com.google.d.m.a.bm;
import com.google.d.m.a.k;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e extends k {

    /* renamed from: a, reason: collision with root package name */
    private g f7054a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7055b;

    /* synthetic */ e(g gVar, int i2) {
        this.f7054a = gVar;
        this.f7055b = i2;
    }

    @Override // com.google.d.m.a.k
    protected final String a() {
        af afVar;
        g gVar = this.f7054a;
        if (gVar == null || (afVar = gVar.f7057a.f7052a) == null) {
            return null;
        }
        String str = "callable=[" + afVar.toString() + "]";
        f fVar = (f) this.f7054a.f7059c.get();
        if (fVar == null) {
            return str;
        }
        return str + ", trial=[" + fVar.toString() + "]";
    }

    @Override // com.google.d.m.a.k
    protected final void b() {
        g gVar = this.f7054a;
        this.f7054a = null;
        if (gVar != null && g.f(gVar)) {
            while (true) {
                f fVar = (f) gVar.f7059c.get();
                if (fVar != null) {
                    if (fVar.f7056a <= this.f7055b) {
                        fVar.cancel(true);
                        AtomicReference atomicReference = gVar.f7059c;
                        while (!atomicReference.compareAndSet(fVar, null)) {
                            if (atomicReference.get() != fVar) {
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.google.d.m.a.k
    protected final boolean e(bm bmVar) {
        return super.e(bmVar);
    }
}
