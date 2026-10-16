package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lyi implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lyi(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x02b9  */
    /* JADX WARN: Type inference failed for: r0v108, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v110, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v113, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lun] */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [eqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v74, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v79, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v43, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [dlo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v86, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z;
        int i = 13;
        int i2 = 0;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                tif tifVar = (tif) obj;
                if (tifVar != null) {
                    defpackage.lvi.a().b();
                    java.lang.Object obj2 = tifVar.d;
                    defpackage.zbd zbdVar = defpackage.zbd.nv;
                    if (obj2 instanceof lyf) {
                        java.lang.Object obj3 = this.a;
                        zbdVar = defpackage.zbd.nu;
                        defpackage.lvi.a().c((java.lang.String) obj3);
                    }
                    ?? r0 = this.b;
                    defpackage.lxy.e();
                    defpackage.lxy.g(defpackage.zbe.MESSAGING_APP, zbdVar, r0.e().a, 0L);
                }
                return defpackage.afbk.a;
            case 1:
                defpackage.ygw ygwVar = (defpackage.ygw) obj;
                ygwVar.getClass();
                qs qsVar = ((rb) this.b).a;
                qsVar.getClass();
                return lye.a(qsVar, ygwVar, ((lyg) this.a).a, true, (java.util.Map) null);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.List<kzy> list = (java.util.List) obj;
                list.getClass();
                qs qsVar2 = ((rb) this.b).a;
                qsVar2.getClass();
                androidx.car.app.model.CarIcon carIconE = tim.e(qsVar2, 2131233095);
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
                for (kzy kzyVar : list) {
                    vk vkVar = new vk();
                    vkVar.i((java.lang.CharSequence) kzyVar.b);
                    java.lang.Object obj4 = kzyVar.a;
                    if (obj4 != null) {
                        vkVar.e(new androidx.car.app.model.CarIcon(new defpackage.to((androidx.core.graphics.drawable.IconCompat) obj4)), 2);
                    }
                    vkVar.g(new khi(kzyVar.c, 16));
                    java.lang.Object obj5 = kzyVar.d;
                    if (obj5 != null) {
                        tb tbVar = new tb();
                        tbVar.d(new khi(obj5, 17));
                        tbVar.c(carIconE);
                        vkVar.b(tbVar.a());
                    }
                    arrayList.add(vkVar.a());
                }
                ul ulVar = new ul();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ulVar.b((androidx.car.app.model.Row) it.next());
                }
                java.lang.Object obj6 = this.a;
                uo uoVar = new uo();
                uf ufVar = new uf();
                ufVar.e((java.lang.CharSequence) ((defpackage.kez) obj6).c);
                ufVar.c(new tb(androidx.car.app.model.Action.BACK).a());
                uoVar.d(ufVar.a());
                uoVar.f(ulVar.a());
                return uoVar.a();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                tie tieVar = (tie) obj;
                tieVar.getClass();
                android.content.Context context = (android.content.Context) this.b;
                return new mff(context, defpackage.tis.e(64, context), (kra) this.a, new defpackage.lgy(tieVar, 19));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                tif tifVar2 = (tif) obj;
                if (tifVar2 != null) {
                    ?? r2 = this.a;
                    ?? r1 = this.b;
                    r1.getClass();
                    android.content.SharedPreferences.Editor editorEdit = r1.edit();
                    editorEdit.getClass();
                    editorEdit.putString("saved_node_{com.google.android.projection.gearhead/com.google.android.projection.gearhead.telecom.TelecomService}", tifVar2.a);
                    editorEdit.apply();
                    defpackage.zbd zbdVar2 = (defpackage.zbd) r2.get(tifVar2);
                    if (zbdVar2 != null) {
                        defpackage.omf.u().o(defpackage.zbe.PHONE_BROWSE_ROOT, zbdVar2);
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                qs qsVar3 = ((rb) this.b).a;
                java.util.List<kzy> list2 = (java.util.List) obj;
                qsVar3.getClass();
                defpackage.llt lltVar = new defpackage.llt(i);
                ((defpackage.ype) mes.a.e().ai(4813)).u("Creating contacts template");
                if (list2 == null) {
                    vw vwVar = new vw();
                    vwVar.c();
                    return vwVar.a();
                }
                vw vwVar2 = new vw();
                defpackage.afct afctVar = new defpackage.afct(10);
                vl vlVar = new vl();
                int color = qsVar3.getColor(2131100621);
                int color2 = qsVar3.getColor(2131100624);
                vk vkVar2 = new vk();
                vkVar2.i(qsVar3.getString(2132083155));
                vkVar2.e(tim.d(qsVar3, 2131231000, new mfj(color, color2, 1)), 2);
                vkVar2.g(new khi(lltVar, 18));
                vkVar2.n = false;
                vlVar.b(vkVar2.a());
                for (kzy kzyVar2 : list2) {
                    vk vkVar3 = new vk();
                    vkVar3.i((java.lang.CharSequence) kzyVar2.b);
                    vkVar3.e(tim.c((androidx.core.graphics.drawable.IconCompat) kzyVar2.a), 2);
                    vkVar3.g(new khi(kzyVar2.d, 19));
                    java.lang.Object obj7 = kzyVar2.c;
                    if (obj7 != null) {
                        tb tbVar2 = new tb();
                        tbVar2.d(new khi(obj7, 20));
                        tbVar2.c(tim.e(qsVar3, 2131231609));
                        vkVar3.b(tbVar2.a());
                    } else {
                        vkVar3.k = true;
                    }
                    vlVar.b(vkVar3.a());
                }
                afctVar.add(vlVar.a());
                vwVar2.a = afctVar.f();
                vwVar2.b();
                vwVar2.d();
                uf ufVar2 = new uf();
                ufVar2.c(androidx.car.app.model.Action.BACK);
                ufVar2.e(qsVar3.getString(2132083273));
                vwVar2.c = ufVar2.a();
                return vwVar2.a();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.List<kzy> list3 = (java.util.List) obj;
                qs qsVar4 = ((rb) this.b).a;
                qsVar4.getClass();
                defpackage.llt lltVar2 = new defpackage.llt(14);
                ((defpackage.ype) meu.a.e().ai(4814)).u("Creating contacts template");
                if (list3 == null) {
                    return new com.android.car.libraries.apphost.internal.model.GoogleListTemplate(true, (androidx.car.app.model.ItemList) null, (java.util.List) null, (java.util.List) null, (androidx.car.app.model.Header) null, 30, (defpackage.affu) null);
                }
                ul ulVar2 = new ul();
                vk vkVar4 = new vk();
                vkVar4.i(qsVar4.getString(2132083155));
                vkVar4.e(tim.c(new tkx(qsVar4, new tkz(qsVar4, 0), defpackage.tis.e(64, qsVar4), defpackage.tis.e(8, qsVar4)).b(2131231708)), 2);
                vkVar4.g(new met(lltVar2, 2));
                ulVar2.b(vkVar4.a());
                for (kzy kzyVar3 : list3) {
                    vk vkVar5 = new vk();
                    vkVar5.i((java.lang.CharSequence) kzyVar3.b);
                    vkVar5.e(tim.c((androidx.core.graphics.drawable.IconCompat) kzyVar3.a), 2);
                    vkVar5.g(new met(kzyVar3.d, 1));
                    java.lang.Object obj8 = kzyVar3.c;
                    if (obj8 == null) {
                        vkVar5.k = true;
                    } else {
                        tb tbVar3 = new tb();
                        tbVar3.d(new met(obj8, 0));
                        tbVar3.c(tim.e(qsVar4, 2131231609));
                        vkVar5.b(tbVar3.a());
                    }
                    ulVar2.b(vkVar5.a());
                }
                return new com.android.car.libraries.apphost.internal.model.GoogleListTemplate(false, ulVar2.a(), (java.util.List) null, (java.util.List) null, (androidx.car.app.model.Header) null, 29, (defpackage.affu) null);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                int i3 = defpackage.mun.e;
                defpackage.sax saxVar = (defpackage.sax) defpackage.khg.u(new defpackage.wde("GH.DashWinController", defpackage.zbe.DASHBOARD, defpackage.zbd.r, "Unable to get car window manager", new java.lang.Object[0]), new defpackage.muk(this.a, i2));
                if (saxVar != null && saxVar.k()) {
                    java.lang.Object obj9 = this.b;
                    bool.getClass();
                    boolean zBooleanValue = bool.booleanValue();
                    defpackage.mul mulVar = (defpackage.mul) obj9;
                    android.content.SharedPreferences sharedPreferences = mulVar.g;
                    defpackage.mun munVar = mulVar.h;
                    android.content.SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    editorEdit2.getClass();
                    munVar.b.l().y("Full-screen maps: %b", bool);
                    editorEdit2.putBoolean("DashWinController_IsFullScreenMaps", zBooleanValue);
                    editorEdit2.apply();
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cxn cxnVar = (defpackage.cxn) obj;
                defpackage.yqm yqmVar = defpackage.myx.a;
                cxnVar.getClass();
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.b;
                if (bitmap.isRecycled()) {
                    ((defpackage.yqj) defpackage.myx.a.h()).u("Media player bitmap recycled while in use");
                    defpackage.omf.u().f(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.DASHBOARD, defpackage.zbd.Hv));
                    return defpackage.afbk.a;
                }
                java.lang.Object obj10 = this.a;
                defpackage.cjr cjrVar = new defpackage.cjr(bitmap);
                defpackage.csr csrVar = defpackage.csq.a;
                if (defpackage.afga.f(obj10, csrVar)) {
                    float fC = cjrVar.c();
                    float fB = cjrVar.b();
                    long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fC);
                    long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fB);
                    long jO = cxnVar.o();
                    long j = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L);
                    int i4 = (int) (jO >> 32);
                    float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (csrVar.a(j, jO) >> 32));
                    float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i4) / fIntBitsToFloat;
                    int i5 = (int) (jO & 4294967295L);
                    float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat(i5) / fIntBitsToFloat;
                    defpackage.dai.V(cxnVar, cjrVar, (((long) defpackage.afhi.k((java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - fIntBitsToFloat3) / 2.0f)) & 4294967295L) | (((long) defpackage.afhi.k((java.lang.Float.intBitsToFloat((int) (j >> 32)) - fIntBitsToFloat2) / 2.0f)) << 32), (((long) defpackage.afhi.k(fIntBitsToFloat2)) << 32) | (((long) defpackage.afhi.k(fIntBitsToFloat3)) & 4294967295L), (((long) defpackage.afhi.k(java.lang.Float.intBitsToFloat(i4))) << 32) | (((long) defpackage.afhi.k(java.lang.Float.intBitsToFloat(i5))) & 4294967295L), 0.0f, null, 0, 1000);
                } else {
                    defpackage.dai.W(cxnVar, cjrVar, 0L, 0.0f, null, 0, 62);
                }
                return defpackage.afbk.a;
            case 9:
                defpackage.yqm yqmVar2 = defpackage.myx.a;
                ((defpackage.bxi) obj).getClass();
                ?? r3 = this.b;
                defpackage.eqf myvVar = new myv((defpackage.bwx) r3);
                ?? r4 = this.a;
                r4.getLifecycle().c(myvVar);
                return new myw((defpackage.eqg) r4, myvVar, (defpackage.bwx) r3, 0);
            case 10:
                defpackage.ctc ctcVar = (defpackage.ctc) obj;
                defpackage.yqm yqmVar3 = defpackage.myx.a;
                ctcVar.getClass();
                if (ctcVar.t()) {
                    ?? r5 = this.a;
                    defpackage.cjj cjjVarF = defpackage.csc.f(ctcVar, true);
                    z = java.lang.Math.min(java.lang.Math.abs(cjjVarF.d - cjjVarF.b), java.lang.Math.abs(cjjVarF.e - cjjVarF.c)) > r5.dI(64.0f);
                }
                this.b.b(java.lang.Boolean.valueOf(z));
                return defpackage.afbk.a;
            case 11:
                defpackage.chg chgVar = (defpackage.chg) obj;
                ?? r6 = this.a;
                ?? r7 = this.b;
                defpackage.yqm yqmVar4 = defpackage.myx.a;
                chgVar.getClass();
                return chgVar.q(new defpackage.mtb(new defpackage.ckw(defpackage.afga.ac(new defpackage.ckd(((defpackage.ckd) r7.a()).a), new defpackage.ckd(((defpackage.ckd) r6.a()).a)), (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (chgVar.n() & 4294967295L)) * 0.3f)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (chgVar.n() >> 32)) / 2.0f)) << 32), defpackage.cjl.b(chgVar.n()) * 0.7f), 7));
            case 12:
                j$.time.Duration duration = (j$.time.Duration) obj;
                duration.getClass();
                int millis = (int) duration.toMillis();
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) this.b;
                progressBar.setMax(millis);
                j$.time.Duration duration2 = (j$.time.Duration) ((com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment) this.a).c().m().e();
                progressBar.setProgress(duration2 != null ? (int) duration2.toMillis() : 0);
                return defpackage.afbk.a;
            case 13:
                java.lang.Integer num = (java.lang.Integer) obj;
                int i6 = com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment.b;
                java.lang.Object objJ = this.b;
                if (num != null) {
                    objJ = defpackage.tis.j(num.intValue());
                }
                ((com.google.android.material.card.MaterialCardView) this.a).f((android.content.res.ColorStateList) objJ);
                return defpackage.afbk.a;
            case 14:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                java.lang.Object obj11 = this.b;
                if (componentName != null) {
                    java.lang.Object obj12 = this.a;
                    android.view.View view = (android.view.View) obj11;
                    view.setFocusable(true);
                    view.setOnClickListener(new jmx(obj12, componentName, 13, (byte[]) null));
                    defpackage.oim oimVarU = defpackage.omf.u();
                    defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.DASHBOARD, defpackage.zbd.x);
                    rrvVarH.p(componentName);
                    oimVarU.F(rrvVarH.l());
                } else {
                    android.view.View view2 = (android.view.View) obj11;
                    view2.setOnClickListener(null);
                    view2.setFocusable(false);
                }
                return defpackage.afbk.a;
            case 15:
                defpackage.cuw cuwVar = (defpackage.cuw) obj;
                cuwVar.getClass();
                ?? r8 = this.b;
                defpackage.afct afctVar2 = (defpackage.afct) r8;
                int[] iArr = new int[afctVar2.b];
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(r8, 10));
                java.util.ListIterator listIterator = afctVar2.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList2.add(java.lang.Integer.valueOf(((defpackage.cux) listIterator.next()).b));
                }
                int[] iArrBj = defpackage.afga.bj(arrayList2);
                defpackage.ati.b(iArrBj, iArr, false);
                java.util.ListIterator listIterator2 = afctVar2.listIterator(0);
                int i7 = 0;
                while (listIterator2.hasNext()) {
                    cuwVar.r((defpackage.cux) listIterator2.next(), 0, iArr[i7], 0.0f);
                    i7++;
                }
                ?? r9 = this.a;
                if (r9 != 0) {
                    int iBK = defpackage.afga.bK(iArr) + defpackage.afga.bK(iArrBj);
                    java.util.Iterator it2 = r9.iterator();
                    while (it2.hasNext()) {
                        cuwVar.r((defpackage.cux) it2.next(), 0, iBK, 0.0f);
                    }
                }
                return defpackage.afbk.a;
            case 16:
                defpackage.afau afauVar = (defpackage.afau) obj;
                java.lang.Object obj13 = afauVar.a;
                defpackage.yqm yqmVar5 = com.google.android.apps.auto.components.system.dashboard.media.MediaSuggestionFragment.a;
                java.lang.Boolean bool2 = (java.lang.Boolean) obj13;
                java.lang.Boolean bool3 = (java.lang.Boolean) afauVar.b;
                java.lang.Object obj14 = this.b;
                obj14.getClass();
                float f = true != bool2.booleanValue() ? 0.0f : 1.0f;
                android.view.View view3 = (android.view.View) obj14;
                java.lang.Object tag = view3.getTag(2131429560);
                emv emvVar = tag instanceof emv ? (emv) tag : null;
                if (emvVar == null) {
                    emvVar = new emv(obj14, (defpackage.emu) this.a, f);
                    view3.setTag(2131429560, emvVar);
                }
                emw emwVar = emvVar.s;
                emwVar.c(1.0f);
                emwVar.e(50.0f);
                emvVar.k(f);
                ((emt) emvVar).p = 0.0f;
                ((emt) emvVar).o = 1.0f;
                if (!bool2.booleanValue() && defpackage.afga.f(bool3, java.lang.Boolean.TRUE)) {
                    defpackage.ebo.n().q();
                    defpackage.mwr.a(defpackage.zbd.Ht, null);
                }
                return defpackage.afbk.a;
            case 17:
                defpackage.yqm yqmVar6 = com.google.android.apps.auto.components.system.dashboard.media.MediaSuggestionFragment.a;
                fev fevVar = new fev();
                java.lang.Object obj15 = this.a;
                android.view.View view4 = (android.view.View) obj15;
                fevVar.J(view4);
                fgo.b((android.view.ViewGroup) this.b, fevVar);
                obj15.getClass();
                view4.setVisibility(true != ((java.lang.Boolean) obj).booleanValue() ? 4 : 0);
                return defpackage.afbk.a;
            case 18:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                defpackage.yqm yqmVar7 = defpackage.nif.a;
                this.b.b(java.lang.Boolean.valueOf(zBooleanValue2 && defpackage.tna.aq(this.a) != null));
                return defpackage.afbk.a;
            case 19:
                boolean zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                defpackage.yqm yqmVar8 = defpackage.nif.a;
                this.b.b(java.lang.Boolean.valueOf(zBooleanValue3 && defpackage.tna.aq(this.a) != null));
                return defpackage.afbk.a;
            default:
                defpackage.cim cimVar = (defpackage.cim) obj;
                ?? r10 = this.b;
                defpackage.yqm yqmVar9 = njd.a;
                cimVar.getClass();
                cimVar.a(((java.lang.Boolean) r10.a()).booleanValue() && !((java.lang.Boolean) this.a.a()).booleanValue());
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ lyi(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
