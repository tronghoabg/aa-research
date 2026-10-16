package defpackage;

import com.google.android.gearhead.sdk.assistant.CarAssistantEvent;
import j$.util.Collection;
import j$.util.Map$Entry$CC;
import j$.util.stream.Stream;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class kyv implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kyv(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, kwx] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 4;
        int i2 = 8;
        int i3 = 6;
        int i4 = 0;
        int i5 = 3;
        int i6 = 2;
        switch (this.c) {
            case 0:
                ((kyw) ((wyd) this.a).a).ae(osx.b(((CarAssistantEvent) this.b).d.getInt("GEMINI_STATE_UPDATE_KEY", osx.LIVE_INACTIVE.a())));
                return;
            case 1:
                int i7 = ((CarAssistantEvent) this.b).d.getInt("VOICE_SESSION_TYPE_UPDATE_KEY", 0);
                if (i7 != 0) {
                    ((kyw) ((wyd) this.a).a).n = i7;
                    return;
                }
                return;
            case 2:
                int i8 = kzc.i;
                this.a.a(this.b);
                return;
            case 3:
                Object obj = this.b;
                rzj rzjVar = (rzj) obj;
                rzjVar.l();
                kzp kzpVar = new kzp(obj, i4);
                kzt kztVar = (kzt) this.a;
                rzjVar.d("recentSignals", ((kzs) kztVar.d).a, kzpVar);
                Object obj2 = kztVar.b;
                synchronized (obj2) {
                    ((rzj) obj).d("Active suggestion notifications (suggestionId -> notificationId)", yfq.z(Map$Entry$CC.comparingByKey(), ((kzy) obj2).b.entrySet()), new kzp(obj, 7));
                }
                return;
            case 4:
                Object obj3 = this.b;
                rzj rzjVar2 = (rzj) obj3;
                rzjVar2.l();
                Object obj4 = this.a;
                osj osjVar = (osj) obj4;
                int iAt = a.at(osjVar.j);
                abnv abnvVar = (abnv) obj4;
                rzj rzjVarB = rzjVar2.a(LogFactory.PRIORITY_KEY, osq.v(iAt != 0 ? iAt : 1)).b("title", new kyv(rzjVar2, abnvVar, 11)).a("display_text", kzd.g(osjVar.c)).b("subtitle", new kyv(rzjVar2, abnvVar, 12)).a("sub_text", kzd.g(osjVar.d)).b("display_icon", new kyv(rzjVar2, abnvVar, 14));
                ory oryVar = osjVar.h;
                if (oryVar == null) {
                    oryVar = ory.a;
                }
                rzjVarB.a("content_action", kzd.e(oryVar)).d("labeled_actions", osjVar.i, new kzp(obj3, i));
                return;
            case 5:
                Object obj5 = this.b;
                rzj rzjVar3 = (rzj) obj5;
                rzjVar3.l();
                Object obj6 = this.a;
                orz orzVar = (orz) obj6;
                rzj rzjVarA = rzjVar3.a("id", orzVar.c);
                abpt abptVar = orzVar.d;
                if (abptVar == null) {
                    abptVar = abpt.a;
                }
                rzjVarA.a("timestamp", abqu.f(abptVar)).b("rendering_metadata", new kzu(obj5, obj6, i4));
                if ((8 & orzVar.b) != 0) {
                    rzjVar3.b("update_metadata", new kzu(obj5, obj6, i6));
                    return;
                }
                return;
            case 6:
                osd osdVar = ((ose) this.a).d;
                if (osdVar == null) {
                    osdVar = osd.a;
                }
                kzd.h((rzj) this.b, osdVar);
                return;
            case 7:
                rzj rzjVar4 = (rzj) this.b;
                rzjVar4.l();
                Object obj7 = this.a;
                ose oseVar = (ose) obj7;
                rzjVar4.a("display_text", kzd.g(oseVar.c));
                if ((oseVar.b & 2) != 0) {
                    rzjVar4.b("icon", new kyv(rzjVar4, (abnv) obj7, i3));
                }
                ory oryVar2 = oseVar.e;
                if (oryVar2 == null) {
                    oryVar2 = ory.a;
                }
                rzjVar4.a("action", kzd.e(oryVar2));
                return;
            case 8:
                rzj rzjVar5 = (rzj) this.b;
                rzjVar5.l();
                osc oscVar = ((osg) this.a).c;
                if (oscVar == null) {
                    oscVar = osc.a;
                }
                rzjVar5.a("current_media_app", kzd.f(oscVar));
                return;
            case 9:
                rzj rzjVar6 = (rzj) this.b;
                rzjVar6.l();
                osa osaVar = (osa) this.a;
                int iAy = a.ay(osaVar.c);
                rzj rzjVarA2 = rzjVar6.a("logging_type", (iAy == 0 || iAy == 1) ? "LOGGING_TYPE_UNSPECIFIED" : iAy != 2 ? iAy != 3 ? "LOGGING_TYPE_INTERACTION" : "LOGGING_TYPE_DISMISSED" : "LOGGING_TYPE_SHOWN").a("id", osaVar.d).a("ids", osaVar.f);
                int iAv = a.av(osaVar.e);
                rzjVarA2.a("source", (iAv == 0 || iAv == 1) ? "UI_SOURCE_UNSPECIFIED" : iAv != 2 ? iAv != 3 ? iAv != 4 ? "UI_SOURCE_MEDIA_CARD" : "UI_SOURCE_NOTIFICATION_CENTER" : "UI_SOURCE_RAIL" : "UI_SOURCE_SIDE_CARD");
                return;
            case 10:
                rzj rzjVar7 = (rzj) this.b;
                rzjVar7.l();
                rzjVar7.a("update_surface", Boolean.valueOf(((osl) this.a).b));
                return;
            case 11:
                osk oskVar = ((osj) this.a).f;
                if (oskVar == null) {
                    oskVar = osk.a;
                }
                kzd.i((rzj) this.b, oskVar);
                return;
            case 12:
                osk oskVar2 = ((osj) this.a).g;
                if (oskVar2 == null) {
                    oskVar2 = osk.a;
                }
                kzd.i((rzj) this.b, oskVar2);
                return;
            case 13:
                rzj rzjVar8 = (rzj) this.b;
                rzjVar8.l();
                osd osdVar2 = (osd) this.a;
                rzjVar8.a("resource_uri", osdVar2.c).a("provider_package_name", kzd.g(osdVar2.e)).a("provider_class_name", kzd.g(osdVar2.f)).a("is_large_image", Boolean.valueOf(osdVar2.g));
                return;
            case 14:
                osd osdVar3 = ((osj) this.a).e;
                if (osdVar3 == null) {
                    osdVar3 = osd.a;
                }
                kzd.h((rzj) this.b, osdVar3);
                return;
            case 15:
                Object obj8 = this.a;
                rzj rzjVar9 = (rzj) obj8;
                rzjVar9.l();
                szn sznVar = (szn) this.b;
                rzjVar9.a("suggestion_ids_to_dismiss", sznVar.b).d("suggestions_to_display", sznVar.c, new kzp(obj8, 5));
                return;
            case 16:
                Object obj9 = this.b;
                rzj rzjVar10 = (rzj) obj9;
                rzjVar10.l();
                osi osiVar = (osi) this.a;
                osc oscVar2 = osiVar.f;
                if (oscVar2 == null) {
                    oscVar2 = osc.a;
                }
                rzj rzjVarA3 = rzjVar10.a("current_navigation_app", kzd.f(oscVar2));
                int iAy2 = a.ay(osiVar.c);
                rzjVarA3.a("navigation_status", (iAy2 == 0 || iAy2 == 1) ? "NAVIGATION_STATUS_UNSPECIFIED" : iAy2 != 2 ? iAy2 != 3 ? "REROUTING" : "STOPPED" : "NAVIGATING").d("destination_addresses", osiVar.d, new kzp(obj9, i6)).d("destination_distances", osiVar.e, new kzp(obj9, i5));
                return;
            case 17:
                osi osiVar2 = ((osb) this.a).d;
                if (osiVar2 == null) {
                    osiVar2 = osi.a;
                }
                rzj rzjVar11 = (rzj) this.b;
                rzjVar11.f("NavigationSignal", new kyv(rzjVar11, (abnv) osiVar2, 16));
                return;
            case 18:
                osg osgVar = ((osb) this.a).e;
                if (osgVar == null) {
                    osgVar = osg.a;
                }
                rzj rzjVar12 = (rzj) this.b;
                rzjVar12.f("MediaSignal", new kyv(rzjVar12, (abnv) osgVar, i2));
                return;
            case 19:
                rzj rzjVar13 = (rzj) this.b;
                rzjVar13.l();
                Object obj10 = this.a;
                osk oskVar3 = (osk) obj10;
                Stream map = Collection.EL.stream(oskVar3.b).map(new koj(17));
                int i9 = yfq.d;
                rzjVar13.a("text", map.collect(ycm.a)).b("icons", new kyv(rzjVar13, (abnv) obj10, 20)).a("starts_interleaving_with_text", Boolean.valueOf(oskVar3.d));
                return;
            default:
                aboh abohVar = ((osk) this.a).c;
                Object obj11 = this.b;
                ((rzj) obj11).k(abohVar, new kzp(obj11, i3));
                return;
        }
    }

    public /* synthetic */ kyv(rzj rzjVar, abnv abnvVar, int i) {
        this.c = i;
        this.b = rzjVar;
        this.a = abnvVar;
    }
}
