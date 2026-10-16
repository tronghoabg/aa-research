package P2;

/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f9066a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9067b;

    public g(long j8, byte[] bArr) {
        this.f9066a = j8;
        this.f9067b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f9066a, ((g) obj).f9066a);
    }
}
