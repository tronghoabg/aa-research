package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.text.TextUtils;
import java.util.regex.Pattern;
import p7.AbstractC3772b;

/* loaded from: classes3.dex */
public final class zzfqp {
    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) C0395s.f2489e.f2492c.zzd(zzbix.zzki), str);
    }

    public static void zzb(p8.p pVar, zzfqg zzfqgVar) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            zzhcf.zzr(zzhbx.zzw(pVar), new zzfql(zzfqgVar), zzcfy.zzh);
        }
    }

    public static zzfos zzc(final zzfqg zzfqgVar) {
        return new zzfos() { // from class: com.google.android.gms.internal.ads.zzfqo
            @Override // com.google.android.gms.internal.ads.zzfos
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
                    zzfqgVar.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(p8.p pVar, zzfqq zzfqqVar, zzfqg zzfqgVar) {
        zzh(pVar, zzfqqVar, zzfqgVar, false);
    }

    public static void zze(p8.p pVar, zzfqq zzfqqVar, zzfqg zzfqgVar) {
        zzh(pVar, zzfqqVar, zzfqgVar, true);
    }

    public static void zzf(p8.p pVar, zzfqq zzfqqVar, zzfqg zzfqgVar) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            zzhcf.zzr(zzhbx.zzw(pVar), new zzfqn(zzfqqVar, zzfqgVar), zzcfy.zzh);
        }
    }

    public static int zzg(zzflg zzflgVar) {
        int iB0 = AbstractC3772b.b0(zzflgVar) - 1;
        return (iB0 == 0 || iB0 == 1) ? 7 : 23;
    }

    private static void zzh(p8.p pVar, zzfqq zzfqqVar, zzfqg zzfqgVar, boolean z2) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            zzhcf.zzr(zzhbx.zzw(pVar), new zzfqm(zzfqqVar, zzfqgVar, z2), zzcfy.zzh);
        }
    }
}
