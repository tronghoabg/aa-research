package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class pxs implements pxc {
    private final pxm a;
    private final ackk b;
    private final ackk c;
    private final tmb d;
    private final Executor e;
    private final aezk f;
    private final aezk g;
    private final String h;
    private final aabf i;
    private final erb j;

    public pxs(pxm pxmVar, ackk ackkVar, ackk ackkVar2, tmb tmbVar, erb erbVar, Executor executor, aezk aezkVar, aezk aezkVar2, xxh xxhVar, aabf aabfVar) {
        this.a = pxmVar;
        this.b = ackkVar;
        this.c = ackkVar2;
        this.d = tmbVar;
        this.j = erbVar;
        this.e = executor;
        this.f = aezkVar;
        this.g = aezkVar2;
        this.h = (String) xxhVar.e();
        this.i = aabfVar;
    }

    @Override // defpackage.pxc
    public final pxb a(abow abowVar, pwh pwhVar, pwp pwpVar) {
        tmb tmbVar = this.d;
        return new pxr(abowVar, this.b, this.a, pwhVar, new pvn(tmbVar), tmbVar, this.j, this.e, this.f, this.g, this.h, this.i, pwpVar);
    }

    @Override // defpackage.pxc
    public final /* synthetic */ void b() {
    }
}
