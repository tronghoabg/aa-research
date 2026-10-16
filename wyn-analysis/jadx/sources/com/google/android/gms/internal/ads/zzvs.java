package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzvs extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzvp zzc;
    public final String zzd;

    public zzvs(zzv zzvVar, Throwable th, boolean z2, int i5) {
        String string = zzvVar.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 25 + string.length());
        sb2.append("Decoder init failed: [");
        sb2.append(i5);
        sb2.append("], ");
        sb2.append(string);
        String string2 = sb2.toString();
        String str = zzvVar.zzp;
        int iAbs = Math.abs(i5);
        this(string2, th, str, false, null, N0.a.d(iAbs, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", new StringBuilder(String.valueOf(iAbs).length() + 60)), null);
    }

    public final /* synthetic */ zzvs zza(zzvs zzvsVar) {
        return new zzvs(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzvsVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzvs(zzv zzvVar, Throwable th, boolean z2, zzvp zzvpVar) {
        String str = zzvpVar.zza;
        int length = str.length();
        String string = zzvVar.toString();
        this(AbstractC3256n.h(new StringBuilder(length + 23 + string.length()), "Decoder init failed: ", str, ", ", string), th, zzvVar.zzp, false, zzvpVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzvs(String str, Throwable th, String str2, boolean z2, zzvp zzvpVar, String str3, zzvs zzvsVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzvpVar;
        this.zzd = str3;
    }
}
