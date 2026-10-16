package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tgg {
    public static final defpackage.tgg a;
    public final defpackage.sqs b;

    static {
        defpackage.yqm.c("GH.LatencyLogger");
        a = new defpackage.tgg(new defpackage.sqs());
    }

    public tgg(defpackage.sqs sqsVar) {
        this.b = sqsVar;
    }

    public static int c(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? 4 : 3;
        }
        return 2;
    }

    public final void a(defpackage.tgf tgfVar, j$.time.Duration duration, j$.time.Duration duration2) {
        defpackage.vlw.a().c(tgfVar.cL, duration.toMillis(), duration2.toMillis());
        duration.toMillis();
        duration2.toMillis();
    }

    public final void b(defpackage.tgf tgfVar) {
        defpackage.vlw.a().e(tgfVar.cL);
    }

    public final void d(defpackage.tgf tgfVar, int i) {
        defpackage.vlw.a().a.k(tgfVar.cL, null, c(i));
    }
}
