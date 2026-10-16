package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider;
import com.google.android.gearhead.sdk.assistant.ClientStateSnapshot;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.gearhead.sdk.assistant.VoiceSessionConfig;
import com.google.android.projection.gearhead.R;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class kyw implements kwv {
    public volatile int A;
    public htm B;
    public final wyd C;
    ncp D;
    private xya F;
    private int G;
    private final Executor H;
    private String I;
    private boolean J;
    private kyx K;
    private final Handler L;
    private wgx M;
    public final kyk b;
    public final kzg c;
    public final Context d;
    public final kzc e;
    public final syy f;
    public final AtomicReference h;
    public final AtomicReference i;
    public int j;
    public SharedPreferences k;
    public int l;
    public volatile boolean m;
    public volatile int n;
    final kzf o;
    final kyh p;
    public boolean q;
    public volatile boolean r;
    public final eqm s;
    public final eqm t;
    public final eqm u;
    final eqm v;
    final eqm w;
    public boolean x;
    public final List y;
    public final qjm z;
    public static final yph a = yph.c("GH.Assistant.Controller");
    private static final kwp O = new kwp(kwz.a);
    private int N = 1;
    private volatile boolean E = false;
    public final List g = new CopyOnWriteArrayList();

    public kyw(Context context, kyk kykVar, kzg kzgVar, Executor executor, Function function) {
        wyd wydVar = new wyd(this, null);
        this.C = wydVar;
        this.i = new AtomicReference("Assistant has not disconnected yet");
        this.j = -1;
        this.l = 0;
        this.n = 0;
        this.o = new kzf();
        this.p = new kyh();
        this.G = 0;
        this.A = 1;
        this.s = new eqm();
        this.t = new eqm();
        this.u = new eqm();
        this.v = new eqm();
        this.w = new eqm();
        this.x = false;
        this.y = new CopyOnWriteArrayList();
        this.L = new kyr(this, Looper.getMainLooper());
        this.z = new kyq(this);
        this.d = context;
        this.h = new AtomicReference(ai(wydVar));
        this.b = kykVar;
        this.c = kzgVar;
        this.H = executor;
        syy syyVar = (syy) function.apply(new syq(new wyd(this, null), wydVar, new lau(), executor));
        this.f = syyVar;
        this.e = new kzc(context, syyVar);
    }

    public static orl ai(wyd wydVar) {
        abnp abnpVarN = orl.a.n();
        boolean zO = wydVar.o();
        abnpVarN.t();
        orl orlVar = (orl) abnpVarN.b;
        orlVar.b |= 4;
        orlVar.e = zO;
        return (orl) abnpVarN.q();
    }

    private final Executor aj() {
        return this.d.getMainExecutor();
    }

    private final void ak() {
        ComponentName componentNameA = map.a(kio.b().e(), true);
        if (componentNameA == null) {
            ((ype) a.l().ai((char) 3579)).u("No default nav component found. Aborting assistant changed broadcast");
            return;
        }
        Intent intent = new Intent("com.google.android.gearhead.ASSISTANT_STATE_CHANGED");
        intent.putExtra("ASSISTANT_ACTIVE", this.m);
        intent.setPackage(componentNameA.getPackageName());
        this.d.sendBroadcast(intent);
    }

    private final void al() {
        this.L.removeMessages(1);
        nwi.a().e(nuo.f);
    }

    private final void am() {
        this.L.removeMessages(2);
        nwi.a().e(nuo.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0178 A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:8:0x0024, B:10:0x002a, B:11:0x002f, B:13:0x0031, B:17:0x004b, B:19:0x0064, B:66:0x0173, B:68:0x0178, B:70:0x0182, B:72:0x0198, B:73:0x019f, B:75:0x01b9, B:76:0x01e4, B:74:0x01b0, B:21:0x0071, B:30:0x00ac, B:31:0x00b2, B:33:0x00b8, B:34:0x00be, B:37:0x00c3, B:38:0x00c9, B:24:0x0085, B:26:0x008c, B:28:0x0092, B:29:0x00a7, B:41:0x00d3, B:42:0x00da, B:44:0x0100, B:46:0x0102, B:47:0x0118, B:50:0x012f, B:54:0x013f, B:55:0x0145, B:57:0x014b, B:58:0x0151, B:61:0x0156, B:62:0x015c, B:52:0x0135, B:53:0x0138, B:65:0x016e), top: B:84:0x0024, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b0 A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:8:0x0024, B:10:0x002a, B:11:0x002f, B:13:0x0031, B:17:0x004b, B:19:0x0064, B:66:0x0173, B:68:0x0178, B:70:0x0182, B:72:0x0198, B:73:0x019f, B:75:0x01b9, B:76:0x01e4, B:74:0x01b0, B:21:0x0071, B:30:0x00ac, B:31:0x00b2, B:33:0x00b8, B:34:0x00be, B:37:0x00c3, B:38:0x00c9, B:24:0x0085, B:26:0x008c, B:28:0x0092, B:29:0x00a7, B:41:0x00d3, B:42:0x00da, B:44:0x0100, B:46:0x0102, B:47:0x0118, B:50:0x012f, B:54:0x013f, B:55:0x0145, B:57:0x014b, B:58:0x0151, B:61:0x0156, B:62:0x015c, B:52:0x0135, B:53:0x0138, B:65:0x016e), top: B:84:0x0024, inners: #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void an(com.google.android.gearhead.sdk.assistant.VoiceSessionConfig r13, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot r14) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyw.an(com.google.android.gearhead.sdk.assistant.VoiceSessionConfig, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot):void");
    }

    private final void ao() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((kww) it.next()).b();
            } catch (kxc e) {
                T(e, e.a);
            }
        }
    }

    private final void ap(int i, int i2) {
        Message message = new Message();
        message.arg1 = i;
        message.arg2 = 0;
        message.what = i2;
        this.L.sendMessageDelayed(message, acmd.j());
    }

    @Override // defpackage.kwv
    public final /* synthetic */ void A(int i, osv osvVar) {
        Optional optionalEmpty = Optional.empty();
        Optional optionalOf = Optional.of(osvVar);
        int i2 = yfq.d;
        B(i, optionalEmpty, optionalOf, yls.a);
    }

    @Override // defpackage.kwv
    public final void B(int i, Optional optional, Optional optional2, List list) {
        wer.c();
        wub.ah(zgj.v(szp.m(lbh.d(), e())), new kys(this, i, list, optional, optional2), this.d.getMainExecutor());
    }

    @Override // defpackage.kwv
    public final void C(String str) {
        Y(str, null);
    }

    @Override // defpackage.kwv
    public final void D(String str, String str2, osv osvVar) {
        wer.c();
        wub.ah(zgj.v(szp.m(lbh.d(), e())), new sey(this, str, str2, osvVar, 1), this.d.getMainExecutor());
    }

    @Override // defpackage.kwv
    public final void E(String str, String str2, String str3, String str4, String str5, osv osvVar) {
        wer.c();
        wub.ah(zgj.v(szp.m(lbh.d(), e())), new kyt(this, str, str3, str2, str4, str5, osvVar), this.d.getMainExecutor());
    }

    @Override // defpackage.kwv
    public final void F(int i) {
        G(i, null);
    }

    @Override // defpackage.kwv
    public final void G(int i, Bundle bundle) {
        VoiceSessionConfig voiceSessionConfigR = R(true != laj.d(i) ? 1 : 5, i);
        ebf.j().F(rrc.h(yxy.GEARHEAD, i != 1 ? (i == 2 || i == 3) ? yzz.SYSTEM_ASSISTANT_INVOKED_HARDWARE_BUTTON : i != 4 ? yzz.ASSISTANT : yzz.SYSTEM_ASSISTANT_INVOKED_HOTWORD : yzz.SYSTEM_ASSISTANT_INVOKED_TAP_MIC, yzy.oZ).l());
        voiceSessionConfigR.h = bundle;
        this.F = xya.b(xvx.a);
        laj.b(new kot(this, voiceSessionConfigR, 11));
    }

    @Override // defpackage.kwv
    public final void H(MessagingInfo messagingInfo) {
        laj.b(new kot(this, messagingInfo, 10));
    }

    @Override // defpackage.kwv
    public final void I(kww kwwVar) {
        kwwVar.getClass();
        this.g.remove(kwwVar);
    }

    @Override // defpackage.kwv
    public final boolean J() {
        return ((orl) this.h.get()).n && Objects.equals(this.u.e(), true);
    }

    @Override // defpackage.kwv
    public final boolean K() {
        return this.e.b;
    }

    @Override // defpackage.kwv
    public final boolean L() {
        return this.m;
    }

    @Override // defpackage.kwv
    public final boolean M() {
        return ((orl) this.h.get()).j;
    }

    @Override // defpackage.kwv
    public final eqj N(List list, int i) {
        eqm eqmVar = new eqm();
        abnp abnpVarN = tau.a.n();
        abnpVarN.t();
        tau tauVar = (tau) abnpVarN.b;
        tauVar.c = 2;
        tauVar.b |= 1;
        abnp abnpVarN2 = tac.a.n();
        abnpVarN2.t();
        tac tacVar = (tac) abnpVarN2.b;
        tacVar.b |= 1;
        tacVar.c = 1;
        if (i > 0) {
            abnpVarN2.t();
            tac tacVar2 = (tac) abnpVarN2.b;
            tacVar2.b = 2 | tacVar2.b;
            tacVar2.d = i;
        }
        tac tacVar3 = (tac) abnpVarN2.q();
        abnpVarN.t();
        tau tauVar2 = (tau) abnpVarN.b;
        tacVar3.getClass();
        aboh abohVar = tauVar2.d;
        if (!abohVar.c()) {
            tauVar2.d = abnv.I(abohVar);
        }
        syy syyVar = this.f;
        tauVar2.d.add(tacVar3);
        syyVar.d(list, (tau) abnpVarN.q(), new kut(eqmVar, 6));
        return eqmVar;
    }

    @Override // defpackage.kwv
    public final void O(qjm qjmVar) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 3632)).u("startTranscription");
        wer.c();
        if (this.e.b) {
            if (qjmVar == null) {
                ((ype) yphVar.l().ai((char) 3633)).u("Transcription callback is null");
                lah.a();
                lah.e(ywj.START_TRANSCRIPTION_WITHOUT_CALLBACK, null);
            }
            VoiceSessionConfig voiceSessionConfigR = R(6, 1);
            this.J = false;
            voiceSessionConfigR.l = new qjf(this.z);
            List list = this.y;
            if (!list.contains(qjmVar)) {
                list.add(qjmVar);
            }
            ab(voiceSessionConfigR);
        }
    }

    @Override // defpackage.kwv
    public final void P(int i) {
        this.N = i;
        if (this.m && this.n == 5) {
            n(ywk.FACET_SWITCHED);
            ((ype) a.l().ai((char) 3623)).u("Closing assistant due to facet change during recommendations");
        }
    }

    public final Resources Q(String str) {
        if (str == null) {
            ((ype) ((ype) a.h()).ai((char) 3588)).u("Locale is null");
            return this.d.getResources();
        }
        Context context = this.d;
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(localeForLanguageTag);
        return context.createConfigurationContext(configuration).getResources();
    }

    public final VoiceSessionConfig R(int i, int i2) {
        VoiceSessionConfig voiceSessionConfig = new VoiceSessionConfig();
        voiceSessionConfig.a = i;
        voiceSessionConfig.f = i2;
        oit.a();
        voiceSessionConfig.g = Instant.now().toEpochMilli();
        yph yphVar = GhMicrophoneContentProvider.a;
        voiceSessionConfig.d = acmg.c() ? new Uri.Builder().scheme("content").authority("com.google.android.apps.gsa.testing.ui.audio.recorded").path("emulated_mic_audio").build() : new Uri.Builder().scheme("content").authority("com.google.android.projection.gearhead.provider").path("/mic").build();
        voiceSessionConfig.e = sk.AUDIO_CONTENT_SAMPLING_RATE;
        voiceSessionConfig.i = true;
        voiceSessionConfig.n = mpl.f().a().m();
        voiceSessionConfig.j = true;
        try {
            voiceSessionConfig.k = this.d.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 0).versionName;
            voiceSessionConfig.o = mpl.f().a().e();
            return voiceSessionConfig;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("Unable to find Gearhead package name while in Gearhead.", e);
        }
    }

    public final void S(Throwable th, ywj ywjVar) {
        laj.c(new jda((Object) this, (Object) th, (Object) ywjVar, 11, (byte[]) null));
    }

    public final void T(Throwable th, ywj ywjVar) {
        V(th, ywjVar);
        U();
    }

    public final void U() {
        char c;
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 3599)).u("handleVoiceSessionEnd");
        xya xyaVar = this.F;
        if (xyaVar != null) {
            if (xyaVar.a) {
                xyaVar.f();
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.ASSISTANT, yzy.pa);
                rrbVarH.u(this.F.a(TimeUnit.MILLISECONDS));
                ohsVarJ.F(rrbVarH.l());
            }
            this.F = null;
        }
        lah.a().h(203, null);
        if (!this.m) {
            ((ype) yphVar.l().ai((char) 3604)).u("onVoiceSessionEnd. There is no active voice session to end.");
            if (acxa.al()) {
                ao();
                return;
            }
            return;
        }
        try {
            try {
                kyk kykVar = this.b;
                ((ype) ((ype) kyk.a.f()).ai((char) 3551)).u("onVoiceSessionEnd");
                if (kykVar.d != 5) {
                    kykVar.a();
                }
                kykVar.d = 0;
                ao();
                c = 3600;
                if (lal.a().b()) {
                    List list = this.y;
                    if (list.isEmpty() || !this.J) {
                        ((ype) ((ype) yphVar.f()).ai(3601)).N("Not sending focus lost to transcription callbacks %s, %b", list, this.J);
                    } else {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((qjm) it.next()).c();
                        }
                    }
                }
            } catch (kxc e) {
                V(e, e.a);
                c = 3602;
            }
            this.m = false;
            int i = this.n;
            this.n = 0;
            this.o.b(2);
            lah.a().i(204);
            ak();
            boolean zJ = J();
            ((ype) a.l().ai(c)).y("isGeminiEnabledAndEligible: %b", Boolean.valueOf(zJ));
            if (i == 10) {
                nfy.a().c(zJ ? ngb.o : new nft());
            } else {
                ap(zJ ? 1 : 0, 1);
            }
            if (acpl.g()) {
                Context context = this.d;
                if (zJ) {
                    lbt.h.e(context);
                } else {
                    lbt.g.e(context);
                }
            }
        } catch (Throwable th) {
            this.m = false;
            int i2 = this.n;
            this.n = 0;
            this.o.b(2);
            lah.a().i(204);
            ak();
            boolean zJ2 = J();
            ((ype) a.l().ai((char) 3603)).y("isGeminiEnabledAndEligible: %b", Boolean.valueOf(zJ2));
            if (i2 == 10) {
                nfy.a().c(zJ2 ? ngb.o : new nft());
            } else {
                ap(zJ2 ? 1 : 0, 1);
            }
            if (acpl.g()) {
                Context context2 = this.d;
                if (zJ2) {
                    lbt.h.e(context2);
                } else {
                    lbt.g.e(context2);
                }
            }
            throw th;
        }
    }

    public final void V(Throwable th, ywj ywjVar) {
        ((ype) ((ype) ((ype) a.g()).p(th)).ai((char) 3613)).y("handleInternalError: %s", new zjd(zjc.a, ywjVar.name()));
        obs.a().c(this.d, mkn.C, R.string.voice_assistant_error, 0);
        lah.a().d(ywjVar);
    }

    public final void W(rzj rzjVar) {
        boolean zAg = ag();
        boolean zAf = af();
        rzj rzjVarB = rzjVar.a("started", Boolean.valueOf(this.q)).a("assistantState", Integer.valueOf(this.G)).a("apiVersion", Integer.valueOf(this.j)).a("assistantDisconnectCount", Integer.valueOf(this.l)).b("statusAtTimeOfLastAssistantDisconnect", new kot(this, rzjVar, 16));
        int i = this.N;
        String strAL = wub.aL(i);
        if (i == 0) {
            throw null;
        }
        rzjVarB.a("activeFacet", strAL).a("primaryRegionAppPackageName", this.I).b("gearheadFlags", new kot(this, rzjVar, 17)).b("assistantFeatureFlags", new kot(this, rzjVar, 18)).a("coolwalkSuggestionsEnabled", Boolean.valueOf(zAg)).a("coolwalkMediaRecommendationsEnabled", Boolean.valueOf(zAf));
        if (zAg || zAf) {
            rzjVar.b("suggestionsManager", new kyl(rzjVar, 3));
        }
    }

    public final void X() {
        abnp abnpVarN = osb.a.n();
        osf osfVar = osf.a;
        abnpVarN.t();
        osb osbVar = (osb) abnpVarN.b;
        osfVar.getClass();
        osbVar.f = osfVar;
        osbVar.b |= 16;
        x((osb) abnpVarN.q());
        this.A = 3;
    }

    public final void Y(String str, Bundle bundle) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 3625)).y("startDirectQuery called with query: %s", str);
        if (TextUtils.isEmpty(str)) {
            ((ype) ((ype) yphVar.g()).ai((char) 3626)).u("Direct Action query did not have a valid query string");
            lah.a();
            lah.e(ywj.START_VOICE_SESSION_DIRECT_ACTION_INVALID_QUERY, null);
        } else {
            VoiceSessionConfig voiceSessionConfigR = R(4, 1);
            voiceSessionConfigR.h = bundle;
            voiceSessionConfigR.c = str;
            laj.b(new kot(this, voiceSessionConfigR, 8));
        }
    }

    public final void Z(MessagingInfo messagingInfo, int i) {
        if (i == 8) {
            ((ype) ((ype) a.f()).ai((char) 3631)).y("autoplayMessage(%s)", messagingInfo);
        } else if (i == 2) {
            ((ype) ((ype) a.f()).ai((char) 3630)).y("readMessage(%s)", messagingInfo);
        } else {
            if (i != 3) {
                ((ype) ((ype) a.h()).ai((char) 3627)).u("incorrect voice session type for read or reply message");
                return;
            }
            ((ype) ((ype) a.f()).ai((char) 3629)).y("directReplyMessage(%s)", messagingInfo);
        }
        int i2 = this.N;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        ClientStateSnapshot clientStateSnapshotA = laj.a(i3, this.I);
        clientStateSnapshotA.b = new ArrayList(1);
        clientStateSnapshotA.b.add(messagingInfo);
        an(R(i, i == 8 ? 7 : 1), clientStateSnapshotA);
    }

    @Override // defpackage.kwv
    public final eqj a() {
        if (acpc.q()) {
            return this.e.g;
        }
        afco afcoVar = tby.a;
        return new eqm(false);
    }

    public final void aa() {
        lbh.d().gL(new kyu(this), true);
    }

    public final void ab(VoiceSessionConfig voiceSessionConfig) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai(3635)).D("startVoiceSearchMainThread trigger=%d payload=%s", voiceSessionConfig.f, voiceSessionConfig.h);
        if (!this.q) {
            ((ype) ((ype) yphVar.f()).ai((char) 3636)).u("Can't start voice session when the controller is not started");
            lah.a();
            lah.e(ywj.START_VOICE_SESSION_ERROR_CONTROLLER_NOT_STARTED, null);
            return;
        }
        int i = this.N;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        ClientStateSnapshot clientStateSnapshotA = laj.a(i2, this.I);
        int i3 = yfq.d;
        yfl yflVar = new yfl(4);
        int iB = ltv.a().b();
        int iB2 = ltv.a().b();
        int iB3 = ltv.a().b();
        mnq mnqVarE = mlq.e();
        yzr yzrVar = yzr.IM_NOTIFICATION;
        for (moa moaVar : mnqVarE.b(yzrVar, yzr.SMS_NOTIFICATION)) {
            yzy yzyVar = moaVar.J() == yzrVar ? yzy.mt : yzy.ms;
            yzy yzyVar2 = moaVar.J() == yzrVar ? yzy.mp : yzy.mo;
            yzy yzyVar3 = moaVar.J() == yzrVar ? yzy.mu : yzy.mv;
            lue lueVar = (lue) moaVar;
            ltz ltzVar = lueVar.j.equals(yzrVar) ? ltz.a : ltz.b;
            String str = lueVar.l;
            if (str == null) {
                str = "com.google.android.projection.gearhead";
            }
            yflVar.i(lnm.k().k(lueVar, new whg(ltzVar, lua.ASSISTANT_VOICE_INVOCATION, lub.ASSISTANT_VOICE_INVOCATION, new ComponentName(str, ""), false), yzyVar, yzyVar2, yzyVar3, Integer.valueOf(iB2), Integer.valueOf(iB), Integer.valueOf(iB3)));
        }
        clientStateSnapshotA.b = yflVar.g();
        an(voiceSessionConfig, clientStateSnapshotA);
    }

    public final void ac(ywk ywkVar) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 3638)).y("stopVoiceSearch with cancel trigger %s", ywkVar);
        if (!this.m) {
            ((ype) yphVar.l().ai((char) 3639)).u("There is active no voice session to stop.");
            if (acxa.al()) {
                ao();
                return;
            }
            return;
        }
        syy syyVar = this.f;
        synchronized (syyVar) {
            try {
                syyVar.m(ywkVar, new mac(1));
            } finally {
                U();
            }
        }
    }

    public final void ad(int i) {
        if (this.G == i) {
            return;
        }
        this.G = i;
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((kww) it.next()).a(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ae(defpackage.osx r10) {
        /*
            r9 = this;
            eqm r0 = r9.w
            java.lang.Object r1 = r0.e()
            osx r1 = (defpackage.osx) r1
            yph r2 = defpackage.kyw.a
            yop r2 = r2.l()
            r3 = 3640(0xe38, float:5.101E-42)
            yop r2 = r2.ai(r3)
            ype r2 = (defpackage.ype) r2
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.String r4 = r1.name()
            goto L1f
        L1e:
            r4 = r3
        L1f:
            if (r10 == 0) goto L25
            java.lang.String r3 = r10.name()
        L25:
            java.lang.String r5 = "Prev gemini state is %s, New gemini state is %s"
            r2.M(r5, r4, r3)
            osx r2 = defpackage.osx.LIVE_INACTIVE
            r3 = 1
            r4 = 0
            if (r10 != r2) goto L36
            osx r5 = defpackage.osx.LIVE_ACTIVE
            if (r1 != r5) goto L36
            r5 = r3
            goto L37
        L36:
            r5 = r4
        L37:
            osx r6 = defpackage.osx.LIVE_HOLD
            if (r10 != r6) goto L41
            osx r7 = defpackage.osx.LIVE_ACTIVE
            if (r1 != r7) goto L41
            r7 = r3
            goto L42
        L41:
            r7 = r4
        L42:
            osx r8 = defpackage.osx.LIVE_ACTIVE
            if (r10 != r8) goto L4a
            if (r1 == r10) goto L4a
            r8 = r3
            goto L4b
        L4a:
            r8 = r4
        L4b:
            if (r10 != r2) goto L51
            if (r1 != r6) goto L51
            r1 = r3
            goto L52
        L51:
            r1 = r4
        L52:
            if (r8 == 0) goto L71
            r9.m = r3
            r9.ak()
            boolean r2 = r9.x
            if (r2 == 0) goto L6a
            ily r2 = new ily
            r3 = 7
            r2.<init>(r3)
            long r6 = defpackage.acmd.k()
            defpackage.wer.d(r2, r6)
        L6a:
            r9.am()
            r9.al()
            goto L7a
        L71:
            if (r5 != 0) goto L75
            if (r7 == 0) goto L7c
        L75:
            r9.m = r4
            r9.ak()
        L7a:
            if (r5 != 0) goto L7e
        L7c:
            if (r1 == 0) goto L82
        L7e:
            r1 = 2
            r9.ap(r4, r1)
        L82:
            r0.m(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyw.ae(osx):void");
    }

    @Deprecated
    public final boolean af() {
        return acpc.q() && ((orl) this.h.get()).c;
    }

    public final boolean ag() {
        return acpc.p() && ((orl) this.h.get()).c;
    }

    public final boolean ah(final Intent intent) {
        ((ype) a.l().ai((char) 3616)).u("processIntentResult");
        FutureTask futureTask = new FutureTask(new Callable() { // from class: kyn
            /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 768
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kyn.call():java.lang.Object");
            }
        });
        laj.c(futureTask);
        try {
            return ((Boolean) futureTask.get()).booleanValue();
        } catch (InterruptedException e) {
            this.S(e, ywj.PROCESS_INTENT_RESULT_INTERRUPTED);
            return true;
        } catch (CancellationException e2) {
            this.S(e2, ywj.PROCESS_INTENT_RESULT_CANCELLED);
            return true;
        } catch (ExecutionException e3) {
            this.S(e3, ywj.PROCESS_INTENT_RESULT_EXECUTION_EXCEPTION);
            return true;
        } catch (Exception e4) {
            this.S(e4, ywj.PROCESS_INTENT_RESULT_GENERIC_EXCEPTION);
            return true;
        }
    }

    @Override // defpackage.kwv
    public final eqj b() {
        if (acpc.u()) {
            aa();
        }
        if (acpc.w()) {
            int i = this.A;
            if (i == 0) {
                throw null;
            }
            if (i != 3) {
                if (this.r) {
                    X();
                } else {
                    this.A = 2;
                }
            }
        }
        return eqy.c(a(), new kut(this, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010f  */
    @Override // defpackage.lhg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyw.c():void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.lhg
    public final void d() {
        ((ype) ((ype) a.f()).ai((char) 3637)).u("stop");
        kyx kyxVar = this.K;
        if (kyxVar != null) {
            mad.e().b().k(kyxVar.c);
            this.K = null;
        }
        this.q = false;
        mnc.a().d(mnb.c);
        this.f.a();
        if (this.r) {
            this.r = false;
            this.A = 1;
            kzt.a().c();
        }
        this.h.set(ai(this.C));
        this.u.m(false);
        this.w.m(osx.LIVE_INACTIVE);
        this.m = false;
        this.e.d();
        kyk kykVar = this.b;
        mnc.a().d(mnb.d);
        kykVar.g.getClass();
        if (kykVar.c) {
            roe roeVar = kykVar.g;
            try {
                roeVar.a.d(roeVar.d);
            } catch (RemoteException | IllegalStateException unused) {
            }
        }
        kykVar.b.f.r();
        kykVar.g.a();
        kykVar.g = null;
        kykVar.c = false;
        kykVar.e = null;
        this.B = null;
        lah lahVarA = lah.a();
        wer.f(lahVarA.c);
        synchronized (lahVarA.a) {
            ((lai) lahVarA.b).b();
            lahVarA.b = new lai(-1, 1, 1, null, 0L);
        }
    }

    @Override // defpackage.kwv
    public final eqj e() {
        return this.e.e;
    }

    @Override // defpackage.kwv
    public final eqj f() {
        if (acpo.c()) {
            wub.ah(this.D.D(), new ikn(this, 5), aj());
        } else {
            wub.ah(this.M.c(), new ikn(this, 6), aj());
        }
        return this.t;
    }

    @Override // defpackage.kwv
    public final eqj g() {
        return this.u;
    }

    @Override // defpackage.kwv
    public final eqj h() {
        return eqy.b(this.w, new kmn(6));
    }

    @Override // defpackage.kwv
    public final eqj i() {
        return this.v;
    }

    @Override // defpackage.kwv
    public final eqj j() {
        return eqy.b(this.w, new krq(13));
    }

    @Override // defpackage.kwv
    public final kwy k() {
        return this.e;
    }

    @Override // defpackage.kwv
    public final void l(qjm qjmVar) {
        wer.c();
        List list = this.y;
        if (list.contains(qjmVar)) {
            return;
        }
        list.add(qjmVar);
    }

    @Override // defpackage.kwv
    public final void m(MessagingInfo messagingInfo) {
        laj.b(new kot(this, messagingInfo, 7));
    }

    @Override // defpackage.kwv
    public final void n(ywk ywkVar) {
        laj.b(new kot(this, ywkVar, 12));
    }

    @Override // defpackage.kwv
    public final void o(ory oryVar) {
        wer.c();
        ((ype) ((ype) a.f()).ai((char) 3586)).y("fulfillSuggestionAction isDirectAction=%s", Boolean.valueOf(oryVar.e));
        if (!oryVar.e) {
            VoiceSessionConfig voiceSessionConfigR = R(5, 6);
            voiceSessionConfigR.m = oryVar.c;
            ab(voiceSessionConfigR);
            return;
        }
        syy syyVar = this.f;
        abnp abnpVarN = szv.a.n();
        String str = oryVar.c;
        abnpVarN.t();
        szv szvVar = (szv) abnpVarN.b;
        str.getClass();
        szvVar.b |= 1;
        szvVar.c = str;
        oit.a();
        long epochMilli = Instant.now().toEpochMilli();
        abnpVarN.t();
        szv szvVar2 = (szv) abnpVarN.b;
        szvVar2.b |= 2;
        szvVar2.d = epochMilli;
        syyVar.b((szv) abnpVarN.q());
    }

    @Override // defpackage.kwv
    public final void p() {
        if (this.w.e() != osx.LIVE_ACTIVE) {
            ((ype) ((ype) a.f()).ai((char) 3608)).u("Can't interrupt non-active live session");
        } else {
            ((ype) ((ype) a.f()).ai((char) 3609)).u("Interrupting live");
            ac(ywk.INTERRUPTED);
        }
    }

    @Override // defpackage.kwv
    public final void q() {
        if (acpo.c()) {
            wub.ah(this.D.E(new lcv(1)), new ikn(this, 7), aj());
        } else {
            wub.ah(this.M.a(new ikj(6), aj()), new ikn(this, 8), aj());
        }
    }

    @Override // defpackage.kwv
    public final void r(kww kwwVar) {
        kwwVar.getClass();
        this.g.add(kwwVar);
        kwwVar.a(this.G);
    }

    @Override // defpackage.kwv
    public final void s(qjm qjmVar) {
        wer.c();
        this.y.remove(qjmVar);
    }

    @Override // defpackage.kwv
    public final void t(MessagingInfo messagingInfo) {
        laj.b(new kot(this, messagingInfo, 15));
    }

    @Override // defpackage.kwv
    public final void u() {
        wer.c();
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 3617)).u("saveFeedback");
        if (!nto.a().b()) {
            ((ype) yphVar.l().ai((char) 3618)).u("Saving app feedback without Assistant since data is not connected");
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.ASSISTANT, yzy.yG).l());
            kzd.k().a(this.d, "ASSISTANT");
            return;
        }
        obs.a().c(this.d, mkn.C, R.string.voice_assistant_save_feedback_toast_message, 0);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.ASSISTANT, yzy.yD).l());
        int i = yfq.d;
        B(R.string.voice_assistant_save_feedback_query, Optional.empty(), Optional.empty(), yls.a);
    }

    @Override // defpackage.kwv
    public final void v(osw oswVar) {
        if (this.j < 5 || !acxy.L()) {
            ((ype) a.l().ai((char) 3619)).u("sending GearheadEvent not supported");
            return;
        }
        this.f.f(oswVar);
        if (acmd.v()) {
            int i = oswVar.c;
            osv osvVarB = osv.b(i);
            if (osvVarB == null) {
                osvVarB = osv.EVENT_TYPE_UNSPECIFIED;
            }
            if (osvVarB != osv.GEMINI_THUMBS_DOWN_FEEDBACK_CLICKED) {
                osv osvVarB2 = osv.b(i);
                if (osvVarB2 == null) {
                    osvVarB2 = osv.EVENT_TYPE_UNSPECIFIED;
                }
                if (osvVarB2 != osv.ASSISTANT_THUMBS_DOWN_FEEDBACK_CLICKED) {
                    return;
                }
            }
            laj.b(new kyl(this, 2));
        }
    }

    @Override // defpackage.kwv
    public final void w(osa osaVar) {
        yph yphVar = a;
        rzk rzkVarN = rzk.n();
        ((ype) yphVar.l().ai((char) 3620)).y("sendSuggestionLoggingEvent(%s)", ((rzk) rzkVarN.f("AssistantSuggestionLoggingEvent", new kyv((rzj) rzkVarN, (abnv) osaVar, 9))).toString());
        this.f.g(osaVar);
    }

    @Override // defpackage.kwv
    public final void x(osb osbVar) {
        if (!ag() && !af()) {
            ((ype) ((ype) a.h()).ai((char) 3622)).u("sendSuggestionSignal is ignored because suggestion is not enabled");
        } else {
            ((rzk) kzd.d(rzk.n(), osbVar)).toString();
            this.f.h(osbVar);
        }
    }

    @Override // defpackage.kwv
    public final void y() {
        ae(osx.LIVE_INACTIVE);
    }

    @Override // defpackage.kwv
    public final void z(String str) {
        this.I = str;
    }
}
