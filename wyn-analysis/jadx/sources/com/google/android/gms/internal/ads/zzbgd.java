package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzbgd {
    public static int zza(String str) {
        int i5;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = length & (-4);
            if (i10 >= i5) {
                break;
            }
            int i12 = ((bytes[i10] & ForkServer.ERROR) | ((bytes[i10 + 1] & ForkServer.ERROR) << 8) | ((bytes[i10 + 2] & ForkServer.ERROR) << 16) | (bytes[i10 + 3] << 24)) * (-862048943);
            int i13 = i11 ^ (((i12 >>> 17) | (i12 << 15)) * 461845907);
            i11 = (((i13 >>> 19) | (i13 << 13)) * 5) - 430675100;
            i10 += 4;
        }
        int i14 = length & 3;
        if (i14 == 1) {
            int i15 = ((bytes[i5] & ForkServer.ERROR) | i) * (-862048943);
            i11 ^= ((i15 >>> 17) | (i15 << 15)) * 461845907;
        } else {
            if (i14 != 2) {
                i = i14 == 3 ? (bytes[i5 + 2] & ForkServer.ERROR) << 16 : 0;
            }
            i |= (bytes[i5 + 1] & ForkServer.ERROR) << 8;
            int i152 = ((bytes[i5] & ForkServer.ERROR) | i) * (-862048943);
            i11 ^= ((i152 >>> 17) | (i152 << 15)) * 461845907;
        }
        int i16 = i11 ^ length;
        int i17 = (i16 ^ (i16 >>> 16)) * (-2048144789);
        int i18 = (i17 ^ (i17 >>> 13)) * (-1028477387);
        return i18 ^ (i18 >>> 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] zzb(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgd.zzb(java.lang.String, boolean):java.lang.String[]");
    }
}
