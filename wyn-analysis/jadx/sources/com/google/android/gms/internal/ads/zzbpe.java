package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzbpe implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        if (zzclbVar.zzaz() != null) {
            zzclbVar.zzaz().zza();
        }
        F6.l lVarZzL = zzclbVar.zzL();
        if (lVarZzL != null) {
            lVarZzL.zzb();
            return;
        }
        F6.l lVarZzM = zzclbVar.zzM();
        if (lVarZzM != null) {
            lVarZzM.zzb();
        } else {
            int i5 = G6.L.f4523b;
            H6.l.f("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
