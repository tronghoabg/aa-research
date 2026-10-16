package J1;

import E4.F;
import androidx.lifecycle.E;

/* loaded from: classes.dex */
public final class b extends E {

    /* renamed from: l, reason: collision with root package name */
    public final b7.d f5534l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5535m;

    /* renamed from: n, reason: collision with root package name */
    public F f5536n;

    public b(b7.d dVar) {
        this.f5534l = dVar;
        if (dVar.f19376a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f19376a = this;
    }

    @Override // androidx.lifecycle.D
    public final void f() {
        b7.d dVar = this.f5534l;
        dVar.f19378c = true;
        dVar.f19380e = false;
        dVar.f19379d = false;
        dVar.f19385j.drainPermits();
        dVar.c();
    }

    @Override // androidx.lifecycle.D
    public final void g() {
        this.f5534l.f19378c = false;
    }

    @Override // androidx.lifecycle.D
    public final void i(androidx.lifecycle.F f10) {
        super.i(f10);
        this.f5535m = null;
        this.f5536n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.v, java.lang.Object] */
    public final void k() {
        ?? r02 = this.f5535m;
        F f10 = this.f5536n;
        if (r02 == 0 || f10 == null) {
            return;
        }
        super.i(f10);
        d(r02, f10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.f5534l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
