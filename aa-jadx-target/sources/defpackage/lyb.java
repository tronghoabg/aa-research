package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lyb implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ lyb(androidx.car.app.model.CarIcon carIcon, ux uxVar, java.lang.Boolean bool, int i) {
        this.d = i;
        this.c = carIcon;
        this.a = uxVar;
        this.b = bool;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [eqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.Object, odl] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, lkj] */
    /* JADX WARN: Type inference failed for: r11v46, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v48, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v52, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v54, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v56, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v59, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, ux] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, lqa] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, um] */
    /* JADX WARN: Type inference failed for: r5v3, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [affg, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() throws afbj, android.app.PendingIntent.CanceledException {
        tif tifVar = null;
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj = this.b;
                java.lang.Object obj2 = this.a;
                if (obj2 != null) {
                    ((lyc) obj).e.invoke(obj2);
                } else {
                    java.lang.Object obj3 = this.c;
                    defpackage.lxy.e();
                    lyc lycVar = (lyc) obj;
                    defpackage.lxy.g(defpackage.zbe.MESSAGING_APP, defpackage.zbd.ar, lycVar.b, 0L);
                    defpackage.affc affcVar = lycVar.d;
                    obj3.getClass();
                    affcVar.invoke(obj3);
                }
                return defpackage.afbk.a;
            case 1:
                java.lang.Object obj4 = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) ((lok) this.b).e.e();
                java.lang.Object obj5 = this.a;
                if (obj4 == null) {
                    obj4 = obj5;
                }
                this.c.e(((long) defpackage.onn.a((com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj4)) + 10000);
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                aack aackVar = (aack) ((defpackage.afgv) this.a).a;
                if (aackVar != null) {
                    java.lang.Object obj6 = ((defpackage.afgv) this.b).a;
                    if (obj6 == null) {
                        defpackage.afga.d("contactsTabModel");
                    } else {
                        tifVar = (tif) obj6;
                    }
                    aackVar.n(tifVar.e);
                }
                ((defpackage.afgq) this.c).a = true;
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ?? r0 = this.c;
                ((defpackage.nbg) this.b).c(this.a, r0);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.afar afarVar = ndz.a;
                defpackage.mwr.b(defpackage.zbd.HE, (java.lang.String) this.b);
                ((neg) this.a).a();
                ((android.app.PendingIntent) this.c).send();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.afar afarVar2 = ndz.a;
                defpackage.mwr.b(defpackage.zbd.HF, (java.lang.String) this.b);
                ((neg) this.a).a();
                ((android.app.PendingIntent) this.c).send();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                nmv nmvVar = (nmv) this.c;
                defpackage.afja<?> afjaVar = defpackage.nik.a[0];
                java.lang.Object obj7 = this.a;
                defpackage.nik nikVar = (defpackage.nik) obj7;
                defpackage.noz nozVar = (defpackage.noz) nikVar.d.getValue(obj7, afjaVar);
                defpackage.bzc bzcVar = (defpackage.bzc) ((defpackage.lhe) this.b).a;
                if (bzcVar.b == 0) {
                    throw new java.lang.IllegalStateException("TooltipRequester is not attached");
                }
                odj odjVarA = odn.b().a(nozVar, ((defpackage.odw) bzcVar.b()).e);
                odjVarA.f = new njr((android.support.v4.app.Fragment) obj7, 1);
                nikVar.c = nmvVar.b(odjVarA);
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.njk njkVar = defpackage.njk.DASHBOARD;
                defpackage.njl njlVar = defpackage.njl.DASHBOARD;
                int iOrdinal = ((defpackage.njk) this.a).ordinal();
                ?? r1 = this.c;
                java.lang.Object obj8 = this.b;
                if (iOrdinal == 0) {
                    ((defpackage.nkp) obj8).m(((java.lang.Number) r1.a()).intValue());
                } else {
                    if (iOrdinal != 1) {
                        throw new defpackage.afas();
                    }
                    ((defpackage.nkp) obj8).n(((java.lang.Number) r1.a()).intValue());
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.njk njkVar2 = defpackage.njk.DASHBOARD;
                defpackage.njl njlVar2 = defpackage.njl.DASHBOARD;
                int iOrdinal2 = ((defpackage.njl) this.a).ordinal();
                ?? r2 = this.c;
                java.lang.Object obj9 = this.b;
                if (iOrdinal2 == 0) {
                    ((defpackage.nkp) obj9).m(((java.lang.Number) r2.a()).intValue());
                } else {
                    if (iOrdinal2 != 1) {
                        throw new defpackage.afas();
                    }
                    ((defpackage.nkp) obj9).n(((java.lang.Number) r2.a()).intValue());
                }
                return defpackage.afbk.a;
            case 9:
                boolean zK = defpackage.nte.c().b().K();
                java.lang.Object obj10 = this.c;
                if (zK && defpackage.ler.a().i(defpackage.mpr.b((android.content.ComponentName) obj10))) {
                    defpackage.muj.h.a().o(true);
                }
                java.lang.Object obj11 = this.a;
                defpackage.nye.b().d();
                defpackage.nkj.t();
                defpackage.nkj.p(defpackage.nkj.q((defpackage.nkf) obj11, false), (android.content.ComponentName) obj10);
                return defpackage.afbk.a;
            case 10:
                defpackage.muj.h.a().x();
                defpackage.nye.b().d();
                defpackage.nkj.t();
                defpackage.nkj.p(defpackage.nkj.q((defpackage.nkf) this.a, false), (android.content.ComponentName) this.c);
                return defpackage.afbk.a;
            case 11:
                ahoc.d((aiuw) this.b, (defpackage.afdo) null, 0, new defpackage.nle((defpackage.affg) this.a, (java.lang.Integer) this.c, (defpackage.afdk) null, 2), 3);
                return defpackage.afbk.a;
            case 12:
                ahoc.d((aiuw) this.b, (defpackage.afdo) null, 0, new defpackage.nle((defpackage.affg) this.a, (java.lang.Integer) this.c, (defpackage.afdk) null, 3, (byte[]) null), 3);
                return defpackage.afbk.a;
            case 13:
                ?? r3 = this.b;
                defpackage.yqm yqmVar = nls.a;
                ahoc.d((aiuw) r3, (defpackage.afdo) null, 0, new defpackage.nle((defpackage.affg) this.a, (java.lang.Integer) this.c, (defpackage.afdk) null, 4, (char[]) null), 3);
                return defpackage.afbk.a;
            case 14:
                ?? r4 = this.b;
                defpackage.yqm yqmVar2 = nls.a;
                ahoc.d((aiuw) r4, (defpackage.afdo) null, 0, new defpackage.nle((defpackage.affg) this.a, (java.lang.Integer) this.c, (defpackage.afdk) null, 5, (short[]) null), 3);
                return defpackage.afbk.a;
            case 15:
                ((defpackage.nxj) this.c).a();
                this.b.invoke();
                this.a.run();
                return defpackage.afbk.a;
            case 16:
                if (defpackage.tna.aq(this.a).size() >= defpackage.leh.a.a().a()) {
                    this.c.b(java.lang.Boolean.valueOf(true));
                } else {
                    this.b.invoke();
                }
                return defpackage.afbk.a;
            case 17:
                java.lang.Object obj12 = this.b;
                return new tji((androidx.car.app.model.CarIcon) this.c, (ux) this.a, (java.lang.Boolean) obj12);
            case 18:
                return new tjo((java.lang.CharSequence) this.b, sub.u((defpackage.bys) this.a), (um) this.c);
            default:
                ajnn ajnnVar = ((ajii) this.a).c;
                ajnnVar.getClass();
                return ajnnVar.a(((ajit) this.b).a(), ((ajib) this.c).h.b);
        }
    }

    public /* synthetic */ lyb(java.lang.CharSequence charSequence, um umVar, defpackage.bys bysVar, int i) {
        this.d = i;
        this.b = charSequence;
        this.c = umVar;
        this.a = bysVar;
    }

    public /* synthetic */ lyb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ lyb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ lyb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ lyb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
