package j$.util.stream;

import java.util.function.Predicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class u1 extends y1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1 f50628c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Predicate f50629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(z1 z1Var, Predicate predicate) {
        super(z1Var);
        this.f50628c = z1Var;
        this.f50629d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f50704a) {
            return;
        }
        boolean zTest = this.f50629d.test(obj);
        z1 z1Var = this.f50628c;
        if (zTest == z1Var.f50726a) {
            this.f50704a = true;
            this.f50705b = z1Var.f50727b;
        }
    }
}
