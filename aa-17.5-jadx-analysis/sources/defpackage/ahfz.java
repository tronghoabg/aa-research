package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ahfz {
    private ahfz() {
    }

    public static boolean a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static final int b(AtomicInteger atomicInteger, int i) {
        int i2;
        int i3;
        do {
            i2 = atomicInteger.get();
            if ((i2 & i) != 0) {
                return 0;
            }
            i3 = i2 | i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i3;
    }

    public final ahga getById(int i) {
        ahga ahgaVar = (ahga) ahga.entryById.get(Integer.valueOf(i));
        return ahgaVar == null ? ahga.UNKNOWN : ahgaVar;
    }

    public /* synthetic */ ahfz(afeu afeuVar) {
        this();
    }
}
