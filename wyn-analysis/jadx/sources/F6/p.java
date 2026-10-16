package F6;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f4004a;

    /* renamed from: b, reason: collision with root package name */
    public int f4005b;

    /* renamed from: c, reason: collision with root package name */
    public int f4006c;

    /* renamed from: d, reason: collision with root package name */
    public int f4007d;

    public p(int i5, int i10, int i11, int i12) {
        this.f4004a = i5;
        this.f4005b = i10;
        this.f4006c = i11;
        this.f4007d = i12;
    }

    public boolean a(int i5) {
        if (i5 == 1) {
            if (this.f4004a - this.f4005b <= 1) {
                return false;
            }
        } else if (this.f4006c - this.f4007d <= 1) {
            return false;
        }
        return true;
    }
}
