package com.waze.settings.tree.views;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.waze.R;
import com.waze.settings.de;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f37617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context, null, R.style.settingsSection);
        h.g.b.x.f(context, "context");
        this.f37617a = -1;
        setOrientation(1);
    }

    public static /* synthetic */ void b(com.waze.settings.tree.d.e eVar, int i2, e eVar2, de deVar, com.waze.settings.tree.d.g gVar) {
        String strS;
        com.waze.shared_infra.i.h.a("setting config to ".concat(String.valueOf(((com.waze.settings.tree.d.g) eVar.f().get(i2)).s())));
        com.waze.settings.tree.d.g gVar2 = (com.waze.settings.tree.d.g) h.a.i.S(eVar.f(), eVar2.f37617a);
        if (gVar2 == null || (strS = gVar2.s()) == null) {
            strS = "";
        }
        eVar.d().c(eVar2, ((com.waze.settings.tree.d.g) eVar.f().get(i2)).s(), strS);
        com.waze.search.v2.o.i(eVar, deVar, strS, ((com.waze.settings.tree.d.g) eVar.f().get(i2)).s());
        if (gVar2 != null) {
            gVar2.f(false);
        }
        gVar.f(true);
        eVar2.f37617a = i2;
    }

    public final void a(final com.waze.settings.tree.d.e eVar, de deVar) {
        final de deVar2 = deVar;
        h.g.b.x.f(eVar, "setting");
        h.g.b.x.f(deVar2, "page");
        removeAllViews();
        String strT = eVar.t();
        if (strT != null) {
            SettingsTitleText settingsTitleText = new SettingsTitleText(deVar2.g(), null);
            settingsTitleText.a(strT);
            settingsTitleText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            addView(settingsTitleText);
        }
        this.f37617a = eVar.c();
        View view = null;
        final int i2 = 0;
        for (Object obj : eVar.f()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.i.p();
            }
            final com.waze.settings.tree.d.g gVar = (com.waze.settings.tree.d.g) obj;
            View viewK = gVar.k(deVar2);
            if (viewK != null) {
                viewK.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                viewK.setTag(gVar.s());
                gVar.f(i2 == this.f37617a);
                viewK.setOnClickListener(new View.OnClickListener() { // from class: com.waze.settings.tree.views.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        e.b(eVar, i2, this, deVar2, gVar);
                    }
                });
                addView(viewK);
                if ((view instanceof WazeSettingsView) && !(viewK instanceof WazeSettingsView)) {
                    ((WazeSettingsView) view).M();
                }
                view = viewK;
            }
            deVar2 = deVar;
            i2 = i3;
        }
        WazeSettingsView wazeSettingsView = view instanceof WazeSettingsView ? (WazeSettingsView) view : null;
        if (wazeSettingsView != null) {
            wazeSettingsView.M();
        }
        setTag(eVar.s());
    }
}
