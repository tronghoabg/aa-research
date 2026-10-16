package android.support.v7.widget;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class fk {

    /* renamed from: a, reason: collision with root package name */
    private int f1486a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f1487b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f1488c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f1489d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f1490e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f1491f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1492g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1493h = false;

    fk() {
    }

    public final int a() {
        return this.f1492g ? this.f1486a : this.f1487b;
    }

    public final int b() {
        return this.f1492g ? this.f1487b : this.f1486a;
    }

    public final void c(int i2, int i3) {
        this.f1493h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f1490e = i2;
            this.f1486a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1491f = i3;
            this.f1487b = i3;
        }
    }

    public final void d(boolean z) {
        if (z == this.f1492g) {
            return;
        }
        this.f1492g = z;
        if (!this.f1493h) {
            this.f1486a = this.f1490e;
            this.f1487b = this.f1491f;
            return;
        }
        if (z) {
            int i2 = this.f1489d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f1490e;
            }
            this.f1486a = i2;
            int i3 = this.f1488c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f1491f;
            }
            this.f1487b = i3;
            return;
        }
        int i4 = this.f1488c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f1490e;
        }
        this.f1486a = i4;
        int i5 = this.f1489d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = this.f1491f;
        }
        this.f1487b = i5;
    }

    public final void e(int i2, int i3) {
        this.f1488c = i2;
        this.f1489d = i3;
        this.f1493h = true;
        boolean z = this.f1492g;
        boolean z2 = i3 == Integer.MIN_VALUE;
        boolean z3 = i2 == Integer.MIN_VALUE;
        boolean z4 = true != z ? z3 : z2;
        int i4 = true != z ? i2 : i3;
        if (true == z) {
            z2 = z3;
        }
        if (true != z) {
            i2 = i3;
        }
        if (true != z4) {
            this.f1486a = i4;
        }
        if (true != z2) {
            this.f1487b = i2;
        }
    }
}
