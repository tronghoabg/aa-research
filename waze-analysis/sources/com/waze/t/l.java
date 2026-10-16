package com.waze.t;

import android.app.Application;
import android.content.Context;
import com.waze.ConfigManager;
import com.waze.MoodManager;
import com.waze.copilot.a.bh;
import com.waze.copilot.a.bj;
import com.waze.copilot.au;
import com.waze.copilot.data.a.t;
import com.waze.location.a.ae;
import com.waze.mywaze.ah;
import com.waze.sound.at;
import com.waze.sound.ay;
import com.waze.sound.fm;
import com.waze.t.b.an;
import com.waze.t.b.ao;
import com.waze.t.b.ap;
import com.waze.t.b.aq;
import h.g.b.ar;
import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.av;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class l implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f40904a;

    public /* synthetic */ l(int i2) {
        this.f40904a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40904a) {
            case 0:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                x.f(bVar, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i2 = ar.f48106a;
                return new k((ae) bVar.a(new h.g.b.m(ae.class), null, null), av.a());
            case 1:
                int i3 = com.waze.q.c.f33455a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.q.b();
            case 2:
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new n();
            case 3:
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new b();
            case 4:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                x.f(bVar2, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i4 = ar.f48106a;
                Application application = (Application) bVar2.a(new h.g.b.m(Application.class), null, null);
                com.waze.shared_infra.q.e eVar = (com.waze.shared_infra.q.e) bVar2.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null);
                a aVar = (a) bVar2.a(new h.g.b.m(a.class), null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("LogFilesConversationObserver");
                x.e(eVarD, "create(...)");
                return new g(application, eVar, eVarD, aVar, ab.limitedParallelism$default(av.b(), 1, null, 2, null));
            case 5:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                x.f(bVar3, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new ay(k.a.k.h(bVar3), new com.waze.speech.k());
            case 6:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                x.f(bVar4, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i5 = ar.f48106a;
                com.waze.sound.ar arVar = (com.waze.sound.ar) bVar4.a(new h.g.b.m(com.waze.sound.ar.class), null, null);
                fm fmVar = (fm) bVar4.a(new h.g.b.m(fm.class), null, null);
                com.waze.h.b.r rVar = (com.waze.h.b.r) bVar4.a(new h.g.b.m(com.waze.h.b.r.class), null, null);
                com.waze.h.a.a aVar2 = (com.waze.h.a.a) bVar4.a(new h.g.b.m(com.waze.h.a.a.class), null, null);
                com.waze.shared_infra.i.b bVar5 = (com.waze.shared_infra.i.b) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ConversationAudioSessionImpl");
                x.e(eVarD2, "create(...)");
                int i6 = av.f51370a;
                return new at(arVar, fmVar, rVar, aVar2, bVar5, eVarD2, ac.f51860a.c());
            case 7:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                x.f(bVar6, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                Context contextH = k.a.k.h(bVar6);
                com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ConversationAudioFocusRequestor");
                x.e(eVarD3, "create(...)");
                return new com.waze.sound.ar(contextH, eVarD3);
            case 8:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                x.f(bVar7, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i7 = ar.f48106a;
                return (aq) bVar7.a(new h.g.b.m(ap.class), null, null);
            case 9:
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new ao();
            case 10:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                x.f(bVar8, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ConversationFeedbackFrequencyPolicy");
                x.e(eVarD4, "create(...)");
                int i8 = ar.f48106a;
                an anVar = (an) bVar8.a(new h.g.b.m(an.class), null, null);
                x.f(bVar8, "<this>");
                x.f(eVarD4, "logger");
                x.f(anVar, "config");
                return new ap(eVarD4, anVar);
            case 11:
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.t.c.b();
            case 12:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                x.f(bVar9, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i9 = ar.f48106a;
                return new com.waze.t.c.c((com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (com.waze.t.c.a) bVar9.a(new h.g.b.m(com.waze.t.c.a.class), null, null));
            case 13:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                x.f(bVar10, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ConversationFeedbackInsightPresenter");
                x.e(eVarD5, "create(...)");
                int i10 = ar.f48106a;
                return new com.waze.t.c.e(eVarD5, (com.waze.an.d.b) bVar10.a(new h.g.b.m(com.waze.an.d.b.class), null, null), (com.waze.t.c.c) bVar10.a(new h.g.b.m(com.waze.t.c.c.class), null, null), (com.waze.main_screen.k.a) bVar10.a(new h.g.b.m(com.waze.main_screen.k.a.class), null, null));
            case 14:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                x.f(bVar11, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i11 = ar.f48106a;
                return new q((com.waze.sharedui.e.g) bVar11.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null), av.a());
            case 15:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                x.f(bVar12, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i12 = ar.f48106a;
                return new h((com.waze.sound.a.c) bVar12.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), av.a());
            case 16:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                x.f(bVar13, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i13 = ar.f48106a;
                return new o((com.waze.sharedui.profile.b) bVar13.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null));
            case 17:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                int i14 = au.f22906a;
                x.f(bVar14, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i15 = ar.f48106a;
                return new com.waze.copilot.data.a.r((ConfigManager) bVar14.a(new h.g.b.m(ConfigManager.class), null, null));
            case 18:
                org.a.d.k.b bVar15 = (org.a.d.k.b) obj;
                int i16 = au.f22906a;
                x.f(bVar15, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i17 = ar.f48106a;
                return new bh((com.waze.copilot.data.b.h) bVar15.a(new h.g.b.m(com.waze.copilot.data.b.h.class), null, null));
            case 19:
                org.a.d.k.b bVar16 = (org.a.d.k.b) obj;
                int i18 = au.f22906a;
                x.f(bVar16, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i19 = ar.f48106a;
                return new t((MoodManager) bVar16.a(new h.g.b.m(MoodManager.class), null, null));
            default:
                org.a.d.k.b bVar17 = (org.a.d.k.b) obj;
                int i20 = au.f22906a;
                x.f(bVar17, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i21 = ar.f48106a;
                return new bj((com.waze.copilot.data.b.h) bVar17.a(new h.g.b.m(com.waze.copilot.data.b.h.class), null, null), (com.waze.copilot.data.b.a) bVar17.a(new h.g.b.m(com.waze.copilot.data.b.a.class), null, null), (com.waze.sound.a.c) bVar17.a(new h.g.b.m(com.waze.sound.a.c.class), null, null), (ah) bVar17.a(new h.g.b.m(ah.class), null, null));
        }
    }
}
