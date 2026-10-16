package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzicj implements CharSequence {
    private char[] zza;
    private String zzb;

    private zzicj() {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i5) {
        return this.zza[i5];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.zza.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i5, int i10) {
        return new String(this.zza, i5, i10 - i5);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.zzb == null) {
            this.zzb = new String(this.zza);
        }
        return this.zzb;
    }

    public final void zza(char[] cArr) {
        this.zza = cArr;
        this.zzb = null;
    }

    public /* synthetic */ zzicj(byte[] bArr) {
    }
}
