package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class zzxc {
    private static final AtomicLong zza = new AtomicLong();

    public zzxc(long j8, zzhv zzhvVar, Uri uri, Map map, long j10, long j11, long j12) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }
}
