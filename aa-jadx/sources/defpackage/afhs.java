package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class afhs {
    public static final defpackage.afhr a = new defpackage.afhr();
    public static final defpackage.afhs b;

    static {
        java.lang.Integer num = defpackage.afel.a;
        b = (num == null || num.intValue() >= 34) ? new defpackage.afht() : new defpackage.afhp();
    }

    public double a() {
        throw null;
    }

    public int b() {
        throw null;
    }

    public int c(int i) {
        throw null;
    }

    public long d() {
        throw null;
    }

    public long f() {
        return gH();
    }

    public long gH() {
        long jD;
        long j;
        do {
            jD = d() >>> 1;
            j = jD % 3000;
        } while ((jD - j) + 2999 < 0);
        return j;
    }
}
