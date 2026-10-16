package j$.util.stream;

import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class k0 extends l0 {

    /* renamed from: b, reason: collision with root package name */
    public final Consumer f50485b;

    public k0(Consumer consumer, boolean z) {
        super(z);
        this.f50485b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f50485b.accept(obj);
    }
}
