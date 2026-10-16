package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ogk extends defpackage.lhm {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/apps/auto/components/telecom/notification/MultipleCallNotificationProducer");
    public final android.content.Context b;
    public final defpackage.oed c;
    public final java.util.Map d;
    public final java.util.Map e;

    public ogk(android.content.Context context, defpackage.oed oedVar) {
        context.getClass();
        this.b = context;
        this.c = oedVar;
        this.d = new java.util.LinkedHashMap();
        this.e = new java.util.LinkedHashMap();
        defpackage.hcq hcqVar = new defpackage.hcq(new aizc(new defpackage.dnf(this, (defpackage.afdk) null, 18)), new defpackage.dnf(this, (defpackage.afdk) null, 19, (byte[]) null), 16);
        defpackage.eqi eqiVar = this.j;
        eqiVar.getClass();
        aign.d(new aizc(new defpackage.egg(eqiVar, defpackage.epx.d, hcqVar, (defpackage.afdk) null, 2)), defpackage.eqy.b(this));
    }

    private static final boolean g(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        return defpackage.omf.w().z(carCall.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(com.google.android.apps.auto.components.telecom.call.CarCall carCall, defpackage.afdk afdkVar) throws java.lang.Throwable {
        ogh oghVar;
        com.google.android.apps.auto.components.telecom.call.CarCall carCall2;
        aiut aiutVar;
        defpackage.ogk ogkVar;
        ogg oggVar;
        defpackage.afgv afgvVar;
        defpackage.afgv afgvVar2;
        if (afdkVar instanceof ogh) {
            oghVar = (ogh) afdkVar;
            int i = oghVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                oghVar.e = i - Integer.MIN_VALUE;
            } else {
                oghVar = new ogh(this, afdkVar);
            }
        } else {
            oghVar = new ogh(this, afdkVar);
        }
        java.lang.Object obj = oghVar.c;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = oghVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                aiutVar = (aiut) oghVar.b;
                com.google.android.apps.auto.components.telecom.call.CarCall carCall3 = (com.google.android.apps.auto.components.telecom.call.CarCall) oghVar.a;
                defpackage.afga.cz(obj);
                carCall2 = carCall3;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                afgvVar2 = oghVar.f;
                afgvVar = (defpackage.afgv) oghVar.b;
                oggVar = (ogg) oghVar.a;
                defpackage.afga.cz(obj);
                ogkVar = this;
            }
            hsc.c(ogkVar.b).b().f(jvb.d().a((java.lang.String) afgvVar2.a, (java.lang.String) afgvVar.a)).q(oggVar);
            return defpackage.afbk.a;
        }
        defpackage.afga.cz(obj);
        defpackage.ypg ypgVar = a;
        ((defpackage.ype) ypgVar.e().ai(5890)).y("Showing call %s", carCall);
        java.util.Map map = this.e;
        int i3 = carCall.a;
        ogd ogdVar = (ogd) map.get(new java.lang.Integer(i3));
        if (ogdVar != null) {
            int i4 = carCall.e;
            com.google.android.apps.auto.components.telecom.call.CarCall carCall4 = ogdVar.a;
            if (carCall4.e == i4) {
                com.google.android.apps.auto.components.telecom.call.CarCall.Details details = carCall4.f;
                details.getClass();
                com.google.android.apps.auto.components.telecom.call.CarCall.Details details2 = carCall.f;
                details2.getClass();
                if (defpackage.afga.f(details2.b, details.b) && defpackage.afga.f(details2.h, details.h) && details2.d == details.d && g(carCall) == ogdVar.b) {
                    ((defpackage.ype) ypgVar.e().ai(5891)).u("Skipping notification for unchanged call");
                    return defpackage.afbk.a;
                }
            }
        }
        map.put(new java.lang.Integer(i3), new ogd(carCall, g(carCall)));
        if (defpackage.mkc.R().u() && !defpackage.mkc.K(carCall)) {
            android.content.ComponentName componentNameB = defpackage.mkc.R().b(carCall);
            componentNameB.getClass();
            if (!defpackage.mdp.d().v(componentNameB.getPackageName())) {
                android.content.ComponentName componentNameB2 = defpackage.mkc.R().b(carCall);
                componentNameB2.getClass();
                ((defpackage.ype) ypgVar.g().ai(5892)).y("Mic permission is missing for: %s", componentNameB2.getPackageName());
                defpackage.oim oimVarU = defpackage.omf.u();
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.DX);
                rrvVarH.p(componentNameB2);
                oimVarU.F(rrvVarH.l());
                defpackage.mkc.R().p(this.b, componentNameB2);
                return defpackage.afbk.a;
            }
        }
        java.util.concurrent.Executor executor = defpackage.mkp.a.d;
        executor.getClass();
        aiut aiutVarB = aiaz.b(executor);
        defpackage.dxh dxhVar = new defpackage.dxh(carCall, this, (defpackage.afdk) null, 20);
        oghVar.a = carCall;
        oghVar.b = aiutVarB;
        oghVar.e = 1;
        java.lang.Object objA = ahoc.a(aiutVarB, dxhVar, oghVar);
        if (objA != afdrVar) {
            carCall2 = carCall;
            aiutVar = aiutVarB;
            obj = objA;
        }
        return afdrVar;
        android.net.Uri uri = (android.net.Uri) obj;
        uri.getClass();
        ogf ogfVar = new ogf(this, carCall2, uri);
        this.d.put(new java.lang.Integer(carCall2.a), ogfVar);
        hsc.c(this.b).b().f(uri).q(ogfVar);
        ien ienVar = ogfVar.c;
        if (ienVar == null || ienVar.l()) {
            return defpackage.afbk.a;
        }
        ogg oggVar2 = new ogg(this, carCall2);
        ogfVar.a = oggVar2;
        defpackage.afgv afgvVar3 = new defpackage.afgv();
        defpackage.afgv afgvVar4 = new defpackage.afgv();
        ogkVar = this;
        ogi ogiVar = new ogi(afgvVar3, ogkVar, carCall2, afgvVar4, (defpackage.afdk) null, 0);
        oghVar.a = oggVar2;
        oghVar.b = afgvVar3;
        oghVar.f = afgvVar4;
        oghVar.e = 2;
        if (ahoc.a(aiutVar, ogiVar, oghVar) != afdrVar) {
            oggVar = oggVar2;
            afgvVar = afgvVar3;
            afgvVar2 = afgvVar4;
            hsc.c(ogkVar.b).b().f(jvb.d().a((java.lang.String) afgvVar2.a, (java.lang.String) afgvVar.a)).q(oggVar);
            return defpackage.afbk.a;
        }
        return afdrVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ogk] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.Iterator] */
    public final java.lang.Object b(java.util.List list, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.ogj ogjVar;
        ?? it;
        if (afdkVar instanceof defpackage.ogj) {
            ogjVar = (defpackage.ogj) afdkVar;
            int i = ogjVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ogjVar.d = i - Integer.MIN_VALUE;
            } else {
                ogjVar = new defpackage.ogj(this, afdkVar);
            }
        } else {
            ogjVar = new defpackage.ogj(this, afdkVar);
        }
        java.lang.Object obj = ogjVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = ogjVar.d;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            ((defpackage.ype) a.e().ai(5893)).y("Calls updated to %s", list);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (!defpackage.mkc.K((com.google.android.apps.auto.components.telecom.call.CarCall) obj2) || !defpackage.ogv.a.a().f()) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : arrayList) {
                if (!defpackage.mkc.Q().g((com.google.android.apps.auto.components.telecom.call.CarCall) obj3)) {
                    arrayList2.add(obj3);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj4 : arrayList2) {
                com.google.android.apps.auto.components.telecom.call.CarCall carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) obj4;
                defpackage.oei oeiVarA = defpackage.oeh.a();
                int i3 = carCall.e;
                if (oeiVarA.F(i3) || oeiVarA.I(i3) || oeiVarA.J(carCall)) {
                    arrayList3.add(obj4);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(defpackage.afga.aj(arrayList3, 10));
            java.util.Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new java.lang.Integer(((com.google.android.apps.auto.components.telecom.call.CarCall) it2.next()).a));
            }
            java.util.Set setBf = defpackage.afga.bf(arrayList4);
            java.util.Map map = this.e;
            java.util.Iterator it3 = defpackage.afga.K(map.keySet(), setBf).iterator();
            while (it3.hasNext()) {
                int iIntValue = ((java.lang.Number) it3.next()).intValue();
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(iIntValue);
                map.remove(numValueOf);
                ogf ogfVar = (ogf) this.d.remove(numValueOf);
                if (ogfVar != null) {
                    e(ogfVar);
                }
                defpackage.ygw ygwVarE = defpackage.nuz.b().e();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                for (java.lang.Object obj5 : ygwVarE) {
                    nuv nuvVar = (nuv) obj5;
                    if (defpackage.afga.f(nuvVar.b, "call")) {
                        if (nuvVar.a == iIntValue) {
                            arrayList5.add(obj5);
                        }
                    }
                }
                java.util.Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    defpackage.nuz.b().g("call", iIntValue, ((nuv) it4.next()).c.f);
                }
            }
            it = arrayList3.iterator();
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj6 = ogjVar.a;
            defpackage.afga.cz(obj);
            it = obj6;
        }
        while (it.hasNext()) {
            com.google.android.apps.auto.components.telecom.call.CarCall carCall2 = (com.google.android.apps.auto.components.telecom.call.CarCall) it.next();
            ogjVar.a = it;
            ogjVar.d = 1;
            if (a(carCall2, ogjVar) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    public final void e(ifd ifdVar) {
        j$.time.Duration durationCC = defpackage.ysr.cC(defpackage.acrf.f());
        if (durationCC.isZero()) {
            hsc.c(this.b).i(ifdVar);
        } else {
            aiuw aiuwVar = mkr.a;
            ahoc.d(mkr.a, (defpackage.afdo) null, 0, new defpackage.bqo(durationCC, this, ifdVar, (defpackage.afdk) null, 13), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0043  */
    public final void f(android.graphics.Bitmap bitmap, com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        android.content.ComponentName componentNameA;
        java.lang.String string;
        defpackage.ypg ypgVar = a;
        ((defpackage.ype) ypgVar.f().ai(5888)).y("Post notification for call: %s", carCall);
        android.content.ComponentName componentNameB = defpackage.mkc.R().b(carCall);
        componentNameB.getClass();
        android.content.ComponentName componentName = true != defpackage.mkc.R().t(carCall) ? null : componentNameB;
        if (componentName != null) {
            componentNameA = defpackage.mkc.R().a(this.b, componentName.getPackageName());
            if (componentNameA == null) {
                componentNameA = defpackage.mkt.b;
                componentNameA.getClass();
            }
        } else {
            componentNameA = defpackage.mkt.b;
            componentNameA.getClass();
        }
        android.content.Context context = this.b;
        java.lang.String strP = defpackage.oeh.a().p(context, carCall);
        strP.getClass();
        nvc nvcVar = new nvc();
        nvcVar.b = com.google.android.apps.auto.components.graphics.icon.GhIcon.j(componentNameB);
        ogo ogoVar = ogp.a;
        int i = carCall.a;
        nvcVar.c = ogo.a(ogn.a, i);
        nvcVar.B = componentNameA;
        nvcVar.f = componentNameB.getPackageName();
        nvcVar.d = com.google.android.apps.auto.components.graphics.icon.GhIcon.l(bitmap);
        nvcVar.m = strP;
        duq duqVar = new duq();
        duqVar.a = strP;
        duqVar.b = androidx.core.graphics.drawable.IconCompat.k(bitmap);
        dur durVar = new dur(duqVar);
        int i2 = carCall.e;
        if (defpackage.oeh.a().I(i2) || defpackage.oeh.a().J(carCall)) {
            nvcVar.x = defpackage.nve.e;
            nvcVar.l = true;
            nvcVar.a = i2 == 3 ? nvf.b : nvf.c;
            defpackage.yqm yqmVar = nwg.a;
            nvcVar.F = new nwg(2, durVar, (android.app.PendingIntent) null, (android.app.PendingIntent) null, ogo.a(ogn.d, i));
            if (i2 == 1 || i2 == 4) {
                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconP = com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context, 2131231706);
                android.app.PendingIntent pendingIntentA = ogo.a(g(carCall) ? ogn.c : ogn.b, i);
                aafz aafzVar = new aafz((byte[]) null);
                aafzVar.e = ghIconP;
                aafzVar.b = pendingIntentA;
                aafzVar.a = true != g(carCall) ? 1 : 4;
                nvcVar.p = new nvb(aafzVar);
            }
            nvcVar.i = carCall.f.d;
            nvcVar.j = i2 != 3;
            if (i2 == 1) {
                string = context.getString(2132083901);
                string.getClass();
            } else if (i2 == 3) {
                string = context.getString(2132083904);
                string.getClass();
            } else if (i2 == 9) {
                string = context.getString(2132083900);
                string.getClass();
            } else if (g(carCall)) {
                string = context.getString(2132084784);
                string.getClass();
            } else {
                java.lang.String strU = defpackage.oeh.a().u(carCall);
                if (strU == null) {
                    strU = "";
                }
                string = defpackage.oeh.a().m(context, strU).toString();
            }
            nvcVar.n = string;
        } else {
            if (!defpackage.oeh.a().F(i2)) {
                ((defpackage.ype) ypgVar.h().ai(5889)).w("Skipping notification for call in state %s", i2);
                return;
            }
            nvcVar.x = defpackage.nve.d;
            nvcVar.a = nvf.d;
            nvcVar.n = defpackage.oeh.a().s(context, componentNameB, i);
            defpackage.yqm yqmVar2 = nwg.a;
            nvcVar.F = new nwg(1, durVar, ogo.a(ogn.e, i), ogo.a(ogn.f, i), (android.app.PendingIntent) null);
        }
        defpackage.nuz.b().j("call", i, nvcVar.b());
    }
}
