package lc;

import android.hardware.camera2.params.SessionConfiguration;
import android.text.PrecomputedText;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import yc.C4582e;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ SessionConfiguration d(ArrayList arrayList, ExecutorService executorService, C4582e c4582e) {
        return new SessionConfiguration(0, arrayList, executorService, c4582e);
    }

    public static /* synthetic */ void i() {
    }

    public static /* bridge */ /* synthetic */ boolean m(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
