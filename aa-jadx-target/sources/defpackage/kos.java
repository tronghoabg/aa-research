package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kos implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kos(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kxm */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kxr */
    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rlu] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kxd] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, kqb] */
    @Override // java.lang.Runnable
    public final void run() throws kxm, wfo, kxr {
        byte[] bArr = null;
        int i = 1;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                this.b.a((kot) this.a);
                return;
            case 1:
                java.lang.Object obj = this.b;
                defpackage.yqm yqmVar = koc.a;
                rsd rsdVar = (rsd) obj;
                int iAo = defpackage.a.ao(rsdVar.g);
                if (iAo == 0) {
                    iAo = 1;
                }
                java.lang.Object objH = (rsdVar.b & 128) != 0 ? defpackage.xyn.h(rsdVar.l) : defpackage.xxe.a;
                java.lang.Object obj2 = this.a;
                defpackage.koa koaVar = (defpackage.koa) obj2;
                android.content.Context context = koaVar.b;
                if (context == null || koaVar.e == null) {
                    return;
                }
                int i2 = iAo - 1;
                if (i2 == 0 || i2 == 1) {
                    defpackage.zhs zhsVar = koaVar.f;
                    zhsVar.getClass();
                    defpackage.ysr.cy(zhsVar, new ozh(obj2, objH, 1), hh$.ExternalSyntheticApiModelOutline0.m(context));
                    return;
                } else {
                    java.util.concurrent.ScheduledExecutorService scheduledExecutorService = koaVar.c;
                    yyt yytVar = yyt.p;
                    defpackage.yqk yqkVar = rxy.a;
                    scheduledExecutorService.execute(new defpackage.ron(context, yytVar, 12, bArr));
                    return;
                }
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                juw.d((android.content.Context) this.a, true, (java.util.concurrent.atomic.AtomicReference) this.b);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                juw.d((android.content.Context) this.a, false, (java.util.concurrent.atomic.AtomicReference) this.b);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ?? r0 = this.b;
                if (android.text.TextUtils.isEmpty(r0)) {
                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl.a.h()).ai((char) 3305)).u("Empty bluetooth address.");
                    return;
                }
                if (defpackage.mpr.f().b().c((java.lang.String) r0, defpackage.sds.a)) {
                    if (!defpackage.acpv.s()) {
                        com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl connectivityEventHandlerImpl = (com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl) this.a;
                        if (!connectivityEventHandlerImpl.b.contains(r0)) {
                            if (connectivityEventHandlerImpl.c.contains(r0)) {
                                defpackage.kfn.g().d(defpackage.yyn.ANDROID_AUTO_BLUETOOTH_HEADSET_CONNECTED);
                                return;
                            }
                            return;
                        }
                    }
                    defpackage.kfn.g().a(false, false);
                    return;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                j$.util.Optional optional = (j$.util.Optional) this.b;
                boolean zIsEmpty = optional.isEmpty();
                java.lang.Object obj3 = this.a;
                if (zIsEmpty) {
                    ((defpackage.eqp) obj3).p();
                    return;
                }
                android.content.Context context2 = ((defpackage.kpv) obj3).a;
                defpackage.ygw ygwVar = (defpackage.ygw) optional.get();
                defpackage.wfp.b();
                ((defpackage.eqp) obj3).q((defpackage.ygw) j$.util.Collection.-EL.stream(ygwVar).map(new defpackage.jxj(context2, defpackage.mpr.f().b(), 6)).collect(defpackage.yds.a));
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.jlv jlvVar = new defpackage.jlv((android.content.Context) ((defpackage.kqe) this.b).a);
                try {
                    this.a.a(jlvVar);
                    jlvVar.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        jlvVar.close();
                        break;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new kxm((java.lang.String) this.b, (java.lang.Exception) this.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                throw new kxr((java.lang.String) this.b, (java.lang.Exception) this.a);
            case 9:
                ((defpackage.kzb) this.a).Z((com.google.android.gearhead.sdk.assistant.MessagingInfo) this.b, 8);
                return;
            case 10:
                ((defpackage.kzb) this.a).ab((com.google.android.gearhead.sdk.assistant.VoiceSessionConfig) this.b);
                return;
            case 11:
                ?? r1 = this.a;
                java.lang.Object obj4 = this.b;
                try {
                    r1.e(((defpackage.kzb) obj4).n);
                    return;
                } catch (defpackage.kxj e) {
                    ((defpackage.kzb) obj4).T(e, e.a);
                    return;
                }
            case 12:
                ((defpackage.kzb) this.a).Z((com.google.android.gearhead.sdk.assistant.MessagingInfo) this.b, 2);
                return;
            case 13:
                ((defpackage.kzb) this.a).ab((com.google.android.gearhead.sdk.assistant.VoiceSessionConfig) this.b);
                return;
            case 14:
                ((defpackage.kzb) this.a).ac((defpackage.yxp) this.b);
                return;
            case 15:
                defpackage.yqm yqmVar2 = defpackage.kzb.a;
                defpackage.saf safVar = (defpackage.saf) this.b;
                safVar.l();
                defpackage.osi osiVar = (defpackage.osi) this.a;
                safVar.a("coolwalkAssistantSuggestionsEnabled", java.lang.Boolean.valueOf(osiVar.c)).a("feedbackInitializationIntentEnabled", java.lang.Boolean.valueOf(osiVar.d)).a("dodgeboostEnabled", java.lang.Boolean.valueOf(osiVar.e)).a("coolwalk_direct_action_enabled", java.lang.Boolean.valueOf(osiVar.f)).a("coolwalk_streamed_media_recommendations_enabled", java.lang.Boolean.valueOf(osiVar.g)).a("media_recommendation_callbacks_service_enabled", java.lang.Boolean.valueOf(osiVar.h)).a("notification_proto_enabled", java.lang.Boolean.valueOf(osiVar.i)).a("send_message_to_contact_using_provider_client_input_enabled", java.lang.Boolean.valueOf(osiVar.j)).a("gearhead_smart_action_enabled", java.lang.Boolean.valueOf(osiVar.k)).a("kitt_enabled", java.lang.Boolean.valueOf(osiVar.l)).a("kitt_eligible", java.lang.Boolean.valueOf(osiVar.n)).a("car_control_enabled", java.lang.Boolean.valueOf(osiVar.o));
                return;
            case 16:
                defpackage.saf safVar2 = (defpackage.saf) this.b;
                safVar2.l();
                safVar2.m((java.lang.String) ((defpackage.kzb) this.a).i.get());
                return;
            case 17:
                ((defpackage.kzb) this.a).Z((com.google.android.gearhead.sdk.assistant.MessagingInfo) this.b, 3);
                return;
            case 18:
                java.lang.Object obj5 = this.b;
                ((defpackage.saf) obj5).e(new defpackage.kos(this.a, obj5, 16));
                return;
            case 19:
                defpackage.wyz wyzVar = ((defpackage.kzb) this.a).C;
                defpackage.saf safVar3 = (defpackage.saf) this.b;
                safVar3.f("GearheadFlags", new defpackage.kza(safVar3, (java.lang.Object) wyzVar, i));
                return;
            default:
                defpackage.osi osiVar2 = (defpackage.osi) ((defpackage.kzb) this.a).h.get();
                java.lang.Object obj6 = this.b;
                ((defpackage.saf) obj6).f("AssistantFeatureFlags", new defpackage.kos(obj6, osiVar2, 15, bArr));
                return;
        }
    }

    public /* synthetic */ kos(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
