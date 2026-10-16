package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzfvq implements zzfvt {
    private static final zzfvq zza = new zzfvq(new zzfvu());
    private Date zzb;
    private boolean zzc;
    private final zzfvu zzd;
    private boolean zze;

    private zzfvq(zzfvu zzfvuVar) {
        this.zzd = zzfvuVar;
    }

    public static zzfvq zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void zzc(Context context) {
        if (this.zzc) {
            return;
        }
        zzfvu zzfvuVar = this.zzd;
        zzfvuVar.zzd(context);
        zzfvuVar.zzg(this);
        zzfvuVar.zze();
        this.zze = zzfvuVar.zza;
        this.zzc = true;
    }

    @Override // com.google.android.gms.internal.ads.zzfvt
    public final void zzd(boolean z2) {
        if (!this.zze && z2) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    Iterator it = zzfvs.zza().zzf().iterator();
                    while (it.hasNext()) {
                        ((zzfuy) it.next()).zzg().zzn(zzb());
                    }
                }
            }
        }
        this.zze = z2;
    }
}
