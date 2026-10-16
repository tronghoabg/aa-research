package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class zzhnf {
    public static final zzibk zza = zzibk.zza(new byte[0]);

    public static final zzibk zza(int i5) {
        return zzibk.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i5).array());
    }

    public static final zzibk zzb(int i5) {
        return zzibk.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i5).array());
    }
}
