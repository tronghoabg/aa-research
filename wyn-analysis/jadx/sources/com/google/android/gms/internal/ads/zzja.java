package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzja {
    private final Map zza;

    public zzja() {
        this.zza = new HashMap();
    }

    public final zzja zza(String str, int i5) {
        this.zza.put(str, Integer.valueOf(i5));
        return this;
    }

    public final zzja zzb(String str, long j8) {
        this.zza.put(str, Long.valueOf(j8));
        return this;
    }

    public final zzja zzc(String str, float f10) {
        this.zza.put(str, Float.valueOf(f10));
        return this;
    }

    public final zzja zzd(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzja zze(String str, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            this.zza.put(str, null);
            return this;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        this.zza.put(str, byteBufferAllocate);
        return this;
    }

    public final zzja zzf(String str) {
        this.zza.remove(str);
        return this;
    }

    public final zzjb zzg() {
        return new zzjb(this.zza, null);
    }
}
