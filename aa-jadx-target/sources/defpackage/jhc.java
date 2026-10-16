package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jhc implements java.lang.Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jhc(java.lang.Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [idi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, jhb] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, mog] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        xqy xqyVarQ;
        int i = 2;
        boolean z = false;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.jhe) this.b).z(this.a, null, -1);
                return;
            case 1:
                defpackage.igg.f();
                boolean z2 = this.a;
                sdv sdvVar = ((iea) this.b).a;
                boolean z3 = sdvVar.b;
                sdvVar.b = z2;
                if (z3 != z2) {
                    sdvVar.e.a(z2);
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                boolean z4 = this.a;
                java.lang.Object obj = this.b;
                ((defpackage.jhe) obj).x(z4 ? ((defpackage.jhe) obj).v() : null);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.ill.d();
                defpackage.jhe jheVar = (defpackage.jhe) this.b;
                defpackage.jhl jhlVar = jheVar.h;
                boolean z5 = this.a;
                if (jhlVar != null) {
                    jhlVar.at(z5);
                    return;
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.jhe.a.h()).ai(2139)).N("%s: No window, caching critical UI state: %b", jheVar.b, z5);
                    jheVar.i = z5;
                    return;
                }
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                if (defpackage.acqh.m()) {
                    boolean z6 = this.a;
                    ?? r11 = this.b;
                    defpackage.jhe jheVar2 = (defpackage.jhe) r11;
                    jheVar2.q = z6;
                    if (!z6) {
                        if (jheVar2.r) {
                            ((defpackage.yqj) defpackage.jhe.a.l().ai((char) 2129)).y("%s.setOverlayVisible(false)", jheVar2.b);
                            java.lang.Runnable runnable = jheVar2.t;
                            if (runnable != null) {
                                jheVar2.s.removeCallbacks(runnable);
                            }
                            jheVar2.x(jheVar2.v());
                            return;
                        }
                        return;
                    }
                    if (!jheVar2.l && !jheVar2.r) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.jhe.a.h()).ai(2131)).y("%s not hidden, nothing to do for setOverlayVisible(true).", jheVar2.b);
                        return;
                    }
                    ((defpackage.yqj) defpackage.jhe.a.l().ai((char) 2130)).y("%s.setOverlayVisible(true)", jheVar2.b);
                    jheVar2.l = false;
                    defpackage.ysr.bk(jheVar2.h != null, "This car window must have a ProjectionWindow before setOverlayVisible can be called");
                    jheVar2.r = true;
                    jheVar2.B(jheVar2.g);
                    if (jheVar2.d.aj(r11, jheVar2.p)) {
                        jheVar2.m = true;
                        jheVar2.n = true;
                        jheVar2.o = null;
                    }
                    java.lang.Runnable runnable2 = jheVar2.t;
                    if (runnable2 != null) {
                        jheVar2.s.removeCallbacks(runnable2);
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.ypu ypuVarF = pcv.a.f();
                boolean z7 = this.a;
                ((defpackage.yqj) ((defpackage.yqj) ypuVarF).ai((char) 6317)).y("handoff initiated: %b", java.lang.Boolean.valueOf(z7));
                pcs pcsVar = ((jls) this.b).a.h;
                defpackage.omv.h(pcsVar.c, "com.google.android.gms.car.CONNECTION_HANDOFF", z7 ? defpackage.rsr.b : defpackage.rsr.c, null);
                if (z7) {
                    return;
                }
                pcsVar.i.c();
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj2 = this.b;
                his hisVarC = ((hll) obj2).C();
                if (hisVarC.a instanceof gmw) {
                    boolean z8 = this.a;
                    gnl gnlVar = (gnl) obj2;
                    if (gnlVar.f != z8) {
                        gnlVar.f = z8;
                        i = true == z8 ? Integer.MAX_VALUE : 2;
                        hiq hiqVar = hisVarC.b;
                        hiq hiqVar2 = gnlVar.g;
                        gnlVar.h = gnlVar.f(i, hiqVar, (hiqVar2 == null || !hiqVar2.equals(hiqVar)) ? hiqVar.c : true);
                        gnlVar.g = hiqVar;
                        gnlVar.h();
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                boolean z9 = this.a;
                defpackage.kpt kptVar = (defpackage.kpt) this.b;
                kptVar.o = z9;
                kptVar.w();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar = defpackage.lvx.a;
                defpackage.yqm yqmVar2 = defpackage.lvx.a;
                boolean Z = yqmVar2.l().Z();
                ?? r6 = this.b;
                if (Z) {
                    ((defpackage.yqj) yqmVar2.l().ai((char) 4330)).y("updateImConversation: %s", j$.util.Objects.toString((java.lang.Object) r6));
                }
                defpackage.wfp.c();
                moi moiVar = (moi) r6;
                lxg lxgVarA = defpackage.lxy.o().a(moiVar.j, moiVar.k);
                if ((lxgVarA instanceof lxg) && lxgVarA.h((mog) r6)) {
                    return;
                }
                if (this.a && ((lxi) r6).m()) {
                    z = true;
                }
                moiVar.r = z;
                int i2 = moiVar.q;
                java.lang.String str = moiVar.l;
                defpackage.zbd zbdVar = defpackage.zbd.KA;
                if (i2 == 0) {
                    zbdVar = defpackage.zbd.KB;
                } else if (i2 == 1) {
                    zbdVar = defpackage.zbd.KC;
                } else if (i2 == 2) {
                    zbdVar = defpackage.zbd.KD;
                } else if (i2 == 3) {
                    zbdVar = defpackage.zbd.KE;
                } else if (i2 == 4) {
                    zbdVar = defpackage.zbd.KF;
                } else if (i2 == 5) {
                    zbdVar = defpackage.zbd.KG;
                }
                defpackage.oim oimVarU = defpackage.omf.u();
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PROJECTION_NOTIFICATION, zbdVar);
                rrvVarH.p(new android.content.ComponentName(str, ""));
                oimVarU.F(rrvVarH.l());
                lxg lxgVar = (lxg) r6;
                if (!lwv.a().c(lxgVar.b())) {
                    defpackage.lvx.f(lxgVar);
                    return;
                } else {
                    ((defpackage.yqj) yqmVar2.l().ai((char) 4328)).u("Trying to get Smart Actions");
                    lwv.a().d(lxgVar.a, (int) defpackage.acul.d()).eM(defpackage.ler.c(), new defpackage.lso(r6, i));
                    return;
                }
            case 9:
                defpackage.pbn pbnVar = ((defpackage.pbm) this.b).b;
                pbnVar.j = this.a;
                defpackage.pbh pbhVar = pbnVar.h;
                pce pceVar = pbnVar.g;
                defpackage.pbk pbkVar = (defpackage.pbk) pbhVar;
                pbkVar.c = pbnVar.d;
                pbkVar.b = pceVar;
                pbkVar.g.postDelayed(pbkVar.i, 25000L);
                pbkVar.f.execute(new osa(pbhVar, 17));
                return;
            case 10:
                java.lang.Object obj3 = this.b;
                phn phnVar = (phn) obj3;
                defpackage.ysr.bk(((phj) phnVar.an.u()).a(), "Start request remained scheduled after WPP became not ready to send");
                if (phn.ab()) {
                    int i3 = ((up) phnVar.at.u()).a;
                    boolean z10 = i3 == 1;
                    if (i3 == 0) {
                        throw null;
                    }
                    defpackage.ysr.bk(z10, "Start request remained scheduled after user intention was unset");
                } else {
                    defpackage.ysr.bk(((java.lang.Boolean) phnVar.am.u()).booleanValue(), "Start request remained scheduled after user intention set false");
                }
                boolean z11 = this.a;
                defpackage.ysr.bk(z11 || (phnVar.ao.u() instanceof phe), "Start request remained scheduled when start request journey not from MD");
                phnVar.p();
                if (z11) {
                    phnVar.ao.v(new phe(new defpackage.gkc(phnVar.Q)));
                    phnVar.w(defpackage.yyn.WIRELESS_MD_PROJECTION_REQUEST_LOOP_INITIATED);
                }
                defpackage.yqm yqmVar3 = phn.a;
                ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 6595)).u("User intends to start projection. Sending start request.");
                ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 6632)).u("Send WifiStartRequest.");
                phnVar.w(defpackage.yyn.WIRELESS_WIFI_MD_PROJECTION_REQUESTED);
                peg pegVar = phnVar.z;
                java.lang.Object obj4 = phnVar.L;
                pegVar.c(obj4);
                pegVar.f(new pgg(obj3, 9), obj4, phnVar.K.toMillis());
                if (defpackage.adax.ab()) {
                    defpackage.abor aborVarN = xqy.a.n();
                    aborVarN.t();
                    xqy xqyVar = aborVarN.b;
                    xqyVar.e = 2;
                    xqyVar.b = 4 | xqyVar.b;
                    xqyVarQ = aborVarN.q();
                } else {
                    xqyVarQ = xqy.a;
                }
                pev pevVar = phnVar.S;
                xqs xqsVar = xqs.a;
                phnVar.H(pevVar, xqyVarQ, xqsVar);
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    phnVar.H(phnVar.T, xqyVarQ, xqsVar);
                }
                phnVar.J(defpackage.pbd.WIFI_PROJECTION_RESTART_REQUESTED);
                return;
            case 11:
                boolean z12 = this.a;
                java.lang.Object obj5 = this.b;
                if (z12) {
                    com.google.android.gearhead.appdecor.CarUiEntry.-$$Nest$fgetinteractionModerator(((qgk) obj5).a).k(gsv.j, defpackage.zbe.DRAWER);
                    return;
                } else {
                    com.google.android.gearhead.appdecor.CarUiEntry.-$$Nest$fgetinteractionModerator(((qgk) obj5).a).k(gsv.k, defpackage.zbe.DRAWER);
                    return;
                }
            case 12:
                rgm rgmVar = (rgm) this.b;
                int iA = rgmVar.a();
                int andSet = rgmVar.e.getAndSet(iA);
                defpackage.ypu ypuVarAi = rgm.a.f().ai(7996);
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(iA);
                defpackage.zke zkeVar = defpackage.zke.a;
                defpackage.zkf zkfVar = new defpackage.zkf(zkeVar, numValueOf);
                defpackage.zkf zkfVar2 = new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(andSet));
                boolean z13 = this.a;
                ypuVarAi.R("maybeNotifyFocusStackChange: currentFocusGrant %s, oldFocusGrant %s, forceNotify: %s", zkfVar, zkfVar2, new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(z13)));
                if (z13 || iA != andSet) {
                    java.lang.Object obj6 = rgmVar.f.a;
                    android.os.Handler handler = ((rgl) obj6).c;
                    if (handler != null) {
                        handler.post(new defpackage.qth(obj6, 16));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                java.util.Iterator it = ((defpackage.sax) this.b).f.iterator();
                while (it.hasNext()) {
                    ((sav) it.next()).i(this.a);
                }
                return;
            case 14:
                ((twv) this.b).b(this.a);
                return;
            default:
                if (this.a) {
                    adun adunVar = ((aduk) this.b).a;
                    adunVar.p = true;
                    if (adunVar.l > 0) {
                        defpackage.xzg xzgVar = adunVar.o;
                        xzgVar.d();
                        xzgVar.e();
                    }
                }
                ((aduk) this.b).a.q = false;
                return;
        }
    }

    public jhc(java.lang.Object obj, boolean z, int i, byte[] bArr) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }
}
