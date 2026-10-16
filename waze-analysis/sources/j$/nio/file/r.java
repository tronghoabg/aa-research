package j$.nio.file;

import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class r implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f49768b;

    public /* synthetic */ r(Consumer consumer, int i2) {
        this.f49767a = i2;
        this.f49768b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f49767a) {
            case 0:
                this.f49768b.accept(a.g(obj));
                break;
            case 1:
                this.f49768b.accept(a.g(obj));
                break;
            default:
                this.f49768b.accept(new j$.util.o((Map.Entry) obj));
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f49767a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
