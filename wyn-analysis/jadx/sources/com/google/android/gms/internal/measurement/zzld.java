package com.google.android.gms.internal.measurement;

import A7.AbstractC0279p0;
import com.qonversion.android.sdk.internal.Constants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes4.dex */
final class zzld {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzlc zzlcVar, String str) throws SecurityException {
        StringBuilder sbQ = AbstractC0279p0.q("# ", str);
        zza(zzlcVar, sbQ, 0);
        return sbQ.toString();
    }

    private static void zza(int i5, StringBuilder sb2) {
        while (i5 > 0) {
            char[] cArr = zza;
            int length = i5 > cArr.length ? cArr.length : i5;
            sb2.append(cArr, 0, length);
            i5 -= length;
        }
    }

    public static void zza(StringBuilder sb2, int i5, String str, Object obj) throws SecurityException {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb2, i5, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb2, i5, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zza(i5, sb2);
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
            sb2.append(zzmg.zza(zzik.zza((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzik) {
            sb2.append(": \"");
            sb2.append(zzmg.zza((zzik) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzjt) {
            sb2.append(" {");
            zza((zzjt) obj, sb2, i5 + 2);
            sb2.append("\n");
            zza(i5, sb2);
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i11 = i5 + 2;
            zza(sb2, i11, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, entry.getKey());
            zza(sb2, i11, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, entry.getValue());
            sb2.append("\n");
            zza(i5, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.measurement.zzlc r21, java.lang.StringBuilder r22, int r23) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzld.zza(com.google.android.gms.internal.measurement.zzlc, java.lang.StringBuilder, int):void");
    }
}
