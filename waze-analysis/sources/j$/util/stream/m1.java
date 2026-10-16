package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class m1 extends o5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(t5 t5Var, Object obj, int i2) {
        super(t5Var);
        this.f50517b = i2;
        this.f50518c = obj;
    }

    @Override // j$.util.stream.s5, j$.util.stream.t5
    public final void accept(long j2) {
        switch (this.f50517b) {
            case 0:
                this.f50558a.accept((t5) ((LongFunction) this.f50518c).apply(j2));
                break;
            default:
                ((LongConsumer) this.f50518c).accept(j2);
                this.f50558a.accept(j2);
                break;
        }
    }
}
