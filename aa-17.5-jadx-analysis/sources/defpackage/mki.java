package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class mki extends tgs {
    public static mki a;
    public static final yfq b = yfq.q(mkh.a);
    public Context c;
    public Executor d;
    protected aezk e;
    protected aezk f;

    public abstract mkh a();

    public final Object b(Class cls, tgr tgrVar) {
        return c(cls, b, tgrVar);
    }

    public final Object c(Class cls, List list, tgr tgrVar) {
        mkh mkhVarA = a();
        woy.af(list.contains(mkhVarA), "%s cannot be instantiated from %s.", cls.getCanonicalName(), mkhVarA.name());
        Object objCast = cls.cast(super.l(cls, false, tgrVar));
        objCast.getClass();
        return objCast;
    }

    public final void d(aezk aezkVar, aezk aezkVar2, aezk aezkVar3, aezk aezkVar4) {
        wer.c();
        a = this;
        this.c = (Context) aezkVar.a();
        this.d = (Executor) aezkVar2.a();
        this.e = aezkVar3;
        this.f = aezkVar4;
    }

    @Override // defpackage.tgs
    public final void e(Class cls, aezk aezkVar) {
        n(cls, new qec(aezkVar, 1));
    }

    public void f() {
    }

    public void g() {
    }
}
