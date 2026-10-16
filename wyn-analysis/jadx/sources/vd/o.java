package vd;

import java.util.concurrent.atomic.AtomicLong;
import md.AbstractC3541i;
import md.k0;

/* loaded from: classes5.dex */
public final class o extends AbstractC3541i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f47206b;

    public o(p pVar) {
        this.f47206b = pVar;
    }

    @Override // md.AbstractC3541i
    public final void m(k0 k0Var) {
        k kVar = this.f47206b.f47207a;
        boolean zF = k0Var.f();
        m mVar = kVar.f47188a;
        if (mVar.f47201e == null && mVar.f47202f == null) {
            return;
        }
        if (zF) {
            ((AtomicLong) kVar.f47189b.f45906a).getAndIncrement();
        } else {
            ((AtomicLong) kVar.f47189b.f45907b).getAndIncrement();
        }
    }
}
