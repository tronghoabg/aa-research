package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mbx implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mbx(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:203:0x052c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0142  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [dzn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object, mkz] */
    /* JADX WARN: Type inference failed for: r12v42, types: [java.lang.Object, ngt] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        j$.util.Optional optionalOfNullable;
        tmg tmgVarG;
        defpackage.zbe zbeVar;
        defpackage.zbd zbdVar;
        defpackage.zbd zbdVar2;
        ngx ngxVar = null;
        boolean z = true;
        int i = 0;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj = this.a;
                java.lang.Object obj2 = ((defpackage.mca) obj).b;
                ?? r12 = this.b;
                synchronized (obj2) {
                    java.util.Iterator it = ((defpackage.mca) obj).e.iterator();
                    while (it.hasNext()) {
                        r12.a((defpackage.lxy) it.next());
                    }
                    break;
                }
                return;
            case 1:
                int i2 = defpackage.maz.a;
                while (true) {
                    ?? r0 = this.a;
                    if (i >= ((defpackage.ymx) r0).c) {
                        return;
                    }
                    ep$.ExternalSyntheticApiModelOutline1.m((android.app.NotificationManager) this.b, (java.lang.String) r0.get(i));
                    i++;
                }
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((com.google.android.apps.auto.components.preflight.phone.PreflightPhoneDataNoticeActivity) this.a).D((android.view.View) this.b);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((com.google.android.apps.auto.components.preflight.phone.PreflightPhoneDataNoticeActivity) this.a).D((android.view.View) this.b);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((com.google.android.apps.auto.components.preflight.phone.PreflightPhoneDataNoticeActivity) this.a).D((android.view.View) this.b);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar = defpackage.mib.a;
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(defpackage.nuz.b().e());
                mka mkaVar = ((mia) this.b).b;
                java.lang.String str = mkaVar.a;
                j$.util.Optional optionalFindAny = stream.filter(new defpackage.lpa(str, 20)).findAny();
                if (true == optionalFindAny.isPresent()) {
                    optionalFindAny = j$.util.Optional.ofNullable(((nuv) optionalFindAny.get()).c);
                }
                if (optionalFindAny.isEmpty()) {
                    ((defpackage.ype) ((defpackage.ype) mkb.a.g()).ai((char) 5043)).y("Interaction on a missing notification with a key[%s]", str);
                }
                mjz mjzVar = new mjz(mkaVar, (tms) this.a, 0);
                if (true == optionalFindAny.isPresent()) {
                    java.lang.Object obj3 = optionalFindAny.get();
                    java.lang.Object obj4 = mjzVar.a;
                    java.lang.Object obj5 = mjzVar.b;
                    nvh nvhVar = (nvh) obj3;
                    tms tmsVar = (tms) obj5;
                    int iOrdinal = tmsVar.ordinal();
                    if (iOrdinal == 1) {
                        optionalOfNullable = j$.util.Optional.ofNullable(nvhVar.c);
                    } else if (iOrdinal == 2) {
                        optionalOfNullable = mka.b(nvhVar.p);
                    } else if (iOrdinal == 3) {
                        optionalOfNullable = mka.b(nvhVar.q);
                    } else if (iOrdinal == 4) {
                        optionalOfNullable = mka.b(nvhVar.r);
                    } else {
                        if (iOrdinal != 5) {
                            throw new java.lang.IllegalArgumentException("Unexpected interaction type: ".concat(obj5.toString()));
                        }
                        optionalOfNullable = mka.b(nvhVar.s);
                    }
                    if (optionalOfNullable.isEmpty()) {
                        ((defpackage.ype) ((defpackage.ype) mkb.a.g()).ai(5042)).M("Missing [%s] intent on notification with a key[%s]", tmsVar.name(), ((mka) obj4).a);
                    }
                    optionalFindAny = optionalOfNullable;
                }
                if (true != optionalFindAny.isPresent()) {
                    return;
                }
                mka.a((android.app.PendingIntent) optionalFindAny.get());
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.wfp.b();
                defpackage.abor aborVarN = akhd.a.n();
                defpackage.yot it2 = ((defpackage.yhx) this.a).iterator();
                while (true) {
                    java.lang.Object obj6 = this.b;
                    if (!it2.hasNext()) {
                        akhd akhdVarQ = aborVarN.q();
                        defpackage.abor aborVarN2 = akhe.a.n();
                        aborVarN2.t();
                        akhe akheVar = aborVarN2.b;
                        akhdVarQ.getClass();
                        akheVar.c = akhdVarQ;
                        akheVar.b = 1;
                        ((defpackage.mib) obj6).e(aborVarN2.q(), akhdVarQ.b.size() + " apps");
                        return;
                    }
                    android.content.ComponentName componentNameA = ((defpackage.mqj) it2.next()).a();
                    mot motVar = new mot(((defpackage.mib) obj6).d, componentNameA);
                    android.graphics.drawable.Drawable drawableB = motVar.b();
                    drawableB.getClass();
                    defpackage.abor aborVarN3 = akhc.a.n();
                    java.lang.String strFlattenToString = componentNameA.flattenToString();
                    aborVarN3.t();
                    akhc akhcVar = aborVarN3.b;
                    strFlattenToString.getClass();
                    akhcVar.b |= 1;
                    akhcVar.c = strFlattenToString;
                    java.lang.String strC = motVar.c();
                    aborVarN3.t();
                    akhc akhcVar2 = aborVarN3.b;
                    strC.getClass();
                    akhcVar2.b |= 2;
                    akhcVar2.d = strC;
                    if (ep$.ExternalSyntheticApiModelOutline1.m(drawableB)) {
                        android.graphics.drawable.AdaptiveIconDrawable adaptiveIconDrawableM = ep$.ExternalSyntheticApiModelOutline1.m(drawableB);
                        if (ep$.ExternalSyntheticApiModelOutline1.m$1(adaptiveIconDrawableM) == null || ep$.ExternalSyntheticApiModelOutline1.m(adaptiveIconDrawableM) == null) {
                            defpackage.abor aborVarN4 = tmg.a.n();
                            aborVarN4.getClass();
                            defpackage.abnv abnvVarB = defpackage.tna.b(dtp.e(drawableB, 180, 180, 4));
                            aborVarN4.t();
                            tmg tmgVar = aborVarN4.b;
                            tmgVar.b = 1;
                            tmgVar.c = abnvVarB;
                            tmgVarG = defpackage.tna.g(aborVarN4);
                        } else {
                            defpackage.abor aborVarN5 = tmg.a.n();
                            aborVarN5.getClass();
                            defpackage.abor aborVarN6 = tmf.a.n();
                            aborVarN6.getClass();
                            android.graphics.drawable.Drawable drawableM$1 = ep$.ExternalSyntheticApiModelOutline1.m$1(adaptiveIconDrawableM);
                            drawableM$1.getClass();
                            defpackage.abnv abnvVarB2 = defpackage.tna.b(dtp.e(drawableM$1, 180, 180, 4));
                            aborVarN6.t();
                            aborVarN6.b.b = abnvVarB2;
                            android.graphics.drawable.Drawable drawableM = ep$.ExternalSyntheticApiModelOutline1.m(adaptiveIconDrawableM);
                            drawableM.getClass();
                            defpackage.abnv abnvVarB3 = defpackage.tna.b(dtp.e(drawableM, 180, 180, 4));
                            aborVarN6.t();
                            aborVarN6.b.c = abnvVarB3;
                            tmf tmfVarQ = aborVarN6.q();
                            tmfVarQ.getClass();
                            aborVarN5.t();
                            tmg tmgVar2 = aborVarN5.b;
                            tmgVar2.c = tmfVarQ;
                            tmgVar2.b = 2;
                            tmgVarG = defpackage.tna.g(aborVarN5);
                        }
                    } else {
                        defpackage.abor aborVarN7 = tmg.a.n();
                        aborVarN7.getClass();
                        defpackage.abnv abnvVarB4 = defpackage.tna.b(dtp.e(drawableB, 180, 180, 4));
                        aborVarN7.t();
                        tmg tmgVar3 = aborVarN7.b;
                        tmgVar3.b = 1;
                        tmgVar3.c = abnvVarB4;
                        tmgVarG = defpackage.tna.g(aborVarN7);
                    }
                    aborVarN3.t();
                    akhc akhcVar3 = aborVarN3.b;
                    akhcVar3.e = tmgVarG;
                    akhcVar3.b |= 4;
                    akhc akhcVarQ = aborVarN3.q();
                    aborVarN.t();
                    akhd akhdVar = aborVarN.b;
                    akhcVarQ.getClass();
                    defpackage.abpj abpjVar = akhdVar.b;
                    if (!abpjVar.c()) {
                        akhdVar.b = defpackage.abox.I(abpjVar);
                    }
                    akhdVar.b.add(akhcVarQ);
                }
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bc activity = ((android.support.v4.app.Fragment) this.a).getActivity();
                if (activity == null) {
                    return;
                }
                this.b.a(activity);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                androidx.navigation.fragment.NavHostFragment.b((android.support.v4.app.Fragment) this.a).f(2131427404, (android.os.Bundle) this.b);
                return;
            case 9:
                float f = ((mwf) this.a).a;
                int[] iArr = defpackage.ebt.a;
                ((android.view.View) this.b).setTranslationZ(f);
                return;
            case 10:
                ndj ndjVar = (ndj) this.a;
                defpackage.ndd nddVar = (defpackage.ndd) this.b;
                defpackage.ysr.bn(defpackage.afga.f(nddVar.a(), ndjVar), "Should have cancelled auto-dismiss for %s", ndjVar);
                j$.time.Duration duration = ndjVar.a;
                ncz nczVar = ndjVar instanceof ndj ? ncz.a : nda.a;
                defpackage.mwr.a(defpackage.zbd.FH, null);
                java.util.Objects.toString(duration);
                nddVar.c((defpackage.affc) nczVar, "auto-dismissing after ".concat(duration.toString()));
                return;
            case 11:
                boolean zFY = defpackage.ler.c().fY();
                java.lang.Object obj7 = this.b;
                ?? r13 = this.a;
                if (zFY) {
                    defpackage.you youVarListIterator = ((defpackage.ygw) ((defpackage.ngr) obj7).b).listIterator(0);
                    while (youVarListIterator.hasNext()) {
                        ngx ngxVarA = ((ngs) youVarListIterator.next()).a((ngt) r13);
                        if (ngxVarA != null) {
                            ngxVar = ngxVarA;
                        }
                    }
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ngr.a.h()).ai((char) 5266)).y("Unable to get next education to show for %s while out of lifecycle.", r13);
                }
                if (ngxVar != null) {
                    defpackage.ngp ngpVar = ((defpackage.ngr) obj7).c;
                    defpackage.yqm yqmVar2 = defpackage.ngp.a;
                    ((defpackage.yqj) yqmVar2.l().ai((char) 5264)).y("Sending education for display: %s", ngxVar);
                    for (defpackage.ngo ngoVar : defpackage.ysr.U(ngpVar.b)) {
                        if (ngoVar.c && ngoVar.b.a(ngxVar)) {
                            return;
                        }
                    }
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar2.h()).ai((char) 5265)).y("No provider consumed display: %s", ngxVar);
                    return;
                }
                return;
            case 12:
                defpackage.yqj yqjVar = (defpackage.yqj) noe.a.l().ai(5288);
                java.lang.Object obj8 = this.b;
                noe noeVar = (noe) obj8;
                yqjVar.y("canceling alert currentOngoing=%s", noeVar.i);
                noeVar.k = false;
                noeVar.h.removeCallbacks(noeVar.l);
                if (defpackage.ler.c().fY()) {
                    defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.RAIL_WIDGET, defpackage.zbd.lc);
                    defpackage.eqp eqpVar = (defpackage.eqp) obj8;
                    if (eqpVar.e() != null) {
                        defpackage.nod nodVar = (defpackage.nod) eqpVar.e();
                        nodVar.getClass();
                        rrvVarH.p(nodVar.r);
                    }
                    java.lang.Object obj9 = this.a;
                    defpackage.abor aborVarE = rrvVarH.E();
                    int iA = ((nuv) obj9).c.x.a();
                    aborVarE.t();
                    defpackage.zaf zafVar = (defpackage.zaf) aborVarE.b;
                    defpackage.zaf zafVar2 = defpackage.zaf.a;
                    zafVar.d = iA - 1;
                    zafVar.b |= 2;
                    defpackage.omf.u().F(rrvVarH.l());
                    noeVar.b(noeVar.i);
                    return;
                }
                return;
            case 13:
                com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView = (com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView) this.a;
                railWidgetView.g = false;
                railWidgetView.f(((defpackage.nod) this.b).g && !railWidgetView.f);
                return;
            case 14:
                java.lang.Object obj10 = this.b;
                boolean z2 = ((defpackage.nod) obj10).g;
                java.lang.Object obj11 = this.a;
                com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView2 = (com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView) obj11;
                railWidgetView2.f(z2 && !((com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView) obj11).f);
                railWidgetView2.a(1.0f, 1.0f, com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView.a, new android.view.animation.DecelerateInterpolator(), new defpackage.mbx(obj11, obj10, 13));
                return;
            case 15:
                com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView3 = (com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView) this.a;
                railWidgetView3.g = false;
                railWidgetView3.e((defpackage.nod) this.b);
                return;
            case 16:
                defpackage.ypu ypuVarL = defpackage.nrm.c.l();
                java.lang.Object obj12 = this.a;
                ypuVarL.y("direction found: %s", obj12);
                com.google.android.gms.car.GestureDirection gestureDirection = com.google.android.gms.car.GestureDirection.d;
                boolean z3 = defpackage.afga.f(obj12, gestureDirection) || defpackage.afga.f(obj12, com.google.android.gms.car.GestureDirection.c);
                com.google.android.gms.car.GestureDirection gestureDirection2 = com.google.android.gms.car.GestureDirection.a;
                if (!defpackage.afga.f(obj12, gestureDirection2) && !defpackage.afga.f(obj12, com.google.android.gms.car.GestureDirection.b)) {
                    z = false;
                }
                java.lang.Object obj13 = this.b;
                if (defpackage.acqh.m() && (z || z3)) {
                    defpackage.mpr.e().j();
                    defpackage.nrm nrmVar = (defpackage.nrm) obj13;
                    nrmVar.e.post(nrmVar.f);
                } else if (z3) {
                    ((defpackage.nrm) obj13).j();
                }
                defpackage.nrm nrmVar2 = (defpackage.nrm) obj13;
                if (nrmVar2.i() instanceof defpackage.nrk) {
                    if (z3 || z) {
                        if (defpackage.afga.f(obj12, gestureDirection)) {
                            zbeVar = defpackage.zbe.IMMERSIVE_MODE_GESTURE_CONTEXT_DOWN;
                        } else if (defpackage.afga.f(obj12, com.google.android.gms.car.GestureDirection.c)) {
                            zbeVar = defpackage.zbe.IMMERSIVE_MODE_GESTURE_CONTEXT_UP;
                        } else if (defpackage.afga.f(obj12, gestureDirection2)) {
                            zbeVar = defpackage.zbe.IMMERSIVE_MODE_GESTURE_CONTEXT_LEFT;
                        } else {
                            zbeVar = defpackage.afga.f(obj12, com.google.android.gms.car.GestureDirection.b) ? defpackage.zbe.IMMERSIVE_MODE_GESTURE_CONTEXT_RIGHT : defpackage.zbe.IMMERSIVE_MODE;
                        }
                        defpackage.oim oimVarU = defpackage.omf.u();
                        defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.LW);
                        rrvVarH2.p(nrmVar2.d);
                        oimVarU.F(rrvVarH2.l());
                        return;
                    }
                    return;
                }
                return;
            case 17:
                defpackage.yqm yqmVar3 = defpackage.nux.a;
                if (defpackage.ler.c().i()) {
                    return;
                }
                android.view.textclassifier.TextClassificationManager textClassificationManagerM = a$.ExternalSyntheticApiModelOutline1.m(defpackage.mkp.a.c.getSystemService(a$.ExternalSyntheticApiModelOutline1.m()));
                if (textClassificationManagerM == null) {
                    ((defpackage.yqj) defpackage.nux.a.l().ai((char) 5465)).u("TextClassificationManager unavailable");
                    return;
                }
                ?? r1 = this.a;
                android.view.textclassifier.TextClassifier textClassifierM = ep$.ExternalSyntheticApiModelOutline1.m(textClassificationManagerM);
                defpackage.xzg xzgVar = new defpackage.xzg((defpackage.xzo) defpackage.ojm.a().b);
                for (java.lang.String str2 : r1) {
                    if (defpackage.ler.c().i()) {
                        return;
                    }
                    android.view.textclassifier.TextClassification.Request requestM = hh$.ExternalSyntheticApiModelOutline0.m(new android.view.textclassifier.TextClassification.Request.Builder(str2, 0, str2.length()));
                    xzgVar.d();
                    xzgVar.e();
                    android.view.textclassifier.TextClassification textClassificationM = hh$.ExternalSyntheticApiModelOutline0.m(textClassifierM, requestM);
                    xzgVar.f();
                    long millis = xzgVar.c().toMillis();
                    int iM = ep$.ExternalSyntheticApiModelOutline1.m(textClassificationM);
                    java.lang.String strM = iM > 0 ? ep$.ExternalSyntheticApiModelOutline1.m(textClassificationM, 0) : "N/A";
                    java.lang.Object obj14 = this.b;
                    if (iM > 0) {
                        switch (strM) {
                            case "flight":
                                zbdVar2 = defpackage.zbd.Ns;
                                break;
                            case "address":
                                zbdVar2 = defpackage.zbd.No;
                                break;
                            case "url":
                                zbdVar2 = defpackage.zbd.Nu;
                                break;
                            case "date":
                                zbdVar2 = defpackage.zbd.Np;
                                break;
                            case "email":
                                zbdVar2 = defpackage.zbd.Nr;
                                break;
                            case "phone":
                                zbdVar2 = defpackage.zbd.Nt;
                                break;
                            case "datetime":
                                zbdVar2 = defpackage.zbd.Nq;
                                break;
                            default:
                                zbdVar2 = defpackage.zbd.Nv;
                                break;
                        }
                        defpackage.nux.e(zbdVar2, (java.lang.String) obj14, millis);
                    }
                    android.view.textclassifier.TextLinks.Request requestM2 = jx$.ExternalSyntheticApiModelOutline3.m(new android.view.textclassifier.TextLinks.Request.Builder(str2));
                    xzgVar.d();
                    xzgVar.e();
                    java.util.Collection collectionM = jx$.ExternalSyntheticApiModelOutline3.m(jx$.ExternalSyntheticApiModelOutline3.m(textClassifierM, requestM2));
                    xzgVar.f();
                    long millis2 = xzgVar.c().toMillis();
                    collectionM.size();
                    java.util.Iterator it3 = collectionM.iterator();
                    while (it3.hasNext()) {
                        android.view.textclassifier.TextLinks.TextLink textLinkM = jx$.ExternalSyntheticApiModelOutline3.m(it3.next());
                        int iM2 = jx$.ExternalSyntheticApiModelOutline3.m(textLinkM);
                        java.lang.String strM2 = iM2 > 0 ? jx$.ExternalSyntheticApiModelOutline3.m(textLinkM, 0) : "N/A";
                        if (iM2 > 0) {
                            switch (strM2) {
                                case "flight":
                                    zbdVar = defpackage.zbd.NA;
                                    break;
                                case "address":
                                    zbdVar = defpackage.zbd.Nw;
                                    break;
                                case "url":
                                    zbdVar = defpackage.zbd.NC;
                                    break;
                                case "date":
                                    zbdVar = defpackage.zbd.Nx;
                                    break;
                                case "email":
                                    zbdVar = defpackage.zbd.Nz;
                                    break;
                                case "phone":
                                    zbdVar = defpackage.zbd.NB;
                                    break;
                                case "datetime":
                                    zbdVar = defpackage.zbd.Ny;
                                    break;
                                default:
                                    zbdVar = defpackage.zbd.ND;
                                    break;
                            }
                            defpackage.nux.e(zbdVar, (java.lang.String) obj14, millis2);
                        }
                        break;
                    }
                }
                return;
            case 18:
                ((defpackage.nwy) this.a).b(((nwx) this.b).a);
                return;
            case 19:
                defpackage.yqm yqmVar4 = oea.a;
                ((defpackage.yqj) yqmVar4.l().ai((char) 5583)).u("Transcription final text received");
                java.lang.String str3 = (java.lang.String) this.a;
                boolean zC = oea.c(str3);
                java.lang.Object obj15 = this.b;
                if (!zC) {
                    ((defpackage.yqj) yqmVar4.l().ai((char) 5584)).u("Transcription final text empty, dismissing transcription");
                    ((odz) obj15).a.b();
                    return;
                } else {
                    com.google.android.apps.auto.components.system.transcription.TranscriptionFragment transcriptionFragmentA = ((odz) obj15).a.a();
                    if (transcriptionFragmentA != null) {
                        transcriptionFragmentA.b(new com.google.android.apps.auto.components.system.transcription.TranscriptionFragment.PendingTranscriptionState("", str3, true, 0, (java.lang.String) null));
                        return;
                    }
                    return;
                }
            default:
                java.util.Iterator it4 = ((defpackage.ohl) this.a).a.b.iterator();
                while (it4.hasNext()) {
                    ((defpackage.omf) it4.next()).e((android.telecom.CallAudioState) this.b);
                }
                return;
        }
    }

    public /* synthetic */ mbx(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
