package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ojl implements defpackage.lhn {
    public static final defpackage.oji a = new defpackage.oji();
    public static final java.util.List b = defpackage.afga.ac(defpackage.ojj.HOTSPOT, defpackage.ojj.WIRELESS_CHARGING, defpackage.ojj.FLASHLIGHT, defpackage.ojj.CAMERA, defpackage.ojj.DISPLAY);
    public static final defpackage.yqm c = defpackage.yqm.c("GH.ThermalStateWatch");
    public static final defpackage.afhl d = new defpackage.ogs(defpackage.mkp.b, 2);
    public final defpackage.eqp e;
    public defpackage.ojj f;
    private final defpackage.eqp g;
    private final java.util.HashSet h;

    public /* synthetic */ ojl(byte[] bArr) {
        defpackage.ocl oclVar = new defpackage.ocl();
        defpackage.nfj nfjVar = new defpackage.nfj();
        defpackage.nfs nfsVar = new defpackage.nfs();
        defpackage.nfz nfzVar = new defpackage.nfz();
        defpackage.nfg nfgVarA = defpackage.nfg.a.a();
        this.e = oclVar;
        this.g = defpackage.tcu.h(oclVar, defpackage.ebo.e(defpackage.ebo.f(nfgVarA, new defpackage.oat(4))), nfjVar, nfsVar, nfzVar, defpackage.ebo.e(defpackage.ebo.f(nfgVarA, new defpackage.oat(5))), new defpackage.ojh());
        this.h = new java.util.HashSet();
    }

    public static final java.lang.String a(int i, android.content.Context context) {
        java.lang.String string = context.getString(i);
        string.getClass();
        return string;
    }

    public final void b(defpackage.zbd zbdVar) {
        if (zbdVar != null) {
            java.util.HashSet hashSet = this.h;
            if (hashSet.contains(zbdVar)) {
                return;
            }
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.THERMAL_MITIGATION, zbdVar).l());
            hashSet.add(zbdVar);
        }
    }

    public final boolean e(defpackage.ojk ojkVar) {
        defpackage.ojj ojjVar = this.f;
        return (ojjVar == null || defpackage.afga.bh(ojkVar.c, ojjVar)) ? false : true;
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.f = null;
        this.h.clear();
        this.g.eM(defpackage.ler.c(), new defpackage.nol(new defpackage.affc() { // from class: ojg
            /* JADX WARN: Code duplicated, block: B:100:0x00cd A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:101:0x0096 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:102:0x00cd A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:103:0x0094 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:104:0x0091 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:105:0x00cd A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:107:0x007b A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:109:0x007b A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:110:0x007b A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:111:0x007b A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:115:0x00f2 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:19:0x0039  */
            /* JADX WARN: Code duplicated, block: B:25:0x005e A[LOOP:1: B:23:0x0058->B:25:0x005e, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:29:0x006e  */
            /* JADX WARN: Code duplicated, block: B:31:0x0072  */
            /* JADX WARN: Code duplicated, block: B:34:0x0081  */
            /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
            /* JADX WARN: Code duplicated, block: B:75:0x014e  */
            /* JADX WARN: Code duplicated, block: B:76:0x0153  */
            /* JADX WARN: Code duplicated, block: B:86:0x0043 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:88:0x0033 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:92:0x00c4 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:93:0x00ba A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:94:0x00b0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:95:0x00a6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x0098 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:99:0x00cd A[SYNTHETIC] */
            @Override // defpackage.affc
            public final java.lang.Object invoke(java.lang.Object obj) {
                defpackage.ojj ojjVar;
                defpackage.zbd zbdVar;
                java.util.Set set;
                java.util.ArrayList arrayList;
                java.util.Iterator it;
                defpackage.yqm yqmVar;
                java.util.Iterator it2;
                java.util.Set setBf;
                java.util.Iterator it3;
                java.lang.Object next;
                defpackage.ojj ojjVar2;
                java.util.ArrayList arrayList2;
                int iOrdinal;
                defpackage.zbd zbdVar2;
                defpackage.ojj ojjVar3;
                defpackage.zbd zbdVar3;
                defpackage.ojk ojkVar = (defpackage.ojk) obj;
                ojkVar.getClass();
                defpackage.ojl ojlVar = this.a;
                if (ojlVar.e(ojkVar) && (ojjVar3 = ojlVar.f) != null && (zbdVar3 = ojjVar3.k) != null) {
                    ojlVar.b(zbdVar3);
                }
                int i = ojkVar.a;
                if (i == 3) {
                    if (ojkVar.b) {
                        i = 3;
                    } else {
                        i = 3;
                        if (i < 4) {
                            if (ojlVar.e(ojkVar)) {
                                ojlVar.b(zbdVar);
                            }
                        }
                    }
                    set = ojkVar.c;
                    arrayList = new java.util.ArrayList();
                    it = set.iterator();
                    while (it.hasNext()) {
                        zbdVar2 = ((defpackage.ojj) it.next()).l;
                        if (zbdVar2 != null) {
                            arrayList.add(zbdVar2);
                        }
                    }
                    yqmVar = defpackage.ojl.c;
                    ((defpackage.yqj) yqmVar.h()).y("Potential causes while in severe thermal state: %s", ojkVar);
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ojlVar.b((defpackage.zbd) it2.next());
                    }
                    if (ojlVar.f == null) {
                        if (ojkVar.b) {
                            arrayList2 = new java.util.ArrayList();
                            for (java.lang.Object obj2 : set) {
                                defpackage.ojj ojjVar4 = defpackage.ojj.UNKNOWN;
                                iOrdinal = ((defpackage.ojj) obj2).ordinal();
                                if (iOrdinal != 1) {
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            if (iOrdinal != 4) {
                                                if (iOrdinal == 5) {
                                                    arrayList2.add(obj2);
                                                }
                                            } else if (i >= defpackage.acyc.w()) {
                                                arrayList2.add(obj2);
                                            }
                                        } else if (i >= defpackage.acyc.y()) {
                                            arrayList2.add(obj2);
                                        }
                                    } else if (i >= defpackage.acyc.A()) {
                                        arrayList2.add(obj2);
                                    }
                                } else if (i >= defpackage.acyc.z()) {
                                    arrayList2.add(obj2);
                                }
                            }
                            setBf = defpackage.afga.bf(arrayList2);
                        } else {
                            setBf = defpackage.afcg.a;
                        }
                        it3 = defpackage.ojl.b.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (!setBf.contains((defpackage.ojj) next));
                        ojjVar2 = (defpackage.ojj) next;
                        ((defpackage.yqj) yqmVar.f()).M("ThermalState: %s causeToNotify: %s", ojkVar, ojjVar2);
                        if (ojjVar2 != null) {
                            ojlVar.f = defpackage.ojj.UNKNOWN;
                        } else {
                            ojlVar.f = defpackage.ojj.UNKNOWN;
                        }
                    }
                } else if (i < 4) {
                    set = ojkVar.c;
                    arrayList = new java.util.ArrayList();
                    it = set.iterator();
                    while (it.hasNext()) {
                        zbdVar2 = ((defpackage.ojj) it.next()).l;
                        if (zbdVar2 != null) {
                            arrayList.add(zbdVar2);
                        }
                    }
                    yqmVar = defpackage.ojl.c;
                    ((defpackage.yqj) yqmVar.h()).y("Potential causes while in severe thermal state: %s", ojkVar);
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ojlVar.b((defpackage.zbd) it2.next());
                    }
                    if (ojlVar.f == null) {
                        if (ojkVar.b) {
                            arrayList2 = new java.util.ArrayList();
                            while (r3.hasNext()) {
                                defpackage.ojj ojjVar5 = defpackage.ojj.UNKNOWN;
                                iOrdinal = ((defpackage.ojj) obj2).ordinal();
                                if (iOrdinal != 1) {
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            if (iOrdinal != 4) {
                                                if (iOrdinal == 5 && i >= defpackage.acyc.x()) {
                                                    arrayList2.add(obj2);
                                                }
                                            } else if (i >= defpackage.acyc.w()) {
                                                arrayList2.add(obj2);
                                            }
                                        } else if (i >= defpackage.acyc.y()) {
                                            arrayList2.add(obj2);
                                        }
                                    } else if (i >= defpackage.acyc.A()) {
                                        arrayList2.add(obj2);
                                    }
                                } else if (i >= defpackage.acyc.z()) {
                                    arrayList2.add(obj2);
                                }
                            }
                            setBf = defpackage.afga.bf(arrayList2);
                        } else {
                            setBf = defpackage.afcg.a;
                        }
                        it3 = defpackage.ojl.b.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (!setBf.contains((defpackage.ojj) next));
                        ojjVar2 = (defpackage.ojj) next;
                        ((defpackage.yqj) yqmVar.f()).M("ThermalState: %s causeToNotify: %s", ojkVar, ojjVar2);
                        if (ojjVar2 != null || ojjVar2 == defpackage.ojj.UNKNOWN) {
                            ojlVar.f = defpackage.ojj.UNKNOWN;
                        } else {
                            android.content.Context context = defpackage.mkp.a.c;
                            context.getClass();
                            nvc nvcVar = new nvc();
                            nvcVar.f = "com.google.android.projection.gearhead";
                            nvcVar.d = com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context, ojjVar2.h);
                            nvcVar.m = defpackage.ojl.a(2132085394, context);
                            nvcVar.n = defpackage.ojl.a(ojjVar2.g, context);
                            nvcVar.a = nvf.d;
                            defpackage.nuz.b().j("THERMAL", 576891217L, nvcVar.b());
                            ojlVar.f = ojjVar2;
                            defpackage.zbd zbdVar4 = ojjVar2.i;
                            if (zbdVar4 != null) {
                                ojlVar.b(zbdVar4);
                            }
                        }
                    }
                } else if (ojlVar.e(ojkVar) && (ojjVar = ojlVar.f) != null && (zbdVar = ojjVar.j) != null) {
                    ojlVar.b(zbdVar);
                }
                return defpackage.afbk.a;
            }
        }, 6));
    }

    @Override // defpackage.lhn
    public final void d() {
    }

    public ojl() {
        this(null);
    }
}
