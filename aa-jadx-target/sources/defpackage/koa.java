package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class koa implements defpackage.ryv, defpackage.kob {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.USBMON.MENDELDETECT");
    public final android.content.Context b;
    public final java.util.concurrent.ScheduledExecutorService c;
    public final defpackage.rzb d;
    public defpackage.ygw e;
    public defpackage.zhs f;
    private defpackage.xyd g;
    private final defpackage.mdl h = new defpackage.knz(this);

    public koa(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.rzb rzbVar) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = rzbVar;
    }

    private static void g(java.lang.Iterable iterable) {
        if (iterable == null) {
            return;
        }
        defpackage.you youVarListIterator = ((defpackage.ygw) iterable).listIterator(0);
        while (youVarListIterator.hasNext()) {
            ((kod) youVarListIterator.next()).b();
        }
    }

    @Override // defpackage.ryv
    public final void b(rzq rzqVar) {
        if (rzqVar.a) {
            return;
        }
        g(this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ryv
    public final void d() {
        android.content.Context context;
        int i;
        this.g = new defpackage.iku(this, 8);
        defpackage.zif zifVar = new defpackage.zif();
        defpackage.qtv qtvVar = (defpackage.qtv) this.g.a(new kny(qtvVarArr, zifVar));
        defpackage.qtv[] qtvVarArr = {qtvVar};
        qtvVar.e();
        this.f = zifVar;
        defpackage.abpj abpjVar = defpackage.acyx.i().b;
        int i2 = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        java.util.Iterator<E> it = abpjVar.iterator();
        while (true) {
            context = this.b;
            if (!it.hasNext()) {
                break;
            }
            rsg rsgVar = (rsg) it.next();
            if ((rsgVar.b & 1) != 0) {
                rsd rsdVar = rsgVar.c;
                if (rsdVar == null) {
                    rsdVar = rsd.a;
                }
                ygrVar.i(new koc(context, this, rsdVar, this.c));
            }
        }
        this.e = ygrVar.g();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        defpackage.ygw ygwVar = this.e;
        int i3 = ((defpackage.ymx) ygwVar).c;
        int i4 = 0;
        while (i4 < i3) {
            defpackage.you youVarListIterator = ((defpackage.ygw) ((kod) ygwVar.get(i4)).a()).listIterator(0);
            while (true) {
                i = i4 + 1;
                if (youVarListIterator.hasNext()) {
                    intentFilter.addAction(((defpackage.htw) youVarListIterator.next()).q());
                }
            }
            i4 = i;
        }
        defpackage.eth.a(context).b(this.h, intentFilter);
    }

    @Override // defpackage.ryv
    public final void e() {
        g(this.e);
        defpackage.eth.a(this.b).c(this.h);
        defpackage.zhs zhsVar = this.f;
        if (zhsVar != null) {
            boolean zIsDone = zhsVar.isDone();
            defpackage.zhs zhsVar2 = this.f;
            if (zIsDone) {
                ((defpackage.qtv) defpackage.ysr.cx(zhsVar2)).g();
            } else {
                zhsVar2.cancel(false);
            }
        }
        ((defpackage.yqj) a.l().ai((char) 3257)).u("Stopped");
    }

    @Override // defpackage.ryv
    public final /* synthetic */ java.lang.String[] f() {
        return defpackage.rox.d();
    }

    @Override // defpackage.ryv
    public final void c(defpackage.rzs rzsVar) {
    }

    @Override // defpackage.ryv
    public final /* synthetic */ void v(java.lang.String str, defpackage.xyn xynVar) {
    }
}
