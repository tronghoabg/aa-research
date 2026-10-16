package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ajit implements ajhy {
    @Override // defpackage.ajhy
    public final ajif a(ajke ajkeVar) throws IOException {
        System.currentTimeMillis();
        ajid ajidVar = ajkeVar.b;
        if (true == ajidVar.b().l) {
            ajidVar = null;
        }
        if (ajidVar == null) {
            ajie ajieVar = new ajie();
            ajieVar.c(ajkeVar.b);
            ajieVar.a = ajib.b;
            ajieVar.b = 504;
            ajieVar.c = "Unsatisfiable Request (only-if-cached)";
            ajieVar.i = -1L;
            ajieVar.j = System.currentTimeMillis();
            return ajieVar.a();
        }
        ajif ajifVarA = ajkeVar.a(ajidVar);
        ajie ajieVar2 = new ajie(ajifVarA);
        ajif ajifVarA2 = ahds.a(ajifVarA);
        if (ajifVarA2.i != null) {
            throw new IllegalArgumentException("networkResponse.networkResponse != null");
        }
        if (ajifVarA2.j != null) {
            throw new IllegalArgumentException("networkResponse.priorResponse != null");
        }
        ajieVar2.g = ajifVarA2;
        return ajieVar2.a();
    }
}
