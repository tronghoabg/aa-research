package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kzb implements defpackage.kxc {
    public volatile int A;
    public defpackage.htw B;
    public final defpackage.wyz C;
    defpackage.ndd D;
    private defpackage.xzg F;
    private int G;
    private final java.util.concurrent.Executor H;
    private java.lang.String I;
    private boolean J;
    private defpackage.kzc K;
    private final android.os.Handler L;
    private defpackage.whw M;
    public final defpackage.kyq b;
    public final defpackage.kzl c;
    public final android.content.Context d;
    public final defpackage.kzh e;
    public final defpackage.szw f;
    public final java.util.concurrent.atomic.AtomicReference h;
    public final java.util.concurrent.atomic.AtomicReference i;
    public int j;
    public android.content.SharedPreferences k;
    public int l;
    public volatile boolean m;
    public volatile int n;
    final defpackage.kzk o;
    final defpackage.kyn p;
    public boolean q;
    public volatile boolean r;
    public final defpackage.eqs s;
    public final defpackage.eqs t;
    public final defpackage.eqs u;
    final defpackage.eqs v;
    final defpackage.eqs w;
    public boolean x;
    public final java.util.List y;
    public final defpackage.qki z;
    public static final defpackage.yqm a = defpackage.yqm.c("GH.Assistant.Controller");
    private static final defpackage.kwv O = new defpackage.kwv(defpackage.kxg.a);
    private int N = 1;
    private volatile boolean E = false;
    public final java.util.List g = new java.util.concurrent.CopyOnWriteArrayList();

    public kzb(android.content.Context context, defpackage.kyq kyqVar, defpackage.kzl kzlVar, java.util.concurrent.Executor executor, java.util.function.Function function) {
        defpackage.wyz wyzVar = new defpackage.wyz(this, null);
        this.C = wyzVar;
        this.i = new java.util.concurrent.atomic.AtomicReference("Assistant has not disconnected yet");
        this.j = -1;
        this.l = 0;
        this.n = 0;
        this.o = new defpackage.kzk();
        this.p = new defpackage.kyn();
        this.G = 0;
        this.A = 1;
        this.s = new defpackage.eqs();
        this.t = new defpackage.eqs();
        this.u = new defpackage.eqs();
        this.v = new defpackage.eqs();
        this.w = new defpackage.eqs();
        this.x = false;
        this.y = new java.util.concurrent.CopyOnWriteArrayList();
        this.L = new defpackage.kyw(this, android.os.Looper.getMainLooper());
        this.z = new defpackage.kyv(this);
        this.d = context;
        this.h = new java.util.concurrent.atomic.AtomicReference(ai(wyzVar));
        this.b = kyqVar;
        this.c = kzlVar;
        this.H = executor;
        defpackage.szw szwVar = (defpackage.szw) a$.ExternalSyntheticApiModelOutline2.m(function, new defpackage.szo(new defpackage.wyz(this, null), wyzVar, new defpackage.kpu(null), executor));
        this.f = szwVar;
        this.e = new defpackage.kzh(context, szwVar);
    }

    public static defpackage.osi ai(defpackage.wyz wyzVar) {
        defpackage.abor aborVarN = defpackage.osi.a.n();
        boolean zN = wyzVar.n();
        aborVarN.t();
        defpackage.osi osiVar = (defpackage.osi) aborVarN.b;
        osiVar.b |= 4;
        osiVar.e = zN;
        return (defpackage.osi) aborVarN.q();
    }

    private final java.util.concurrent.Executor aj() {
        return hh$.ExternalSyntheticApiModelOutline0.m(this.d);
    }

    private final void ak() {
        android.content.ComponentName componentNameA = defpackage.maw.a(defpackage.kit.b().e(), true);
        if (componentNameA == null) {
            ((defpackage.yqj) a.l().ai((char) 3582)).u("No default nav component found. Aborting assistant changed broadcast");
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.google.android.gearhead.ASSISTANT_STATE_CHANGED");
        intent.putExtra("ASSISTANT_ACTIVE", this.m);
        intent.setPackage(componentNameA.getPackageName());
        this.d.sendBroadcast(intent);
    }

    private final void al() {
        this.L.removeMessages(1);
        defpackage.nwy.a().e(defpackage.nve.f);
    }

    private final void am() {
        this.L.removeMessages(2);
        defpackage.nwy.a().e(defpackage.nve.f);
    }

    private final void an(com.google.android.gearhead.sdk.assistant.VoiceSessionConfig voiceSessionConfig, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot clientStateSnapshot) {
        if (defpackage.oeh.a().E()) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3588)).u("There's an active call session. Skip starting voice session");
            defpackage.lam.a();
            defpackage.lam.e(defpackage.yxo.VOICE_SESSION_SKIPPED_BECAUSE_OF_ACTIVE_VOICE_CALL, null);
            return;
        }
        defpackage.szw szwVar = this.f;
        synchronized (szwVar) {
            try {
                if (!szwVar.k()) {
                    V(null, defpackage.yxo.START_VOICE_SESSION_ERROR_ASSISTANT_NULL);
                    return;
                }
                boolean zEquals = j$.util.Objects.equals(j().e(), java.lang.Boolean.TRUE);
                if (this.m || zEquals) {
                    defpackage.yqm yqmVar = a;
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3586)).Q("Voice session already active (active=%b, liveOngoing=%b). Stopping the old session", this.m, zEquals);
                    if (!this.f.m(defpackage.yxp.RESTART_ATTEMPTED, new pdt(this, 1))) {
                        return;
                    }
                    int i = voiceSessionConfig.a;
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3608)).w("handleVoiceSessionRestart: %d", i);
                    defpackage.lam.a().h(201, null);
                    try {
                        defpackage.kyq kyqVar = this.b;
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.kyq.a.f()).ai((char) 3555)).w("onVoiceSessionRestart: %d", i);
                        int i2 = kyqVar.d;
                        kyqVar.d = i;
                        if (i != 5) {
                            if (i2 == 5) {
                                kyqVar.b();
                            }
                            com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider.a().b();
                        } else if (i2 != 5) {
                            kyqVar.a();
                        }
                        java.util.Iterator it = this.g.iterator();
                        while (it.hasNext()) {
                            try {
                                ((defpackage.kxd) it.next()).f();
                            } catch (defpackage.kxj e) {
                                T(e, e.a);
                            }
                        }
                        ae(defpackage.otu.LIVE_INACTIVE);
                        this.m = true;
                        defpackage.lam.a().i(202);
                    } catch (defpackage.kxj e2) {
                        T(e2, e2.a);
                    }
                } else {
                    int i3 = voiceSessionConfig.a;
                    defpackage.yqm yqmVar2 = a;
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 3609)).w("handleVoiceSessionStart: %d", i3);
                    al();
                    am();
                    if (this.m) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar2.h()).ai((char) 3610)).u("onVoiceSessionStart. There already is an active voice session");
                    } else {
                        try {
                            defpackage.kyq kyqVar2 = this.b;
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.kyq.a.f()).ai((char) 3556)).w("onVoiceSessionStart: %d", i3);
                            kyqVar2.d = i3;
                            if (i3 != 5) {
                                kyqVar2.b();
                                defpackage.sax saxVar = kyqVar2.e;
                                if (saxVar != null) {
                                    if (!saxVar.k()) {
                                        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.ASSISTANT, defpackage.zbd.Cv).l());
                                    }
                                    kyqVar2.e.j();
                                }
                            }
                            java.util.Iterator it2 = this.g.iterator();
                            while (it2.hasNext()) {
                                try {
                                    ((defpackage.kxd) it2.next()).g();
                                } catch (defpackage.kxj e3) {
                                    T(e3, e3.a);
                                }
                            }
                            this.m = true;
                            this.n = i3;
                            ak();
                        } catch (defpackage.kxj e4) {
                            T(e4, e4.a);
                        }
                    }
                }
                if (voiceSessionConfig.a == 6) {
                    voiceSessionConfig.l = new qkb(this.z);
                } else if (defpackage.laq.a().b()) {
                    defpackage.yqm yqmVar3 = oea.a;
                    oea oeaVar = (oea) defpackage.mkp.a.b(oea.class, new defpackage.oad(3));
                    if (oeaVar.b == null) {
                        oeaVar.b = new odz(oeaVar);
                    }
                    l(oeaVar.b);
                    this.J = true;
                    voiceSessionConfig.l = new qkb(this.z);
                }
                ((defpackage.yqj) a.l().ai(3587)).y("VoiceSessionConfig: %s", voiceSessionConfig);
                this.f.i(this.j, voiceSessionConfig, clientStateSnapshot, this.o, this.p, new pdt(this, 1), new defpackage.kmp(this, 10));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private final void ao() {
        java.util.Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((defpackage.kxd) it.next()).b();
            } catch (defpackage.kxj e) {
                T(e, e.a);
            }
        }
    }

    private final void ap(int i, int i2) {
        android.os.Message message = new android.os.Message();
        message.arg1 = i;
        message.arg2 = 0;
        message.what = i2;
        this.L.sendMessageDelayed(message, defpackage.acnf.j());
    }

    @Override // defpackage.kxc
    public final /* synthetic */ void A(int i, defpackage.ots otsVar) {
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        j$.util.Optional optionalOf = j$.util.Optional.of(otsVar);
        int i2 = defpackage.ygw.d;
        B(i, optionalEmpty, optionalOf, defpackage.ymx.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kxc
    public final void B(int i, j$.util.Optional optional, j$.util.Optional optional2, java.util.List list) throws wfo {
        defpackage.wfp.c();
        defpackage.ysr.cy(defpackage.zhm.v(defpackage.tan.h(defpackage.ler.c(), e())), new kyx(this, i, list, optional, optional2), hh$.ExternalSyntheticApiModelOutline0.m(this.d));
    }

    @Override // defpackage.kxc
    public final void C(java.lang.String str) {
        Y(str, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kxc
    public final void D(java.lang.String str, java.lang.String str2, defpackage.ots otsVar) throws wfo {
        defpackage.wfp.c();
        defpackage.ysr.cy(defpackage.zhm.v(defpackage.tan.h(defpackage.ler.c(), e())), new sfu(this, str, str2, otsVar, 1), hh$.ExternalSyntheticApiModelOutline0.m(this.d));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kxc
    public final void E(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, defpackage.ots otsVar) throws wfo {
        defpackage.wfp.c();
        defpackage.ysr.cy(defpackage.zhm.v(defpackage.tan.h(defpackage.ler.c(), e())), new kyy(this, str, str3, str2, str4, str5, otsVar), hh$.ExternalSyntheticApiModelOutline0.m(this.d));
    }

    @Override // defpackage.kxc
    public final void F(int i) {
        G(i, null);
    }

    @Override // defpackage.kxc
    public final void G(int i, android.os.Bundle bundle) {
        defpackage.zbe zbeVar;
        com.google.android.gearhead.sdk.assistant.VoiceSessionConfig voiceSessionConfigR = R(true != defpackage.lao.d(i) ? 1 : 5, i);
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
        if (i == 1) {
            zbeVar = defpackage.zbe.SYSTEM_ASSISTANT_INVOKED_TAP_MIC;
        } else if (i == 2 || i == 3) {
            zbeVar = defpackage.zbe.SYSTEM_ASSISTANT_INVOKED_HARDWARE_BUTTON;
        } else {
            zbeVar = i != 4 ? defpackage.zbe.ASSISTANT : defpackage.zbe.SYSTEM_ASSISTANT_INVOKED_HOTWORD;
        }
        oimVarU.F(defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.pb).l());
        voiceSessionConfigR.h = bundle;
        this.F = defpackage.xzg.b(defpackage.xxd.a);
        defpackage.lao.b(new defpackage.kos(this, voiceSessionConfigR, 13));
    }

    @Override // defpackage.kxc
    public final void H(com.google.android.gearhead.sdk.assistant.MessagingInfo messagingInfo) {
        defpackage.lao.b(new defpackage.kos(this, messagingInfo, 12));
    }

    @Override // defpackage.kxc
    public final void I(defpackage.kxd kxdVar) {
        kxdVar.getClass();
        this.g.remove(kxdVar);
    }

    @Override // defpackage.kxc
    public final boolean J() {
        return ((defpackage.osi) this.h.get()).n && j$.util.Objects.equals(this.u.e(), java.lang.Boolean.TRUE);
    }

    @Override // defpackage.kxc
    public final boolean K() {
        return this.e.b;
    }

    @Override // defpackage.kxc
    public final boolean L() {
        return this.m;
    }

    @Override // defpackage.kxc
    public final boolean M() {
        return ((defpackage.osi) this.h.get()).j;
    }

    @Override // defpackage.kxc
    public final defpackage.eqp N(java.util.List list, int i) {
        defpackage.eqs eqsVar = new defpackage.eqs();
        defpackage.abor aborVarN = tbs.a.n();
        aborVarN.t();
        tbs tbsVar = aborVarN.b;
        int i2 = 2;
        tbsVar.c = 2;
        tbsVar.b |= 1;
        defpackage.abor aborVarN2 = tba.a.n();
        aborVarN2.t();
        tba tbaVar = aborVarN2.b;
        tbaVar.b |= 1;
        tbaVar.c = 1;
        if (i > 0) {
            aborVarN2.t();
            tba tbaVar2 = aborVarN2.b;
            tbaVar2.b |= 2;
            tbaVar2.d = i;
        }
        tba tbaVarQ = aborVarN2.q();
        aborVarN.t();
        tbs tbsVar2 = aborVarN.b;
        tbaVarQ.getClass();
        defpackage.abpj abpjVar = tbsVar2.d;
        if (!abpjVar.c()) {
            tbsVar2.d = defpackage.abox.I(abpjVar);
        }
        defpackage.szw szwVar = this.f;
        tbsVar2.d.add(tbaVarQ);
        szwVar.d(list, (tbs) aborVarN.q(), new defpackage.kwz(eqsVar, i2));
        return eqsVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kxc
    public final void O(defpackage.qki qkiVar) throws wfo {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3635)).u("startTranscription");
        defpackage.wfp.c();
        if (this.e.b) {
            if (qkiVar == null) {
                ((defpackage.yqj) yqmVar.l().ai((char) 3636)).u("Transcription callback is null");
                defpackage.lam.a();
                defpackage.lam.e(defpackage.yxo.START_TRANSCRIPTION_WITHOUT_CALLBACK, null);
            }
            com.google.android.gearhead.sdk.assistant.VoiceSessionConfig voiceSessionConfigR = R(6, 1);
            this.J = false;
            voiceSessionConfigR.l = new qkb(this.z);
            java.util.List list = this.y;
            if (!list.contains(qkiVar)) {
                list.add(qkiVar);
            }
            ab(voiceSessionConfigR);
        }
    }

    @Override // defpackage.kxc
    public final void P(int i) {
        this.N = i;
        if (this.m && this.n == 5) {
            n(defpackage.yxp.FACET_SWITCHED);
            ((defpackage.yqj) a.l().ai((char) 3626)).u("Closing assistant due to facet change during recommendations");
        }
    }

    public final android.content.res.Resources Q(java.lang.String str) {
        if (str == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3591)).u("Locale is null");
            return this.d.getResources();
        }
        android.content.Context context = this.d;
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str);
        android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
        configuration.setLocale(localeForLanguageTag);
        return context.createConfigurationContext(configuration).getResources();
    }

    public final com.google.android.gearhead.sdk.assistant.VoiceSessionConfig R(int i, int i2) {
        com.google.android.gearhead.sdk.assistant.VoiceSessionConfig voiceSessionConfig = new com.google.android.gearhead.sdk.assistant.VoiceSessionConfig();
        voiceSessionConfig.a = i;
        voiceSessionConfig.f = i2;
        defpackage.ojm.a();
        voiceSessionConfig.g = j$.time.Instant.now().toEpochMilli();
        defpackage.yqm yqmVar = com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider.a;
        voiceSessionConfig.d = acni.c() ? new android.net.Uri.Builder().scheme("content").authority("com.google.android.apps.gsa.testing.ui.audio.recorded").path("emulated_mic_audio").build() : new android.net.Uri.Builder().scheme("content").authority("com.google.android.projection.gearhead.provider").path("/mic").build();
        voiceSessionConfig.e = 16000;
        voiceSessionConfig.i = true;
        voiceSessionConfig.n = defpackage.mpr.f().a().m();
        voiceSessionConfig.j = true;
        try {
            voiceSessionConfig.k = this.d.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 0).versionName;
            voiceSessionConfig.o = defpackage.mpr.f().a().e();
            return voiceSessionConfig;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.IllegalStateException("Unable to find Gearhead package name while in Gearhead.", e);
        }
    }

    public final void S(java.lang.Throwable th, defpackage.yxo yxoVar) {
        defpackage.lao.c(new defpackage.jdh((java.lang.Object) this, (java.lang.Object) th, (java.lang.Object) yxoVar, 12, (byte[]) null));
    }

    public final void T(java.lang.Throwable th, defpackage.yxo yxoVar) {
        V(th, yxoVar);
        U();
    }

    public final void U() {
        char c;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3602)).u("handleVoiceSessionEnd");
        defpackage.xzg xzgVar = this.F;
        if (xzgVar != null) {
            if (xzgVar.a) {
                xzgVar.f();
                defpackage.oim oimVarU = defpackage.omf.u();
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.ASSISTANT, defpackage.zbd.pc);
                rrvVarH.u(this.F.a(java.util.concurrent.TimeUnit.MILLISECONDS));
                oimVarU.F(rrvVarH.l());
            }
            this.F = null;
        }
        defpackage.lam.a().h(203, null);
        if (!this.m) {
            ((defpackage.yqj) yqmVar.l().ai((char) 3607)).u("onVoiceSessionEnd. There is no active voice session to end.");
            if (defpackage.acyc.am()) {
                ao();
                return;
            }
            return;
        }
        try {
            try {
                defpackage.kyq kyqVar = this.b;
                ((defpackage.yqj) ((defpackage.yqj) defpackage.kyq.a.f()).ai((char) 3554)).u("onVoiceSessionEnd");
                if (kyqVar.d != 5) {
                    kyqVar.a();
                }
                kyqVar.d = 0;
                ao();
                c = 3603;
                if (defpackage.laq.a().b()) {
                    java.util.List list = this.y;
                    if (list.isEmpty() || !this.J) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3604)).N("Not sending focus lost to transcription callbacks %s, %b", list, this.J);
                    } else {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((defpackage.qki) it.next()).c();
                        }
                    }
                }
            } catch (defpackage.kxj e) {
                V(e, e.a);
                c = 3605;
            }
            this.m = false;
            int i = this.n;
            this.n = 0;
            this.o.b(2);
            defpackage.lam.a().i(204);
            ak();
            boolean zJ = J();
            ((defpackage.yqj) a.l().ai(c)).y("isGeminiEnabledAndEligible: %b", java.lang.Boolean.valueOf(zJ));
        } finally {
            this.m = false;
            int i2 = this.n;
            this.n = 0;
            this.o.b(2);
            defpackage.lam.a().i(204);
            ak();
            boolean zJ2 = J();
            ((defpackage.yqj) a.l().ai((char) 3606)).y("isGeminiEnabledAndEligible: %b", java.lang.Boolean.valueOf(zJ2));
            if (i2 == 10) {
                defpackage.ngr.a().c(zJ2 ? ngu.o : new ngm());
            } else {
                ap(zJ2 ? 1 : 0, 1);
            }
            if (defpackage.acqn.g()) {
                android.content.Context context = this.d;
                if (zJ2) {
                    defpackage.lby.h.e(context);
                } else {
                    defpackage.lby.g.e(context);
                }
            }
        }
    }

    public final void V(java.lang.Throwable th, defpackage.yxo yxoVar) {
        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(th)).ai((char) 3616)).y("handleInternalError: %s", new defpackage.zkf(defpackage.zke.a, yxoVar.name()));
        defpackage.ocn.a().c(this.d, defpackage.mkt.C, 2132085448, 0);
        defpackage.lam.a().d(yxoVar);
    }

    public final void W(defpackage.saf safVar) {
        boolean zAg = ag();
        boolean zAf = af();
        defpackage.saf safVarB = safVar.a("started", java.lang.Boolean.valueOf(this.q)).a("assistantState", java.lang.Integer.valueOf(this.G)).a("apiVersion", java.lang.Integer.valueOf(this.j)).a("assistantDisconnectCount", java.lang.Integer.valueOf(this.l)).b("statusAtTimeOfLastAssistantDisconnect", new defpackage.kos(this, safVar, 18));
        int i = this.N;
        java.lang.String strDd = defpackage.ysr.dd(i);
        if (i == 0) {
            throw null;
        }
        safVarB.a("activeFacet", strDd).a("primaryRegionAppPackageName", this.I).b("gearheadFlags", new defpackage.kos(this, safVar, 19)).b("assistantFeatureFlags", new defpackage.kos(this, safVar, 20)).a("coolwalkSuggestionsEnabled", java.lang.Boolean.valueOf(zAg)).a("coolwalkMediaRecommendationsEnabled", java.lang.Boolean.valueOf(zAf));
        if (zAg || zAf) {
            safVar.b("suggestionsManager", new defpackage.kmp(safVar, 12));
        }
    }

    public final void X() {
        defpackage.abor aborVarN = osy.a.n();
        otc otcVar = otc.a;
        aborVarN.t();
        osy osyVar = aborVarN.b;
        otcVar.getClass();
        osyVar.f = otcVar;
        osyVar.b |= 16;
        x((osy) aborVarN.q());
        this.A = 3;
    }

    public final void Y(java.lang.String str, android.os.Bundle bundle) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3628)).y("startDirectQuery called with query: %s", str);
        if (android.text.TextUtils.isEmpty(str)) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 3629)).u("Direct Action query did not have a valid query string");
            defpackage.lam.a();
            defpackage.lam.e(defpackage.yxo.START_VOICE_SESSION_DIRECT_ACTION_INVALID_QUERY, null);
        } else {
            com.google.android.gearhead.sdk.assistant.VoiceSessionConfig voiceSessionConfigR = R(4, 1);
            voiceSessionConfigR.h = bundle;
            voiceSessionConfigR.c = str;
            defpackage.lao.b(new defpackage.kos(this, voiceSessionConfigR, 10));
        }
    }

    public final void Z(com.google.android.gearhead.sdk.assistant.MessagingInfo messagingInfo, int i) {
        if (i == 8) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3634)).y("autoplayMessage(%s)", messagingInfo);
        } else if (i == 2) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3633)).y("readMessage(%s)", messagingInfo);
        } else {
            if (i != 3) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3630)).u("incorrect voice session type for read or reply message");
                return;
            }
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3632)).y("directReplyMessage(%s)", messagingInfo);
        }
        int i2 = this.N;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        com.google.android.gearhead.sdk.assistant.ClientStateSnapshot clientStateSnapshotA = defpackage.lao.a(i3, this.I);
        clientStateSnapshotA.b = new java.util.ArrayList(1);
        clientStateSnapshotA.b.add(messagingInfo);
        an(R(i, i == 8 ? 7 : 1), clientStateSnapshotA);
    }

    @Override // defpackage.kxc
    public final defpackage.eqp a() {
        if (defpackage.acqe.q()) {
            return this.e.g;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.afdo afdoVar = defpackage.tcu.a;
        return new defpackage.eqs(bool);
    }

    public final void aa() {
        defpackage.ler.c().fW(new kyz(this), true);
    }

    public final void ab(com.google.android.gearhead.sdk.assistant.VoiceSessionConfig voiceSessionConfig) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3638)).D("startVoiceSearchMainThread trigger=%d payload=%s", voiceSessionConfig.f, voiceSessionConfig.h);
        if (!this.q) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3639)).u("Can't start voice session when the controller is not started");
            defpackage.lam.a();
            defpackage.lam.e(defpackage.yxo.START_VOICE_SESSION_ERROR_CONTROLLER_NOT_STARTED, null);
            return;
        }
        int i = this.N;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        com.google.android.gearhead.sdk.assistant.ClientStateSnapshot clientStateSnapshotA = defpackage.lao.a(i2, this.I);
        int i3 = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        int iB = defpackage.lub.a().b();
        int iB2 = defpackage.lub.a().b();
        int iB3 = defpackage.lub.a().b();
        defpackage.mnw mnwVarO = defpackage.lxy.o();
        defpackage.zaw zawVar = defpackage.zaw.IM_NOTIFICATION;
        for (luk lukVar : mnwVarO.b(zawVar, defpackage.zaw.SMS_NOTIFICATION)) {
            defpackage.zbd zbdVar = lukVar.J() == zawVar ? defpackage.zbd.mt : defpackage.zbd.ms;
            defpackage.zbd zbdVar2 = lukVar.J() == zawVar ? defpackage.zbd.mp : defpackage.zbd.mo;
            defpackage.zbd zbdVar3 = lukVar.J() == zawVar ? defpackage.zbd.mu : defpackage.zbd.mv;
            luk lukVar2 = lukVar;
            luf lufVar = ((moi) lukVar2).j.equals(zawVar) ? luf.a : luf.b;
            java.lang.String str = ((moi) lukVar2).l;
            if (str == null) {
                str = "com.google.android.projection.gearhead";
            }
            ygrVar.i(defpackage.lnt.k().k(lukVar2, new wif(lufVar, lug.d, luh.g, new android.content.ComponentName(str, ""), false), zbdVar, zbdVar2, zbdVar3, java.lang.Integer.valueOf(iB2), java.lang.Integer.valueOf(iB), java.lang.Integer.valueOf(iB3)));
        }
        clientStateSnapshotA.b = ygrVar.g();
        an(voiceSessionConfig, clientStateSnapshotA);
    }

    public final void ac(defpackage.yxp yxpVar) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3641)).y("stopVoiceSearch with cancel trigger %s", yxpVar);
        if (!this.m) {
            ((defpackage.yqj) yqmVar.l().ai((char) 3642)).u("There is active no voice session to stop.");
            if (defpackage.acyc.am()) {
                ao();
                return;
            }
            return;
        }
        defpackage.szw szwVar = this.f;
        synchronized (szwVar) {
            try {
                szwVar.m(yxpVar, new defpackage.maj(1));
                U();
            } catch (java.lang.Throwable th) {
                U();
                throw th;
            }
        }
    }

    public final void ad(int i) {
        if (this.G == i) {
            return;
        }
        this.G = i;
        java.util.Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((defpackage.kxd) it.next()).a(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    public final void ae(defpackage.otu otuVar) {
        defpackage.eqs eqsVar = this.w;
        defpackage.otu otuVar2 = (defpackage.otu) eqsVar.e();
        ((defpackage.yqj) a.l().ai(3643)).M("Prev gemini state is %s, New gemini state is %s", otuVar2 != null ? otuVar2.name() : null, otuVar != null ? otuVar.name() : null);
        defpackage.otu otuVar3 = defpackage.otu.LIVE_INACTIVE;
        boolean z = otuVar == otuVar3 && otuVar2 == defpackage.otu.LIVE_ACTIVE;
        defpackage.otu otuVar4 = defpackage.otu.LIVE_HOLD;
        boolean z2 = otuVar == otuVar4 && otuVar2 == defpackage.otu.LIVE_ACTIVE;
        boolean z3 = otuVar == defpackage.otu.LIVE_ACTIVE && otuVar2 != otuVar;
        boolean z4 = otuVar == otuVar3 && otuVar2 == otuVar4;
        if (!z3) {
            if (z || z2) {
                this.m = false;
                ak();
            } else if (z4) {
                ap(0, 2);
            }
            eqsVar.m(otuVar);
        }
        this.m = true;
        ak();
        if (this.x) {
            defpackage.wfp.d(new defpackage.img(7), defpackage.acnf.k());
        }
        am();
        al();
        if (z) {
            ap(0, 2);
        } else if (z4) {
            ap(0, 2);
        }
        eqsVar.m(otuVar);
    }

    @java.lang.Deprecated
    public final boolean af() {
        return defpackage.acqe.q() && ((defpackage.osi) this.h.get()).c;
    }

    public final boolean ag() {
        return defpackage.acqe.p() && ((defpackage.osi) this.h.get()).c;
    }

    public final boolean ah(android.content.Intent intent) {
        ((defpackage.yqj) a.l().ai((char) 3619)).u("processIntentResult");
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new kys(this, intent));
        defpackage.lao.c(futureTask);
        try {
            return ((java.lang.Boolean) futureTask.get()).booleanValue();
        } catch (java.lang.InterruptedException e) {
            S(e, defpackage.yxo.PROCESS_INTENT_RESULT_INTERRUPTED);
            return true;
        } catch (java.util.concurrent.CancellationException e2) {
            S(e2, defpackage.yxo.PROCESS_INTENT_RESULT_CANCELLED);
            return true;
        } catch (java.util.concurrent.ExecutionException e3) {
            S(e3, defpackage.yxo.PROCESS_INTENT_RESULT_EXECUTION_EXCEPTION);
            return true;
        } catch (java.lang.Exception e4) {
            S(e4, defpackage.yxo.PROCESS_INTENT_RESULT_GENERIC_EXCEPTION);
            return true;
        }
    }

    @Override // defpackage.kxc
    public final defpackage.eqp b() {
        if (defpackage.acqe.u()) {
            aa();
        }
        int i = 3;
        if (defpackage.acqe.w()) {
            int i2 = this.A;
            if (i2 == 0) {
                throw null;
            }
            if (i2 != 3) {
                if (this.r) {
                    X();
                } else {
                    this.A = 2;
                }
            }
        }
        return defpackage.ebo.g(a(), new defpackage.kwz(this, i));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.lhn
    public final void d() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3640)).u("stop");
        defpackage.kzc kzcVar = this.K;
        if (kzcVar != null) {
            defpackage.mak.e().b().k(kzcVar.c);
            this.K = null;
        }
        this.q = false;
        defpackage.mni.a().d(defpackage.mnh.c);
        this.f.a();
        if (this.r) {
            this.r = false;
            this.A = 1;
            kzy.a().c();
        }
        this.h.set(ai(this.C));
        this.u.m(java.lang.Boolean.FALSE);
        this.w.m(defpackage.otu.LIVE_INACTIVE);
        this.m = false;
        this.e.d();
        defpackage.kyq kyqVar = this.b;
        defpackage.mni.a().d(defpackage.mnh.d);
        kyqVar.g.getClass();
        if (kyqVar.c) {
            defpackage.roz rozVar = kyqVar.g;
            try {
                rozVar.a.d(rozVar.d);
            } catch (android.os.RemoteException | java.lang.IllegalStateException unused) {
            }
        }
        kyqVar.b.f.r();
        kyqVar.g.a();
        kyqVar.g = null;
        kyqVar.c = false;
        kyqVar.e = null;
        this.B = null;
        defpackage.lam lamVarA = defpackage.lam.a();
        defpackage.wfp.f(lamVarA.c);
        synchronized (lamVarA.a) {
            ((defpackage.lan) lamVarA.b).b();
            lamVarA.b = new defpackage.lan(-1, 1, 1, null, 0L);
        }
    }

    @Override // defpackage.kxc
    public final defpackage.eqp e() {
        return this.e.e;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:18:0x010f  */
    @Override // defpackage.lhn
    public final void eQ() {
        boolean zJ;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3627)).u("start");
        defpackage.kyq kyqVar = this.b;
        int i = 0;
        defpackage.kgu.d(new defpackage.kyo(kyqVar, i), "GH.Assistant.CarMsngr", defpackage.zbe.ASSISTANT_ADAPTER, defpackage.zbd.pa, "Unable to access car", new java.lang.Object[0]);
        defpackage.mni.a().b(defpackage.mnh.d, new defpackage.kyt(kyqVar, 1));
        this.e.eQ();
        this.l = 0;
        android.content.Context context = this.d;
        if (context != null) {
            if (defpackage.mdp.d().u()) {
                zJ = this.f.j(new defpackage.kyu(this));
            } else {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3583)).u("Not connecting to assistant because the microphone permission isn't granted");
                ad(3);
                defpackage.lam.a();
                defpackage.lam.e(defpackage.yxo.SERVICE_MISSING_PERMISSIONS, null);
            }
            this.q = zJ;
            int i2 = 7;
            defpackage.mps.e().eM(defpackage.ler.c(), new defpackage.kqk(this, i2));
            defpackage.mni.a().b(defpackage.mnh.c, new defpackage.kyt(this, i));
            this.k = context.getSharedPreferences("AssistantPreferences", 0);
            if (defpackage.acqq.c() || this.D != null) {
                defpackage.afar afarVar = defpackage.mik.a;
                defpackage.mik mikVarE = defpackage.mdp.e();
                defpackage.whf whfVarA = defpackage.whg.a();
                java.util.regex.Pattern pattern = defpackage.wfx.a;
                defpackage.wfw wfwVar = new defpackage.wfw(context);
                wfwVar.b("assistant");
                wfwVar.c("assistant_stored_data.pb");
                whfVarA.d(wfwVar.a());
                whfVarA.c(defpackage.kxg.a);
                whfVarA.e(O);
                this.M = mikVarE.a(whfVarA.a());
            } else {
                java.util.concurrent.Executor executor = this.H;
                defpackage.ehy ehyVar = new defpackage.ehy(new defpackage.ehd(defpackage.kxg.a, defpackage.abol.a()), new defpackage.fma(context, i2));
                ehyVar.a = new defpackage.ehw(new defpackage.kmu(i2));
                ehyVar.a(executor);
                this.D = ehyVar.b();
            }
            if (defpackage.acnf.z()) {
                this.K = new defpackage.kzc();
            }
            this.B = new defpackage.htw((byte[]) null, (char[]) null, (byte[]) null);
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 3584)).u("Trying to connect to assistant when already torn down");
        zJ = false;
        this.q = zJ;
        int i3 = 7;
        defpackage.mps.e().eM(defpackage.ler.c(), new defpackage.kqk(this, i3));
        defpackage.mni.a().b(defpackage.mnh.c, new defpackage.kyt(this, i));
        this.k = context.getSharedPreferences("AssistantPreferences", 0);
        if (defpackage.acqq.c()) {
            defpackage.afar afarVar2 = defpackage.mik.a;
            defpackage.mik mikVarE2 = defpackage.mdp.e();
            defpackage.whf whfVarA2 = defpackage.whg.a();
            java.util.regex.Pattern pattern2 = defpackage.wfx.a;
            defpackage.wfw wfwVar2 = new defpackage.wfw(context);
            wfwVar2.b("assistant");
            wfwVar2.c("assistant_stored_data.pb");
            whfVarA2.d(wfwVar2.a());
            whfVarA2.c(defpackage.kxg.a);
            whfVarA2.e(O);
            this.M = mikVarE2.a(whfVarA2.a());
        } else {
            defpackage.afar afarVar3 = defpackage.mik.a;
            defpackage.mik mikVarE3 = defpackage.mdp.e();
            defpackage.whf whfVarA3 = defpackage.whg.a();
            java.util.regex.Pattern pattern3 = defpackage.wfx.a;
            defpackage.wfw wfwVar3 = new defpackage.wfw(context);
            wfwVar3.b("assistant");
            wfwVar3.c("assistant_stored_data.pb");
            whfVarA3.d(wfwVar3.a());
            whfVarA3.c(defpackage.kxg.a);
            whfVarA3.e(O);
            this.M = mikVarE3.a(whfVarA3.a());
        }
        if (defpackage.acnf.z()) {
            this.K = new defpackage.kzc();
        }
        this.B = new defpackage.htw((byte[]) null, (char[]) null, (byte[]) null);
    }

    @Override // defpackage.kxc
    public final defpackage.eqp f() {
        if (defpackage.acqq.c()) {
            defpackage.ysr.cy(this.D.D(), new defpackage.ikx(this, 5), aj());
        } else {
            defpackage.ysr.cy(this.M.c(), new defpackage.ikx(this, 6), aj());
        }
        return this.t;
    }

    @Override // defpackage.kxc
    public final defpackage.eqp g() {
        return this.u;
    }

    @Override // defpackage.kxc
    public final defpackage.eqp h() {
        return defpackage.ebo.f(this.w, new defpackage.kmu(6));
    }

    @Override // defpackage.kxc
    public final defpackage.eqp i() {
        return this.v;
    }

    @Override // defpackage.kxc
    public final defpackage.eqp j() {
        return defpackage.ebo.f(this.w, new defpackage.krx(15));
    }

    @Override // defpackage.kxc
    public final defpackage.kxf k() {
        return this.e;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kxc
    public final void l(defpackage.qki qkiVar) throws wfo {
        defpackage.wfp.c();
        java.util.List list = this.y;
        if (list.contains(qkiVar)) {
            return;
        }
        list.add(qkiVar);
    }

    @Override // defpackage.kxc
    public final void m(com.google.android.gearhead.sdk.assistant.MessagingInfo messagingInfo) {
        defpackage.lao.b(new defpackage.kos(this, messagingInfo, 9));
    }

    @Override // defpackage.kxc
    public final void n(defpackage.yxp yxpVar) {
        defpackage.lao.b(new defpackage.kos(this, yxpVar, 14));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kxc
    public final void o(osv osvVar) throws wfo {
        defpackage.wfp.c();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3589)).y("fulfillSuggestionAction isDirectAction=%s", java.lang.Boolean.valueOf(osvVar.e));
        if (!osvVar.e) {
            com.google.android.gearhead.sdk.assistant.VoiceSessionConfig voiceSessionConfigR = R(5, 6);
            voiceSessionConfigR.m = osvVar.c;
            ab(voiceSessionConfigR);
            return;
        }
        defpackage.szw szwVar = this.f;
        defpackage.abor aborVarN = tat.a.n();
        java.lang.String str = osvVar.c;
        aborVarN.t();
        tat tatVar = aborVarN.b;
        str.getClass();
        tatVar.b |= 1;
        tatVar.c = str;
        defpackage.ojm.a();
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        aborVarN.t();
        tat tatVar2 = aborVarN.b;
        tatVar2.b |= 2;
        tatVar2.d = epochMilli;
        szwVar.b((tat) aborVarN.q());
    }

    @Override // defpackage.kxc
    public final void p() {
        if (this.w.e() != defpackage.otu.LIVE_ACTIVE) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3611)).u("Can't interrupt non-active live session");
        } else {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3612)).u("Interrupting live");
            ac(defpackage.yxp.INTERRUPTED);
        }
    }

    @Override // defpackage.kxc
    public final void q() {
        if (defpackage.acqq.c()) {
            defpackage.ysr.cy(this.D.E(new lda(1)), new defpackage.ikx(this, 7), aj());
        } else {
            defpackage.ysr.cy(this.M.a(new defpackage.ikt(6), aj()), new defpackage.ikx(this, 8), aj());
        }
    }

    @Override // defpackage.kxc
    public final void r(defpackage.kxd kxdVar) {
        kxdVar.getClass();
        this.g.add(kxdVar);
        kxdVar.a(this.G);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kxc
    public final void s(defpackage.qki qkiVar) throws wfo {
        defpackage.wfp.c();
        this.y.remove(qkiVar);
    }

    @Override // defpackage.kxc
    public final void t(com.google.android.gearhead.sdk.assistant.MessagingInfo messagingInfo) {
        defpackage.lao.b(new defpackage.kos(this, messagingInfo, 17));
    }

    @Override // defpackage.kxc
    public final void u() {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3620)).u("saveFeedback");
        if (!defpackage.nuc.a().b()) {
            ((defpackage.yqj) yqmVar.l().ai((char) 3621)).u("Saving app feedback without Assistant since data is not connected");
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.ASSISTANT, defpackage.zbd.yK).l());
            defpackage.jzb.s().a(this.d, "ASSISTANT");
            return;
        }
        defpackage.ocn.a().c(this.d, defpackage.mkt.C, 2132085451, 0);
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.ASSISTANT, defpackage.zbd.yH).l());
        int i = defpackage.ygw.d;
        B(2132085450, j$.util.Optional.empty(), j$.util.Optional.empty(), defpackage.ymx.a);
    }

    @Override // defpackage.kxc
    public final void v(ott ottVar) {
        if (this.j < 5 || !defpackage.acza.L()) {
            ((defpackage.yqj) a.l().ai((char) 3622)).u("sending GearheadEvent not supported");
            return;
        }
        this.f.f(ottVar);
        if (defpackage.acnf.v()) {
            int i = ottVar.c;
            defpackage.ots otsVarB = defpackage.ots.b(i);
            if (otsVarB == null) {
                otsVarB = defpackage.ots.EVENT_TYPE_UNSPECIFIED;
            }
            if (otsVarB != defpackage.ots.GEMINI_THUMBS_DOWN_FEEDBACK_CLICKED) {
                defpackage.ots otsVarB2 = defpackage.ots.b(i);
                if (otsVarB2 == null) {
                    otsVarB2 = defpackage.ots.EVENT_TYPE_UNSPECIFIED;
                }
                if (otsVarB2 != defpackage.ots.ASSISTANT_THUMBS_DOWN_FEEDBACK_CLICKED) {
                    return;
                }
            }
            defpackage.lao.b(new defpackage.kmp(this, 11));
        }
    }

    @Override // defpackage.kxc
    public final void w(osx osxVar) {
        defpackage.yqm yqmVar = a;
        defpackage.sag sagVarN = defpackage.sag.n();
        ((defpackage.yqj) yqmVar.l().ai((char) 3623)).y("sendSuggestionLoggingEvent(%s)", ((defpackage.sag) sagVarN.f("AssistantSuggestionLoggingEvent", new defpackage.kza((defpackage.saf) sagVarN, (java.lang.Object) osxVar, 11))).toString());
        this.f.g(osxVar);
    }

    @Override // defpackage.kxc
    public final void x(osy osyVar) {
        if (!ag() && !af()) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3625)).u("sendSuggestionSignal is ignored because suggestion is not enabled");
        } else {
            ((defpackage.sag) defpackage.kzi.d(defpackage.sag.n(), osyVar)).toString();
            this.f.h(osyVar);
        }
    }

    @Override // defpackage.kxc
    public final void y() {
        ae(defpackage.otu.LIVE_INACTIVE);
    }

    @Override // defpackage.kxc
    public final void z(java.lang.String str) {
        this.I = str;
    }
}
