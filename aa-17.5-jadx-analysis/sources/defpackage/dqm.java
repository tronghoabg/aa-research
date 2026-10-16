package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class dqm {
    public int b;
    public boolean c;
    public final dqn d;
    public dqm e;
    public dpb h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public dqm(dqn dqnVar, int i) {
        this.d = dqnVar;
        this.i = i;
    }

    public final int a() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int b() {
        dqm dqmVar;
        if (this.d.ar == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (dqmVar = this.e) == null || dqmVar.d.ar != 8) ? this.f : i;
    }

    public final dqm c() {
        int i = this.i - 1;
        if (i == 1) {
            return this.d.V;
        }
        if (i == 2) {
            return this.d.W;
        }
        if (i == 3) {
            return this.d.T;
        }
        if (i != 4) {
            return null;
        }
        return this.d.U;
    }

    public final void d(int i, ArrayList arrayList, dri driVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                cdj.e(((dqm) it.next()).d, i, arrayList, driVar);
            }
        }
    }

    public final void e() {
        HashSet hashSet;
        dqm dqmVar = this.e;
        if (dqmVar != null && (hashSet = dqmVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void f(int i) {
        this.b = i;
        this.c = true;
    }

    public final void g(int i) {
        if (j()) {
            this.g = i;
        }
    }

    public final boolean h() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((dqm) it.next()).c().j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean j() {
        return this.e != null;
    }

    public final boolean k(dqm dqmVar) {
        if (dqmVar == null) {
            return false;
        }
        int i = this.i;
        int i2 = dqmVar.i;
        if (i2 == i) {
            return i != 6 || (dqmVar.d.P && this.d.P);
        }
        int i3 = 9;
        int i4 = 4;
        int i5 = 2;
        switch (i - 1) {
            case 1:
            case 3:
                i3 = 8;
                break;
            case 2:
            case 4:
                i5 = 3;
                i4 = 5;
                break;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                return false;
        }
        boolean z = i2 == i5 || i2 == i4;
        return dqmVar.d instanceof dqr ? z || i2 == i3 : z;
    }

    public final void l(dqm dqmVar, int i, int i2, boolean z) {
        if (dqmVar == null) {
            e();
            return;
        }
        if (z || k(dqmVar)) {
            this.e = dqmVar;
            if (dqmVar.a == null) {
                dqmVar.a = new HashSet();
            }
            HashSet hashSet = this.e.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f = i;
            this.g = i2;
        }
    }

    public final void m() {
        dpb dpbVar = this.h;
        if (dpbVar == null) {
            this.h = new dpb(1);
        } else {
            dpbVar.c();
        }
    }

    public final String toString() {
        return this.d.as + ":" + a.S(this.i);
    }
}
