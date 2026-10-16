package com.waze.main_screen;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.MimeTypes;
import com.waze.MoodManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.realtime.RealtimeNativeManager;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ax extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final NativeManager f25852a;

    /* renamed from: b, reason: collision with root package name */
    private final RealtimeNativeManager f25853b;

    /* renamed from: c, reason: collision with root package name */
    private final MoodManager f25854c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.bi.g f25855d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.main_screen.o.k f25856e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.bi.j f25857f;

    /* renamed from: g, reason: collision with root package name */
    private final b f25858g;

    /* renamed from: h, reason: collision with root package name */
    private final i f25859h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f25860i;

    /* renamed from: j, reason: collision with root package name */
    private String f25861j;

    /* renamed from: k, reason: collision with root package name */
    private final bn f25862k;

    /* renamed from: l, reason: collision with root package name */
    private final ch f25863l;
    private final bm m;
    private final bq n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(Application application, NativeManager nativeManager, RealtimeNativeManager realtimeNativeManager, com.waze.sharedui.profile.b bVar, MoodManager moodManager, com.waze.bi.g gVar, com.waze.main_screen.o.k kVar, com.waze.bi.j jVar, com.waze.bi.j jVar2, b bVar2, i iVar, com.waze.shared_infra.i.e eVar) {
        Object objD;
        Object objD2;
        Object objD3;
        super(application);
        h.g.b.x.f(application, MimeTypes.BASE_TYPE_APPLICATION);
        h.g.b.x.f(nativeManager, "nativeManager");
        h.g.b.x.f(realtimeNativeManager, "realtimeNativeManager");
        h.g.b.x.f(bVar, "myProfileManager");
        h.g.b.x.f(moodManager, "moodManager");
        h.g.b.x.f(gVar, "mainMenuRedDotNotification");
        h.g.b.x.f(kVar, "menuBannersRepository");
        h.g.b.x.f(jVar, "getInboxNotificationUseCase");
        h.g.b.x.f(jVar2, "getCopilotMarketplaceNotificationUseCase");
        h.g.b.x.f(bVar2, "configs");
        h.g.b.x.f(iVar, "mainMenuStatsSender");
        h.g.b.x.f(eVar, "logger");
        this.f25852a = nativeManager;
        this.f25853b = realtimeNativeManager;
        this.f25854c = moodManager;
        this.f25855d = gVar;
        this.f25856e = kVar;
        this.f25857f = jVar2;
        this.f25858g = bVar2;
        this.f25859h = iVar;
        this.f25860i = eVar;
        this.f25861j = "";
        com.waze.ui.o.ab abVar = new com.waze.ui.o.ab("", null, null);
        List listH = h.a.i.h();
        com.waze.ui.o.ag agVar = com.waze.ui.o.af.f43124a;
        com.waze.ui.o.w wVar = com.waze.ui.o.w.f43172a;
        bn bnVarB = ck.b(new com.waze.ui.o.ai(abVar, listH, false, agVar, wVar));
        this.f25862k = bnVarB;
        this.f25863l = kotlinx.coroutines.b.ai.U(bnVarB);
        bm bmVarC = bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
        this.m = bmVarC;
        this.n = kotlinx.coroutines.b.ai.S(bmVarC);
        ax axVar = this;
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(axVar), null, null, new ah(bVar, this, (h.c.e) null, 0), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(axVar), null, null, new aj(this, (h.c.e) null, 0), 3);
        agVar = bVar2.i() ? new com.waze.ui.o.ag(false) : agVar;
        do {
            objD = bnVarB.d();
        } while (!bnVarB.f(objD, com.waze.ui.o.ai.f((com.waze.ui.o.ai) objD, null, null, false, agVar, null, 23)));
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(axVar), null, null, new aj(this, (h.c.e) null, 4, (short[]) null), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(axVar), null, null, new ah(jVar, this, (h.c.e) null, 2), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(axVar), null, null, new aj(this, (h.c.e) null, 2, (byte[]) null), 3);
        boolean zIsDebug = this.f25852a.isDebug();
        bn bnVar = this.f25862k;
        if (zIsDebug) {
            do {
                objD3 = bnVar.d();
            } while (!bnVar.f(objD3, com.waze.ui.o.ai.f((com.waze.ui.o.ai) objD3, null, null, false, null, new com.waze.ui.o.v(this.f25853b.getCoreVersionAndServer(), this.f25858g.j(), this.f25858g.f(), this.f25858g.g(), this.f25858g.h()), 15)));
        } else {
            do {
                objD2 = bnVar.d();
            } while (!bnVar.f(objD2, com.waze.ui.o.ai.f((com.waze.ui.o.ai) objD2, null, null, false, null, wVar, 15)));
        }
    }

    public static final /* synthetic */ Drawable b(ax axVar, String str, boolean z) {
        return z ? android.support.a.i.d(axVar.getApplication(), R.drawable.t3_moods_footprint_wazer_interface) : axVar.f25854c.getUpScaledMoodDrawableSync(axVar.getApplication(), str);
    }

    public static final /* synthetic */ List j(ax axVar, List list) {
        List listAm = h.a.i.am(list, Math.min(list.size(), (int) axVar.f25858g.a()));
        ArrayList arrayList = new ArrayList(h.a.i.q(listAm, 10));
        int i2 = 0;
        for (Object obj : listAm) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.i.p();
            }
            com.waze.main_screen.o.b bVar = (com.waze.main_screen.o.b) obj;
            com.waze.ui.o.c cVar = new com.waze.ui.o.c(bVar.b(), bVar.e(), bVar.f(), bVar.c(), bVar.a(), bVar.d(), i2);
            axVar.f25859h.b(cVar.c(), cVar.a() + 1, cVar.g(), e.f26320a);
            arrayList.add(cVar);
            i2 = i3;
        }
        return arrayList;
    }

    private final void r(boolean z) {
        f fVar = z ? f.f26325a : f.f26327c;
        i iVar = this.f25859h;
        iVar.f(fVar, false);
        com.waze.bi.g gVar = this.f25855d;
        gVar.c();
        iVar.e(((Boolean) gVar.a().d()).booleanValue());
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new aj(this, (h.c.e) null, 3, (char[]) null), 3);
    }

    private static final boolean s(com.waze.ui.o.ah ahVar) {
        if (ahVar instanceof com.waze.ui.o.ag) {
            return ((com.waze.ui.o.ag) ahVar).a();
        }
        return false;
    }

    public final bq m() {
        return this.n;
    }

    public final ch n() {
        return this.f25863l;
    }

    public final void p(com.waze.ui.o.t tVar) {
        Object objD;
        h.g.b.x.f(tVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(tVar, com.waze.ui.o.g.f43150a)) {
            r(true);
            return;
        }
        if (h.g.b.x.n(tVar, com.waze.ui.o.j.f43153a)) {
            r(false);
            return;
        }
        if (tVar instanceof com.waze.ui.o.h) {
            com.waze.ui.o.c cVarA = ((com.waze.ui.o.h) tVar).a();
            if (!com.waze.x.h.d(cVarA.b())) {
                this.f25860i.g("Can't handle MainMenuBanner action deeplink ".concat(String.valueOf(cVarA.b())));
                return;
            }
            i iVar = this.f25859h;
            iVar.f(f.f26326b, false);
            iVar.a(e.f26320a, d.f26302a, Long.valueOf(cVarA.a() + 1), cVarA.c(), cVarA.g(), cVarA.b());
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new ah(this, cVarA, (h.c.e) null, 3), 3);
            this.f25852a.UrlHandler(cVarA.b());
            return;
        }
        if (tVar instanceof com.waze.ui.o.i) {
            com.waze.ui.o.c cVarA2 = ((com.waze.ui.o.i) tVar).a();
            this.f25859h.c(e.f26320a, Long.valueOf(cVarA2.a() + 1), cVarA2.c(), cVarA2.g());
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new ah(this, cVarA2, null, 4, null), 3);
            return;
        }
        if (h.g.b.x.n(tVar, com.waze.ui.o.s.f43162a)) {
            this.f25859h.f(f.f26332h, false);
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new aj(this, (h.c.e) null, 7, (float[]) null), 3);
            return;
        }
        if (h.g.b.x.n(tVar, com.waze.ui.o.k.f43154a)) {
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new av(this, null), 3);
            return;
        }
        if (h.g.b.x.n(tVar, com.waze.ui.o.l.f43155a)) {
            this.f25859h.f(f.f26329e, ((com.waze.ui.o.ai) this.f25862k.d()).e());
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new aj(this, (h.c.e) null, 5, (int[]) null), 3);
            return;
        }
        if (h.g.b.x.n(tVar, com.waze.ui.o.m.f43156a)) {
            bn bnVar = this.f25862k;
            this.f25859h.f(f.f26330f, s(((com.waze.ui.o.ai) bnVar.d()).c()));
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, com.waze.ui.o.ai.f((com.waze.ui.o.ai) objD, null, null, false, new com.waze.ui.o.ag(false), null, 23)));
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new aj(this, (h.c.e) null, 6, (boolean[]) null), 3);
            return;
        }
        if (h.g.b.x.n(tVar, com.waze.ui.o.n.f43157a)) {
            this.f25859h.f(f.f26331g, false);
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new aj(this, (h.c.e) null, 8, (byte[][]) null), 3);
            return;
        }
        if (h.g.b.x.n(tVar, com.waze.ui.o.o.f43158a)) {
            this.f25859h.f(f.f26328d, false);
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new aw(this, null), 3);
            return;
        }
        if (h.g.b.x.n(tVar, com.waze.ui.o.p.f43159a)) {
            this.f25859h.f(f.f26333i, false);
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new aj(this, (h.c.e) null, 9, (char[][]) null), 3);
        } else if (h.g.b.x.n(tVar, com.waze.ui.o.q.f43160a)) {
            this.f25859h.f(f.f26334j, false);
            this.f25852a.shutDown();
        } else {
            if (!(tVar instanceof com.waze.ui.o.r)) {
                throw new h.i();
            }
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new ah(this, tVar, (h.c.e) null, 5), 3);
        }
    }

    public final void q() {
        int i2 = Resources.getSystem().getConfiguration().orientation;
        bn bnVar = this.f25862k;
        boolean zS = s(((com.waze.ui.o.ai) bnVar.d()).c());
        this.f25859h.g(i2 == 1, this.f25861j, ((com.waze.ui.o.ai) bnVar.d()).e(), zS);
    }
}
