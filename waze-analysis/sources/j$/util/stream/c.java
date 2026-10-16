package j$.util.stream;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f50342a;

    /* renamed from: b, reason: collision with root package name */
    public int f50343b;

    /* renamed from: c, reason: collision with root package name */
    public int f50344c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f50345d;

    public c(int i2) {
        if (i2 >= 0) {
            this.f50342a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i2 - 1));
        } else {
            j$.time.f.i("Illegal Capacity: ", i2);
            throw null;
        }
    }

    public abstract void clear();

    public final long count() {
        int i2 = this.f50344c;
        return i2 == 0 ? this.f50343b : this.f50345d[i2] + this.f50343b;
    }

    public c() {
        this.f50342a = 4;
    }
}
