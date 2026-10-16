package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zfm extends zfo {
    final /* synthetic */ zfp a;
    private final zfj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfm(zfp zfpVar, zfj zfjVar, Executor executor) {
        super(zfpVar, executor);
        this.a = zfpVar;
        this.c = zfjVar;
    }

    @Override // defpackage.zgn
    public final /* bridge */ /* synthetic */ Object a() throws Exception {
        return this.c.a();
    }

    @Override // defpackage.zgn
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.zfo
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.r((zgp) obj);
    }
}
