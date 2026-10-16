package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iko implements android.os.IBinder.DeathRecipient {
    public final java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public iko(com.google.android.gearhead.appdecor.AppDecorService appDecorService, raf rafVar, int i) throws android.os.RemoteException {
        this.c = i;
        this.b = appDecorService;
        this.a = rafVar;
        ((defpackage.ijv) rafVar).asBinder().linkToDeath(this, 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qyi] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, qza] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, qxt] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, rai] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, quw] */
    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                this.a.asBinder().unlinkToDeath(this, 0);
                ((defpackage.ikp) this.b).u(this);
                return;
            case 1:
                ((defpackage.yqj) defpackage.ikn.a.l().ai((char) 152)).u("binder died");
                java.lang.Object obj = this.b;
                synchronized (((defpackage.ikn) obj).b) {
                    ((defpackage.ikn) obj).f.remove(this);
                    break;
                }
                defpackage.ikn.l(this);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.yqj) defpackage.ikz.a.l().ai((char) 182)).u("binder died");
                java.util.List list = ((defpackage.ikz) this.b).d;
                synchronized (list) {
                    list.remove(this);
                    break;
                }
                this.a.asBinder().unlinkToDeath(this, 0);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.iln ilnVar = (defpackage.iln) this.b;
                ilnVar.n();
                ilnVar.i();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                this.a.asBinder().unlinkToDeath(this, 0);
                java.lang.Object obj2 = this.b;
                synchronized (((defpackage.iwk) obj2).b) {
                    ((defpackage.iwk) obj2).d = null;
                    break;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Object obj3 = this.b;
                synchronized (((defpackage.jlf) obj3).a) {
                    ((defpackage.jlf) obj3).b.remove(this);
                    break;
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((com.google.android.gearhead.appdecor.AppDecorService) this.b).d.remove(this);
                ((defpackage.ijv) this.a).asBinder().unlinkToDeath(this, 0);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((com.google.android.gearhead.appdecor.AppDecorService) this.b).e.remove(this);
                this.a.asBinder().unlinkToDeath(this, 0);
                return;
            default:
                java.lang.Object obj4 = this.b;
                synchronized (obj4) {
                    ((defpackage.qic) obj4).a.remove(this);
                    break;
                }
                this.a.asBinder().unlinkToDeath(this, 0);
                return;
        }
    }

    public iko(defpackage.iln ilnVar, qzp qzpVar, int i) throws android.os.RemoteException {
        this.c = i;
        this.b = ilnVar;
        this.a = qzpVar;
        qzpVar.asBinder().linkToDeath(this, 0);
    }

    public iko(defpackage.jlf jlfVar, defpackage.rxl rxlVar, int i) throws android.os.RemoteException {
        this.c = i;
        this.b = jlfVar;
        this.a = rxlVar;
        rxlVar.asBinder().linkToDeath(this, 0);
    }

    public iko(defpackage.ijw ijwVar, java.lang.Object obj, int i) {
        this.c = i;
        this.b = ijwVar;
        this.a = obj;
    }

    public iko(com.google.android.gearhead.appdecor.AppDecorService appDecorService, rai raiVar, int i) throws android.os.RemoteException {
        this.c = i;
        this.b = appDecorService;
        this.a = raiVar;
        raiVar.asBinder().linkToDeath(this, 0);
    }

    public iko(defpackage.qic qicVar, quw quwVar, int i) throws android.os.RemoteException {
        this.c = i;
        this.b = qicVar;
        this.a = quwVar;
        quwVar.asBinder().linkToDeath(this, 0);
    }
}
