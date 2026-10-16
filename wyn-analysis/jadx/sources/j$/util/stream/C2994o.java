package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2994o implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3011r2 f38264a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d3) {
        this.f38264a.accept(d3);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }
}
