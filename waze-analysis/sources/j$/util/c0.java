package j$.util;

import j$.util.stream.t5;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class c0 implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f50142b;

    public /* synthetic */ c0(Consumer consumer, int i2) {
        this.f50141a = i2;
        this.f50142b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d2) {
        int i2 = this.f50141a;
        Consumer consumer = this.f50142b;
        switch (i2) {
            case 0:
                consumer.accept(Double.valueOf(d2));
                break;
            default:
                ((t5) consumer).accept(d2);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f50141a) {
        }
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }
}
