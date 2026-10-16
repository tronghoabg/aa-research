package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {
    public final ArrayList a = new ArrayList();

    public final void a(m mVar) {
        float f;
        float f2;
        float f3;
        ArrayList arrayList = this.a;
        arrayList.clear();
        int i = 1;
        while (true) {
            int i2 = mVar.e;
            f = BitmapDescriptorFactory.HUE_RED;
            if (i >= i2) {
                break;
            }
            n nVar = ((n[]) mVar.g.b)[i];
            for (int i3 = 0; i3 < 6; i3++) {
                nVar.e[i3] = 0.0f;
            }
            nVar.e[nVar.c] = 1.0f;
            if (nVar.h == 4) {
                arrayList.add(nVar);
            }
            i++;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            n nVar2 = (n) arrayList.get(i4);
            int i5 = nVar2.b;
            if (i5 != -1) {
                j jVar = mVar.c[i5].d;
                int i6 = jVar.a;
                int i7 = 0;
                while (i7 < i6) {
                    n nVarD = jVar.d(i7);
                    if (nVarD == null) {
                        f3 = f;
                    } else {
                        float fB = jVar.b(i7);
                        int i8 = 0;
                        while (i8 < 6) {
                            float[] fArr = nVarD.e;
                            fArr[i8] = fArr[i8] + (nVar2.e[i8] * fB);
                            i8++;
                            f = f;
                        }
                        f3 = f;
                        if (!arrayList.contains(nVarD)) {
                            arrayList.add(nVarD);
                        }
                    }
                    i7++;
                    f = f3;
                }
                f2 = f;
                for (int i9 = 0; i9 < 6; i9++) {
                    nVar2.e[i9] = f2;
                }
            } else {
                f2 = f;
            }
            i4++;
            f = f2;
        }
    }

    public final String toString() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        String strConcat = "Goal: ";
        for (int i = 0; i < size; i++) {
            n nVar = (n) arrayList.get(i);
            Objects.toString(nVar);
            String strConcat2 = "null[";
            int i2 = 0;
            while (true) {
                float[] fArr = nVar.e;
                if (i2 < 6) {
                    strConcat2 = (strConcat2 + fArr[i2]).concat(i2 < 5 ? ", " : "] ");
                    i2++;
                }
            }
            strConcat = strConcat.concat(strConcat2);
        }
        return strConcat;
    }
}
