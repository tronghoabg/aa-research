package com.waze.gas;

import com.waze.NativeManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class c {
    public static final int $stable = 0;

    static final void updatePricesDoneJNI$lambda$0(c cVar, String str, String str2, boolean z) {
        x.d(cVar, "null cannot be cast to non-null type com.waze.gas.GasNativeManager");
        ((GasNativeManager) cVar).updatePricesDone$third_party_waze_client_android_project_waze_src_main_waze(str, str2, z);
    }

    protected final void updatePricesDoneJNI(String str, String str2, boolean z) {
        NativeManager.runMainThreadTask(new b(this, str, str2, z, 0));
    }
}
