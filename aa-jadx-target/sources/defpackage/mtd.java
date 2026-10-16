package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mtd implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mtd(defpackage.bys bysVar, defpackage.bys bysVar2, int i) {
        this.c = i;
        this.b = bysVar;
        this.a = bysVar2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v27, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v30, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v38, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v53, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v57, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v69, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v74, types: [bys, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        boolean z = true;
        int i = 0;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                return java.lang.Boolean.valueOf((defpackage.afga.e(defpackage.lyd.h(this.a), 0.0f) || ((java.lang.Boolean) this.b.a()).booleanValue()) ? false : true);
            case 1:
                ?? r0 = this.b;
                msv msvVar = (defpackage.msw) defpackage.afga.aB(defpackage.tna.aq(r0));
                if (msvVar == null) {
                    java.lang.Boolean bool = (java.lang.Boolean) ((defpackage.muf) this.a).a.e();
                    msvVar = (bool == null || !bool.booleanValue()) ? msv.a : defpackage.msp.a;
                }
                java.lang.Object obj = (defpackage.msw) defpackage.afga.aC(defpackage.tna.aq(r0), 1);
                if (obj == null) {
                    obj = defpackage.msp.a;
                }
                return new defpackage.afau(msvVar, obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParamsA = defpackage.nsu.a((defpackage.ntb) this.a, defpackage.nta.r, new defpackage.mtz(i));
                if (carWindowLayoutParamsA == null) {
                    throw new java.lang.IllegalStateException("Unable to create shade window params");
                }
                java.lang.Object obj2 = this.b;
                com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = carWindowLayoutParamsA.u;
                com.google.android.gms.car.ProjectionWindowDragParams projectionWindowDragParams = projectionWindowDecorationParams.l;
                new java.util.ArrayList();
                new java.util.ArrayList();
                int i2 = defpackage.ygw.d;
                defpackage.ygw ygwVar = defpackage.ymx.a;
                int i3 = projectionWindowDragParams.a;
                java.util.List list = projectionWindowDragParams.b;
                android.os.IBinder iBinder = projectionWindowDragParams.c;
                java.util.List list2 = projectionWindowDragParams.d;
                java.util.List list3 = projectionWindowDragParams.e;
                defpackage.rat ratVar = ((defpackage.muc) obj2).f;
                projectionWindowDecorationParams.l = new com.google.android.gms.car.ProjectionWindowDragParams(i3, list, ratVar == null ? null : ratVar, list2, list3);
                defpackage.noy noyVarB = defpackage.nsu.b(carWindowLayoutParamsA, "DashboardShade", new mur(), defpackage.ler.c());
                if (!defpackage.lem.a.a().b()) {
                    noyVarB.f = 512;
                }
                return noyVarB.a();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj3 = this.b;
                java.lang.Object obj4 = this.a;
                int i4 = defpackage.mun.e;
                defpackage.noy noyVarB2 = defpackage.nsu.b((com.google.android.gms.car.CarWindowLayoutParams) obj4, "Dashboard", (android.support.v4.app.Fragment) obj3, defpackage.ler.c());
                if (!defpackage.lem.a.a().b()) {
                    noyVarB2.f = 512;
                }
                return noyVarB2.a();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ?? r1 = this.a;
                defpackage.bvm bvmVar = mwn.a;
                if (!((java.lang.Boolean) r1.a()).booleanValue() && !((java.lang.Boolean) this.b.a()).booleanValue()) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                long millis = defpackage.myx.g(this.b).toMillis();
                return java.lang.Float.valueOf(millis != 0 ? defpackage.myx.f(this.a).toMillis() / millis : 0.0f);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? r2 = this.b;
                defpackage.yqm yqmVar = defpackage.myx.a;
                return java.lang.Boolean.valueOf(((java.lang.Boolean) r2.a()).booleanValue() && defpackage.a.X(((defpackage.kwv) this.a).L(), 2));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ?? r3 = this.a;
                defpackage.yqm yqmVar2 = defpackage.mzk.a;
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(r3, 10));
                for (lph lphVar : r3) {
                    arrayList.add(new nbt(lphVar, lphVar.a));
                }
                ?? r12 = this.b;
                java.util.List listBb = defpackage.afga.bb(arrayList);
                if (defpackage.mzk.b(r12) != null) {
                    if (listBb.isEmpty()) {
                        android.content.ComponentName componentNameB = defpackage.mzk.b(r12);
                        componentNameB.getClass();
                        listBb.add(new nbt((lph) null, componentNameB));
                    } else {
                        java.util.Iterator it = listBb.iterator();
                        do {
                            if (!it.hasNext()) {
                                android.content.ComponentName componentNameB2 = defpackage.mzk.b(r12);
                                componentNameB2.getClass();
                                listBb.add(new nbt((lph) null, componentNameB2));
                            }
                        } while (!defpackage.afga.f(((nbt) it.next()).b, defpackage.mzk.b(r12)));
                    }
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj5 : listBb) {
                    if (hashSet.add(defpackage.mzk.e((nbt) obj5))) {
                        arrayList2.add(obj5);
                    }
                }
                return defpackage.afga.aX(arrayList2, 5);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ?? r4 = this.b;
                defpackage.yqm yqmVar3 = defpackage.mzk.a;
                r4.b(java.lang.Boolean.valueOf(true));
                ?? r13 = this.a;
                java.util.Iterator it2 = r13.values().iterator();
                while (it2.hasNext()) {
                    ((aiwg) it2.next()).s((java.util.concurrent.CancellationException) null);
                }
                r13.clear();
                defpackage.mzk.a.l().u("MediaSwitcher paused, needs reset");
                return defpackage.afbk.a;
            case 9:
                ?? r5 = this.b;
                defpackage.yqm yqmVar4 = defpackage.mzk.a;
                return java.lang.Boolean.valueOf(((java.lang.Boolean) r5.a()).booleanValue() && defpackage.a.X(((defpackage.kwv) this.a).L(), 2));
            case 10:
                return java.lang.Boolean.valueOf(((java.lang.Boolean) this.b.a()).booleanValue() && !defpackage.tna.aq(this.a).isEmpty());
            case 11:
                return java.lang.Boolean.valueOf(!((java.lang.Boolean) this.a.a()).booleanValue() && ((java.lang.Boolean) this.b.a()).booleanValue());
            case 12:
                ?? r6 = this.b;
                defpackage.afar afarVar = ndz.a;
                defpackage.mwr.b(defpackage.zbd.HD, ndz.g((defpackage.bys) r6));
                neg negVar = (neg) this.a;
                negVar.b(3);
                negVar.a();
                defpackage.rox.s(defpackage.ned.a.a().e, negVar.a);
                return defpackage.afbk.a;
            case 13:
                ?? r7 = this.b;
                defpackage.yqm yqmVar5 = njd.a;
                ((defpackage.nkp) this.a).o(((java.lang.Number) r7.a()).intValue());
                return defpackage.afbk.a;
            case 14:
                defpackage.yqm yqmVar6 = njd.a;
                ((defpackage.nkp) this.a).r((android.content.Context) this.b);
                return defpackage.afbk.a;
            case 15:
                defpackage.yqm yqmVar7 = njd.a;
                return java.lang.Boolean.valueOf((defpackage.acyc.bc() || defpackage.acyc.bd() || ((defpackage.nkp) this.a).o) && !defpackage.afga.f(njd.a((defpackage.bys) this.b), defpackage.nod.a));
            case 16:
                ?? r8 = this.b;
                defpackage.yqm yqmVar8 = njd.a;
                return java.lang.Boolean.valueOf(((java.lang.Boolean) r8.a()).booleanValue() && !defpackage.lxy.s(njd.a((defpackage.bys) this.a)));
            case 17:
                ((defpackage.nkp) this.a).m(((java.lang.Number) this.b.a()).intValue());
                defpackage.muj mujVarA = defpackage.muj.h.a();
                int i5 = defpackage.mug.a;
                mujVarA.y();
                return defpackage.afbk.a;
            case 18:
                ((defpackage.nkp) this.a).m(((java.lang.Number) this.b.a()).intValue());
                defpackage.muj mujVarA2 = defpackage.muj.h.a();
                int i6 = defpackage.mug.a;
                mujVarA2.y();
                return defpackage.afbk.a;
            case 19:
                ((defpackage.nkp) this.a).n(((java.lang.Number) this.b.a()).intValue());
                return defpackage.afbk.a;
            default:
                ((defpackage.nkp) this.a).n(((java.lang.Number) this.b.a()).intValue());
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ mtd(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
