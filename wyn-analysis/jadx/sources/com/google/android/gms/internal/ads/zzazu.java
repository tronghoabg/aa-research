package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
final class zzazu implements Runnable {
    private zzazu() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzazv.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzazv.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzazv.zzb;
        } catch (Throwable th) {
            zzazv.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzazu(byte[] bArr) {
    }
}
