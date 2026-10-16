package k;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private static final ai f50813a = new ai(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    private static final int f50814b;

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference[] f50815c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iHighestOneBit = Integer.highestOneBit((iAvailableProcessors + iAvailableProcessors) - 1);
        f50814b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i2 = 0; i2 < iHighestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference();
        }
        f50815c = atomicReferenceArr;
    }

    public static final ai a() {
        AtomicReference atomicReferenceC = c();
        ai aiVar = f50813a;
        ai aiVar2 = (ai) atomicReferenceC.getAndSet(aiVar);
        if (aiVar2 == aiVar) {
            return new ai();
        }
        if (aiVar2 == null) {
            atomicReferenceC.set(null);
            return new ai();
        }
        atomicReferenceC.set(aiVar2.f50811f);
        aiVar2.f50811f = null;
        aiVar2.f50808c = 0;
        return aiVar2;
    }

    public static final void b(ai aiVar) {
        h.g.b.x.f(aiVar, "segment");
        if (aiVar.f50811f != null || aiVar.f50812g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (aiVar.f50809d) {
            return;
        }
        AtomicReference atomicReferenceC = c();
        ai aiVar2 = f50813a;
        ai aiVar3 = (ai) atomicReferenceC.getAndSet(aiVar2);
        if (aiVar3 != aiVar2) {
            int i2 = aiVar3 != null ? aiVar3.f50808c : 0;
            if (i2 >= 65536) {
                atomicReferenceC.set(aiVar3);
                return;
            }
            aiVar.f50811f = aiVar3;
            aiVar.f50807b = 0;
            aiVar.f50808c = i2 + 8192;
            atomicReferenceC.set(aiVar);
        }
    }

    private static final AtomicReference c() {
        return f50815c[(int) (Thread.currentThread().getId() & (f50814b - 1))];
    }
}
