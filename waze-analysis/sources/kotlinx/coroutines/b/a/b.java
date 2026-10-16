package kotlinx.coroutines.b.a;

import java.util.Arrays;
import kotlinx.coroutines.b.a.d;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class b<S extends d<?>> {

    /* renamed from: a, reason: collision with root package name */
    private d[] f51399a;

    /* renamed from: b, reason: collision with root package name */
    private int f51400b;

    /* renamed from: c, reason: collision with root package name */
    private int f51401c;

    /* renamed from: d, reason: collision with root package name */
    private ah f51402d;

    public final ch a() {
        ah ahVar;
        synchronized (this) {
            ahVar = this.f51402d;
            if (ahVar == null) {
                ahVar = new ah(this.f51400b);
                this.f51402d = ahVar;
            }
        }
        return ahVar;
    }

    protected abstract d h();

    protected abstract d[] k();

    protected final int m() {
        return this.f51400b;
    }

    protected final d n() {
        d dVarH;
        ah ahVar;
        synchronized (this) {
            d[] dVarArrK = this.f51399a;
            if (dVarArrK == null) {
                dVarArrK = k();
                this.f51399a = dVarArrK;
            } else {
                int i2 = this.f51400b;
                int length = dVarArrK.length;
                if (i2 >= length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrK, length + length);
                    h.g.b.x.e(objArrCopyOf, "copyOf(...)");
                    dVarArrK = (d[]) objArrCopyOf;
                    this.f51399a = dVarArrK;
                }
            }
            int i3 = this.f51401c;
            do {
                dVarH = dVarArrK[i3];
                if (dVarH == null) {
                    dVarH = h();
                    dVarArrK[i3] = dVarH;
                }
                i3++;
                if (i3 >= dVarArrK.length) {
                    i3 = 0;
                }
            } while (!dVarH.a(this));
            this.f51401c = i3;
            this.f51400b++;
            ahVar = this.f51402d;
        }
        if (ahVar != null) {
            ahVar.r(1);
        }
        return dVarH;
    }

    protected final void o(d dVar) {
        ah ahVar;
        int i2;
        h.c.e[] eVarArrB;
        synchronized (this) {
            int i3 = this.f51400b - 1;
            this.f51400b = i3;
            ahVar = this.f51402d;
            if (i3 == 0) {
                this.f51401c = 0;
            }
            h.g.b.x.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            eVarArrB = dVar.b(this);
        }
        for (h.c.e eVar : eVarArrB) {
            if (eVar != null) {
                eVar.resumeWith(h.ab.f48028a);
            }
        }
        if (ahVar != null) {
            ahVar.r(-1);
        }
    }

    protected final d[] q() {
        return this.f51399a;
    }
}
