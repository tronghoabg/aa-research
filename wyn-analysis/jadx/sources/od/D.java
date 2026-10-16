package od;

import md.AbstractC3537e;

/* loaded from: classes5.dex */
public final class D extends T3.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41532c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC3537e f41533d;

    /* renamed from: e, reason: collision with root package name */
    public final md.k0 f41534e;

    public D(I0 i02, AbstractC3537e abstractC3537e, md.k0 k0Var) {
        super(i02.f41591c, 1);
        this.f41533d = abstractC3537e;
        this.f41534e = k0Var;
    }

    @Override // T3.d
    public final void c() {
        switch (this.f41532c) {
            case 0:
                this.f41533d.i(this.f41534e, new md.b0());
                break;
            default:
                this.f41533d.i(this.f41534e, new md.b0());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C0 c02, AbstractC3537e abstractC3537e, md.k0 k0Var) {
        super(c02.f41528e, 1);
        this.f41533d = abstractC3537e;
        this.f41534e = k0Var;
    }
}
