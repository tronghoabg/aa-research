package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oiw {
    public static final /* synthetic */ int c = 0;
    private static final defpackage.yqm d = defpackage.yqm.c("GH.DirectLogger");
    public final defpackage.rqt a;
    public final j$.util.concurrent.ConcurrentLinkedQueue b;

    public oiw(android.content.Context context) {
        defpackage.rqt rqtVarA = defpackage.rqt.a(context);
        rqtVarA.f(new defpackage.rqp(1));
        this.a = rqtVarA;
        this.b = new j$.util.concurrent.ConcurrentLinkedQueue();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean a(defpackage.yyg yygVar) {
        try {
            if ((yygVar.b & 8388608) != 0) {
                this.a.d(defpackage.yyh.NON_UI, yygVar);
                return true;
            }
            if (!defpackage.kit.b().q()) {
                ((defpackage.yqj) ((defpackage.yqj) d.h()).ai(5980)).u("Unable to log binding event!");
                return false;
            }
            defpackage.mkp.a.g();
            defpackage.qsh qshVarE = defpackage.kit.b().e();
            ((defpackage.qtv) qshVarE).d().m(yygVar.h(), defpackage.yyh.NON_UI);
            return true;
        } catch (java.lang.IllegalStateException | defpackage.qst e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) d.h()).p(e)).ai((char) 5979)).u("Unable to log binding event!");
            return false;
        }
    }
}
