package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class brh implements afeh {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ brh(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.b != 0) {
            bux buxVar = (bux) obj2;
            ((Integer) obj3).intValue();
            buxVar.v(2115989621);
            int i = this.a;
            aew aewVarF = ca.F(i, 0, aev.d, 2);
            if (!((Boolean) ((agc) obj).g()).booleanValue()) {
                aewVarF = new aie(aewVarF, i);
            }
            buxVar.o();
            return aewVarF;
        }
        List list = (List) obj;
        bux buxVar2 = (bux) obj2;
        ((Integer) obj3).intValue();
        int size = list.size();
        int i2 = this.a;
        if (i2 < size) {
            buxVar2.v(436390614);
            bre.a.c(new cfu(new bol((brc) list.get(i2), 4)), BitmapDescriptorFactory.HUE_RED, 0L, buxVar2, 3072);
            buxVar2.o();
        } else {
            buxVar2.v(436548218);
            buxVar2.o();
        }
        return afak.a;
    }
}
