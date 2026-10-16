package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2993n3 extends AbstractC2998o3 implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    final Object[] f38261b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    C2993n3(int i5) {
        this.f38261b = new Object[i5];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i5 = this.f38272a;
        this.f38272a = i5 + 1;
        this.f38261b[i5] = obj;
    }
}
