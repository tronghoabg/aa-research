package com.google.android.libraries.phenotype.client;

import android.app.ActivityManager;
import android.util.Log;
import com.google.d.b.aj;
import com.google.d.m.a.cf;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements aj {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f5991a;

    public /* synthetic */ d(int i2) {
        this.f5991a = i2;
    }

    @Override // com.google.d.b.aj
    public final Object get() {
        int i2 = this.f5991a;
        if (i2 == 0) {
            int i3 = h.f6000a;
            return cf.x(Executors.newSingleThreadScheduledExecutor(new com.waze.network.b.a(1)));
        }
        if (i2 == 1) {
            int i4 = com.google.android.gms.common.util.c.f5148a;
            return Pattern.compile("\\((?:eng-)?(\\d+)-(.+?)[-)$]");
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            Log.i("PhenotypeProcessReaper", "Memory state is: " + runningAppProcessInfo.importance);
        } catch (RuntimeException e2) {
            Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e2);
        }
        boolean z = runningAppProcessInfo.importance >= 400;
        return Boolean.valueOf(z);
    }
}
