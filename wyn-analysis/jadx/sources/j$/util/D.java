package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class D implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f37753a;

    public /* synthetic */ D(Consumer consumer) {
        this.f37753a = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d3) {
        this.f37753a.accept(Double.valueOf(d3));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }
}
