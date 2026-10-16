package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public abstract class zzh {
    public int zza(CharSequence charSequence, int i5) {
        int length = charSequence.length();
        zzy.zza(i5, length, "index");
        while (i5 < length) {
            if (zza(charSequence.charAt(i5))) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public abstract boolean zza(char c10);
}
