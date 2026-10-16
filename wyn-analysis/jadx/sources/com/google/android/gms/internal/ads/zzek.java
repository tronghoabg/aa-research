package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzek {
    public static void zza(MediaFormat mediaFormat, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            mediaFormat.setByteBuffer(N0.a.d(i5, "csd-", new StringBuilder(String.valueOf(i5).length() + 4)), ByteBuffer.wrap((byte[]) list.get(i5)));
        }
    }

    public static void zzb(MediaFormat mediaFormat, String str, int i5) {
        if (i5 != -1) {
            mediaFormat.setInteger(str, i5);
        }
    }
}
