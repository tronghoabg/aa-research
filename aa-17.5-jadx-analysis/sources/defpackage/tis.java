package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Metadata;
import androidx.car.app.model.Toggle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class tis extends tjo {
    public boolean a;
    public boolean b;
    public CarText c;
    public CarIcon d;
    public tix e;
    public int f;
    public us g;
    public Metadata h;
    public boolean i;
    public boolean j;

    public tis(boolean z, boolean z2, CarText carText, us usVar, boolean z3, boolean z4) {
        this();
        this.a = z;
        this.b = z2;
        this.c = carText;
        this.d = null;
        this.e = null;
        this.f = -1;
        this.g = usVar;
        this.h = null;
        this.i = z3;
        this.j = z4;
    }

    @Override // defpackage.tjo
    public final /* bridge */ /* synthetic */ Object a() {
        vf vfVar = new vf();
        vfVar.a = this.b;
        vfVar.h(this.c);
        CarIcon carIcon = this.d;
        if (carIcon != null) {
            tix tixVar = this.e;
            tixVar.getClass();
            vfVar.e(carIcon, tixVar.e);
        }
        vfVar.f(this.f);
        us usVar = this.g;
        if (usVar != null) {
            vfVar.g(usVar);
        }
        Metadata metadata = this.h;
        if (metadata != null) {
            vfVar.j = metadata;
        }
        vfVar.k = this.i;
        vfVar.n = this.j;
        List list = this.k;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ths) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vfVar.b((Action) ((ths) it.next()).d());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof tjs) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            throw null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof tjt) {
                arrayList3.add(obj3);
            }
        }
        tjt tjtVar = (tjt) woy.bP(arrayList3);
        if (tjtVar != null) {
            vfVar.j((Toggle) tjtVar.d());
        }
        return vfVar.a();
    }

    @Override // defpackage.tjo
    public final String b() {
        CarText carText = this.c;
        Objects.toString(carText);
        return "Row: title ".concat(String.valueOf(carText));
    }

    public final boolean c() {
        return this.a;
    }

    public tis() {
    }
}
