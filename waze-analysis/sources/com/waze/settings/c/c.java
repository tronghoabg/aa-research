package com.waze.settings.c;

import android.view.View;
import com.waze.R;
import com.waze.settings.de;
import i.b.a.o;
import i.b.a.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements com.waze.settings.tree.c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f36928a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f36929b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ de f36930c;

    c(h hVar, String str, de deVar) {
        this.f36928a = hVar;
        this.f36929b = str;
        this.f36930c = deVar;
    }

    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        return ((com.waze.ev.m) this.f36928a.f36939a.g().d()).a().contains(this.f36929b);
    }

    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        h hVar = this.f36928a;
        if (z) {
            hVar.f36939a.j(this.f36929b, true);
            de deVar = this.f36930c;
            if (deVar.E()) {
                deVar.y();
            }
        } else {
            hVar.f36939a.l(this.f36929b);
        }
        this.f36928a.f36940b.reportAuditEvent(new com.waze.sharedui.b.a(p.WAZE_EV_NETWORK, i.b.a.m.SETTINGS_MENU, z ? o.ENABLED : o.DISABLED, this.f36929b, h.a.i.i(Integer.valueOf(R.string.EV_NETWORKS_SETTINGS_TITLE), Integer.valueOf(R.string.EV_NETWORKS_SETTINGS_DISCLAIMER))));
    }

    @Override // com.waze.settings.tree.c.b
    public final /* synthetic */ boolean S(View view, boolean z) {
        return true;
    }
}
