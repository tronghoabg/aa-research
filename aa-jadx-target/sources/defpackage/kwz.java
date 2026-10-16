package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kwz implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kwz(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        lwx lwxVar;
        java.lang.String str;
        java.lang.Object obj2;
        android.text.SpannedString spannedString;
        int i = -1;
        int i2 = 15;
        int i3 = 4;
        int i4 = 10;
        int i5 = 1;
        java.lang.Object obj3 = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yha yhaVar = new defpackage.yha(4);
                yhaVar.f(this.a, obj);
                return yhaVar.d(true);
            case 1:
                defpackage.axq axqVar = (defpackage.axq) obj;
                axqVar.getClass();
                this.a.invoke(new kvu(axqVar));
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                taz tazVar = (taz) obj;
                defpackage.yqm yqmVar = defpackage.kzb.a;
                java.lang.Object obj4 = this.a;
                if (tazVar == null) {
                    int i6 = defpackage.ygw.d;
                    ((defpackage.eqp) obj4).j(defpackage.ymx.a);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (tas tasVar : tazVar.b) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (tbr tbrVar : tasVar.b) {
                            java.lang.String str2 = tbrVar.d;
                            int iAr = defpackage.a.ar(tbrVar.e);
                            if (iAr == 0) {
                                iAr = i5;
                            }
                            switch (iAr + i) {
                                case 1:
                                    lwxVar = lwx.b;
                                    break;
                                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                    lwxVar = lwx.d;
                                    break;
                                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                    lwxVar = lwx.e;
                                    break;
                                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                    lwxVar = lwx.f;
                                    break;
                                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                    lwxVar = lwx.g;
                                    break;
                                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                    lwxVar = lwx.h;
                                    break;
                                default:
                                    lwxVar = lwx.a;
                                    break;
                            }
                            java.lang.String str3 = tbrVar.f;
                            double d = tbrVar.g;
                            int i7 = tbrVar.b;
                            java.lang.String str4 = "";
                            if (i7 == i4) {
                                i7 = i4;
                                str = (java.lang.String) tbrVar.c;
                            } else {
                                str = "";
                            }
                            java.lang.String str5 = i7 == 11 ? (java.lang.String) tbrVar.c : "";
                            java.lang.Object obj5 = obj4;
                            if (i7 == 12) {
                                str4 = (java.lang.String) tbrVar.c;
                            }
                            arrayList2.add(new lwy(str2, lwxVar, str3, d, new lww(str, str5, str4, (java.lang.String) null), false));
                            i = -1;
                            i4 = 10;
                            obj4 = obj5;
                            obj3 = null;
                            i5 = 1;
                        }
                        arrayList.add(arrayList2);
                        i = -1;
                        i4 = 10;
                        i5 = 1;
                    }
                    ((defpackage.eqp) obj4).j(arrayList);
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                defpackage.yqm yqmVar2 = defpackage.kzb.a;
                ((defpackage.yqj) yqmVar2.l().ai((char) 3613)).y("coolwalkMediaSuggestionsEnabled: %s", bool);
                if (bool.booleanValue()) {
                    return ((defpackage.kzb) this.a).s;
                }
                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.h()).ai((char) 3614)).u("getMediaRecommendations called even though suggestions are not enabled");
                return new defpackage.eqs(null);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                lok lokVar = (lok) obj;
                defpackage.lor lorVar = lokVar.b;
                defpackage.yqm yqmVar3 = laf.a;
                if (lorVar != defpackage.lor.b) {
                    return null;
                }
                java.lang.Object obj6 = this.a;
                android.content.ComponentName componentName = lokVar.c.a;
                defpackage.yqm yqmVar4 = laf.a;
                ((defpackage.yqj) yqmVar4.l().ai((char) 3677)).y("buildMbsComponentName: component=%s", componentName);
                if (obj6 == null) {
                    ((defpackage.yqj) yqmVar4.l().ai((char) 3681)).y("Car client token is null, returning same component=%s", componentName);
                } else if (defpackage.kit.b().q()) {
                    defpackage.qsh qshVar = (defpackage.qsh) obj6;
                    if (j$.util.Collection.-EL.stream(jxk.a().b(qshVar, defpackage.nze.b())).anyMatch(new defpackage.koo(componentName, i2))) {
                        android.content.ComponentName componentNameA = defpackage.ljw.d().a(componentName, qshVar);
                        ((defpackage.yqj) yqmVar4.l().ai((char) 3678)).y("Found equivalentMbsComponentName=%s", componentNameA);
                        componentName = (android.content.ComponentName) j$.util.Objects.requireNonNullElse(componentNameA, componentName);
                    } else {
                        ((defpackage.yqj) yqmVar4.l().ai((char) 3679)).y("Not an external media app. Returning same component=%s", componentName);
                    }
                } else {
                    ((defpackage.yqj) yqmVar4.l().ai((char) 3680)).y("Car not connected, returning same component=%s", componentName);
                }
                defpackage.abor aborVarN = otd.a.n();
                osz oszVarA = laf.a(componentName);
                aborVarN.t();
                otd otdVar = aborVarN.b;
                oszVarA.getClass();
                otdVar.c = oszVarA;
                otdVar.b |= 1;
                return aborVarN.q();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.lpg) this.a).f((android.content.ComponentName) obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqm yqmVar5 = laf.a;
                return defpackage.tcu.w((defpackage.eqp) this.a, new defpackage.kwz((defpackage.qsh) obj, i3));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.lby lbyVar = (defpackage.lby) obj;
                lbyVar.getClass();
                ((defpackage.yqj) defpackage.lcv.b.f()).y("Received trigger for survey: %s", lbyVar.name());
                if (((defpackage.lcv) this.a).e.add(lbyVar)) {
                    defpackage.ldf.b.l().y("Survey %s: eligible for survey", lbyVar.name());
                    defpackage.jzl.g(lbyVar, defpackage.zbd.FJ);
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.abrz abrzVar = (defpackage.abrz) obj;
                abrzVar.getClass();
                j$.time.Instant instantNow = j$.time.Instant.now();
                instantNow.getClass();
                return defpackage.ldd.b(this.a, abrzVar, instantNow);
            case 9:
                defpackage.abrz abrzVar2 = (defpackage.abrz) obj;
                j$.time.Instant instantNow2 = j$.time.Instant.now();
                instantNow2.getClass();
                defpackage.abqv abqvVarH = acal.h(instantNow2);
                abrzVar2.getClass();
                defpackage.abor aborVarK = abrzVar2.K();
                aborVarK.getClass();
                defpackage.acmh.v(abqvVarH, aborVarK);
                java.util.Iterator it = defpackage.acmh.s(aborVarK).iterator();
                int i8 = 0;
                while (true) {
                    obj2 = this.a;
                    if (it.hasNext()) {
                        defpackage.zbe zbeVarB = defpackage.zbe.b(((absa) it.next()).c);
                        if (zbeVarB == null) {
                            zbeVarB = defpackage.zbe.UNKNOWN_CONTEXT;
                        }
                        if (zbeVarB == ((defpackage.lby) obj2).c()) {
                            i = i8;
                        } else {
                            i8++;
                        }
                    }
                }
                if (i >= 0) {
                    defpackage.acmh.s(aborVarK);
                    defpackage.abor aborVarK2 = ((absa) defpackage.acmh.s(aborVarK).get(i)).K();
                    aborVarK2.getClass();
                    defpackage.acmh.r(abqvVarH, aborVarK2);
                    aborVarK.ah(i, defpackage.acmh.p(aborVarK2));
                } else {
                    defpackage.acmh.s(aborVarK);
                    defpackage.abor aborVarN2 = absa.a.n();
                    aborVarN2.getClass();
                    defpackage.acmh.q(((defpackage.lby) obj2).c(), aborVarN2);
                    defpackage.acmh.r(abqvVarH, aborVarN2);
                    aborVarK.ag(defpackage.acmh.p(aborVarN2));
                }
                return defpackage.acmh.t(aborVarK);
            case 10:
                defpackage.abrz abrzVar3 = (defpackage.abrz) obj;
                abrzVar3.getClass();
                j$.time.Instant instantNow3 = j$.time.Instant.now();
                instantNow3.getClass();
                return defpackage.ldd.b(this.a, abrzVar3, instantNow3);
            case 11:
                java.lang.Object obj7 = this.a;
                return tim.b(((lkr) obj7).d, new defpackage.jxq(obj7, (java.lang.Boolean) obj, i2));
            case 12:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                defpackage.ype ypeVar = (defpackage.ype) lkv.a.f().ai(3993);
                bool2.getClass();
                ypeVar.N("Current tab band %s is playing: %b", this.a, bool2.booleanValue());
                return defpackage.afbk.a;
            case 13:
                lny lnyVar = (lny) obj;
                lnyVar.getClass();
                defpackage.eqp eqpVarB = lnyVar.b(((defpackage.lma) this.a).i());
                eqpVarB.getClass();
                return eqpVarB;
            case 14:
                obj.getClass();
                boolean z = obj instanceof lkm;
                java.lang.Object obj8 = this.a;
                if (z) {
                    return ((lkx) obj8).a;
                }
                if (obj instanceof lks) {
                    return ((lkx) obj8).a;
                }
                if (obj instanceof lkr) {
                    return ((lkx) obj8).c;
                }
                defpackage.afie afieVarB = defpackage.afgw.b(obj.getClass());
                java.util.Objects.toString(afieVarB);
                throw new java.lang.IllegalStateException("Unknown model type ".concat(java.lang.String.valueOf(afieVarB)));
            case 15:
                android.net.Uri uri = (android.net.Uri) obj;
                uri.getClass();
                return ((lla) this.a).a.d(uri);
            case 16:
                defpackage.to toVar = (defpackage.to) obj;
                int i9 = llj.a;
                toVar.getClass();
                toVar.a((androidx.car.app.model.CarColor) this.a);
                return defpackage.afbk.a;
            case 17:
                defpackage.to toVar2 = (defpackage.to) obj;
                toVar2.getClass();
                java.lang.Object obj9 = this.a;
                if (obj9 != null) {
                    defpackage.ksc kscVar = defpackage.ksi.a;
                    defpackage.kry kryVar = (defpackage.kry) obj9;
                    toVar2.a(androidx.car.app.model.CarColor.createCustom(kryVar.e(kscVar.a().c()), kryVar.c(kscVar.a().c())));
                }
                return defpackage.afbk.a;
            case 18:
                defpackage.lmk lmkVar = (defpackage.lmk) obj;
                lmkVar.getClass();
                if (lmkVar.O("com.google.android.apps.auto.radio.DTS_AUTOSTAGE_ENRICHED") != 1) {
                    return null;
                }
                java.lang.Object obj10 = this.a;
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                ((lll) obj10).b(spannableStringBuilder, 2131231326, (defpackage.kry) null);
                return new android.text.SpannedString(spannableStringBuilder);
            case 19:
                defpackage.lmk lmkVar2 = (defpackage.lmk) obj;
                lmkVar2.getClass();
                int iO = (int) lmkVar2.O("com.google.android.apps.auto.radio.HD_RADIO_SIGNAL_MODE");
                java.lang.Object obj11 = this.a;
                if (iO == 1) {
                    android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
                    defpackage.kry kryVar2 = defpackage.kry.D;
                    lll lllVar = (lll) obj11;
                    lllVar.b(spannableStringBuilder2, 2131231832, kryVar2);
                    spannableStringBuilder2.append((java.lang.CharSequence) " ");
                    lllVar.b(spannableStringBuilder2, 2131231836, kryVar2);
                    spannedString = new android.text.SpannedString(spannableStringBuilder2);
                } else if (iO != 2) {
                    spannedString = null;
                } else {
                    android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder();
                    lll lllVar2 = (lll) obj11;
                    lllVar2.b(spannableStringBuilder3, 2131231832, (defpackage.kry) null);
                    spannableStringBuilder3.append((java.lang.CharSequence) " ");
                    lllVar2.b(spannableStringBuilder3, 2131231836, defpackage.kry.C);
                    spannedString = new android.text.SpannedString(spannableStringBuilder3);
                }
                if (spannedString instanceof java.lang.CharSequence) {
                    return spannedString;
                }
                return null;
            default:
                lok lokVar2 = (lok) obj;
                lokVar2.getClass();
                return defpackage.tcu.d(lokVar2.f, lokVar2.e, new kva(this.a, 10));
        }
    }
}
