package Re;

/* renamed from: Re.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0816k extends AbstractC0814i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10741c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0816k(He.f fVar, int i5) {
        super(fVar);
        this.f10741c = i5;
    }

    @Override // He.d
    public final void b(Object obj) {
        if (this.f10735b.b()) {
        }
        if (obj == null) {
            d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (get() != 0) {
            this.f10734a.b(obj);
            Fe.e.P(this, 1L);
        } else {
            switch (this.f10741c) {
                case 0:
                    break;
                default:
                    d(new Ke.c("create: could not emit value due to lack of requests"));
                    break;
            }
        }
    }

    private final void h() {
    }
}
