package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kza implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kza(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, kxe] */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i = 8;
        int i2 = 0;
        int i3 = 4;
        int i4 = 3;
        int i5 = 2;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.kzb) ((defpackage.wyz) this.a).a).ab((com.google.android.gearhead.sdk.assistant.VoiceSessionConfig) this.b);
                return;
            case 1:
                defpackage.yqm yqmVar = defpackage.kzb.a;
                defpackage.saf safVar = (defpackage.saf) this.b;
                safVar.l();
                safVar.a("assistantEnableWaivePriorityBind", java.lang.Boolean.valueOf(defpackage.acnf.w())).a("coolwalkAssistantSuggestionsEnabled", java.lang.Boolean.valueOf(defpackage.acqe.p())).a("coolwalkAssistantMediaRecommendationsEnabled", java.lang.Boolean.valueOf(defpackage.acqe.q())).a("dodgeboostInitialHandshakeEnabled", java.lang.Boolean.valueOf(((defpackage.wyz) this.a).n()));
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int i6 = ((com.google.android.gearhead.sdk.assistant.CarAssistantEvent) this.b).d.getInt("VOICE_SESSION_TYPE_UPDATE_KEY", 0);
                if (i6 != 0) {
                    ((defpackage.kzb) ((defpackage.wyz) this.a).a).n = i6;
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.kzb) ((defpackage.wyz) this.a).a).ae(defpackage.otu.b(((com.google.android.gearhead.sdk.assistant.CarAssistantEvent) this.b).d.getInt("GEMINI_STATE_UPDATE_KEY", defpackage.otu.LIVE_INACTIVE.a())));
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int i7 = defpackage.kzh.i;
                this.a.a(this.b);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Object obj = this.b;
                defpackage.saf safVar2 = (defpackage.saf) obj;
                safVar2.l();
                defpackage.kzu kzuVar = new defpackage.kzu(obj, i2);
                kzy kzyVar = (kzy) this.a;
                safVar2.d("recentSignals", ((kzx) kzyVar.d).a, kzuVar);
                java.lang.Object obj2 = kzyVar.b;
                synchronized (obj2) {
                    ((defpackage.saf) obj).d("Active suggestion notifications (suggestionId -> notificationId)", defpackage.ygw.z(j$.util.Map.Entry.-CC.comparingByKey(), ((lad) obj2).b.entrySet()), new defpackage.kzu(obj, 7));
                    break;
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj3 = this.b;
                defpackage.saf safVar3 = (defpackage.saf) obj3;
                safVar3.l();
                java.lang.Object obj4 = this.a;
                otg otgVar = (otg) obj4;
                int iAs = defpackage.a.as(otgVar.j);
                defpackage.saf safVarB = safVar3.a("priority", defpackage.otn.x(iAs != 0 ? iAs : 1)).b("title", new defpackage.kza(safVar3, obj4, 13)).a("display_text", defpackage.kzi.g(otgVar.c)).b("subtitle", new defpackage.kza(safVar3, obj4, 14)).a("sub_text", defpackage.kzi.g(otgVar.d)).b("display_icon", new defpackage.kza(safVar3, obj4, 16));
                osv osvVar = otgVar.h;
                if (osvVar == null) {
                    osvVar = osv.a;
                }
                safVarB.a("content_action", defpackage.kzi.e(osvVar)).d("labeled_actions", otgVar.i, new defpackage.kzu(obj3, i3));
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj5 = this.b;
                defpackage.saf safVar4 = (defpackage.saf) obj5;
                safVar4.l();
                java.lang.Object obj6 = this.a;
                osw oswVar = (osw) obj6;
                defpackage.saf safVarA = safVar4.a("id", oswVar.c);
                defpackage.abqv abqvVar = oswVar.d;
                if (abqvVar == null) {
                    abqvVar = defpackage.abqv.a;
                }
                safVarA.a("timestamp", defpackage.abrx.f(abqvVar)).b("rendering_metadata", new defpackage.kzz(obj5, obj6, i4));
                if ((8 & oswVar.b) != 0) {
                    safVar4.b("update_metadata", new defpackage.kzz(obj5, obj6, i3));
                    return;
                }
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ota otaVar = ((otb) this.a).d;
                if (otaVar == null) {
                    otaVar = ota.a;
                }
                defpackage.kzi.h((defpackage.saf) this.b, otaVar);
                return;
            case 9:
                defpackage.saf safVar5 = (defpackage.saf) this.b;
                safVar5.l();
                java.lang.Object obj7 = this.a;
                otb otbVar = (otb) obj7;
                safVar5.a("display_text", defpackage.kzi.g(otbVar.c));
                if ((otbVar.b & 2) != 0) {
                    safVar5.b("icon", new defpackage.kza(safVar5, obj7, i));
                }
                osv osvVar2 = otbVar.e;
                if (osvVar2 == null) {
                    osvVar2 = osv.a;
                }
                safVar5.a("action", defpackage.kzi.e(osvVar2));
                return;
            case 10:
                defpackage.saf safVar6 = (defpackage.saf) this.b;
                safVar6.l();
                osz oszVar = ((otd) this.a).c;
                if (oszVar == null) {
                    oszVar = osz.a;
                }
                safVar6.a("current_media_app", defpackage.kzi.f(oszVar));
                return;
            case 11:
                defpackage.saf safVar7 = (defpackage.saf) this.b;
                safVar7.l();
                osx osxVar = (osx) this.a;
                int iAx = defpackage.a.ax(osxVar.c);
                if (iAx == 0 || iAx == 1) {
                    str = "LOGGING_TYPE_UNSPECIFIED";
                } else if (iAx != 2) {
                    str = iAx != 3 ? "LOGGING_TYPE_INTERACTION" : "LOGGING_TYPE_DISMISSED";
                } else {
                    str = "LOGGING_TYPE_SHOWN";
                }
                defpackage.saf safVarA2 = safVar7.a("logging_type", str).a("id", osxVar.d).a("ids", osxVar.f);
                int iAu = defpackage.a.au(osxVar.e);
                if (iAu == 0 || iAu == 1) {
                    str2 = "UI_SOURCE_UNSPECIFIED";
                } else if (iAu == 2) {
                    str2 = "UI_SOURCE_SIDE_CARD";
                } else if (iAu != 3) {
                    str2 = iAu != 4 ? "UI_SOURCE_MEDIA_CARD" : "UI_SOURCE_NOTIFICATION_CENTER";
                } else {
                    str2 = "UI_SOURCE_RAIL";
                }
                safVarA2.a("source", str2);
                return;
            case 12:
                defpackage.saf safVar8 = (defpackage.saf) this.b;
                safVar8.l();
                safVar8.a("update_surface", java.lang.Boolean.valueOf(((oti) this.a).b));
                return;
            case 13:
                oth othVar = ((otg) this.a).f;
                if (othVar == null) {
                    othVar = oth.a;
                }
                defpackage.kzi.i((defpackage.saf) this.b, othVar);
                return;
            case 14:
                oth othVar2 = ((otg) this.a).g;
                if (othVar2 == null) {
                    othVar2 = oth.a;
                }
                defpackage.kzi.i((defpackage.saf) this.b, othVar2);
                return;
            case 15:
                defpackage.saf safVar9 = (defpackage.saf) this.b;
                safVar9.l();
                ota otaVar2 = (ota) this.a;
                safVar9.a("resource_uri", otaVar2.c).a("provider_package_name", defpackage.kzi.g(otaVar2.e)).a("provider_class_name", defpackage.kzi.g(otaVar2.f)).a("is_large_image", java.lang.Boolean.valueOf(otaVar2.g));
                return;
            case 16:
                ota otaVar3 = ((otg) this.a).e;
                if (otaVar3 == null) {
                    otaVar3 = ota.a;
                }
                defpackage.kzi.h((defpackage.saf) this.b, otaVar3);
                return;
            case 17:
                java.lang.Object obj8 = this.a;
                defpackage.saf safVar10 = (defpackage.saf) obj8;
                safVar10.l();
                tal talVar = (tal) this.b;
                safVar10.a("suggestion_ids_to_dismiss", talVar.b).d("suggestions_to_display", talVar.c, new defpackage.kzu(obj8, 5));
                return;
            case 18:
                java.lang.Object obj9 = this.b;
                defpackage.saf safVar11 = (defpackage.saf) obj9;
                safVar11.l();
                otf otfVar = (otf) this.a;
                osz oszVar2 = otfVar.f;
                if (oszVar2 == null) {
                    oszVar2 = osz.a;
                }
                defpackage.saf safVarA3 = safVar11.a("current_navigation_app", defpackage.kzi.f(oszVar2));
                int iAx2 = defpackage.a.ax(otfVar.c);
                if (iAx2 == 0 || iAx2 == 1) {
                    str3 = "NAVIGATION_STATUS_UNSPECIFIED";
                } else if (iAx2 != 2) {
                    str3 = iAx2 != 3 ? "REROUTING" : "STOPPED";
                } else {
                    str3 = "NAVIGATING";
                }
                safVarA3.a("navigation_status", str3).d("destination_addresses", otfVar.d, new defpackage.kzu(obj9, i5)).d("destination_distances", otfVar.e, new defpackage.kzu(obj9, i4));
                return;
            case 19:
                otf otfVar2 = ((osy) this.a).d;
                if (otfVar2 == null) {
                    otfVar2 = otf.a;
                }
                defpackage.saf safVar12 = (defpackage.saf) this.b;
                safVar12.f("NavigationSignal", new defpackage.kza(safVar12, (java.lang.Object) otfVar2, 18));
                return;
            default:
                otd otdVar = ((osy) this.a).e;
                if (otdVar == null) {
                    otdVar = otd.a;
                }
                defpackage.saf safVar13 = (defpackage.saf) this.b;
                safVar13.f("MediaSignal", new defpackage.kza(safVar13, (java.lang.Object) otdVar, 10));
                return;
        }
    }

    public /* synthetic */ kza(defpackage.saf safVar, java.lang.Object obj, int i) {
        this.c = i;
        this.b = safVar;
        this.a = obj;
    }
}
