package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nvu implements defpackage.affj {
    /* JADX WARN: Code duplicated, block: B:22:0x00de  */
    /* JADX WARN: Code duplicated, block: B:24:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0101  */
    /* JADX WARN: Code duplicated, block: B:29:0x0134  */
    /* JADX WARN: Code duplicated, block: B:33:0x0150  */
    /* JADX WARN: Code duplicated, block: B:34:0x0157  */
    /* JADX WARN: Code duplicated, block: B:35:0x015e  */
    /* JADX WARN: Code duplicated, block: B:39:0x016e  */
    /* JADX WARN: Code duplicated, block: B:42:0x017d  */
    /* JADX WARN: Code duplicated, block: B:47:0x018f  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[LOOP:2: B:27:0x012e->B:71:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0177 A[SYNTHETIC] */
    @Override // defpackage.affj
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.util.List listAO;
        java.lang.Iterable iterableAc;
        java.lang.Object objAK;
        java.util.ArrayList arrayList2;
        defpackage.mqj mqjVar;
        int iOrdinal;
        defpackage.nvt nvtVar;
        aisy aisyVar;
        java.util.Map map = (java.util.Map) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        boolean zBooleanValue = ((java.lang.Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) obj4).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) obj5).booleanValue();
        defpackage.yqm yqmVar = defpackage.nvv.a;
        map.getClass();
        if (map.isEmpty()) {
            defpackage.nvv.a.l().u("Map of Projection Apps is empty");
            objAK = defpackage.afga.aa(new defpackage.nvt(1, (android.content.ComponentName) null));
        } else {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (defpackage.afga.f(((com.google.android.gms.car.display.CarRegionId) entry.getKey()).h, com.google.android.gms.car.display.CarDisplayId.a)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Map mapY = defpackage.afga.Y(linkedHashMap);
            if (mapY.isEmpty()) {
                defpackage.nvv.a.l().u("No Projection apps found");
                objAK = defpackage.afga.aa(new defpackage.nvt(1, (android.content.ComponentName) null));
            } else if (!zBooleanValue) {
                arrayList = new java.util.ArrayList(mapY.size());
                it = mapY.entrySet().iterator();
                while (it.hasNext()) {
                    mqjVar = (defpackage.mqj) ((java.util.Map.Entry) it.next()).getValue();
                    defpackage.nvv.a.l().y("computeSuppressedType app=%s", mqjVar);
                    iOrdinal = mqjVar.b.ordinal();
                    if (iOrdinal != 1) {
                        nvtVar = new defpackage.nvt(3, (android.content.ComponentName) null);
                    } else if (iOrdinal != 2) {
                        nvtVar = new defpackage.nvt(2, mqjVar);
                    } else if (iOrdinal != 3) {
                        defpackage.yhx yhxVarB = defpackage.ler.a().b(defpackage.kit.b().e(), defpackage.nze.a());
                        yhxVarB.getClass();
                        aisyVar = new aisy(afsg.l(defpackage.afga.bg(yhxVarB), new defpackage.nqv(11)), 1);
                        while (true) {
                            if (aisyVar.hasNext()) {
                                nvtVar = null;
                                break;
                            }
                            if (defpackage.afga.f(((defpackage.mqj) aisyVar.next()).a(), mqjVar.a())) {
                                nvtVar = new defpackage.nvt(3, (android.content.ComponentName) null);
                                break;
                            }
                        }
                    } else {
                        nvtVar = new defpackage.nvt(4, mqjVar);
                    }
                    arrayList.add(nvtVar);
                }
                listAO = defpackage.afga.aO(arrayList);
                if (zBooleanValue3) {
                    arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj6 : listAO) {
                        if (((defpackage.nvt) obj6).b != 3) {
                            arrayList2.add(obj6);
                        }
                    }
                    listAO = arrayList2;
                }
                if (zBooleanValue2) {
                    defpackage.nvv.a.l().u("Dashboard is Open suppressing media notifications");
                    iterableAc = defpackage.afga.ac(new defpackage.nvt(4, (android.content.ComponentName) null), new defpackage.nvt(2, (android.content.ComponentName) null));
                } else {
                    iterableAc = defpackage.afce.a;
                }
                objAK = defpackage.afga.aK(defpackage.afga.aS(listAO, iterableAc));
                defpackage.nvv.a.l().y("Coolwalk Suppressed Notification: %s", objAK);
            } else if (defpackage.nte.c().b().m() == defpackage.nti.a) {
                defpackage.nvv.a.l().u("Notification Center Is Open in canonical, do not suppress notifications");
                objAK = defpackage.afce.a;
            } else {
                defpackage.nvv.a.l().u("Notification Center Is Open in large screens, ignore primary region");
                mapY.put(com.google.android.gms.car.display.CarRegionId.a, defpackage.nvw.a);
                arrayList = new java.util.ArrayList(mapY.size());
                it = mapY.entrySet().iterator();
                while (it.hasNext()) {
                    mqjVar = (defpackage.mqj) ((java.util.Map.Entry) it.next()).getValue();
                    defpackage.nvv.a.l().y("computeSuppressedType app=%s", mqjVar);
                    iOrdinal = mqjVar.b.ordinal();
                    if (iOrdinal != 1) {
                        nvtVar = new defpackage.nvt(3, (android.content.ComponentName) null);
                    } else if (iOrdinal != 2) {
                        nvtVar = new defpackage.nvt(2, mqjVar);
                    } else if (iOrdinal != 3) {
                        defpackage.yhx yhxVarB2 = defpackage.ler.a().b(defpackage.kit.b().e(), defpackage.nze.a());
                        yhxVarB2.getClass();
                        aisyVar = new aisy(afsg.l(defpackage.afga.bg(yhxVarB2), new defpackage.nqv(11)), 1);
                        while (true) {
                            if (aisyVar.hasNext()) {
                                nvtVar = null;
                                break;
                                break;
                            }
                            if (defpackage.afga.f(((defpackage.mqj) aisyVar.next()).a(), mqjVar.a())) {
                                nvtVar = new defpackage.nvt(3, (android.content.ComponentName) null);
                                break;
                                break;
                            }
                        }
                    } else {
                        nvtVar = new defpackage.nvt(4, mqjVar);
                    }
                    arrayList.add(nvtVar);
                }
                listAO = defpackage.afga.aO(arrayList);
                if (zBooleanValue3) {
                    arrayList2 = new java.util.ArrayList();
                    while (r6.hasNext()) {
                        if (((defpackage.nvt) obj6).b != 3) {
                            arrayList2.add(obj6);
                        }
                    }
                    listAO = arrayList2;
                }
                if (zBooleanValue2) {
                    defpackage.nvv.a.l().u("Dashboard is Open suppressing media notifications");
                    iterableAc = defpackage.afga.ac(new defpackage.nvt(4, (android.content.ComponentName) null), new defpackage.nvt(2, (android.content.ComponentName) null));
                } else {
                    iterableAc = defpackage.afce.a;
                }
                objAK = defpackage.afga.aK(defpackage.afga.aS(listAO, iterableAc));
                defpackage.nvv.a.l().y("Coolwalk Suppressed Notification: %s", objAK);
            }
        }
        java.lang.Object obj7 = objAK != defpackage.afce.a ? objAK : null;
        return obj7 == null ? new java.util.ArrayList() : obj7;
    }
}
