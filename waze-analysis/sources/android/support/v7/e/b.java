package android.support.v7.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    final k f642a;

    /* renamed from: b, reason: collision with root package name */
    int f643b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f644c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f645d = -1;

    public b(k kVar) {
        this.f642a = kVar;
    }

    @Override // android.support.v7.e.k
    public final void a(int i2, int i3) {
        throw null;
    }

    @Override // android.support.v7.e.k
    public final void b(int i2, int i3) {
        e();
        this.f642a.b(i2, i3);
    }

    @Override // android.support.v7.e.k
    public final void c(int i2, int i3) {
        throw null;
    }

    @Override // android.support.v7.e.k
    public final void d(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (this.f643b == 3 && i2 <= (i5 = this.f645d + (i4 = this.f644c)) && (i6 = i2 + 1) >= i4) {
            this.f644c = Math.min(i2, i4);
            this.f645d = Math.max(i5, i6) - this.f644c;
        } else {
            e();
            this.f644c = i2;
            this.f645d = 1;
            this.f643b = 3;
        }
    }

    public final void e() {
        int i2 = this.f643b;
        if (i2 == 0) {
            return;
        }
        if (i2 != 1) {
            k kVar = this.f642a;
            if (i2 != 2) {
                kVar.d(this.f644c, this.f645d);
            } else {
                kVar.c(this.f644c, this.f645d);
            }
        } else {
            this.f642a.a(this.f644c, this.f645d);
        }
        this.f643b = 0;
    }
}
