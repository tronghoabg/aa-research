package com.google.d.m.a;

import com.google.d.d.fu;
import j$.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class aa extends ae {

    /* renamed from: a, reason: collision with root package name */
    private static final bl f7975a = new bl(aa.class);

    /* renamed from: b, reason: collision with root package name */
    private com.google.d.d.bh f7976b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7977c;

    aa(com.google.d.d.bh bhVar, boolean z) {
        super(bhVar.size());
        com.google.d.b.an.B(bhVar);
        this.f7976b = bhVar;
        this.f7977c = z;
    }

    private final void C(Throwable th) {
        com.google.d.b.an.B(th);
        if (this.f7977c && !d(th) && E(B(), th)) {
            D(th);
        } else if (th instanceof Error) {
            D(th);
        }
    }

    private static void D(Throwable th) {
        f7975a.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean E(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        int iA = A();
        com.google.d.b.an.v(iA >= 0, "Less than 0 remaining futures");
        if (iA == 0) {
            this.seenExceptionsField = null;
            g();
            x(z.f8097b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(bm bmVar) {
        try {
            if (bmVar.isCancelled()) {
                this.f7976b = null;
                cancel(false);
            } else {
                try {
                    cf.s(bmVar);
                } catch (ExecutionException e2) {
                    C(e2.getCause());
                } catch (Throwable th) {
                    C(th);
                }
            }
        } finally {
            F();
        }
    }

    @Override // com.google.d.m.a.k
    protected final String a() {
        com.google.d.d.bh bhVar = this.f7976b;
        return bhVar != null ? "futures=".concat(bhVar.toString()) : super.a();
    }

    @Override // com.google.d.m.a.k
    protected final void b() {
        com.google.d.d.bh bhVar = this.f7976b;
        x(z.f8096a);
        if (isCancelled() && (bhVar != null)) {
            boolean zO = o();
            fu fuVarListIterator = bhVar.listIterator();
            while (fuVarListIterator.hasNext()) {
                ((bm) fuVarListIterator.next()).cancel(zO);
            }
        }
    }

    @Override // com.google.d.m.a.ae
    final void f(Set set) {
        com.google.d.b.an.B(set);
        if (isCancelled()) {
            return;
        }
        E(set, (Throwable) Objects.requireNonNull(k()));
    }

    abstract void g();

    final void h() {
        Objects.requireNonNull(this.f7976b);
        if (this.f7976b.isEmpty()) {
            g();
            return;
        }
        boolean z = this.f7977c;
        com.google.d.d.bh bhVar = this.f7976b;
        if (z) {
            fu fuVarListIterator = bhVar.listIterator();
            while (fuVarListIterator.hasNext()) {
                final bm bmVar = (bm) fuVarListIterator.next();
                if (bmVar.isDone()) {
                    G(bmVar);
                } else {
                    bmVar.addListener(new Runnable() { // from class: com.google.d.m.a.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8093a.G(bmVar);
                        }
                    }, al.f7989a);
                }
            }
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.google.d.m.a.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f8095a.F();
            }
        };
        fu fuVarListIterator2 = bhVar.listIterator();
        while (fuVarListIterator2.hasNext()) {
            bm bmVar2 = (bm) fuVarListIterator2.next();
            if (bmVar2.isDone()) {
                F();
            } else {
                bmVar2.addListener(runnable, al.f7989a);
            }
        }
    }

    void x(z zVar) {
        com.google.d.b.an.B(zVar);
        this.f7976b = null;
    }
}
