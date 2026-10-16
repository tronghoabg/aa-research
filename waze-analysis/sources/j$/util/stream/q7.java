package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class q7 extends r7 implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f50588b = new Object[128];

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i2 = this.f50599a;
        this.f50599a = i2 + 1;
        this.f50588b[i2] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
