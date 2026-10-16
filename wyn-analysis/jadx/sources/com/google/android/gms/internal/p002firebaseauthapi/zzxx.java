package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjp;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* loaded from: classes.dex */
public final class zzxx implements zzbo {
    private final ECPrivateKey zza;
    private final zzxz zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzyd zze;
    private final zzkw zzf;
    private final byte[] zzg;

    private zzxx(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzyd zzydVar, zzkw zzkwVar, byte[] bArr2) {
        this.zza = eCPrivateKey;
        this.zzb = new zzxz(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzydVar;
        this.zzf = zzkwVar;
        this.zzg = bArr2;
    }

    public static zzbo zza(zzjs zzjsVar) throws GeneralSecurityException {
        ECPrivateKey eCPrivateKeyZza = zzyb.zza((zzya) zzxw.zza.zza((zzmm<zzya, zzjp.zzc>) zzjsVar.zzc().zzd()), zzmj.zza(zzjsVar.zze().zza(zzbq.zza())));
        byte[] bArrZzb = new byte[0];
        if (zzjsVar.zzc().zzh() != null) {
            bArrZzb = zzjsVar.zzc().zzh().zzb();
        }
        return new zzxx(eCPrivateKeyZza, bArrZzb, zzxw.zza(zzjsVar.zzc().zze()), (zzyd) zzxw.zzb.zza((zzmm<zzyd, zzjp.zze>) zzjsVar.zzc().zzf()), zzks.zza(zzjsVar.zzc()), zzjsVar.zzg().zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] zza(byte[] r11, byte[] r12) throws java.lang.IllegalStateException, java.security.GeneralSecurityException {
        /*
            r10 = this;
            byte[] r0 = r10.zzg
            boolean r0 = com.google.android.gms.internal.p002firebaseauthapi.zzpr.zza(r0, r11)
            if (r0 == 0) goto L5f
            byte[] r0 = r10.zzg
            int r0 = r0.length
            java.security.interfaces.ECPrivateKey r1 = r10.zza
            java.security.spec.ECParameterSpec r1 = r1.getParams()
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            com.google.android.gms.internal.firebase-auth-api.zzyd r2 = r10.zze
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyb.zza(r1)
            int r2 = r2.ordinal()
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            int r1 = r1 * r3
            goto L35
        L29:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "unknown EC point format"
            r11.<init>(r12)
            throw r11
        L31:
            int r1 = r1 + r4
            goto L35
        L33:
            int r1 = r1 * r3
            goto L31
        L35:
            int r2 = r11.length
            int r1 = r1 + r0
            if (r2 < r1) goto L57
            byte[] r4 = java.util.Arrays.copyOfRange(r11, r0, r1)
            com.google.android.gms.internal.firebase-auth-api.zzxz r3 = r10.zzb
            java.lang.String r5 = r10.zzc
            byte[] r6 = r10.zzd
            com.google.android.gms.internal.firebase-auth-api.zzkw r0 = r10.zzf
            int r8 = r0.zza()
            com.google.android.gms.internal.firebase-auth-api.zzyd r9 = r10.zze
            r7 = r12
            byte[] r12 = r3.zza(r4, r5, r6, r7, r8, r9)
            com.google.android.gms.internal.firebase-auth-api.zzkw r0 = r10.zzf
            byte[] r11 = r0.zza(r12, r11, r1)
            return r11
        L57:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "ciphertext too short"
            r11.<init>(r12)
            throw r11
        L5f:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "Invalid ciphertext (output prefix mismatch)"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzxx.zza(byte[], byte[]):byte[]");
    }
}
