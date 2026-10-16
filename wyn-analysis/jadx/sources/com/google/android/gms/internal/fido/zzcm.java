package com.google.android.gms.internal.fido;

import java.util.Comparator;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
enum zzcm implements Comparator {
    INSTANCE;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i5 = 0; i5 < iMin; i5++) {
            int i10 = (bArr[i5] & ForkServer.ERROR) - (bArr2[i5] & ForkServer.ERROR);
            if (i10 != 0) {
                return i10;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
