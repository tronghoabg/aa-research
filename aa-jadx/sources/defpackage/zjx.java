package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zjx {
    public static final /* synthetic */ int c = 0;
    public final defpackage.ygw a;
    public final defpackage.ygw b;
    private final java.lang.String d;

    static {
        new defpackage.zjx(new defpackage.zps("DEFAULT"));
    }

    public zjx(defpackage.zps zpsVar) {
        this.d = (java.lang.String) zpsVar.d;
        this.a = ((defpackage.ygr) zpsVar.c).g();
        this.b = ((defpackage.ygr) zpsVar.b).g();
    }

    public final java.lang.String toString() {
        return this.d + "@" + java.lang.Integer.toHexString(hashCode());
    }
}
