package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import Va.M6;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzhv {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzal.zzb("media3.datasource");
    }

    public /* synthetic */ zzhv(Uri uri, long j8, int i5, byte[] bArr, Map map, long j10, long j11, String str, int i10, Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j10, j11, null, i10, null);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        long j8 = this.zze;
        int length2 = String.valueOf(j8).length();
        long j10 = this.zzf;
        int length3 = String.valueOf(j10).length();
        int i5 = this.zzg;
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i5).length() + 1);
        N0.a.r(sb2, "DataSpec[GET ", string, ", ");
        sb2.append(j8);
        M6.A(sb2, ", ", j10, ", null, ");
        return AbstractC0279p0.j(i5, "]", sb2);
    }

    public final boolean zza(int i5) {
        return (this.zzg & i5) == i5;
    }

    public final zzhu zzb() {
        return new zzhu(this, null);
    }

    private zzhv(Uri uri, long j8, int i5, byte[] bArr, Map map, long j10, long j11, String str, int i10, Object obj) {
        boolean z2 = false;
        boolean z10 = j10 >= 0;
        zzgtr.zza(z10);
        zzgtr.zza(z10);
        if (j11 > 0) {
            z2 = true;
        } else if (j11 == -1) {
            j11 = -1;
            z2 = true;
        }
        zzgtr.zza(z2);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.zze = j10;
        this.zzf = j11;
        this.zzg = i10;
    }

    @Deprecated
    public zzhv(Uri uri, long j8, long j10, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j8, j10, null, 0, null);
    }
}
