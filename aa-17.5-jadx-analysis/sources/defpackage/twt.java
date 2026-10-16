package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class twt implements tvw {
    public static final upy a = new upy(new Object());
    public final Executor b;
    public final upr c;
    public final ufe d;
    public volatile ueu e = ueu.a;

    public twt(Executor executor, upr uprVar, ufe ufeVar) {
        this.b = executor;
        this.c = uprVar;
        this.d = ufeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ufe ufeVar, abco abcoVar, udx udxVar, List list) {
        for (int i = 0; i < abcoVar.c.size(); i++) {
            abcn abcnVar = (abcn) abcoVar.c.get(i);
            ujf ujfVarA = ufeVar.a(abcnVar, udxVar, udxVar.V());
            if (ujfVarA.i()) {
                uja ujaVar = ujfVarA.t;
                if (!ujaVar.d()) {
                    list.add(new nzj(abcnVar.c, ujaVar, ujfVarA));
                }
            }
        }
        ujf ujfVarC = ufeVar.c(abcoVar, udxVar, udxVar.V());
        if (ujfVarC.i()) {
            uja ujaVar2 = ujfVarC.t;
            if (ujaVar2.d()) {
                return;
            }
            list.add(new nzj("", ujaVar2, ujfVarC));
        }
    }
}
