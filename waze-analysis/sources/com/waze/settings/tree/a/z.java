package com.waze.settings.tree.a;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.R;
import com.waze.network.f.ak;
import com.waze.settings.bs;
import com.waze.settings.de;
import com.waze.settings.ds;
import com.waze.settings.tree.views.WazeSettingsView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z extends com.waze.settings.tree.d.d {

    /* renamed from: a, reason: collision with root package name */
    private final ds f37509a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ds dsVar) {
        super("search_by_voice", "LANGUAGE_SETTINGS", com.waze.ui.ad.b.c(Integer.valueOf(R.string.VOICE_TYPING)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_search_by_voice)), new o(dsVar), null, 32);
        h.g.b.x.f(dsVar, "settingsRepository");
        this.f37509a = dsVar;
    }

    public static final /* synthetic */ List f(z zVar, Map map, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.waze.settings.tree.d.s("search_by_voice_default_toggle", R.string.SEARCH_BY_VOICE_AUTO_LONG, ((bs) zVar.f37509a.A().d()).k(), "SETTINGS_SEARCH_BY_VOICE_DEFAULT_TO_LOCAL_LANGAUGE", new u(zVar, 0), 0));
        arrayList.add(new com.waze.settings.tree.d.l("search_by_voice_text", com.waze.ui.ad.b.c(Integer.valueOf(R.string.SEARCH_BY_VOICE_AUTO_FOOTER))));
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new x(entry, str, zVar, (String) entry.getKey(), com.waze.ui.ad.b.d((String) entry.getValue())));
        }
        return arrayList;
    }

    @Override // com.waze.settings.tree.d.d, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        ai.m(ai.K(ai.y(new r(this.f37509a.A(), 0)), new s(wazeSettingsView, (h.c.e) null, 0)), ak.q(deVar));
        return wazeSettingsView;
    }

    public final ds c() {
        return this.f37509a;
    }

    @Override // com.waze.settings.tree.d.d, com.waze.settings.tree.g
    public final void h(de deVar) {
        h.g.b.x.f(deVar, "page");
        ai.m(ai.K(ai.y(new r(this.f37509a.A(), 3)), new s(this, (h.c.e) null, 2)), LifecycleOwnerKt.getLifecycleScope(deVar.h()));
    }
}
