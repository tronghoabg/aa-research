package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class kvn implements afeh {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kvn(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [afei, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [aie] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v2, types: [afq] */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        afk afkVarE;
        ?? r1 = 0;
        int i = 1;
        if (this.c == 0) {
            atm atmVar = (atm) obj;
            bux buxVar = (bux) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            atmVar.getClass();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != buxVar.C(atmVar) ? 2 : 4;
            }
            if (buxVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
                this.b.invoke(atmVar, Integer.valueOf(this.a), buxVar, Integer.valueOf(iIntValue & 14));
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        agc agcVar = (agc) obj;
        bux buxVar2 = (bux) obj2;
        ((Integer) obj3).intValue();
        buxVar2.v(431650961);
        List list = ((ahw) this.b).a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            aig aigVar = (aig) list.get(i2);
            Integer numValueOf = Integer.valueOf(aigVar.a);
            Object obj4 = aigVar.e;
            if (obj4 instanceof aib) {
                afkVarE = ca.E(new aia(aigVar.b, (aib) obj4, (int) (r1 == true ? 1 : 0)));
            } else {
                if (!(obj4 instanceof ahz)) {
                    Objects.toString(obj4);
                    throw new RuntimeException("Unexpected value type: ".concat(String.valueOf(obj4)));
                }
                afkVarE = ca.E(new aia(aigVar.b, (ahz) obj4, i));
            }
            int i3 = aigVar.c;
            if (i3 != 0) {
                afkVarE = new afq(i3 == -1 ? Alert.DURATION_SHOW_INDEFINITELY : i3 + 1, afkVarE, aigVar.d);
            }
            arrayList.add(new aezu(numValueOf, afkVarE));
        }
        aho ahoVar = new aho(arrayList);
        if (!((Boolean) agcVar.g()).booleanValue()) {
            ahoVar = new aie(ahoVar, this.a);
        }
        buxVar2.o();
        return ahoVar;
    }
}
