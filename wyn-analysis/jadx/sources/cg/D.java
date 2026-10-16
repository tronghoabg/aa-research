package cg;

import com.applovin.shadow.okio.Segment;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final C1611C f19873a = new C1611C(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f19874b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f19875c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f19874b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i5 = 0; i5 < iHighestOneBit; i5++) {
            atomicReferenceArr[i5] = new AtomicReference();
        }
        f19875c = atomicReferenceArr;
    }

    public static final void a(C1611C segment) {
        AbstractC3340k.e(segment, "segment");
        if (segment.f19871f != null || segment.f19872g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f19869d) {
            return;
        }
        AtomicReference atomicReference = f19875c[(int) (Thread.currentThread().getId() & (f19874b - 1))];
        C1611C c1611c = f19873a;
        C1611C c1611c2 = (C1611C) atomicReference.getAndSet(c1611c);
        if (c1611c2 == c1611c) {
            return;
        }
        int i5 = c1611c2 != null ? c1611c2.f19868c : 0;
        if (i5 >= 65536) {
            atomicReference.set(c1611c2);
            return;
        }
        segment.f19871f = c1611c2;
        segment.f19867b = 0;
        segment.f19868c = i5 + Segment.SIZE;
        atomicReference.set(segment);
    }

    public static final C1611C b() {
        AtomicReference atomicReference = f19875c[(int) (Thread.currentThread().getId() & (f19874b - 1))];
        C1611C c1611c = f19873a;
        C1611C c1611c2 = (C1611C) atomicReference.getAndSet(c1611c);
        if (c1611c2 == c1611c) {
            return new C1611C();
        }
        if (c1611c2 == null) {
            atomicReference.set(null);
            return new C1611C();
        }
        atomicReference.set(c1611c2.f19871f);
        c1611c2.f19871f = null;
        c1611c2.f19868c = 0;
        return c1611c2;
    }
}
