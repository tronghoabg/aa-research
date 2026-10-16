package defpackage;

import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class jkx extends rwo implements jbv, jbo {
    private final jbn c;
    private xnx e;
    private jbw f;
    private boolean g;
    private final Object d = new Object();
    public final Object a = new Object();
    public final Set b = new yy(0);
    private int h = 13;
    private long i = 0;

    public jkx(jbn jbnVar) {
        this.c = jbnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ikf p(rws rwsVar) {
        synchronized (this.a) {
            yx yxVar = new yx((yy) this.b);
            while (yxVar.hasNext()) {
                ikf ikfVar = (ikf) yxVar.next();
                if (ikfVar.a == rwsVar) {
                    return ikfVar;
                }
            }
            return null;
        }
    }

    @Override // defpackage.jbo
    public final iyw a(xnz xnzVar) {
        if ((xnzVar.b & 2) == 0) {
            return null;
        }
        xnx xnxVar = xnzVar.d;
        if (xnxVar == null) {
            xnxVar = xnx.c;
        }
        this.e = xnxVar;
        return this;
    }

    @Override // defpackage.iyw
    public final jbj b(jbn jbnVar) {
        return new jbw(this.e, this, this.c);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return jcv.b;
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return jcv.b;
    }

    @Override // defpackage.rwp
    public final void f(rws rwsVar) throws RemoteException {
        if (rwsVar == null) {
            return;
        }
        synchronized (this.a) {
            if (p(rwsVar) == null) {
                this.b.add(new ikf(this, rwsVar, 5));
            }
        }
    }

    @Override // defpackage.rwp
    public final void g(rws rwsVar) throws RemoteException {
        synchronized (this.a) {
            ikf ikfVarP = p(rwsVar);
            if (ikfVarP != null) {
                rwsVar.asBinder().unlinkToDeath(ikfVarP, 0);
                this.b.remove(ikfVarP);
            }
        }
    }

    @Override // defpackage.rwp
    @ResultIgnorabilityUnspecified
    public final boolean gm(int i, long j) {
        boolean zL;
        synchronized (this.d) {
            zL = l(i, j);
        }
        return zL;
    }

    @Override // defpackage.rwp
    public final boolean h() {
        jbw jbwVar;
        synchronized (this.d) {
            jbwVar = this.f;
        }
        return jbwVar.a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, rws] */
    @Override // defpackage.jbv
    public final void j(xny xnyVar, abow abowVar) {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((ikf) arrayList.get(i)).a.a(xnyVar.A, abowVar.h());
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, rws] */
    @Override // defpackage.jbv
    public final void k() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((ikf) arrayList.get(i)).a.b();
            } catch (RemoteException unused) {
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean l(int i, long j) {
        synchronized (this.d) {
            jbw jbwVar = this.f;
            if (jbwVar != null) {
                return jbwVar.s(xny.b(i), j);
            }
            this.h = i;
            this.i = j;
            this.g = true;
            return true;
        }
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.rwp
    public final byte[] n(int i) {
        jbw jbwVar;
        synchronized (this.d) {
            jbwVar = this.f;
        }
        abow abowVarH = jbwVar.h(i);
        if (abowVarH != null) {
            return abowVarH.h();
        }
        return null;
    }

    @Override // defpackage.rwp
    public final int[] o() {
        jbw jbwVar;
        synchronized (this.d) {
            jbwVar = this.f;
        }
        return jbwVar.t();
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        synchronized (this.d) {
            this.f = (jbw) jbjVar;
            if (this.g) {
                l(this.h, this.i);
                this.g = false;
            }
        }
    }
}
