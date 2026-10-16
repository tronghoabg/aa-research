package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class zzimi extends zzimg implements zzauw {
    private int zzg;

    public zzimi(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    public final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzauv.zzc(byteBuffer.get());
        zzauv.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
