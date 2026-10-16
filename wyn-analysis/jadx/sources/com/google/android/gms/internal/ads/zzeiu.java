package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzeiu implements zzfos {
    protected final Context zza;
    protected final String zzb;
    private final String zzc;

    public zzeiu(Context context, String str, zzcbs zzcbsVar, int i5, String str2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzeit zza(zzeis zzeisVar) throws zzeel {
        String str = zzeisVar.zza;
        int i5 = zzeisVar.zzb;
        Map map = zzeisVar.zzc;
        byte[] bArr = zzeisVar.zzd;
        String str2 = zzeisVar.zze;
        C6.n.f1857D.k.getClass();
        return zzc(str, i5, map, bArr, str2, SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x025a, code lost:
    
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r4.append("Received error HTTP response code: ");
        r4.append(r0);
        H6.l.f(r4.toString());
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r6.append("Received error HTTP response code: ");
        r6.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0295, code lost:
    
        throw new com.google.android.gms.internal.ads.zzeel(1, r6.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b9, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d4, code lost:
    
        r3.disconnect();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzeit zzc(java.lang.String r19, int r20, java.util.Map r21, byte[] r22, java.lang.String r23, long r24) throws java.net.ProtocolException, java.net.MalformedURLException, com.google.android.gms.internal.ads.zzeel {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeiu.zzc(java.lang.String, int, java.util.Map, byte[], java.lang.String, long):com.google.android.gms.internal.ads.zzeit");
    }
}
