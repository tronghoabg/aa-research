package q;

/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public int f43695a;

    /* renamed from: b, reason: collision with root package name */
    public int f43696b;

    /* renamed from: c, reason: collision with root package name */
    public int f43697c;

    /* renamed from: d, reason: collision with root package name */
    public int f43698d;

    /* renamed from: e, reason: collision with root package name */
    public int f43699e;

    /* renamed from: f, reason: collision with root package name */
    public int f43700f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43701g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f43702h;

    public final void a(int i5, int i10) {
        this.f43697c = i5;
        this.f43698d = i10;
        this.f43702h = true;
        if (this.f43701g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f43695a = i10;
            }
            if (i5 != Integer.MIN_VALUE) {
                this.f43696b = i5;
                return;
            }
            return;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f43695a = i5;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f43696b = i10;
        }
    }
}
