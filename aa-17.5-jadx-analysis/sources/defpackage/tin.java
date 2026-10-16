package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class tin extends tjo {
    public CarText a;

    public tin(CarText carText) {
        this.a = carText;
    }

    @Override // defpackage.tjo
    public final /* bridge */ /* synthetic */ Object a() {
        ua uaVar = new ua();
        CarText carText = this.a;
        if (carText != null) {
            uaVar.d(carText);
        }
        List list = this.k;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof tjl) {
                arrayList.add(obj);
            }
        }
        tjl tjlVar = (tjl) woy.bP(arrayList);
        if (tjlVar != null) {
            uaVar.c((Action) tjlVar.d());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ths) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            uaVar.b((Action) ((ths) it.next()).d());
        }
        return uaVar.a();
    }

    @Override // defpackage.tjo
    public final String b() {
        CarText carText = this.a;
        Objects.toString(carText);
        return "Header ".concat(String.valueOf(carText));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tin) && affa.f(this.a, ((tin) obj).a);
    }

    public final int hashCode() {
        CarText carText = this.a;
        if (carText == null) {
            return 0;
        }
        return carText.hashCode();
    }

    public final String toString() {
        return "HeaderNode(title=" + this.a + ")";
    }
}
