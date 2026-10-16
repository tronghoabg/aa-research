package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cap extends cax {
    public static final cap a = new cap();

    private cap() {
        super(0, 1);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        bxf bxfVar = (bxf) cbaVar.c(0);
        aan aanVar = cdaVar.j;
        ccv ccvVar = aanVar != null ? (ccv) aanVar.a(bxfVar) : null;
        if (ccvVar != null) {
            ArrayList arrayList = cdaVar.f;
            if (arrayList == null) {
                arrayList = new ArrayList();
                cdaVar.f = arrayList;
            }
            arrayList.add(cdaVar.c);
            cdaVar.c = ccvVar.a;
        }
    }
}
