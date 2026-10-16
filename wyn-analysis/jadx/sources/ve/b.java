package Ve;

import Oe.g;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class b implements g {

    /* renamed from: i, reason: collision with root package name */
    public static final int f14906i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f14907j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f14908a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14909b;

    /* renamed from: c, reason: collision with root package name */
    public long f14910c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14911d;

    /* renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray f14912e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14913f;

    /* renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray f14914g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f14915h;

    public b(int i5) {
        AtomicLong atomicLong = new AtomicLong();
        this.f14908a = atomicLong;
        this.f14915h = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i5) - 1));
        int i10 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.f14912e = atomicReferenceArray;
        this.f14911d = i10;
        this.f14909b = Math.min(iNumberOfLeadingZeros / 4, f14906i);
        this.f14914g = atomicReferenceArray;
        this.f14913f = i10;
        this.f14910c = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // Oe.h
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return this.f14908a.get() == this.f14915h.get();
    }

    @Override // Oe.h
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f14912e;
        AtomicLong atomicLong = this.f14908a;
        long j8 = atomicLong.get();
        int i5 = this.f14911d;
        int i10 = ((int) j8) & i5;
        if (j8 < this.f14910c) {
            atomicReferenceArray.lazySet(i10, obj);
            atomicLong.lazySet(j8 + 1);
            return true;
        }
        long j10 = this.f14909b + j8;
        if (atomicReferenceArray.get(((int) j10) & i5) == null) {
            this.f14910c = j10 - 1;
            atomicReferenceArray.lazySet(i10, obj);
            atomicLong.lazySet(j8 + 1);
            return true;
        }
        long j11 = j8 + 1;
        if (atomicReferenceArray.get(((int) j11) & i5) == null) {
            atomicReferenceArray.lazySet(i10, obj);
            atomicLong.lazySet(j11);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f14912e = atomicReferenceArray2;
        this.f14910c = (j8 + i5) - 1;
        atomicReferenceArray2.lazySet(i10, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i10, f14907j);
        atomicLong.lazySet(j11);
        return true;
    }

    @Override // Oe.h
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f14914g;
        AtomicLong atomicLong = this.f14915h;
        long j8 = atomicLong.get();
        int i5 = this.f14913f;
        int i10 = ((int) j8) & i5;
        Object obj = atomicReferenceArray.get(i10);
        boolean z2 = obj == f14907j;
        if (obj != null && !z2) {
            atomicReferenceArray.lazySet(i10, null);
            atomicLong.lazySet(j8 + 1);
            return obj;
        }
        if (!z2) {
            return null;
        }
        int i11 = i5 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i11);
        atomicReferenceArray.lazySet(i11, null);
        this.f14914g = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i10);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i10, null);
            atomicLong.lazySet(j8 + 1);
        }
        return obj2;
    }
}
