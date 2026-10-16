package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class jnl {
    public static final yph a = yph.c("GH.CAR.AUTH");
    public final Map b;
    public final Context c;
    public final jnk d;
    private final rpz e;

    public jnl(Context context, jnk jnkVar) {
        rpz rpzVarA = rpz.a(context);
        this.b = new ConcurrentHashMap();
        this.c = context;
        this.d = jnkVar;
        this.e = rpzVarA;
    }

    public final void a() {
        ((ype) a.l().ai((char) 2412)).u("Clearing approved packages cache.");
        this.b.clear();
    }

    public final void b(SortedSet sortedSet, boolean z) {
        abnp abnpVarN = yxb.a.n();
        abnp abnpVarN2 = yyg.a.n();
        abnpVarN2.t();
        yyg yygVar = (yyg) abnpVarN2.b;
        aboh abohVar = yygVar.c;
        if (!abohVar.c()) {
            int size = abohVar.size();
            yygVar.c = abohVar.d(size + size);
        }
        abmc.i(sortedSet, yygVar.c);
        abnpVarN2.t();
        yyg yygVar2 = (yyg) abnpVarN2.b;
        yygVar2.b |= 1;
        yygVar2.d = 2;
        abnpVarN2.t();
        yyg yygVar3 = (yyg) abnpVarN2.b;
        yygVar3.b = 2 | yygVar3.b;
        yygVar3.e = z;
        abnpVarN.t();
        yxb yxbVar = (yxb) abnpVarN.b;
        yyg yygVar4 = (yyg) abnpVarN2.q();
        yygVar4.getClass();
        yxbVar.V = yygVar4;
        yxbVar.c |= 8388608;
        yxb yxbVar2 = (yxb) abnpVarN.q();
        rpz rpzVar = this.e;
        yxc yxcVar = yxc.GEARHEAD_CAR_SERVICE_CONNECTION;
        int i = yfq.d;
        rpzVar.e(yxcVar, yxbVar2, yls.a);
    }
}
