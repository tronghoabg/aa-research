package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class rcv implements ref {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rcv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, qqq] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, rjm] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, qqp] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, rcg] */
    @Override // defpackage.ref
    public final void a(Object obj) throws RemoteException {
        switch (this.b) {
            case 0:
                ((qux) obj).b(this.a);
                break;
            case 1:
                ((qur) obj).b((wyd) this.a);
                break;
            case 2:
                ((quu) obj).c(this.a);
                break;
            case 3:
                ((rko) obj).b(this.a);
                break;
            case 4:
                riu riuVar = (riu) obj;
                try {
                    ((rij) this.a).b.x(riuVar);
                } catch (RemoteException unused) {
                }
                riuVar.a();
                break;
            case 5:
                rio rioVar = (rio) obj;
                try {
                    ((rij) this.a).b.w(rioVar);
                } catch (RemoteException unused2) {
                }
                rioVar.a();
                break;
            case 6:
                ((rjo) obj).b((pxp) this.a);
                break;
            default:
                rjo rjoVar = (rjo) obj;
                ((rjr) this.a).c.c(rjoVar);
                rjoVar.a();
                break;
        }
    }
}
