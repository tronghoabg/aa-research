package Jf;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6125e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f6126f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final H6.g f6127g = new H6.g("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f6128a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6129b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6130c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f6131d;

    public m(int i5, boolean z2) {
        this.f6128a = i5;
        this.f6129b = z2;
        int i10 = i5 - 1;
        this.f6130c = i10;
        this.f6131d = new AtomicReferenceArray(i5);
        if (i10 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i5 & i10) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6126f;
            long j8 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j8) != 0) {
                return (2305843009213693952L & j8) != 0 ? 2 : 1;
            }
            int i5 = (int) (1073741823 & j8);
            int i10 = (int) ((1152921503533105152L & j8) >> 30);
            int i11 = this.f6130c;
            if (((i10 + 2) & i11) == (i5 & i11)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f6131d;
            if (!this.f6129b && atomicReferenceArray.get(i10 & i11) != null) {
                int i12 = this.f6128a;
                if (i12 < 1024 || ((i10 - i5) & 1073741823) > (i12 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j8, ((-1152921503533105153L) & j8) | (((i10 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i10 & i11, runnable);
                m mVarC = this;
                while ((atomicLongFieldUpdater.get(mVarC) & 1152921504606846976L) != 0) {
                    mVarC = mVarC.c();
                    AtomicReferenceArray atomicReferenceArray2 = mVarC.f6131d;
                    int i13 = mVarC.f6130c & i10;
                    Object obj = atomicReferenceArray2.get(i13);
                    if ((obj instanceof l) && ((l) obj).f6124a == i10) {
                        atomicReferenceArray2.set(i13, runnable);
                    } else {
                        mVarC = null;
                    }
                    if (mVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        do {
            atomicLongFieldUpdater = f6126f;
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j8) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, 2305843009213693952L | j8));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        m mVar;
        while (true) {
            atomicLongFieldUpdater = f6126f;
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 1152921504606846976L) != 0) {
                mVar = this;
                break;
            }
            long j10 = 1152921504606846976L | j8;
            mVar = this;
            if (atomicLongFieldUpdater.compareAndSet(mVar, j8, j10)) {
                j8 = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6125e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.f6128a * 2, mVar.f6129b);
            int i5 = (int) (1073741823 & j8);
            int i10 = (int) ((1152921503533105152L & j8) >> 30);
            while (true) {
                int i11 = mVar.f6130c;
                int i12 = i5 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object lVar = mVar.f6131d.get(i12);
                if (lVar == null) {
                    lVar = new l(i5);
                }
                mVar3.f6131d.set(mVar3.f6130c & i5, lVar);
                i5++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j8);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Jf.m.f6126f
            long r2 = r0.get(r1)
            r6 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r6
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L15
            H6.g r0 = Jf.m.f6127g
            return r0
        L15:
            r10 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r10
            int r4 = (int) r4
            r12 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r12 = r12 & r2
            r5 = 30
            long r12 = r12 >> r5
            int r5 = (int) r12
            int r12 = r1.f6130c
            r5 = r5 & r12
            r12 = r12 & r4
            r13 = 0
            if (r5 != r12) goto L2d
            goto L40
        L2d:
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r1.f6131d
            java.lang.Object r15 = r14.get(r12)
            boolean r5 = r1.f6129b
            if (r15 != 0) goto L3a
            if (r5 == 0) goto L2
            goto L40
        L3a:
            r16 = r6
            boolean r6 = r15 instanceof Jf.l
            if (r6 == 0) goto L41
        L40:
            return r13
        L41:
            int r4 = r4 + 1
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            r4 = r4 & r6
            r6 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r6
            r20 = r6
            long r6 = (long) r4
            long r18 = r18 | r6
            r28 = r18
            r18 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L61
            r14.set(r12, r13)
            return r15
        L61:
            r1 = r30
            if (r18 == 0) goto L2
        L65:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Jf.m.f6126f
            long r24 = r0.get(r1)
            long r2 = r24 & r10
            int r2 = (int) r2
            long r3 = r24 & r16
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L7a
            Jf.m r0 = r1.c()
            r1 = r0
            goto L93
        L7a:
            long r3 = r24 & r20
            long r26 = r3 | r6
            r22 = r0
            r23 = r1
            boolean r0 = r22.compareAndSet(r23, r24, r26)
            r1 = r23
            if (r0 == 0) goto L65
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f6131d
            int r1 = r1.f6130c
            r1 = r1 & r2
            r0.set(r1, r13)
            r1 = r13
        L93:
            if (r1 != 0) goto L65
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.m.d():java.lang.Object");
    }
}
