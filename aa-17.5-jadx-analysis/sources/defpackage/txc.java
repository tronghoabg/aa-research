package defpackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class txc implements uda {
    public final txb b;
    public ucf e;
    private final txb h;
    private boolean i;
    public final txb a = new txb(new txa(3));
    public final txb c = new txb(new txa(5));
    public final Set d = new HashSet();
    public final Set f = new LinkedHashSet();
    public final Set g = new LinkedHashSet();
    private final aehj j = new aehy(16);

    public txc() {
        int i = 4;
        this.h = new txb(new txa(i));
        this.b = new txb(new txa(i));
    }

    @Override // defpackage.uda
    public final abgl a() {
        return null;
    }

    @Override // defpackage.uda
    public final void c(ucf ucfVar) {
        synchronized (this) {
            Set<tqg> set = this.f;
            for (tqg tqgVar : set) {
                ucfVar.p(tqgVar);
                this.g.add(tqgVar);
            }
            set.clear();
            this.i = false;
            this.e = null;
        }
    }

    @Override // defpackage.uda
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [aehj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [aehj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.uda
    public final void e(rfe rfeVar) {
        yfg yfgVarA;
        yfg yfgVarA2;
        yfg yfgVarA3;
        yfg yfgVarA4;
        synchronized (this) {
            this.i = false;
            yfgVarA = this.a.a();
            yfgVarA2 = this.c.a();
            yfgVarA3 = this.b.a();
            yfgVarA4 = this.h.a();
            aehj aehjVar = this.j;
            if (!aehjVar.isEmpty()) {
                aety it = ((aehy) aehjVar).l().iterator();
                while (it.hasNext()) {
                    aehh aehhVar = (aehh) it.next();
                    int iA = aehhVar.a();
                    tqf tqfVar = (tqf) aehhVar.getValue();
                    if (iA != 0) {
                        if (tqfVar != null) {
                            rfeVar.c.a(iA, tqfVar);
                        } else {
                            ?? r6 = rfeVar.c;
                            if (r6.c(iA)) {
                                r6.b(iA);
                            }
                        }
                    }
                }
            }
        }
        if (yfgVarA != null) {
            rfeVar.f.addAll(yfgVarA);
        }
        if (yfgVarA3 != null) {
            rfeVar.b.addAll(yfgVarA3);
        }
        if (yfgVarA2 != null) {
            rfeVar.a.addAll(yfgVarA2);
        }
        if (yfgVarA4 != null) {
            rfeVar.l(0, yfgVarA4);
        }
    }

    public final void f(tqg tqgVar) {
        synchronized (this) {
            if (this.e != null) {
                Set set = this.f;
                if (!set.contains(tqgVar)) {
                    this.e.e(tqgVar);
                    set.add(tqgVar);
                }
            } else {
                this.g.add(tqgVar);
            }
        }
    }

    public final void g() {
        boolean z;
        ucf ucfVar;
        synchronized (this) {
            z = this.i;
            ucfVar = this.e;
            this.i = ucfVar != null;
        }
        if (ucfVar == null || z) {
            return;
        }
        ucfVar.m(this);
    }

    @Override // defpackage.uda
    public final void gr(ucf ucfVar) {
        synchronized (this) {
            this.e = ucfVar;
            this.i = false;
            Set<tqg> set = this.g;
            for (tqg tqgVar : set) {
                ucfVar.e(tqgVar);
                this.f.add(tqgVar);
            }
            set.clear();
        }
    }
}
