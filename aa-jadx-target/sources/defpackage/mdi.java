package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mdi implements defpackage.lhn {
    public static final defpackage.mde a = new defpackage.mde();
    public static final defpackage.afhl b = new defpackage.lco(defpackage.mkp.b, 14);
    public static final defpackage.yqm c = defpackage.yqm.c("GH.ParkedAppMgr");
    public java.util.Map d;
    private final defpackage.kja e;
    private final defpackage.eqp f;
    private final defpackage.eqp g;
    private java.util.concurrent.ExecutorService h;
    private final defpackage.eqp i;
    private final defpackage.mdg j;

    public /* synthetic */ mdi(byte[] bArr) {
        defpackage.kja kjaVarA = defpackage.kja.a();
        this.e = kjaVarA;
        defpackage.mpi mpiVar = defpackage.mpj.b().h;
        this.f = mpiVar;
        defpackage.eqp eqpVarA = defpackage.lje.b().a();
        this.g = eqpVarA;
        eqpVarA.getClass();
        this.i = defpackage.tcu.e(kjaVarA, mpiVar, eqpVarA, defpackage.mdh.a);
        this.j = new defpackage.mdg(this);
    }

    public static final defpackage.mdi a() {
        return a.a();
    }

    public final void b(defpackage.nta ntaVar) {
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        defpackage.ocn.a().e(context, new android.content.ComponentName("com.google.android.projection.gearhead", getClass().getName()), context.getText(2132084692), 1, ntaVar);
    }

    @Override // defpackage.lhn
    public final void d() {
        java.util.concurrent.ExecutorService executorService = this.h;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        this.h = null;
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.d = null;
        this.i.eM(defpackage.ler.c(), this.j);
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        this.h = executorServiceNewSingleThreadExecutor;
        if (executorServiceNewSingleThreadExecutor == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        executorServiceNewSingleThreadExecutor.execute(new defpackage.img(12));
        if (defpackage.lzm.c()) {
            defpackage.omf.u().F((defpackage.rrp) defpackage.omv.p(defpackage.acbk.O).l());
        }
    }

    public mdi() {
        this(null);
    }
}
