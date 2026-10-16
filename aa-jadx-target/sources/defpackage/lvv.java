package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lvv implements defpackage.luc {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ConversationUpdater");
    public final java.util.List b;
    public final java.util.Map c;
    private final android.os.Handler d;
    private boolean e;
    private final boolean f;
    private lvw g;

    public lvv() {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.b = new java.util.concurrent.CopyOnWriteArrayList();
        this.c = new java.util.HashMap();
        this.d = handler;
        boolean z = true;
        if (!defpackage.acul.y() && !defpackage.acul.x()) {
            z = false;
        }
        this.f = z;
        if (z) {
            this.g = new lvw();
        }
    }

    public static final void l(int i, java.lang.String str) {
        defpackage.zbd zbdVar = defpackage.zbd.KA;
        if (i == 0) {
            zbdVar = defpackage.zbd.KB;
        } else if (i == 1) {
            zbdVar = defpackage.zbd.KC;
        } else if (i == 2) {
            zbdVar = defpackage.zbd.KD;
        } else if (i == 3) {
            zbdVar = defpackage.zbd.KE;
        } else if (i == 4) {
            zbdVar = defpackage.zbd.KF;
        } else if (i == 5) {
            zbdVar = defpackage.zbd.KG;
        }
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PROJECTION_NOTIFICATION, zbdVar);
        rrvVarH.p(new android.content.ComponentName(str, ""));
        oimVarU.F(rrvVarH.l());
    }

    @Override // defpackage.luc
    public final lvn a(long j) {
        return (lvn) this.c.get(java.lang.Long.valueOf(j));
    }

    @Override // defpackage.luc
    public final defpackage.ygw b() {
        return defpackage.ygw.o(this.c.values());
    }

    @Override // defpackage.lhn
    public final void d() {
        if (this.f) {
            this.e = false;
            this.d.removeCallbacksAndMessages(null);
            this.c.clear();
            this.b.clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0310  */
    /* JADX WARN: Code duplicated, block: B:102:0x0313  */
    /* JADX WARN: Code duplicated, block: B:105:0x032d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0336  */
    /* JADX WARN: Code duplicated, block: B:109:0x036c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0373  */
    /* JADX WARN: Code duplicated, block: B:112:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:113:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x040b  */
    /* JADX WARN: Code duplicated, block: B:122:0x044c  */
    /* JADX WARN: Code duplicated, block: B:123:0x044f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0458  */
    /* JADX WARN: Code duplicated, block: B:138:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:142:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:143:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:69:0x0219  */
    /* JADX WARN: Code duplicated, block: B:74:0x023e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0264  */
    /* JADX WARN: Code duplicated, block: B:81:0x026c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0275  */
    /* JADX WARN: Code duplicated, block: B:84:0x0286  */
    /* JADX WARN: Code duplicated, block: B:87:0x0294  */
    /* JADX WARN: Code duplicated, block: B:89:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:94:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.luc
    public final void e(lvn lvnVar) {
        defpackage.ygw ygwVarE;
        boolean z;
        char c;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconN;
        boolean z2;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconP;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon;
        luh luhVar;
        android.app.PendingIntent pendingIntentA;
        java.lang.String strE;
        android.content.Context context;
        java.lang.String string;
        java.lang.String str;
        nvd nvdVar;
        defpackage.ygw ygwVarD;
        nvd nvdVar2;
        boolean zEquals;
        java.lang.String str2;
        android.app.PendingIntent pendingIntent;
        lwy lwyVar;
        boolean z3;
        java.lang.String strF;
        java.lang.String str3;
        java.lang.String str4;
        nuo nuoVar;
        nup nupVarA;
        boolean z4;
        android.app.PendingIntent pendingIntentA2;
        android.app.PendingIntent pendingIntent2;
        android.app.PendingIntent pendingIntentF;
        java.lang.String str5;
        lvp lvpVar;
        lvp lvpVar2;
        qkh qkhVar;
        if (this.e) {
            lvw lvwVar = this.g;
            lvwVar.b = lvnVar;
            defpackage.yqm yqmVar = lvw.a;
            ((defpackage.yqj) yqmVar.l().ai((char) 4309)).y("convertToProjectionNotification conversation=%s", lvnVar);
            defpackage.ojm.a();
            long epochMilli = j$.time.Instant.now().toEpochMilli() - lvnVar.b();
            int iA = lvnVar.a();
            boolean zP = lvnVar.p();
            boolean z5 = defpackage.lvi.a().d(lvnVar.f()) || lvnVar.o();
            boolean z6 = iA > 0 && !z5 && zP;
            boolean z7 = z6 && epochMilli <= 600000 && lvnVar.a;
            boolean zL = lvnVar.l(lvwVar.c);
            boolean z8 = lvnVar instanceof lvp;
            defpackage.lwe lweVarA = defpackage.lwe.a();
            if (z8) {
                android.service.notification.StatusBarNotification statusBarNotification = ((lvp) lvnVar).p;
                if (statusBarNotification == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.lwe.a.h()).ai((char) 4362)).u("SBN reference is missing.");
                    int i = defpackage.ygw.d;
                    ygwVarE = defpackage.ymx.a;
                } else {
                    defpackage.lwk lwkVar = new defpackage.lwk(statusBarNotification, false);
                    if (lwkVar.j()) {
                        ygwVarE = lwkVar.e();
                    } else {
                        int i2 = defpackage.ygw.d;
                        ygwVarE = defpackage.ymx.a;
                    }
                }
                int i3 = 0;
                z = false;
                c = 1;
                while (i3 < ((defpackage.ymx) ygwVarE).c) {
                    mesquite.messaging.model.Message message = (mesquite.messaging.model.Message) ygwVarE.get(i3);
                    boolean z9 = z6;
                    z = lweVarA.f(message.c, message.d, lvnVar.f()) || z;
                    i3++;
                    z6 = z9;
                }
            } else {
                z = false;
                c = 1;
            }
            boolean z10 = z6;
            ((defpackage.yqj) yqmVar.l().ai(4310)).x("ageInMillis %d", epochMilli);
            ((defpackage.yqj) yqmVar.l().ai(4311)).w("unreadMessageCount %d", lvnVar.a());
            ((defpackage.yqj) yqmVar.l().ai((char) 4312)).y("isMuted %b", java.lang.Boolean.valueOf(!lvnVar.p()));
            ((defpackage.yqj) yqmVar.l().ai((char) 4313)).y("hasSameContent %b", java.lang.Boolean.valueOf(lvnVar.l(lvwVar.c)));
            ((defpackage.yqj) yqmVar.l().ai((char) 4314)).y("showAsHeadsUp %b", java.lang.Boolean.valueOf(lvnVar.a));
            lvwVar.c = lvnVar;
            android.graphics.Bitmap bitmap = lvwVar.b.i;
            if (bitmap == null) {
                ghIconN = new com.google.android.apps.auto.components.graphics.icon.GhIcon(8);
            } else {
                ghIconN = defpackage.kmv.c(acum.b(), lvwVar.b.f()) ? com.google.android.apps.auto.components.graphics.icon.GhIcon.n(bitmap) : com.google.android.apps.auto.components.graphics.icon.GhIcon.l(bitmap);
            }
            java.lang.String strF2 = lvwVar.b.f();
            if (defpackage.acul.k()) {
                z2 = z5;
                j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(defpackage.luv.e().b.b(null, null).d()).filter(new defpackage.lpa(strF2, 8));
                int i4 = defpackage.ygw.d;
                defpackage.ygw ygwVar = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
                if (!ygwVar.isEmpty()) {
                    ghIconP = com.google.android.apps.auto.components.graphics.icon.GhIcon.j((android.content.ComponentName) ygwVar.get(0));
                }
                ghIcon = ghIconP;
                luh luhVar2 = luh.a;
                android.app.PendingIntent pendingIntentA3 = lvwVar.a(luhVar2, z);
                luhVar = luh.c;
                pendingIntentA = lvwVar.a(luhVar, z);
                strE = lvnVar.e();
                context = defpackage.mkp.a.c;
                if (defpackage.lwz.d().k(lvnVar)) {
                    qkhVar = (qkh) defpackage.ysr.an(lvnVar.d());
                    string = qkhVar.c;
                    if (lvnVar.m()) {
                        android.content.res.Resources resources = defpackage.mkp.a.c.getResources();
                        java.lang.String str6 = qkhVar.a;
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[0] = str6;
                        objArr[c] = string;
                        string = resources.getString(2132085006, objArr);
                    }
                } else {
                    string = context.getString(2132085000);
                }
                str = string;
                nvdVar = nvd.c;
                ygwVarD = lvnVar.d();
                if (defpackage.luv.e().i(lvnVar.f()) || !z10) {
                    nvdVar2 = nvdVar;
                } else {
                    nvdVar2 = nvd.b;
                }
                if (!z7 && defpackage.ebo.n().L()) {
                    defpackage.omf.u().f(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PROJECTION_NOTIFICATION, defpackage.zbd.mN));
                }
                if (z8) {
                    lvpVar2 = (lvp) lvnVar;
                    if (android.os.Build.VERSION.SDK_INT >= 30) {
                        zEquals = lvpVar2.p.getUser().equals(lvwVar.d.p());
                    } else {
                        zEquals = false;
                    }
                } else {
                    zEquals = false;
                }
                ((defpackage.yqj) yqmVar.l().ai((char) 4315)).y("isWorkData %b", java.lang.Boolean.valueOf(zEquals));
                if (z8) {
                    lvpVar = (lvp) lvnVar;
                    str2 = str;
                    pendingIntent = pendingIntentA;
                    if (lwv.a().c(lvpVar.b())) {
                        ((defpackage.yqj) yqmVar.l().ai((char) 4319)).u("Looking up Smart action");
                        lwyVar = (lwy) defpackage.ysr.au(lvpVar.q());
                    }
                    if (lwyVar != null) {
                        z3 = c;
                    } else {
                        z3 = 0;
                    }
                    ((defpackage.yqj) yqmVar.l().ai((char) 4316)).y("smartAction is not null: %b", java.lang.Boolean.valueOf(z3));
                    if (lwyVar != null) {
                        ((defpackage.yqj) yqmVar.l().ai(4318)).y("smartAction type: %s", lwyVar.a);
                    } else {
                        lwyVar = null;
                    }
                    ((defpackage.yqj) yqmVar.l().ai(4317)).w("notification importance %d", lvnVar.g);
                    nvf nvfVarAf = defpackage.tna.af(nvh.a(lvnVar.g), z7);
                    nvc nvcVar = new nvc();
                    nvcVar.a = nvfVarAf;
                    if (lvnVar.f() == null) {
                        strF = "com.google.android.projection.gearhead";
                    } else {
                        strF = lvnVar.f();
                    }
                    nvcVar.f = strF;
                    nvcVar.g = lvnVar.k;
                    nvcVar.n = ((qkh) defpackage.ysr.an(ygwVarD)).c;
                    if (lvnVar.m()) {
                        str3 = ((qkh) defpackage.ysr.an(ygwVarD)).a;
                    } else {
                        str3 = "";
                    }
                    nvcVar.o = str3;
                    nvcVar.j = defpackage.lwz.d().g();
                    nvcVar.C = zEquals;
                    nvcVar.k = zL;
                    nvcVar.b = ghIcon;
                    nvcVar.c = pendingIntentA3;
                    nvcVar.d = ghIconN;
                    nvcVar.x = defpackage.nve.h;
                    nvcVar.m = strE;
                    lwy lwyVar2 = lwyVar;
                    nvcVar.i = lvnVar.b();
                    nvcVar.c(lvwVar.f("ACTION_DELETE", lvwVar.g((lug) null, luhVar2, false)));
                    if (z2) {
                        nupVarA = null;
                        str4 = str2;
                    } else {
                        nun nunVarA = nup.a();
                        nunVarA.a = ghIconN;
                        nunVarA.c = ghIcon;
                        nunVarA.d = strE;
                        str4 = str2;
                        nunVarA.e = str4;
                        nunVarA.f = lvwVar.e(pendingIntent);
                        nunVarA.h = lvwVar.c(lvwVar.f("ACTION_REPLY", lvwVar.g(lug.b, luhVar, z)));
                        nunVarA.i = pendingIntent;
                        nunVarA.j = lvnVar.f();
                        nunVarA.b(epochMilli);
                        if (defpackage.lwz.d().g()) {
                            nuoVar = nuo.a;
                        } else {
                            nuoVar = nuo.b;
                        }
                        nunVarA.g = nuoVar;
                        nupVarA = nunVarA.a();
                    }
                    nvcVar.u = nupVarA;
                    nvcVar.w = lvnVar.j;
                    nvcVar.z = lvnVar.n();
                    nvcVar.A = nvdVar2;
                    nvcVar.E = lvnVar.a();
                    nvcVar.p = lvwVar.e(pendingIntentA3);
                    boolean z11 = z;
                    nvcVar.q = (nvb) lvwVar.b(lwyVar2, luhVar2, true, z11, lvnVar.m(), true).first;
                    z4 = 0;
                    z4 = 0;
                    nvcVar.r = lvwVar.d(luhVar2, false);
                    luh luhVar3 = luh.b;
                    pendingIntentA2 = lvwVar.a(luhVar3, z11);
                    nvb nvbVarE = lvwVar.e(pendingIntentA2);
                    if (!lvnVar.n() && nvfVarAf.f >= nvf.d.f) {
                        z4 = c;
                    }
                    android.util.Pair pairB = lvwVar.b(lwyVar2, luhVar3, defpackage.lwz.d().k(lvnVar), z11, lvnVar.m(), z4);
                    nvb nvbVar = (nvb) pairB.first;
                    boolean zBooleanValue = ((java.lang.Boolean) pairB.second).booleanValue();
                    nuq nuqVar = new nuq();
                    nuqVar.a = ghIconN;
                    nuqVar.b = ghIcon;
                    nuqVar.c = strE;
                    nuqVar.d = str4;
                    if (c != defpackage.nrr.a().e()) {
                        pendingIntent2 = null;
                    } else {
                        pendingIntent2 = pendingIntentA2;
                    }
                    nuqVar.i = pendingIntent2;
                    if (defpackage.acul.o() || defpackage.nte.c().b().F()) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.e()).ai((char) 4320)).u("#getAutoplayActionIntent not setting autoplay intent. autoplayFeatureEnabled=false");
                    } else if (defpackage.lnt.j().j(lvnVar)) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.e()).ai((char) 4323)).u("#getAutoplayActionIntent not setting autoplay intent. isConversationMuted=true");
                    } else {
                        if (defpackage.ebo.n().k().a()) {
                            if (defpackage.mpr.f().a().d()) {
                                pendingIntentF = lvwVar.f("ACTION_PLAY", lvwVar.g(lug.e, luh.f, z11));
                            } else {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.e()).ai((char) 4321)).u("#getAutoplayActionIntent not setting autoplay intent. userHasEnabledAutoplay=false");
                            }
                            nuqVar.j = pendingIntentF;
                            nuqVar.f = nvbVarE;
                            nuqVar.g = nvbVar;
                            nuqVar.h = lvwVar.d(luhVar3, !zBooleanValue);
                            nvcVar.t = new nur(nuqVar);
                            nvh nvhVarB = nvcVar.b();
                            defpackage.mci mciVarA = defpackage.mcj.b().a(nvhVarB.f);
                            long j = lvnVar.e;
                            if (true != z8) {
                                str5 = "SMS_NOTIFICATION";
                            } else {
                                str5 = "IM_NOTIFICATION";
                            }
                            mciVarA.e(str5, j, nvhVarB);
                        }
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.e()).ai((char) 4322)).u("#getAutoplayActionIntent not setting autoplay intent. assistantSupportsAutoplay=false");
                    }
                    pendingIntentF = null;
                    nuqVar.j = pendingIntentF;
                    nuqVar.f = nvbVarE;
                    nuqVar.g = nvbVar;
                    nuqVar.h = lvwVar.d(luhVar3, !zBooleanValue);
                    nvcVar.t = new nur(nuqVar);
                    nvh nvhVarB2 = nvcVar.b();
                    defpackage.mci mciVarA2 = defpackage.mcj.b().a(nvhVarB2.f);
                    long j2 = lvnVar.e;
                    if (true != z8) {
                        str5 = "SMS_NOTIFICATION";
                    } else {
                        str5 = "IM_NOTIFICATION";
                    }
                    mciVarA2.e(str5, j2, nvhVarB2);
                }
                str2 = str;
                pendingIntent = pendingIntentA;
                lwyVar = null;
                if (lwyVar != null) {
                    z3 = c;
                } else {
                    z3 = 0;
                }
                ((defpackage.yqj) yqmVar.l().ai((char) 4316)).y("smartAction is not null: %b", java.lang.Boolean.valueOf(z3));
                if (lwyVar != null) {
                    ((defpackage.yqj) yqmVar.l().ai(4318)).y("smartAction type: %s", lwyVar.a);
                } else {
                    lwyVar = null;
                }
                ((defpackage.yqj) yqmVar.l().ai(4317)).w("notification importance %d", lvnVar.g);
                nvf nvfVarAf2 = defpackage.tna.af(nvh.a(lvnVar.g), z7);
                nvc nvcVar2 = new nvc();
                nvcVar2.a = nvfVarAf2;
                if (lvnVar.f() == null) {
                    strF = "com.google.android.projection.gearhead";
                } else {
                    strF = lvnVar.f();
                }
                nvcVar2.f = strF;
                nvcVar2.g = lvnVar.k;
                nvcVar2.n = ((qkh) defpackage.ysr.an(ygwVarD)).c;
                if (lvnVar.m()) {
                    str3 = ((qkh) defpackage.ysr.an(ygwVarD)).a;
                } else {
                    str3 = "";
                }
                nvcVar2.o = str3;
                nvcVar2.j = defpackage.lwz.d().g();
                nvcVar2.C = zEquals;
                nvcVar2.k = zL;
                nvcVar2.b = ghIcon;
                nvcVar2.c = pendingIntentA3;
                nvcVar2.d = ghIconN;
                nvcVar2.x = defpackage.nve.h;
                nvcVar2.m = strE;
                lwy lwyVar3 = lwyVar;
                nvcVar2.i = lvnVar.b();
                nvcVar2.c(lvwVar.f("ACTION_DELETE", lvwVar.g((lug) null, luhVar2, false)));
                if (z2) {
                    nupVarA = null;
                    str4 = str2;
                } else {
                    nun nunVarA2 = nup.a();
                    nunVarA2.a = ghIconN;
                    nunVarA2.c = ghIcon;
                    nunVarA2.d = strE;
                    str4 = str2;
                    nunVarA2.e = str4;
                    nunVarA2.f = lvwVar.e(pendingIntent);
                    nunVarA2.h = lvwVar.c(lvwVar.f("ACTION_REPLY", lvwVar.g(lug.b, luhVar, z)));
                    nunVarA2.i = pendingIntent;
                    nunVarA2.j = lvnVar.f();
                    nunVarA2.b(epochMilli);
                    if (defpackage.lwz.d().g()) {
                        nuoVar = nuo.b;
                    } else {
                        nuoVar = nuo.a;
                    }
                    nunVarA2.g = nuoVar;
                    nupVarA = nunVarA2.a();
                }
                nvcVar2.u = nupVarA;
                nvcVar2.w = lvnVar.j;
                nvcVar2.z = lvnVar.n();
                nvcVar2.A = nvdVar2;
                nvcVar2.E = lvnVar.a();
                nvcVar2.p = lvwVar.e(pendingIntentA3);
                boolean z12 = z;
                nvcVar2.q = (nvb) lvwVar.b(lwyVar3, luhVar2, true, z12, lvnVar.m(), true).first;
                z4 = 0;
                z4 = 0;
                nvcVar2.r = lvwVar.d(luhVar2, false);
                luh luhVar4 = luh.b;
                pendingIntentA2 = lvwVar.a(luhVar4, z12);
                nvb nvbVarE2 = lvwVar.e(pendingIntentA2);
                if (!lvnVar.n()) {
                    z4 = c;
                }
                android.util.Pair pairB2 = lvwVar.b(lwyVar3, luhVar4, defpackage.lwz.d().k(lvnVar), z12, lvnVar.m(), z4);
                nvb nvbVar2 = (nvb) pairB2.first;
                boolean zBooleanValue2 = ((java.lang.Boolean) pairB2.second).booleanValue();
                nuq nuqVar2 = new nuq();
                nuqVar2.a = ghIconN;
                nuqVar2.b = ghIcon;
                nuqVar2.c = strE;
                nuqVar2.d = str4;
                if (c != defpackage.nrr.a().e()) {
                    pendingIntent2 = null;
                } else {
                    pendingIntent2 = pendingIntentA2;
                }
                nuqVar2.i = pendingIntent2;
                if (defpackage.acul.o()) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.e()).ai((char) 4320)).u("#getAutoplayActionIntent not setting autoplay intent. autoplayFeatureEnabled=false");
                    pendingIntentF = null;
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.e()).ai((char) 4320)).u("#getAutoplayActionIntent not setting autoplay intent. autoplayFeatureEnabled=false");
                    pendingIntentF = null;
                }
                nuqVar2.j = pendingIntentF;
                nuqVar2.f = nvbVarE2;
                nuqVar2.g = nvbVar2;
                nuqVar2.h = lvwVar.d(luhVar4, !zBooleanValue2);
                nvcVar2.t = new nur(nuqVar2);
                nvh nvhVarB3 = nvcVar2.b();
                defpackage.mci mciVarA3 = defpackage.mcj.b().a(nvhVarB3.f);
                long j3 = lvnVar.e;
                if (true != z8) {
                    str5 = "SMS_NOTIFICATION";
                } else {
                    str5 = "IM_NOTIFICATION";
                }
                mciVarA3.e(str5, j3, nvhVarB3);
            }
            z2 = z5;
            ghIconP = (strF2 == null || strF2.equals("com.google.android.projection.gearhead")) ? com.google.android.apps.auto.components.graphics.icon.GhIcon.p(defpackage.mkp.a.c, 2131233805) : com.google.android.apps.auto.components.graphics.icon.GhIcon.j(new android.content.ComponentName(strF2, ""));
            ghIcon = ghIconP;
            luh luhVar5 = luh.a;
            android.app.PendingIntent pendingIntentA4 = lvwVar.a(luhVar5, z);
            luhVar = luh.c;
            pendingIntentA = lvwVar.a(luhVar, z);
            strE = lvnVar.e();
            context = defpackage.mkp.a.c;
            if (defpackage.lwz.d().k(lvnVar)) {
                qkhVar = (qkh) defpackage.ysr.an(lvnVar.d());
                string = qkhVar.c;
                if (lvnVar.m()) {
                    android.content.res.Resources resources2 = defpackage.mkp.a.c.getResources();
                    java.lang.String str7 = qkhVar.a;
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    objArr2[0] = str7;
                    objArr2[c] = string;
                    string = resources2.getString(2132085006, objArr2);
                }
            } else {
                string = context.getString(2132085000);
            }
            str = string;
            nvdVar = nvd.c;
            ygwVarD = lvnVar.d();
            if (defpackage.luv.e().i(lvnVar.f())) {
                nvdVar2 = nvdVar;
            } else {
                nvdVar2 = nvdVar;
            }
            if (!z7) {
            }
            if (z8) {
                lvpVar2 = (lvp) lvnVar;
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    zEquals = lvpVar2.p.getUser().equals(lvwVar.d.p());
                } else {
                    zEquals = false;
                }
            } else {
                zEquals = false;
            }
            ((defpackage.yqj) yqmVar.l().ai((char) 4315)).y("isWorkData %b", java.lang.Boolean.valueOf(zEquals));
            if (z8) {
                lvpVar = (lvp) lvnVar;
                str2 = str;
                pendingIntent = pendingIntentA;
                if (lwv.a().c(lvpVar.b())) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 4319)).u("Looking up Smart action");
                    lwyVar = (lwy) defpackage.ysr.au(lvpVar.q());
                }
                if (lwyVar != null) {
                    z3 = c;
                } else {
                    z3 = 0;
                }
                ((defpackage.yqj) yqmVar.l().ai((char) 4316)).y("smartAction is not null: %b", java.lang.Boolean.valueOf(z3));
                if (lwyVar != null) {
                    ((defpackage.yqj) yqmVar.l().ai(4318)).y("smartAction type: %s", lwyVar.a);
                } else {
                    lwyVar = null;
                }
                ((defpackage.yqj) yqmVar.l().ai(4317)).w("notification importance %d", lvnVar.g);
                nvf nvfVarAf3 = defpackage.tna.af(nvh.a(lvnVar.g), z7);
                nvc nvcVar3 = new nvc();
                nvcVar3.a = nvfVarAf3;
                if (lvnVar.f() == null) {
                    strF = "com.google.android.projection.gearhead";
                } else {
                    strF = lvnVar.f();
                }
                nvcVar3.f = strF;
                nvcVar3.g = lvnVar.k;
                nvcVar3.n = ((qkh) defpackage.ysr.an(ygwVarD)).c;
                if (lvnVar.m()) {
                    str3 = ((qkh) defpackage.ysr.an(ygwVarD)).a;
                } else {
                    str3 = "";
                }
                nvcVar3.o = str3;
                nvcVar3.j = defpackage.lwz.d().g();
                nvcVar3.C = zEquals;
                nvcVar3.k = zL;
                nvcVar3.b = ghIcon;
                nvcVar3.c = pendingIntentA4;
                nvcVar3.d = ghIconN;
                nvcVar3.x = defpackage.nve.h;
                nvcVar3.m = strE;
                lwy lwyVar4 = lwyVar;
                nvcVar3.i = lvnVar.b();
                nvcVar3.c(lvwVar.f("ACTION_DELETE", lvwVar.g((lug) null, luhVar5, false)));
                if (z2) {
                    nupVarA = null;
                    str4 = str2;
                } else {
                    nun nunVarA3 = nup.a();
                    nunVarA3.a = ghIconN;
                    nunVarA3.c = ghIcon;
                    nunVarA3.d = strE;
                    str4 = str2;
                    nunVarA3.e = str4;
                    nunVarA3.f = lvwVar.e(pendingIntent);
                    nunVarA3.h = lvwVar.c(lvwVar.f("ACTION_REPLY", lvwVar.g(lug.b, luhVar, z)));
                    nunVarA3.i = pendingIntent;
                    nunVarA3.j = lvnVar.f();
                    nunVarA3.b(epochMilli);
                    if (defpackage.lwz.d().g()) {
                        nuoVar = nuo.b;
                    } else {
                        nuoVar = nuo.a;
                    }
                    nunVarA3.g = nuoVar;
                    nupVarA = nunVarA3.a();
                }
                nvcVar3.u = nupVarA;
                nvcVar3.w = lvnVar.j;
                nvcVar3.z = lvnVar.n();
                nvcVar3.A = nvdVar2;
                nvcVar3.E = lvnVar.a();
                nvcVar3.p = lvwVar.e(pendingIntentA4);
                boolean z13 = z;
                nvcVar3.q = (nvb) lvwVar.b(lwyVar4, luhVar5, true, z13, lvnVar.m(), true).first;
                z4 = 0;
                z4 = 0;
                nvcVar3.r = lvwVar.d(luhVar5, false);
                luh luhVar6 = luh.b;
                pendingIntentA2 = lvwVar.a(luhVar6, z13);
                nvb nvbVarE3 = lvwVar.e(pendingIntentA2);
                if (!lvnVar.n()) {
                    z4 = c;
                }
                android.util.Pair pairB3 = lvwVar.b(lwyVar4, luhVar6, defpackage.lwz.d().k(lvnVar), z13, lvnVar.m(), z4);
                nvb nvbVar3 = (nvb) pairB3.first;
                boolean zBooleanValue3 = ((java.lang.Boolean) pairB3.second).booleanValue();
                nuq nuqVar3 = new nuq();
                nuqVar3.a = ghIconN;
                nuqVar3.b = ghIcon;
                nuqVar3.c = strE;
                nuqVar3.d = str4;
                if (c != defpackage.nrr.a().e()) {
                    pendingIntent2 = null;
                } else {
                    pendingIntent2 = pendingIntentA2;
                }
                nuqVar3.i = pendingIntent2;
                if (defpackage.acul.o()) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.e()).ai((char) 4320)).u("#getAutoplayActionIntent not setting autoplay intent. autoplayFeatureEnabled=false");
                    pendingIntentF = null;
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.e()).ai((char) 4320)).u("#getAutoplayActionIntent not setting autoplay intent. autoplayFeatureEnabled=false");
                    pendingIntentF = null;
                }
                nuqVar3.j = pendingIntentF;
                nuqVar3.f = nvbVarE3;
                nuqVar3.g = nvbVar3;
                nuqVar3.h = lvwVar.d(luhVar6, !zBooleanValue3);
                nvcVar3.t = new nur(nuqVar3);
                nvh nvhVarB4 = nvcVar3.b();
                defpackage.mci mciVarA4 = defpackage.mcj.b().a(nvhVarB4.f);
                long j4 = lvnVar.e;
                if (true != z8) {
                    str5 = "SMS_NOTIFICATION";
                } else {
                    str5 = "IM_NOTIFICATION";
                }
                mciVarA4.e(str5, j4, nvhVarB4);
            }
            str2 = str;
            pendingIntent = pendingIntentA;
            lwyVar = null;
            if (lwyVar != null) {
                z3 = c;
            } else {
                z3 = 0;
            }
            ((defpackage.yqj) yqmVar.l().ai((char) 4316)).y("smartAction is not null: %b", java.lang.Boolean.valueOf(z3));
            if (lwyVar != null) {
                ((defpackage.yqj) yqmVar.l().ai(4318)).y("smartAction type: %s", lwyVar.a);
            } else {
                lwyVar = null;
            }
            ((defpackage.yqj) yqmVar.l().ai(4317)).w("notification importance %d", lvnVar.g);
            nvf nvfVarAf4 = defpackage.tna.af(nvh.a(lvnVar.g), z7);
            nvc nvcVar4 = new nvc();
            nvcVar4.a = nvfVarAf4;
            if (lvnVar.f() == null) {
                strF = "com.google.android.projection.gearhead";
            } else {
                strF = lvnVar.f();
            }
            nvcVar4.f = strF;
            nvcVar4.g = lvnVar.k;
            nvcVar4.n = ((qkh) defpackage.ysr.an(ygwVarD)).c;
            if (lvnVar.m()) {
                str3 = ((qkh) defpackage.ysr.an(ygwVarD)).a;
            } else {
                str3 = "";
            }
            nvcVar4.o = str3;
            nvcVar4.j = defpackage.lwz.d().g();
            nvcVar4.C = zEquals;
            nvcVar4.k = zL;
            nvcVar4.b = ghIcon;
            nvcVar4.c = pendingIntentA4;
            nvcVar4.d = ghIconN;
            nvcVar4.x = defpackage.nve.h;
            nvcVar4.m = strE;
            lwy lwyVar5 = lwyVar;
            nvcVar4.i = lvnVar.b();
            nvcVar4.c(lvwVar.f("ACTION_DELETE", lvwVar.g((lug) null, luhVar5, false)));
            if (z2) {
                nupVarA = null;
                str4 = str2;
            } else {
                nun nunVarA4 = nup.a();
                nunVarA4.a = ghIconN;
                nunVarA4.c = ghIcon;
                nunVarA4.d = strE;
                str4 = str2;
                nunVarA4.e = str4;
                nunVarA4.f = lvwVar.e(pendingIntent);
                nunVarA4.h = lvwVar.c(lvwVar.f("ACTION_REPLY", lvwVar.g(lug.b, luhVar, z)));
                nunVarA4.i = pendingIntent;
                nunVarA4.j = lvnVar.f();
                nunVarA4.b(epochMilli);
                if (defpackage.lwz.d().g()) {
                    nuoVar = nuo.b;
                } else {
                    nuoVar = nuo.a;
                }
                nunVarA4.g = nuoVar;
                nupVarA = nunVarA4.a();
            }
            nvcVar4.u = nupVarA;
            nvcVar4.w = lvnVar.j;
            nvcVar4.z = lvnVar.n();
            nvcVar4.A = nvdVar2;
            nvcVar4.E = lvnVar.a();
            nvcVar4.p = lvwVar.e(pendingIntentA4);
            boolean z14 = z;
            nvcVar4.q = (nvb) lvwVar.b(lwyVar5, luhVar5, true, z14, lvnVar.m(), true).first;
            z4 = 0;
            z4 = 0;
            nvcVar4.r = lvwVar.d(luhVar5, false);
            luh luhVar7 = luh.b;
            pendingIntentA2 = lvwVar.a(luhVar7, z14);
            nvb nvbVarE4 = lvwVar.e(pendingIntentA2);
            if (!lvnVar.n()) {
                z4 = c;
            }
            android.util.Pair pairB4 = lvwVar.b(lwyVar5, luhVar7, defpackage.lwz.d().k(lvnVar), z14, lvnVar.m(), z4);
            nvb nvbVar4 = (nvb) pairB4.first;
            boolean zBooleanValue4 = ((java.lang.Boolean) pairB4.second).booleanValue();
            nuq nuqVar4 = new nuq();
            nuqVar4.a = ghIconN;
            nuqVar4.b = ghIcon;
            nuqVar4.c = strE;
            nuqVar4.d = str4;
            if (c != defpackage.nrr.a().e()) {
                pendingIntent2 = null;
            } else {
                pendingIntent2 = pendingIntentA2;
            }
            nuqVar4.i = pendingIntent2;
            if (defpackage.acul.o()) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.e()).ai((char) 4320)).u("#getAutoplayActionIntent not setting autoplay intent. autoplayFeatureEnabled=false");
                pendingIntentF = null;
            } else {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.e()).ai((char) 4320)).u("#getAutoplayActionIntent not setting autoplay intent. autoplayFeatureEnabled=false");
                pendingIntentF = null;
            }
            nuqVar4.j = pendingIntentF;
            nuqVar4.f = nvbVarE4;
            nuqVar4.g = nvbVar4;
            nuqVar4.h = lvwVar.d(luhVar7, !zBooleanValue4);
            nvcVar4.t = new nur(nuqVar4);
            nvh nvhVarB5 = nvcVar4.b();
            defpackage.mci mciVarA5 = defpackage.mcj.b().a(nvhVarB5.f);
            long j5 = lvnVar.e;
            if (true != z8) {
                str5 = "SMS_NOTIFICATION";
            } else {
                str5 = "IM_NOTIFICATION";
            }
            mciVarA5.e(str5, j5, nvhVarB5);
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (this.f) {
            this.e = true;
        }
    }

    @Override // defpackage.luc
    public final void f(lvn lvnVar, boolean z, boolean z2) {
        if (this.e) {
            if (!z2) {
                this.d.post(new defpackage.lvu(this, lvnVar, z, 0));
            } else {
                k(lvnVar);
                this.d.post(new defpackage.kzz(this, lvnVar, 12));
            }
        }
    }

    @Override // defpackage.luc
    public final void g(long j, int i) {
        if (this.e) {
            ((defpackage.yqj) a.l().ai(4307)).F("updateConversationAsRead. Id: %d numRead: %d", j, i);
            this.d.post(new lvt(this, j, i, 0));
        }
    }

    @Override // defpackage.luc
    public final void h(lvr lvrVar) {
        if (this.e) {
            ((defpackage.yqj) a.l().ai((char) 4308)).y("updateSmsConversation: %s", lvrVar);
            this.d.post(new defpackage.kzz(this, lvrVar, 13));
        }
    }

    @Override // defpackage.luc
    public final void i(ajnd ajndVar) {
        this.b.add(ajndVar);
    }

    @Override // defpackage.luc
    public final void j(ajnd ajndVar) {
        if (this.b.remove(ajndVar)) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4302)).y("Listener was not registered: %s", ajndVar);
    }

    public final void k(lvn lvnVar) {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((defpackage.kez) ((ajnd) it.next()).a).d(lvnVar);
        }
    }
}
