package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final /* synthetic */ class zzfak implements Callable {
    static final /* synthetic */ zzfak zza = new zzfak();

    private /* synthetic */ zzfak() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        C6.n nVar = C6.n.f1857D;
        bundle.putInt("web_view_count", nVar.f1868h.zzm());
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzqa)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoZzx = nVar.f1868h.zzx();
            if (memoryInfoZzx != null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    bundle.putLong("a_ad_mem", memoryInfoZzx.advertisedMem);
                }
                bundle.putLong("a_total", memoryInfoZzx.totalMem);
                bundle.putLong("a_avai", memoryInfoZzx.availMem);
                bundle.putLong("a_threshold", memoryInfoZzx.threshold);
                bundle.putBoolean("a_is_low_mem", memoryInfoZzx.lowMemory);
            }
            bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
        }
        return new zzfam(bundle);
    }
}
