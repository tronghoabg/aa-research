package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lje {
    static final j$.time.Duration a = j$.time.Duration.ofMillis(500);
    public final defpackage.eqp b = new defpackage.liu();
    private defpackage.eqp c;

    public static defpackage.lje b() {
        return (defpackage.lje) defpackage.mkp.a.b(defpackage.lje.class, new defpackage.jqx(20));
    }

    public final defpackage.eqp a() {
        defpackage.eqp eqpVar = this.c;
        if (eqpVar != null) {
            return eqpVar;
        }
        defpackage.eqp eqpVar2 = this.b;
        j$.time.Duration duration = a;
        defpackage.afdo afdoVar = defpackage.tcu.a;
        duration.getClass();
        defpackage.eqp eqpVarA = defpackage.tcu.A(eqpVar2, duration, new defpackage.ooy(13));
        this.c = eqpVarA;
        return eqpVarA;
    }
}
