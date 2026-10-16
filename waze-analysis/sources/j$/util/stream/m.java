package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class m extends m5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(t5 t5Var, Object obj, int i2) {
        super(t5Var);
        this.f50508b = i2;
        this.f50509c = obj;
    }

    @Override // j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        switch (this.f50508b) {
            case 0:
                this.f50521a.accept((t5) ((DoubleFunction) this.f50509c).apply(d2));
                break;
            case 1:
                this.f50521a.accept(((DoubleUnaryOperator) this.f50509c).applyAsDouble(d2));
                break;
            default:
                ((DoubleConsumer) this.f50509c).accept(d2);
                this.f50521a.accept(d2);
                break;
        }
    }
}
