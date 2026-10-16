package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adss extends defpackage.adml {
    public final defpackage.adml a;
    private final defpackage.admm b;

    public adss(defpackage.admm admmVar) {
        admmVar.getClass();
        this.b = admmVar;
        defpackage.adml admlVarA = admmVar.a("pick_first");
        if (admlVarA == null) {
            defpackage.ador adorVarE = defpackage.ador.l.e(defpackage.a.bp("pick_first", "Could not find policy '", "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
            admlVarA = new adut(defpackage.adkh.c, new defpackage.adma(defpackage.admd.b(adorVarE)), adorVarE);
        }
        this.a = admlVarA;
    }

    @Override // defpackage.adlz
    public final /* synthetic */ defpackage.admj a(defpackage.admb admbVar) {
        return new defpackage.adsr(this, admbVar);
    }

    @Override // defpackage.adml
    public final defpackage.adno b(java.util.Map map) {
        java.util.List<aeam> listUnmodifiableList;
        java.lang.String strP;
        if (map != null) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (map.containsKey("loadBalancingConfig")) {
                    arrayList.addAll(defpackage.adrs.r(map, "loadBalancingConfig"));
                }
                if (arrayList.isEmpty() && (strP = defpackage.adrs.p(map, "loadBalancingPolicy")) != null) {
                    arrayList.add(java.util.Collections.singletonMap(strP.toLowerCase(java.util.Locale.ROOT), java.util.Collections.EMPTY_MAP));
                }
                java.util.List<java.util.Map> listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(arrayList);
                if (listUnmodifiableList2 == null) {
                    listUnmodifiableList = null;
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.util.Map map2 : listUnmodifiableList2) {
                        if (map2.size() != 1) {
                            throw new java.lang.RuntimeException("There are " + map2.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + java.lang.String.valueOf(map2));
                        }
                        java.lang.String str = (java.lang.String) ((java.util.Map.Entry) map2.entrySet().iterator().next()).getKey();
                        arrayList2.add(new aeam(str, defpackage.adrs.t(map2, str)));
                    }
                    listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(arrayList2);
                }
            } catch (java.lang.RuntimeException e) {
                return new defpackage.adno(defpackage.ador.d.e("can't parse load balancer configuration").d(e));
            }
        } else {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList == null || listUnmodifiableList.isEmpty()) {
            return null;
        }
        defpackage.admm admmVar = this.b;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (aeam aeamVar : listUnmodifiableList) {
            java.lang.String str2 = aeamVar.a;
            defpackage.adml admlVarA = admmVar.a(str2);
            if (admlVarA != null) {
                if (!arrayList3.isEmpty()) {
                    java.util.logging.Logger.getLogger(defpackage.aeao.class.getName()).logp(java.util.logging.Level.FINEST, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", arrayList3);
                }
                defpackage.adno adnoVarB = admlVarA.b(aeamVar.b);
                return adnoVarB.a == null ? new defpackage.adno(new defpackage.aean(admlVarA, adnoVarB.b)) : adnoVarB;
            }
            arrayList3.add(str2);
        }
        return new defpackage.adno(defpackage.ador.d.e(defpackage.a.bV(arrayList3, "None of ", " specified by Service Config are available.")));
    }

    @Override // defpackage.adml
    public final java.lang.String c() {
        return "auto_configured_internal";
    }

    @Override // defpackage.adml
    public final void d() {
    }

    @Override // defpackage.adml
    public final void e() {
    }
}
