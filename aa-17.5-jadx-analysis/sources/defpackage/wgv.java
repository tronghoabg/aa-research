package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class wgv implements zfj {
    public final /* synthetic */ zgp a;
    public final /* synthetic */ zfk b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ wgv(Object obj, zgp zgpVar, zfk zfkVar, Executor executor, int i) {
        this.e = i;
        this.d = obj;
        this.a = zgpVar;
        this.b = zfkVar;
        this.c = executor;
    }

    @Override // defpackage.zfj
    public final zgp a() {
        if (this.e == 0) {
            Executor executor = this.c;
            return zfb.g(this.a, xur.b(new pwg(this.d, this.b, executor, 6)), zfq.a);
        }
        Object obj = this.d;
        kew kewVar = new kew(obj, 15);
        Executor executor2 = this.c;
        zfk zfkVar = this.b;
        zgp zgpVar = this.a;
        zfq zfqVar = zfq.a;
        zgp zgpVarG = zfb.g(zgpVar, kewVar, zfqVar);
        zgp zgpVarG2 = zfb.g(zgpVarG, zfkVar, executor2);
        return zfb.g(zgpVarG2, xur.b(new pwg(obj, zgpVarG, zgpVarG2, 5)), zfqVar);
    }
}
