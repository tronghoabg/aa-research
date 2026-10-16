package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class d8 implements Consumer, IntFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50382a;

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i2) {
        switch (this.f50382a) {
            case 1:
                return new Integer[i2];
            case 2:
                return new Integer[i2];
            case 3:
                return new Long[i2];
            case 4:
                return new Long[i2];
            case 5:
                return new Double[i2];
            default:
                return new Double[i2];
        }
    }
}
