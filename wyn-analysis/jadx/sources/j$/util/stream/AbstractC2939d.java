package j$.util.stream;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2939d {

    /* renamed from: a, reason: collision with root package name */
    protected final int f38164a;

    /* renamed from: b, reason: collision with root package name */
    protected int f38165b;

    /* renamed from: c, reason: collision with root package name */
    protected int f38166c;

    /* renamed from: d, reason: collision with root package name */
    protected long[] f38167d;

    public abstract void clear();

    protected AbstractC2939d() {
        this.f38164a = 4;
    }

    protected AbstractC2939d(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i5);
        }
        this.f38164a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i5 - 1));
    }

    public final long count() {
        int i5 = this.f38166c;
        if (i5 == 0) {
            return this.f38165b;
        }
        return this.f38167d[i5] + this.f38165b;
    }
}
