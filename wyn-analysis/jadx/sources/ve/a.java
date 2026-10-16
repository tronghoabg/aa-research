package Ve;

import Oe.g;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class a extends AtomicReferenceArray implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final Integer f14900f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: a, reason: collision with root package name */
    public final int f14901a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f14902b;

    /* renamed from: c, reason: collision with root package name */
    public long f14903c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f14904d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14905e;

    public a(int i5) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i5 - 1)));
        this.f14901a = length() - 1;
        this.f14902b = new AtomicLong();
        this.f14904d = new AtomicLong();
        this.f14905e = Math.min(i5 / 4, f14900f.intValue());
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
        return this.f14902b.get() == this.f14904d.get();
    }

    @Override // Oe.h
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f14902b;
        long j8 = atomicLong.get();
        int i5 = this.f14901a;
        int i10 = ((int) j8) & i5;
        if (j8 >= this.f14903c) {
            long j10 = this.f14905e + j8;
            if (get(i5 & ((int) j10)) == null) {
                this.f14903c = j10;
            } else if (get(i10) != null) {
                return false;
            }
        }
        lazySet(i10, obj);
        atomicLong.lazySet(j8 + 1);
        return true;
    }

    @Override // Oe.h
    public final Object poll() {
        AtomicLong atomicLong = this.f14904d;
        long j8 = atomicLong.get();
        int i5 = ((int) j8) & this.f14901a;
        Object obj = get(i5);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j8 + 1);
        lazySet(i5, null);
        return obj;
    }
}
