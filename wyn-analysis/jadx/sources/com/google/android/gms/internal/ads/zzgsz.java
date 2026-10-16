package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgsz {
    public static String zza(String str) {
        int length = str.length();
        int i5 = 0;
        while (i5 < length) {
            if (zzd(str.charAt(i5))) {
                char[] charArray = str.toCharArray();
                while (i5 < length) {
                    char c10 = charArray[i5];
                    if (zzd(c10)) {
                        charArray[i5] = (char) (c10 ^ ' ');
                    }
                    i5++;
                }
                return String.valueOf(charArray);
            }
            i5++;
        }
        return str;
    }

    public static String zzb(String str) {
        int length = str.length();
        int i5 = 0;
        while (i5 < length) {
            if (zzc(str.charAt(i5))) {
                char[] charArray = str.toCharArray();
                while (i5 < length) {
                    char c10 = charArray[i5];
                    if (zzc(c10)) {
                        charArray[i5] = (char) (c10 ^ ' ');
                    }
                    i5++;
                }
                return String.valueOf(charArray);
            }
            i5++;
        }
        return str;
    }

    public static boolean zzc(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    public static boolean zzd(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static boolean zze(CharSequence charSequence, CharSequence charSequence2) {
        int iZzf;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = charSequence.charAt(i5);
            char cCharAt2 = charSequence2.charAt(i5);
            if (cCharAt != cCharAt2 && ((iZzf = zzf(cCharAt)) >= 26 || iZzf != zzf(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int zzf(char c10) {
        return (char) ((c10 | ' ') - 97);
    }
}
