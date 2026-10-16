package com.google.android.gms.internal.consent_sdk;

import A7.AbstractC0279p0;
import com.qonversion.android.sdk.internal.Constants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes.dex */
final class zzrs {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzrq zzrqVar, String str) throws SecurityException {
        StringBuilder sbQ = AbstractC0279p0.q("# ", str);
        zzd(zzrqVar, sbQ, 0);
        return sbQ.toString();
    }

    public static void zzb(StringBuilder sb2, int i5, String str, Object obj) throws SecurityException {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i5, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i5, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zzc(i5, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append(Constants.USER_ID_SEPARATOR);
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            zzpm zzpmVar = zzpm.zzb;
            sb2.append(zzsk.zza(new zzpk(((String) obj).getBytes(zzqs.zza))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzpm) {
            sb2.append(": \"");
            sb2.append(zzsk.zza((zzpm) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzqm) {
            sb2.append(" {");
            zzd((zzqm) obj, sb2, i5 + 2);
            sb2.append("\n");
            zzc(i5, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i11 = i5 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb2, i11, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, entry.getKey());
        zzb(sb2, i11, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, entry.getValue());
        sb2.append("\n");
        zzc(i5, sb2);
        sb2.append("}");
    }

    private static void zzc(int i5, StringBuilder sb2) {
        while (i5 > 0) {
            int i10 = 80;
            if (i5 <= 80) {
                i10 = i5;
            }
            sb2.append(zza, 0, i10);
            i5 -= i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzd(com.google.android.gms.internal.consent_sdk.zzrq r18, java.lang.StringBuilder r19, int r20) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrs.zzd(com.google.android.gms.internal.consent_sdk.zzrq, java.lang.StringBuilder, int):void");
    }
}
