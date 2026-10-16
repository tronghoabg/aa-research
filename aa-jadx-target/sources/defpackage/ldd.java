package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ldd {
    public final defpackage.whw d;
    public final defpackage.ndd e;
    private final defpackage.whg f;
    public static final defpackage.ldb a = new defpackage.ldb();
    public static final defpackage.yqm b = defpackage.yqm.c("GH.CsatRateLimiter");
    private static final defpackage.kwv g = new defpackage.kwv(defpackage.abrz.a);
    public static final defpackage.afhl c = new defpackage.lco(defpackage.afga.bZ(new defpackage.mko[]{defpackage.mko.b, defpackage.mko.a}), 3);

    public /* synthetic */ ldd(byte[] bArr) {
        defpackage.mkp mkpVar = defpackage.mkp.a;
        android.content.Context context = mkpVar.c;
        context.getClass();
        java.util.concurrent.Executor executor = mkpVar.d;
        executor.getClass();
        context.getClass();
        executor.getClass();
        defpackage.whf whfVarA = defpackage.whg.a();
        java.util.regex.Pattern pattern = defpackage.wfx.a;
        defpackage.wfw wfwVar = new defpackage.wfw(context);
        wfwVar.b("csat");
        wfwVar.c("ratelimit.pb");
        whfVarA.d(wfwVar.a());
        defpackage.abrz abrzVar = defpackage.abrz.a;
        whfVarA.c(abrzVar);
        whfVarA.e(g);
        whfVarA.a = defpackage.whi.a;
        defpackage.whg whgVarA = whfVarA.a();
        this.f = whgVarA;
        defpackage.afar afarVar = defpackage.mik.a;
        this.d = defpackage.mdp.e().a(whgVarA);
        abrzVar.getClass();
        defpackage.abol abolVar = defpackage.abol.a;
        abolVar.getClass();
        defpackage.ehy ehyVar = new defpackage.ehy(new defpackage.ehd(abrzVar, abolVar), new defpackage.fma(context, 8));
        ehyVar.a = new defpackage.ehw(new defpackage.kmu(20));
        ehyVar.a(executor);
        ehyVar.b = true;
        this.e = ehyVar.b();
    }

    public static final void a(defpackage.zhs zhsVar) {
        defpackage.ysr.cy(zhsVar, new ldc(), defpackage.zgt.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x0113 A[LOOP:3: B:54:0x0111->B:55:0x0113, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x013b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x0194  */
    /* JADX WARN: Code duplicated, block: B:72:0x0198  */
    /* JADX WARN: Code duplicated, block: B:86:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x017c A[SYNTHETIC] */
    public static final java.util.Set b(java.util.Set set, defpackage.abrz abrzVar, j$.time.Instant instant) {
        java.lang.Object next;
        java.util.ArrayList arrayList;
        java.util.Map mapW;
        java.util.ArrayList arrayList2;
        java.util.Map mapW2;
        defpackage.lby[] lbyVarArrValues;
        java.util.LinkedHashMap linkedHashMap;
        int i;
        java.util.ArrayList arrayList3;
        defpackage.ldj ldjVar;
        defpackage.absg absgVar;
        absa absaVar;
        defpackage.abqv abqvVar;
        defpackage.zbe zbeVarB;
        defpackage.lby lbyVarI;
        defpackage.afau afauVar;
        defpackage.zbe zbeVarB2;
        defpackage.lby lbyVarI2;
        defpackage.afau afauVar2;
        defpackage.abqv abqvVar2;
        java.util.Iterator it = set.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((defpackage.lby) next).v);
        defpackage.lby lbyVar = (defpackage.lby) next;
        if (lbyVar != null) {
            return defpackage.afga.I(lbyVar);
        }
        if ((abrzVar.b & 1) == 0) {
            if ((abrzVar.b & 2) != 0) {
                abqvVar2 = abrzVar.e;
                if (abqvVar2 == null) {
                    abqvVar2 = defpackage.abqv.a;
                }
                abqvVar2.getClass();
                if (defpackage.jzl.h(instant, abqvVar2).compareTo(j$.time.Duration.ofSeconds(defpackage.acqn.c())) < 0) {
                    ((defpackage.yqj) b.f()).u("Not eligible for CSAT - too soon since last response");
                }
            }
            defpackage.abpj abpjVar = abrzVar.c;
            abpjVar.getClass();
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : abpjVar) {
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap = defpackage.lby.a;
                zbeVarB2 = defpackage.zbe.b(((absa) obj).c);
                if (zbeVarB2 == null) {
                    zbeVarB2 = defpackage.zbe.UNKNOWN_CONTEXT;
                }
                lbyVarI2 = defpackage.jzl.i(zbeVarB2);
                if (lbyVarI2 != null) {
                    afauVar2 = new defpackage.afau(lbyVarI2, obj);
                } else {
                    afauVar2 = null;
                }
                if (afauVar2 != null) {
                    arrayList.add(afauVar2);
                }
            }
            mapW = defpackage.afga.W(arrayList);
            defpackage.abpj abpjVar2 = defpackage.acqn.d().b;
            abpjVar2.getClass();
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : abpjVar2) {
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap2 = defpackage.lby.a;
                zbeVarB = defpackage.zbe.b(((defpackage.absg) obj2).b);
                if (zbeVarB == null) {
                    zbeVarB = defpackage.zbe.UNKNOWN_CONTEXT;
                }
                lbyVarI = defpackage.jzl.i(zbeVarB);
                if (lbyVarI != null) {
                    afauVar = new defpackage.afau(lbyVarI, obj2);
                } else {
                    afauVar = null;
                }
                if (afauVar != null) {
                    arrayList2.add(afauVar);
                }
            }
            mapW2 = defpackage.afga.W(arrayList2);
            lbyVarArrValues = defpackage.lby.values();
            linkedHashMap = new java.util.LinkedHashMap(defpackage.afqt.e(defpackage.afga.P(lbyVarArrValues.length), 16));
            for (defpackage.lby lbyVar2 : lbyVarArrValues) {
                linkedHashMap.put(lbyVar2, new defpackage.ldj(lbyVar2, (defpackage.absg) mapW2.get(lbyVar2), (absa) mapW.get(lbyVar2)));
            }
            arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : set) {
                ldjVar = (defpackage.ldj) defpackage.afga.S(linkedHashMap, (defpackage.lby) obj3);
                absgVar = ldjVar.b;
                if (absgVar == null) {
                    b.l().y("Not eligible for %s - no configuration available", ldjVar.a.name());
                } else {
                    absaVar = ldjVar.c;
                    if (absaVar == null) {
                        b.l().y("Eligible for %s - no response data on file", ldjVar.a.name());
                    } else if (absgVar.d == 0) {
                        b.l().y("Not eligible for %s - one-shot survey already taken", ldjVar.a.name());
                    } else {
                        if ((absaVar.b & 2) == 0) {
                            abqvVar = absaVar.d;
                            if (abqvVar == null) {
                                abqvVar = defpackage.abqv.a;
                            }
                            abqvVar.getClass();
                            if (defpackage.jzl.h(instant, abqvVar).compareTo(j$.time.Duration.ofSeconds(absgVar.d)) >= 0) {
                                b.l().y("Not eligible for %s - too soon since last response", ldjVar.a.name());
                            }
                        }
                        b.l().y("Eligible for %s - reoccurrence period has passed", ldjVar.a.name());
                    }
                    arrayList3.add(obj3);
                }
            }
            return defpackage.afga.bf(arrayList3);
        }
        defpackage.abqv abqvVar3 = abrzVar.d;
        if (abqvVar3 == null) {
            abqvVar3 = defpackage.abqv.a;
        }
        abqvVar3.getClass();
        if (defpackage.jzl.h(instant, abqvVar3).compareTo(j$.time.Duration.ofSeconds(defpackage.acqn.b())) >= 0) {
            if ((abrzVar.b & 2) != 0) {
                abqvVar2 = abrzVar.e;
                if (abqvVar2 == null) {
                    abqvVar2 = defpackage.abqv.a;
                }
                abqvVar2.getClass();
                if (defpackage.jzl.h(instant, abqvVar2).compareTo(j$.time.Duration.ofSeconds(defpackage.acqn.c())) < 0) {
                    ((defpackage.yqj) b.f()).u("Not eligible for CSAT - too soon since last response");
                }
            }
            defpackage.abpj abpjVar3 = abrzVar.c;
            abpjVar3.getClass();
            arrayList = new java.util.ArrayList();
            while (r10.hasNext()) {
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap3 = defpackage.lby.a;
                zbeVarB2 = defpackage.zbe.b(((absa) obj).c);
                if (zbeVarB2 == null) {
                    zbeVarB2 = defpackage.zbe.UNKNOWN_CONTEXT;
                }
                lbyVarI2 = defpackage.jzl.i(zbeVarB2);
                if (lbyVarI2 != null) {
                    afauVar2 = new defpackage.afau(lbyVarI2, obj);
                } else {
                    afauVar2 = null;
                }
                if (afauVar2 != null) {
                    arrayList.add(afauVar2);
                }
            }
            mapW = defpackage.afga.W(arrayList);
            defpackage.abpj abpjVar4 = defpackage.acqn.d().b;
            abpjVar4.getClass();
            arrayList2 = new java.util.ArrayList();
            while (r0.hasNext()) {
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap4 = defpackage.lby.a;
                zbeVarB = defpackage.zbe.b(((defpackage.absg) obj2).b);
                if (zbeVarB == null) {
                    zbeVarB = defpackage.zbe.UNKNOWN_CONTEXT;
                }
                lbyVarI = defpackage.jzl.i(zbeVarB);
                if (lbyVarI != null) {
                    afauVar = new defpackage.afau(lbyVarI, obj2);
                } else {
                    afauVar = null;
                }
                if (afauVar != null) {
                    arrayList2.add(afauVar);
                }
            }
            mapW2 = defpackage.afga.W(arrayList2);
            lbyVarArrValues = defpackage.lby.values();
            linkedHashMap = new java.util.LinkedHashMap(defpackage.afqt.e(defpackage.afga.P(lbyVarArrValues.length), 16));
            while (i < r3) {
                linkedHashMap.put(lbyVar2, new defpackage.ldj(lbyVar2, (defpackage.absg) mapW2.get(lbyVar2), (absa) mapW.get(lbyVar2)));
            }
            arrayList3 = new java.util.ArrayList();
            while (r9.hasNext()) {
                ldjVar = (defpackage.ldj) defpackage.afga.S(linkedHashMap, (defpackage.lby) obj3);
                absgVar = ldjVar.b;
                if (absgVar == null) {
                    b.l().y("Not eligible for %s - no configuration available", ldjVar.a.name());
                } else {
                    absaVar = ldjVar.c;
                    if (absaVar == null) {
                        b.l().y("Eligible for %s - no response data on file", ldjVar.a.name());
                    } else if (absgVar.d == 0) {
                        b.l().y("Not eligible for %s - one-shot survey already taken", ldjVar.a.name());
                    } else {
                        if ((absaVar.b & 2) == 0) {
                            abqvVar = absaVar.d;
                            if (abqvVar == null) {
                                abqvVar = defpackage.abqv.a;
                            }
                            abqvVar.getClass();
                            if (defpackage.jzl.h(instant, abqvVar).compareTo(j$.time.Duration.ofSeconds(absgVar.d)) >= 0) {
                                b.l().y("Not eligible for %s - too soon since last response", ldjVar.a.name());
                            }
                        }
                        b.l().y("Eligible for %s - reoccurrence period has passed", ldjVar.a.name());
                    }
                    arrayList3.add(obj3);
                }
            }
            return defpackage.afga.bf(arrayList3);
        }
        ((defpackage.yqj) b.f()).u("Not eligible for CSAT - too soon since last impression");
        return defpackage.afcg.a;
    }

    public ldd() {
        this(null);
    }
}
