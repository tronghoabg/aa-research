package j$.util;

import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class H implements IntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f37756a;

    public /* synthetic */ H(Consumer consumer) {
        this.f37756a = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i5) {
        this.f37756a.accept(Integer.valueOf(i5));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
