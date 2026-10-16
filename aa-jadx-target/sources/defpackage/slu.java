package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class slu {
    public java.lang.Object a;
    public java.lang.Object b;

    public slu(android.os.PowerManager.WakeLock wakeLock) {
        this.a = wakeLock;
    }

    public final defpackage.slv a() {
        if (this.b == null) {
            this.b = new defpackage.sqs();
        }
        if (this.a == null) {
            this.a = android.os.Looper.getMainLooper();
        }
        return new defpackage.slv((defpackage.sqs) this.b, (android.os.Looper) this.a);
    }

    public final void b() {
        java.lang.Object obj = this.a;
        if (obj != null) {
            ((android.os.PowerManager.WakeLock) obj).release();
            return;
        }
        java.lang.Object obj2 = this.b;
        if (obj2 != null) {
            ((defpackage.swi) obj2).e();
        }
    }

    public slu(defpackage.swi swiVar) {
        this.b = swiVar;
    }
}
