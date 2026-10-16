package defpackage;

import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class sew extends rwo implements ruz, ruu {
    public boolean d;
    public rvb e;
    private final rut f;
    private xnx g;
    private boolean h;
    public final Object a = new Object();
    public final Object b = new Object();
    public final Set c = new yy(0);
    private int i = 13;
    private long j = 0;

    public sew(rut rutVar) {
        this.f = rutVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final xev d(rws rwsVar) {
        synchronized (this.b) {
            yx yxVar = new yx((yy) this.c);
            while (yxVar.hasNext()) {
                xev xevVar = (xev) yxVar.next();
                if (xevVar.a == rwsVar) {
                    return xevVar;
                }
            }
            return null;
        }
    }

    @Override // defpackage.ruu
    public final rso a(xnz xnzVar) {
        if ((xnzVar.b & 2) == 0) {
            return null;
        }
        xnx xnxVar = xnzVar.d;
        if (xnxVar == null) {
            xnxVar = xnx.c;
        }
        this.g = xnxVar;
        return this;
    }

    @Override // defpackage.rso
    public final ruq b(rut rutVar) {
        return new rvb(this.g, this, this.f, 1);
    }

    @ResultIgnorabilityUnspecified
    public final boolean c(int i, long j) {
        synchronized (this.a) {
            rvb rvbVar = this.e;
            if (rvbVar != null) {
                return rvbVar.k(xny.b(i), j);
            }
            this.i = i;
            this.j = j;
            this.h = true;
            return true;
        }
    }

    @Override // defpackage.rwp
    public final void f(rws rwsVar) throws RemoteException {
        if (rwsVar == null) {
            return;
        }
        synchronized (this.b) {
            if (d(rwsVar) == null) {
                this.c.add(new xev(this, rwsVar, 1));
            }
        }
    }

    @Override // defpackage.rwp
    public final void g(rws rwsVar) throws RemoteException {
        synchronized (this.b) {
            xev xevVarD = d(rwsVar);
            if (xevVarD != null) {
                rwsVar.asBinder().unlinkToDeath(xevVarD, 0);
                this.c.remove(xevVarD);
            }
        }
    }

    @Override // defpackage.rso
    public final void gl(PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.rwp
    @ResultIgnorabilityUnspecified
    public final boolean gm(int i, long j) {
        boolean zC;
        synchronized (this.a) {
            if (i == 13) {
                this.d = true;
                i = 13;
                zC = c(i, j);
            } else {
                zC = c(i, j);
            }
        }
        return zC;
    }

    @Override // defpackage.rwp
    public final boolean h() {
        rvb rvbVar;
        synchronized (this.a) {
            rvbVar = this.e;
        }
        return rvbVar.a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, rws] */
    @Override // defpackage.ruz
    public final void i(xny xnyVar, abow abowVar) {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.c);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((xev) arrayList.get(i)).a.a(xnyVar.A, abowVar.h());
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, rws] */
    @Override // defpackage.ruz
    public final void j() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.c);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((xev) arrayList.get(i)).a.b();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.rso
    public final void k() {
        throw null;
    }

    @Override // defpackage.rso
    public final void l(ruq ruqVar) {
        synchronized (this.a) {
            this.e = (rvb) ruqVar;
            if (this.h) {
                c(this.i, this.j);
                this.h = false;
            }
        }
    }

    @Override // defpackage.rwp
    public final byte[] n(int i) {
        rvb rvbVar;
        synchronized (this.a) {
            rvbVar = this.e;
        }
        abow abowVarI = rvbVar.i(i);
        if (abowVarI != null) {
            return abowVarI.h();
        }
        return null;
    }

    @Override // defpackage.rwp
    public final int[] o() {
        rvb rvbVar;
        synchronized (this.a) {
            rvbVar = this.e;
        }
        return rvbVar.l();
    }
}
