package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajoy {
    private static final defpackage.ajox a = new defpackage.ajox(new byte[0], 0, 0, false);
    private static final int b;
    private static final java.util.concurrent.atomic.AtomicReference[] c;

    static {
        int iAvailableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        int iHighestOneBit = java.lang.Integer.highestOneBit((iAvailableProcessors + iAvailableProcessors) - 1);
        b = iHighestOneBit;
        java.util.concurrent.atomic.AtomicReference[] atomicReferenceArr = new java.util.concurrent.atomic.AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new java.util.concurrent.atomic.AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final defpackage.ajox a() {
        java.util.concurrent.atomic.AtomicReference atomicReferenceC = c();
        defpackage.ajox ajoxVar = a;
        defpackage.ajox ajoxVar2 = (defpackage.ajox) atomicReferenceC.getAndSet(ajoxVar);
        if (ajoxVar2 == ajoxVar) {
            return new defpackage.ajox();
        }
        if (ajoxVar2 == null) {
            atomicReferenceC.set(null);
            return new defpackage.ajox();
        }
        atomicReferenceC.set(ajoxVar2.f);
        ajoxVar2.f = null;
        ajoxVar2.c = 0;
        return ajoxVar2;
    }

    public static final void b(defpackage.ajox ajoxVar) {
        if (ajoxVar.f != null || ajoxVar.g != null) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (ajoxVar.d) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReferenceC = c();
        defpackage.ajox ajoxVar2 = a;
        defpackage.ajox ajoxVar3 = (defpackage.ajox) atomicReferenceC.getAndSet(ajoxVar2);
        if (ajoxVar3 != ajoxVar2) {
            int i = ajoxVar3 != null ? ajoxVar3.c : 0;
            if (i >= 65536) {
                atomicReferenceC.set(ajoxVar3);
                return;
            }
            ajoxVar.f = ajoxVar3;
            ajoxVar.b = 0;
            ajoxVar.c = i + 8192;
            atomicReferenceC.set(ajoxVar);
        }
    }

    private static final java.util.concurrent.atomic.AtomicReference c() {
        return c[(int) (java.lang.Thread.currentThread().getId() & (((long) b) - 1))];
    }
}
