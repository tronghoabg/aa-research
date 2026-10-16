package v9;

import com.google.protobuf.MessageLite;
import md.AbstractC3537e;
import md.AbstractC3538f;
import md.b0;
import md.k0;

/* loaded from: classes4.dex */
public final class j extends AbstractC3537e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E4.n f47079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC3538f[] f47080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f47081f;

    public j(m mVar, E4.n nVar, AbstractC3538f[] abstractC3538fArr) {
        this.f47081f = mVar;
        this.f47079d = nVar;
        this.f47080e = abstractC3538fArr;
    }

    @Override // md.AbstractC3537e
    public final void i(k0 k0Var, b0 b0Var) {
        try {
            E4.n nVar = this.f47079d;
            ((A2.d) nVar.f2939c).N(new ng.a(20, nVar, k0Var));
        } catch (Throwable th) {
            this.f47081f.f47092a.c(th);
        }
    }

    @Override // md.AbstractC3537e
    public final void k(b0 b0Var) {
        try {
            E4.n nVar = this.f47079d;
            ((A2.d) nVar.f2939c).N(new ng.a(19, nVar, b0Var));
        } catch (Throwable th) {
            this.f47081f.f47092a.c(th);
        }
    }

    @Override // md.AbstractC3537e
    public final void l(MessageLite messageLite) {
        try {
            E4.n nVar = this.f47079d;
            int i5 = nVar.f2938b + 1;
            ((A2.d) nVar.f2939c).N(new Mb.b(nVar, i5, messageLite, 7));
            nVar.f2938b = i5;
            this.f47080e[0].c(1);
        } catch (Throwable th) {
            this.f47081f.f47092a.c(th);
        }
    }

    @Override // md.AbstractC3537e
    public final void m() {
    }
}
