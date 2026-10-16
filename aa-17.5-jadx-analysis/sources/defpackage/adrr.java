package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class adrr extends adlk {
    public final adlk a;
    private final adll b;

    public adrr(adll adllVar) {
        adllVar.getClass();
        this.b = adllVar;
        adlk adlkVarA = adllVar.a("pick_first");
        if (adlkVarA == null) {
            adnq adnqVarE = adnq.l.e(a.bq("pick_first", "Could not find policy '", "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
            adlkVarA = new adtt(adjh.c, new adkz(adlc.b(adnqVarE)), adnqVarE);
        }
        this.a = adlkVarA;
    }

    @Override // defpackage.adky
    public final /* synthetic */ adli a(adla adlaVar) {
        return new adrq(this, adlaVar);
    }

    @Override // defpackage.adlk
    public final admn b(Map map) {
        List<adzm> listUnmodifiableList;
        String strV;
        if (map != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (map.containsKey("loadBalancingConfig")) {
                    arrayList.addAll(adqq.x(map, "loadBalancingConfig"));
                }
                if (arrayList.isEmpty() && (strV = adqq.v(map, "loadBalancingPolicy")) != null) {
                    arrayList.add(Collections.singletonMap(strV.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
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
                        arrayList2.add(new adzm(str, adqq.z(map2, str)));
                    }
                    listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
                }
            } catch (RuntimeException e) {
                return new admn(adnq.d.e("can't parse load balancer configuration").d(e));
            }
        } else {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList == null || listUnmodifiableList.isEmpty()) {
            return null;
        }
        adll adllVar = this.b;
        ArrayList arrayList3 = new ArrayList();
        for (adzm adzmVar : listUnmodifiableList) {
            String str2 = adzmVar.a;
            adlk adlkVarA = adllVar.a(str2);
            if (adlkVarA != null) {
                if (!arrayList3.isEmpty()) {
                    Logger.getLogger(adzo.class.getName()).logp(Level.FINEST, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", arrayList3);
                }
                admn admnVarB = adlkVarA.b(adzmVar.b);
                return admnVarB.a == null ? new admn(new adzn(adlkVarA, admnVarB.b)) : admnVarB;
            }
            arrayList3.add(str2);
        }
        return new admn(adnq.d.e(a.bW(arrayList3, "None of ", " specified by Service Config are available.")));
    }

    @Override // defpackage.adlk
    public final String c() {
        return "auto_configured_internal";
    }

    @Override // defpackage.adlk
    public final void d() {
    }

    @Override // defpackage.adlk
    public final void e() {
    }
}
