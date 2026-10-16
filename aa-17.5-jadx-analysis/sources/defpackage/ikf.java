package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gearhead.appdecor.AppDecorService;
import java.util.List;

/* loaded from: classes.dex */
public final class ikf implements IBinder.DeathRecipient {
    public final Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ikf(AppDecorService appDecorService, qzj qzjVar, int i) throws RemoteException {
        this.c = i;
        this.b = appDecorService;
        this.a = qzjVar;
        qzjVar.asBinder().linkToDeath(this, 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qxm] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, qye] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, qwx] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, qzm] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, qua] */
    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.c) {
            case 0:
                this.a.asBinder().unlinkToDeath(this, 0);
                ((ikg) this.b).u(this);
                return;
            case 1:
                ((ype) ike.a.l().ai((char) 152)).u("binder died");
                Object obj = this.b;
                synchronized (((ike) obj).b) {
                    ((ike) obj).f.remove(this);
                }
                ike.l(this);
                return;
            case 2:
                ((ype) ikp.a.l().ai((char) 182)).u("binder died");
                List list = ((ikp) this.b).d;
                synchronized (list) {
                    list.remove(this);
                }
                this.a.asBinder().unlinkToDeath(this, 0);
                return;
            case 3:
                ild ildVar = (ild) this.b;
                ildVar.n();
                ildVar.i();
                return;
            case 4:
                this.a.asBinder().unlinkToDeath(this, 0);
                Object obj2 = this.b;
                synchronized (((iwc) obj2).b) {
                    ((iwc) obj2).d = null;
                }
                return;
            case 5:
                Object obj3 = this.b;
                synchronized (((jkx) obj3).a) {
                    ((jkx) obj3).b.remove(this);
                }
                return;
            case 6:
                ((AppDecorService) this.b).d.remove(this);
                ((ijn) this.a).asBinder().unlinkToDeath(this, 0);
                return;
            case 7:
                ((AppDecorService) this.b).e.remove(this);
                this.a.asBinder().unlinkToDeath(this, 0);
                return;
            default:
                Object obj4 = this.b;
                synchronized (obj4) {
                    ((qhh) obj4).a.remove(this);
                }
                this.a.asBinder().unlinkToDeath(this, 0);
                return;
        }
    }

    public ikf(ild ildVar, qyt qytVar, int i) throws RemoteException {
        this.c = i;
        this.b = ildVar;
        this.a = qytVar;
        qytVar.asBinder().linkToDeath(this, 0);
    }

    public ikf(jkx jkxVar, rws rwsVar, int i) throws RemoteException {
        this.c = i;
        this.b = jkxVar;
        this.a = rwsVar;
        rwsVar.asBinder().linkToDeath(this, 0);
    }

    public ikf(ijo ijoVar, Object obj, int i) {
        this.c = i;
        this.b = ijoVar;
        this.a = obj;
    }

    public ikf(AppDecorService appDecorService, qzm qzmVar, int i) throws RemoteException {
        this.c = i;
        this.b = appDecorService;
        this.a = qzmVar;
        qzmVar.asBinder().linkToDeath(this, 0);
    }

    public ikf(qhh qhhVar, qua quaVar, int i) throws RemoteException {
        this.c = i;
        this.b = qhhVar;
        this.a = quaVar;
        quaVar.asBinder().linkToDeath(this, 0);
    }
}
