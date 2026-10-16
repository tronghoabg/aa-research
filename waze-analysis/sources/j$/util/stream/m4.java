package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class m4 extends d4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f50519h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f50520i;

    public m4(k7 k7Var, DoubleBinaryOperator doubleBinaryOperator, double d2) {
        this.f50519h = doubleBinaryOperator;
        this.f50520i = d2;
    }

    @Override // j$.util.stream.d4
    public final y4 Q() {
        return new h4(this.f50520i, this.f50519h);
    }
}
