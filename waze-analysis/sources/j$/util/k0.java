package j$.util;

import j$.util.stream.t5;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class k0 implements LongConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f50271b;

    public /* synthetic */ k0(Consumer consumer, int i2) {
        this.f50270a = i2;
        this.f50271b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j2) {
        int i2 = this.f50270a;
        Consumer consumer = this.f50271b;
        switch (i2) {
            case 0:
                consumer.accept(Long.valueOf(j2));
                break;
            default:
                ((t5) consumer).accept(j2);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f50270a) {
        }
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }
}
