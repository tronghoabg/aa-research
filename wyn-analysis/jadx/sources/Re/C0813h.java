package Re;

import A.AbstractC0213f;
import J9.C0663w;
import za.C4658a;

/* renamed from: Re.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0813h extends AbstractC0806a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10730c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f10731d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10732e;

    /* renamed from: f, reason: collision with root package name */
    public final Le.c f10733f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0813h(C0818m c0818m, int i5) {
        super(c0818m);
        C4658a c4658a = Ne.b.f8671a;
        this.f10733f = c4658a;
        this.f10731d = 3;
        this.f10732e = i5;
    }

    @Override // He.c
    public final void e(He.f fVar) {
        switch (this.f10730c) {
            case 0:
                He.c cVar = this.f10702b;
                C0663w c0663w = (C0663w) this.f10733f;
                if (!xg.g.b0(cVar, fVar, c0663w)) {
                    int iF = AbstractC0213f.f(this.f10732e);
                    int i5 = this.f10731d;
                    cVar.a(iF != 1 ? iF != 2 ? new C0809d(fVar, c0663w, i5) : new C0808c(fVar, c0663w, i5, true) : new C0808c(fVar, c0663w, i5, false));
                    break;
                }
                break;
            default:
                He.c cVar2 = this.f10702b;
                C4658a c4658a = (C4658a) this.f10733f;
                if (!xg.g.b0(cVar2, fVar, c4658a)) {
                    cVar2.d(new z(fVar, c4658a, this.f10731d, this.f10732e));
                    break;
                }
                break;
        }
    }

    public C0813h(B b5, C0663w c0663w) {
        super(b5);
        this.f10733f = c0663w;
        this.f10731d = 2;
        this.f10732e = 1;
    }
}
