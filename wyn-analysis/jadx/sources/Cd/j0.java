package Cd;

import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class j0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final tf.q f2120a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f2121b;

    public j0(tf.q interceptor, u0 u0Var) {
        AbstractC3340k.e(interceptor, "interceptor");
        this.f2120a = interceptor;
        this.f2121b = u0Var;
    }

    @Override // Cd.u0
    public final Object a(Fd.c cVar, AbstractC3464c abstractC3464c) {
        return this.f2120a.invoke(this.f2121b, cVar, abstractC3464c);
    }
}
