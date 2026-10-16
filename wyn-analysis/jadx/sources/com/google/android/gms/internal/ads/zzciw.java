package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzciw implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) throws NumberFormatException {
        zzchu zzchuVar = (zzchu) obj;
        zzcmh zzcmhVarZzh = zzchuVar.zzh();
        if (zzcmhVarZzh == null) {
            try {
                zzcmh zzcmhVar = new zzcmh(zzchuVar, Float.parseFloat((String) map.get("duration")), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("customControlsAllowed")), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("clickToExpandAllowed")));
                zzchuVar.zzw(zzcmhVar);
                zzcmhVarZzh = zzcmhVar;
            } catch (NullPointerException e7) {
                e = e7;
                Throwable th = e;
                int i5 = G6.L.f4523b;
                H6.l.d("Unable to parse videoMeta message.", th);
                C6.n.f1857D.f1868h.zzh(th, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e10) {
                e = e10;
                Throwable th2 = e;
                int i52 = G6.L.f4523b;
                H6.l.d("Unable to parse videoMeta message.", th2);
                C6.n.f1857D.f1868h.zzh(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f10 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("muted"));
        float f11 = Float.parseFloat((String) map.get("currentTime"));
        int i10 = Integer.parseInt((String) map.get("playbackState"));
        if (i10 < 0 || i10 > 3) {
            i10 = 0;
        }
        String str = (String) map.get("aspectRatio");
        float f12 = TextUtils.isEmpty(str) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : Float.parseFloat(str);
        if (H6.l.j(3)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(f11).length() + 45 + String.valueOf(f10).length() + 13 + String.valueOf(zEquals).length() + 19 + String.valueOf(i10).length() + 17 + String.valueOf(str).length());
            sb2.append("Video Meta GMSG: currentTime : ");
            sb2.append(f11);
            sb2.append(" , duration : ");
            sb2.append(f10);
            sb2.append(" , isMuted : ");
            sb2.append(zEquals);
            sb2.append(" , playbackState : ");
            sb2.append(i10);
            sb2.append(" , aspectRatio : ");
            sb2.append(str);
            H6.l.a(sb2.toString());
        }
        zzcmhVarZzh.zzs(f11, f10, i10, zEquals, f12);
    }
}
