package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class aezd implements aeys {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ aezd(Consumer consumer) {
        this.a = consumer;
    }

    @Override // defpackage.aeys
    public final /* synthetic */ aeys a(aeys aeysVar) {
        return adqs.Q(this, aeysVar);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        adqs.S(this, i);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // defpackage.aeys
    public final /* synthetic */ void b(Short sh) {
        adqs.U(this, sh);
    }

    @Override // defpackage.aeys
    public final void c(short s) {
        this.a.accept(Short.valueOf(s));
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        b((Short) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return adqs.R(this, intConsumer);
    }
}
