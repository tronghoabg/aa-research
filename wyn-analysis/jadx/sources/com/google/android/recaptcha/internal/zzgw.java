package com.google.android.recaptcha.internal;

import android.os.Build;
import ef.C2527k;
import ff.AbstractC2640A;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzgw {
    @NotNull
    public static final Map zza() {
        LinkedHashMap linkedHashMapS = AbstractC2640A.S(new C2527k(-4, zzbg.zzo), new C2527k(-12, zzbg.zzp), new C2527k(-6, zzbg.zzk), new C2527k(-11, zzbg.zzm), new C2527k(-13, zzbg.zzq), new C2527k(-14, zzbg.zzr), new C2527k(-2, zzbg.zzl), new C2527k(-7, zzbg.zzs), new C2527k(-5, zzbg.zzt), new C2527k(-9, zzbg.zzu), new C2527k(-8, zzbg.zzE), new C2527k(-15, zzbg.zzn), new C2527k(-1, zzbg.zzv), new C2527k(-3, zzbg.zzx), new C2527k(-10, zzbg.zzy));
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            linkedHashMapS.put(-16, zzbg.zzw);
        }
        if (i5 >= 27) {
            linkedHashMapS.put(1, zzbg.zzA);
            linkedHashMapS.put(2, zzbg.zzB);
            linkedHashMapS.put(0, zzbg.zzC);
            linkedHashMapS.put(3, zzbg.zzD);
        }
        if (i5 >= 29) {
            linkedHashMapS.put(4, zzbg.zzz);
        }
        return linkedHashMapS;
    }
}
