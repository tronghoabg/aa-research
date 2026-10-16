package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class xzp extends xyr {
    final /* synthetic */ Callable a;

    public xzp(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.xyr
    public final Object a(Object obj) throws Exception {
        return this.a.call();
    }
}
