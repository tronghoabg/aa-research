package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jva extends defpackage.nzc implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("CarApp.H");
    public final android.content.Intent b;
    public boolean c;
    private final java.util.Map d;

    public jva() {
        super("TemplateCallingAppProvider");
        this.d = new j$.util.concurrent.ConcurrentHashMap();
        this.c = false;
        android.content.Intent intent = new android.content.Intent("androidx.car.app.CarAppService");
        this.b = intent;
        intent.addCategory("androidx.car.app.category.CALLING");
    }

    public static defpackage.jva a() {
        return (defpackage.jva) defpackage.mkp.a.b(defpackage.jva.class, new defpackage.jqx(2));
    }

    @Override // defpackage.nzc
    public final defpackage.ygw b(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        return (defpackage.ygw) j$.util.Map.-EL.computeIfAbsent(this.d, nzeVar, new defpackage.jxj(this, qshVar, 1));
    }

    @Override // defpackage.lhn
    public final void d() {
        this.d.clear();
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.d.clear();
    }
}
