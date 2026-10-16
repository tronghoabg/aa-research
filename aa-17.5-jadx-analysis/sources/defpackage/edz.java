package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
final class edz extends ebx {
    final /* synthetic */ eeb a;
    private final HashMap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edz(eeb eebVar) {
        super(0);
        this.a = eebVar;
        this.b = new HashMap();
    }

    private static final boolean a(lds ldsVar) {
        return (ldsVar.T() & 519) != 0;
    }

    @Override // defpackage.ebx
    public final ecy b(ecy ecyVar, List list) {
        ArrayList arrayList;
        int size;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            lds ldsVar = (lds) list.get(size2);
            Integer num = (Integer) this.b.get(ldsVar);
            if (num != null) {
                int iIntValue = num.intValue();
                float fR = ldsVar.R();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fR;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fR;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fR;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fR;
                }
            }
        }
        eeb eebVar = this.a;
        eeb.a(ecyVar);
        ArrayList arrayList2 = eebVar.b;
        int size3 = arrayList2.size();
        do {
            size3--;
            if (size3 < 0) {
                return ecyVar;
            }
            arrayList = ((edx) arrayList2.get(size3)).a;
            size = arrayList.size() - 1;
        } while (size < 0);
        throw null;
    }

    @Override // defpackage.ebx
    public final ebw c(lds ldsVar, ebw ebwVar) {
        if (a(ldsVar)) {
            dve dveVar = ebwVar.b;
            dve dveVar2 = ebwVar.a;
            int i = dveVar.b != dveVar2.b ? 1 : 0;
            if (dveVar.c != dveVar2.c) {
                i |= 2;
            }
            if (dveVar.d != dveVar2.d) {
                i |= 4;
            }
            if (dveVar.e != dveVar2.e) {
                i |= 8;
            }
            this.b.put(ldsVar, Integer.valueOf(i));
        }
        return ebwVar;
    }

    @Override // defpackage.ebx
    public final void d(lds ldsVar) {
        if (!a(ldsVar)) {
            return;
        }
        this.b.remove(ldsVar);
        ArrayList arrayList = this.a.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            edx edxVar = (edx) arrayList.get(size);
            int i = edxVar.c;
            int i2 = i - 1;
            edxVar.c = i2;
            if (i > 0 && i2 == 0) {
                edxVar.b();
            }
        }
    }

    @Override // defpackage.ebx
    public final void e(lds ldsVar) {
        if (!a(ldsVar)) {
            return;
        }
        ArrayList arrayList = this.a.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((edx) arrayList.get(size)).c++;
        }
    }
}
