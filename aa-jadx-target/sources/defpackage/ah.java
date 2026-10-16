package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ah implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ah(afgr afgrVar, afgr afgrVar2, ftx ftxVar, int i) {
        this.d = i;
        this.c = afgrVar;
        this.a = afgrVar2;
        this.b = ftxVar;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x02f3  */
    /* JADX WARN: Type inference failed for: r0v26, types: [aqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [aqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, xj] */
    /* JADX WARN: Type inference failed for: r12v21, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v23, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v56, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v58, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v65, types: [java.lang.Object, lkj] */
    /* JADX WARN: Type inference failed for: r12v7, types: [cbe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [aqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aqk, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() throws defpackage.qst {
        int i = 4;
        int i2 = 1;
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                ((ai) this.b).d.f((android.view.ViewGroup) this.c, this.a);
                return defpackage.afbk.a;
            case 1:
                java.lang.Object obj = this.b;
                ai aiVar = (ai) obj;
                java.util.List list = aiVar.a;
                if (list.isEmpty()) {
                    if (defpackage.bt.ac(2)) {
                        android.util.Log.v("FragmentManager", "Animating to start");
                    }
                    java.lang.Object obj2 = this.c;
                    ck ckVar = aiVar.d;
                    java.lang.Object obj3 = aiVar.g;
                    obj3.getClass();
                    ckVar.u(obj3, new defpackage.af(obj, obj2, 4, (byte[]) null));
                } else {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((ad) ((aj) it.next())).a.d) {
                            if (defpackage.bt.ac(2)) {
                                android.util.Log.v("FragmentManager", "Completing animating immediately");
                            }
                            java.lang.Object obj4 = this.a;
                            dwd dwdVar = new dwd();
                            ck ckVar2 = aiVar.d;
                            defpackage.cp cpVar = ((ad) ((aj) list.get(0))).a;
                            ckVar2.r(obj4, dwdVar, new defpackage.ag(obj, i2));
                            dwdVar.a();
                        }
                    }
                    if (defpackage.bt.ac(2)) {
                        android.util.Log.v("FragmentManager", "Animating to start");
                    }
                    java.lang.Object obj5 = this.c;
                    ck ckVar3 = aiVar.d;
                    java.lang.Object obj6 = aiVar.g;
                    obj6.getClass();
                    ckVar3.u(obj6, new defpackage.af(obj, obj5, 4, (byte[]) null));
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj7 = this.c;
                java.lang.Object obj8 = this.b;
                if (obj8 != null) {
                    defpackage.bzp bzpVar = (defpackage.bzp) obj7;
                    bzpVar.u(bzpVar.a((defpackage.bzh) obj8) - bzpVar.o);
                }
                defpackage.bzp bzpVar2 = (defpackage.bzp) obj7;
                java.util.List listD = defpackage.vm.d(bzpVar2, bzpVar2.o, null);
                ?? r12 = this.a;
                return new defpackage.adnr(defpackage.afga.aS(listD, r12.b()), r12.a());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                if (((defpackage.afgq) this.a).a) {
                    java.lang.Object obj9 = this.c;
                    java.lang.Object obj10 = this.b;
                    fjv.a().c(fmw.a, "NetworkRequestConstraintController unregister callback");
                    ((android.net.ConnectivityManager) obj10).unregisterNetworkCallback((android.net.ConnectivityManager.NetworkCallback) obj9);
                }
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                uv onClickDelegate = ((androidx.car.app.model.Action) this.b).getOnClickDelegate();
                java.lang.Object obj11 = this.a;
                if (onClickDelegate != null) {
                    gfa gfaVar = (gfa) obj11;
                    ghk ghkVarL = gfaVar.l(ghk.class);
                    if (ghkVarL != null) {
                        ghkVarL.g(gsv.c);
                    }
                    gdd.i(gfaVar, onClickDelegate);
                }
                ?? r13 = this.c;
                hgx hgxVarF = ((gfa) obj11).F(hgx.class);
                r13.getClass();
                hgxVarF.a((xj) r13);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                double d = ((afgr) this.c).a / ((afgr) this.a).a;
                fts ftsVar = ((ftx) this.b).c;
                if (ftsVar instanceof fts) {
                    return java.lang.Double.valueOf(d * ((double) ftsVar.a));
                }
                throw new java.lang.IllegalStateException("Both width and height of bitmap are -1.");
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ahoc.d((aiuw) this.a, (defpackage.afdo) null, 0, new defpackage.ehz((defpackage.affh) this.c, (defpackage.aqk) this.b, (defpackage.afdk) null, 10), 3);
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ahoc.d((aiuw) this.a, (defpackage.afdo) null, 0, new defpackage.ehz((defpackage.affh) this.c, (defpackage.aqk) this.b, (defpackage.afdk) null, 11, (byte[]) null), 3);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                uv onClickDelegate2 = ((androidx.car.app.model.Action) this.b).getOnClickDelegate();
                java.lang.Object obj12 = this.a;
                if (onClickDelegate2 != null) {
                    ((gfa) obj12).t().h(onClickDelegate2);
                }
                java.lang.Object obj13 = this.c;
                gdr gdrVarL = ((gfa) obj12).l(gdr.class);
                gdrVarL.getClass();
                gdrVarL.d(((androidx.car.app.model.Alert) obj13).getId());
                return defpackage.afbk.a;
            case 9:
                glw glwVarT = ((gfa) this.b).t();
                wb tabCallbackDelegate = ((com.android.car.libraries.apphost.external.model.GoogleTabTemplate) this.a).getTabCallbackDelegate();
                tabCallbackDelegate.getClass();
                glwVarT.s(tabCallbackDelegate, ((com.android.car.libraries.apphost.external.model.GoogleTab) this.c).getContentId());
                return defpackage.afbk.a;
            case 10:
                ((gfa) this.b).t().s(((com.android.car.libraries.apphost.internal.model.TabTemplateInternal) this.a).getTabCallbackDelegate(), ((com.android.car.libraries.apphost.internal.model.TabInternal) this.c).getContentId());
                return defpackage.afbk.a;
            case 11:
                glw glwVarT2 = ((gfa) this.a).t();
                wb tabCallbackDelegate2 = ((androidx.car.app.model.TabTemplate) this.c).getTabCallbackDelegate();
                tabCallbackDelegate2.getClass();
                glwVarT2.s(tabCallbackDelegate2, ((androidx.car.app.model.Tab) this.b).getContentId());
                return defpackage.afbk.a;
            case 12:
                glw glwVarT3 = ((gfa) this.a).t();
                wb tabCallbackDelegate3 = ((androidx.car.app.model.TabTemplate) this.c).getTabCallbackDelegate();
                tabCallbackDelegate3.getClass();
                glwVarT3.s(tabCallbackDelegate3, ((androidx.car.app.model.Tab) this.b).getContentId());
                return defpackage.afbk.a;
            case 13:
                defpackage.rjf rjfVar = ((defpackage.kjx) this.b).d;
                if (rjfVar == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                rjfVar.a.g(new defpackage.rdv(rjfVar, (ajnd) this.a, defpackage.afga.aa(juq.c(((kkf) this.c).a)), i));
                return defpackage.afbk.a;
            case 14:
                java.lang.Object obj14 = this.c;
                java.lang.Object obj15 = this.a;
                int i3 = klg.a;
                defpackage.ccz cczVar = new defpackage.ccz(-1715431336, true, new fux(obj14, obj15, 15, (byte[]) null));
                defpackage.bvm bvmVar = tke.a;
                ((usd) this.b).c(cczVar);
                return defpackage.afbk.a;
            case 15:
                java.lang.Object obj16 = this.b;
                java.lang.Object obj17 = this.c;
                int i4 = klg.a;
                defpackage.ccz cczVar2 = new defpackage.ccz(-934671710, true, new fux(obj16, obj17, 16, (byte[]) null));
                defpackage.bvm bvmVar2 = tke.a;
                ((usd) this.a).c(cczVar2);
                return defpackage.afbk.a;
            case 16:
                ahoc.d((aiuw) this.a, (defpackage.afdo) null, 0, new defpackage.jwp((defpackage.affh) this.c, (defpackage.aqk) this.b, (defpackage.afdk) null, 7), 3);
                return defpackage.afbk.a;
            case 17:
                ahoc.d((aiuw) this.a, (defpackage.afdo) null, 0, new defpackage.jwp((defpackage.affh) this.c, (defpackage.aqk) this.b, (defpackage.afdk) null, 8, (byte[]) null), 3);
                return defpackage.afbk.a;
            case 18:
                ?? r0 = this.a;
                if (r0 != 0) {
                    r0.invoke();
                }
                java.lang.Object obj18 = this.c;
                android.content.Context context = (android.content.Context) this.b;
                defpackage.ocn.a().g(context, ((mot) obj18).a, context.getString(2132084929), 0);
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.hf).l());
                return defpackage.afbk.a;
            case 19:
                llj lljVar = new llj();
                java.lang.Object obj19 = this.a;
                java.lang.Object obj20 = this.c;
                java.lang.Object obj21 = this.b;
                defpackage.lwz.h(new tie((qs) obj21, lljVar, new defpackage.ipk(obj21, obj20, obj19, 10, (int[]) null)));
                return defpackage.afbk.a;
            default:
                java.lang.Object obj22 = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) ((lok) this.a).e.e();
                java.lang.Object obj23 = this.c;
                if (obj22 == null) {
                    obj22 = obj23;
                }
                this.b.e(defpackage.afqt.h(((long) defpackage.onn.a((com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj22)) - 10000, 0L));
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ ah(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ah(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ah(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ah(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }
}
