package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.v1;
import android.content.Context;
import p7.AbstractC3772b;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class u {
    public static zzfqg a(Context context, int i5) {
        boolean zBooleanValue;
        if (zzfqt.zza()) {
            int i10 = i5 - 2;
            if (i10 == 20 || i10 == 21) {
                zBooleanValue = ((Boolean) zzbkq.zze.zze()).booleanValue();
            } else if (i10 != 110) {
                switch (i10) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbkq.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbkq.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbkq.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkq)).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfqi(context, i5);
            }
        }
        return new zzfrj();
    }

    public static zzfqg b(Context context, int i5, int i10, v1 v1Var) {
        zzfqg zzfqgVarA = a(context, i5);
        if (zzfqgVarA instanceof zzfqi) {
            zzfqgVarA.zza();
            zzfqgVarA.zzp(i10);
            zzfqgVarA.zzf(AbstractC3772b.Z(v1Var.f2515m));
            String str = v1Var.f2518p;
            if (zzfqp.zza(str)) {
                zzfqgVarA.zze(str);
            }
        }
        return zzfqgVarA;
    }
}
