package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class qfe implements defpackage.xzi {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ qfe(android.content.Context context, java.lang.Class cls, defpackage.xzi xziVar, int i) {
        this.d = i;
        this.a = context;
        this.b = cls;
        this.c = xziVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xzi] */
    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        int i = this.d;
        if (i == 0) {
            int i2 = defpackage.qfn.g;
            return new defpackage.lws((android.content.Context) this.a, (java.lang.Class) this.b, (defpackage.lud) this.c.fF());
        }
        if (i != 1) {
            int i3 = defpackage.yud.a;
            int i4 = defpackage.yun.a;
            defpackage.yum yumVar = new defpackage.yum();
            yumVar.e(((java.lang.String) this.c).getBytes());
            yumVar.a.put((byte) 0);
            yumVar.h();
            yumVar.e(((java.lang.String) this.b).getBytes());
            return ((defpackage.yuv) ((defpackage.ngb) this.a).b).i(yumVar.l().e());
        }
        java.lang.Object obj = this.b;
        android.content.Context context = (android.content.Context) obj;
        defpackage.jqk jqkVar = new defpackage.jqk(context, new android.content.res.Configuration(((com.google.android.apps.auto.carservice.service.impl.GearheadCarStartupService) obj).getResources().getConfiguration()), (android.os.Handler) this.a, (defpackage.joe) this.c);
        jqkVar.l = true;
        defpackage.jpf jpfVar = jqkVar.i;
        byte[] bArr = null;
        defpackage.jpa jpaVar = new defpackage.jpa(jqkVar, 4, bArr);
        java.util.concurrent.CountDownLatch countDownLatch = jqkVar.d;
        countDownLatch.getClass();
        jpfVar.b(jpaVar, new defpackage.jpa(countDownLatch, 5, bArr));
        return jqkVar;
    }

    public /* synthetic */ qfe(com.google.android.apps.auto.carservice.service.impl.GearheadCarStartupService gearheadCarStartupService, defpackage.joe joeVar, android.os.Handler handler, int i) {
        this.d = i;
        this.b = gearheadCarStartupService;
        this.c = joeVar;
        this.a = handler;
    }

    public /* synthetic */ qfe(defpackage.ngb ngbVar, java.lang.String str, java.lang.String str2, int i) {
        this.d = i;
        this.a = ngbVar;
        this.c = str;
        this.b = str2;
    }
}
