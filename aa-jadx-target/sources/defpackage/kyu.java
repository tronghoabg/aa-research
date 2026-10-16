package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class kyu implements szn {
    final /* synthetic */ defpackage.kzb a;

    public kyu(defpackage.kzb kzbVar) {
        this.a = kzbVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.google.android.gearhead.sdk.assistant.SupportedVersionInfo supportedVersionInfo) throws wfo {
        defpackage.wfp.c();
        defpackage.kzb kzbVar = this.a;
        if (kzbVar.C.n() && !defpackage.ler.c().fY()) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.h()).ai((char) 3601)).u("handleServiceConnected: Lifetime component is not started");
            return;
        }
        defpackage.yqm yqmVar = defpackage.kzb.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 3593)).y("Version info %s", supportedVersionInfo);
        java.util.concurrent.atomic.AtomicReference atomicReference = kzbVar.h;
        atomicReference.set(supportedVersionInfo.c);
        int i = 0;
        kzbVar.u.m(java.lang.Boolean.valueOf(supportedVersionInfo.c.l && defpackage.acyc.ak()));
        kzbVar.v.m(java.lang.Boolean.valueOf(supportedVersionInfo.c.m));
        defpackage.abpf abpfVar = defpackage.acnf.p().b;
        int i2 = supportedVersionInfo.b;
        while (true) {
            int i3 = 3;
            if (i2 < supportedVersionInfo.a) {
                throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "CarAssistantProvider only supports versions %d..%d; need one of %s", java.lang.Integer.valueOf(supportedVersionInfo.a), java.lang.Integer.valueOf(supportedVersionInfo.b), abpfVar));
            }
            if (abpfVar.contains(java.lang.Integer.valueOf(i2))) {
                kzbVar.j = i2;
                int iH = (int) defpackage.acnf.h();
                if (iH >= 0) {
                    ((defpackage.yqj) yqmVar.l().ai(3599)).w("Version override %d", iH);
                    if (iH < supportedVersionInfo.a || iH > supportedVersionInfo.b) {
                        ((defpackage.yqj) yqmVar.l().ai((char) 3600)).u("Version override invalid");
                    } else {
                        kzbVar.j = iH;
                    }
                }
                ((defpackage.yqj) yqmVar.l().ai(3594)).w("Registering with version %d", kzbVar.j);
                int i4 = kzbVar.j;
                defpackage.yqm yqmVar2 = defpackage.lao.a;
                com.google.android.gearhead.sdk.assistant.ClientRegistrationConfig clientRegistrationConfig = new com.google.android.gearhead.sdk.assistant.ClientRegistrationConfig();
                clientRegistrationConfig.b = 2;
                clientRegistrationConfig.a = i4;
                com.google.android.gms.car.CarInfo carInfoB = defpackage.juv.l().b();
                if (carInfoB != null) {
                    clientRegistrationConfig.e = carInfoB.a;
                    clientRegistrationConfig.f = carInfoB.b;
                }
                android.content.Context context = kzbVar.d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                defpackage.yot it = ((defpackage.yhx) j$.util.Collection.-EL.stream(defpackage.ler.a().e(defpackage.kit.b().e(), defpackage.nze.a())).map(new defpackage.khy(12)).filter(new defpackage.kqi(i3)).map(new defpackage.khy(13)).collect(defpackage.yds.b)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    android.content.ComponentName componentName = (android.content.ComponentName) it.next();
                    if (!componentName.getPackageName().equals("com.google.android.projection.gearhead")) {
                        arrayList.add(componentName.getPackageName());
                    } else if (componentName.equals(defpackage.mkt.p)) {
                        int i5 = defpackage.jrk.a;
                        android.content.ComponentName componentNameA = defpackage.jrk.a(context, new android.content.Intent("android.intent.action.INSERT").setData(android.provider.CalendarContract.Events.CONTENT_URI));
                        java.lang.String packageName = componentNameA != null ? componentNameA.getPackageName() : null;
                        if (packageName != null) {
                            arrayList.add(packageName);
                        }
                    }
                }
                int i6 = defpackage.jrk.a;
                android.content.ComponentName componentNameA2 = defpackage.jrk.a(context, new android.content.Intent("android.intent.action.DIAL"));
                java.lang.String packageName2 = componentNameA2 == null ? null : componentNameA2.getPackageName();
                if (packageName2 != null) {
                    arrayList.add(packageName2);
                }
                clientRegistrationConfig.c = arrayList;
                int iIntValue = -1;
                if (defpackage.acnf.G() && android.os.Build.VERSION.SDK_INT >= 34) {
                    iIntValue = ((java.lang.Integer) defpackage.kgu.c(new defpackage.kyr(i), "GH.Assistant.Controller", defpackage.zbe.ASSISTANT, defpackage.zbd.zd, true, "Error getting virtual device id", new java.lang.Object[0])).intValue();
                }
                clientRegistrationConfig.h = iIntValue;
                clientRegistrationConfig.d = new java.util.ArrayList();
                java.lang.String str = (java.lang.String) defpackage.acmi.a.fF();
                if (!str.isEmpty()) {
                    clientRegistrationConfig.d.add(str);
                }
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3595)).R("Gearhead x Gemini flags: useAsr %s UseGeminiGhKs %s isGeminiEnabled %s", java.lang.Boolean.valueOf(android.os.Build.VERSION.SDK_INT >= 30), java.lang.Boolean.valueOf(defpackage.acyc.ak()), java.lang.Boolean.valueOf(supportedVersionInfo.c.l));
                defpackage.abor aborVarN = ose.a.n();
                aborVarN.t();
                ose oseVar = aborVarN.b;
                oseVar.b |= 1;
                oseVar.c = true;
                boolean zB = defpackage.laq.a().b();
                aborVarN.t();
                ose oseVar2 = aborVarN.b;
                oseVar2.b |= 2;
                oseVar2.d = zB;
                aborVarN.t();
                ose oseVar3 = aborVarN.b;
                oseVar3.b |= 4;
                oseVar3.e = true;
                boolean zG = defpackage.acwd.g();
                aborVarN.t();
                ose oseVar4 = aborVarN.b;
                oseVar4.b |= 8;
                oseVar4.f = zG;
                aborVarN.t();
                ose oseVar5 = aborVarN.b;
                oseVar5.b |= 16;
                oseVar5.g = true;
                boolean zR = defpackage.ebo.r();
                aborVarN.t();
                ose oseVar6 = aborVarN.b;
                oseVar6.b |= 32;
                oseVar6.h = zR;
                aborVarN.t();
                ose oseVar7 = aborVarN.b;
                oseVar7.b |= 64;
                oseVar7.i = true;
                boolean zB2 = defpackage.lem.a().b();
                aborVarN.t();
                ose oseVar8 = aborVarN.b;
                oseVar8.b |= 128;
                oseVar8.j = zB2;
                boolean zC = defpackage.actb.c();
                aborVarN.t();
                ose oseVar9 = aborVarN.b;
                oseVar9.b |= 256;
                oseVar9.k = zC;
                boolean z = android.os.Build.VERSION.SDK_INT >= 30;
                aborVarN.t();
                ose oseVar10 = aborVarN.b;
                oseVar10.b |= 512;
                oseVar10.l = z;
                aborVarN.t();
                ose oseVar11 = aborVarN.b;
                oseVar11.b |= 1024;
                oseVar11.m = true;
                boolean zAk = defpackage.acyc.ak();
                aborVarN.t();
                ose oseVar12 = aborVarN.b;
                oseVar12.b |= 2048;
                oseVar12.n = zAk;
                boolean zB3 = defpackage.lek.a().b();
                aborVarN.t();
                ose oseVar13 = aborVarN.b;
                oseVar13.b |= 4096;
                oseVar13.o = zB3;
                boolean zC2 = defpackage.lek.a().c();
                aborVarN.t();
                ose oseVar14 = aborVarN.b;
                oseVar14.b |= 8192;
                oseVar14.p = zC2;
                clientRegistrationConfig.g = aborVarN.q();
                ((defpackage.yqj) yqmVar.l().ai((char) 3596)).y("Registration config %s", clientRegistrationConfig);
                if (kzbVar.f.l(clientRegistrationConfig, (defpackage.osi) atomicReference.get())) {
                    if (kzbVar.af() && !defpackage.acqe.u()) {
                        kzbVar.aa();
                    }
                    defpackage.kzh kzhVar = kzbVar.e;
                    kzhVar.f(2, new defpackage.kze(kzhVar, 0), java.lang.Boolean.class);
                    kzhVar.g(7, "AssistantRailInvokedMediaRecEnabled", kzhVar.f);
                    kzhVar.f(2, new kzf(kzhVar, kzhVar.g, ((defpackage.osi) atomicReference.get()).c), java.lang.Boolean.class);
                    kzhVar.g(8, "AssistantTranscriptionEnabled", kzhVar.h);
                    if (defpackage.acul.o()) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3598)).u("Refreshing autoplaymessages setting");
                        kzhVar.f(10, new defpackage.kze(kzhVar, 2), java.lang.Boolean.class);
                    }
                    if (((defpackage.osi) atomicReference.get()).n) {
                        defpackage.omf.u().F(defpackage.omv.p(defpackage.acbk.NH).l());
                        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.ASSISTANT, defpackage.zbd.zc).l());
                    }
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3597)).w("Car assistant registration successful. Version=%d", kzbVar.j);
                    kzbVar.p.a = kzbVar.j;
                    kzbVar.ad(1);
                    if (((defpackage.osi) atomicReference.get()).n && ((defpackage.osi) atomicReference.get()).l) {
                        kzbVar.k.edit().putBoolean("GEMINI_ENABLED_KEY", true).apply();
                    } else {
                        kzbVar.k.edit().putBoolean("GEMINI_ENABLED_KEY", false).apply();
                    }
                    if (kzbVar.l > 0) {
                        defpackage.lam.a();
                        defpackage.lam.e(defpackage.yxo.SERVICE_RECONNECTED, null);
                        return;
                    }
                    return;
                }
                return;
            }
            i2--;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void b() throws wfo {
        defpackage.wfp.c();
        defpackage.kzb kzbVar = this.a;
        defpackage.sag sagVarN = defpackage.sag.n();
        kzbVar.W(sagVarN);
        kzbVar.i.set(sagVarN.toString());
        kzbVar.j = -1;
        kzbVar.p.a = -1;
        kzbVar.ad(2);
        if (kzbVar.ag() || kzbVar.af()) {
            kzy.a().c();
        }
        kzbVar.h.set(defpackage.kzb.ai(kzbVar.C));
        if (kzbVar.l >= 5) {
            kzbVar.T(null, defpackage.yxo.SERVICE_REBIND_FAILED);
            defpackage.lam.a();
            defpackage.lam.e(defpackage.yxo.SERVICE_PERMANENTLY_DISCONNECTED, null);
        } else {
            defpackage.lam.a();
            defpackage.lam.e(defpackage.yxo.SERVICE_DISCONNECTED, null);
        }
        kzbVar.l++;
    }
}
