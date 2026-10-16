package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class sfg {
    private static final ypf a = ols.R("CAR.SETUP");
    private final Context b;
    private final sff c;

    public sfg(Context context, sff sffVar) {
        this.b = context;
        this.c = sffVar;
    }

    public abstract void a(yze yzeVar, yzf yzfVar);

    public abstract void b();

    public final void c(yze yzeVar, yzf yzfVar, String str) {
        a.g().ai(8856).T("ProjectionErrorCode = %s(%d), ProjectionErrorDetail = %s(%d), %s", yzeVar == null ? "unknown" : yzeVar.name(), Integer.valueOf(yzeVar == null ? 0 : yzeVar.D), yzfVar != null ? yzfVar.name() : "unknown", Integer.valueOf(yzfVar != null ? yzfVar.az : 0), str);
        qrv.m(this.b, yzeVar, this.c.a(), yzfVar);
        a(yzeVar, yzfVar);
    }

    public final void d(yze yzeVar, yzf yzfVar, String str) {
        yop yopVarAi = a.h().ai(8857);
        int i = yzfVar.az;
        yopVarAi.T("ProjectionErrorCode = %s(%d), ProjectionErrorDetail = %s(%d), %s", yzeVar.name(), Integer.valueOf(yzeVar.D), yzfVar.name(), Integer.valueOf(i), str);
        a(yzeVar, yzfVar);
    }
}
