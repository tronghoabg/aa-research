package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bzy extends cax {
    public static final bzy a = new bzy();

    private bzy() {
        super(0, 1);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        byw bywVar;
        bxf bxfVar = (bxf) cbaVar.c(0);
        aan aanVar = cdaVar.j;
        if (aanVar == null || ((ccv) aanVar.a(bxfVar)) == null) {
            return;
        }
        ArrayList arrayList = cdaVar.f;
        if (arrayList != null && (bywVar = (byw) arrayList.remove(arrayList.size() - 1)) != null) {
            cdaVar.c = bywVar;
        }
        aanVar.i(bxfVar);
    }
}
