package ud;

import md.AbstractC3537e;
import md.AbstractC3538f;
import md.AbstractC3555x;
import md.b0;

/* loaded from: classes5.dex */
public final class f extends AbstractC3555x {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3538f f46785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f46786b;

    public f(g gVar, AbstractC3538f abstractC3538f) {
        this.f46786b = gVar;
        this.f46785a = abstractC3538f;
    }

    @Override // md.AbstractC3555x, md.AbstractC3538f
    public final void e(AbstractC3537e abstractC3537e, b0 b0Var) {
        b0Var.d(this.f46786b.f46787a);
        super.e(abstractC3537e, b0Var);
    }

    @Override // md.AbstractC3555x
    public final AbstractC3538f f() {
        return this.f46785a;
    }
}
