package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final /* synthetic */ class zzffk implements Callable {
    static final /* synthetic */ zzffk zza = new zzffk();

    private /* synthetic */ zzffk() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap map = new HashMap();
        zzbio zzbioVar = zzbix.zzaC;
        C0395s c0395s = C0395s.f2489e;
        String str = (String) c0395s.f2492c.zzd(zzbioVar);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) c0395s.f2492c.zzd(zzbix.zzaD)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    map.put(str2, G6.J.a(str2));
                }
            }
        }
        return new zzffm(map);
    }
}
