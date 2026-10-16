package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adye implements admi {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.admj b;
    private final /* synthetic */ int c;

    public /* synthetic */ adye(adyd adydVar, adyb adybVar, int i) {
        this.c = i;
        this.b = adydVar;
        this.a = adybVar;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0169  */
    public final void a(defpackage.adki adkiVar) {
        adyg admaVar;
        adyg admaVar2;
        defpackage.adkh adkhVar;
        if (this.c == 0) {
            defpackage.adkh adkhVar2 = adkiVar.a;
            if (adkhVar2 == defpackage.adkh.e) {
                return;
            }
            defpackage.admj admjVar = this.b;
            defpackage.adkh adkhVar3 = defpackage.adkh.c;
            if (adkhVar2 == adkhVar3 || adkhVar2 == defpackage.adkh.d) {
                ((defpackage.adyh) admjVar).g.e();
            }
            defpackage.adyh adyhVar = (defpackage.adyh) admjVar;
            if (adyhVar.h == adkhVar3) {
                if (adkhVar2 == defpackage.adkh.a) {
                    return;
                }
                if (adkhVar2 == defpackage.adkh.d) {
                    admjVar.c();
                    return;
                }
            }
            int iOrdinal = adkhVar2.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    admaVar2 = new defpackage.adma(defpackage.admd.e((defpackage.admg) this.a));
                } else if (iOrdinal == 2) {
                    admaVar2 = new defpackage.adma(defpackage.admd.b(adkiVar.b));
                } else {
                    if (iOrdinal != 3) {
                        throw new java.lang.IllegalArgumentException("Unsupported state:".concat(adkhVar2.toString()));
                    }
                    admaVar = new adyg(adyhVar);
                }
                admaVar = admaVar2;
            } else {
                admaVar = new defpackage.adma(defpackage.adyh.f);
            }
            adyhVar.e(adkhVar2, admaVar);
            return;
        }
        java.lang.Object obj = this.a;
        adyb adybVar = (adyb) obj;
        defpackage.admg admgVar = adybVar.a;
        adyd adydVar = this.b;
        java.net.SocketAddress socketAddressK = adyd.k(admgVar);
        adyd adydVar2 = adydVar;
        java.util.Map map = adydVar2.j;
        if (obj == map.get(socketAddressK) && (adkhVar = adkiVar.a) != defpackage.adkh.e) {
            defpackage.adkh adkhVar4 = defpackage.adkh.d;
            if (adkhVar == adkhVar4 && adybVar.b == defpackage.adkh.b) {
                adydVar2.i.e();
            }
            adybVar.b(adkhVar);
            defpackage.adkh adkhVar5 = adydVar2.n;
            defpackage.adkh adkhVar6 = defpackage.adkh.c;
            if (adkhVar5 == adkhVar6 || adydVar2.o == adkhVar6) {
                if (adkhVar == defpackage.adkh.a) {
                    return;
                }
                if (adkhVar == adkhVar4) {
                    adydVar.c();
                    return;
                }
            }
            int iOrdinal2 = adkhVar.ordinal();
            if (iOrdinal2 == 0) {
                defpackage.adkh adkhVar7 = defpackage.adkh.a;
                adydVar2.n = adkhVar7;
                if (adydVar2.h || adydVar2.k.f()) {
                    adxy adxyVar = adydVar2.k;
                    if (adxyVar.f() && !map.containsKey(adxyVar.b())) {
                        adydVar2.k.g(adyd.k(admgVar));
                    }
                } else {
                    adydVar2.k.g(adyd.k(admgVar));
                }
                adydVar2.h(adkhVar7, new defpackage.adma(defpackage.admd.d("pick_first: attempting to connect")));
                return;
            }
            if (iOrdinal2 == 1) {
                defpackage.aecg aecgVar = adydVar2.s;
                if (aecgVar != null) {
                    aecgVar.h();
                    adydVar2.s = null;
                }
                adydVar2.q = null;
                adydVar2.f();
                java.util.Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    defpackage.admg admgVar2 = ((adyb) it.next()).a;
                    if (!admgVar2.equals(admgVar)) {
                        admgVar2.b();
                    }
                }
                map.clear();
                defpackage.adkh adkhVar8 = defpackage.adkh.b;
                adybVar.b(adkhVar8);
                map.put(adyd.k(admgVar), obj);
                adydVar2.k.g(adyd.k(admgVar));
                adydVar2.n = adkhVar8;
                adydVar2.i(adybVar);
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    throw new java.lang.IllegalArgumentException("Unsupported state:".concat(adkhVar.toString()));
                }
                adydVar2.k.c();
                adydVar2.n = adkhVar4;
                adydVar2.h(adkhVar4, new adya(adydVar2, adydVar2));
                return;
            }
            adxy adxyVar2 = adydVar2.k;
            if (adxyVar2.f() && map.get(adxyVar2.b()) == obj) {
                if (adxyVar2.e()) {
                    adydVar2.f();
                    adydVar.c();
                } else if (map.size() >= adxyVar2.a()) {
                    adydVar2.g();
                } else {
                    adxyVar2.c();
                    adydVar.c();
                }
            }
            if (map.size() >= adxyVar2.a()) {
                java.util.Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    if (!((adyb) it2.next()).c) {
                        return;
                    }
                }
                adydVar2.n = adkhVar6;
                adydVar2.h(adkhVar6, new defpackage.adma(defpackage.admd.b(adkiVar.b)));
                int i = adydVar2.l + 1;
                adydVar2.l = i;
                if (i >= adxyVar2.a() || adydVar2.m) {
                    adydVar2.m = false;
                    adydVar2.l = 0;
                    adydVar2.i.e();
                }
            }
        }
    }

    public adye(defpackage.adyh adyhVar, defpackage.admg admgVar, int i) {
        this.c = i;
        this.a = admgVar;
        this.b = adyhVar;
    }
}
