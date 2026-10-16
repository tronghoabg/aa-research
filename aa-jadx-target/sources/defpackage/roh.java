package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class roh implements android.os.IBinder.DeathRecipient {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ roh(defpackage.jhe jheVar, int i) {
        this.b = i;
        this.a = jheVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        if (this.b == 0) {
            defpackage.rbz.h(((defpackage.ror) this.a).d);
        } else {
            ((defpackage.yqj) defpackage.jhe.a.l().ai((char) 2091)).u("ICarWindowCallback binder died.");
            defpackage.rbz.h(new defpackage.jeo(this.a, 7));
        }
    }

    public roh(defpackage.ror rorVar, int i) {
        this.b = i;
        this.a = rorVar;
    }
}
