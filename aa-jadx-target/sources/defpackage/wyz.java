package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class wyz {
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ wyz(java.lang.Object obj) {
        this.a = obj;
    }

    public static final void t(otz otzVar) {
        if ((otzVar.b & 1) != 0) {
            defpackage.mpr.f().a().a("key_settings_autoplay_messages", otzVar.c);
            ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.f()).ai((char) 3572)).y("Gearhead autoplay messages setting set to %s", java.lang.Boolean.valueOf(otzVar.c));
        }
        if ((otzVar.b & 2) != 0) {
            defpackage.mpr.f().a().a("key_settings_show_message_summarization", otzVar.d);
            ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.f()).ai((char) 3571)).y("Gearhead message summary setting set to %s", java.lang.Boolean.valueOf(otzVar.d));
        }
        if ((otzVar.b & 4) != 0) {
            defpackage.mpr.f().a().b("key_settings_gemini_share_precise_location", otzVar.e);
            ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.f()).ai((char) 3570)).y("Gearhead precise location setting set to %s", java.lang.Boolean.valueOf(otzVar.e));
        }
        if ((otzVar.b & 8) != 0) {
            defpackage.mpr.f().a().b("key_settings_gemini_barge_in_setting_disabled", otzVar.f);
            ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.f()).ai((char) 3569)).y("Gearhead Gemini barge-in setting disabled set to %s", java.lang.Boolean.valueOf(otzVar.f));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final boolean a(java.lang.String str, java.lang.String str2) {
        return ((defpackage.sjr) ((defpackage.wdm) this.a).b.get(str)) != null && str2.equals("");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, snr] */
    public final void b(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.a.i(connectionResult);
    }

    public final void c(defpackage.zak zakVar) {
        java.lang.Object obj = this.a;
        ((defpackage.rtt) obj).r.p(defpackage.zaj.PROTOCOL_IO_ERROR, zakVar, "io error");
    }

    public final void d() {
        ((defpackage.qtn) this.a).d.post(new defpackage.qth(this, 2));
    }

    public final void e() {
        defpackage.yqk yqkVar = defpackage.qtn.a;
        ((defpackage.qtn) this.a).d.post(new defpackage.qth(this, 5));
    }

    public final void f(boolean z) {
        defpackage.qtn.a.f().ai(7898).y("Startup complete:%b", java.lang.Boolean.valueOf(z));
        java.lang.Object obj = this.a;
        if (!z) {
            ((defpackage.qtn) obj).d.post(new defpackage.qth(this, 4));
            return;
        }
        defpackage.qtn qtnVar = (defpackage.qtn) obj;
        defpackage.qtm qtmVar = qtnVar.e;
        qtmVar.getClass();
        qtnVar.d.post(new defpackage.qtk(qtmVar, 0));
    }

    public final int g() {
        defpackage.qtj qtjVar = (defpackage.qtj) this.a;
        qtjVar.m();
        return qtjVar.h;
    }

    public final int h() {
        return ((defpackage.qtj) this.a).h;
    }

    public final void i() {
        ((defpackage.rwy) ((defpackage.qtj) this.a).b).f(defpackage.rwy.a);
    }

    public final boolean j() {
        return ((defpackage.qtj) this.a).b.a().equals(defpackage.rwt.c);
    }

    public final void k() {
        defpackage.qsa.a.l().ai(7719).u("onPaired");
        defpackage.qsa qsaVar = (defpackage.qsa) this.a;
        qsaVar.e.c(defpackage.rhj.EVENT_PAIRED);
        qsaVar.m(new qrv(4));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void l(java.util.UUID uuid, com.google.android.gms.car.display.CarDisplayId carDisplayId) throws wfo {
        defpackage.wfp.c();
        defpackage.ntb ntbVar = (defpackage.ntb) this.a;
        com.google.android.gms.car.display.CarDisplayId carDisplayId2 = ntbVar.o;
        if (carDisplayId.equals(carDisplayId2)) {
            if (!uuid.equals(ntbVar.p)) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.ntb.a.h()).ai(5405)).R("Display %s received layout update complete for configuration %s, current: %s", carDisplayId2, uuid, ntbVar.p);
                return;
            }
            defpackage.nsv nsvVar = ntbVar.v;
            defpackage.nsv nsvVar2 = defpackage.nsv.c;
            if (nsvVar != nsvVar2) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.ntb.a.g()).ai(5404)).R("Display %s received layout update complete when in invalid state, expected:%s, actual:%s", carDisplayId2, nsvVar2, ntbVar.v);
                throw new java.lang.IllegalStateException("Layout update complete when not updating for display: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(carDisplayId2))));
            }
            defpackage.yqm yqmVar = defpackage.ntb.a;
            defpackage.nsv nsvVar3 = defpackage.nsv.b;
            ((defpackage.yqj) yqmVar.l().ai((char) 5403)).M("Display %s received update complete, setting state to %s", carDisplayId2, nsvVar3);
            ntbVar.C(nsvVar3);
        }
    }

    public final void m(defpackage.mhm mhmVar) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.mfx.a.f()).ai((char) 4860)).w("onRequirementComplete for id=%d", mhmVar.a());
        defpackage.mho mhoVar = ((defpackage.mfw) this.a).h;
        mhoVar.getClass();
        mhoVar.a();
    }

    public final boolean n() {
        defpackage.acnf acnfVar = defpackage.acnf.a;
        if (acnfVar.fF().s()) {
            try {
                if (hh$.ExternalSyntheticApiModelOutline0.m(((defpackage.kzb) this.a).d.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0)) >= acnfVar.fF().h()) {
                    return true;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public final otp o() {
        com.google.android.gms.car.CarInfo carInfoD;
        defpackage.kzb kzbVar = (defpackage.kzb) this.a;
        if (kzbVar.j < 4) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.h()).ai((char) 3568)).u("Minimum API version of 4 required to call getSessionData().");
            throw new java.lang.UnsupportedOperationException();
        }
        defpackage.abor aborVarN = otp.a.n();
        defpackage.kyq kyqVar = kzbVar.b;
        try {
            defpackage.mkp.a.f();
            carInfoD = defpackage.ooa.d(defpackage.kit.b().e());
        } catch (defpackage.qst unused) {
            ((defpackage.yqj) defpackage.kyq.a.l().ai((char) 3553)).u("Could not get car info: car is not connected");
            carInfoD = null;
        }
        if (carInfoD != null) {
            int i = carInfoD.e;
            aborVarN.t();
            otp otpVar = aborVarN.b;
            otpVar.b |= 1;
            otpVar.c = i;
            int i2 = carInfoD.f;
            aborVarN.t();
            otp otpVar2 = aborVarN.b;
            otpVar2.b |= 2;
            otpVar2.d = i2;
            java.lang.String str = carInfoD.k;
            aborVarN.t();
            otp otpVar3 = aborVarN.b;
            str.getClass();
            otpVar3.b = 4 | otpVar3.b;
            otpVar3.e = str;
            java.lang.String str2 = carInfoD.l;
            aborVarN.t();
            otp otpVar4 = aborVarN.b;
            str2.getClass();
            otpVar4.b |= 8;
            otpVar4.f = str2;
        }
        defpackage.oun ounVarA = kyqVar.b.a();
        if (ounVarA != null) {
            aborVarN.t();
            otp otpVar5 = aborVarN.b;
            otpVar5.k = ounVarA;
            otpVar5.b |= 128;
        }
        defpackage.lam lamVarA = defpackage.lam.a();
        synchronized (lamVarA.a) {
            java.lang.Object obj = lamVarA.b;
            for (defpackage.yxm yxmVar : ((defpackage.lan) obj).b) {
                defpackage.abor aborVarN2 = oto.a.n();
                int iT = defpackage.ytn.t(yxmVar.d);
                aborVarN2.t();
                oto otoVar = aborVarN2.b;
                int i3 = iT - 1;
                if (iT == 0) {
                    throw null;
                }
                otoVar.c = i3;
                otoVar.b |= 1;
                long j = yxmVar.c;
                aborVarN2.t();
                oto otoVar2 = aborVarN2.b;
                otoVar2.b |= 2;
                otoVar2.d = j;
                oto otoVarQ = aborVarN2.q();
                aborVarN.t();
                otp otpVar6 = aborVarN.b;
                otoVarQ.getClass();
                defpackage.abpj abpjVar = otpVar6.g;
                if (!abpjVar.c()) {
                    otpVar6.g = defpackage.abox.I(abpjVar);
                }
                otpVar6.g.add(otoVarQ);
            }
            long j2 = ((defpackage.lan) obj).a;
            aborVarN.t();
            otp otpVar7 = aborVarN.b;
            otpVar7.b |= 16;
            otpVar7.h = j2;
            long jA = j2 + ((defpackage.lan) obj).a();
            aborVarN.t();
            otp otpVar8 = aborVarN.b;
            otpVar8.b |= 32;
            otpVar8.i = jA;
            int i4 = ((defpackage.lan) obj).f;
            aborVarN.t();
            otp otpVar9 = aborVarN.b;
            otpVar9.j = i4 - 1;
            otpVar9.b |= 64;
            int i5 = ((defpackage.lan) obj).e;
            aborVarN.t();
            otp otpVar10 = aborVarN.b;
            otpVar10.l = i5 - 1;
            otpVar10.b |= 256;
            boolean zI = defpackage.omv.a().i(defpackage.mkp.a.c);
            aborVarN.t();
            otp otpVar11 = aborVarN.b;
            otpVar11.b |= 512;
            otpVar11.m = zI;
        }
        return aborVarN.q();
    }

    public final void p(com.google.android.gearhead.sdk.assistant.CarAssistantEvent carAssistantEvent) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.f()).ai(3573)).w("onEvent type=%s", carAssistantEvent.a);
        int i = carAssistantEvent.a;
        if (i == 1) {
            ((defpackage.kzb) this.a).G(4, carAssistantEvent.d);
            return;
        }
        int i2 = 3;
        if (i == 3) {
            defpackage.lam.a().c(carAssistantEvent.c);
            return;
        }
        if (i == 4) {
            defpackage.lam.a().h(16, java.lang.Integer.valueOf(carAssistantEvent.c));
            return;
        }
        if (i == 5) {
            com.google.android.gearhead.sdk.assistant.VoiceSessionConfig voiceSessionConfigR = ((defpackage.kzb) this.a).R(9, 4);
            voiceSessionConfigR.h = carAssistantEvent.d;
            defpackage.lao.b(new defpackage.kza(this, voiceSessionConfigR, 0));
        } else if (i == 6) {
            defpackage.lao.b(new defpackage.kza(this, carAssistantEvent, 2));
        } else if (i == 7) {
            defpackage.lao.b(new defpackage.kza(this, carAssistantEvent, i2));
        }
    }

    public final void q() {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.f()).ai((char) 3574)).u("onVoiceSessionEnd");
        defpackage.lam lamVarA = defpackage.lam.a();
        synchronized (lamVarA.a) {
            defpackage.lam.e(defpackage.yxo.VOICE_SESSION_ENDED, java.lang.Long.valueOf(((defpackage.lan) lamVarA.b).a()));
            ((defpackage.lan) lamVarA.b).c(12, null);
        }
        defpackage.lao.c(new defpackage.kmp(this.a, 13));
    }

    public final void r(tbf tbfVar) {
        defpackage.kzb kzbVar = (defpackage.kzb) this.a;
        if (!kzbVar.af()) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.h()).ai((char) 3578)).u("Ignoring updateMediaRecommendations(): suggestions are not enabled");
            return;
        }
        defpackage.yqm yqmVar = defpackage.kzb.a;
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(tbfVar.b).map(new defpackage.khy(11));
        int i = defpackage.ygw.d;
        ((defpackage.yqj) yqmVar.l().ai((char) 3579)).y("updateMediaRecommendations(%s)", map.collect(defpackage.yds.a));
        kzbVar.s.j(tbfVar);
    }

    public final boolean s(com.google.android.gearhead.sdk.assistant.VoiceSessionResult voiceSessionResult) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.f()).ai(3575)).w("onVoiceSessionResult type=%d", voiceSessionResult.a);
        defpackage.lam lamVarA = defpackage.lam.a();
        synchronized (lamVarA.a) {
            ((defpackage.lan) lamVarA.b).d = voiceSessionResult;
            if (voiceSessionResult.a == 1) {
                android.content.Intent intent = voiceSessionResult.b.b;
                defpackage.omf.u().t(defpackage.yxo.VOICE_SESSION_INTENT_RESULT, 1, 1, null, defpackage.jzb.t(intent), intent.getPackage(), intent.getAction(), defpackage.yxp.UNKNOWN_CANCEL_TRIGGER);
                ((defpackage.lan) lamVarA.b).c(14, null);
            } else {
                defpackage.lam.e(defpackage.yxo.VOICE_SESSION_ERROR, null);
                ((defpackage.lan) lamVarA.b).c(15, null);
            }
        }
        int i = voiceSessionResult.a;
        if (i != 1) {
            if (i == 2) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.g()).ai((char) 3576)).u("Assistant reported an error");
            }
            return true;
        }
        return ((defpackage.kzb) this.a).ah(voiceSessionResult.b.b);
    }

    public wyz() {
    }

    public wyz(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wyz(defpackage.mpj mpjVar) {
        this();
        this.a = mpjVar;
    }
}
