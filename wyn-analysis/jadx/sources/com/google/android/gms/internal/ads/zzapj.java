package com.google.android.gms.internal.ads;

import Va.M6;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzapj {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        M6.w(255, 255, 255, map, "white");
        M6.w(0, 255, 0, map, "lime");
        M6.w(0, 255, 255, map, "cyan");
        M6.w(255, 0, 0, map, "red");
        M6.w(255, 255, 0, map, "yellow");
        M6.w(255, 0, 255, map, "magenta");
        M6.w(0, 0, 255, map, "blue");
        M6.w(0, 0, 0, map, "black");
        zzc = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        M6.w(255, 255, 255, map2, "bg_white");
        M6.w(0, 255, 0, map2, "bg_lime");
        M6.w(0, 255, 255, map2, "bg_cyan");
        M6.w(255, 0, 0, map2, "bg_red");
        M6.w(255, 255, 0, map2, "bg_yellow");
        M6.w(255, 0, 255, map2, "bg_magenta");
        M6.w(0, 0, 255, map2, "bg_blue");
        M6.w(0, 0, 0, map2, "bg_black");
        zzd = DesugarCollections.unmodifiableMap(map2);
    }

    public static zzapd zza(zzeu zzeuVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strZzN = zzeuVar.zzN(charset);
        if (strZzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzeuVar, list);
            }
            String strZzN2 = zzeuVar.zzN(charset);
            if (strZzN2 != null) {
                Matcher matcher2 = pattern.matcher(strZzN2);
                if (matcher2.matches()) {
                    return zzd(strZzN.trim(), matcher2, zzeuVar, list);
                }
            }
        }
        return null;
    }

    public static zzcx zzb(String str) {
        zzapi zzapiVar = new zzapi();
        zze(str, zzapiVar);
        return zzapiVar.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString zzc(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapj.zzc(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    private static zzapd zzd(String str, Matcher matcher, zzeu zzeuVar, List list) {
        zzapi zzapiVar = new zzapi();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzapiVar.zza = zzapl.zza(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzapiVar.zzb = zzapl.zza(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zze(strGroup3, zzapiVar);
            StringBuilder sb2 = new StringBuilder();
            String strZzN = zzeuVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzN)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strZzN.trim());
                strZzN = zzeuVar.zzN(StandardCharsets.UTF_8);
            }
            zzapiVar.zzc = zzc(str, sb2.toString(), list);
            return new zzapd(zzapiVar.zza().zzr(), zzapiVar.zza, zzapiVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzeh.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zze(java.lang.String r17, com.google.android.gms.internal.ads.zzapi r18) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapj.zze(java.lang.String, com.google.android.gms.internal.ads.zzapi):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzf(java.lang.String r17, com.google.android.gms.internal.ads.zzapg r18, java.util.List r19, android.text.SpannableStringBuilder r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapj.zzf(java.lang.String, com.google.android.gms.internal.ads.zzapg, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    private static int zzg(List list, String str, zzapg zzapgVar) {
        List listZzh = zzh(list, str, zzapgVar);
        for (int i5 = 0; i5 < listZzh.size(); i5++) {
            zzapc zzapcVar = ((zzaph) listZzh.get(i5)).zzb;
            if (zzapcVar.zzx() != -1) {
                return zzapcVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, String str, zzapg zzapgVar) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzapc zzapcVar = (zzapc) list.get(i5);
            int iZze = zzapcVar.zze(str, zzapgVar.zza, zzapgVar.zzd, zzapgVar.zzc);
            if (iZze > 0) {
                arrayList.add(new zzaph(iZze, zzapcVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
