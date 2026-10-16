package com.waze.settings;

import android.view.View;
import androidx.autofill.HintConstants;
import com.waze.R;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gh extends com.waze.settings.tree.d.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37309a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gh(ds dsVar, fg fgVar) {
        super(HintConstants.AUTOFILL_HINT_USERNAME, "USERNAME_SETTINGS", Integer.valueOf(R.string.NICKNAME), fgVar, R.drawable.textfield_wazer_icon, 0, true, DisplayStrings.DS_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT);
        this.f37309a = dsVar;
    }

    @Override // com.waze.settings.tree.d.k, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        com.waze.sharedui.views.aj ajVar = (com.waze.sharedui.views.aj) super.O(deVar);
        kotlinx.coroutines.aj.z(com.waze.network.f.ak.q(deVar), null, null, new di(this.f37309a, ajVar, (h.c.e) null, 11), 3);
        return ajVar;
    }
}
