package com.waze.menus;

import android.support.v7.widget.eo;
import android.support.v7.widget.fe;
import android.view.View;
import com.waze.R;
import com.waze.ui.z.as;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends fe {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler, View view) {
        super(view);
        Objects.requireNonNull(sideMenuAutoCompleteRecycler);
        eo eoVar = new eo(-1, 0);
        eoVar.bottomMargin = as.e(R.dimen.sideMenuAddressItemHeight);
        view.setLayoutParams(eoVar);
    }
}
