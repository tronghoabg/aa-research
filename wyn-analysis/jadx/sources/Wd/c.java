package Wd;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class c implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f15460e = AtomicLongFieldUpdater.newUpdater(c.class, "top");

    /* renamed from: a, reason: collision with root package name */
    public final int f15461a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15462b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceArray f15463c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f15464d;

    @NotNull
    private volatile /* synthetic */ long top;

    public c(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "capacity should be positive but it is ").toString());
        }
        if (i5 > 536870911) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "capacity should be less or equal to 536870911 but it is ").toString());
        }
        this.top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i5 * 4) - 1) * 2;
        this.f15461a = iHighestOneBit;
        this.f15462b = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i10 = iHighestOneBit + 1;
        this.f15463c = new AtomicReferenceArray(i10);
        this.f15464d = new int[i10];
    }

    @Override // Wd.d
    public final Object C() {
        Object objD = d();
        return objD != null ? a(objD) : b();
    }

    @Override // Wd.d
    public final void S(Object instance) {
        long j8;
        long j10;
        AbstractC3340k.e(instance, "instance");
        h(instance);
        int iIdentityHashCode = ((System.identityHashCode(instance) * (-1640531527)) >>> this.f15462b) + 1;
        for (int i5 = 0; i5 < 8; i5++) {
            AtomicReferenceArray atomicReferenceArray = this.f15463c;
            while (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, instance)) {
                if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                    iIdentityHashCode--;
                    if (iIdentityHashCode == 0) {
                        iIdentityHashCode = this.f15461a;
                    }
                }
            }
            if (iIdentityHashCode <= 0) {
                throw new IllegalArgumentException("index should be positive");
            }
            do {
                j8 = this.top;
                j10 = ((((j8 >> 32) & 4294967295L) + 1) << 32) | iIdentityHashCode;
                this.f15464d[iIdentityHashCode] = (int) (4294967295L & j8);
            } while (!f15460e.compareAndSet(this, j8, j10));
            return;
        }
    }

    public abstract Object b();

    @Override // java.lang.AutoCloseable
    public final void close() {
        while (d() != null) {
        }
    }

    public final Object d() {
        long j8;
        int i5;
        c cVar;
        long j10;
        do {
            j8 = this.top;
            if (j8 != 0) {
                j10 = ((j8 >> 32) & 4294967295L) + 1;
                i5 = (int) (4294967295L & j8);
                if (i5 != 0) {
                    cVar = this;
                }
            }
            i5 = 0;
            cVar = this;
            break;
        } while (!f15460e.compareAndSet(cVar, j8, (j10 << 32) | this.f15464d[i5]));
        if (i5 == 0) {
            return null;
        }
        return cVar.f15463c.getAndSet(i5, null);
    }

    public void h(Object instance) {
        AbstractC3340k.e(instance, "instance");
    }

    public Object a(Object obj) {
        return obj;
    }
}
