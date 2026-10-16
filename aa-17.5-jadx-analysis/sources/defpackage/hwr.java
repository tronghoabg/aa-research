package defpackage;

/* loaded from: classes2.dex */
public final class hwr implements hwx {
    public final boolean a;
    private final hwx b;
    private final hwq c;
    private final hui d;
    private int e;
    private boolean f;

    public hwr(hwx hwxVar, boolean z, hui huiVar, hwq hwqVar) {
        a.al(hwxVar, "Argument must not be null");
        this.b = hwxVar;
        this.a = z;
        this.d = huiVar;
        a.al(hwqVar, "Argument must not be null");
        this.c = hwqVar;
    }

    @Override // defpackage.hwx
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.hwx
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.hwx
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.e++;
    }

    @Override // defpackage.hwx
    public final synchronized void e() {
        if (this.e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f = true;
        this.b.e();
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.e;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.e = i;
        }
        if (i == 0) {
            hwq hwqVar = this.c;
            hui huiVar = this.d;
            hwj hwjVar = (hwj) hwqVar;
            hwjVar.b.d(huiVar);
            if (this.a) {
                hwjVar.c.d(huiVar, this);
            } else {
                hwjVar.f.s(this, false);
            }
        }
    }

    public final synchronized String toString() {
        hwx hwxVar;
        hui huiVar;
        hwxVar = this.b;
        huiVar = this.d;
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.c.toString() + ", key=" + String.valueOf(huiVar) + ", acquired=" + this.e + ", isRecycled=" + this.f + ", resource=" + hwxVar.toString() + "}";
    }
}
