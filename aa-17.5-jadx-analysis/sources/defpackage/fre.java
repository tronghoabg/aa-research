package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class fre extends ajng {
    @Override // defpackage.ajng, defpackage.ajnf
    public final ajoa a(ajnr ajnrVar) throws IOException {
        ajnr ajnrVarF = ajnrVar.f();
        if (ajnrVarF != null) {
            afaz afazVar = new afaz();
            while (ajnrVarF != null && !i(ajnrVarF)) {
                afazVar.addFirst(ajnrVarF);
                ajnrVarF = ajnrVarF.f();
            }
            Iterator it = afazVar.iterator();
            while (it.hasNext()) {
                ajnr ajnrVar2 = (ajnr) it.next();
                ajnrVar2.getClass();
                this.c.k(ajnrVar2);
            }
        }
        return this.c.a(ajnrVar);
    }
}
