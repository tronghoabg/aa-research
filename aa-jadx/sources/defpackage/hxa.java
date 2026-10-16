package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hxa implements defpackage.hxg {
    public final boolean a;
    private final defpackage.hxg b;
    private final defpackage.hwz c;
    private final defpackage.hus d;
    private int e;
    private boolean f;

    public hxa(defpackage.hxg hxgVar, boolean z, defpackage.hus husVar, defpackage.hwz hwzVar) {
        defpackage.a.ak(hxgVar, "Argument must not be null");
        this.b = hxgVar;
        this.a = z;
        this.d = husVar;
        defpackage.a.ak(hwzVar, "Argument must not be null");
        this.c = hwzVar;
    }

    @Override // defpackage.hxg
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.hxg
    public final java.lang.Class b() {
        return this.b.b();
    }

    @Override // defpackage.hxg
    public final java.lang.Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.f) {
            throw new java.lang.IllegalStateException("Cannot acquire a recycled resource");
        }
        this.e++;
    }

    @Override // defpackage.hxg
    public final synchronized void e() {
        if (this.e > 0) {
            throw new java.lang.IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f) {
            throw new java.lang.IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f = true;
        this.b.e();
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.e;
            if (i2 <= 0) {
                throw new java.lang.IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.e = i;
        }
        if (i == 0) {
            defpackage.hwz hwzVar = this.c;
            defpackage.hus husVar = this.d;
            defpackage.hws hwsVar = (defpackage.hws) hwzVar;
            hwsVar.b.d(husVar);
            if (this.a) {
                hwsVar.c.d(husVar, this);
            } else {
                hwsVar.f.s(this, false);
            }
        }
    }

    public final synchronized java.lang.String toString() {
        defpackage.hxg hxgVar;
        defpackage.hus husVar;
        hxgVar = this.b;
        husVar = this.d;
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.c.toString() + ", key=" + java.lang.String.valueOf(husVar) + ", acquired=" + this.e + ", isRecycled=" + this.f + ", resource=" + hxgVar.toString() + "}";
    }
}
