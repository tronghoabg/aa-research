package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class bzg extends bxy implements Iterable, cfd, afgc {
    public int b;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public HashMap i;
    public zh j;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public ArrayList h = new ArrayList();

    public static final void g(bzj bzjVar, int i) {
        while (bzjVar.q >= 0 && bzjVar.p <= i) {
            bzjVar.I();
            bzjVar.V();
        }
    }

    @Override // defpackage.bxy
    public final void a() {
        this.j = new zh(6);
    }

    @Override // defpackage.bxy
    public final void b() {
        this.i = new HashMap();
    }

    @Override // defpackage.bxy
    public final boolean c() {
        return this.b == 0;
    }

    public final int d(bzb bzbVar) {
        if (this.f) {
            buz.b("Use active SlotWriter to determine anchor location instead");
        }
        if (!bzbVar.a()) {
            bxc.a("Anchor refers to a group that was removed");
        }
        return bzbVar.a;
    }

    public final bzf e() {
        if (this.f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.e++;
        return new bzf(this);
    }

    public final bzj f() {
        if (this.f) {
            buz.b("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            buz.b("Cannot start a writer when a reader is pending");
        }
        this.f = true;
        this.g++;
        return new bzj(this);
    }

    public final boolean h(bzb bzbVar) {
        int iC;
        return bzbVar.a() && (iC = bzi.c(this.h, bzbVar.a, this.b)) >= 0 && affa.f(this.h.get(iC), bzbVar);
    }

    public final void i(int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList, HashMap map, zh zhVar) {
        this.a = iArr;
        this.b = i;
        this.c = objArr;
        this.d = i2;
        this.h = arrayList;
        this.i = map;
        this.j = zhVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bzc(this, 0, this.b);
    }

    public final bzi j(int i) {
        int i2;
        HashMap map = this.i;
        if (map != null) {
            if (this.f) {
                buz.b("use active SlotWriter to crate an anchor for location instead");
            }
            bzb bzbVarE = (i < 0 || i >= (i2 = this.b)) ? null : bzi.e(this.h, i, i2);
            if (bzbVarE != null) {
                return (bzi) map.get(bzbVarE);
            }
        }
        return null;
    }
}
