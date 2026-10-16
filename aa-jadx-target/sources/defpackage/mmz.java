package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mmz implements defpackage.eqt {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mmz(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Type inference failed for: r10v58, types: [aiuw, java.lang.Object] */
    @Override // defpackage.eqt
    public final void ea(java.lang.Object obj) throws afbj, wfo {
        wxd wxdVarC;
        android.content.ComponentName componentNameA = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.jfh jfhVar = (defpackage.jfh) obj;
                java.lang.Object obj2 = this.a;
                mna mnaVar = (mna) obj2;
                if (mnaVar.g != jfhVar) {
                    ((defpackage.yqj) mna.f.l().ai(5087)).M("onSettingChanged(%s -> %s): invalidating", mnaVar.g, jfhVar);
                    mnaVar.g = jfhVar;
                    rb rbVar = (rb) obj2;
                    rbVar.j();
                    defpackage.ocn.a().f(rbVar.a, defpackage.mkt.v, 2132085243, 1);
                } else {
                    ((defpackage.yqj) mna.f.l().ai((char) 5088)).y("onSettingChanged(%s): ignoring because unchanged", jfhVar);
                }
                break;
            case 1:
                defpackage.jfg jfgVar = (defpackage.jfg) obj;
                java.lang.Object obj3 = this.a;
                mmx mmxVar = (mmx) obj3;
                if (mmxVar.g != jfgVar) {
                    ((defpackage.yqj) mmx.f.l().ai(5072)).M("onSettingChanged(%s -> %s): invalidating", mmxVar.g, jfgVar);
                    ((rb) obj3).j();
                } else {
                    ((defpackage.yqj) mmx.f.l().ai((char) 5073)).y("onSettingChanged(%s): ignoring because unchanged", jfgVar);
                }
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.jfm jfmVar = (defpackage.jfm) obj;
                java.lang.Object obj4 = this.a;
                mnb mnbVar = (mnb) obj4;
                if (mnbVar.g != jfmVar) {
                    ((defpackage.yqj) mnb.f.l().ai(5091)).M("onSettingChanged(%s -> %s): invalidating", mnbVar.g, jfmVar);
                    rb rbVar2 = (rb) obj4;
                    rbVar2.j();
                    defpackage.ocn.a().f(rbVar2.a, defpackage.mkt.v, 2132085243, 1);
                } else {
                    ((defpackage.yqj) mnb.f.l().ai((char) 5092)).y("onSettingChanged(%s): ignoring because unchanged", jfmVar);
                }
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.jfj jfjVar = (defpackage.jfj) obj;
                defpackage.mmk.b();
                jfl jflVarA = jfl.a(jfjVar, defpackage.mmk.h(defpackage.kit.b().e()));
                java.lang.Object obj5 = this.a;
                mnc mncVar = (mnc) obj5;
                if (jflVarA != mncVar.g) {
                    mncVar.g = jflVarA;
                    ((defpackage.yqj) mnc.f.l().ai((char) 5093)).M("onAuxiliaryDisplaySettingChanged(%s -> %s): invalidating", jfjVar, jflVarA);
                    ((rb) obj5).j();
                } else {
                    ((defpackage.yqj) mnc.f.l().ai((char) 5094)).y("onAuxiliaryDisplaySettingChanged(%s): ignoring because unchanged", jfjVar);
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.jfk jfkVar = (defpackage.jfk) obj;
                defpackage.mmk.b();
                jfl jflVarA2 = jfl.a(defpackage.mmk.g(defpackage.kit.b().e()), jfkVar);
                java.lang.Object obj6 = this.a;
                mnc mncVar2 = (mnc) obj6;
                if (jflVarA2 != mncVar2.g) {
                    mncVar2.g = jflVarA2;
                    ((defpackage.yqj) mnc.f.l().ai((char) 5095)).M("onClusterDisplaySettingChanged(%s -> %s): invalidating", jfkVar, jflVarA2);
                    ((rb) obj6).j();
                } else {
                    ((defpackage.yqj) mnc.f.l().ai((char) 5096)).y("onClusterDisplaySettingChanged(%s): ignoring because unchanged", jflVarA2);
                }
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                ((defpackage.yqj) ((defpackage.yqj) defpackage.mru.a.f()).ai((char) 5235)).u("Phone wallpaper changed");
                java.lang.Object obj7 = this.a;
                if (bitmap != null) {
                    android.content.Context context = defpackage.mkp.a.c;
                    hsz hszVarE = hsc.c(context).b().b(ies.a(new omw(context)).B(hui.a)).e(bitmap);
                    defpackage.mru mruVar = (defpackage.mru) obj7;
                    if (mruVar.h == null) {
                        mruVar.h = new mrs(mruVar);
                    }
                    hszVarE.q(mruVar.h);
                    defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.SYSTEM_UI_BACKDROP, defpackage.zbd.Jz).l());
                } else {
                    ((defpackage.mru) obj7).b.b((android.graphics.Bitmap) null);
                }
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                mrr mrrVar = ((defpackage.mru) this.a).b.a;
                if (mrrVar != null) {
                    defpackage.wfp.c();
                    mrrVar.b = mrrVar.a();
                    if (mrrVar.a == null) {
                        mrrVar.invalidate();
                    }
                }
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.util.List list = (java.util.List) obj;
                msa msaVar = (msa) this.a;
                int iA = msaVar.b.a();
                ((defpackage.yqj) msa.a.l().ai(5245)).D("populateTabs activeIndex=%d items=%s", iA, list);
                msaVar.b.i();
                com.google.android.material.tabs.TabLayout tabLayout = msaVar.b;
                mrz mrzVar = msaVar.d;
                mrzVar.getClass();
                tabLayout.j(mrzVar);
                msaVar.c = list;
                int i = 0;
                while (i < list.size()) {
                    wxd wxdVarD = msaVar.b.d();
                    wxdVarD.g.setBackground((android.graphics.drawable.Drawable) null);
                    wxdVarD.h = i;
                    wxf wxfVar = wxdVarD.g;
                    if (wxfVar != null) {
                        wxfVar.setId(i);
                    }
                    msaVar.b.f(wxdVarD, i == iA);
                    i++;
                }
                if (msaVar.b.a() < 0 && (wxdVarC = msaVar.b.c(0)) != null) {
                    wxdVarC.a();
                }
                com.google.android.material.tabs.TabLayout tabLayout2 = msaVar.b;
                mrz mrzVar2 = msaVar.d;
                mrzVar2.getClass();
                tabLayout2.e(mrzVar2);
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEvent = (com.google.android.apps.auto.sdk.nav.state.TurnEvent) obj;
                java.lang.Object obj8 = this.a;
                if (turnEvent == null) {
                    defpackage.ngl nglVar = (defpackage.ngl) obj8;
                    nglVar.h = -1;
                    nglVar.g = -1L;
                    nglVar.f = -1L;
                } else {
                    defpackage.ngl nglVar2 = (defpackage.ngl) obj8;
                    nglVar2.f = android.os.SystemClock.uptimeMillis();
                    if (turnEvent.j()) {
                        nglVar2.i = 0;
                    } else {
                        int i2 = nglVar2.i + 1;
                        nglVar2.i = i2;
                        if (i2 >= 5) {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.ngl.a.h()).ai((char) 5260)).u("hit bad updates threshold");
                            nglVar2.h = -1;
                            nglVar2.g = -1L;
                        }
                    }
                    if (turnEvent.j()) {
                        int i3 = turnEvent.h;
                        nglVar2.h = i3;
                        if (i3 <= defpackage.ngl.c.toSeconds()) {
                            nglVar2.g = android.os.SystemClock.uptimeMillis();
                        }
                    }
                }
                defpackage.ngl nglVar3 = (defpackage.ngl) obj8;
                android.os.Handler handler = nglVar3.l;
                handler.removeMessages(1);
                handler.sendMessage(handler.obtainMessage(1));
                if (nglVar3.f != -1) {
                    handler.sendMessageAtTime(handler.obtainMessage(1), nglVar3.f + defpackage.ngl.b.toMillis());
                }
                if (nglVar3.g != -1) {
                    handler.sendMessageAtTime(handler.obtainMessage(1), nglVar3.g + defpackage.ngl.e.toMillis());
                }
                break;
            case 9:
                defpackage.nne nneVar = (defpackage.nne) obj;
                nneVar.getClass();
                android.content.ComponentName componentName = ((njv) this.a).I;
                if (componentName == null) {
                    defpackage.afga.d("hotseatTwo");
                } else {
                    componentNameA = componentName;
                }
                njv.m(componentNameA, nneVar);
                break;
            case 10:
                defpackage.nne nneVar2 = (defpackage.nne) obj;
                nneVar2.getClass();
                android.content.ComponentName componentName2 = ((njv) this.a).J;
                if (componentName2 == null) {
                    defpackage.afga.d("hotseatThree");
                } else {
                    componentNameA = componentName2;
                }
                njv.m(componentNameA, nneVar2);
                break;
            case 11:
                defpackage.nne nneVar3 = (defpackage.nne) obj;
                nneVar3.getClass();
                android.content.ComponentName componentName3 = ((njv) this.a).K;
                if (componentName3 == null) {
                    defpackage.afga.d("hotseatFour");
                } else {
                    componentNameA = componentName3;
                }
                njv.m(componentNameA, nneVar3);
                break;
            case 12:
                defpackage.mqj mqjVar = (defpackage.mqj) obj;
                if (mqjVar != null) {
                    java.lang.Object obj9 = this.a;
                    nnm nnmVar = (nnm) obj9;
                    if (!mqjVar.equals(nnmVar.a)) {
                        if (mqjVar.b != defpackage.mqg.SYSTEM || defpackage.kmv.c(acxw.b(), mqjVar.a().flattenToString())) {
                            ((defpackage.eqp) obj9).m(nnmVar.a);
                            nnmVar.a = mqjVar;
                        }
                    }
                }
                break;
            case 13:
                ((noe) this.a).a((nuv) obj);
                break;
            case 14:
                defpackage.mqj mqjVar2 = (defpackage.mqj) obj;
                defpackage.yqm yqmVar = noe.a;
                defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(5294);
                java.lang.Object obj10 = this.a;
                noe noeVar = (noe) obj10;
                yqjVar.M("updatePreviousApp: current=%s new=%s", noeVar.j, mqjVar2);
                noeVar.j = mqjVar2;
                if (noeVar.i == null || noeVar.m || !noeVar.n) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 5295)).u("Using inactive state");
                    ((defpackage.eqp) obj10).m(defpackage.nod.a);
                }
                break;
            case 15:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                ((defpackage.yqj) noe.a.l().ai((char) 5291)).y("updateDashboardOpenState: %s", bool);
                noe noeVar2 = (noe) this.a;
                noeVar2.m = zBooleanValue;
                noeVar2.a(noeVar2.i);
                break;
            case 16:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                ((defpackage.yqj) noe.a.l().ai((char) 5290)).y("showRailWidget: %s", bool2);
                noe noeVar3 = (noe) this.a;
                noeVar3.n = zBooleanValue2;
                noeVar3.a(noeVar3.i);
                break;
            case 17:
                kkl kklVar = (kkl) obj;
                kklVar.getClass();
                uhj uhjVar = (uhj) this.a;
                ahoc.d((aiuw) uhjVar.i, (defpackage.afdo) null, 0, new defpackage.nle(uhjVar, kklVar, (defpackage.afdk) null, 7), 3);
                break;
            case 18:
                defpackage.mqj mqjVar3 = (defpackage.mqj) obj;
                componentNameA = mqjVar3 != null ? mqjVar3.a() : null;
                if (!defpackage.mkt.e.equals(componentNameA)) {
                    defpackage.nse nseVar = (defpackage.nse) this.a;
                    android.content.ComponentName componentName4 = nseVar.c;
                    if (componentName4 == null || !componentName4.equals(componentNameA)) {
                        nseVar.d = nseVar.c;
                        nseVar.c = componentNameA;
                    }
                    break;
                }
                break;
            case 19:
                java.lang.Object obj11 = this.a;
                android.os.Handler handler2 = ((nsl) obj11).f;
                handler2.removeCallbacksAndMessages(null);
                if (!j$.util.Objects.equals((java.lang.Boolean) obj, java.lang.Boolean.TRUE)) {
                    handler2.postDelayed(new defpackage.mta(obj11, 12), nsl.b.toMillis());
                } else {
                    handler2.postDelayed(new defpackage.mta(obj11, 11), nsl.b.toMillis());
                }
                break;
            default:
                defpackage.ksh kshVar = (defpackage.ksh) obj;
                android.view.View view = (android.view.View) this.a;
                android.content.Context context2 = view.getContext();
                view.setBackgroundColor(defpackage.kry.q.b(context2, kshVar));
                android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131428112);
                if (textView != null) {
                    textView.setTextColor(defpackage.kry.s.b(context2, kshVar));
                }
                android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131428110);
                if (textView2 != null) {
                    textView2.setTextColor(defpackage.kry.w.b(context2, kshVar));
                }
                break;
        }
    }
}
