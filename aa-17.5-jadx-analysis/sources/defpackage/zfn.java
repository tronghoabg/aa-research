package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zfn extends zfo {
    final /* synthetic */ zfp a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfn(zfp zfpVar, Callable callable, Executor executor) {
        super(zfpVar, executor);
        this.a = zfpVar;
        this.c = callable;
    }

    @Override // defpackage.zgn
    public final Object a() throws Exception {
        return this.c.call();
    }

    @Override // defpackage.zgn
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.zfo
    public final void c(Object obj) {
        this.a.o(obj);
    }
}
