package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lto implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lto(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v50, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v57, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v58, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v61, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v62, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v64, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v67, types: [bwx, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        defpackage.eqp eqpVarR;
        android.app.WallpaperColors wallpaperColors = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.eqp eqpVar = (defpackage.eqp) obj;
                j$.time.Duration duration = defpackage.ltu.a;
                eqpVar.getClass();
                defpackage.led ledVar = defpackage.lee.a;
                int i = true != ledVar.a().b() ? 2131231793 : 2131231795;
                java.lang.String packageName = defpackage.mkp.a.c.getPackageName();
                packageName.getClass();
                packageName.getClass();
                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconR = com.google.android.apps.auto.components.graphics.icon.GhIcon.r(packageName, i);
                int i2 = true != ledVar.a().b() ? 2131231790 : 2131231792;
                java.lang.String packageName2 = defpackage.mkp.a.c.getPackageName();
                packageName2.getClass();
                packageName2.getClass();
                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconR2 = com.google.android.apps.auto.components.graphics.icon.GhIcon.r(packageName2, i2);
                int i3 = true != ledVar.a().b() ? 2131231764 : 2131231765;
                java.lang.String packageName3 = defpackage.mkp.a.c.getPackageName();
                packageName3.getClass();
                packageName3.getClass();
                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconR3 = com.google.android.apps.auto.components.graphics.icon.GhIcon.r(packageName3, i3);
                int i4 = true != ledVar.a().b() ? 2131231672 : 2131231673;
                java.lang.String packageName4 = defpackage.mkp.a.c.getPackageName();
                packageName4.getClass();
                packageName4.getClass();
                return new defpackage.oln(eqpVar, (defpackage.zbe) this.a, ghIconR, ghIconR2, ghIconR3, com.google.android.apps.auto.components.graphics.icon.GhIcon.r(packageName4, i4), defpackage.kja.a());
            case 1:
                return defpackage.tcu.v((defpackage.eqp) this.a.invoke(obj), new defpackage.lra(obj, 7));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                componentName.getClass();
                boolean zF = defpackage.afga.f(componentName, defpackage.mkt.G);
                java.lang.Object obj2 = this.a;
                return zF ? new lty((defpackage.eqp) obj2) : new ltl((defpackage.eqp) obj2);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                java.lang.Object obj3 = this.a;
                if (iIntValue != 6) {
                    eqpVarR = defpackage.tcu.d;
                } else if (((defpackage.afgq) obj3).a) {
                    eqpVarR = defpackage.tcu.c;
                } else {
                    defpackage.gkc gkcVar = new defpackage.gkc((defpackage.xzo) defpackage.ojm.a().b);
                    defpackage.afdo afdoVar = defpackage.tcu.a;
                    eqpVarR = defpackage.tcu.r(new defpackage.eqs(gkcVar), defpackage.ltu.b);
                }
                ((defpackage.afgq) obj3).a = false;
                return eqpVarR;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.ksh kshVar = (defpackage.ksh) obj;
                com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton carButton = (com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton) this.a;
                android.content.Context context = carButton.getContext();
                defpackage.kry kryVar = defpackage.kry.a;
                context.getClass();
                kshVar.getClass();
                int iB = kryVar.b(context, kshVar);
                int iB2 = defpackage.kry.v.b(context, kshVar);
                carButton.f.b(new defpackage.ckd(((long) iB) << 32));
                carButton.e.b(new defpackage.ckd(((long) iB2) << 32));
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new mua((defpackage.muc) this.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.mul((defpackage.mun) this.a);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj4 = this.a;
                if (zBooleanValue) {
                    defpackage.xzg xzgVar = ((defpackage.nfn) obj4).c;
                    if (!xzgVar.a) {
                        xzgVar.e();
                    }
                } else {
                    defpackage.xzg xzgVar2 = ((defpackage.nfn) obj4).c;
                    if (xzgVar2.a) {
                        xzgVar2.f();
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return (defpackage.mqj) ((java.util.Map) obj).get(this.a);
            case 9:
                if (!((java.lang.Boolean) obj).booleanValue() || android.os.Build.VERSION.SDK_INT < 30 || defpackage.kjl.e(defpackage.kiv.a().b(), defpackage.acyc.I())) {
                    defpackage.afdo afdoVar2 = defpackage.tcu.a;
                    return new defpackage.eqs(null);
                }
                java.lang.Object obj5 = this.a;
                aizc aizcVar = new aizc(new defpackage.dnf((defpackage.ngf) obj5, (defpackage.afdk) null, 16));
                defpackage.mkq mkqVar = defpackage.mks.a;
                return defpackage.tcu.u(defpackage.dzg.c(aigs.a(new defpackage.hcq(aigs.a(aizcVar, mkqVar.e()), obj5, 9), mkqVar.b()), defpackage.afdp.a, 5000L), null);
            case 10:
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                java.lang.Object obj6 = this.a;
                if (bitmap != null) {
                    return defpackage.duu.b((1 & 1) != 0 ? defpackage.afdp.a : null, (1 & 2) != 0 ? 5000L : 0L, new dxi((defpackage.ngf) obj6, bitmap, (defpackage.afdk) null, 6));
                }
                android.content.SharedPreferences sharedPreferences = ((defpackage.ngf) obj6).d;
                if (sharedPreferences.contains("primary")) {
                    android.graphics.Color colorM = ep$.ExternalSyntheticApiModelOutline1.m(sharedPreferences.getInt("primary", 0));
                    colorM.getClass();
                    int i5 = sharedPreferences.getInt("secondary", 0);
                    android.graphics.Color colorM2 = i5 == 0 ? null : ep$.ExternalSyntheticApiModelOutline1.m(i5);
                    int i6 = sharedPreferences.getInt("tertiary", 0);
                    android.graphics.Color colorM3 = i6 != 0 ? ep$.ExternalSyntheticApiModelOutline1.m(i6) : null;
                    wallpaperColors = android.os.Build.VERSION.SDK_INT >= 31 ? new android.app.WallpaperColors(colorM, colorM2, colorM3, sharedPreferences.getInt("colorHints", 0)) : new android.app.WallpaperColors(colorM, colorM2, colorM3);
                }
                defpackage.afdo afdoVar3 = defpackage.tcu.a;
                return new defpackage.eqs(wallpaperColors);
            case 11:
                defpackage.nmu nmuVar = (defpackage.nmu) obj;
                nmuVar.getClass();
                defpackage.lhe lheVarC = ((defpackage.nik) this.a).c(nmuVar);
                if (lheVarC != null) {
                    return lheVarC;
                }
                throw new java.lang.IllegalStateException("Required value was null.");
            case 12:
                defpackage.yqm yqmVar = defpackage.nif.a;
                ((defpackage.ese) obj).getClass();
                if (((java.lang.Boolean) this.a.a()).booleanValue()) {
                    defpackage.ngr.a().c(ngu.k);
                }
                return new defpackage.nie();
            case 13:
                defpackage.cja cjaVar = (defpackage.cja) obj;
                defpackage.yqm yqmVar2 = defpackage.nif.a;
                cjaVar.getClass();
                if (cjaVar.b()) {
                    ?? r8 = this.a;
                    defpackage.nif.a.l().u("HomeButton focused");
                    r8.b(defpackage.nje.b);
                }
                return defpackage.afbk.a;
            case 14:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                ?? r9 = this.a;
                defpackage.yqm yqmVar3 = defpackage.nif.a;
                r9.b(java.lang.Boolean.valueOf(zBooleanValue2));
                return defpackage.afbk.a;
            case 15:
                defpackage.cja cjaVar2 = (defpackage.cja) obj;
                defpackage.yqm yqmVar4 = defpackage.nif.a;
                cjaVar2.getClass();
                if (cjaVar2.b()) {
                    ?? r10 = this.a;
                    defpackage.nif.a.l().u("NotificationCenter focused");
                    r10.b(defpackage.nje.i);
                }
                return defpackage.afbk.a;
            case 16:
                defpackage.cja cjaVar3 = (defpackage.cja) obj;
                defpackage.yqm yqmVar5 = defpackage.nif.a;
                cjaVar3.getClass();
                if (cjaVar3.b() || cjaVar3.a()) {
                    ?? r11 = this.a;
                    defpackage.nif.a.l().u("RailWidget area focused");
                    r11.b(defpackage.nje.d);
                }
                return defpackage.afbk.a;
            case 17:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                defpackage.yqm yqmVar6 = defpackage.nif.a;
                this.a.invoke(bool);
                return defpackage.afbk.a;
            case 18:
                defpackage.cja cjaVar4 = (defpackage.cja) obj;
                defpackage.yqm yqmVar7 = defpackage.nif.a;
                cjaVar4.getClass();
                if (cjaVar4.b()) {
                    ?? r12 = this.a;
                    defpackage.nif.a.l().u("AssistantButton focused");
                    r12.b(defpackage.nje.c);
                }
                return defpackage.afbk.a;
            case 19:
                defpackage.njm njmVar = (defpackage.njm) this.a;
                njmVar.b.l().R("currentButtonOption:(%s) isDashboardShowing:(%s) isDashboardSupported:(%s)", (defpackage.njl) obj, njmVar.a.e(), njmVar.c.e());
                return obj;
            default:
                defpackage.njm njmVar2 = (defpackage.njm) this.a;
                njmVar2.b.l().R("currentButtonOption:(%s) isDashboardShowing:(%s) isDashboardSupported:(%s)", (defpackage.njk) obj, njmVar2.a.e(), njmVar2.c.e());
                return obj;
        }
    }

    public lto(defpackage.njm njmVar, int i) {
        this.b = i;
        this.a = njmVar;
    }
}
