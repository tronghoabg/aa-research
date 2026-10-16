package defpackage;

import android.content.Context;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final class oic {
    public static final /* synthetic */ int c = 0;
    private static final yph d = yph.c("GH.DirectLogger");
    public final rpz a;
    public final ConcurrentLinkedQueue b;

    public oic(Context context) {
        rpz rpzVarA = rpz.a(context);
        rpzVarA.f(new rpv(1));
        this.a = rpzVarA;
        this.b = new ConcurrentLinkedQueue();
    }

    @ResultIgnorabilityUnspecified
    public final boolean a(yxb yxbVar) {
        try {
            if ((yxbVar.b & 8388608) != 0) {
                this.a.d(yxc.NON_UI, yxbVar);
                return true;
            }
            if (!kio.b().q()) {
                ((ype) ((ype) d.h()).ai(5954)).u("Unable to log binding event!");
                return false;
            }
            mki.a.g();
            qrn qrnVarE = kio.b().e();
            ((qsz) qrnVarE).d().m(yxbVar.h(), yxc.NON_UI);
            return true;
        } catch (IllegalStateException | qrz e) {
            ((ype) ((ype) ((ype) d.h()).p(e)).ai((char) 5953)).u("Unable to log binding event!");
            return false;
        }
    }
}
