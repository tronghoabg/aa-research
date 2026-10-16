package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class tzh implements uoq {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/indoor/impl/IndoorMetadataParser");
    private final tzg b;

    public tzh(tzg tzgVar) {
        this.b = tzgVar;
    }

    @Override // defpackage.uoq
    public final void a(ukp ukpVar, uop uopVar, uko ukoVar) {
        int i = uopVar.j;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                ((ynz) ((ynz) ((ynz) a.g()).l(60, TimeUnit.SECONDS)).ai(9217)).y("IO error for %s", ukpVar);
                this.b.a(ukpVar, 1, null);
                return;
            }
            tzg tzgVar = this.b;
            if (i2 != 3) {
                tzgVar.a(ukpVar, 1, null);
                return;
            } else {
                tzgVar.a(ukpVar, 2, null);
                return;
            }
        }
        if (!(ukoVar instanceof ukx)) {
            this.b.a(ukpVar, 1, null);
            return;
        }
        int i3 = yfq.d;
        List arrayList = yls.a;
        ukw ukwVarI = ((ukx) ukoVar).i();
        while (ukwVarI.hasNext()) {
            ukd next = ukwVarI.next();
            if (next.a() == 3) {
                uip uipVar = (uip) next;
                tzw tzwVar = !uqw.x(uipVar.k, 8) ? null : new tzw(uipVar.p, uipVar.g);
                if (tzwVar != null) {
                    if (arrayList.isEmpty()) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(tzwVar);
                }
            }
        }
        ((ynz) ((ynz) a.d()).ai(9216)).K("Tile %s has %d indoor metadata", ukpVar, arrayList.size());
        this.b.a(ukpVar, 0, arrayList);
    }
}
