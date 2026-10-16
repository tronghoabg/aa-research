package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.gearhead.sdk.assistant.VoiceSessionConfig;
import j$.util.Collection;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class kot implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kot(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kww] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kpv] */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                jxn.d((Context) this.a, false, (AtomicReference) this.b);
                return;
            case 1:
                jxn.d((Context) this.a, true, (AtomicReference) this.b);
                return;
            case 2:
                ?? r0 = this.b;
                if (TextUtils.isEmpty(r0)) {
                    ((ype) ((ype) ConnectivityEventHandlerImpl.a.h()).ai((char) 3302)).u("Empty bluetooth address.");
                    return;
                }
                if (mpl.f().b().c((String) r0, scw.a)) {
                    if (!acot.s()) {
                        ConnectivityEventHandlerImpl connectivityEventHandlerImpl = (ConnectivityEventHandlerImpl) this.a;
                        if (!connectivityEventHandlerImpl.b.contains(r0)) {
                            if (connectivityEventHandlerImpl.c.contains(r0)) {
                                kfl.g().d(yxi.ANDROID_AUTO_BLUETOOTH_HEADSET_CONNECTED);
                                return;
                            }
                            return;
                        }
                    }
                    kfl.g().a(false, false);
                    return;
                }
                return;
            case 3:
                Optional optional = (Optional) this.b;
                boolean zIsEmpty = optional.isEmpty();
                Object obj = this.a;
                if (zIsEmpty) {
                    ((eqj) obj).p();
                    return;
                }
                Context context = ((kpp) obj).a;
                yfq yfqVar = (yfq) optional.get();
                wer.b();
                eqj eqjVar = (eqj) obj;
                eqjVar.q((yfq) Collection.EL.stream(yfqVar).map(new jxf(context, mpl.f().b(), 6)).collect(ycm.a));
                return;
            case 4:
                jlo jloVar = new jlo((Context) ((ogz) this.b).a);
                try {
                    this.a.a(jloVar);
                    jloVar.close();
                    return;
                } catch (Throwable th) {
                    try {
                        jloVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 5:
                throw new kxf((String) this.b, (Exception) this.a);
            case 6:
                throw new kxk((String) this.b, (Exception) this.a);
            case 7:
                ((kyw) this.a).Z((MessagingInfo) this.b, 8);
                return;
            case 8:
                ((kyw) this.a).ab((VoiceSessionConfig) this.b);
                return;
            case 9:
                ?? r02 = this.a;
                Object obj2 = this.b;
                try {
                    r02.e(((kyw) obj2).n);
                    return;
                } catch (kxc e) {
                    ((kyw) obj2).T(e, e.a);
                    return;
                }
            case 10:
                ((kyw) this.a).Z((MessagingInfo) this.b, 2);
                return;
            case 11:
                ((kyw) this.a).ab((VoiceSessionConfig) this.b);
                return;
            case 12:
                ((kyw) this.a).ac((ywk) this.b);
                return;
            case 13:
                yph yphVar = kyw.a;
                rzj rzjVar = (rzj) this.b;
                rzjVar.l();
                orl orlVar = (orl) this.a;
                rzjVar.a("coolwalkAssistantSuggestionsEnabled", Boolean.valueOf(orlVar.c)).a("feedbackInitializationIntentEnabled", Boolean.valueOf(orlVar.d)).a("dodgeboostEnabled", Boolean.valueOf(orlVar.e)).a("coolwalk_direct_action_enabled", Boolean.valueOf(orlVar.f)).a("coolwalk_streamed_media_recommendations_enabled", Boolean.valueOf(orlVar.g)).a("media_recommendation_callbacks_service_enabled", Boolean.valueOf(orlVar.h)).a("notification_proto_enabled", Boolean.valueOf(orlVar.i)).a("send_message_to_contact_using_provider_client_input_enabled", Boolean.valueOf(orlVar.j)).a("gearhead_smart_action_enabled", Boolean.valueOf(orlVar.k)).a("kitt_enabled", Boolean.valueOf(orlVar.l)).a("kitt_eligible", Boolean.valueOf(orlVar.n)).a("car_control_enabled", Boolean.valueOf(orlVar.o));
                return;
            case 14:
                rzj rzjVar2 = (rzj) this.b;
                rzjVar2.l();
                rzjVar2.m((String) ((kyw) this.a).i.get());
                return;
            case 15:
                ((kyw) this.a).Z((MessagingInfo) this.b, 3);
                return;
            case 16:
                Object obj3 = this.b;
                ((rzj) obj3).e(new kot(this.a, obj3, 14));
                return;
            case 17:
                wyd wydVar = ((kyw) this.a).C;
                Object obj4 = this.b;
                ((rzj) obj4).f("GearheadFlags", new kot(obj4, wydVar, 19, bArr));
                return;
            case 18:
                orl orlVar2 = (orl) ((kyw) this.a).h.get();
                Object obj5 = this.b;
                ((rzj) obj5).f("AssistantFeatureFlags", new kot(obj5, orlVar2, 13, bArr));
                return;
            case 19:
                yph yphVar2 = kyw.a;
                rzj rzjVar3 = (rzj) this.b;
                rzjVar3.l();
                rzjVar3.a("assistantEnableWaivePriorityBind", Boolean.valueOf(acmd.w())).a("coolwalkAssistantSuggestionsEnabled", Boolean.valueOf(acpc.p())).a("coolwalkAssistantMediaRecommendationsEnabled", Boolean.valueOf(acpc.q())).a("dodgeboostInitialHandshakeEnabled", Boolean.valueOf(((wyd) this.a).o()));
                return;
            default:
                ((kyw) ((wyd) this.a).a).ab((VoiceSessionConfig) this.b);
                return;
        }
    }

    public /* synthetic */ kot(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
