package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class khs {
    private final android.content.ContentResolver a;
    private defpackage.eqp b;

    public khs(android.content.Context context) {
        this.a = context.getContentResolver();
    }

    public static defpackage.khs e() {
        return (defpackage.khs) defpackage.mkp.a.i(defpackage.khs.class);
    }

    private static final defpackage.eqp f(defpackage.eqp eqpVar) {
        return defpackage.ebo.f(eqpVar, new defpackage.jxf(19));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public defpackage.eqp a(defpackage.eqp eqpVar) {
        defpackage.khn.c();
        return defpackage.ebo.e(f(defpackage.khn.a(this.a, defpackage.ebo.f(eqpVar, new defpackage.jxf(16)))));
    }

    public defpackage.eqp b(defpackage.eqp eqpVar) {
        defpackage.ygw ygwVar = defpackage.khq.a;
        return defpackage.ebo.g(defpackage.ebo.f(eqpVar, new defpackage.jxf(18)), new defpackage.kgo(this.a, 6));
    }

    public defpackage.eqp c(defpackage.eqp eqpVar, defpackage.eqp eqpVar2) {
        defpackage.khn.c();
        return defpackage.ebo.e(f(defpackage.khn.a(this.a, defpackage.ebo.f(defpackage.tcu.z(eqpVar, eqpVar2), new defpackage.jxf(17)))));
    }

    public final defpackage.eqp d() {
        if (this.b == null) {
            this.b = new defpackage.khr(new defpackage.tcg(defpackage.mkp.a.c, new android.content.IntentFilter("android.intent.action.TIME_TICK")));
        }
        return this.b;
    }
}
