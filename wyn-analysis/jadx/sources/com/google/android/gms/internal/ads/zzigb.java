package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import com.qonversion.android.sdk.internal.Constants;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes3.dex */
final class zzigb {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzifz zzifzVar, String str) throws SecurityException {
        StringBuilder sbQ = AbstractC0279p0.q("# ", str);
        zzc(zzifzVar, sbQ, 0);
        return sbQ.toString();
    }

    public static void zzb(StringBuilder sb2, int i5, String str, Object obj) throws SecurityException {
        String strReplace;
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
        zzd(i5, sb2);
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
        if (!(obj instanceof String)) {
            if (obj instanceof zzidl) {
                sb2.append(": \"");
                sb2.append(zzigz.zza(((zzidl) obj).zzA()));
                sb2.append('\"');
                return;
            }
            if (obj instanceof zziep) {
                sb2.append(" {");
                zzc((zziep) obj, sb2, i5 + 2);
                sb2.append("\n");
                zzd(i5, sb2);
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
            zzd(i5, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": \"");
        String strReplace2 = (String) obj;
        boolean z2 = false;
        boolean z10 = false;
        boolean z11 = false;
        for (int i12 = 0; i12 < strReplace2.length(); i12++) {
            char cCharAt2 = strReplace2.charAt(i12);
            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                strReplace = zzigz.zza(strReplace2.getBytes(StandardCharsets.UTF_8));
                break;
            }
            if (cCharAt2 == '\"') {
                z11 = true;
            } else if (cCharAt2 == '\'') {
                z10 = true;
            } else if (cCharAt2 == '\\') {
                z2 = true;
            }
        }
        if (z2) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z10 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z11) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb2.append(strReplace);
        sb2.append('\"');
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzc(com.google.android.gms.internal.ads.zzifz r18, java.lang.StringBuilder r19, int r20) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzigb.zzc(com.google.android.gms.internal.ads.zzifz, java.lang.StringBuilder, int):void");
    }

    private static void zzd(int i5, StringBuilder sb2) {
        while (i5 > 0) {
            int i10 = 80;
            if (i5 <= 80) {
                i10 = i5;
            }
            sb2.append(zza, 0, i10);
            i5 -= i10;
        }
    }
}
