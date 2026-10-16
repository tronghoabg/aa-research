package com.waze.gas;

import android.os.Handler;
import androidx.core.os.BundleKt;
import com.waze.NativeManager;
import com.waze.ifs.a.f;
import h.g.b.x;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class GasNativeManager extends c {
    public static final String KEY_GAS_PRICE_UPDATE_SUCCEEDED = "succeeded";
    public static final String KEY_GAS_PRICE_UPDATE_TEXT = "text";
    public static final String KEY_GAS_PRICE_UPDATE_TITLE = "title";
    private final f handlers = new f();
    public static final a Companion = new a();
    public static final int $stable = 8;

    public final native void initNativeLayerNTV();

    public final void setUpdateHandler(int i2, Handler handler) {
        x.f(handler, "handler");
        this.handlers.b(i2, handler);
    }

    public final void unsetUpdateHandler(int i2, Handler handler) {
        x.f(handler, "handler");
        this.handlers.c(i2, handler);
    }

    public final void updatePricesDone$third_party_waze_client_android_project_waze_src_main_waze(String str, String str2, boolean z) {
        this.handlers.d(NativeManager.UH_GAS_PRICE_UPDATED, BundleKt.bundleOf(new k(KEY_GAS_PRICE_UPDATE_TITLE, str), new k("text", str2), new k(KEY_GAS_PRICE_UPDATE_SUCCEEDED, Boolean.valueOf(z))));
    }
}
