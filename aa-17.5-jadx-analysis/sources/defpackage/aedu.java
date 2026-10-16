package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class aedu extends adli {
    public static final Logger f = Logger.getLogger(aedu.class.getName());
    private static final int l = new Random().nextInt();
    public final adla h;
    protected boolean i;
    protected adjh k;
    public List g = new ArrayList(0);
    protected final adlk j = new adxg();

    protected aedu(adla adlaVar) {
        this.h = adlaVar;
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    @Override // defpackage.adli
    public final adnq a(adle adleVar) {
        adnq adnqVarE;
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddresses", "Received resolution result: {0}", adleVar);
        try {
            this.i = true;
            List<adjv> list = adleVar.a;
            LinkedHashMap linkedHashMapL = yrm.L(list.size());
            for (adjv adjvVar : list) {
                adis adisVar = adis.a;
                List listSingletonList = Collections.singletonList(adjvVar);
                adqn adqnVar = new adqn(adis.a);
                adqnVar.c(e, true);
                linkedHashMapL.put(new aedt(adjvVar), new adle(listSingletonList, adqnVar.a(), null));
            }
            if (linkedHashMapL.isEmpty()) {
                adnqVarE = adnq.m.e(a.bX(adleVar, "NameResolver returned no usable address. "));
                b(adnqVarE);
            } else {
                LinkedHashMap linkedHashMapL2 = yrm.L(this.g.size());
                for (aeds aedsVar : this.g) {
                    linkedHashMapL2.put(aedsVar.a, aedsVar);
                }
                adnq adnqVar = adnq.b;
                ArrayList arrayList = new ArrayList(linkedHashMapL.size());
                for (Map.Entry entry : linkedHashMapL.entrySet()) {
                    aeds aedsVarE = (aeds) linkedHashMapL2.remove(entry.getKey());
                    if (aedsVarE == null) {
                        aedsVarE = e(entry.getKey());
                    }
                    arrayList.add(aedsVarE);
                }
                int iJ = arrayList.isEmpty() ? 0 : (int) (zeb.j(l) % zeb.j(arrayList.size()));
                for (aeds aedsVar2 : yeb.a(yrm.al(arrayList, iJ), yrm.ak(arrayList, iJ))) {
                    adle adleVar2 = (adle) linkedHashMapL.get(aedsVar2.a);
                    if (adleVar2 != null) {
                        adnq adnqVarA = aedsVar2.b.a(adleVar2);
                        if (!adnqVarA.g()) {
                            adnqVar = adnqVarA;
                        }
                    }
                }
                this.g = arrayList;
                f();
                Iterator it = linkedHashMapL2.values().iterator();
                while (it.hasNext()) {
                    ((aeds) it.next()).b();
                }
                adnqVarE = adnqVar;
            }
            return adnqVarE;
        } finally {
            this.i = false;
        }
    }

    @Override // defpackage.adli
    public final void b(adnq adnqVar) {
        if (this.k != adjh.b) {
            this.h.f(adjh.c, new adkz(adlc.b(adnqVar)));
        }
    }

    @Override // defpackage.adli
    public final void d() {
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((aeds) it.next()).b();
        }
        this.g.clear();
    }

    protected aeds e(Object obj) {
        throw null;
    }

    protected abstract void f();
}
