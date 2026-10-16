package j$.util.stream;

import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class t1 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f50615b;

    public /* synthetic */ t1(z1 z1Var, int i2) {
        this.f50614a = i2;
        this.f50615b = z1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f50614a) {
            case 0:
                return new w1(this.f50615b);
            case 1:
                return new v1(this.f50615b);
            default:
                return new x1(this.f50615b);
        }
    }
}
