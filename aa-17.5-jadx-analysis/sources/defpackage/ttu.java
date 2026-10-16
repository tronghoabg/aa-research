package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ttu extends ttz {
    private static final yob f = yob.c("com/google/android/libraries/geo/mapcore/internal/coordgen/SingleZoomTileCoordGenerator");
    private final Set g;
    private final tpk h;
    private float i;
    private int j;
    private xxh k;
    private final tot l;

    public ttu(abgl abglVar, ukz ukzVar, xxh xxhVar) {
        super(abglVar, ukzVar);
        this.g = new aeug(null);
        this.h = new tpk(new tot(new too(), new too()));
        this.i = -1.0f;
        this.j = -1;
        this.k = xvy.a;
        this.l = new tot(new too(), new too());
        this.k = xxhVar;
    }

    private final long g(List list) {
        list.addAll(this.g);
        return this.b;
    }

    @Override // defpackage.ttv
    public final synchronized long a(usy usyVar, List list) {
        boolean zJ;
        list.clear();
        usz uszVarP = usyVar.p();
        Set set = this.g;
        boolean zIsEmpty = set.isEmpty();
        ttn ttnVar = uszVarP.a;
        too tooVar = new too(uszVarP.h, uszVarP.i, uszVarP.j);
        float f2 = ttnVar.l;
        uky ukyVarA = this.e.a(tooVar, this.a);
        int iA = ukyVarA != null ? ukyVarA.a(f2) : (int) f2;
        if (!zIsEmpty && uszVarP == this.d && iA == this.j) {
            return g(list);
        }
        tpj tpjVar = uszVarP.u;
        int i = 0;
        if (ttnVar.m == BitmapDescriptorFactory.HUE_RED && ttnVar.n == BitmapDescriptorFactory.HUE_RED) {
            if (!zIsEmpty && this.i == f2 && this.j == iA) {
                tpk tpkVar = this.h;
                if (tpkVar.g(tpjVar.c(0)) && tpkVar.g(tpjVar.c(2))) {
                    return g(list);
                }
            }
            zJ = ukp.j(tpjVar.c, iA, list, this.h);
            this.i = f2;
        } else {
            zJ = ukp.j(tpjVar.c, iA, list, null);
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ukp ukpVar = (ukp) list.get(i3);
                tot totVar = this.l;
                ukpVar.i(totVar);
                if (tpjVar.j(totVar)) {
                    list.set(i2, ukpVar);
                    i2++;
                }
            }
            while (true) {
                size--;
                if (size < i2) {
                    break;
                }
                list.remove(size);
            }
            this.i = -1.0f;
        }
        if (!zJ) {
            ((ynz) f.a(uys.a).ai(9141)).M("Excessive tile coordinate count from rect %s and %s", tpjVar.c, ttnVar);
        }
        f(list, ttnVar.h);
        int size2 = list.size();
        while (true) {
            if (i >= size2) {
                break;
            }
            if (!set.contains(list.get(i))) {
                this.b++;
                break;
            }
            i++;
        }
        set.clear();
        set.addAll(list);
        this.d = uszVarP;
        this.j = iA;
        return this.b;
    }
}
