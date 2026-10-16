package Jf;

import Ef.A;
import Ef.AbstractC0481c0;
import Ef.C0517x;
import Ef.H;
import Ef.J0;
import Ef.N;
import Ef.P;
import ef.C2530n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import lf.AbstractC3464c;
import lf.InterfaceC3465d;

/* loaded from: classes5.dex */
public final class f extends P implements InterfaceC3465d, InterfaceC3103c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6108h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final A f6109d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC3464c f6110e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6111f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6112g;

    public f(A a5, AbstractC3464c abstractC3464c) {
        super(-1);
        this.f6109d = a5;
        this.f6110e = abstractC3464c;
        this.f6111f = b.f6098b;
        this.f6112g = b.m(abstractC3464c.getContext());
    }

    @Override // lf.InterfaceC3465d
    public final InterfaceC3465d getCallerFrame() {
        return this.f6110e;
    }

    @Override // jf.InterfaceC3103c
    public final InterfaceC3108h getContext() {
        return this.f6110e.getContext();
    }

    @Override // Ef.P
    public final Object i() {
        Object obj = this.f6111f;
        this.f6111f = b.f6098b;
        return obj;
    }

    @Override // jf.InterfaceC3103c
    public final void resumeWith(Object obj) throws N {
        Throwable thA = C2530n.a(obj);
        Object c0517x = thA == null ? obj : new C0517x(false, thA);
        AbstractC3464c abstractC3464c = this.f6110e;
        InterfaceC3108h context = abstractC3464c.getContext();
        A a5 = this.f6109d;
        if (b.j(a5, context)) {
            this.f6111f = c0517x;
            this.f3694c = 0;
            b.i(a5, abstractC3464c.getContext(), this);
            return;
        }
        AbstractC0481c0 abstractC0481c0A = J0.a();
        if (abstractC0481c0A.f3721b >= 4294967296L) {
            this.f6111f = c0517x;
            this.f3694c = 0;
            abstractC0481c0A.B(this);
            return;
        }
        abstractC0481c0A.J(true);
        try {
            InterfaceC3108h context2 = abstractC3464c.getContext();
            Object objN = b.n(context2, this.f6112g);
            try {
                abstractC3464c.resumeWith(obj);
                while (abstractC0481c0A.Q()) {
                }
            } finally {
                b.g(context2, objN);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f6109d + ", " + H.L(this.f6110e) + ']';
    }

    @Override // Ef.P
    public final InterfaceC3103c d() {
        return this;
    }
}
