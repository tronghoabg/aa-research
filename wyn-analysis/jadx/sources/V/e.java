package V;

import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.C0744s;
import ef.InterfaceC2521e;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f12860a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final i f12861b = new i(0, new long[0], new Object[0]);

    public static final int a(int i5, int i10) {
        return i5 << (((i10 % 10) * 3) + 1);
    }

    public static final d b(C0740o c0740o, int i5, InterfaceC2521e interfaceC2521e) {
        d dVar;
        c0740o.J(Integer.rotateLeft(i5, 1), f12860a, 0, null);
        Object objF = c0740o.F();
        if (objF == C0732k.f7800a) {
            dVar = new d(i5, true, interfaceC2521e);
            c0740o.U(dVar);
        } else {
            AbstractC3340k.c(objF, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            dVar = (d) objF;
            if (!dVar.f12857c.equals(interfaceC2521e)) {
                dVar.f12857c = interfaceC2521e;
                if (dVar.f12856b) {
                    C0729i0 c0729i0 = dVar.f12858d;
                    if (c0729i0 != null) {
                        C0744s c0744s = c0729i0.f7786b;
                        if (c0744s != null) {
                            c0744s.o(c0729i0, null);
                        }
                        dVar.f12858d = null;
                    }
                    ArrayList arrayList = dVar.f12859e;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            C0729i0 c0729i02 = (C0729i0) arrayList.get(i10);
                            C0744s c0744s2 = c0729i02.f7786b;
                            if (c0744s2 != null) {
                                c0744s2.o(c0729i02, null);
                            }
                        }
                        arrayList.clear();
                    }
                }
            }
        }
        c0740o.p(false);
        return dVar;
    }

    public static final boolean c(C0729i0 c0729i0, C0729i0 c0729i02) {
        if (c0729i0 == null) {
            return true;
        }
        if (c0729i0 instanceof C0729i0) {
            return !c0729i0.b() || c0729i0.equals(c0729i02) || AbstractC3340k.a(c0729i0.f7787c, c0729i02.f7787c);
        }
        return false;
    }
}
