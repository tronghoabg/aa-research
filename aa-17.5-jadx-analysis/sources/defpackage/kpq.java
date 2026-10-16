package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class kpq implements kpv {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ kpq(Consumer consumer) {
        this.a = consumer;
    }

    @Override // defpackage.kpv
    public final void a(jlo jloVar) {
        Stream map = Collection.EL.stream(jloVar.d()).map(new koj(9));
        int i = yfq.d;
        this.a.accept((yfq) map.collect(ycm.a));
    }
}
