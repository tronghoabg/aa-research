package com.waze.main_screen;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.waze.InternalWebBrowser;
import com.waze.R;
import com.waze.cs;
import com.waze.sharedui.profile.UserProfile;
import java.util.List;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ag implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f25804a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25805b;

    ag(Object obj, int i2) {
        this.f25805b = i2;
        this.f25804a = obj;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        com.waze.ui.o.ai aiVar;
        com.waze.ui.o.ab abVarB;
        String firstName;
        Object objD2;
        com.waze.ui.o.ai aiVar2;
        Object objD3;
        Object objD4;
        Object objD5;
        int i2 = this.f25805b;
        if (i2 == 0) {
            UserProfile userProfile = (UserProfile) obj;
            bn bnVar = ((ax) this.f25804a).f25862k;
            do {
                objD = bnVar.d();
                aiVar = (com.waze.ui.o.ai) objD;
                abVarB = aiVar.b();
                firstName = userProfile.getBasicInfo().getFirstName();
                if (firstName.length() == 0) {
                    firstName = null;
                }
            } while (!bnVar.f(objD, com.waze.ui.o.ai.f(aiVar, com.waze.ui.o.ab.d(abVarB, firstName, null, null, 6), null, false, null, null, 30)));
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                h.k kVar = (h.k) obj;
                String str = (String) kVar.a();
                boolean zBooleanValue = ((Boolean) kVar.b()).booleanValue();
                h.g.b.x.c(str);
                ax axVar = (ax) this.f25804a;
                axVar.f25861j = str;
                bn bnVar2 = axVar.f25862k;
                do {
                    objD2 = bnVar2.d();
                    aiVar2 = (com.waze.ui.o.ai) objD2;
                } while (!bnVar2.f(objD2, com.waze.ui.o.ai.f(aiVar2, com.waze.ui.o.ab.d(aiVar2.b(), null, ax.b(axVar, str, zBooleanValue), axVar.f25854c.getUpScaledAddonDrawable(axVar.getApplication()), 1), null, false, null, null, 30)));
                return h.ab.f48028a;
            }
            if (i2 == 3) {
                com.waze.bi.f fVar = (com.waze.bi.f) obj;
                bn bnVar3 = ((ax) this.f25804a).f25862k;
                do {
                    objD3 = bnVar3.d();
                } while (!bnVar3.f(objD3, com.waze.ui.o.ai.f((com.waze.ui.o.ai) objD3, null, null, fVar.c(), null, null, 27)));
                return h.ab.f48028a;
            }
            if (i2 == 4) {
                List list = (List) obj;
                ax axVar2 = (ax) this.f25804a;
                bn bnVar4 = axVar2.f25862k;
                do {
                    objD4 = bnVar4.d();
                } while (!bnVar4.f(objD4, com.waze.ui.o.ai.f((com.waze.ui.o.ai) objD4, null, ax.j(axVar2, list), false, null, null, 29)));
                return h.ab.f48028a;
            }
            h.k kVar2 = (h.k) obj;
            boolean zBooleanValue2 = ((Boolean) kVar2.a()).booleanValue();
            com.waze.bi.f fVar2 = (com.waze.bi.f) kVar2.b();
            bn bnVar5 = ((ax) this.f25804a).f25862k;
            do {
                objD5 = bnVar5.d();
            } while (!bnVar5.f(objD5, com.waze.ui.o.ai.f((com.waze.ui.o.ai) objD5, null, null, false, zBooleanValue2 ? new com.waze.ui.o.ag(fVar2.c()) : com.waze.ui.o.af.f43124a, null, 23)));
            return h.ab.f48028a;
        }
        com.waze.main_screen.u.d dVar = (com.waze.main_screen.u.d) obj;
        if (dVar instanceof al) {
            af.j((af) this.f25804a, ((al) dVar).a());
        } else if (h.g.b.x.n(dVar, am.f25834a)) {
            com.waze.app_nav.w wVarD = af.d((af) this.f25804a);
            com.waze.copilot.aw awVar = com.waze.copilot.aw.f22909a;
            wVarD.a(new com.waze.app_nav.m(new com.waze.copilot.av().a(), new com.waze.app_nav.ah(false, com.waze.app_nav.c.f15197a, null, 4)));
        } else if (h.g.b.x.n(dVar, at.f25841a)) {
            com.waze.app_nav.a.ag agVarE = af.e((af) this.f25804a);
            if (agVarE != null) {
                agVarE.H(com.waze.app_nav.a.ak.f15111a);
            } else {
                com.waze.bs.a.f("settings_main", "MAP", false);
            }
        } else if (h.g.b.x.n(dVar, ao.f25836a)) {
            com.waze.app_nav.w wVarD2 = af.d((af) this.f25804a);
            com.waze.inbox.d dVar2 = com.waze.inbox.d.f24639a;
            com.waze.alerters.a.k.c(wVarD2, new com.waze.inbox.c((byte[]) null).a(), new com.waze.app_nav.ah(false, null, null, 6));
        } else if (h.g.b.x.n(dVar, aq.f25838a)) {
            com.waze.app_nav.w wVarD3 = af.d((af) this.f25804a);
            com.waze.mywaze.b bVar = com.waze.mywaze.b.f30576a;
            com.waze.alerters.a.k.c(wVarD3, com.waze.mywaze.b.c().a(), new com.waze.app_nav.ah(false, null, null, 6));
        } else if (dVar instanceof as) {
            com.waze.web.d dVar3 = com.waze.web.d.f45485a;
            com.waze.web.c cVar = new com.waze.web.c();
            af afVar = (af) this.f25804a;
            cVar.c(afVar.n().c(R.string.MAIN_MENU_HELP_AND_FEEDBACK, new Object[0]));
            cVar.b(((as) dVar).a());
            com.waze.ch.a.a.f.c(af.d(afVar), cVar);
        } else if (dVar instanceof an) {
            com.waze.web.d dVar4 = com.waze.web.d.f45485a;
            com.waze.web.c cVar2 = new com.waze.web.c();
            af afVar2 = (af) this.f25804a;
            cVar2.c(afVar2.n().c(R.string.MAIN_MENU_HELP_AND_FEEDBACK, new Object[0]));
            cVar2.b(((an) dVar).a());
            com.waze.ch.a.a.f.c(af.d(afVar2), cVar2);
        } else if (h.g.b.x.n(dVar, ak.f25832a)) {
            af.d((af) this.f25804a).c();
        } else if (h.g.b.x.n(dVar, ar.f25839a)) {
            int i3 = com.waze.planned_drive.ay.f33212a;
            com.waze.realtime_report_feedback.e.f(af.d((af) this.f25804a), false);
        } else {
            if (!(dVar instanceof ap)) {
                throw new h.i();
            }
            Object obj2 = this.f25804a;
            af afVar3 = (af) obj2;
            ActivityResultLauncher activityResultLauncher = afVar3.f25749a;
            int i4 = InternalWebBrowser.f13552f;
            Context contextRequireContext = ((android.support.v4.app.ar) obj2).requireContext();
            h.g.b.x.e(contextRequireContext, "requireContext(...)");
            activityResultLauncher.launch(cs.a(contextRequireContext, afVar3.n().c(R.string.MAIN_MENU_HELP_AND_FEEDBACK, new Object[0]), ((ap) dVar).a(), true, 0L));
        }
        return h.ab.f48028a;
    }
}
