package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class t4 extends d4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f50617h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f50618i;

    public t4(k7 k7Var, IntBinaryOperator intBinaryOperator, int i2) {
        this.f50617h = intBinaryOperator;
        this.f50618i = i2;
    }

    @Override // j$.util.stream.d4
    public final y4 Q() {
        return new s4(this.f50618i, this.f50617h);
    }
}
