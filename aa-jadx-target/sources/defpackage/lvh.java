package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lvh implements defpackage.lun, defpackage.lhn {
    static final mesquite.messaging.model.Container a;
    public static final /* synthetic */ int c = 0;
    public final java.util.Map b = new java.util.LinkedHashMap();
    private final defpackage.eqs d;
    private final java.util.function.Consumer e;

    static {
        mesquite.messaging.model.Container.Builder builder = new mesquite.messaging.model.Container.Builder();
        builder.b("SMS_CONTAINER");
        a = builder.a();
    }

    public lvh() {
        defpackage.eqs eqsVar = new defpackage.eqs();
        this.d = eqsVar;
        this.e = new kcx(this, 7);
        int i = defpackage.ygw.d;
        eqsVar.m(defpackage.ymx.a);
    }

    public static defpackage.lvh h() {
        return (defpackage.lvh) defpackage.mkp.a.i(defpackage.lvh.class);
    }

    public static java.lang.String i(android.telephony.SmsMessage smsMessage) {
        java.lang.String originatingAddress = smsMessage.getOriginatingAddress();
        originatingAddress.getClass();
        return java.lang.String.valueOf(originatingAddress.hashCode());
    }

    @Override // defpackage.lun
    public final defpackage.eqp a() {
        defpackage.ygw ygwVarQ = defpackage.ygw.q(a);
        defpackage.afdo afdoVar = defpackage.tcu.a;
        return new defpackage.eqs(ygwVarQ);
    }

    @Override // defpackage.lun
    public final defpackage.eqp b(mesquite.messaging.model.Container container) {
        return this.d;
    }

    @Override // defpackage.lhn
    public final void d() {
        defpackage.lxe.a().e(this.e);
        this.b.clear();
        j();
    }

    @Override // defpackage.lun
    public final lup e() {
        luo luoVar = new luo();
        android.content.ComponentName componentName = defpackage.mkt.r;
        luoVar.a = com.google.android.apps.auto.components.graphics.icon.GhIcon.j(componentName);
        luoVar.c(defpackage.mkp.a.c.getString(2132085293));
        luoVar.b(-65281);
        luoVar.d(componentName);
        return luoVar.a();
    }

    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.lxe.a().b(this.e);
    }

    @Override // defpackage.lun
    public final void f(java.lang.String str) {
        throw null;
    }

    @Override // defpackage.lun
    public final void g(lum lumVar) {
        throw null;
    }

    public final void j() {
        int i = 0;
        j$.util.stream.Stream streamSorted = j$.util.Collection.-EL.stream(this.b.values()).map(new defpackage.lvg(i)).sorted(j$.util.Comparator.-EL.reversed(j$.util.Comparator.-CC.comparingLong(new defpackage.lvf(i))));
        int i2 = defpackage.ygw.d;
        this.d.m((defpackage.ygw) streamSorted.collect(defpackage.yds.a));
    }
}
