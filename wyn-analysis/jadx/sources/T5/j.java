package T5;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11561a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11562b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11563c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11564d;

    /* renamed from: e, reason: collision with root package name */
    public int f11565e;

    /* renamed from: f, reason: collision with root package name */
    public int f11566f;

    /* renamed from: g, reason: collision with root package name */
    public long f11567g;

    /* renamed from: h, reason: collision with root package name */
    public long f11568h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f11569i;

    public /* synthetic */ j(Object obj, int i5) {
        this.f11561a = i5;
        this.f11569i = obj;
    }

    public final void a(int i5, int i10, byte[] bArr) {
        switch (this.f11561a) {
            case 0:
                if (this.f11563c) {
                    int i11 = this.f11566f;
                    int i12 = (i5 + 1) - i11;
                    if (i12 >= i10) {
                        this.f11566f = (i10 - i5) + i11;
                        break;
                    } else {
                        this.f11564d = ((bArr[i12] & 192) >> 6) == 0;
                        this.f11563c = false;
                        break;
                    }
                }
                break;
            default:
                if (this.f11563c) {
                    int i13 = this.f11566f;
                    int i14 = (i5 + 1) - i13;
                    if (i14 >= i10) {
                        this.f11566f = (i10 - i5) + i13;
                        break;
                    } else {
                        this.f11564d = ((bArr[i14] & 192) >> 6) == 0;
                        this.f11563c = false;
                        break;
                    }
                }
                break;
        }
    }

    public void b(long j8, int i5, boolean z2) {
        Q1.k.g(this.f11568h != -9223372036854775807L);
        if (this.f11565e == 182 && z2 && this.f11562b) {
            ((s2.C) this.f11569i).a(this.f11568h, this.f11564d ? 1 : 0, (int) (j8 - this.f11567g), i5, null);
        }
        if (this.f11565e != 179) {
            this.f11567g = j8;
        }
    }
}
