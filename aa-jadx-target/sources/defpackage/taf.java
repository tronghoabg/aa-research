package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class taf {
    public static final defpackage.yqm a = defpackage.yqm.c("CarAssistantClient");
    public static final defpackage.adpe b = defpackage.adpe.a(new android.content.ComponentName("com.google.android.googlequicksearchbox", "com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint.CarAssistantService"));
    public static final defpackage.szz c = new defpackage.szz();
    public final defpackage.afar d;
    public final defpackage.afar e;
    public final defpackage.afar f;
    public final defpackage.wyz g;
    private szn h;
    private defpackage.aeep i;
    private final defpackage.taa j;
    private final defpackage.tab k;
    private defpackage.aeep l;
    private final java.util.Map m;
    private final defpackage.tab n;

    public taf(final android.content.Context context, defpackage.wyz wyzVar, final java.util.concurrent.Executor executor, final defpackage.wyz wyzVar2) {
        defpackage.xzi xziVar = new defpackage.xzi() { // from class: szx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.xzi
            public final java.lang.Object fF() {
                defpackage.ygw ygwVar;
                defpackage.yqm yqmVar = defpackage.taf.a;
                boolean zN = wyzVar2.n();
                android.content.Context context2 = context;
                java.util.concurrent.Executor executor2 = executor;
                if (!zN) {
                    return defpackage.sqs.aQ(context2, executor2).a();
                }
                defpackage.zit zitVar = new defpackage.zit();
                zitVar.a();
                zitVar.e = defpackage.acnf.c();
                zitVar.g = (byte) (zitVar.g | 16);
                zitVar.c = (float) defpackage.acnf.d();
                final int i = 4;
                zitVar.g = (byte) (zitVar.g | 4);
                zitVar.b = (int) defpackage.acnf.l();
                zitVar.g = (byte) (zitVar.g | 2);
                zitVar.d = (float) defpackage.acnf.e();
                zitVar.g = (byte) (zitVar.g | 8);
                zitVar.f = defpackage.ygw.q(defpackage.adoo.UNAVAILABLE);
                zitVar.a();
                if (zitVar.g != 31 || (ygwVar = zitVar.f) == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    if ((zitVar.g & 1) == 0) {
                        sb.append(" enabled");
                    }
                    if ((zitVar.g & 2) == 0) {
                        sb.append(" maxAttempts");
                    }
                    if ((zitVar.g & 4) == 0) {
                        sb.append(" initialBackoffSeconds");
                    }
                    if ((zitVar.g & 8) == 0) {
                        sb.append(" maxBackoffSeconds");
                    }
                    if ((zitVar.g & 16) == 0) {
                        sb.append(" backoffMultiplier");
                    }
                    if (zitVar.f == null) {
                        sb.append(" retryableStatusCodes");
                    }
                    throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                defpackage.ziu ziuVar = new defpackage.ziu(zitVar.a, zitVar.b, zitVar.c, zitVar.d, zitVar.e, ygwVar);
                int i2 = ziuVar.b;
                defpackage.ysr.bl(i2 >= 2, "maxAttempts must be greater than or equal to 2. Was %s", i2);
                double d = ziuVar.c;
                java.lang.Double dValueOf = java.lang.Double.valueOf(d);
                defpackage.ysr.bn(d > 0.0d, "Initial backoff seconds must be greater than 0. Was %s", dValueOf);
                double d2 = ziuVar.d;
                defpackage.ysr.bp(d2 > d, "maxBackoffSeconds must be greater than initialBackoffSeconds. Were %s and %s, respectively", java.lang.Double.valueOf(d2), dValueOf);
                double d3 = ziuVar.e;
                defpackage.ysr.bn(d3 >= 1.0d, "backoffMultiplier must be greater than or equal to 1. Was %s", java.lang.Double.valueOf(d3));
                defpackage.ysr.bk(!ziuVar.f.isEmpty(), "retryableStatusCodes may not be empty.");
                defpackage.ziw ziwVar = new defpackage.ziw(new defpackage.ynu(new defpackage.ziv(ziuVar)));
                defpackage.ydg ydgVar = new defpackage.ydg(12, 3);
                defpackage.yhx yhxVar = ziwVar.a;
                defpackage.yot it = yhxVar.iterator();
                while (it.hasNext()) {
                    java.lang.String str = ((defpackage.ziv) it.next()).a;
                    defpackage.ysr.bj(!ydgVar.y(str, null));
                    ydgVar.t(str, null);
                }
                defpackage.adpi adpiVarAQ = defpackage.sqs.aQ(context2, executor2);
                defpackage.ygr ygrVar = new defpackage.ygr(4);
                defpackage.yot it2 = yhxVar.iterator();
                while (it2.hasNext()) {
                    defpackage.ziv zivVar = (defpackage.ziv) it2.next();
                    defpackage.yha yhaVar = new defpackage.yha(4);
                    defpackage.yha yhaVar2 = new defpackage.yha(4);
                    yhaVar2.f("service", zivVar.a);
                    yhaVar.f("name", defpackage.ygw.q(yhaVar2.d(true)));
                    defpackage.ziu ziuVar2 = zivVar.b;
                    if (ziuVar2 != null && ziuVar2.a) {
                        defpackage.yha yhaVar3 = new defpackage.yha(4);
                        yhaVar3.f("maxAttempts", java.lang.Double.valueOf(ziuVar2.b));
                        yhaVar3.f("initialBackoff", ziuVar2.c + "s");
                        yhaVar3.f("maxBackoff", ziuVar2.d + "s");
                        yhaVar3.f("backoffMultiplier", java.lang.Double.valueOf(ziuVar2.e));
                        yhaVar3.f("retryableStatusCodes", defpackage.ysr.V(ziuVar2.f, new defpackage.xyd() { // from class: yme
                            @Override // defpackage.xyd
                            public final java.lang.Object a(java.lang.Object obj) {
                                java.lang.String strD;
                                java.lang.String strD2;
                                java.lang.String strD3;
                                java.lang.String strD4;
                                java.lang.String strD5;
                                java.lang.String strD6;
                                switch (i) {
                                    case defpackage.abnt.b /* 0 */:
                                        return defpackage.ysr.D((java.util.Collection) obj);
                                    case 1:
                                        defpackage.yqm yqmVar2 = com.google.android.projection.gearhead.companion.settings.Material3ManageCarsFragment.f;
                                        return ((com.google.android.gms.carsetup.CarInfoInternal) obj).a;
                                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                                        entry.getClass();
                                        return new zdq(entry);
                                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                        java.util.Map.Entry entry2 = (java.util.Map.Entry) obj;
                                        entry2.getClass();
                                        return new zdu(entry2);
                                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                        return ((defpackage.adoo) obj).name();
                                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                        return java.lang.Boolean.FALSE;
                                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                        android.content.Context context3 = (android.content.Context) obj;
                                        java.lang.String str2 = adbd.a;
                                        if (str2 != null) {
                                            return str2;
                                        }
                                        synchronized (adbd.class) {
                                            strD = adbd.a;
                                            if (strD == null) {
                                                strD = defpackage.way.d(context3, "com.google.android.gms.auth_account_client");
                                                adbd.a = strD;
                                            }
                                            break;
                                        }
                                        return strD;
                                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                        android.content.Context context4 = (android.content.Context) obj;
                                        java.lang.String str3 = addt.a;
                                        if (str3 != null) {
                                            return str3;
                                        }
                                        synchronized (addt.class) {
                                            strD2 = addt.a;
                                            if (strD2 == null) {
                                                strD2 = defpackage.way.d(context4, "com.google.android.libraries.consentverifier");
                                                addt.a = strD2;
                                            }
                                            break;
                                        }
                                        return strD2;
                                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                        defpackage.rkq rkqVar = addy.a;
                                        return "com.google.android.gms";
                                    case 9:
                                        android.content.Context context5 = (android.content.Context) obj;
                                        java.lang.String str4 = adee.a;
                                        if (str4 != null) {
                                            return str4;
                                        }
                                        synchronized (adee.class) {
                                            strD3 = adee.a;
                                            if (strD3 == null) {
                                                strD3 = defpackage.way.d(context5, "com.google.android.gms.maps");
                                                adee.a = strD3;
                                            }
                                            break;
                                        }
                                        return strD3;
                                    case 10:
                                        android.content.Context context6 = (android.content.Context) obj;
                                        java.lang.String str5 = adfs.a;
                                        if (str5 != null) {
                                            return str5;
                                        }
                                        synchronized (adfs.class) {
                                            strD4 = adfs.a;
                                            if (strD4 == null) {
                                                strD4 = defpackage.way.d(context6, "com.google.android.libraries.impress");
                                                adfs.a = strD4;
                                            }
                                            break;
                                        }
                                        return strD4;
                                    case 11:
                                        android.content.Context context7 = (android.content.Context) obj;
                                        java.lang.String str6 = adfw.a;
                                        if (str6 != null) {
                                            return str6;
                                        }
                                        synchronized (adfw.class) {
                                            strD5 = adfw.a;
                                            if (strD5 == null) {
                                                strD5 = defpackage.way.d(context7, "com.google.android.libraries.performance.primes");
                                                adfw.a = strD5;
                                            }
                                            break;
                                        }
                                        return strD5;
                                    case 12:
                                        android.content.Context context8 = (android.content.Context) obj;
                                        java.lang.String str7 = adhr.a;
                                        if (str7 != null) {
                                            return str7;
                                        }
                                        synchronized (adhr.class) {
                                            strD6 = adhr.a;
                                            if (strD6 == null) {
                                                strD6 = defpackage.way.d(context8, "com.google.android.libraries.surveys");
                                                adhr.a = strD6;
                                            }
                                            break;
                                        }
                                        return strD6;
                                    default:
                                        java.util.logging.Logger logger = adyd.f;
                                        return ((adyc) obj).a;
                                }
                            }
                        }));
                        yhaVar.h(defpackage.yhe.k("retryPolicy", yhaVar3.d(true)));
                    }
                    ygrVar.i(yhaVar.d(true));
                }
                defpackage.yhe yheVarK = defpackage.yhe.k("methodConfig", ygrVar.g());
                defpackage.adxc adxcVar = adpiVarAQ.a;
                adxcVar.s = defpackage.adxc.c(yheVarK);
                adxcVar.q = true;
                return adpiVarAQ.a();
            }
        };
        this.g = wyzVar;
        this.d = new defpackage.afay(new defpackage.njw(xziVar, 11));
        this.e = new defpackage.afay(new defpackage.njw(this, 12));
        this.f = new defpackage.afay(new defpackage.njw(this, 13));
        this.n = new defpackage.tab(this, 1);
        this.j = new defpackage.taa();
        this.k = new defpackage.tab(this, 0);
        this.m = new java.util.LinkedHashMap();
    }

    private final synchronized void m(taw tawVar) {
        defpackage.adng adngVarA;
        defpackage.aedv aedvVar = (defpackage.aedv) this.e.a();
        defpackage.adjx adjxVar = aedvVar.a;
        defpackage.adng adngVar = defpackage.tan.f;
        if (adngVar == null) {
            synchronized (defpackage.tan.class) {
                adngVarA = defpackage.tan.f;
                if (adngVarA == null) {
                    defpackage.xo xoVarC = defpackage.adng.c();
                    xoVarC.b = defpackage.adnf.a;
                    xoVarC.d = defpackage.adng.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "SendGearheadSignal");
                    xoVarC.b();
                    taw tawVar2 = taw.a;
                    defpackage.abol abolVar = defpackage.aedu.a;
                    xoVarC.e = new defpackage.aedt(tawVar2);
                    xoVarC.c = new defpackage.aedt(tax.a);
                    adngVarA = xoVarC.a();
                    defpackage.tan.f = adngVarA;
                }
            }
            adngVar = adngVarA;
        }
        defpackage.aeei.d(adjxVar.d(adngVar, aedvVar.b), tawVar, this.j);
    }

    public final synchronized void a() {
        ((defpackage.yqj) a.f()).u("#closeConnection");
        defpackage.aeep aeepVar = this.i;
        if (aeepVar != null) {
            defpackage.abor aborVarN = taq.a.n();
            aborVarN.getClass();
            defpackage.abor aborVarN2 = tap.a.n();
            aborVarN2.getClass();
            tap tapVarQ = aborVarN2.q();
            tapVarQ.getClass();
            aborVarN.t();
            taq taqVar = aborVarN.b;
            taqVar.c = tapVarQ;
            taqVar.b = 2;
            aeepVar.c(defpackage.tan.b(aborVarN));
            aeepVar.a();
            defpackage.kpu.b(defpackage.yxo.SERVICE_CLOSED_DODGEBOOST);
        }
        this.i = null;
    }

    public final synchronized void b(szn sznVar) {
        defpackage.adng adngVarA;
        this.h = sznVar;
        defpackage.aedv aedvVar = (defpackage.aedv) this.e.a();
        defpackage.tbc tbcVar = defpackage.tbc.a;
        defpackage.abor aborVarN = tbcVar.n();
        aborVarN.getClass();
        defpackage.abox aboxVarQ = aborVarN.q();
        aboxVarQ.getClass();
        defpackage.tbc tbcVar2 = (defpackage.tbc) aboxVarQ;
        defpackage.szy szyVar = new defpackage.szy(this, sznVar);
        defpackage.adjx adjxVar = aedvVar.a;
        defpackage.adng adngVar = defpackage.tan.a;
        if (adngVar == null) {
            synchronized (defpackage.tan.class) {
                defpackage.adng adngVar2 = defpackage.tan.a;
                if (adngVar2 == null) {
                    defpackage.xo xoVarC = defpackage.adng.c();
                    xoVarC.b = defpackage.adnf.a;
                    xoVarC.d = defpackage.adng.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "GetAssistantFeatureFlags");
                    xoVarC.b();
                    defpackage.abol abolVar = defpackage.aedu.a;
                    xoVarC.e = new defpackage.aedt(tbcVar);
                    xoVarC.c = new defpackage.aedt(defpackage.tbd.a);
                    adngVarA = xoVarC.a();
                    defpackage.tan.a = adngVarA;
                } else {
                    adngVarA = adngVar2;
                }
            }
            adngVar = adngVarA;
        }
        defpackage.aeei.d(adjxVar.d(adngVar, aedvVar.b), tbcVar2, szyVar);
    }

    public final void c(boolean z) {
        szn sznVar;
        synchronized (this) {
            this.i = null;
            if (z && (sznVar = this.h) != null) {
                szn sznVar2 = ((defpackage.szv) sznVar).b;
                synchronized (((defpackage.szv) sznVar).a) {
                    defpackage.wfp.e(new defpackage.sho(sznVar2, 15));
                }
            }
            this.h = null;
            ((defpackage.admn) this.d.a()).b();
        }
    }

    public final synchronized void d() {
        defpackage.aeep aeepVar = this.l;
        if (aeepVar != null) {
            aeepVar.a();
        }
        this.l = null;
    }

    public final synchronized void e() {
        defpackage.adng adngVarA;
        if (this.l != null) {
            ((defpackage.yqj) a.e()).u("Skip starting media rec callback stream.");
            return;
        }
        ((defpackage.yqj) a.e()).u("#startMediaRecommendationCallbackStream");
        defpackage.aedv aedvVar = (defpackage.aedv) this.e.a();
        defpackage.tab tabVar = this.k;
        defpackage.adjx adjxVar = aedvVar.a;
        defpackage.adng adngVar = defpackage.tan.h;
        if (adngVar == null) {
            synchronized (defpackage.tan.class) {
                adngVarA = defpackage.tan.h;
                if (adngVarA == null) {
                    defpackage.xo xoVarC = defpackage.adng.c();
                    xoVarC.b = defpackage.adnf.d;
                    xoVarC.d = defpackage.adng.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "MediaRecommendationCallbacks");
                    xoVarC.b();
                    tav tavVar = tav.a;
                    defpackage.abol abolVar = defpackage.aedu.a;
                    xoVarC.e = new defpackage.aedt(tavVar);
                    xoVarC.c = new defpackage.aedt(tbg.a);
                    adngVarA = xoVarC.a();
                    defpackage.tan.h = adngVarA;
                }
            }
            adngVar = adngVarA;
        }
        defpackage.adrq adrqVarD = adjxVar.d(adngVar, aedvVar.b);
        defpackage.adjv adjvVar = defpackage.aeei.b;
        tabVar.getClass();
        defpackage.aeep aeepVarC = defpackage.aeei.c(adrqVarD, tabVar, true);
        defpackage.abor aborVarN = tav.a.n();
        aborVarN.getClass();
        defpackage.abor aborVarN2 = tbk.a.n();
        aborVarN2.getClass();
        tbk tbkVarQ = aborVarN2.q();
        tbkVarQ.getClass();
        aborVarN.t();
        tav tavVar2 = aborVarN.b;
        tavVar2.c = tbkVarQ;
        tavVar2.b = 1 | tavVar2.b;
        tav tavVarQ = aborVarN.q();
        tavVarQ.getClass();
        aeepVarC.c(tavVarQ);
        this.l = aeepVarC;
    }

    public final synchronized void f(tao taoVar, int i) {
        defpackage.adng adngVarA;
        defpackage.aedv aedvVar = (defpackage.aedv) this.e.a();
        defpackage.adjx adjxVar = aedvVar.a;
        defpackage.adng adngVar = defpackage.tan.b;
        if (adngVar == null) {
            synchronized (defpackage.tan.class) {
                adngVarA = defpackage.tan.b;
                if (adngVarA == null) {
                    defpackage.xo xoVarC = defpackage.adng.c();
                    xoVarC.b = defpackage.adnf.b;
                    xoVarC.d = defpackage.adng.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "Connection");
                    xoVarC.b();
                    taq taqVar = taq.a;
                    defpackage.abol abolVar = defpackage.aedu.a;
                    xoVarC.e = new defpackage.aedt(taqVar);
                    xoVarC.c = new defpackage.aedt(tar.a);
                    adngVarA = xoVarC.a();
                    defpackage.tan.b = adngVarA;
                }
            }
            adngVar = adngVarA;
        }
        defpackage.tab tabVar = this.n;
        defpackage.adrq adrqVarD = adjxVar.d(adngVar, aedvVar.b);
        defpackage.adjv adjvVar = defpackage.aeei.b;
        tabVar.getClass();
        defpackage.aeep aeepVarC = defpackage.aeei.c(adrqVarD, tabVar, false);
        defpackage.abor aborVarN = taq.a.n();
        aborVarN.getClass();
        defpackage.abor aborVarN2 = tbj.a.n();
        aborVarN2.getClass();
        aborVarN2.t();
        tbj tbjVar = aborVarN2.b;
        tbjVar.c = taoVar;
        tbjVar.b |= 1;
        aborVarN2.t();
        tbj tbjVar2 = aborVarN2.b;
        tbjVar2.b |= 2;
        tbjVar2.d = i;
        tbj tbjVarQ = aborVarN2.q();
        tbjVarQ.getClass();
        aborVarN.t();
        taq taqVar2 = aborVarN.b;
        taqVar2.c = tbjVarQ;
        taqVar2.b = 1;
        aeepVarC.c(defpackage.tan.b(aborVarN));
        this.i = aeepVarC;
    }

    public final synchronized void g(ott ottVar) {
        defpackage.abor aborVarN = taw.a.n();
        aborVarN.getClass();
        aborVarN.t();
        taw tawVar = aborVarN.b;
        tawVar.c = ottVar;
        tawVar.b = 1;
        m(defpackage.tan.f(aborVarN));
    }

    public final synchronized void h(tbi tbiVar, defpackage.affc affcVar, boolean z) {
        defpackage.adng adngVarA;
        tak takVar = tak.a;
        defpackage.abor aborVarN = takVar.n();
        aborVarN.getClass();
        tak takVarN = defpackage.tna.n(aborVarN);
        defpackage.aedv aedvVar = (defpackage.aedv) this.e.a();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(tbiVar.c);
        java.util.Map map = this.m;
        if (map.containsKey(numValueOf)) {
            int i = tbiVar.d;
            java.lang.Object obj = map.get(java.lang.Integer.valueOf(tbiVar.c));
            if (obj == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            java.util.List list = (java.util.List) obj;
            if (i > 0 && i < list.size()) {
                defpackage.adnd adndVar = new defpackage.adnd();
                if (z) {
                    tcc tccVarA = tai.a((com.google.android.gearhead.sdk.assistant.MessagingInfo) list.get(i));
                    defpackage.abor aborVarK = takVarN.K();
                    aborVarK.getClass();
                    defpackage.tna.o(tccVarA.a, aborVarK);
                    defpackage.tna.r(aborVarK);
                    com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel.NotificationInfoParcelables notificationInfoParcelables = tccVarA.b;
                    takVarN = defpackage.tna.n(aborVarK);
                    defpackage.zfh.s(taj.b, notificationInfoParcelables, adndVar);
                } else {
                    defpackage.abor aborVarK2 = takVarN.K();
                    aborVarK2.getClass();
                    defpackage.tna.q(aborVarK2);
                    takVarN = defpackage.tna.n(aborVarK2);
                    defpackage.zfh.s(taj.a, (android.os.Parcelable) list.get(i), adndVar);
                }
                aedvVar = (defpackage.aedv) aedvVar.c(new aeel(adndVar));
                int i2 = i + 1;
                if (i2 < list.size()) {
                    defpackage.abor aborVarK3 = takVarN.K();
                    aborVarK3.getClass();
                    defpackage.abor aborVarN2 = tbi.a.n();
                    aborVarN2.getClass();
                    defpackage.tan.p(tbiVar.c, aborVarN2);
                    defpackage.tan.o(i2, aborVarN2);
                    defpackage.tna.p(defpackage.tan.n(aborVarN2), aborVarK3);
                    takVarN = defpackage.tna.n(aborVarK3);
                } else {
                    map.remove(java.lang.Integer.valueOf(tbiVar.c));
                }
            }
        }
        tac tacVar = new tac(this, affcVar, z);
        defpackage.adng adngVar = defpackage.tan.e;
        if (adngVar == null) {
            synchronized (defpackage.tan.class) {
                adngVarA = defpackage.tan.e;
                if (adngVarA == null) {
                    defpackage.xo xoVarC = defpackage.adng.c();
                    xoVarC.b = defpackage.adnf.a;
                    xoVarC.d = defpackage.adng.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "SendActiveNotification");
                    xoVarC.b();
                    defpackage.abol abolVar = defpackage.aedu.a;
                    xoVarC.e = new defpackage.aedt(takVar);
                    xoVarC.c = new defpackage.aedt(tbh.a);
                    adngVarA = xoVarC.a();
                    defpackage.tan.e = adngVarA;
                }
            }
            adngVar = adngVarA;
        }
        defpackage.aeei.d(aedvVar.a.d(adngVar, aedvVar.b), takVarN, tacVar);
    }

    public final synchronized void i(osx osxVar) {
        defpackage.abor aborVarN = taw.a.n();
        aborVarN.getClass();
        aborVarN.t();
        taw tawVar = aborVarN.b;
        tawVar.c = osxVar;
        tawVar.b = 3;
        m(defpackage.tan.f(aborVarN));
    }

    public final synchronized void j(osy osyVar) {
        defpackage.abor aborVarN = taw.a.n();
        aborVarN.getClass();
        aborVarN.t();
        taw tawVar = aborVarN.b;
        tawVar.c = osyVar;
        tawVar.b = 2;
        m(defpackage.tan.f(aborVarN));
    }

    public final synchronized void k(osk oskVar, osh oshVar, java.util.List list, boolean z, defpackage.affc affcVar, boolean z2, java.lang.Runnable runnable) {
        defpackage.adng adngVarA;
        tak takVarN;
        java.util.Map map = this.m;
        map.clear();
        defpackage.aedv aedvVar = (defpackage.aedv) this.e.a();
        tbt tbtVar = tbt.a;
        defpackage.abor aborVarN = tbtVar.n();
        aborVarN.getClass();
        aborVarN.t();
        tbt tbtVar2 = aborVarN.b;
        tbtVar2.c = oskVar;
        tbtVar2.b |= 1;
        aborVarN.t();
        tbt tbtVar3 = aborVarN.b;
        tbtVar3.d = oshVar;
        tbtVar3.b |= 2;
        aborVarN.t();
        tbt tbtVar4 = aborVarN.b;
        tbtVar4.b |= 8;
        tbtVar4.f = z;
        defpackage.abor aborVarN2 = tbb.a.n();
        aborVarN2.getClass();
        defpackage.abqv abqvVar = oskVar.i;
        if (abqvVar == null) {
            abqvVar = defpackage.abqv.a;
        }
        abqvVar.getClass();
        aborVarN2.t();
        tbb tbbVar = aborVarN2.b;
        tbbVar.c = abqvVar;
        tbbVar.b |= 1;
        aborVarN2.t();
        tbb tbbVar2 = aborVarN2.b;
        tbbVar2.d = defpackage.adrq.y(3);
        tbbVar2.b |= 4;
        tbb tbbVarQ = aborVarN2.q();
        tbbVarQ.getClass();
        aborVarN.t();
        tbt tbtVar5 = aborVarN.b;
        tbtVar5.g = tbbVarQ;
        tbtVar5.b |= 16;
        tbt tbtVarJ = defpackage.tan.j(aborVarN);
        if (!list.isEmpty()) {
            defpackage.abor aborVarN3 = tak.a.n();
            aborVarN3.getClass();
            tak takVarN2 = defpackage.tna.n(aborVarN3);
            defpackage.adnd adndVar = new defpackage.adnd();
            if (z2) {
                tcc tccVarA = tai.a((com.google.android.gearhead.sdk.assistant.MessagingInfo) list.get(0));
                defpackage.zfh.s(taj.b, tccVarA.b, adndVar);
                defpackage.abor aborVarK = takVarN2.K();
                aborVarK.getClass();
                defpackage.tna.o(tccVarA.a, aborVarK);
                defpackage.tna.r(aborVarK);
                takVarN = defpackage.tna.n(aborVarK);
            } else {
                defpackage.zfh.s(taj.a, (android.os.Parcelable) list.get(0), adndVar);
                defpackage.abor aborVarK2 = takVarN2.K();
                aborVarK2.getClass();
                defpackage.tna.q(aborVarK2);
                takVarN = defpackage.tna.n(aborVarK2);
            }
            aedvVar = (defpackage.aedv) aedvVar.c(new aeel(adndVar));
            if (list.size() > 1) {
                int iNextInt = xyw.a.nextInt();
                map.put(java.lang.Integer.valueOf(iNextInt), list);
                defpackage.abor aborVarK3 = takVarN.K();
                aborVarK3.getClass();
                defpackage.abor aborVarN4 = tbi.a.n();
                aborVarN4.getClass();
                defpackage.tan.p(iNextInt, aborVarN4);
                defpackage.tan.o(1, aborVarN4);
                defpackage.tna.p(defpackage.tan.n(aborVarN4), aborVarK3);
                takVarN = defpackage.tna.n(aborVarK3);
            }
            defpackage.abor aborVarK4 = tbtVarJ.K();
            aborVarK4.getClass();
            aborVarK4.t();
            tbt tbtVar6 = aborVarK4.b;
            tbtVar6.e = takVarN;
            tbtVar6.b |= 4;
            tbtVarJ = defpackage.tan.j(aborVarK4);
        }
        tae taeVar = new tae(this, affcVar, z2, runnable);
        defpackage.adng adngVar = defpackage.tan.c;
        if (adngVar == null) {
            synchronized (defpackage.tan.class) {
                adngVarA = defpackage.tan.c;
                if (adngVarA == null) {
                    defpackage.xo xoVarC = defpackage.adng.c();
                    xoVarC.b = defpackage.adnf.a;
                    xoVarC.d = defpackage.adng.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "StartAssistantSession");
                    xoVarC.b();
                    defpackage.abol abolVar = defpackage.aedu.a;
                    xoVarC.e = new defpackage.aedt(tbtVar);
                    xoVarC.c = new defpackage.aedt(tbu.a);
                    adngVarA = xoVarC.a();
                    defpackage.tan.c = adngVarA;
                }
            }
            adngVar = adngVarA;
        }
        defpackage.aeei.d(aedvVar.a.d(adngVar, aedvVar.b), tbtVarJ, taeVar);
    }

    public final void l() {
        this.l = null;
    }
}
