package defpackage;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class tik extends ths {
    public CarIcon b;
    public us c;
    public Boolean d;
    public CarText a = null;
    public CarColor e = null;
    public EnumSet f = null;

    public tik(CarIcon carIcon, us usVar, Boolean bool) {
        this.b = carIcon;
        this.c = usVar;
        this.d = bool;
    }

    @Override // defpackage.tjo
    public final /* bridge */ /* synthetic */ Object a() {
        sw swVar = new sw();
        CarText carText = this.a;
        if (carText != null) {
            swVar.b = carText;
        }
        CarIcon carIcon = this.b;
        if (carIcon != null) {
            swVar.c(carIcon);
        }
        Boolean bool = this.d;
        if (bool != null) {
            swVar.a = bool.booleanValue();
        }
        us usVar = this.c;
        if (usVar != null) {
            swVar.d(usVar);
        }
        CarColor carColor = this.e;
        if (carColor != null) {
            swVar.b(carColor);
        }
        EnumSet enumSet = this.f;
        if (enumSet != null) {
            ArrayList arrayList = new ArrayList(woy.bp(enumSet, 10));
            Iterator it = enumSet.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((thr) it.next()).d));
            }
            Integer numValueOf = 0;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | ((Number) it2.next()).intValue());
            }
            swVar.g = numValueOf.intValue() | swVar.g;
        }
        return swVar.a();
    }

    @Override // defpackage.tjo
    public final String b() {
        return "Custom action: title " + this.a + ", icon " + this.b + ", enabled " + this.d + ", flags " + this.f;
    }
}
