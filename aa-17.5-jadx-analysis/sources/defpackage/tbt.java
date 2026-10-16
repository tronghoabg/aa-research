package defpackage;

import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class tbt implements afec {
    final /* synthetic */ Consumer a;

    public tbt(Consumer consumer) {
        this.a = consumer;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        this.a.accept(obj);
        return obj;
    }
}
