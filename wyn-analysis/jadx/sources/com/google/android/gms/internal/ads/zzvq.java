package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import c5.AbstractC1558a;
import com.unity3d.services.core.device.MimeTypes;
import java.util.List;

/* loaded from: classes3.dex */
final class zzvq {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i5, int i10, double d3) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            int iZzc = zzc(supportedPerformancePoints, d2.n.d(i5, i10, (int) d3));
            boolean z2 = true;
            if (iZzc == 1 && zzvr.zza == null) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 37) {
                    int iZzb = zzb(true);
                    if (i11 < 35 ? !(zzb(false) != 2 || iZzb == 1) : iZzb != 1) {
                    }
                    zzvr.zza = Boolean.valueOf(z2);
                    if (!zzvr.zza.booleanValue()) {
                    }
                }
                z2 = false;
                zzvr.zza = Boolean.valueOf(z2);
                if (!zzvr.zza.booleanValue()) {
                }
            }
            return iZzc;
        }
        return 0;
    }

    private static int zzb(boolean z2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzo(MimeTypes.VIDEO_H264);
            zzv zzvVarZzP = zztVar.zzP();
            if (zzvVarZzP.zzp != null) {
                List listZzc = zzwi.zzc(zzvy.zzb, zzvVarZzP, z2, false);
                for (int i5 = 0; i5 < listZzc.size(); i5++) {
                    if (((zzvp) listZzc.get(i5)).zzd != null && (videoCapabilities = ((zzvp) listZzc.get(i5)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        d2.n.e();
                        return zzc(supportedPerformancePoints, d2.n.c());
                    }
                }
            }
        } catch (zzwa unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (AbstractC1558a.g(list.get(i5)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
