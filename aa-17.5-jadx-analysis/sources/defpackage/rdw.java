package defpackage;

import android.os.RemoteException;
import j$.util.Collection;
import j$.util.stream.Stream;

/* loaded from: classes.dex */
public final /* synthetic */ class rdw implements rzd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rdw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, qvr] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, rim] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, rkj] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, qvu] */
    @Override // defpackage.rzd, java.util.concurrent.Callable
    public final Object call() throws RemoteException {
        switch (this.b) {
            case 0:
                return ((sgk) ((rdx) this.a).e).b().i();
            case 1:
                rdj rdjVar = (rdj) this.a;
                return (rjs) rdjVar.g.b(rjs.class, new rcz(rdjVar, 10));
            case 2:
                return ((sgk) ((rdx) this.a).e).b().h();
            case 3:
                return ((rij) this.a).b.j();
            case 4:
                return this.a.i();
            case 5:
                Stream map = Collection.EL.stream(((rij) this.a).b.k()).map(new ric(5));
                int i = yfq.d;
                return (yfq) map.collect(ycm.a);
            case 6:
                return Boolean.valueOf(this.a.g());
            default:
                roa roaVar = (roa) this.a;
                ?? r0 = roaVar.a;
                int iC = r0.c();
                if (iC == 0) {
                    r0.v(roaVar.b);
                    iC = 0;
                }
                return Integer.valueOf(iC);
        }
    }
}
