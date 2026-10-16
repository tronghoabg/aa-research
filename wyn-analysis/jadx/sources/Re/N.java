package Re;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class N implements ug.a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f10680a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10681b;

    public N(AtomicReference atomicReference, int i5) {
        this.f10680a = atomicReference;
        this.f10681b = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0008, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ug.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(He.f r8) {
        /*
            r7 = this;
            Re.O r0 = new Re.O
            r0.<init>(r8)
            r8.e(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference r8 = r7.f10680a
            java.lang.Object r8 = r8.get()
            Re.P r8 = (Re.P) r8
            if (r8 == 0) goto L1b
            boolean r1 = r8.f()
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r3 = r8
            goto L2d
        L1b:
            Re.P r1 = new Re.P
            java.util.concurrent.atomic.AtomicReference r2 = r7.f10680a
            int r3 = r7.f10681b
            r1.<init>(r2, r3)
            java.util.concurrent.atomic.AtomicReference r2 = r7.f10680a
        L26:
            boolean r3 = r2.compareAndSet(r8, r1)
            if (r3 == 0) goto L67
            r3 = r1
        L2d:
            java.util.concurrent.atomic.AtomicReference r4 = r3.f10689c
            java.lang.Object r8 = r4.get()
            r5 = r8
            Re.O[] r5 = (Re.O[]) r5
            Re.O[] r8 = Re.P.f10686j
            if (r5 != r8) goto L3b
            goto L8
        L3b:
            int r8 = r5.length
            int r1 = r8 + 1
            Re.O[] r6 = new Re.O[r1]
            r1 = 0
            java.lang.System.arraycopy(r5, r1, r6, r1, r8)
            r6[r8] = r0
        L46:
            boolean r8 = r4.compareAndSet(r5, r6)
            if (r8 == 0) goto L60
            long r1 = r0.get()
            r4 = -9223372036854775808
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 != 0) goto L5a
            r3.g(r0)
            goto L5c
        L5a:
            r0.f10683b = r3
        L5c:
            r3.c()
            return
        L60:
            java.lang.Object r8 = r4.get()
            if (r8 == r5) goto L46
            goto L2d
        L67:
            java.lang.Object r3 = r2.get()
            if (r3 == r8) goto L26
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: Re.N.a(He.f):void");
    }
}
