package com.google.android.gms.internal.measurement;

import A7.I0;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdy;
import q7.BinderC3877b;
import r7.C3934d;

/* loaded from: classes4.dex */
final class zzdx extends zzdy.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzdy zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzdy zzdyVar, String str, String str2, Context context, Bundle bundle) {
        super(zzdyVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
        this.zzg = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() {
        String str;
        String str2;
        String str3;
        try {
            if (this.zzg.zzc(this.zzc, this.zzd)) {
                str3 = this.zzd;
                str2 = this.zzc;
                str = this.zzg.zzc;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            AbstractC1732v.i(this.zze);
            zzdy zzdyVar = this.zzg;
            zzdyVar.zzj = zzdyVar.zza(this.zze, true);
            if (this.zzg.zzj == null) {
                Log.w(this.zzg.zzc, "Failed to connect to measurement client.");
                return;
            }
            int iA = C3934d.a(this.zze, ModuleDescriptor.MODULE_ID);
            zzdw zzdwVar = new zzdw(106000L, Math.max(iA, r0), C3934d.d(this.zze, ModuleDescriptor.MODULE_ID, false) < iA, str, str2, str3, this.zzf, I0.b(this.zze));
            zzdj zzdjVar = this.zzg.zzj;
            AbstractC1732v.i(zzdjVar);
            zzdjVar.initialize(new BinderC3877b(this.zze), zzdwVar, this.zza);
        } catch (Exception e7) {
            this.zzg.zza(e7, true, false);
        }
    }
}
