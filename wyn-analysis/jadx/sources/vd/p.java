package vd;

import Yf.B;
import md.AbstractC3540h;
import md.AbstractC3541i;
import md.b0;

/* loaded from: classes5.dex */
public final class p extends AbstractC3540h {

    /* renamed from: a, reason: collision with root package name */
    public final k f47207a;

    /* renamed from: b, reason: collision with root package name */
    public final p f47208b;

    public p(k kVar, p pVar) {
        this.f47207a = kVar;
        this.f47208b = pVar;
    }

    @Override // md.AbstractC3540h
    public final AbstractC3541i a(B b5, b0 b0Var) {
        p pVar = this.f47208b;
        return pVar != null ? new n(this, pVar.a(b5, b0Var)) : new o(this);
    }
}
