package com.waze.settings;

import android.view.View;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gb extends com.waze.settings.tree.d.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37296a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gb(ds dsVar, com.waze.settings.tree.c.b bVar) {
        super("play_alert_sound", R.string.SPEEDOMETER_SETTINGS_ALERT_SOUND, "PLAY_ALERT_SOUND_SETTINGS", bVar);
        this.f37296a = dsVar;
    }

    @Override // com.waze.settings.tree.d.s, com.waze.settings.tree.f
    public final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        View viewO = super.O(deVar);
        kotlinx.coroutines.aj.z(com.waze.network.f.ak.q(deVar), null, null, new di(this.f37296a, viewO, (h.c.e) null, 9, (int[]) null), 3);
        return viewO;
    }
}
