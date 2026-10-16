package com.waze.settings.c;

import android.view.View;
import com.waze.R;
import i.b.a.o;
import i.b.a.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements com.waze.settings.tree.c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Integer f36949a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Integer f36950b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.b.d f36951c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.ev.n f36952d;

    m(Integer num, Integer num2, com.waze.sharedui.b.d dVar, com.waze.ev.n nVar) {
        this.f36949a = num;
        this.f36950b = num2;
        this.f36951c = dVar;
        this.f36952d = nVar;
    }

    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        return ((com.waze.ev.m) this.f36952d.g().d()).c();
    }

    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        List listL = h.a.i.l(Integer.valueOf(R.string.EV_PROFILE_SETTINGS_I_DRIVE_EV_TOGGLE), Integer.valueOf(R.string.EV_PROFILE_SETTINGS_FOOTER), Integer.valueOf(R.string.EV_PROFILE_SETTINGS_TITLE), Integer.valueOf(R.string.EV_CONNECTORS_SETTINGS_TITLE), Integer.valueOf(R.string.EV_NETWORKS_SETTINGS_TITLE));
        Integer num = this.f36949a;
        if (num != null) {
            listL.add(Integer.valueOf(num.intValue()));
        }
        Integer num2 = this.f36950b;
        if (num2 != null) {
            listL.add(Integer.valueOf(num2.intValue()));
        }
        this.f36951c.reportAuditEvent(new com.waze.sharedui.b.a(p.WAZE_EV_DRIVER, i.b.a.m.SETTINGS_MENU, z ? o.ENABLED : o.DISABLED, "", listL));
        this.f36952d.m(z);
    }

    @Override // com.waze.settings.tree.c.b
    public final /* synthetic */ boolean S(View view, boolean z) {
        return true;
    }
}
