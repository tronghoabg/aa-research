package j$.util;

import j$.util.function.IntConsumer$CC;
import j$.util.stream.t5;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class g0 implements IntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f50249b;

    public /* synthetic */ g0(Consumer consumer, int i2) {
        this.f50248a = i2;
        this.f50249b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i2) {
        int i3 = this.f50248a;
        Consumer consumer = this.f50249b;
        switch (i3) {
            case 0:
                consumer.accept(Integer.valueOf(i2));
                break;
            default:
                ((t5) consumer).accept(i2);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f50248a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
