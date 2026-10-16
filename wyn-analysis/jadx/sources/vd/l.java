package vd;

import md.AbstractC3537e;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47194a;

    /* renamed from: b, reason: collision with root package name */
    public final m f47195b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3537e f47196c;

    public l(m mVar, AbstractC3537e abstractC3537e, int i5) {
        this.f47194a = i5;
        switch (i5) {
            case 1:
                Fe.e.p("success rate ejection config is null", mVar.f47201e != null);
                this.f47195b = mVar;
                this.f47196c = abstractC3537e;
                break;
            default:
                this.f47195b = mVar;
                this.f47196c = abstractC3537e;
                break;
        }
    }
}
