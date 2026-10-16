package com.waze.settings.tree.a;

import android.os.Looper;
import android.view.View;
import com.waze.R;
import com.waze.settings.ao;
import com.waze.settings.de;
import com.waze.settings.ds;
import com.waze.settings.ef;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends com.waze.settings.tree.i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37469a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.f f37470b = h.g.a(new ao(3));

    /* renamed from: c, reason: collision with root package name */
    private final ds f37471c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.main_screen.c.a f37472d;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.l f37473f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.google_assistant.a f37474g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ds dsVar, com.waze.google_assistant.c cVar, com.waze.main_screen.c.a aVar, h.g.a.l lVar) {
        super("google_assistant_settings", "GOOGLE_ASSISTANT_SETTINGS", com.waze.ui.ad.b.c(Integer.valueOf(R.string.VOICE_COMMANDS_GOOGLE_ASSISTANT)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.assistant_mic_ic)));
        h.g.b.x.f(dsVar, "settingsRepository");
        h.g.b.x.f(cVar, "googleAssistantConfig");
        h.g.b.x.f(lVar, "showButtonPackToast");
        this.f37471c = dsVar;
        this.f37472d = aVar;
        this.f37473f = lVar;
        g gVar = new g(this, Looper.getMainLooper());
        this.f37474g = gVar;
        com.waze.google_assistant.aa.f24060a.a().x(gVar);
    }

    @Override // com.waze.settings.tree.d.n, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        View viewO = super.O(deVar);
        if (!com.waze.google_assistant.c.b()) {
            viewO.setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m(deVar, this, 1));
        }
        return viewO;
    }

    @Override // com.waze.settings.tree.i
    public final List c() {
        com.waze.settings.tree.d.s sVarC = d.c(R.string.GOOGLE_ASSISTANT_SHOW_MIC_ON_MAP, this.f37471c, this.f37472d, this.f37473f);
        e eVar = new e(new ef(3));
        eVar.A(new com.waze.car_lib.o.k(10));
        com.waze.settings.tree.d.s sVar = new com.waze.settings.tree.d.s("google_assistant_share_route_info_toggle", R.string.VOICE_COMMANDS_GOOGLE_ASSISTANT_SHARE_ROUTE_INFO, "GOOGLE_ASSISTANT_SHARE_ROUTE_INFO", new f());
        com.waze.settings.tree.d.l lVar = new com.waze.settings.tree.d.l("google_assistant_share_route_info_description", com.waze.ui.ad.b.c(Integer.valueOf(R.string.VOICE_COMMANDS_GOOGLE_ASSISTANT_SHARE_ROUTE_INFO_TEXT_HTML)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(sVar);
        arrayList.add(lVar);
        arrayList.add(sVarC);
        arrayList.add(eVar);
        return arrayList;
    }
}
