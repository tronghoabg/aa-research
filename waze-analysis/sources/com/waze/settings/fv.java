package com.waze.settings;

import android.view.View;
import com.waze.R;
import com.waze.ix;
import com.waze.mywaze.MyWazeNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fv implements com.waze.settings.tree.c.b {
    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        return MyWazeNativeManager.getInstance().isInvisible();
    }

    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        MyWazeNativeManager myWazeNativeManager = MyWazeNativeManager.getInstance();
        h.g.b.x.e(myWazeNativeManager, "getInstance(...)");
        com.waze.mywaze.y.setInvisible$default(myWazeNativeManager, z, null, 2, null);
        ix.i(z, h.a.i.i(Integer.valueOf(R.string.MY_WAZE), Integer.valueOf(R.string.MY_WAZE_GO_INVISIBLE_SWITCH)));
    }

    @Override // com.waze.settings.tree.c.b
    public final /* synthetic */ boolean S(View view, boolean z) {
        return true;
    }
}
