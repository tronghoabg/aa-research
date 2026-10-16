package com.waze;

import android.view.View;
import com.waze.settings.tree.views.WazeSettingsView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ld implements View.OnClickListener {
    ld(SimpleListMenuActivity simpleListMenuActivity) {
        Objects.requireNonNull(simpleListMenuActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NativeManager.Post(new hn(this, (String) ((WazeSettingsView) view).getTag(), 9));
    }
}
