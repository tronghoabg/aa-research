package e.a.d;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends e.a.bv {

    /* renamed from: a, reason: collision with root package name */
    private final e.a.bw f47282a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a.bv f47283b;

    m(e.a.bw bwVar) {
        com.google.d.b.an.C(bwVar, "registry");
        this.f47282a = bwVar;
        e.a.bv bvVarA = bwVar.a("pick_first");
        if (bvVarA == null) {
            e.a.ee eeVarG = e.a.ee.f47410j.g("Could not find policy 'pick_first'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
            bvVarA = new cu(e.a.w.f47853c, new e.a.bk(e.a.bn.b(eeVarG)), eeVarG);
        }
        this.f47283b = bvVarA;
    }

    @Override // e.a.bj
    public final /* synthetic */ e.a.bt a(e.a.bl blVar) {
        return new l(this, blVar);
    }

    @Override // e.a.bv
    public final e.a.cy b(Map map) {
        List<jk> listUnmodifiableList;
        String strI;
        if (map != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (map.containsKey("loadBalancingConfig")) {
                    arrayList.addAll(jm.k(map, "loadBalancingConfig"));
                }
                if (arrayList.isEmpty() && (strI = jm.i(map, "loadBalancingPolicy")) != null) {
                    arrayList.add(Collections.singletonMap(strI.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
                }
                List<Map> listUnmodifiableList2 = DesugarCollections.unmodifiableList(arrayList);
                if (listUnmodifiableList2 == null) {
                    listUnmodifiableList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map map2 : listUnmodifiableList2) {
                        if (map2.size() != 1) {
                            throw new RuntimeException("There are " + map2.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + String.valueOf(map2));
                        }
                        String str = (String) ((Map.Entry) map2.entrySet().iterator().next()).getKey();
                        arrayList2.add(new jk(str, jm.m(map2, str)));
                    }
                    listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
                }
            } catch (RuntimeException e2) {
                return e.a.cy.b(e.a.ee.f47403c.g("can't parse load balancer configuration").f(e2));
            }
        } else {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList == null || listUnmodifiableList.isEmpty()) {
            return null;
        }
        e.a.bw bwVar = this.f47282a;
        ArrayList arrayList3 = new ArrayList();
        for (jk jkVar : listUnmodifiableList) {
            String strA = jkVar.a();
            e.a.bv bvVarA = bwVar.a(strA);
            if (bvVarA != null) {
                if (!arrayList3.isEmpty()) {
                    Logger.getLogger(jm.class.getName()).logp(Level.FINEST, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", arrayList3);
                }
                e.a.cy cyVarB = bvVarA.b(jkVar.b());
                return cyVarB.c() == null ? e.a.cy.a(new jl(bvVarA, cyVarB.d())) : cyVarB;
            }
            arrayList3.add(strA);
        }
        return e.a.cy.b(e.a.ee.f47403c.g("None of " + arrayList3.toString() + " specified by Service Config are available."));
    }

    @Override // e.a.bv
    public final String c() {
        return "auto_configured_internal";
    }

    @Override // e.a.bv
    public final void d() {
    }

    @Override // e.a.bv
    public final void e() {
    }
}
