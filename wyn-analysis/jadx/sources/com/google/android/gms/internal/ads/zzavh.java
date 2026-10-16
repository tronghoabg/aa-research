package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class zzavh {
    public static byte[] zza() {
        int i5 = (((((~1070575321) & 53864535) | 741512112) + ((1070575321 & 1665624655) | 1758594712)) - 1358657052) ^ (1555319301 % 382697713);
        int i10 = (((((~1529195746) & 118097808) | 3345166) + ((1529195746 & 656934035) | 821390159)) - 940522761) ^ (1037127828 % 1034949299);
        int[] iArr = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(AbstractC1593a.b((i12 & (~i11)) | i13, (i11 & i14) | i15, iArr[5], iArr[6]) ^ (iArr[7] % 1275373743));
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) i10);
        byteBufferAllocate.putInt(i5);
        return byteBufferAllocate.array();
    }
}
