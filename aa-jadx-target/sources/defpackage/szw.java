package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class szw {
    public static final defpackage.yqm a = defpackage.yqm.c("AssistantClientHelper");
    public final defpackage.szo b;
    public qjz c;
    private final android.content.Context d;
    private final defpackage.taf e;
    private szu f;
    private android.content.Intent g;
    private defpackage.osi h;
    private boolean i;
    private boolean j;
    private qjy k;

    public szw(android.content.Context context, defpackage.szo szoVar) {
        context.getClass();
        szoVar.getClass();
        defpackage.taf tafVar = new defpackage.taf(context, szoVar.d, szoVar.a, szoVar.c);
        this.d = context;
        this.e = tafVar;
        this.b = szoVar;
        defpackage.abor aborVarN = defpackage.osi.a.n();
        aborVarN.getClass();
        defpackage.abox aboxVarQ = aborVarN.q();
        aboxVarQ.getClass();
        this.h = (defpackage.osi) aboxVarQ;
    }

    public static final com.google.android.gearhead.sdk.assistant.CarAssistantSetting p(int i, tbp tbpVar) {
        int i2;
        if (tbpVar == null || tbpVar.b.size() != 1) {
            ((defpackage.yqj) a.h()).y("Unexpected settings returned: %s", tbpVar);
            return null;
        }
        tbm tbmVar = (tbm) tbpVar.b.get(0);
        tbmVar.getClass();
        tbo tboVarA = tag.a(i);
        tbo tboVarB = tbo.b(tbmVar.d);
        if (tboVarB == null) {
            tboVarB = tbo.a;
        }
        if (tboVarA != tboVarB) {
            defpackage.yqj yqjVar = (defpackage.yqj) a.g();
            java.lang.String strName = tboVarA.name();
            tbo tboVarB2 = tbo.b(tbmVar.d);
            if (tboVarB2 == null) {
                tboVarB2 = tbo.a;
            }
            yqjVar.M("Incorrect key: %s != %s", strName, tboVarB2.name());
            throw new java.lang.IllegalArgumentException("Incorrect SettingKey");
        }
        com.google.android.gearhead.sdk.assistant.CarAssistantSetting carAssistantSetting = new com.google.android.gearhead.sdk.assistant.CarAssistantSetting();
        carAssistantSetting.a = i;
        int i3 = tbmVar.b;
        if (i3 == 0) {
            i2 = 4;
        } else if (i3 == 2) {
            i2 = 1;
        } else if (i3 != 3) {
            i2 = i3 != 4 ? 0 : 3;
        } else {
            i2 = 2;
        }
        if (i2 == 0) {
            throw null;
        }
        int i4 = i2 - 1;
        if (i4 == 0) {
            carAssistantSetting.b = i3 == 2 ? ((java.lang.Boolean) tbmVar.c).booleanValue() : false;
            return carAssistantSetting;
        }
        if (i4 == 1) {
            carAssistantSetting.c = i3 == 3 ? ((java.lang.Integer) tbmVar.c).intValue() : 0;
            return carAssistantSetting;
        }
        if (i4 == 2) {
            carAssistantSetting.d = i3 == 4 ? (java.lang.String) tbmVar.c : "";
            return carAssistantSetting;
        }
        ((defpackage.yqj) a.g()).u("Missing setting value");
        throw new java.lang.IllegalArgumentException("Unsupported setting value");
    }

    private final com.google.android.gearhead.sdk.assistant.CarAssistantSetting q(int i) {
        qjy qjyVar = this.k;
        if (qjyVar == null) {
            ((defpackage.yqj) a.h()).u("#getSetting called before assistant initiated");
            return null;
        }
        try {
            android.os.Parcel parcelFp = qjyVar.fp();
            parcelFp.writeInt(i);
            android.os.Parcel parcelFq = qjyVar.fq(3, parcelFp);
            com.google.android.gearhead.sdk.assistant.CarAssistantSetting carAssistantSettingA = defpackage.ijx.a(parcelFq, com.google.android.gearhead.sdk.assistant.CarAssistantSetting.CREATOR);
            parcelFq.recycle();
            return carAssistantSettingA;
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).w("Failed to read setting : %s", i);
            return null;
        }
    }

    private final synchronized void r() {
        if (this.i && !this.b.c.n()) {
            ((defpackage.yqj) a.f()).y("Unbinding from service: %s", this.g);
            android.content.Context context = this.d;
            szu szuVar = this.f;
            if (szuVar == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            context.unbindService(szuVar);
            this.f = null;
            this.g = null;
            this.i = false;
            this.k = null;
            this.c = null;
        }
    }

    private final synchronized boolean s() {
        return this.h.e;
    }

    private static final void t(java.lang.String str) {
        ((defpackage.yqj) a.h()).y("%s", str);
        defpackage.kpu.b(defpackage.yxo.SERVICE_UNAVAILABLE);
    }

    public final synchronized void a() {
        defpackage.taf tafVar = this.e;
        tafVar.d();
        if (s()) {
            tafVar.a();
            szp.a.b();
        } else {
            qjy qjyVar = this.k;
            if (qjyVar != null) {
                try {
                    qjyVar.fr(5, qjyVar.fp());
                    defpackage.kpu.b(defpackage.yxo.SERVICE_CLOSED);
                } catch (android.os.RemoteException e) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).u("Failed to close the assistant");
                    defpackage.kpu.b(defpackage.yxo.SERVICE_FAILED_TO_CLOSE);
                }
            }
        }
        defpackage.abor aborVarN = defpackage.osi.a.n();
        aborVarN.getClass();
        defpackage.abox aboxVarQ = aborVarN.q();
        aboxVarQ.getClass();
        this.h = (defpackage.osi) aboxVarQ;
        r();
    }

    public final synchronized void b(tat tatVar) {
        defpackage.adng adngVarA;
        tatVar.getClass();
        defpackage.aedv aedvVar = (defpackage.aedv) this.e.e.a();
        defpackage.adjx adjxVar = aedvVar.a;
        defpackage.szz szzVar = defpackage.taf.c;
        defpackage.adng adngVar = defpackage.tan.g;
        if (adngVar == null) {
            synchronized (defpackage.tan.class) {
                adngVarA = defpackage.tan.g;
                if (adngVarA == null) {
                    defpackage.xo xoVarC = defpackage.adng.c();
                    xoVarC.b = defpackage.adnf.a;
                    xoVarC.d = defpackage.adng.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "FulfillDirectAction");
                    xoVarC.b();
                    tat tatVar2 = tat.a;
                    defpackage.abol abolVar = defpackage.aedu.a;
                    xoVarC.e = new defpackage.aedt(tatVar2);
                    xoVarC.c = new defpackage.aedt(tau.a);
                    adngVarA = xoVarC.a();
                    defpackage.tan.g = adngVarA;
                }
            }
            adngVar = adngVarA;
        }
        defpackage.aeei.d(adjxVar.d(adngVar, aedvVar.b), tatVar, szzVar);
    }

    public final synchronized void c(int i, defpackage.affc affcVar) {
        if (!s()) {
            affcVar.invoke(q(i));
            return;
        }
        defpackage.taf tafVar = this.e;
        tbo tboVarA = tag.a(i);
        defpackage.aif aifVar = new defpackage.aif(affcVar, i, 19);
        defpackage.aedv aedvVar = (defpackage.aedv) tafVar.e.a();
        defpackage.abor aborVarN = tbq.b.n();
        aborVarN.getClass();
        defpackage.tan.m(aborVarN);
        defpackage.tan.l(tboVarA, aborVarN);
        defpackage.aeei.d(aedvVar.a.d(defpackage.tan.a(), aedvVar.b), defpackage.tan.k(aborVarN), new tad(aifVar, 1));
    }

    public final synchronized void d(java.util.List list, tbs tbsVar, defpackage.affc affcVar) {
        defpackage.adng adngVarA;
        tbsVar.getClass();
        if (list.isEmpty()) {
            ((defpackage.yqj) a.h()).u("Empty messages passed in for smart actions");
            affcVar.invoke(null);
            return;
        }
        if (!this.h.k) {
            ((defpackage.yqj) a.h()).u("SmartActions gRPC is not enabled");
            affcVar.invoke(null);
            return;
        }
        defpackage.aedv aedvVar = (defpackage.aedv) this.e.e.a();
        tay tayVar = tay.a;
        defpackage.abor aborVarN = tayVar.n();
        aborVarN.getClass();
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(aborVarN.b.c);
        listUnmodifiableList.getClass();
        new abrl(listUnmodifiableList);
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tai.a((com.google.android.gearhead.sdk.assistant.MessagingInfo) it.next()).a);
        }
        aborVarN.t();
        tay tayVar2 = aborVarN.b;
        defpackage.abpj abpjVar = tayVar2.c;
        if (!abpjVar.c()) {
            tayVar2.c = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(arrayList, tayVar2.c);
        aborVarN.t();
        tay tayVar3 = aborVarN.b;
        tayVar3.d = tbsVar;
        tayVar3.b |= 1;
        tay tayVarQ = aborVarN.q();
        tayVarQ.getClass();
        tay tayVar4 = tayVarQ;
        tad tadVar = new tad(affcVar, 0);
        defpackage.adjx adjxVar = aedvVar.a;
        defpackage.adng adngVar = defpackage.tan.i;
        if (adngVar == null) {
            synchronized (defpackage.tan.class) {
                defpackage.adng adngVar2 = defpackage.tan.i;
                if (adngVar2 == null) {
                    defpackage.xo xoVarC = defpackage.adng.c();
                    xoVarC.b = defpackage.adnf.a;
                    xoVarC.d = defpackage.adng.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "GetSmartActions");
                    xoVarC.b();
                    defpackage.abol abolVar = defpackage.aedu.a;
                    xoVarC.e = new defpackage.aedt(tayVar);
                    xoVarC.c = new defpackage.aedt(taz.a);
                    adngVarA = xoVarC.a();
                    defpackage.tan.i = adngVarA;
                } else {
                    adngVarA = adngVar2;
                }
            }
            adngVar = adngVarA;
        }
        defpackage.aeei.d(adjxVar.d(adngVar, aedvVar.b), tayVar4, tadVar);
    }

    public final synchronized void e() {
        boolean zQ = defpackage.acqe.q();
        boolean z = this.h.h;
        if (!zQ || z) {
            return;
        }
        this.e.e();
    }

    public final synchronized void f(ott ottVar) {
        ottVar.getClass();
        qjy qjyVar = this.k;
        if (s()) {
            this.e.g(ottVar);
            return;
        }
        if (qjyVar == null) {
            ((defpackage.yqj) a.f()).u("assistant null");
            return;
        }
        try {
            byte[] bArrH = ottVar.h();
            android.os.Parcel parcelFp = qjyVar.fp();
            parcelFp.writeByteArray(bArrH);
            qjyVar.fr(6, parcelFp);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).u("Failed to send GearheadEvent");
            defpackage.kpu.b(defpackage.yxo.SEND_GEARHEAD_EVENT_REMOTE_EXCEPTION);
        }
    }

    public final synchronized void g(osx osxVar) {
        this.e.i(osxVar);
    }

    public final synchronized void h(osy osyVar) {
        osyVar.getClass();
        this.e.j(osyVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0346 A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0352 A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x036d A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x04e4 A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0568  */
    /* JADX WARN: Code duplicated, block: B:168:0x056f A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x05a5 A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x05d4 A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0607  */
    /* JADX WARN: Code duplicated, block: B:181:0x061d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0620  */
    /* JADX WARN: Code duplicated, block: B:183:0x0623  */
    /* JADX WARN: Code duplicated, block: B:184:0x0625  */
    /* JADX WARN: Code duplicated, block: B:185:0x0627  */
    /* JADX WARN: Code duplicated, block: B:186:0x0629  */
    /* JADX WARN: Code duplicated, block: B:187:0x062c  */
    /* JADX WARN: Code duplicated, block: B:188:0x062e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0646 A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x064c A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x065b A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0661 A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x06b7 A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x0715 A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x076f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0771  */
    /* JADX WARN: Code duplicated, block: B:218:0x0774  */
    /* JADX WARN: Code duplicated, block: B:219:0x0776  */
    /* JADX WARN: Code duplicated, block: B:220:0x0779  */
    /* JADX WARN: Code duplicated, block: B:221:0x077c  */
    /* JADX WARN: Code duplicated, block: B:222:0x077e  */
    /* JADX WARN: Code duplicated, block: B:223:0x0780  */
    /* JADX WARN: Code duplicated, block: B:224:0x0782  */
    /* JADX WARN: Code duplicated, block: B:225:0x0785  */
    /* JADX WARN: Code duplicated, block: B:226:0x0788  */
    /* JADX WARN: Code duplicated, block: B:231:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:232:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:235:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:236:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:241:0x07d7 A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x07e3 A[Catch: all -> 0x07fe, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x001d, B:7:0x002a, B:19:0x0044, B:20:0x0056, B:32:0x0071, B:34:0x0085, B:37:0x008d, B:40:0x00cc, B:42:0x00f0, B:44:0x00f4, B:46:0x0101, B:48:0x010b, B:50:0x0111, B:51:0x012f, B:165:0x0547, B:207:0x0706, B:209:0x0715, B:210:0x0717, B:214:0x075c, B:215:0x076c, B:227:0x0789, B:228:0x078b, B:239:0x07bd, B:241:0x07d7, B:243:0x07e3, B:244:0x07e8, B:249:0x07f3, B:168:0x056f, B:170:0x05a5, B:172:0x05ab, B:173:0x05bc, B:175:0x05d4, B:176:0x05da, B:179:0x0609, B:180:0x061a, B:189:0x062f, B:191:0x0646, B:196:0x0673, B:197:0x06b1, B:199:0x06b7, B:201:0x06cb, B:203:0x06d1, B:205:0x06f5, B:206:0x06fb, B:192:0x064c, B:194:0x065b, B:195:0x0661, B:54:0x0141, B:56:0x0145, B:58:0x014d, B:64:0x0190, B:60:0x015b, B:63:0x016a, B:65:0x0194, B:67:0x0198, B:70:0x01a7, B:72:0x01b9, B:74:0x01c1, B:99:0x033e, B:101:0x0346, B:103:0x0352, B:104:0x0354, B:105:0x0365, B:107:0x036d, B:109:0x038b, B:75:0x01ef, B:77:0x01f9, B:78:0x0226, B:80:0x022e, B:84:0x023f, B:86:0x0258, B:88:0x0297, B:90:0x02ba, B:92:0x02c3, B:94:0x02c9, B:96:0x02d2, B:98:0x0323, B:112:0x03af, B:114:0x03bc, B:116:0x03c6, B:118:0x03cc, B:119:0x03db, B:121:0x03e5, B:123:0x03eb, B:124:0x03fa, B:125:0x040f, B:131:0x042f, B:133:0x043c, B:135:0x0442, B:136:0x0451, B:144:0x0476, B:146:0x047a, B:148:0x0482, B:154:0x04b5, B:156:0x04e4, B:157:0x04ea, B:150:0x0490, B:153:0x0497, B:164:0x0517, B:211:0x0734, B:213:0x0743, B:251:0x07f5, B:229:0x078c, B:233:0x07a7, B:237:0x07b7, B:238:0x07bc), top: B:265:0x0009, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x078c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x06cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x06b1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.Runnable] */
    public final synchronized void i(int i, com.google.android.gearhead.sdk.assistant.VoiceSessionConfig voiceSessionConfig, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot clientStateSnapshot, defpackage.qke qkeVar, defpackage.qjx qjxVar, java.util.function.BiConsumer biConsumer, java.lang.Runnable runnable) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        boolean z;
        int iG;
        defpackage.lam lamVarA;
        int i9;
        int i10;
        int i11;
        defpackage.ngy ngyVarG;
        int i12;
        int i13;
        java.lang.String string;
        int i14;
        tbf tbfVar;
        osn osnVar;
        defpackage.abpj abpjVar;
        byte[] byteArray;
        int i15;
        defpackage.ots otsVarB;
        com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot gearheadStateSnapshot;
        defpackage.abor aborVarN;
        defpackage.htw htwVar;
        defpackage.abor aborVarN2;
        java.lang.String str;
        osh oshVar;
        defpackage.abpj abpjVar2;
        java.lang.String str2;
        int i16;
        android.location.Location location;
        abtl abtlVarU;
        abtm abtmVar;
        java.util.Iterator it;
        java.lang.String str3;
        java.util.List list;
        osj osjVarD;
        byte[] byteArray2;
        java.lang.String string2;
        qkeVar.getClass();
        qjxVar.getClass();
        int i17 = 1;
        if (!s()) {
            i2 = 3;
            i3 = 8;
            i4 = 4;
            i5 = 10;
            i6 = 5;
            qjy qjyVar = this.k;
            if (qjyVar != null) {
                try {
                    android.os.Parcel parcelFp = qjyVar.fp();
                    defpackage.ijx.g(parcelFp, voiceSessionConfig);
                    defpackage.ijx.g(parcelFp, clientStateSnapshot);
                    defpackage.ijx.i(parcelFp, qkeVar);
                    defpackage.ijx.i(parcelFp, qjxVar);
                    qjyVar.fr(1, parcelFp);
                    i7 = voiceSessionConfig.f;
                    i8 = voiceSessionConfig.a;
                    j = voiceSessionConfig.g;
                    z = voiceSessionConfig.i;
                    iG = defpackage.lam.g(i7);
                    lamVarA = defpackage.lam.a();
                    switch (i8) {
                        case 1:
                            i9 = 2;
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            i9 = i2;
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            i9 = i4;
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            i9 = i6;
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            i9 = 6;
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            i9 = 7;
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            i9 = i3;
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            i9 = 9;
                            break;
                        case 9:
                            i9 = i5;
                            break;
                        case 10:
                            i9 = 11;
                            break;
                        default:
                            i9 = 1;
                            break;
                    }
                    synchronized (lamVarA.a) {
                        ((defpackage.lan) lamVarA.b).b();
                        lamVarA.b = new defpackage.lan(i, iG, i9, clientStateSnapshot, j);
                        java.lang.Object obj = lamVarA.b;
                        if (i7 == i4) {
                            i10 = 11;
                        } else {
                            i10 = 41;
                        }
                        ((defpackage.lan) obj).c(i10, null);
                        java.lang.Object obj2 = lamVarA.b;
                        if (true != z) {
                            i11 = 102;
                        } else {
                            i11 = 101;
                        }
                        ((defpackage.lan) obj2).c(i11, null);
                        defpackage.omf.u().t(defpackage.yxo.VOICE_SESSION_STARTED, iG, i9, null, 1, null, null, defpackage.yxp.UNKNOWN_CANCEL_TRIGGER);
                        if (i9 == 2) {
                            ngyVarG = defpackage.ngy.g();
                            ngyVarG.h(lal.a);
                            if (iG == 4) {
                                ngyVarG.h(lal.b);
                            }
                            defpackage.wfp.d(lamVarA.c, 5000L);
                        }
                    }
                } catch (android.os.RemoteException e) {
                    a$.ExternalSyntheticApiModelOutline2.m(biConsumer, e, defpackage.yxo.START_VOICE_SESSION_REMOTE_EXCEPTION);
                    return;
                }
            }
        }
        defpackage.taf tafVar = this.e;
        defpackage.abor aborVarN3 = osk.a.n();
        aborVarN3.getClass();
        switch (voiceSessionConfig.a) {
            case 1:
                i12 = 2;
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                i12 = 3;
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                i12 = 4;
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                i12 = 5;
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                i12 = 6;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                i12 = 7;
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                i12 = 8;
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                i12 = 9;
                break;
            case 9:
                i12 = 10;
                break;
            case 10:
                i12 = 11;
                break;
            default:
                i12 = 1;
                break;
        }
        aborVarN3.t();
        osk oskVar = aborVarN3.b;
        oskVar.e = i12 - 1;
        oskVar.b |= 1;
        switch (voiceSessionConfig.f) {
            case 1:
                i13 = 2;
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                i13 = 3;
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                i13 = 4;
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                i13 = 5;
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                i13 = 6;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                i13 = 7;
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                i13 = 8;
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
            default:
                i13 = 1;
                break;
            case 9:
                i13 = 10;
                break;
            case 10:
                i13 = 11;
                break;
            case 11:
                i13 = 12;
                break;
        }
        aborVarN3.t();
        osk oskVar2 = aborVarN3.b;
        oskVar2.f = i13 - 1;
        oskVar2.b |= 2;
        android.net.Uri uri = voiceSessionConfig.d;
        if (uri == null || (string = uri.toString()) == null) {
            string = "";
        }
        string.getClass();
        aborVarN3.t();
        osk oskVar3 = aborVarN3.b;
        oskVar3.b |= 4;
        oskVar3.g = string;
        int i18 = voiceSessionConfig.e;
        aborVarN3.t();
        osk oskVar4 = aborVarN3.b;
        oskVar4.b |= 8;
        oskVar4.h = i18;
        defpackage.abqv abqvVarB = defpackage.abrx.b(voiceSessionConfig.g);
        abqvVarB.getClass();
        aborVarN3.t();
        osk oskVar5 = aborVarN3.b;
        oskVar5.i = abqvVarB;
        oskVar5.b |= 16;
        java.lang.String str4 = voiceSessionConfig.k;
        if (str4 == null) {
            str4 = "";
        }
        aborVarN3.t();
        osk oskVar6 = aborVarN3.b;
        oskVar6.b |= 32;
        oskVar6.j = str4;
        boolean z2 = voiceSessionConfig.o;
        aborVarN3.t();
        osk oskVar7 = aborVarN3.b;
        oskVar7.b |= 64;
        oskVar7.k = z2;
        int i19 = voiceSessionConfig.f;
        if (i19 == 4) {
            if (voiceSessionConfig.a == 9) {
                defpackage.abor aborVarN4 = osj.a.n();
                aborVarN4.getClass();
                android.os.Bundle bundle = voiceSessionConfig.h;
                if (bundle != null && (string2 = bundle.getString("VOICE_SESSION_DEEPLINK_KEY", "")) != null && string2.length() > 0) {
                    aborVarN4.t();
                    osj osjVar = aborVarN4.b;
                    osjVar.b |= 4;
                    osjVar.d = string2;
                    aborVarN4.t();
                    osj osjVar2 = aborVarN4.b;
                    osjVar2.b |= 2;
                    osjVar2.c = "and.gsa.fusion.deeplink";
                }
                defpackage.otn.C(defpackage.otn.D(aborVarN4), aborVarN3);
            } else {
                try {
                    android.os.Bundle bundle2 = voiceSessionConfig.h;
                    if (bundle2 != null && (byteArray2 = bundle2.getByteArray("assistant_invocation_params")) != null) {
                        osjVarD = (osj) defpackage.abox.B(osj.a, byteArray2, defpackage.abol.a());
                        if (osjVarD == null) {
                        }
                        defpackage.otn.C(osjVarD, aborVarN3);
                    }
                    defpackage.abor aborVarN5 = osj.a.n();
                    aborVarN5.getClass();
                    osjVarD = defpackage.otn.D(aborVarN5);
                } catch (defpackage.abpp e2) {
                    ((defpackage.ype) ((defpackage.ype) tag.a.g()).p(e2).ai(9009)).u("Error parsing AssistantInvocationParams");
                    defpackage.abor aborVarN6 = osj.a.n();
                    aborVarN6.getClass();
                    osjVarD = defpackage.otn.D(aborVarN6);
                }
                defpackage.otn.C(osjVarD, aborVarN3);
            }
            i17 = 1;
            i4 = 4;
            i14 = 7;
        } else {
            int i20 = voiceSessionConfig.a;
            if (i20 == 4) {
                defpackage.abor aborVarN7 = osm.a.n();
                aborVarN7.getClass();
                java.lang.String str5 = voiceSessionConfig.c;
                if (str5 == null) {
                    str5 = "";
                }
                aborVarN7.t();
                osm osmVar = aborVarN7.b;
                osmVar.b |= 1;
                osmVar.c = str5;
                android.os.Bundle bundle3 = voiceSessionConfig.h;
                if (bundle3 != null) {
                    if (bundle3.getBoolean("IS_SEND_FEEDBACK_QUERY")) {
                        aborVarN7.t();
                        osm osmVar2 = aborVarN7.b;
                        osmVar2.b |= 4;
                        osmVar2.e = true;
                        defpackage.abor aborVarN8 = oss.a.n();
                        aborVarN8.getClass();
                        aborVarN8.t();
                        oss ossVar = aborVarN8.b;
                        ossVar.b = 1;
                        i4 = 4;
                        ossVar.c = java.lang.Boolean.TRUE;
                        defpackage.otn.w(defpackage.otn.N(aborVarN8), aborVarN7);
                    } else {
                        i4 = 4;
                        if (bundle3.getBoolean("IS_MAKE_A_CALL_QUERY")) {
                            aborVarN7.t();
                            osm osmVar3 = aborVarN7.b;
                            osmVar3.b |= 16;
                            osmVar3.g = true;
                            defpackage.abor aborVarN9 = oss.a.n();
                            aborVarN9.getClass();
                            aborVarN9.t();
                            oss ossVar2 = aborVarN9.b;
                            ossVar2.b = 2;
                            ossVar2.c = java.lang.Boolean.TRUE;
                            defpackage.otn.w(defpackage.otn.N(aborVarN9), aborVarN7);
                        } else {
                            if (bundle3.getBoolean("IS_SEND_A_MESSAGE_QUERY") || bundle3.getBoolean("IS_SEND_A_MESSAGE_TO_CONTACT_QUERY")) {
                                java.lang.String string3 = bundle3.getString("SEND_A_MESSAGE_APP_NAME", "");
                                java.lang.String string4 = bundle3.getString("SEND_A_MESSAGE_APP_PACKAGE_NAME", "");
                                string3.getClass();
                                if (string3.length() > 0) {
                                    defpackage.abor aborVarN10 = oss.a.n();
                                    aborVarN10.getClass();
                                    defpackage.abor aborVarN11 = osr.a.n();
                                    aborVarN11.getClass();
                                    aborVarN11.t();
                                    osr osrVar = aborVarN11.b;
                                    osrVar.b |= 1;
                                    osrVar.c = string3;
                                    string4.getClass();
                                    aborVarN11.t();
                                    osr osrVar2 = aborVarN11.b;
                                    osrVar2.b |= 4;
                                    osrVar2.e = string4;
                                    if (bundle3.getBoolean("IS_SEND_A_MESSAGE_TO_CONTACT_QUERY")) {
                                        java.lang.String string5 = bundle3.getString("SEND_A_MESSAGE_RECIPIENT_APP_UNIQUE_ID", "");
                                        java.lang.String string6 = bundle3.getString("SEND_A_MESSAGE_RECIPIENT_NAME", "");
                                        i15 = 8;
                                        java.lang.String string7 = bundle3.getString("SEND_A_MESSAGE_APP_MIMETYPE", "");
                                        string5.getClass();
                                        if (string5.length() > 0) {
                                            string6.getClass();
                                            if (string6.length() > 0 && string4.length() > 0) {
                                                string7.getClass();
                                                if (string7.length() > 0) {
                                                    aborVarN11.t();
                                                    osr osrVar3 = aborVarN11.b;
                                                    osrVar3.b |= 8;
                                                    osrVar3.f = string7;
                                                    defpackage.abor aborVarN12 = osp.a.n();
                                                    aborVarN12.getClass();
                                                    aborVarN12.t();
                                                    osp ospVar = aborVarN12.b;
                                                    ospVar.b |= 1;
                                                    ospVar.c = string5;
                                                    aborVarN12.t();
                                                    osp ospVar2 = aborVarN12.b;
                                                    ospVar2.b |= 2;
                                                    ospVar2.d = string6;
                                                    osp ospVarQ = aborVarN12.q();
                                                    ospVarQ.getClass();
                                                    aborVarN11.t();
                                                    osr osrVar4 = aborVarN11.b;
                                                    osrVar4.d = ospVarQ;
                                                    osrVar4.b |= 2;
                                                }
                                            }
                                        }
                                    } else {
                                        i15 = 8;
                                    }
                                    osr osrVarQ = aborVarN11.q();
                                    osrVarQ.getClass();
                                    aborVarN10.t();
                                    oss ossVar3 = aborVarN10.b;
                                    ossVar3.c = osrVarQ;
                                    ossVar3.b = 3;
                                    defpackage.otn.w(defpackage.otn.N(aborVarN10), aborVarN7);
                                }
                            }
                            if (bundle3.containsKey("DIRECT_QUERY_TRIGGER_ID")) {
                                otsVarB = defpackage.ots.b(bundle3.getInt("DIRECT_QUERY_TRIGGER_ID"));
                                if (otsVarB == null) {
                                    otsVarB = defpackage.ots.EVENT_TYPE_UNSPECIFIED;
                                }
                                aborVarN7.t();
                                osm osmVar4 = aborVarN7.b;
                                osmVar4.d = otsVarB.C;
                                osmVar4.b |= 2;
                            }
                            if (bundle3.containsKey("DIRECT_QUERY_FROM_GEARHEAD_ID")) {
                                long j2 = bundle3.getLong("DIRECT_QUERY_FROM_GEARHEAD_ID");
                                aborVarN7.t();
                                osm osmVar5 = aborVarN7.b;
                                osmVar5.b |= 8;
                                osmVar5.f = j2;
                            }
                        }
                    }
                    i15 = 8;
                    if (bundle3.containsKey("DIRECT_QUERY_TRIGGER_ID")) {
                        otsVarB = defpackage.ots.b(bundle3.getInt("DIRECT_QUERY_TRIGGER_ID"));
                        if (otsVarB == null) {
                            otsVarB = defpackage.ots.EVENT_TYPE_UNSPECIFIED;
                        }
                        aborVarN7.t();
                        osm osmVar6 = aborVarN7.b;
                        osmVar6.d = otsVarB.C;
                        osmVar6.b |= 2;
                    }
                    if (bundle3.containsKey("DIRECT_QUERY_FROM_GEARHEAD_ID")) {
                        long j3 = bundle3.getLong("DIRECT_QUERY_FROM_GEARHEAD_ID");
                        aborVarN7.t();
                        osm osmVar7 = aborVarN7.b;
                        osmVar7.b |= 8;
                        osmVar7.f = j3;
                    }
                } else {
                    i17 = 1;
                    i15 = 8;
                    i4 = 4;
                }
                osm osmVarQ = aborVarN7.q();
                osmVarQ.getClass();
                aborVarN3.t();
                osk oskVar8 = aborVarN3.b;
                oskVar8.d = osmVarQ;
                oskVar8.c = i15;
                i14 = 7;
            } else {
                i17 = 1;
                i4 = 4;
                i14 = 7;
                if (i20 == 7) {
                    defpackage.abor aborVarN13 = osq.a.n();
                    aborVarN13.getClass();
                    android.os.Bundle bundle4 = voiceSessionConfig.h;
                    if (bundle4 != null) {
                        java.lang.String string8 = bundle4.getString("RECIPIENT_NAME_KEY", "");
                        if (string8 != null && string8.length() > 0) {
                            aborVarN13.t();
                            osq osqVar = aborVarN13.b;
                            osqVar.b |= 1;
                            osqVar.c = string8;
                        }
                        java.lang.String string9 = bundle4.getString("PHONE_NUMBER_KEY", "");
                        if (string9 != null && string9.length() > 0) {
                            aborVarN13.t();
                            osq osqVar2 = aborVarN13.b;
                            osqVar2.b |= 2;
                            osqVar2.d = string9;
                        }
                        boolean z3 = bundle4.getBoolean("ADD_PRE_DIALOG_CONFIRMATION_KEY");
                        aborVarN13.t();
                        osq osqVar3 = aborVarN13.b;
                        osqVar3.b |= 4;
                        osqVar3.e = z3;
                    }
                    osq osqVarQ = aborVarN13.q();
                    osqVarQ.getClass();
                    aborVarN3.t();
                    osk oskVar9 = aborVarN3.b;
                    oskVar9.d = osqVarQ;
                    oskVar9.c = 9;
                } else {
                    if (i20 != 5) {
                        if (i20 != 2) {
                            i5 = 10;
                            if (i20 == 10) {
                            }
                            defpackage.abox aboxVarQ = aborVarN3.q();
                            aboxVarQ.getClass();
                            osk oskVar10 = (osk) aboxVarQ;
                            gearheadStateSnapshot = clientStateSnapshot.c;
                            android.content.Context context = this.d;
                            aborVarN = osh.a.n();
                            aborVarN.getClass();
                            htwVar = new defpackage.htw(context, (char[]) null, (byte[]) null);
                            if (gearheadStateSnapshot == null) {
                                i2 = 3;
                                i6 = 5;
                                i3 = 8;
                            } else {
                                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(aborVarN.b.c);
                                listUnmodifiableList.getClass();
                                new abrl(listUnmodifiableList);
                                aborVarN2 = osf.a.n();
                                aborVarN2.getClass();
                                int iB = tag.b(gearheadStateSnapshot.b);
                                aborVarN2.t();
                                osf osfVar = aborVarN2.b;
                                osfVar.c = iB - 1;
                                osfVar.b |= 1;
                                str = gearheadStateSnapshot.g;
                                if (str != null && str.length() > 0) {
                                    aborVarN2.t();
                                    osf osfVar2 = aborVarN2.b;
                                    osfVar2.b |= 2;
                                    osfVar2.d = str;
                                }
                                osf osfVarQ = aborVarN2.q();
                                osfVarQ.getClass();
                                osf osfVar3 = osfVarQ;
                                aborVarN.t();
                                oshVar = aborVarN.b;
                                abpjVar2 = oshVar.c;
                                if (!abpjVar2.c()) {
                                    oshVar.c = defpackage.abox.I(abpjVar2);
                                }
                                oshVar.c.add(osfVar3);
                                boolean z4 = gearheadStateSnapshot.c;
                                aborVarN.t();
                                osh oshVar2 = aborVarN.b;
                                oshVar2.b |= 1;
                                oshVar2.d = z4;
                                long j4 = gearheadStateSnapshot.d;
                                aborVarN.t();
                                osh oshVar3 = aborVarN.b;
                                oshVar3.b |= 2;
                                oshVar3.e = j4;
                                str2 = gearheadStateSnapshot.e;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                aborVarN.t();
                                osh oshVar4 = aborVarN.b;
                                oshVar4.b |= 4;
                                oshVar4.g = str2;
                                switch (gearheadStateSnapshot.f) {
                                    case 1:
                                        i16 = 2;
                                        break;
                                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                        i16 = 3;
                                        break;
                                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                        i16 = i4;
                                        break;
                                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                        i16 = 5;
                                        break;
                                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                        i16 = 6;
                                        break;
                                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                        i16 = i14;
                                        break;
                                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                        i16 = 8;
                                        break;
                                    default:
                                        i16 = i17;
                                        break;
                                }
                                aborVarN.t();
                                osh oshVar5 = aborVarN.b;
                                oshVar5.h = i16 - 1;
                                i3 = 8;
                                oshVar5.b |= 8;
                                location = gearheadStateSnapshot.i;
                                if (location == null) {
                                    abtmVar = abtm.a;
                                    abtmVar.getClass();
                                } else {
                                    abtlVarU = htwVar.u(location);
                                    abtlVarU.getClass();
                                    if (defpackage.afga.f(abtlVarU, abtl.a)) {
                                        abtmVar = abtm.a;
                                        abtmVar.getClass();
                                    } else {
                                        defpackage.abor aborVarN14 = abtm.a.n();
                                        aborVarN14.aj(abtlVarU);
                                        abtm abtmVarQ = aborVarN14.q();
                                        abtmVarQ.getClass();
                                        abtmVar = abtmVarQ;
                                    }
                                }
                                aborVarN.t();
                                osh oshVar6 = aborVarN.b;
                                oshVar6.i = abtmVar;
                                oshVar6.b |= 16;
                                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i17);
                                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i4);
                                i6 = 5;
                                i2 = 3;
                                java.lang.Integer[] numArr = new java.lang.Integer[5];
                                numArr[0] = numValueOf;
                                numArr[i17] = 2;
                                numArr[2] = 3;
                                numArr[3] = numValueOf2;
                                numArr[i4] = 5;
                                it = defpackage.afga.ac(numArr).iterator();
                                while (it.hasNext()) {
                                    int iIntValue = ((java.lang.Number) it.next()).intValue();
                                    str3 = (java.lang.String) defpackage.abc.a(gearheadStateSnapshot.h, iIntValue);
                                    if (str3 == null && str3.length() > 0) {
                                        j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(aborVarN.b.f)).getClass();
                                        int iB2 = tag.b(iIntValue) - 1;
                                        aborVarN.t();
                                        osh oshVar7 = aborVarN.b;
                                        defpackage.abpv abpvVar = oshVar7.f;
                                        if (!abpvVar.b) {
                                            oshVar7.f = abpvVar.a();
                                        }
                                        oshVar7.f.put(java.lang.Integer.valueOf(iB2), str3);
                                    }
                                }
                            }
                            defpackage.abox aboxVarQ2 = aborVarN.q();
                            aboxVarQ2.getClass();
                            osh oshVar8 = (osh) aboxVarQ2;
                            list = clientStateSnapshot.b;
                            if (list == null) {
                                list = defpackage.afce.a;
                            }
                            tafVar.k(oskVar10, oshVar8, list, this.j, new szs(biConsumer), this.h.i, runnable);
                            this.j = false;
                            i7 = voiceSessionConfig.f;
                            i8 = voiceSessionConfig.a;
                            j = voiceSessionConfig.g;
                            z = voiceSessionConfig.i;
                            iG = defpackage.lam.g(i7);
                            lamVarA = defpackage.lam.a();
                            switch (i8) {
                                case 1:
                                    i9 = 2;
                                    break;
                                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                    i9 = i2;
                                    break;
                                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                    i9 = i4;
                                    break;
                                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                    i9 = i6;
                                    break;
                                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                    i9 = 6;
                                    break;
                                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                    i9 = 7;
                                    break;
                                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                    i9 = i3;
                                    break;
                                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                    i9 = 9;
                                    break;
                                case 9:
                                    i9 = i5;
                                    break;
                                case 10:
                                    i9 = 11;
                                    break;
                                default:
                                    i9 = 1;
                                    break;
                            }
                            synchronized (lamVarA.a) {
                                ((defpackage.lan) lamVarA.b).b();
                                lamVarA.b = new defpackage.lan(i, iG, i9, clientStateSnapshot, j);
                                java.lang.Object obj3 = lamVarA.b;
                                if (i7 == i4) {
                                    i10 = 11;
                                } else {
                                    i10 = 41;
                                }
                                ((defpackage.lan) obj3).c(i10, null);
                                java.lang.Object obj4 = lamVarA.b;
                                if (true != z) {
                                    i11 = 102;
                                } else {
                                    i11 = 101;
                                }
                                ((defpackage.lan) obj4).c(i11, null);
                            }
                            defpackage.omf.u().t(defpackage.yxo.VOICE_SESSION_STARTED, iG, i9, null, 1, null, null, defpackage.yxp.UNKNOWN_CANCEL_TRIGGER);
                            if (i9 == 2) {
                                ngyVarG = defpackage.ngy.g();
                                ngyVarG.h(lal.a);
                                if (iG == 4) {
                                    ngyVarG.h(lal.b);
                                }
                                defpackage.wfp.d(lamVarA.c, 5000L);
                            }
                        }
                        i5 = 10;
                        defpackage.abor aborVarN15 = oso.a.n();
                        aborVarN15.getClass();
                        boolean z5 = voiceSessionConfig.n;
                        aborVarN15.t();
                        oso osoVar = aborVarN15.b;
                        osoVar.b |= 1;
                        osoVar.c = z5;
                        oso osoVarQ = aborVarN15.q();
                        osoVarQ.getClass();
                        aborVarN3.t();
                        osk oskVar11 = aborVarN3.b;
                        oskVar11.d = osoVarQ;
                        oskVar11.c = 13;
                        defpackage.abox aboxVarQ3 = aborVarN3.q();
                        aboxVarQ3.getClass();
                        osk oskVar12 = (osk) aboxVarQ3;
                        gearheadStateSnapshot = clientStateSnapshot.c;
                        android.content.Context context2 = this.d;
                        aborVarN = osh.a.n();
                        aborVarN.getClass();
                        htwVar = new defpackage.htw(context2, (char[]) null, (byte[]) null);
                        if (gearheadStateSnapshot == null) {
                            i2 = 3;
                            i6 = 5;
                            i3 = 8;
                        } else {
                            java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(aborVarN.b.c);
                            listUnmodifiableList2.getClass();
                            new abrl(listUnmodifiableList2);
                            aborVarN2 = osf.a.n();
                            aborVarN2.getClass();
                            int iB3 = tag.b(gearheadStateSnapshot.b);
                            aborVarN2.t();
                            osf osfVar4 = aborVarN2.b;
                            osfVar4.c = iB3 - 1;
                            osfVar4.b |= 1;
                            str = gearheadStateSnapshot.g;
                            if (str != null) {
                                aborVarN2.t();
                                osf osfVar5 = aborVarN2.b;
                                osfVar5.b |= 2;
                                osfVar5.d = str;
                            }
                            osf osfVarQ2 = aborVarN2.q();
                            osfVarQ2.getClass();
                            osf osfVar6 = osfVarQ2;
                            aborVarN.t();
                            oshVar = aborVarN.b;
                            abpjVar2 = oshVar.c;
                            if (!abpjVar2.c()) {
                                oshVar.c = defpackage.abox.I(abpjVar2);
                            }
                            oshVar.c.add(osfVar6);
                            boolean z6 = gearheadStateSnapshot.c;
                            aborVarN.t();
                            osh oshVar9 = aborVarN.b;
                            oshVar9.b |= 1;
                            oshVar9.d = z6;
                            long j5 = gearheadStateSnapshot.d;
                            aborVarN.t();
                            osh oshVar10 = aborVarN.b;
                            oshVar10.b |= 2;
                            oshVar10.e = j5;
                            str2 = gearheadStateSnapshot.e;
                            if (str2 == null) {
                                str2 = "";
                            }
                            aborVarN.t();
                            osh oshVar11 = aborVarN.b;
                            oshVar11.b |= 4;
                            oshVar11.g = str2;
                            switch (gearheadStateSnapshot.f) {
                                case 1:
                                    i16 = 2;
                                    break;
                                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                    i16 = 3;
                                    break;
                                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                    i16 = i4;
                                    break;
                                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                    i16 = 5;
                                    break;
                                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                    i16 = 6;
                                    break;
                                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                    i16 = i14;
                                    break;
                                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                    i16 = 8;
                                    break;
                                default:
                                    i16 = i17;
                                    break;
                            }
                            aborVarN.t();
                            osh oshVar12 = aborVarN.b;
                            oshVar12.h = i16 - 1;
                            i3 = 8;
                            oshVar12.b |= 8;
                            location = gearheadStateSnapshot.i;
                            if (location == null) {
                                abtmVar = abtm.a;
                                abtmVar.getClass();
                            } else {
                                abtlVarU = htwVar.u(location);
                                abtlVarU.getClass();
                                if (defpackage.afga.f(abtlVarU, abtl.a)) {
                                    abtmVar = abtm.a;
                                    abtmVar.getClass();
                                } else {
                                    defpackage.abor aborVarN16 = abtm.a.n();
                                    aborVarN16.aj(abtlVarU);
                                    abtm abtmVarQ2 = aborVarN16.q();
                                    abtmVarQ2.getClass();
                                    abtmVar = abtmVarQ2;
                                }
                            }
                            aborVarN.t();
                            osh oshVar13 = aborVarN.b;
                            oshVar13.i = abtmVar;
                            oshVar13.b |= 16;
                            java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i17);
                            java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(i4);
                            i6 = 5;
                            i2 = 3;
                            java.lang.Integer[] numArr2 = new java.lang.Integer[5];
                            numArr2[0] = numValueOf3;
                            numArr2[i17] = 2;
                            numArr2[2] = 3;
                            numArr2[3] = numValueOf4;
                            numArr2[i4] = 5;
                            it = defpackage.afga.ac(numArr2).iterator();
                            while (it.hasNext()) {
                                int iIntValue2 = ((java.lang.Number) it.next()).intValue();
                                str3 = (java.lang.String) defpackage.abc.a(gearheadStateSnapshot.h, iIntValue2);
                                if (str3 == null) {
                                }
                            }
                        }
                        defpackage.abox aboxVarQ4 = aborVarN.q();
                        aboxVarQ4.getClass();
                        osh oshVar14 = (osh) aboxVarQ4;
                        list = clientStateSnapshot.b;
                        if (list == null) {
                            list = defpackage.afce.a;
                        }
                        tafVar.k(oskVar12, oshVar14, list, this.j, new szs(biConsumer), this.h.i, runnable);
                        this.j = false;
                        i7 = voiceSessionConfig.f;
                        i8 = voiceSessionConfig.a;
                        j = voiceSessionConfig.g;
                        z = voiceSessionConfig.i;
                        iG = defpackage.lam.g(i7);
                        lamVarA = defpackage.lam.a();
                        switch (i8) {
                            case 1:
                                i9 = 2;
                                break;
                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                i9 = i2;
                                break;
                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                i9 = i4;
                                break;
                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                i9 = i6;
                                break;
                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                i9 = 6;
                                break;
                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                i9 = 7;
                                break;
                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                i9 = i3;
                                break;
                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                i9 = 9;
                                break;
                            case 9:
                                i9 = i5;
                                break;
                            case 10:
                                i9 = 11;
                                break;
                            default:
                                i9 = 1;
                                break;
                        }
                        synchronized (lamVarA.a) {
                            ((defpackage.lan) lamVarA.b).b();
                            lamVarA.b = new defpackage.lan(i, iG, i9, clientStateSnapshot, j);
                            java.lang.Object obj5 = lamVarA.b;
                            if (i7 == i4) {
                                i10 = 11;
                            } else {
                                i10 = 41;
                            }
                            ((defpackage.lan) obj5).c(i10, null);
                            java.lang.Object obj6 = lamVarA.b;
                            if (true != z) {
                                i11 = 102;
                            } else {
                                i11 = 101;
                            }
                            ((defpackage.lan) obj6).c(i11, null);
                            defpackage.omf.u().t(defpackage.yxo.VOICE_SESSION_STARTED, iG, i9, null, 1, null, null, defpackage.yxp.UNKNOWN_CANCEL_TRIGGER);
                            if (i9 == 2) {
                                ngyVarG = defpackage.ngy.g();
                                ngyVarG.h(lal.a);
                                if (iG == 4) {
                                    ngyVarG.h(lal.b);
                                }
                                defpackage.wfp.d(lamVarA.c, 5000L);
                            }
                        }
                    }
                    if (i19 == 6) {
                        defpackage.abor aborVarN17 = osl.a.n();
                        aborVarN17.getClass();
                        java.lang.String str6 = voiceSessionConfig.m;
                        if (str6 != null && str6.length() > 0) {
                            aborVarN17.t();
                            osl oslVar = aborVarN17.b;
                            oslVar.b |= 1;
                            oslVar.c = str6;
                        }
                        osl oslVarQ = aborVarN17.q();
                        oslVarQ.getClass();
                        aborVarN3.t();
                        osk oskVar13 = aborVarN3.b;
                        oskVar13.d = oslVarQ;
                        oskVar13.c = 10;
                    } else if (i19 == 5 || i19 == 9) {
                        try {
                            android.os.Bundle bundle5 = voiceSessionConfig.h;
                            if (bundle5 != null && (byteArray = bundle5.getByteArray("DISPLAYED_MEDIA_RECS_ON_SIDECARD")) != null) {
                                tbfVar = (tbf) defpackage.abox.B(tbf.a, byteArray, defpackage.abol.a());
                                if (tbfVar == null) {
                                }
                                defpackage.abor aborVarN18 = osn.a.n();
                                aborVarN18.getClass();
                                java.util.List listUnmodifiableList3 = j$.util.DesugarCollections.unmodifiableList(aborVarN18.b.b);
                                listUnmodifiableList3.getClass();
                                new abrl(listUnmodifiableList3);
                                defpackage.abpj abpjVar3 = tbfVar.b;
                                abpjVar3.getClass();
                                aborVarN18.t();
                                osnVar = aborVarN18.b;
                                abpjVar = osnVar.b;
                                if (!abpjVar.c()) {
                                    osnVar.b = defpackage.abox.I(abpjVar);
                                }
                                defpackage.abnf.i(abpjVar3, osnVar.b);
                                osn osnVarQ = aborVarN18.q();
                                osnVarQ.getClass();
                                aborVarN3.t();
                                osk oskVar14 = aborVarN3.b;
                                oskVar14.d = osnVarQ;
                                oskVar14.c = 11;
                            }
                            tbfVar = tbf.a;
                            tbfVar.getClass();
                        } catch (defpackage.abpp e3) {
                            ((defpackage.ype) ((defpackage.ype) tag.a.h()).p(e3).ai(9008)).u("Failed to parse displayed media recs from the CustomPayload.");
                            tbfVar = tbf.a;
                            tbfVar.getClass();
                        }
                        defpackage.abor aborVarN19 = osn.a.n();
                        aborVarN19.getClass();
                        java.util.List listUnmodifiableList4 = j$.util.DesugarCollections.unmodifiableList(aborVarN19.b.b);
                        listUnmodifiableList4.getClass();
                        new abrl(listUnmodifiableList4);
                        defpackage.abpj abpjVar4 = tbfVar.b;
                        abpjVar4.getClass();
                        aborVarN19.t();
                        osnVar = aborVarN19.b;
                        abpjVar = osnVar.b;
                        if (!abpjVar.c()) {
                            osnVar.b = defpackage.abox.I(abpjVar);
                        }
                        defpackage.abnf.i(abpjVar4, osnVar.b);
                        osn osnVarQ2 = aborVarN19.q();
                        osnVarQ2.getClass();
                        aborVarN3.t();
                        osk oskVar15 = aborVarN3.b;
                        oskVar15.d = osnVarQ2;
                        oskVar15.c = 11;
                    }
                }
            }
        }
        i5 = 10;
        defpackage.abox aboxVarQ5 = aborVarN3.q();
        aboxVarQ5.getClass();
        osk oskVar16 = (osk) aboxVarQ5;
        gearheadStateSnapshot = clientStateSnapshot.c;
        android.content.Context context3 = this.d;
        aborVarN = osh.a.n();
        aborVarN.getClass();
        htwVar = new defpackage.htw(context3, (char[]) null, (byte[]) null);
        if (gearheadStateSnapshot == null) {
            i2 = 3;
            i6 = 5;
            i3 = 8;
        } else {
            java.util.List listUnmodifiableList5 = j$.util.DesugarCollections.unmodifiableList(aborVarN.b.c);
            listUnmodifiableList5.getClass();
            new abrl(listUnmodifiableList5);
            aborVarN2 = osf.a.n();
            aborVarN2.getClass();
            int iB4 = tag.b(gearheadStateSnapshot.b);
            aborVarN2.t();
            osf osfVar7 = aborVarN2.b;
            osfVar7.c = iB4 - 1;
            osfVar7.b |= 1;
            str = gearheadStateSnapshot.g;
            if (str != null) {
                aborVarN2.t();
                osf osfVar8 = aborVarN2.b;
                osfVar8.b |= 2;
                osfVar8.d = str;
            }
            osf osfVarQ3 = aborVarN2.q();
            osfVarQ3.getClass();
            osf osfVar9 = osfVarQ3;
            aborVarN.t();
            oshVar = aborVarN.b;
            abpjVar2 = oshVar.c;
            if (!abpjVar2.c()) {
                oshVar.c = defpackage.abox.I(abpjVar2);
            }
            oshVar.c.add(osfVar9);
            boolean z7 = gearheadStateSnapshot.c;
            aborVarN.t();
            osh oshVar15 = aborVarN.b;
            oshVar15.b |= 1;
            oshVar15.d = z7;
            long j6 = gearheadStateSnapshot.d;
            aborVarN.t();
            osh oshVar16 = aborVarN.b;
            oshVar16.b |= 2;
            oshVar16.e = j6;
            str2 = gearheadStateSnapshot.e;
            if (str2 == null) {
                str2 = "";
            }
            aborVarN.t();
            osh oshVar17 = aborVarN.b;
            oshVar17.b |= 4;
            oshVar17.g = str2;
            switch (gearheadStateSnapshot.f) {
                case 1:
                    i16 = 2;
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    i16 = 3;
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    i16 = i4;
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    i16 = 5;
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    i16 = 6;
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    i16 = i14;
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    i16 = 8;
                    break;
                default:
                    i16 = i17;
                    break;
            }
            aborVarN.t();
            osh oshVar18 = aborVarN.b;
            oshVar18.h = i16 - 1;
            i3 = 8;
            oshVar18.b |= 8;
            location = gearheadStateSnapshot.i;
            if (location == null) {
                abtmVar = abtm.a;
                abtmVar.getClass();
            } else {
                abtlVarU = htwVar.u(location);
                abtlVarU.getClass();
                if (defpackage.afga.f(abtlVarU, abtl.a)) {
                    abtmVar = abtm.a;
                    abtmVar.getClass();
                } else {
                    defpackage.abor aborVarN110 = abtm.a.n();
                    aborVarN110.aj(abtlVarU);
                    abtm abtmVarQ3 = aborVarN110.q();
                    abtmVarQ3.getClass();
                    abtmVar = abtmVarQ3;
                }
            }
            aborVarN.t();
            osh oshVar19 = aborVarN.b;
            oshVar19.i = abtmVar;
            oshVar19.b |= 16;
            java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(i17);
            java.lang.Integer numValueOf6 = java.lang.Integer.valueOf(i4);
            i6 = 5;
            i2 = 3;
            java.lang.Integer[] numArr3 = new java.lang.Integer[5];
            numArr3[0] = numValueOf5;
            numArr3[i17] = 2;
            numArr3[2] = 3;
            numArr3[3] = numValueOf6;
            numArr3[i4] = 5;
            it = defpackage.afga.ac(numArr3).iterator();
            while (it.hasNext()) {
                int iIntValue3 = ((java.lang.Number) it.next()).intValue();
                str3 = (java.lang.String) defpackage.abc.a(gearheadStateSnapshot.h, iIntValue3);
                if (str3 == null) {
                }
            }
        }
        defpackage.abox aboxVarQ6 = aborVarN.q();
        aboxVarQ6.getClass();
        osh oshVar110 = (osh) aboxVarQ6;
        list = clientStateSnapshot.b;
        if (list == null) {
            list = defpackage.afce.a;
        }
        tafVar.k(oskVar16, oshVar110, list, this.j, new szs(biConsumer), this.h.i, runnable);
        this.j = false;
        i7 = voiceSessionConfig.f;
        i8 = voiceSessionConfig.a;
        j = voiceSessionConfig.g;
        z = voiceSessionConfig.i;
        iG = defpackage.lam.g(i7);
        lamVarA = defpackage.lam.a();
        switch (i8) {
            case 1:
                i9 = 2;
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                i9 = i2;
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                i9 = i4;
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                i9 = i6;
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                i9 = 6;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                i9 = 7;
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                i9 = i3;
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                i9 = 9;
                break;
            case 9:
                i9 = i5;
                break;
            case 10:
                i9 = 11;
                break;
            default:
                i9 = 1;
                break;
        }
        synchronized (lamVarA.a) {
            ((defpackage.lan) lamVarA.b).b();
            lamVarA.b = new defpackage.lan(i, iG, i9, clientStateSnapshot, j);
            java.lang.Object obj7 = lamVarA.b;
            if (i7 == i4) {
                i10 = 11;
            } else {
                i10 = 41;
            }
            ((defpackage.lan) obj7).c(i10, null);
            java.lang.Object obj8 = lamVarA.b;
            if (true != z) {
                i11 = 102;
            } else {
                i11 = 101;
            }
            ((defpackage.lan) obj8).c(i11, null);
            defpackage.omf.u().t(defpackage.yxo.VOICE_SESSION_STARTED, iG, i9, null, 1, null, null, defpackage.yxp.UNKNOWN_CANCEL_TRIGGER);
            if (i9 == 2) {
                ngyVarG = defpackage.ngy.g();
                ngyVarG.h(lal.a);
                if (iG == 4) {
                    ngyVarG.h(lal.b);
                }
                defpackage.wfp.d(lamVarA.c, 5000L);
            }
        }
    }

    public final synchronized boolean j(szn sznVar) {
        int i = 1;
        if (this.b.c.n()) {
            ((defpackage.yqj) a.f()).u("Starting assistant initial handshake");
            defpackage.kpu.b(defpackage.yxo.SERVICE_CONNECTION_ATTEMPTED_DODGEBOOST);
            this.e.b(new defpackage.szv(this, sznVar));
            return true;
        }
        defpackage.kpu.b(defpackage.yxo.SERVICE_CONNECTION_ATTEMPTED);
        r();
        android.content.Context context = this.d;
        defpackage.yqm yqmVar = tah.a;
        android.content.Intent intentAddCategory = new android.content.Intent("android.intent.action.MAIN").addCategory("com.google.android.car.category.CAR_ASSISTANT");
        intentAddCategory.getClass();
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = context.getApplicationContext().getPackageManager().queryIntentServices(intentAddCategory, 0);
        listQueryIntentServices.getClass();
        java.util.Iterator<T> it = listQueryIntentServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) it.next();
            android.content.pm.ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (defpackage.afga.f("com.google.android.googlequicksearchbox", serviceInfo != null ? serviceInfo.packageName : null)) {
                ((defpackage.yqj) tah.a.f()).M("Found %s %s", resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                intentAddCategory.setComponent(new android.content.ComponentName("com.google.android.googlequicksearchbox", resolveInfo.serviceInfo.name));
            }
        }
        if (intentAddCategory.getComponent() == null) {
            intentAddCategory = null;
        } else {
            intentAddCategory.setAction(null);
        }
        if (intentAddCategory == null) {
            t("Failed to bind to assistant. Intent null");
            return false;
        }
        szu szuVar = new szu(this, sznVar);
        if (true == defpackage.acnf.w()) {
            i = 33;
        }
        ((defpackage.yqj) a.f()).y("Starting assistant: %s", intentAddCategory);
        boolean zBindService = context.bindService(intentAddCategory, (android.content.ServiceConnection) szuVar, i);
        this.i = zBindService;
        if (zBindService) {
            this.g = intentAddCategory;
            this.f = szuVar;
        } else {
            t("failed to connect to assistant");
        }
        return this.i;
    }

    public final synchronized boolean k() {
        return s() || this.k != null;
    }

    public final synchronized boolean l(com.google.android.gearhead.sdk.assistant.ClientRegistrationConfig clientRegistrationConfig, defpackage.osi osiVar) {
        qjy qjyVar;
        osiVar.getClass();
        this.h = osiVar;
        boolean z = true;
        if (s()) {
            int iNextInt = xyw.a.nextInt();
            szp.a.c(this.b.d, iNextInt);
            defpackage.abor aborVarN = tao.a.n();
            aborVarN.getClass();
            int i = clientRegistrationConfig.a;
            aborVarN.t();
            tao taoVar = aborVarN.b;
            taoVar.b |= 1;
            taoVar.c = i;
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(taoVar.d);
            listUnmodifiableList.getClass();
            new abrl(listUnmodifiableList);
            java.lang.Iterable iterable = clientRegistrationConfig.c;
            if (iterable == null) {
                iterable = defpackage.afce.a;
            }
            aborVarN.t();
            tao taoVar2 = aborVarN.b;
            defpackage.abpj abpjVar = taoVar2.d;
            if (!abpjVar.c()) {
                taoVar2.d = defpackage.abox.I(abpjVar);
            }
            defpackage.abnf.i(iterable, taoVar2.d);
            java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(aborVarN.b.e);
            listUnmodifiableList2.getClass();
            new abrl(listUnmodifiableList2);
            java.lang.Iterable iterable2 = clientRegistrationConfig.d;
            if (iterable2 == null) {
                iterable2 = defpackage.afce.a;
            }
            aborVarN.t();
            tao taoVar3 = aborVarN.b;
            defpackage.abpj abpjVar2 = taoVar3.e;
            if (!abpjVar2.c()) {
                taoVar3.e = defpackage.abox.I(abpjVar2);
            }
            defpackage.abnf.i(iterable2, taoVar3.e);
            java.lang.String str = clientRegistrationConfig.e;
            if (str == null) {
                str = "";
            }
            aborVarN.t();
            tao taoVar4 = aborVarN.b;
            taoVar4.b |= 2;
            taoVar4.f = str;
            java.lang.String str2 = clientRegistrationConfig.f;
            if (str2 == null) {
                str2 = "";
            }
            aborVarN.t();
            tao taoVar5 = aborVarN.b;
            taoVar5.b |= 4;
            taoVar5.g = str2;
            ose oseVar = clientRegistrationConfig.g;
            oseVar.getClass();
            aborVarN.t();
            tao taoVar6 = aborVarN.b;
            taoVar6.h = oseVar;
            taoVar6.b |= 8;
            int i2 = clientRegistrationConfig.h;
            aborVarN.t();
            tao taoVar7 = aborVarN.b;
            taoVar7.b |= 16;
            taoVar7.j = i2;
            tao taoVarQ = aborVarN.q();
            taoVarQ.getClass();
            defpackage.abor aborVarK = taoVarQ.K();
            aborVarK.getClass();
            if (osiVar.h) {
                defpackage.abor aborVarN2 = tbl.a.n();
                aborVarN2.getClass();
                defpackage.abor aborVarN3 = tbe.a.n();
                aborVarN3.getClass();
                tbe tbeVarQ = aborVarN3.q();
                tbeVarQ.getClass();
                aborVarN2.t();
                tbl tblVar = aborVarN2.b;
                tblVar.c = tbeVarQ;
                tblVar.b = 1;
                tbl tblVarQ = aborVarN2.q();
                tblVarQ.getClass();
                tbl tblVar2 = tblVarQ;
                aborVarK.t();
                tao taoVar8 = aborVarK.b;
                defpackage.abpj abpjVar3 = taoVar8.i;
                if (!abpjVar3.c()) {
                    taoVar8.i = defpackage.abox.I(abpjVar3);
                }
                taoVar8.i.add(tblVar2);
            }
            defpackage.taf tafVar = this.e;
            defpackage.abox aboxVarQ = aborVarK.q();
            aboxVarQ.getClass();
            tafVar.f((tao) aboxVarQ, iNextInt);
            defpackage.kpu.b(defpackage.yxo.SERVICE_CONNECTED_DODGEBOOST);
            return true;
        }
        qjz qjzVar = this.c;
        if (qjzVar == null) {
            ((defpackage.yqj) a.h()).u("register called when service not connected");
            defpackage.kpu.b(defpackage.yxo.SERVICE_UNAVAILABLE);
            return false;
        }
        try {
            defpackage.qxn qxnVar = new defpackage.qxn(this.b.d, 1);
            android.os.Parcel parcelFp = qjzVar.fp();
            defpackage.ijx.i(parcelFp, qxnVar);
            defpackage.ijx.g(parcelFp, clientRegistrationConfig);
            android.os.Parcel parcelFq = qjzVar.fq(3, parcelFp);
            android.os.IBinder strongBinder = parcelFq.readStrongBinder();
            if (strongBinder == null) {
                qjyVar = null;
            } else {
                qjy qjyVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gearhead.sdk.assistant.ICarAssistant");
                qjyVar = qjyVarQueryLocalInterface instanceof qjy ? qjyVarQueryLocalInterface : new qjy(strongBinder);
            }
            parcelFq.recycle();
            this.k = qjyVar;
            if (qjyVar == null) {
                throw new java.lang.IllegalStateException("Car assistant registration failed");
            }
            defpackage.kpu.b(defpackage.yxo.SERVICE_CONNECTED);
            return z;
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).u("failed to handle assistant service connection");
            defpackage.kpu.b(defpackage.yxo.SERVICE_UNAVAILABLE);
            z = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized boolean m(defpackage.yxp yxpVar, java.util.function.BiConsumer biConsumer) {
        defpackage.lam lamVarA;
        defpackage.adng adngVarA;
        yxpVar.getClass();
        if (s()) {
            if (yxpVar == defpackage.yxp.RESTART_ATTEMPTED) {
                this.j = true;
            } else {
                defpackage.taf tafVar = this.e;
                szt sztVar = new szt(biConsumer);
                defpackage.aedv aedvVar = (defpackage.aedv) tafVar.e.a();
                tbv tbvVar = tbv.a;
                defpackage.abor aborVarN = tbvVar.n();
                aborVarN.getClass();
                tbv tbvVarQ = aborVarN.q();
                tbvVarQ.getClass();
                tbv tbvVar2 = tbvVarQ;
                tad tadVar = new tad(sztVar, 2);
                defpackage.adjx adjxVar = aedvVar.a;
                defpackage.adng adngVar = defpackage.tan.d;
                if (adngVar == null) {
                    synchronized (defpackage.tan.class) {
                        defpackage.adng adngVar2 = defpackage.tan.d;
                        if (adngVar2 == null) {
                            defpackage.xo xoVarC = defpackage.adng.c();
                            xoVarC.b = defpackage.adnf.a;
                            xoVarC.d = defpackage.adng.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "StopAssistantSession");
                            xoVarC.b();
                            defpackage.abol abolVar = defpackage.aedu.a;
                            xoVarC.e = new defpackage.aedt(tbvVar);
                            xoVarC.c = new defpackage.aedt(tbw.a);
                            adngVarA = xoVarC.a();
                            defpackage.tan.d = adngVarA;
                        } else {
                            adngVarA = adngVar2;
                        }
                    }
                    adngVar = adngVarA;
                }
                defpackage.aeei.d(adjxVar.d(adngVar, aedvVar.b), tbvVar2, tadVar);
            }
            lamVarA = defpackage.lam.a();
            synchronized (lamVarA.a) {
                java.lang.Object obj = lamVarA.b;
                ((defpackage.lan) obj).c = yxpVar;
                ((defpackage.lan) obj).c(42, java.lang.Integer.valueOf(yxpVar.p));
                long jA = ((defpackage.lan) lamVarA.b).a();
            }
            defpackage.omf.u().t(defpackage.yxo.VOICE_SESSION_CANCELLED, 1, 1, java.lang.Long.valueOf(jA), 1, null, null, yxpVar);
        } else {
            try {
                qjy qjyVar = this.k;
                if (qjyVar != null) {
                    qjyVar.fr(2, qjyVar.fp());
                    lamVarA = defpackage.lam.a();
                    synchronized (lamVarA.a) {
                        java.lang.Object obj2 = lamVarA.b;
                        ((defpackage.lan) obj2).c = yxpVar;
                        ((defpackage.lan) obj2).c(42, java.lang.Integer.valueOf(yxpVar.p));
                        long jA2 = ((defpackage.lan) lamVarA.b).a();
                        defpackage.omf.u().t(defpackage.yxo.VOICE_SESSION_CANCELLED, 1, 1, java.lang.Long.valueOf(jA2), 1, null, null, yxpVar);
                    }
                } else {
                    lamVarA = defpackage.lam.a();
                    synchronized (lamVarA.a) {
                        java.lang.Object obj3 = lamVarA.b;
                        ((defpackage.lan) obj3).c = yxpVar;
                        ((defpackage.lan) obj3).c(42, java.lang.Integer.valueOf(yxpVar.p));
                        long jA3 = ((defpackage.lan) lamVarA.b).a();
                        defpackage.omf.u().t(defpackage.yxo.VOICE_SESSION_CANCELLED, 1, 1, java.lang.Long.valueOf(jA3), 1, null, null, yxpVar);
                    }
                }
            } catch (android.os.RemoteException e) {
                a$.ExternalSyntheticApiModelOutline2.m(biConsumer, e, defpackage.yxo.STOP_VOICE_SESSION_REMOTE_EXCEPTION);
                return false;
            }
        }
        throw th;
        return true;
    }

    public final synchronized com.google.android.gearhead.sdk.assistant.CarAssistantSetting n() {
        com.google.android.gearhead.sdk.assistant.CarAssistantSetting carAssistantSettingP;
        if (s()) {
            try {
                defpackage.taf tafVar = this.e;
                tbo tboVarA = tag.a(3);
                tam tamVar = (tam) tafVar.f.a();
                defpackage.abor aborVarN = tbq.b.n();
                aborVarN.getClass();
                defpackage.tan.m(aborVarN);
                defpackage.tan.l(tboVarA, aborVarN);
                carAssistantSettingP = p(3, (tbp) defpackage.aeei.a(tamVar.a, defpackage.tan.a(), tamVar.b, defpackage.tan.k(aborVarN)));
            } catch (java.lang.Throwable th) {
                ((defpackage.yqj) ((defpackage.yqj) a.g()).p(th)).u("Error fetching settings");
                carAssistantSettingP = null;
            }
        } else {
            carAssistantSettingP = q(3);
        }
        return carAssistantSettingP;
    }

    public final void o() {
        this.k = null;
    }
}
