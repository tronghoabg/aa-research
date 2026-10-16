package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class aefy implements aefj {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ aefy(Consumer consumer) {
        this.a = consumer;
    }

    @Override // defpackage.aefj
    public final /* synthetic */ aefj a(aefj aefjVar) {
        return aeec.p(this, aefjVar);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        aeec.r(this, i);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // defpackage.aefj
    public final void b(byte b) {
        this.a.accept(Byte.valueOf(b));
    }

    @Override // defpackage.aefj
    public final /* synthetic */ void c(Byte b) {
        aeec.s(this, b);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        c((Byte) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return aeec.q(this, intConsumer);
    }
}
