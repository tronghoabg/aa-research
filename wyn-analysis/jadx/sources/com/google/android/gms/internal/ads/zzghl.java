package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzghl {
    private MessageDigest zza;
    private final zzgqo zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzghl(zzgqo zzgqoVar) {
        this.zzb = zzgqoVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new SecureRandom());
    }

    public final synchronized void zzb(SecureRandom secureRandom) {
        zzgqm zzgqmVarZza = this.zzb.zza(Sdk.SDKError.Reason.AD_CONSUMED_VALUE);
        try {
            try {
                try {
                    zzgqmVarZza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (Throwable th) {
                    zzgqmVarZza.zzb(th);
                    throw th;
                }
            } catch (NoSuchAlgorithmException e7) {
                zzgqmVarZza.zzb(e7);
            }
            zzgqmVarZza.zzc();
        } catch (Throwable th2) {
            zzgqmVarZza.zzc();
            throw th2;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    public final byte[] zzd(byte[] bArr, String str, boolean z2) {
        int length = bArr.length;
        int i5 = true != z2 ? 255 : 239;
        zzgtr.zza(length <= i5);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i5 + 1).put((byte) length);
        if (length < i5) {
            int i10 = i5 - length;
            byte[] bArr2 = new byte[i10];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i10);
            System.arraycopy(bArr2, 0, bArr, length, i10);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z2) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzgho[] zzghoVarArr = new zzgib().zzcK;
        int length2 = zzghoVarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            zzghoVarArr[i11].zza(bArrArray, bArr3);
        }
        if (!zzgui.zzc(str)) {
            new zzghn(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            bArrDigest = this.zza.digest();
        }
        return bArrDigest;
    }

    public final zzazl zzf(byte[] bArr, String str) {
        zzazl zzazlVarZza = zzazm.zza();
        byte[] bArrZze = zze(bArr);
        zzidl zzidlVar = zzidl.zza;
        zzazlVarZza.zzb(zzidl.zzt(bArrZze, 0, bArrZze.length));
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (true) {
            int length = bArr.length;
            if (i5 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i10 = i5 * 255;
            int i11 = i10 + 255;
            if (length > i11) {
                length = i11;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i10, length));
            i5++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzazlVarZza.zza(zzidl.zzt(zzd((byte[]) it.next(), str, false), 0, 256));
        }
        return zzazlVarZza;
    }

    public final String zzg(int i5, String str) {
        zzaxt zzaxtVarZzj = zzayt.zzj();
        zzaxtVarZzj.zzl(i5);
        return Base64.encodeToString(zzd(((zzayt) zzaxtVarZzj.zzbu()).zzaN(), str, true), 11);
    }
}
