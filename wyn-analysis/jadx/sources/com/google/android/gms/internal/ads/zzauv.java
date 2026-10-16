package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzauv {
    public static long zza(ByteBuffer byteBuffer) {
        long j8 = byteBuffer.getInt();
        return j8 < 0 ? j8 + 4294967296L : j8;
    }

    public static int zzb(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static int zzc(byte b5) {
        return b5 < 0 ? b5 + ForkServer.DONE : b5;
    }

    public static long zzd(ByteBuffer byteBuffer) {
        long jZza = zza(byteBuffer) << 32;
        if (jZza >= 0) {
            return zza(byteBuffer) + jZza;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double zze(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & ForkServer.ERROR)) / 65536.0d;
    }

    public static double zzf(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & ForkServer.ERROR)) / 1.073741824E9d;
    }
}
