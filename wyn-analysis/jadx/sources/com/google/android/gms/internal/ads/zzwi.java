package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzwi {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzvp zza() throws zzwa {
        List listZzb = zzb("audio/raw", false, false);
        if (listZzb.isEmpty()) {
            return null;
        }
        return (zzvp) listZzb.get(0);
    }

    public static synchronized List zzb(String str, boolean z2, boolean z10) throws zzwa {
        try {
            zzvz zzvzVar = new zzvz(str, z2, z10);
            HashMap map = zzb;
            List list = (List) map.get(zzvzVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListZzh = zzh(zzvzVar, new zzwd(z2, z10, str.equals("video/mv-hevc")));
            if (z2 && arrayListZzh.isEmpty() && Build.VERSION.SDK_INT == 23) {
                arrayListZzh = zzh(zzvzVar, new zzwc(null));
                if (!arrayListZzh.isEmpty()) {
                    String str2 = ((zzvp) arrayListZzh.get(0)).zza;
                    StringBuilder sb2 = new StringBuilder(str.length() + 63 + str2.length());
                    sb2.append("MediaCodecList API didn't list secure decoder for: ");
                    sb2.append(str);
                    sb2.append(". Assuming: ");
                    sb2.append(str2);
                    zzeh.zzc("MediaCodecUtil", sb2.toString());
                }
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListZzh.size() == 1 && ((zzvp) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListZzh.add(zzvp.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzj(arrayListZzh, zzwe.zza);
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzvp) arrayListZzh.get(0)).zza)) {
                arrayListZzh.add((zzvp) arrayListZzh.remove(0));
            }
            zzgwt zzgwtVarZzq = zzgwt.zzq(arrayListZzh);
            map.put(zzvzVar, zzgwtVarZzq);
            return zzgwtVarZzq;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static List zzc(zzvy zzvyVar, zzv zzvVar, boolean z2, boolean z10) throws zzwa {
        List listZza = zzvyVar.zza(zzvVar.zzp, z2, z10);
        List listZzd = zzd(zzvyVar, zzvVar, z2, z10);
        int i5 = zzgwt.zzd;
        zzgwq zzgwqVar = new zzgwq();
        zzgwqVar.zzh(listZza);
        zzgwqVar.zzh(listZzd);
        return zzgwqVar.zzi();
    }

    public static List zzd(zzvy zzvyVar, zzv zzvVar, boolean z2, boolean z10) throws zzwa {
        String strZzg = zzg(zzvVar);
        return strZzg == null ? zzgwt.zzi() : zzvyVar.zza(strZzg, z2, z10);
    }

    public static List zze(final Context context, List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzwh() { // from class: com.google.android.gms.internal.ads.zzwg
            @Override // com.google.android.gms.internal.ads.zzwh
            public final /* synthetic */ int zza(Object obj) {
                int i5 = zzwi.zza;
                return ((zzvp) obj).zzd(context, zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i5, int i10) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i5;
        codecProfileLevel.level = i10;
        return codecProfileLevel;
    }

    public static String zzg(zzv zzvVar) {
        zzdq zzdqVarZzf;
        String str = zzvVar.zzp;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return "audio/vnd.dts";
        }
        if ("video/dolby-vision".equals(str) && (zzdqVarZzf = zzdr.zzf(zzvVar)) != null && zzdqVarZzf.zzc()) {
            int iZza = zzdqVarZzf.zza();
            if (iZza == 16 || iZza == 256) {
                return MimeTypes.VIDEO_H265;
            }
            if (iZza == 512) {
                return MimeTypes.VIDEO_H264;
            }
            if (iZza == 1024) {
                zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zziVar.zzd == 6 && zziVar.zzc == 1) {
                    return null;
                }
                return MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return MimeTypes.VIDEO_H265;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ca A[Catch: Exception -> 0x01c2, TryCatch #4 {Exception -> 0x01c2, blocks: (B:116:0x01bb, B:124:0x01d6, B:126:0x01e0, B:127:0x01e5, B:129:0x01f5, B:131:0x01fd, B:120:0x01ca), top: B:176:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e0 A[Catch: Exception -> 0x01c2, TryCatch #4 {Exception -> 0x01c2, blocks: (B:116:0x01bb, B:124:0x01d6, B:126:0x01e0, B:127:0x01e5, B:129:0x01f5, B:131:0x01fd, B:120:0x01ca), top: B:176:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e5 A[Catch: Exception -> 0x01c2, TryCatch #4 {Exception -> 0x01c2, blocks: (B:116:0x01bb, B:124:0x01d6, B:126:0x01e0, B:127:0x01e5, B:129:0x01f5, B:131:0x01fd, B:120:0x01ca), top: B:176:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0277 A[Catch: Exception -> 0x0041, TRY_ENTER, TryCatch #5 {Exception -> 0x0041, blocks: (B:3:0x0012, B:5:0x0027, B:7:0x0031, B:13:0x0044, B:17:0x0052, B:23:0x0067, B:25:0x0071, B:53:0x00dd, B:55:0x00e5, B:57:0x00ed, B:59:0x00f6, B:156:0x026f, B:159:0x0277, B:161:0x027d, B:162:0x029e, B:163:0x02cc, B:62:0x0103, B:63:0x0106, B:65:0x010e, B:68:0x0119, B:70:0x0121, B:75:0x012f, B:77:0x0137, B:79:0x013f, B:82:0x014a, B:84:0x0152, B:87:0x015d, B:89:0x0165, B:92:0x0170, B:94:0x0178, B:29:0x007d, B:31:0x0089, B:33:0x0093, B:35:0x009b, B:37:0x00a3, B:39:0x00ab, B:41:0x00b3, B:43:0x00bb, B:45:0x00c3), top: B:178:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x029e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc A[PHI: r18
  0x00cc: PHI (r18v0 int) = 
  (r18v1 int)
  (r18v1 int)
  (r18v1 int)
  (r18v1 int)
  (r18v1 int)
  (r18v1 int)
  (r18v5 int)
  (r18v5 int)
  (r18v5 int)
  (r18v5 int)
  (r18v5 int)
  (r18v5 int)
  (r18v5 int)
  (r18v5 int)
 binds: [B:98:0x0184, B:106:0x019d, B:111:0x01af, B:109:0x01ab, B:103:0x0198, B:56:0x00eb, B:32:0x0091, B:34:0x0099, B:36:0x00a1, B:38:0x00a9, B:40:0x00b1, B:42:0x00b9, B:44:0x00c1, B:46:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzvz r27, com.google.android.gms.internal.ads.zzwb r28) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwi.zzh(com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzwb):java.util.ArrayList");
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.zza(str)) {
            return true;
        }
        String strZza = zzgsz.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zzwh zzwhVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwf
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i5 = zzwi.zza;
                zzwh zzwhVar2 = zzwhVar;
                return zzwhVar2.zza(obj2) - zzwhVar2.zza(obj);
            }
        });
    }
}
