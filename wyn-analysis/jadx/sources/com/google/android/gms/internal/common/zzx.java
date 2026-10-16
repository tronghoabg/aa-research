package com.google.android.gms.internal.common;

import Va.M6;
import java.util.logging.Level;
import java.util.logging.Logger;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzx {
    public static String zza(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i5 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length || (iIndexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, iIndexOf);
            sb2.append(zzb(objArr[i5]));
            i10 = iIndexOf + 2;
            i5++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i5 < length) {
            String str2 = " [";
            while (i5 < objArr.length) {
                sb2.append(str2);
                sb2.append(zzb(objArr[i5]));
                i5++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    private static String zzb(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e7) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strT = M6.t(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strT), (Throwable) e7);
            String name2 = e7.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strT.length() + 8 + name2.length() + 1);
            AbstractC3256n.p(sb2, "<", strT, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }
}
