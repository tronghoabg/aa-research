package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kyo implements defpackage.kje {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kyo(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    /* JADX WARN: Type inference failed for: r0v87, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, qyl] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.kje
    public final void a() throws defpackage.qsu, defpackage.qst, rlo {
        boolean z;
        java.util.Collection collectionValues;
        int i = 5;
        int i2 = 6;
        int i3 = 0;
        int i4 = 1;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.roz rozVarE = defpackage.laz.a().e(defpackage.kit.b().e());
                defpackage.kyq kyqVar = (defpackage.kyq) this.a;
                kyqVar.g = rozVarE;
                kyqVar.g.b = kyqVar.f;
                kyqVar.e = defpackage.laz.a().c(defpackage.kit.b().e());
                return;
            case 1:
                defpackage.mkp.a.f();
                defpackage.erh erhVarF = ((defpackage.qtv) defpackage.kit.b().e()).d().v().f();
                defpackage.jwe jweVar = (defpackage.jwe) this.a;
                jweVar.e = erhVarF;
                defpackage.mkp.a.f();
                jweVar.c = defpackage.ooa.f(defpackage.kit.b().e());
                defpackage.kqe kqeVar = defpackage.jwe.d;
                defpackage.mkp.a.f();
                com.google.android.gms.car.CarInfo carInfoD = defpackage.ooa.d(defpackage.kit.b().e());
                for (defpackage.absk abskVar : defpackage.adae.f().b) {
                    int iAr = defpackage.a.ar(abskVar.c);
                    if (iAr == 0) {
                        iAr = 1;
                    }
                    if (iAr == 5) {
                        z = true;
                    } else if (iAr == 6) {
                        iAr = 6;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (iAr == 6 || iAr == 7) {
                        java.lang.String str = abskVar.e;
                        defpackage.yqm yqmVar = defpackage.kjl.a;
                        j$.util.stream.Stream streamFilter = j$.util.DesugarArrays.stream(str.split(":")).map(new defpackage.ilz(16)).filter(new defpackage.kqi(i4));
                        int i5 = defpackage.ygw.d;
                        defpackage.ygw ygwVar = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        if (defpackage.kjl.h(carInfoD, ygwVar)) {
                            java.util.Iterator it = (!abskVar.d.isEmpty() ? abskVar.d : kqeVar.a.keySet()).iterator();
                            while (it.hasNext()) {
                                java.lang.Integer num = (java.lang.Integer) kqeVar.a.get((java.lang.String) it.next());
                                if (num != null) {
                                    arrayList.add(num);
                                }
                            }
                        }
                        collectionValues = arrayList;
                    } else {
                        collectionValues = kqeVar.a.values();
                    }
                    java.util.Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        kqeVar.b.put((java.lang.Integer) it2.next(), java.lang.Boolean.valueOf(z));
                    }
                }
                jweVar.b(defpackage.jwc.a, defpackage.jwb.a, 0);
                jweVar.b = true;
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.mkp.a.g();
                defpackage.rei reiVarD = ((defpackage.qtv) defpackage.kit.b().e()).d();
                rfz rfzVar = (rfz) reiVarD.f.a(new defpackage.rdg(reiVarD, i3));
                java.lang.Object obj = this.a;
                defpackage.lak lakVar = (defpackage.lak) obj;
                try {
                    rfzVar.b(lakVar.c);
                    break;
                } catch (defpackage.qst e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.lak.a.g()).p(e)).ai((char) 3682)).u("Failed to add the audio stream diagnostics listener, possibly due to b/185152155");
                    defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.AUDIO_DIAGNOSTICS, defpackage.zbd.vO).l());
                }
                lakVar.c.c();
                rfzVar.c(lakVar.d);
                synchronized (obj) {
                    ((defpackage.lak) obj).b = rfzVar;
                    break;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.mas masVar = (defpackage.mas) this.a;
                if (!masVar.d) {
                    defpackage.roz rozVar = masVar.f;
                    rozVar.getClass();
                    if (!rozVar.b(1)) {
                        masVar.e(defpackage.maq.a);
                        return;
                    }
                }
                masVar.d = true;
                masVar.b(true);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.mas) this.a).b(false);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.mkp.a.g();
                defpackage.roz rozVarS = defpackage.oml.s(defpackage.kit.b().e());
                defpackage.mas masVar2 = (defpackage.mas) this.a;
                masVar2.f = rozVarS;
                masVar2.f.b = new defpackage.mar(masVar2);
                masVar2.b = true;
                masVar2.c = true;
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj2 = this.a;
                try {
                    defpackage.mkp.a.f();
                    ((defpackage.mib) obj2).h = defpackage.ooa.g(defpackage.kit.b().e(), "com.google.android.apps.auto.projectedapps");
                    return;
                } catch (defpackage.qsu unused) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.mib.a.f()).ai((char) 4964)).u("Projected Apps not supported by target device");
                    return;
                }
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.yqj) defpackage.mpj.a.l().ai((char) 5145)).u("Registering CarActivityLifecycleEventListener");
                defpackage.rei reiVarD2 = ((defpackage.qtv) defpackage.kit.b().e()).d();
                defpackage.rps rpsVar = reiVarD2.f;
                java.lang.Object obj3 = this.a;
                rpsVar.g(new defpackage.rdp(reiVarD2, obj3, i2));
                defpackage.rei reiVarD3 = ((defpackage.qtv) defpackage.kit.b().e()).d();
                defpackage.mpj mpjVar = (defpackage.mpj) obj3;
                reiVarD3.f.g(new defpackage.rdp(reiVarD3, mpjVar.i, 2));
                mpjVar.g = true;
                mpjVar.f = true;
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.yqj) defpackage.mpk.a.l().ai((char) 5159)).u("Registering CarActivityStartProcessor");
                defpackage.mkp.a.g();
                defpackage.rei reiVarD4 = ((defpackage.qtv) defpackage.kit.b().e()).d();
                defpackage.rps rpsVar2 = reiVarD4.f;
                java.lang.Object obj4 = this.a;
                rpsVar2.g(new defpackage.rdp(reiVarD4, obj4, i));
                ((defpackage.mpk) obj4).b = true;
                return;
            case 9:
                java.lang.Object obj5 = this.a;
                if (obj5 != null) {
                    defpackage.mkp.a.g();
                    defpackage.oml.f(defpackage.kit.b().e(), com.google.android.gms.car.display.CarDisplayId.a, (com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) obj5);
                }
                defpackage.mkp.a.g();
                defpackage.oml.E(defpackage.kit.b().e(), com.google.android.gms.car.display.CarRegionId.a);
                return;
            case 10:
                defpackage.mkp.a.g();
                defpackage.qsh qshVarE = defpackage.kit.b().e();
                com.google.android.gms.car.display.CarDisplayId carDisplayId = com.google.android.gms.car.display.CarDisplayId.a;
                com.google.android.gms.car.display.CarDisplay carDisplayD = defpackage.oml.v(qshVarE, carDisplayId).d();
                if (carDisplayD == null) {
                    ((defpackage.yqj) ((defpackage.yqj) nsl.a.h()).ai((char) 5351)).u("show called before layout is calculated.");
                    return;
                }
                java.lang.Object obj6 = this.a;
                android.graphics.Point point = carDisplayD.d;
                android.graphics.Rect rectA = carDisplayD.a();
                point.getClass();
                android.graphics.Rect rect = new android.graphics.Rect(rectA.left, rectA.top, point.x - rectA.right, point.y - rectA.bottom);
                ((defpackage.yqj) nsl.a.l().ai((char) 5350)).M("contentInsets: %s stableArea: %s", rectA, rect);
                defpackage.ntb ntbVarB = defpackage.nte.c().b();
                defpackage.qts qtsVarN = ntbVarB.n(defpackage.nta.s);
                qtsVarN.getClass();
                com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParamsA = qtsVarN.a();
                int i6 = 18;
                if (!defpackage.acyc.Z()) {
                    mpl mplVarB = mpm.B();
                    mplVarB.e(true);
                    mplVarB.d(true);
                    mplVarB.f(true);
                    mplVarB.g(true);
                    mplVarB.c(false);
                    mplVarB.b(false);
                    mpm mpmVarA = mplVarB.a();
                    defpackage.mkp mkpVar = defpackage.mkp.a;
                    android.content.Context context = mkpVar.c;
                    mkpVar.g();
                    ((nsl) obj6).c = mpo.a(context, defpackage.oml.v(defpackage.kit.b().e(), carDisplayId), rect, carWindowLayoutParamsA.i + 1, ntbVarB.v(), new defpackage.img(i6), mpmVarA);
                    return;
                }
                int iApplyDimension = (int) android.util.TypedValue.applyDimension(1, defpackage.acyc.k(), defpackage.mkp.a.c.getResources().getDisplayMetrics());
                mpl mplVarB2 = mpm.B();
                mplVarB2.e(rectA.left > iApplyDimension);
                mplVarB2.g(rectA.top > iApplyDimension);
                mplVarB2.f(rectA.right > iApplyDimension);
                mplVarB2.d(rectA.bottom > iApplyDimension);
                mplVarB2.c(true);
                mplVarB2.b(false);
                mpm mpmVarA2 = mplVarB2.a();
                defpackage.mkp mkpVar2 = defpackage.mkp.a;
                android.content.Context context2 = mkpVar2.c;
                mkpVar2.g();
                ((nsl) obj6).c = mpo.a(context2, defpackage.oml.v(defpackage.kit.b().e(), carDisplayId), rect, carWindowLayoutParamsA.i + 1, ntbVarB.v(), new defpackage.img(i6), mpmVarA2);
                return;
            case 11:
                nsl nslVar = (nsl) this.a;
                nsj nsjVar = nslVar.d;
                if (nsjVar != null) {
                    nsjVar.a();
                    nslVar.d = null;
                    return;
                }
                return;
            case 12:
                defpackage.ret retVar = ((defpackage.sax) this.a).h;
                java.lang.Object objA = retVar.f.a();
                objA.getClass();
                ((defpackage.rps) objA).g(new defpackage.rev(retVar, i4));
                return;
            default:
                defpackage.mkp.a.g();
                defpackage.qsb qsbVarK = defpackage.oml.k(defpackage.kit.b().e());
                defpackage.xgy xgyVar = (defpackage.xgy) this.a;
                xgyVar.e = qsbVarK;
                if (xgyVar.e.a()) {
                    defpackage.qsb qsbVar = xgyVar.e;
                    defpackage.qyn qynVar = xgyVar.f;
                    ?? r0 = qsbVar.b;
                    if (r0 == 0) {
                        throw new java.lang.IllegalStateException("Cannot add CarPhoneStatusEventListener if carPhoneStatus is null");
                    }
                    try {
                        r0.j(1, qynVar);
                    } catch (android.os.RemoteException e2) {
                        defpackage.oml.I(e2);
                    }
                    break;
                }
                if (xgyVar.e.b()) {
                    xgyVar.z();
                    return;
                }
                return;
        }
    }
}
