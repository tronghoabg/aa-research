package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nkb implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ nkb(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX WARN: Code duplicated, block: B:42:0x0142  */
    /* JADX WARN: Code duplicated, block: B:44:0x014b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0159  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v28, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) throws afbj {
        int paddingStart;
        boolean z;
        int paddingStart2;
        int paddingEnd;
        boolean z2;
        boolean z3;
        tif tifVar;
        java.lang.String str;
        aack aackVar;
        int i = 16;
        int i2 = 4;
        int i3 = 2;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        ?? r10 = 0;
        java.lang.Object obj2 = null;
        android.widget.TextView textView = null;
        int i4 = 0;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj3 = (android.content.ComponentName) obj;
                java.lang.Object obj4 = this.a;
                if (obj3 == null) {
                    obj3 = obj4;
                }
                if (obj3 == null) {
                    return defpackage.kfn.h();
                }
                return ((defpackage.nkj) this.b).k((android.content.ComponentName) obj3, defpackage.nkf.e, true, false, false);
            case 1:
                nko nkoVar = (nko) obj;
                java.lang.Object obj5 = this.b;
                njv njvVar = (njv) obj5;
                njvVar.L.add(nkoVar);
                nkoVar.getClass();
                int i5 = nkoVar.b;
                if (i5 == 2) {
                    njv.b.l().u("Using two app vertical hotseat");
                    njvVar.i();
                    defpackage.nkj nkjVar = njvVar.c;
                    defpackage.eqt eqtVar = njvVar.O;
                    nkjVar.e().k(eqtVar);
                    nkjVar.g().k(njvVar.P);
                    android.view.View view = njvVar.J;
                    if (view == null) {
                        defpackage.afga.d("hotseatThree");
                        view = null;
                    }
                    view.setVisibility(8);
                    nkjVar.b().eM(((android.support.v4.app.Fragment) obj5).getViewLifecycleOwner(), eqtVar);
                } else if (i5 != 3) {
                    njv.b.l().u("Using four app vertical hotseat");
                } else {
                    njv.b.l().u("Using three app vertical hotseat");
                    njvVar.i();
                }
                java.lang.Object obj6 = this.a;
                if (nkoVar.c) {
                    njv.b.l().u("Bottom aligning vertical hotseat");
                    android.view.ViewGroup viewGroup = njvVar.A;
                    if (viewGroup == null) {
                        defpackage.afga.d("dockContainer");
                        viewGroup = null;
                    }
                    int id = viewGroup.getId();
                    android.view.View view2 = njvVar.w;
                    if (view2 == null) {
                        defpackage.afga.d("assistantIconContainer");
                        view2 = null;
                    }
                    int id2 = view2.getId();
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) ((android.view.View) obj6).findViewById(2131429264);
                    defpackage.dsf dsfVar = new defpackage.dsf();
                    dsfVar.e(constraintLayout);
                    dsfVar.g(id, 4, id2, 3);
                    dsfVar.d(id, 3);
                    dsfVar.c(constraintLayout);
                } else {
                    njv.b.l().u("Center aligning vertical hotseat");
                }
                if (njvVar.j) {
                    android.transition.TransitionManager.beginDelayedTransition((android.view.ViewGroup) obj6);
                }
                njvVar.j = true;
                defpackage.w wVar = new defpackage.w(((android.support.v4.app.Fragment) obj5).getChildFragmentManager());
                wVar.q(2131429583, new com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment(nkoVar.d, (defpackage.affc) null, 2, (defpackage.affu) null), null);
                wVar.i(false, true);
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.npc npcVar = (defpackage.npc) obj;
                defpackage.nke nkeVar = defpackage.nkj.a;
                npcVar.getClass();
                java.lang.Object obj7 = this.b;
                defpackage.eqp eqpVar = (defpackage.eqp) this.a;
                npcVar.f(defpackage.tcu.a(eqpVar, (defpackage.eqp) obj7), defpackage.nkf.b);
                npcVar.f(eqpVar, defpackage.nkf.c);
                return new defpackage.eqs(defpackage.nkf.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.nkf nkfVar = (defpackage.nkf) obj;
                nkfVar.getClass();
                int iOrdinal = nkfVar.ordinal();
                java.lang.Object obj8 = this.a;
                java.lang.Object obj9 = this.b;
                if (iOrdinal == 4) {
                    defpackage.eqp eqpVar2 = ((defpackage.nkj) obj9).i;
                    eqpVar2.getClass();
                    return defpackage.tcu.v(eqpVar2, new defpackage.nkb(obj8, obj9, i4));
                }
                if (iOrdinal == 5) {
                    defpackage.eqp eqpVar3 = ((defpackage.nkj) obj9).i;
                    eqpVar3.getClass();
                    return defpackage.tcu.v(eqpVar3, new defpackage.nkc(obj8, obj9, (java.lang.Object) nkfVar, (int) (z5 ? 1 : 0)));
                }
                if (iOrdinal != 7) {
                    java.util.Objects.toString(nkfVar);
                    throw new java.lang.IllegalStateException("Cannot show nav hotseat for type ".concat(nkfVar.toString()));
                }
                defpackage.eqp eqpVar4 = ((defpackage.nkj) obj9).i;
                eqpVar4.getClass();
                return defpackage.tcu.v(eqpVar4, new defpackage.nkc(obj8, obj9, nkfVar, i4));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.cja cjaVar = (defpackage.cja) obj;
                int i6 = defpackage.nob.a;
                cjaVar.getClass();
                if (cjaVar.b()) {
                    this.a.b(this.b);
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.cja cjaVar2 = (defpackage.cja) obj;
                int i7 = noq.a;
                cjaVar2.getClass();
                if (cjaVar2.b()) {
                    this.a.b(this.b);
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.npc npcVar2 = (defpackage.npc) obj;
                npcVar2.getClass();
                npcVar2.f((defpackage.eqp) this.a, new defpackage.nqt(z6 ? 1 : 0, i3, i2));
                return ((defpackage.nqw) this.b).d;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((afgu) this.b).a = 0L;
                ((defpackage.afgq) this.a).a = false;
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.dzp dzpVar = (defpackage.dzp) obj;
                dzpVar.getClass();
                boolean zBooleanValue = ((java.lang.Boolean) dzpVar.a).booleanValue();
                boolean zBooleanValue2 = ((java.lang.Boolean) dzpVar.b).booleanValue();
                com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment railStatusBarFragment = (com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment) this.b;
                defpackage.ntb ntbVar = railStatusBarFragment.d;
                java.lang.Object obj10 = this.a;
                if (!ntbVar.J() || ntbVar.F()) {
                    if (zBooleanValue2) {
                        paddingStart = ((android.view.View) obj10).getPaddingStart();
                        z = true;
                    } else {
                        paddingStart = 0;
                        z = false;
                    }
                    if (zBooleanValue) {
                        paddingStart2 = paddingStart;
                        paddingEnd = 0;
                        z2 = z;
                    } else {
                        paddingStart2 = paddingStart;
                        paddingEnd = ((android.view.View) obj10).getPaddingEnd();
                        z4 = false;
                        z2 = z;
                    }
                } else {
                    if (zBooleanValue) {
                        z3 = true;
                        paddingStart2 = 0;
                    } else {
                        paddingStart2 = ((android.view.View) obj10).getPaddingStart();
                        z3 = false;
                    }
                    if (zBooleanValue2) {
                        paddingEnd = ((android.view.View) obj10).getPaddingEnd();
                        z4 = z3;
                        z2 = true;
                    } else {
                        z4 = z3;
                        paddingEnd = 0;
                        z2 = false;
                    }
                }
                android.view.View view3 = (android.view.View) obj10;
                view3.setPaddingRelative(paddingStart2, view3.getPaddingTop(), paddingEnd, view3.getPaddingBottom());
                view3.setVisibility((z4 || z2) ? 0 : 8);
                if (railStatusBarFragment.l) {
                    if (view3.getVisibility() == 0 && ntbVar.F() && !railStatusBarFragment.e) {
                        android.widget.TextView textView2 = railStatusBarFragment.f;
                        if (textView2 == null) {
                            defpackage.afga.d("clock");
                        } else {
                            textView = textView2;
                        }
                        textView.setPaddingRelative(0, view3.getContext().getResources().getDimensionPixelSize(2131168391), 0, 0);
                    } else if (ntbVar.F()) {
                        android.widget.TextView textView3 = railStatusBarFragment.f;
                        if (textView3 == null) {
                            defpackage.afga.d("clock");
                        } else {
                            r10 = textView3;
                        }
                        r10.setPadding(0, 0, 0, 0);
                    }
                }
                return defpackage.afbk.a;
            case 9:
                java.lang.Object obj11 = this.a;
                aack aackVar2 = (aack) obj;
                defpackage.oib oibVar = (defpackage.oib) this.b;
                ajnd ajndVar = oibVar.d;
                android.telecom.Call call = (android.telecom.Call) obj11;
                ohy ohyVar = new ohy(ajndVar, call);
                oia oiaVar = new oia(ohyVar, 1, (byte[]) null);
                oia oiaVar2 = new oia(ohyVar, 0);
                ?? r4 = aackVar2.d;
                aackVar2.m(new defpackage.cwg(new dza((aiuw) r4, oiaVar, oiaVar2), i));
                aackVar2.m(new defpackage.cwg(new dxq((android.content.Context) aackVar2.c, (aiuw) r4, new oia(new oht(ajndVar, call), 2, (char[]) null)), 17));
                java.util.Map map = oibVar.c;
                ohv ohvVar = new ohv(ajndVar, call, map);
                dyy dyyVar = new dyy((aiuw) r4, new oia(ohvVar, 3, (short[]) null), new defpackage.dxd(null, 0));
                aackVar2.m(new defpackage.cwg(dyyVar, 15));
                map.put(obj11, new ohz(dyyVar));
                aackVar2.b = new ogi(dyyVar, oibVar, call, ohvVar, (defpackage.afdk) null, 2);
                return defpackage.afbk.a;
            case 10:
                oqc oqcVar = (oqc) obj;
                oqcVar.getClass();
                ((defpackage.kwv) this.b).N(0);
                this.a.b(oqcVar);
                return defpackage.afbk.a;
            case 11:
                defpackage.axq axqVar = (defpackage.axq) obj;
                axqVar.getClass();
                ?? r2 = this.a;
                axqVar.a(r2.size(), null, new defpackage.nxz(r2, 5), new defpackage.ccz(802480018, true, new opw((java.util.List) r2, (defpackage.affc) this.b)));
                return defpackage.afbk.a;
            case 12:
                pcl pclVar = (pcl) obj;
                pab pabVar = pac.a;
                pclVar.getClass();
                defpackage.abor aborVarK = pclVar.K();
                aborVarK.getClass();
                j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(aborVarK.b.b)).getClass();
                defpackage.abor aborVarN = pck.a.n();
                aborVarN.getClass();
                aborVarN.t();
                pck pckVar = aborVarN.b;
                pckVar.b |= 1;
                pav pavVar = (pav) this.a;
                pckVar.c = pavVar.a;
                aborVarN.t();
                pck pckVar2 = aborVarN.b;
                pckVar2.b |= 2;
                pckVar2.d = pavVar.c;
                aborVarN.t();
                pck pckVar3 = aborVarN.b;
                pckVar3.f = pavVar.d.m;
                pckVar3.b = 8 | pckVar3.b;
                aborVarN.t();
                pck pckVar4 = aborVarN.b;
                pckVar4.b |= 4;
                pckVar4.e = pavVar.b;
                java.util.Iterator it = pavVar.e.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((java.lang.Number) it.next()).intValue();
                    java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(aborVarN.b.g);
                    listUnmodifiableList.getClass();
                    new abrl(listUnmodifiableList);
                    aborVarN.t();
                    pck pckVar5 = aborVarN.b;
                    defpackage.abpf abpfVar = pckVar5.g;
                    if (!abpfVar.c()) {
                        pckVar5.g = defpackage.abox.G(abpfVar);
                    }
                    pckVar5.g.g(iIntValue);
                }
                java.lang.Object obj12 = this.b;
                pck pckVarQ = aborVarN.q();
                pckVarQ.getClass();
                aborVarK.t();
                aborVarK.b.b().put(obj12, pckVarQ);
                return defpackage.otn.E(aborVarK);
            case 13:
                pcl pclVar2 = (pcl) obj;
                pab pabVar2 = pac.a;
                pclVar2.getClass();
                defpackage.abor aborVarK2 = pclVar2.K();
                aborVarK2.getClass();
                j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(aborVarK2.b.c)).getClass();
                defpackage.abor aborVarN2 = pcm.a.n();
                aborVarN2.getClass();
                xqv xqvVar = (xqv) this.a;
                java.lang.String str2 = xqvVar.c;
                str2.getClass();
                aborVarN2.t();
                pcm pcmVar = aborVarN2.b;
                pcmVar.b |= 1;
                pcmVar.c = str2;
                int i8 = xqvVar.d;
                aborVarN2.t();
                pcm pcmVar2 = aborVarN2.b;
                pcmVar2.b |= 2;
                pcmVar2.d = i8;
                pcm pcmVarQ = aborVarN2.q();
                pcmVarQ.getClass();
                aborVarK2.t();
                aborVarK2.b.c().put(this.b, pcmVarQ);
                return defpackage.otn.E(aborVarK2);
            case 14:
                defpackage.afdo afdoVar = defpackage.tcu.a;
                if (obj != null) {
                    defpackage.afgv afgvVar = (defpackage.afgv) this.b;
                    ((defpackage.eqp) this.a).m(afgvVar.a);
                    afgvVar.a = obj;
                }
                return defpackage.afbk.a;
            case 15:
                java.util.List list = (java.util.List) obj;
                list.getClass();
                for (java.lang.Object obj13 : list) {
                    java.lang.Object obj14 = this.b;
                    if (defpackage.afga.f(((tif) obj13).e, obj14)) {
                        obj2 = obj13;
                        tifVar = (tif) obj2;
                        if (tifVar == null) {
                            tifVar = (tif) defpackage.afga.aB(list);
                        }
                        if (tifVar != null) {
                            java.lang.Object obj15 = this.a;
                            str = tifVar.e;
                            aackVar = (aack) obj15;
                            if (!defpackage.afga.f(str, aackVar.b)) {
                                aackVar.b = str;
                                tifVar.f.invoke();
                            }
                        }
                        return tifVar;
                    }
                }
                tifVar = (tif) obj2;
                if (tifVar == null) {
                    tifVar = (tif) defpackage.afga.aB(list);
                }
                if (tifVar != null) {
                    java.lang.Object obj16 = this.a;
                    str = tifVar.e;
                    aackVar = (aack) obj16;
                    if (!defpackage.afga.f(str, aackVar.b)) {
                        aackVar.b = str;
                        tifVar.f.invoke();
                    }
                }
                return tifVar;
            case 16:
                obj.getClass();
                return ((tij) this.b).b(obj).a((rb) this.a, obj);
            case 17:
                tif tifVar2 = (tif) obj;
                if (tifVar2 == null) {
                    defpackage.afdo afdoVar2 = defpackage.tcu.a;
                    return new defpackage.eqs(null);
                }
                java.lang.Object obj17 = this.a;
                java.lang.Object obj18 = this.b;
                java.lang.Object obj19 = tifVar2.d;
                return defpackage.ebo.f(obj19 instanceof defpackage.eqp ? defpackage.ebo.g((defpackage.eqp) obj19, new defpackage.nkb(obj18, obj17, i, r10)) : ((tij) obj18).b(obj19).a((rb) obj17, obj19), new tig(tifVar2, 2));
            case 18:
                defpackage.afgq afgqVar = (defpackage.afgq) this.a;
                if (!afgqVar.a) {
                    ?? r0 = this.b;
                    afgqVar.a = true;
                    ahoc.d((aiuw) r0, (defpackage.afdo) null, 0, new defpackage.oqn(afgqVar, (defpackage.afdk) null, 3), 3);
                }
                return defpackage.afbk.a;
            case 19:
                xsm xsmVar = (xsm) obj;
                xsmVar.getClass();
                xsn xsnVar = (xsn) this.a;
                java.util.Map mapA = xsnVar.d.a();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : mapA.entrySet()) {
                    ?? r5 = this.b;
                    if (r5.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
                for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                    java.util.Map map2 = xsnVar.e;
                    java.lang.Object key = entry2.getKey();
                    key.getClass();
                    java.lang.Object value = entry2.getValue();
                    value.getClass();
                    arrayList.add(new xsg((xud) key, value, (defpackage.aez) map2.get(entry2.getKey())));
                }
                xsmVar.d.addAll(arrayList);
                return defpackage.afbk.a;
            default:
                xsj xsjVar = (xsj) obj;
                xsjVar.getClass();
                ((xsi) xsjVar).b = null;
                java.lang.Object obj20 = this.a;
                ((xsi) xsjVar).a = ((xsi) obj20).a;
                for (xsn xsnVar2 : ((xsj) obj20).a()) {
                    java.lang.Object obj21 = this.b;
                    long j = ((xsl) xsnVar2).a;
                    long j2 = ((xsl) xsnVar2).b;
                    defpackage.aez aezVar = ((xsl) xsnVar2).c;
                    defpackage.nkb nkbVar = new defpackage.nkb(xsnVar2, obj21, 19);
                    aezVar.getClass();
                    xsm xsmVar2 = new xsm(j, j2, aezVar);
                    nkbVar.invoke(xsmVar2);
                    xsjVar.c.add(new xsk(((xsl) xsmVar2).a, ((xsl) xsmVar2).b, ((xsl) xsmVar2).c, xsmVar2.d));
                }
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ nkb(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
