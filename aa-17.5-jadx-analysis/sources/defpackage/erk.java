package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class erk implements epy {
    private final /* synthetic */ int a;
    private final Object b;

    public erk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [epn, java.lang.Object] */
    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        epn[] epnVarArr;
        if (this.a == 0) {
            ?? r2 = this.b;
            r2.a();
            r2.a();
            return;
        }
        new HashMap();
        int i = 0;
        while (true) {
            epnVarArr = (epn[]) this.b;
            if (i >= epnVarArr.length) {
                break;
            }
            epnVarArr[i].a();
            i++;
        }
        for (epn epnVar : epnVarArr) {
            epnVar.a();
        }
    }
}
