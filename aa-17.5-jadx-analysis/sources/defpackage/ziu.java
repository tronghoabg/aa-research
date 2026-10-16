package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes3.dex */
final class ziu extends admv {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public boolean c;
    public adnq d;
    public admc e;
    private final yfq g;
    private final Queue h;
    private final Set i;
    private int j;
    private boolean k;
    private boolean l;
    private admc m;

    public ziu(adqq adqqVar, yfq yfqVar, Set set) {
        super(adqqVar);
        this.a = new LinkedHashMap();
        this.h = new ArrayDeque();
        this.b = new LinkedHashMap();
        this.g = yfqVar;
        this.j = ((yls) yfqVar).c;
        this.i = set;
    }

    private final void ba() {
        if (o() || !this.h.isEmpty() || !this.l || this.c) {
            return;
        }
        l();
    }

    @Override // defpackage.adqq
    public final void a(adnq adnqVar, admc admcVar) {
        this.d = adnqVar;
        this.e = admcVar;
        this.l = true;
        ba();
    }

    @Override // defpackage.admv, defpackage.adqq
    public final void be(admc admcVar) {
        this.m = admcVar;
        admcVar.getClass();
        Iterator it = yrm.U(this.g.subList(0, this.j)).iterator();
        while (it.hasNext()) {
            this.j--;
            for (zim zimVar : yrm.U((List) it.next())) {
                if (this.i.contains(zimVar)) {
                    try {
                        zimVar.b();
                        throw null;
                    } catch (Throwable th) {
                        this.d = adnq.c(th);
                        this.e = new admc();
                        l();
                        return;
                    }
                }
            }
            if (o()) {
                return;
            }
        }
        this.f.be(this.m);
        this.k = true;
        k();
    }

    @Override // defpackage.admv, defpackage.adqq
    public final void g(Object obj) {
        this.h.add(new zit(obj, ((yls) this.g).c));
        k();
    }

    public final void k() {
        if (this.k) {
            for (zit zitVar : this.h) {
                Iterator it = yrm.U(this.g.subList(0, zitVar.b)).iterator();
                while (it.hasNext()) {
                    for (zim zimVar : yrm.U((List) it.next())) {
                        if (this.i.contains(zimVar)) {
                            zitVar.a.getClass();
                            try {
                                zimVar.c();
                                throw null;
                            } catch (Throwable th) {
                                this.d = adnq.c(th);
                                this.e = new admc();
                                l();
                                this.c = true;
                                return;
                            }
                        }
                    }
                    if (!zitVar.a()) {
                        return;
                    } else {
                        zitVar.b--;
                    }
                }
            }
            while (true) {
                Queue queue = this.h;
                if (queue.isEmpty()) {
                    break;
                }
                zit zitVar2 = (zit) queue.peek();
                if (!zitVar2.a() || zitVar2.b != 0) {
                    break;
                } else {
                    this.f.g(((zit) queue.poll()).a);
                }
            }
            ba();
        }
    }

    public final void l() {
        Iterator it = yrm.U(this.g).iterator();
        while (it.hasNext()) {
            for (zim zimVar : yrm.U((List) it.next())) {
                adnq adnqVar = this.d;
                admc admcVar = this.e;
                adnqVar.getClass();
                admcVar.getClass();
                if (this.i.contains(zimVar)) {
                    try {
                        zimVar.a();
                        throw null;
                    } catch (Throwable th) {
                        this.d = adnq.c(th);
                        this.e = new admc();
                    }
                }
            }
        }
        if (this.b.isEmpty()) {
            this.f.a(this.d, this.e);
        }
    }

    public final boolean o() {
        return !this.a.isEmpty();
    }
}
