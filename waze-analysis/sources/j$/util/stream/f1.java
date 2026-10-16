package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class f1 extends n5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50395b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(t5 t5Var, Object obj, int i2) {
        super(t5Var);
        this.f50395b = i2;
        this.f50396c = obj;
    }

    @Override // j$.util.stream.r5, j$.util.stream.t5
    public final void accept(int i2) {
        switch (this.f50395b) {
            case 0:
                this.f50539a.accept((t5) ((IntFunction) this.f50396c).apply(i2));
                break;
            default:
                ((IntConsumer) this.f50396c).accept(i2);
                this.f50539a.accept(i2);
                break;
        }
    }
}
