package od;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.atomic.AtomicInteger;
import md.AbstractC3541i;
import md.C3535c;
import w9.AbstractC4392k;

/* renamed from: od.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3692i extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3739y f41981a;

    /* renamed from: c, reason: collision with root package name */
    public volatile md.k0 f41983c;

    /* renamed from: d, reason: collision with root package name */
    public md.k0 f41984d;

    /* renamed from: e, reason: collision with root package name */
    public md.k0 f41985e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C3695j f41987g;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f41982b = new AtomicInteger(-2147483647);

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.ads.nativead.l f41986f = new com.google.android.gms.ads.nativead.l(this, 11);

    public C3692i(C3695j c3695j, InterfaceC3739y interfaceC3739y, String str) {
        this.f41987g = c3695j;
        Fe.e.t(interfaceC3739y, "delegate");
        this.f41981a = interfaceC3739y;
    }

    public static void h(C3692i c3692i) {
        synchronized (c3692i) {
            try {
                if (c3692i.f41982b.get() != 0) {
                    return;
                }
                md.k0 k0Var = c3692i.f41984d;
                md.k0 k0Var2 = c3692i.f41985e;
                c3692i.f41984d = null;
                c3692i.f41985e = null;
                if (k0Var != null) {
                    super.d(k0Var);
                }
                if (k0Var2 != null) {
                    super.a(k0Var2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // od.U, od.U0
    public final void a(md.k0 k0Var) {
        Fe.e.t(k0Var, "status");
        synchronized (this) {
            try {
                if (this.f41982b.get() < 0) {
                    this.f41983c = k0Var;
                    this.f41982b.addAndGet(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                } else if (this.f41985e != null) {
                    return;
                }
                if (this.f41982b.get() != 0) {
                    this.f41985e = k0Var;
                } else {
                    super.a(k0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // od.InterfaceC3727u
    public final r c(F6.r rVar, md.b0 b0Var, C3535c c3535c, AbstractC3541i[] abstractC3541iArr) {
        r rVar2;
        v9.i iVar = c3535c.f40622c;
        if (iVar == null) {
            this.f41987g.getClass();
            iVar = null;
        } else {
            this.f41987g.getClass();
        }
        if (iVar == null) {
            return this.f41982b.get() >= 0 ? new S(this.f41983c, abstractC3541iArr) : this.f41981a.c(rVar, b0Var, c3535c, abstractC3541iArr);
        }
        C3670a1 c3670a1 = new C3670a1(this.f41981a, rVar, b0Var, c3535c, this.f41986f, abstractC3541iArr);
        if (this.f41982b.incrementAndGet() > 0) {
            C3692i c3692i = (C3692i) this.f41986f.f26356b;
            if (c3692i.f41982b.decrementAndGet() == 0) {
                h(c3692i);
            }
            return new S(this.f41983c, abstractC3541iArr);
        }
        try {
            D0 d02 = this.f41987g.f41994b;
            Task taskW = iVar.f47077a.W();
            Task taskW2 = iVar.f47078b.W();
            Tasks.whenAll((Task<?>[]) new Task[]{taskW, taskW2}).addOnCompleteListener(AbstractC4392k.f47445b, new A5.g(taskW, c3670a1, taskW2, 20));
        } catch (Throwable th) {
            c3670a1.a(md.k0.f40679j.h("Credentials should use fail() instead of throwing exceptions").g(th));
        }
        synchronized (c3670a1.f41909h) {
            try {
                r rVar3 = c3670a1.f41910i;
                rVar2 = rVar3;
                if (rVar3 == null) {
                    L l10 = new L();
                    c3670a1.k = l10;
                    c3670a1.f41910i = l10;
                }
            } finally {
            }
        }
        return rVar2;
    }

    @Override // od.U, od.U0
    public final void d(md.k0 k0Var) {
        Fe.e.t(k0Var, "status");
        synchronized (this) {
            try {
                if (this.f41982b.get() < 0) {
                    this.f41983c = k0Var;
                    this.f41982b.addAndGet(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                    if (this.f41982b.get() != 0) {
                        this.f41984d = k0Var;
                    } else {
                        super.d(k0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // od.U
    public final InterfaceC3739y g() {
        return this.f41981a;
    }
}
