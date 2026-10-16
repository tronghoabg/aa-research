package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dev {
    public static final deu a = new deu("");

    public static final List a(deu deuVar, int i, int i2, afec afecVar) {
        List list;
        if (i == i2 || (list = deuVar.a) == null) {
            return null;
        }
        if (i == 0) {
            if (i2 >= deuVar.b.length()) {
                if (afecVar == null) {
                    return list;
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj = list.get(i3);
                    if (((Boolean) afecVar.invoke(((det) obj).a)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            i = 0;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            det detVar = (det) list.get(i4);
            if (afecVar == null || ((Boolean) afecVar.invoke(detVar.a)).booleanValue()) {
                int i5 = detVar.b;
                int i6 = detVar.c;
                if ((((i == i2) | (i5 == i6)) & (i == i5)) | ((i5 < i2) & (i < i6))) {
                    arrayList2.add(new det((deq) detVar.a, afpt.g(i5, i, i2) - i, afpt.g(i6, i, i2) - i, detVar.d));
                }
            }
        }
        return arrayList2;
    }
}
