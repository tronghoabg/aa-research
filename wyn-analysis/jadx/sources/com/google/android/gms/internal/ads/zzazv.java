package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzazv {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static void zza() {
        synchronized (zzf) {
            try {
                if (!zza) {
                    zza = true;
                    new Thread(new zzazu(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String zzb(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        zzazl zzazlVarZzc = zzc(bArr, str);
        return zzazp.zza(zzazlVarZzc == null ? zzh(zzg(4096).zzaN(), str, true) : ((zzazm) zzazlVarZzc.zzbu()).zzaN(), true);
    }

    public static zzazl zzc(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector vectorZzd = zzd(bArr, 255);
        if (vectorZzd == null || vectorZzd.isEmpty()) {
            return null;
        }
        zzazl zzazlVarZza = zzazm.zza();
        int size = vectorZzd.size();
        for (int i5 = 0; i5 < size; i5++) {
            zzazlVarZza.zza(zzidl.zzt(zzh((byte[]) vectorZzd.get(i5), str, false), 0, 256));
        }
        byte[] bArrZze = zze(bArr);
        zzidl zzidlVar = zzidl.zza;
        zzazlVarZza.zzb(zzidl.zzt(bArrZze, 0, bArrZze.length));
        return zzazlVarZza;
    }

    public static Vector zzd(byte[] bArr, int i5) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i10 = length + 254;
        Vector vector = new Vector();
        for (int i11 = 0; i11 < i10 / 255; i11++) {
            int i12 = i11 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i12 > 255) {
                    length2 = i12 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i12, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static byte[] zze(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (zze) {
            try {
                zza();
                MessageDigest messageDigest2 = null;
                try {
                    if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = zzd.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    public static zzayt zzg(int i5) {
        zzaxt zzaxtVarZzj = zzayt.zzj();
        zzaxtVarZzj.zzl(4096L);
        return (zzayt) zzaxtVarZzj.zzbu();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z2) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArrArray;
        int length = bArr.length;
        int i5 = true != z2 ? 255 : 239;
        if (length > i5) {
            bArr = zzg(4096).zzaN();
        }
        int i10 = i5 + 1;
        int length2 = bArr.length;
        byte b5 = (byte) length2;
        if (length2 < i5) {
            byte[] bArr2 = new byte[i5 - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i10).put(b5).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i10).put(b5).put(bArr).array();
        }
        if (z2) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzazw[] zzazwVarArr = new zzbaj().zzcK;
        int length3 = zzazwVarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            zzazwVarArr[i11].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzazn(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
