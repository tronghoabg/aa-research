package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
public final /* synthetic */ class rcy implements rzd {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rcy(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qxs] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, qxp] */
    @Override // defpackage.rzd, java.util.concurrent.Callable
    public final Object call() throws RemoteException {
        int i = this.c;
        final int i2 = 1;
        if (i == 0) {
            final rdj rdjVar = (rdj) this.a;
            if (!rdjVar.p(raj.S)) {
                throw new IllegalStateException("This API can only be used if the hero punch-through feature is enabled");
            }
            final Object obj = this.b;
            return (rjr) rdjVar.g.c(rjr.class, ((CarDisplayId) obj).a(), new rdn() { // from class: rdc
                @Override // defpackage.rdn
                public final Object a() throws RemoteException {
                    int i3 = i2;
                    rdj rdjVar2 = rdjVar;
                    if (i3 == 0) {
                        return new rol(rdjVar2.C().K((String) obj), new ykd(rdjVar2), rdjVar2.c);
                    }
                    rjm rjmVarQ = rdjVar2.C().Q((CarDisplayId) obj);
                    rjmVarQ.getClass();
                    return new rjr(rjmVarQ);
                }
            });
        }
        if (i == 1) {
            return Boolean.valueOf(((qrh) this.a).b.l(this.b));
        }
        if (i == 2) {
            zhc zhcVar = new zhc();
            ((rdj) this.a).C().ar((CarDisplayId) this.b, new rdi(zhcVar));
            return zhcVar;
        }
        final Object obj2 = this.b;
        if (i != 3) {
            return ((rij) this.a).b.f((CarProperty) obj2);
        }
        final rdj rdjVar2 = (rdj) this.a;
        final int i3 = 0;
        return (rol) rdjVar2.g.c(rol.class, (String) obj2, new rdn() { // from class: rdc
            @Override // defpackage.rdn
            public final Object a() throws RemoteException {
                int i32 = i3;
                rdj rdjVar22 = rdjVar2;
                if (i32 == 0) {
                    return new rol(rdjVar22.C().K((String) obj2), new ykd(rdjVar22), rdjVar22.c);
                }
                rjm rjmVarQ = rdjVar22.C().Q((CarDisplayId) obj2);
                rjmVarQ.getClass();
                return new rjr(rjmVarQ);
            }
        });
    }
}
