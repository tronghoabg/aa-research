package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class drj implements dqz {
    public int c;
    public dqn d;
    protected int j;
    sn l;
    public final drc e = new drc(this);
    public int f = 0;
    public boolean g = false;
    public final drb h = new drb(this);
    public final drb i = new drb(this);
    protected int k = 1;

    public drj(dqn dqnVar) {
        this.d = dqnVar;
    }

    protected static final void j(drb drbVar, drb drbVar2, int i) {
        drbVar.k.add(drbVar2);
        drbVar.e = i;
        drbVar2.j.add(drbVar);
    }

    protected static final drb k(dqm dqmVar) {
        dqm dqmVar2 = dqmVar.e;
        if (dqmVar2 == null) {
            return null;
        }
        int i = dqmVar2.i;
        dqn dqnVar = dqmVar2.d;
        int i2 = i - 1;
        if (i2 == 1) {
            return dqnVar.o.h;
        }
        if (i2 == 2) {
            return dqnVar.p.h;
        }
        if (i2 == 3) {
            return dqnVar.o.i;
        }
        if (i2 == 4) {
            return dqnVar.p.i;
        }
        if (i2 != 5) {
            return null;
        }
        return dqnVar.p.a;
    }

    protected static final drb l(dqm dqmVar, int i) {
        dqm dqmVar2 = dqmVar.e;
        if (dqmVar2 == null) {
            return null;
        }
        dqn dqnVar = dqmVar2.d;
        drj drjVar = i == 0 ? dqnVar.o : dqnVar.p;
        int i2 = dqmVar2.i - 1;
        if (i2 == 1 || i2 == 2) {
            return drjVar.h;
        }
        if (i2 == 3 || i2 == 4) {
            return drjVar.i;
        }
        return null;
    }

    public long a() {
        if (this.e.i) {
            return r2.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.dqz
    public void f() {
        throw null;
    }

    protected final int h(int i, int i2) {
        dqn dqnVar = this.d;
        if (i2 == 0) {
            int i3 = dqnVar.G;
            int iMax = Math.max(dqnVar.F, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = dqnVar.J;
            int iMax2 = Math.max(dqnVar.I, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    protected final void i(drb drbVar, drb drbVar2, int i, drc drcVar) {
        List list = drbVar.k;
        list.add(drbVar2);
        list.add(this.e);
        drbVar.g = i;
        drbVar.h = drcVar;
        drbVar2.j.add(drbVar);
        drcVar.j.add(drbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void m(defpackage.dqm r13, defpackage.dqm r14, int r15) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drj.m(dqm, dqm, int):void");
    }
}
