package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ajny {
    private static final ajnx a = new ajnx(new byte[0], 0, 0, false);
    private static final int b;
    private static final AtomicReference[] c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iHighestOneBit = Integer.highestOneBit((iAvailableProcessors + iAvailableProcessors) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final ajnx a() {
        AtomicReference atomicReferenceC = c();
        ajnx ajnxVar = a;
        ajnx ajnxVar2 = (ajnx) atomicReferenceC.getAndSet(ajnxVar);
        if (ajnxVar2 == ajnxVar) {
            return new ajnx();
        }
        if (ajnxVar2 == null) {
            atomicReferenceC.set(null);
            return new ajnx();
        }
        atomicReferenceC.set(ajnxVar2.f);
        ajnxVar2.f = null;
        ajnxVar2.c = 0;
        return ajnxVar2;
    }

    public static final void b(ajnx ajnxVar) {
        if (ajnxVar.f != null || ajnxVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (ajnxVar.d) {
            return;
        }
        AtomicReference atomicReferenceC = c();
        ajnx ajnxVar2 = a;
        ajnx ajnxVar3 = (ajnx) atomicReferenceC.getAndSet(ajnxVar2);
        if (ajnxVar3 != ajnxVar2) {
            int i = ajnxVar3 != null ? ajnxVar3.c : 0;
            if (i >= 65536) {
                atomicReferenceC.set(ajnxVar3);
                return;
            }
            ajnxVar.f = ajnxVar3;
            ajnxVar.b = 0;
            ajnxVar.c = i + 8192;
            atomicReferenceC.set(ajnxVar);
        }
    }

    private static final AtomicReference c() {
        return c[(int) (Thread.currentThread().getId() & (b - 1))];
    }
}
