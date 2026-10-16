package Hf;

import Ef.C0502n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class h0 implements Ef.U {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f5128a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5129b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5130c;

    /* renamed from: d, reason: collision with root package name */
    public final C0502n f5131d;

    public h0(j0 j0Var, long j8, Object obj, C0502n c0502n) {
        this.f5128a = j0Var;
        this.f5129b = j8;
        this.f5130c = obj;
        this.f5131d = c0502n;
    }

    @Override // Ef.U
    public final void dispose() {
        j0 j0Var = this.f5128a;
        synchronized (j0Var) {
            if (this.f5129b < j0Var.o()) {
                return;
            }
            Object[] objArr = j0Var.f5149h;
            AbstractC3340k.b(objArr);
            long j8 = this.f5129b;
            if (objArr[((int) j8) & (objArr.length - 1)] != this) {
                return;
            }
            k0.f(objArr, j8, k0.f5154a);
            j0Var.j();
        }
    }
}
