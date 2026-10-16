package com.waze.settings.tree.a;

import android.view.View;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements com.waze.settings.tree.c.b {
    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        Long lB = ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_SHARE_ROUTE_INFO_TOGGLE_STATE.b();
        if (lB.longValue() != 1) {
            return lB.longValue() == -1 && ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_AGREED_TO_TERMS.b().booleanValue();
        }
        return true;
    }

    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_SHARE_ROUTE_INFO_TOGGLE_STATE.d(z ? 1L : 0L);
    }

    @Override // com.waze.settings.tree.c.b
    public final /* synthetic */ boolean S(View view, boolean z) {
        return true;
    }
}
