package com.waze.ifs.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Filterable;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m extends p implements Filterable {
    @Override // com.waze.ifs.ui.u, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i2, view, viewGroup);
        view2.findViewById(R.id.omniSelectItemCheck).setVisibility(8);
        return view2;
    }
}
