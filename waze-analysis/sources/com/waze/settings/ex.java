package com.waze.settings;

import android.view.View;
import com.waze.R;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ex extends com.waze.settings.tree.d.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37200a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ex(ds dsVar, fh fhVar) {
        super("custom_message", "CUSTOM_MESSAGE_SETTINGS", Integer.valueOf(R.string.END_OF_DRIVE_SETTINGS_CUSTOM_MESSAGE_TITLE), fhVar, 0, 0, false, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS);
        this.f37200a = dsVar;
    }

    @Override // com.waze.settings.tree.d.k, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        View viewO = super.O(deVar);
        kotlinx.coroutines.aj.z(com.waze.network.f.ak.q(deVar), null, null, new di(this.f37200a, viewO, (h.c.e) null, 2), 3);
        return viewO;
    }
}
