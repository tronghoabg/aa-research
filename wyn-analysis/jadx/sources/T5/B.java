package T5;

/* loaded from: classes3.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11469a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11470b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11471c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11472d;

    /* renamed from: e, reason: collision with root package name */
    public int f11473e;

    /* renamed from: f, reason: collision with root package name */
    public String f11474f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public B(int i5, int i10, int i11, byte b5) {
        this(Integer.MIN_VALUE, i5, i10, 0);
        this.f11469a = i11;
        switch (i11) {
            case 1:
                this(Integer.MIN_VALUE, i5, i10, 1);
                break;
            default:
                break;
        }
    }

    public final void a() {
        switch (this.f11469a) {
            case 0:
                int i5 = this.f11473e;
                this.f11473e = i5 == Integer.MIN_VALUE ? this.f11471c : i5 + this.f11472d;
                this.f11474f = this.f11470b + this.f11473e;
                break;
            default:
                int i10 = this.f11473e;
                this.f11473e = i10 == Integer.MIN_VALUE ? this.f11471c : i10 + this.f11472d;
                this.f11474f = this.f11470b + this.f11473e;
                break;
        }
    }

    public final void b() {
        switch (this.f11469a) {
            case 0:
                if (this.f11473e == Integer.MIN_VALUE) {
                    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
                }
                return;
            default:
                if (this.f11473e == Integer.MIN_VALUE) {
                    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
                }
                return;
        }
    }

    public B(int i5, int i10, int i11, int i12) {
        String str;
        String str2;
        this.f11469a = i12;
        switch (i12) {
            case 1:
                if (i5 != Integer.MIN_VALUE) {
                    str = i5 + "/";
                } else {
                    str = "";
                }
                this.f11470b = str;
                this.f11471c = i10;
                this.f11472d = i11;
                this.f11473e = Integer.MIN_VALUE;
                this.f11474f = "";
                break;
            default:
                if (i5 != Integer.MIN_VALUE) {
                    str2 = i5 + "/";
                } else {
                    str2 = "";
                }
                this.f11470b = str2;
                this.f11471c = i10;
                this.f11472d = i11;
                this.f11473e = Integer.MIN_VALUE;
                this.f11474f = "";
                break;
        }
    }
}
