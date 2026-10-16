package com.google.android.gms.internal.ads;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzaui {
    public static zzasu zza(zzath zzathVar) throws NumberFormatException {
        long j8;
        boolean z2;
        long j10;
        long j11;
        long j12;
        long jZzb;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzathVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZzb2 = str != null ? zzb(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i5 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z2 = false;
            j10 = 0;
            j11 = 0;
            while (i5 < strArrSplit.length) {
                String strTrim = strArrSplit[i5].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j10 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z2 = true;
                }
                i5++;
            }
            j8 = 0;
            i5 = 1;
        } else {
            j8 = 0;
            z2 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZzb3 = str3 != null ? zzb(str3) : j8;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j12 = jCurrentTimeMillis;
            jZzb = zzb(str4);
        } else {
            j12 = jCurrentTimeMillis;
            jZzb = j8;
        }
        String str5 = (String) map.get("ETag");
        if (i5 != 0) {
            long j15 = (j11 * 1000) + j12;
            if (z2) {
                j14 = j15;
            } else {
                Long.signum(j10);
                j14 = (j10 * 1000) + j15;
            }
            j13 = j15;
        } else {
            j13 = (jZzb2 <= j8 || jZzb3 < jZzb2) ? j8 : (jZzb3 - jZzb2) + j12;
            j14 = j13;
        }
        zzasu zzasuVar = new zzasu();
        zzasuVar.zza = zzathVar.zzb;
        zzasuVar.zzb = str5;
        zzasuVar.zzf = j13;
        zzasuVar.zze = j14;
        zzasuVar.zzc = jZzb2;
        zzasuVar.zzd = jZzb;
        zzasuVar.zzg = map;
        zzasuVar.zzh = zzathVar.zzd;
        return zzasuVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e7) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzatx.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzatx.zzd(e7, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static String zzc(long j8) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j8));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
