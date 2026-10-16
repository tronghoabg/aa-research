package androidx.lifecycle;

import Ef.C0499l0;
import Ef.InterfaceC0501m0;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1453q implements InterfaceC1455t, Ef.E {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1451o f18685a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3108h f18686b;

    public C1453q(AbstractC1451o abstractC1451o, InterfaceC3108h coroutineContext) {
        InterfaceC0501m0 interfaceC0501m0;
        AbstractC3340k.e(coroutineContext, "coroutineContext");
        this.f18685a = abstractC1451o;
        this.f18686b = coroutineContext;
        if (abstractC1451o.b() != EnumC1450n.f18676a || (interfaceC0501m0 = (InterfaceC0501m0) coroutineContext.get(C0499l0.f3748a)) == null) {
            return;
        }
        interfaceC0501m0.cancel(null);
    }

    @Override // Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        return this.f18686b;
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
        AbstractC1451o abstractC1451o = this.f18685a;
        if (abstractC1451o.b().compareTo(EnumC1450n.f18676a) <= 0) {
            abstractC1451o.c(this);
            InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) this.f18686b.get(C0499l0.f3748a);
            if (interfaceC0501m0 != null) {
                interfaceC0501m0.cancel(null);
            }
        }
    }
}
