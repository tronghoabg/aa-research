package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class g4 extends d4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f50411h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f50412i;

    public /* synthetic */ g4(k7 k7Var, Object obj, int i2) {
        this.f50411h = i2;
        this.f50412i = obj;
    }

    @Override // j$.util.stream.d4
    public final y4 Q() {
        switch (this.f50411h) {
            case 0:
                return new x4((LongBinaryOperator) this.f50412i);
            case 1:
                return new j4((DoubleBinaryOperator) this.f50412i);
            case 2:
                return new o4((BinaryOperator) this.f50412i);
            default:
                return new u4((IntBinaryOperator) this.f50412i);
        }
    }
}
