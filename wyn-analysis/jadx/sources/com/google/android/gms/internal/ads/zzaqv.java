package com.google.android.gms.internal.ads;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
final class zzaqv extends zzafm {
    public zzaqv(zzfj zzfjVar, long j8, long j10) {
        super(new zzafh(), new zzaqu(zzfjVar, null), j8, 0L, j8 + 1, 0L, j10, 188L, 1000);
    }

    public static /* synthetic */ int zzh(byte[] bArr, int i5) {
        return (bArr[i5 + 3] & ForkServer.ERROR) | ((bArr[i5] & ForkServer.ERROR) << 24) | ((bArr[i5 + 1] & ForkServer.ERROR) << 16) | ((bArr[i5 + 2] & ForkServer.ERROR) << 8);
    }
}
