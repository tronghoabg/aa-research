package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gearhead.sdk.assistant.CarAssistantEvent;
import com.google.android.gearhead.sdk.assistant.VoiceSessionConfig;
import com.google.android.gearhead.sdk.assistant.VoiceSessionResult;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.UUID;

/* loaded from: classes.dex */
public final /* synthetic */ class wyd {
    public final /* synthetic */ Object a;

    public /* synthetic */ wyd(Object obj) {
        this.a = obj;
    }

    public static final void u(otc otcVar) {
        if ((otcVar.b & 1) != 0) {
            mpl.f().a().a("key_settings_autoplay_messages", otcVar.c);
            ((ype) ((ype) kyw.a.f()).ai((char) 3569)).y("Gearhead autoplay messages setting set to %s", Boolean.valueOf(otcVar.c));
        }
        if ((otcVar.b & 2) != 0) {
            mpl.f().a().a("key_settings_show_message_summarization", otcVar.d);
            ((ype) ((ype) kyw.a.f()).ai((char) 3568)).y("Gearhead message summary setting set to %s", Boolean.valueOf(otcVar.d));
        }
        if ((otcVar.b & 4) != 0) {
            mpl.f().a().b("key_settings_gemini_share_precise_location", otcVar.e);
            ((ype) ((ype) kyw.a.f()).ai((char) 3567)).y("Gearhead precise location setting set to %s", Boolean.valueOf(otcVar.e));
        }
        if ((otcVar.b & 8) != 0) {
            mpl.f().a().b("key_settings_gemini_barge_in_setting_disabled", otcVar.f);
            ((ype) ((ype) kyw.a.f()).ai((char) 3566)).y("Gearhead Gemini barge-in setting disabled set to %s", Boolean.valueOf(otcVar.f));
        }
    }

    public final wtz a(wtz wtzVar) {
        return wtzVar instanceof wug ? wtzVar : new wtx(-((wue) this.a).w(), wtzVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final boolean b(String str, String str2) {
        return ((kgx) ((wcp) this.a).b.get(str)) != null && str2.equals("");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, smu] */
    public final void c(ConnectionResult connectionResult) {
        this.a.i(connectionResult);
    }

    public final void d(yzf yzfVar) {
        Object obj = this.a;
        ((rta) obj).r.p(yze.PROTOCOL_IO_ERROR, yzfVar, "io error");
    }

    public final void e() {
        ((qsr) this.a).d.post(new qjv(this, 18));
    }

    public final void f() {
        ypf ypfVar = qsr.a;
        ((qsr) this.a).d.post(new qjv(this, 20));
    }

    public final void g(boolean z) {
        qsr.a.f().ai(7873).y("Startup complete:%b", Boolean.valueOf(z));
        Object obj = this.a;
        if (!z) {
            ((qsr) obj).d.post(new qjv(this, 19));
            return;
        }
        qsr qsrVar = (qsr) obj;
        qsq qsqVar = qsrVar.e;
        qsqVar.getClass();
        qsrVar.d.post(new nwg(qsqVar, 8));
    }

    public final int h() {
        qso qsoVar = (qso) this.a;
        qsoVar.m();
        return qsoVar.h;
    }

    public final int i() {
        return ((qso) this.a).h;
    }

    public final void j() {
        ((rwf) ((qso) this.a).b).f(rwf.a);
    }

    public final boolean k() {
        return ((qso) this.a).b.a().equals(rwa.c);
    }

    public final void l() {
        qrg.a.l().ai(7694).u("onPaired");
        qrg qrgVar = (qrg) this.a;
        qrgVar.e.c(rgo.EVENT_PAIRED);
        qrgVar.m(new qra(4));
    }

    public final void m(UUID uuid, CarDisplayId carDisplayId) {
        wer.c();
        nso nsoVar = (nso) this.a;
        CarDisplayId carDisplayId2 = nsoVar.o;
        if (carDisplayId.equals(carDisplayId2)) {
            if (!uuid.equals(nsoVar.p)) {
                ((ype) ((ype) nso.a.h()).ai(5403)).R("Display %s received layout update complete for configuration %s, current: %s", carDisplayId2, uuid, nsoVar.p);
                return;
            }
            nsi nsiVar = nsoVar.v;
            nsi nsiVar2 = nsi.c;
            if (nsiVar != nsiVar2) {
                ((ype) ((ype) nso.a.g()).ai(5402)).R("Display %s received layout update complete when in invalid state, expected:%s, actual:%s", carDisplayId2, nsiVar2, nsoVar.v);
                throw new IllegalStateException("Layout update complete when not updating for display: ".concat(String.valueOf(String.valueOf(carDisplayId2))));
            }
            yph yphVar = nso.a;
            nsi nsiVar3 = nsi.b;
            ((ype) yphVar.l().ai((char) 5401)).M("Display %s received update complete, setting state to %s", carDisplayId2, nsiVar3);
            nsoVar.C(nsiVar3);
        }
    }

    public final void n(mhf mhfVar) {
        ((ype) ((ype) mfp.a.f()).ai((char) 4857)).w("onRequirementComplete for id=%d", mhfVar.a());
        mhh mhhVar = ((mfo) this.a).h;
        mhhVar.getClass();
        mhhVar.a();
    }

    public final boolean o() {
        acmd acmdVar = acmd.a;
        if (acmdVar.gu().s()) {
            try {
                if (((kyw) this.a).d.getPackageManager().getPackageInfo(RemoteApiConstants.NOW_PACKAGE, 0).getLongVersionCode() >= acmdVar.gu().h()) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public final oss p() {
        CarInfo carInfoD;
        kyw kywVar = (kyw) this.a;
        if (kywVar.j < 4) {
            ((ype) ((ype) kyw.a.h()).ai((char) 3565)).u("Minimum API version of 4 required to call getSessionData().");
            throw new UnsupportedOperationException();
        }
        abnp abnpVarN = oss.a.n();
        kyk kykVar = kywVar.b;
        try {
            mki.a.f();
            carInfoD = oni.d(kio.b().e());
        } catch (qrz unused) {
            ((ype) kyk.a.l().ai((char) 3550)).u("Could not get car info: car is not connected");
            carInfoD = null;
        }
        if (carInfoD != null) {
            int i = carInfoD.e;
            abnpVarN.t();
            oss ossVar = (oss) abnpVarN.b;
            ossVar.b |= 1;
            ossVar.c = i;
            int i2 = carInfoD.f;
            abnpVarN.t();
            oss ossVar2 = (oss) abnpVarN.b;
            ossVar2.b |= 2;
            ossVar2.d = i2;
            String str = carInfoD.k;
            abnpVarN.t();
            oss ossVar3 = (oss) abnpVarN.b;
            str.getClass();
            ossVar3.b = 4 | ossVar3.b;
            ossVar3.e = str;
            String str2 = carInfoD.l;
            abnpVarN.t();
            oss ossVar4 = (oss) abnpVarN.b;
            str2.getClass();
            ossVar4.b |= 8;
            ossVar4.f = str2;
        }
        otq otqVarA = kykVar.b.a();
        if (otqVarA != null) {
            abnpVarN.t();
            oss ossVar5 = (oss) abnpVarN.b;
            ossVar5.k = otqVarA;
            ossVar5.b |= 128;
        }
        lah lahVarA = lah.a();
        synchronized (lahVarA.a) {
            Object obj = lahVarA.b;
            for (ywh ywhVar : ((lai) obj).b) {
                abnp abnpVarN2 = osr.a.n();
                int iZ = zeb.z(ywhVar.d);
                abnpVarN2.t();
                osr osrVar = (osr) abnpVarN2.b;
                int i3 = iZ - 1;
                if (iZ == 0) {
                    throw null;
                }
                osrVar.c = i3;
                osrVar.b |= 1;
                long j = ywhVar.c;
                abnpVarN2.t();
                osr osrVar2 = (osr) abnpVarN2.b;
                osrVar2.b |= 2;
                osrVar2.d = j;
                osr osrVar3 = (osr) abnpVarN2.q();
                abnpVarN.t();
                oss ossVar6 = (oss) abnpVarN.b;
                osrVar3.getClass();
                aboh abohVar = ossVar6.g;
                if (!abohVar.c()) {
                    ossVar6.g = abnv.I(abohVar);
                }
                ossVar6.g.add(osrVar3);
            }
            long j2 = ((lai) obj).a;
            abnpVarN.t();
            oss ossVar7 = (oss) abnpVarN.b;
            ossVar7.b |= 16;
            ossVar7.h = j2;
            long jA = j2 + ((lai) obj).a();
            abnpVarN.t();
            oss ossVar8 = (oss) abnpVarN.b;
            ossVar8.b |= 32;
            ossVar8.i = jA;
            int i4 = ((lai) obj).f;
            abnpVarN.t();
            oss ossVar9 = (oss) abnpVarN.b;
            ossVar9.j = i4 - 1;
            ossVar9.b |= 64;
            int i5 = ((lai) obj).e;
            abnpVarN.t();
            oss ossVar10 = (oss) abnpVarN.b;
            ossVar10.l = i5 - 1;
            ossVar10.b |= 256;
            boolean zI = omc.a().i(mki.a.c);
            abnpVarN.t();
            oss ossVar11 = (oss) abnpVarN.b;
            ossVar11.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            ossVar11.m = zI;
        }
        return (oss) abnpVarN.q();
    }

    public final void q(CarAssistantEvent carAssistantEvent) {
        ((ype) ((ype) kyw.a.f()).ai(3570)).w("onEvent type=%s", carAssistantEvent.a);
        int i = carAssistantEvent.a;
        int i2 = 1;
        if (i == 1) {
            ((kyw) this.a).G(4, carAssistantEvent.d);
            return;
        }
        if (i == 3) {
            lah.a().c(carAssistantEvent.c);
            return;
        }
        if (i == 4) {
            lah.a().h(16, Integer.valueOf(carAssistantEvent.c));
            return;
        }
        if (i == 5) {
            VoiceSessionConfig voiceSessionConfigR = ((kyw) this.a).R(9, 4);
            voiceSessionConfigR.h = carAssistantEvent.d;
            laj.b(new kot(this, voiceSessionConfigR, 20));
        } else if (i == 6) {
            laj.b(new kyv(this, carAssistantEvent, i2));
        } else if (i == 7) {
            laj.b(new kyv(this, carAssistantEvent, 0));
        }
    }

    public final void r() {
        ((ype) ((ype) kyw.a.f()).ai((char) 3571)).u("onVoiceSessionEnd");
        lah lahVarA = lah.a();
        synchronized (lahVarA.a) {
            lah.e(ywj.VOICE_SESSION_ENDED, Long.valueOf(((lai) lahVarA.b).a()));
            ((lai) lahVarA.b).c(12, null);
        }
        laj.c(new kyl(this.a, 4));
    }

    public final void s(tah tahVar) {
        kyw kywVar = (kyw) this.a;
        if (!kywVar.af()) {
            ((ype) ((ype) kyw.a.h()).ai((char) 3575)).u("Ignoring updateMediaRecommendations(): suggestions are not enabled");
            return;
        }
        yph yphVar = kyw.a;
        Stream map = Collection.EL.stream(tahVar.b).map(new koj(10));
        int i = yfq.d;
        ((ype) yphVar.l().ai((char) 3576)).y("updateMediaRecommendations(%s)", map.collect(ycm.a));
        kywVar.s.j(tahVar);
    }

    public final boolean t(VoiceSessionResult voiceSessionResult) {
        ((ype) ((ype) kyw.a.f()).ai(3572)).w("onVoiceSessionResult type=%d", voiceSessionResult.a);
        lah lahVarA = lah.a();
        synchronized (lahVarA.a) {
            ((lai) lahVarA.b).d = voiceSessionResult;
            if (voiceSessionResult.a == 1) {
                Intent intent = voiceSessionResult.b.b;
                ebf.j().t(ywj.VOICE_SESSION_INTENT_RESULT, 1, 1, null, kzd.l(intent), intent.getPackage(), intent.getAction(), ywk.UNKNOWN_CANCEL_TRIGGER);
                ((lai) lahVarA.b).c(14, null);
            } else {
                lah.e(ywj.VOICE_SESSION_ERROR, null);
                ((lai) lahVarA.b).c(15, null);
            }
        }
        int i = voiceSessionResult.a;
        if (i != 1) {
            if (i == 2) {
                ((ype) ((ype) kyw.a.g()).ai((char) 3573)).u("Assistant reported an error");
            }
            return true;
        }
        return ((kyw) this.a).ah(voiceSessionResult.b.b);
    }

    public wyd() {
    }

    public wyd(Object obj, byte[] bArr) {
        this.a = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wyd(mpd mpdVar) {
        this();
        this.a = mpdVar;
    }
}
