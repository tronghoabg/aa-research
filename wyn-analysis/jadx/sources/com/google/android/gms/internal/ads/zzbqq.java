package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbqq implements zzbpx {
    private final zzbqp zza;

    public zzbqq(zzbqp zzbqpVar) {
        this.zza = zzbqpVar;
    }

    public static void zzb(zzclb zzclbVar, zzbqp zzbqpVar) {
        zzclbVar.zzab("/reward", new zzbqq(zzbqpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) throws NumberFormatException {
        String str = (String) map.get(HandleInvocationsFromAdViewer.KEY_ACTION);
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        zzcci zzcciVar = null;
        try {
            int i5 = Integer.parseInt((String) map.get(AppLovinEventParameters.REVENUE_AMOUNT));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcciVar = new zzcci(str2, i5);
            }
        } catch (NumberFormatException e7) {
            int i10 = G6.L.f4523b;
            H6.l.g("Unable to parse reward amount.", e7);
        }
        this.zza.zzb(zzcciVar);
    }
}
