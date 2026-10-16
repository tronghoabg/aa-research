package Jf;

import Ef.C0477a0;
import Ef.Z;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public class w {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6143b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public Z[] f6144a;

    public final void a(Z z2) {
        z2.d((C0477a0) this);
        Z[] zArr = this.f6144a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6143b;
        if (zArr == null) {
            zArr = new Z[4];
            this.f6144a = zArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= zArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(zArr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC3340k.d(objArrCopyOf, "copyOf(...)");
            zArr = (Z[]) objArrCopyOf;
            this.f6144a = zArr;
        }
        int i5 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i5 + 1);
        zArr[i5] = z2;
        z2.f3709b = i5;
        d(i5);
    }

    public final void b(Z z2) {
        synchronized (this) {
            if (z2.b() != null) {
                c(z2.f3709b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Ef.Z c(int r9) {
        /*
            r8 = this;
            Ef.Z[] r0 = r8.f6144a
            kotlin.jvm.internal.AbstractC3340k.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = Jf.w.f6143b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.e(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.AbstractC3340k.b(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.AbstractC3340k.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.e(r9, r2)
            r8.d(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            Ef.Z[] r5 = r8.f6144a
            kotlin.jvm.internal.AbstractC3340k.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.AbstractC3340k.b(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.AbstractC3340k.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.AbstractC3340k.b(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.AbstractC3340k.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.e(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.AbstractC3340k.b(r9)
            r2 = 0
            r9.d(r2)
            r9.f3709b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.w.c(int):Ef.Z");
    }

    public final void d(int i5) {
        while (i5 > 0) {
            Z[] zArr = this.f6144a;
            AbstractC3340k.b(zArr);
            int i10 = (i5 - 1) / 2;
            Z z2 = zArr[i10];
            AbstractC3340k.b(z2);
            Z z10 = zArr[i5];
            AbstractC3340k.b(z10);
            if (z2.compareTo(z10) <= 0) {
                return;
            }
            e(i5, i10);
            i5 = i10;
        }
    }

    public final void e(int i5, int i10) {
        Z[] zArr = this.f6144a;
        AbstractC3340k.b(zArr);
        Z z2 = zArr[i10];
        AbstractC3340k.b(z2);
        Z z10 = zArr[i5];
        AbstractC3340k.b(z10);
        zArr[i5] = z2;
        zArr[i10] = z10;
        z2.f3709b = i5;
        z10.f3709b = i10;
    }
}
