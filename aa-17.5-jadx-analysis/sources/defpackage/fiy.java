package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class fiy {
    public final Executor a;
    public final afco b;
    public final Executor c;
    public final dzg d;
    public final int e;
    public final dsy f;
    public final dsy g;
    public final dsr h;
    public final gjv i;

    /* JADX WARN: Type inference failed for: r4v1, types: [dzg, java.lang.Object] */
    public fiy(vx vxVar) {
        aitu aituVar = aium.a;
        int iMax = Math.max(1, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
        afch afchVar = aitu.l;
        this.a = aiji.a(aituVar.g(iMax));
        this.b = aituVar;
        this.c = aiji.a(aituVar);
        this.g = new dsy(null);
        this.f = fje.a;
        this.i = new gjv((char[]) null);
        this.e = 20;
        this.d = vxVar.a;
        this.h = new dsr(null);
    }
}
