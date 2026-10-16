package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzog {
    public static final zzzc zza = zzzc.zza(new byte[0]);

    public static final zzzc zza(int i5) {
        return zzzc.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i5).array());
    }

    public static final zzzc zzb(int i5) {
        return zzzc.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i5).array());
    }
}
