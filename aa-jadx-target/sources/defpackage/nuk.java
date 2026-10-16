package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nuk implements defpackage.eqt {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nuk(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eqt
    public final void ea(java.lang.Object obj) {
        j$.util.Optional optional;
        android.content.ComponentName componentNameA = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yhv yhvVar = new defpackage.yhv();
                for (nuv nuvVar : (defpackage.ygw) obj) {
                    nvh nvhVar = nuvVar.c;
                    defpackage.mqh mqhVar = nvhVar.C ? defpackage.mqh.a : defpackage.mqh.b;
                    android.content.ComponentName componentName = nvhVar.B;
                    nul nulVarA = componentName != null ? nul.a(componentName, mqhVar) : new nul((android.content.ComponentName) null, nvhVar.f, mqhVar);
                    nus nusVar = nuvVar.i;
                    defpackage.zbd zbdVar = defpackage.zbd.oD;
                    if (nusVar.equals(nus.a) && nuvVar.f()) {
                        yhvVar.c(nulVarA);
                        zbdVar = defpackage.zbd.oC;
                    }
                    defpackage.oio oioVarA = defpackage.oio.a();
                    defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.SYSTEM_UI_NOTIFICATION, zbdVar);
                    rrvVarH.p((android.content.ComponentName) new defpackage.nub(nulVarA.a).i(new android.content.ComponentName(nulVarA.b, "")));
                    oioVarA.b((defpackage.rrw) rrvVarH.l());
                }
                java.lang.Object obj2 = this.a;
                defpackage.yhx yhxVarG = yhvVar.g();
                ((defpackage.yqj) num.a.l().ai((char) 5461)).y("Setting badgeable packages to %s", yhxVarG);
                ((defpackage.eqp) obj2).m(yhxVarG);
                return;
            case 1:
                defpackage.ksh kshVar = (defpackage.ksh) obj;
                defpackage.yqm yqmVar = ntp.a;
                android.view.View view = (android.view.View) this.a;
                android.content.Context context = view.getContext();
                view.setBackgroundColor(defpackage.kry.q.b(context, kshVar));
                android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131428106);
                if (imageView != null) {
                    imageView.setImageTintList(android.content.res.ColorStateList.valueOf(defpackage.kry.w.b(context, kshVar)));
                }
                android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131428111);
                if (textView != null) {
                    textView.setTextColor(defpackage.kry.s.b(context, kshVar));
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                nyc.a.l().u("Closing due to CarActivity changing.");
                ((nxp) this.a).b().d();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                com.google.android.apps.auto.components.turncard.TurnCardFragment turnCardFragment = (com.google.android.apps.auto.components.turncard.TurnCardFragment) this.a;
                turnCardFragment.c.b((java.lang.String) obj);
                turnCardFragment.b();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                com.google.android.apps.auto.components.turncard.TurnCardFragment turnCardFragment2 = (com.google.android.apps.auto.components.turncard.TurnCardFragment) this.a;
                turnCardFragment2.c.a((java.lang.String) obj);
                turnCardFragment2.b();
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                com.google.android.apps.auto.components.turncard.TurnCardFragment turnCardFragment3 = (com.google.android.apps.auto.components.turncard.TurnCardFragment) this.a;
                turnCardFragment3.e = iIntValue;
                if (iIntValue == 2 || iIntValue == 4 || iIntValue == 0) {
                    turnCardFragment3.a();
                    return;
                } else {
                    turnCardFragment3.b();
                    return;
                }
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.apps.auto.components.turncard.TurnCardFragment turnCardFragment4 = (com.google.android.apps.auto.components.turncard.TurnCardFragment) this.a;
                turnCardFragment4.d.a((java.lang.String) obj);
                turnCardFragment4.b();
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.apps.auto.components.turncard.TurnCardFragment turnCardFragment5 = (com.google.android.apps.auto.components.turncard.TurnCardFragment) this.a;
                turnCardFragment5.d.b((java.lang.String) obj);
                turnCardFragment5.b();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                olv olvVar = (olv) obj;
                java.lang.Object obj3 = this.a;
                if (olvVar != null) {
                    byte[] bArr = olvVar.b;
                    if (bArr != null) {
                        ((com.google.android.apps.auto.components.turncard.TurnCardFragment) obj3).c.c(new android.graphics.drawable.BitmapDrawable(((android.support.v4.app.Fragment) obj3).getResources(), android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                    } else {
                        com.google.android.apps.auto.components.ui.widget.navigation.DetailedNavigationStepView detailedNavigationStepView = ((com.google.android.apps.auto.components.turncard.TurnCardFragment) obj3).c;
                        int i = olvVar.a;
                        boolean z = olvVar.c;
                        detailedNavigationStepView.a.setImageResource(i);
                        detailedNavigationStepView.a.setScaleX(true != z ? 1.0f : -1.0f);
                        detailedNavigationStepView.a.setVisibility(0);
                    }
                } else {
                    ((com.google.android.apps.auto.components.turncard.TurnCardFragment) obj3).c.c((android.graphics.drawable.Drawable) null);
                }
                ((com.google.android.apps.auto.components.turncard.TurnCardFragment) obj3).b();
                return;
            case 9:
                ((com.google.android.apps.auto.components.ui.speedbump.SpeedbumpView) this.a).e = true;
                return;
            case 10:
                ((defpackage.ors) this.a).u((j$.util.Optional) obj);
                return;
            case 11:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                mlc mlcVar = new mlc(this.a, 8);
                if (true != optional2.isPresent()) {
                    return;
                }
                java.lang.Object obj4 = optional2.get();
                java.lang.Object obj5 = mlcVar.a;
                if (defpackage.ors.a.contains(((odn) obj4).a)) {
                    defpackage.ors orsVar = (defpackage.ors) obj5;
                    orsVar.u(orsVar.b());
                    return;
                }
                return;
            case 12:
                ((defpackage.eqp) this.a).j((defpackage.ygy) obj);
                return;
            case 13:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                mlc mlcVar2 = new mlc(this.a, 9);
                if (true != optional3.isPresent()) {
                    return;
                }
                java.lang.Object obj6 = optional3.get();
                java.lang.Object obj7 = mlcVar2.a;
                if (defpackage.oru.a.contains(((odn) obj6).a)) {
                    ((defpackage.eqp) obj7).j(((defpackage.oru) obj7).a());
                    return;
                }
                return;
            case 14:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                java.lang.Object obj8 = this.a;
                if (iIntValue2 != 12) {
                    if (iIntValue2 == 10) {
                        int i2 = orc.i;
                        ((defpackage.eqp) obj8).m(j$.util.Optional.ofNullable(new orb()));
                        return;
                    }
                    return;
                }
                synchronized (((defpackage.orv) obj8).a) {
                    if (((defpackage.orv) obj8).h.isPresent()) {
                        java.lang.Object obj9 = ((defpackage.orv) obj8).h.get();
                        synchronized (obj9) {
                            optional = ((orc) obj9).e;
                            break;
                        }
                        ((defpackage.eqp) obj8).m(optional);
                        return;
                    }
                    android.content.Context context2 = ((defpackage.orv) obj8).i;
                    int i3 = ((defpackage.orv) obj8).j;
                    android.bluetooth.BluetoothProfile.ServiceListener orcVar = new orc(android.bluetooth.BluetoothAdapter.getDefaultAdapter(), new kcx(obj8, 15), new osa(obj8, 1));
                    synchronized (orcVar) {
                        ((orc) orcVar).f = i3;
                        ((orc) orcVar).h.postDelayed(((orc) orcVar).g, 1000L);
                        ((orc) orcVar).b.getProfileProxy(context2, orcVar, i3);
                        break;
                    }
                    ((defpackage.orv) obj8).h = j$.util.Optional.of(orcVar);
                    return;
                    throw th;
                }
            case 15:
                defpackage.mqj mqjVar = (defpackage.mqj) obj;
                java.lang.Object obj10 = this.a;
                if (mqjVar == null || !defpackage.mkt.e.equals(mqjVar.a())) {
                    if (mqjVar != null) {
                        defpackage.oyp oypVar = (defpackage.oyp) obj10;
                        if (oypVar.d == null) {
                            oypVar.h(true);
                        }
                    }
                    if (mqjVar == null) {
                        defpackage.oyp oypVar2 = (defpackage.oyp) obj10;
                        if (oypVar2.d != null) {
                            oypVar2.h(false);
                            if (lef.a().f()) {
                                defpackage.mug.a().q();
                            }
                        }
                    }
                    if (mqjVar != null) {
                        componentNameA = mqjVar.a();
                    }
                }
                ((defpackage.oyp) obj10).d = componentNameA;
                return;
            case 16:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                if (defpackage.acyc.aN()) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.oyp.a.f()).ai((char) 6155)).y("Stopping immersives due to notification center state change: %b", bool);
                    defpackage.nqw.a().h();
                }
                if (defpackage.nte.c().b().m() != defpackage.nti.e) {
                    return;
                }
                java.lang.Object obj11 = this.a;
                if (zBooleanValue) {
                    defpackage.oyp oypVar3 = (defpackage.oyp) obj11;
                    oypVar3.g = defpackage.mug.a().u();
                    ((defpackage.yqj) defpackage.oyp.a.l().ai((char) 6154)).y("Notification Center opened, hiding dashboard with restore: %s", java.lang.Boolean.valueOf(oypVar3.g));
                    defpackage.mmi.c();
                    if (defpackage.mmi.h()) {
                        defpackage.mug.a().h(true, new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(2130772046, false, null, 0));
                        return;
                    } else {
                        defpackage.mug.a().g(true);
                        return;
                    }
                }
                if (!defpackage.oyp.k() && ((defpackage.oyp) obj11).g) {
                    ((defpackage.yqj) defpackage.oyp.a.l().ai((char) 6153)).u("Showing dashboard due to NC closing");
                    defpackage.mmi.c();
                    if (defpackage.mmi.h()) {
                        defpackage.mug.a().p(true, new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(2130772045, false, null, 0));
                    } else {
                        defpackage.mug.a().n();
                    }
                }
                ((defpackage.oyp) obj11).g = false;
                return;
            case 17:
                defpackage.oyr oyrVar = (defpackage.oyr) this.a;
                oyrVar.j(oyrVar.h(), oyrVar.g());
                return;
            case 18:
                java.lang.Integer num = (java.lang.Integer) obj;
                if (num != null) {
                    java.util.Iterator it = ((com.google.android.gearhead.demand.DemandClientService) this.a).d.values().iterator();
                    while (it.hasNext()) {
                        try {
                            ((defpackage.qio) it.next()).a.e(num.intValue());
                        } catch (android.os.RemoteException e) {
                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.demand.DemandClientService.a.h()).p(e)).ai((char) 7291)).y("remote exception reporting state %d", num);
                        }
                    }
                    return;
                }
                return;
            case 19:
                sfn sfnVar = (sfn) obj;
                int i4 = sfnVar.a;
                float f = sfnVar.b * 100.0f;
                java.lang.Object obj12 = this.a;
                if (i4 == 1) {
                    sfz sfzVar = (sfz) obj12;
                    sfzVar.i.g.M(defpackage.zbe.FRX_PRESETUP_INTRO_DOWNLOAD, defpackage.zbd.bQ);
                    sfzVar.h.g.l(((android.support.v4.app.Fragment) obj12).getViewLifecycleOwner());
                    sgw sgwVar = sfzVar.i;
                    sgwVar.h(sgwVar.d == 2 ? 11 : 7);
                    return;
                }
                if (i4 == 4) {
                    sfz sfzVar2 = (sfz) obj12;
                    sfzVar2.g.setIndeterminate(false);
                    sfzVar2.g.setProgress((int) f);
                    return;
                } else {
                    if (i4 != 5) {
                        ((sfz) obj12).g.setIndeterminate(true);
                        return;
                    }
                    sfz sfzVar3 = (sfz) obj12;
                    sfzVar3.i.g.M(defpackage.zbe.FRX_PRESETUP_INTRO_DOWNLOAD, defpackage.zbd.bU);
                    sfzVar3.h.g.l(((android.support.v4.app.Fragment) obj12).getViewLifecycleOwner());
                    sfzVar3.i.h(5);
                    return;
                }
            default:
                java.util.List<mrd> list = (java.util.List) obj;
                xbe xbeVar = ((com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity) this.a).q;
                if (actk.e()) {
                    xbeVar.m = new xaz();
                }
                java.util.List list2 = xbeVar.e;
                defpackage.ygw ygwVarO = defpackage.ygw.o(list2);
                java.util.List list3 = xbeVar.f;
                list3.clear();
                java.util.List list4 = xbeVar.g;
                list4.clear();
                xbeVar.k = new xbc();
                xbeVar.l = new xbd();
                for (mrd mrdVar : list) {
                    if (defpackage.nsn.e().h(mrdVar.c.a())) {
                        list3.add(mrdVar);
                    } else {
                        list4.add(mrdVar);
                    }
                }
                xbeVar.v();
                gj.a(new xbf(ygwVarO, list2)).a(new gc(xbeVar));
                return;
        }
    }
}
