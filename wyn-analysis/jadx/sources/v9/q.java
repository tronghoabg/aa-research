package v9;

import E5.n0;
import ad.L;
import com.google.protobuf.ByteString;
import java.util.ArrayDeque;
import java.util.HashSet;
import ka.I1;
import ka.K1;
import m9.F;
import md.j0;
import md.k0;
import r9.C3955l;
import w9.AbstractC4397p;

/* loaded from: classes4.dex */
public final class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f47104a;

    public q(n0 n0Var) {
        this.f47104a = n0Var;
    }

    @Override // v9.s
    public final void a(k0 k0Var) {
        n0 n0Var = this.f47104a;
        n0Var.getClass();
        if (k0Var.f()) {
            A6.c.z(!n0Var.v(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        boolean zF = k0Var.f();
        B b5 = (B) n0Var.f3476f;
        if (!zF) {
            ArrayDeque arrayDeque = (ArrayDeque) n0Var.f3482m;
            if (!arrayDeque.isEmpty()) {
                boolean z2 = b5.f47039s;
                j0 j0Var = k0Var.f40685a;
                if (z2) {
                    A6.c.z(!k0Var.f(), "Handling write error with status OK.", new Object[0]);
                    HashSet hashSet = g.f47065d;
                    if (g.a((F) F.f40422m.get(j0Var.f40671a, F.UNKNOWN)) && !j0Var.equals(j0.ABORTED)) {
                        t9.i iVar = (t9.i) arrayDeque.poll();
                        b5.b();
                        int i5 = iVar.f45954a;
                        p9.z zVarE = ((p9.s) ((L) n0Var.f3472b).f17515b).e();
                        zVarE.a("handleRejectedWrite");
                        C3955l c3955l = zVarE.f43431a;
                        c9.c cVar = (c9.c) c3955l.f44631a.O("Reject batch", new E5.A(c3955l, i5, 5));
                        if (!cVar.isEmpty()) {
                            p9.z.e(k0Var, "Write failed at %s", ((s9.h) cVar.e()).f45375a);
                        }
                        zVarE.f(i5, k0Var);
                        zVarE.j(i5);
                        zVarE.b(cVar, null);
                        n0Var.i();
                    }
                } else {
                    A6.c.z(!k0Var.f(), "Handling write error with status OK.", new Object[0]);
                    HashSet hashSet2 = g.f47065d;
                    if (g.a((F) F.f40422m.get(j0Var.f40671a, F.UNKNOWN))) {
                        Ba.c.p("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", 1, AbstractC4397p.i(b5.f47040t), k0Var);
                        ByteString byteString = B.f47037u;
                        byteString.getClass();
                        b5.f47040t = byteString;
                        C3955l c3955l2 = (C3955l) n0Var.f3473c;
                        c3955l2.f44631a.P("Set stream token", new ng.a(12, c3955l2, byteString));
                    }
                }
            }
        }
        if (n0Var.v()) {
            A6.c.z(n0Var.v(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
            b5.g();
        }
    }

    @Override // v9.s
    public final void b() {
        B b5 = (B) this.f47104a.f3476f;
        A6.c.z(b5.c(), "Writing handshake requires an opened stream", new Object[0]);
        A6.c.z(!b5.f47039s, "Handshake already completed", new Object[0]);
        I1 i1F = K1.f();
        i1F.b(b5.f47038r.f47102b);
        b5.i((K1) i1F.build());
    }
}
