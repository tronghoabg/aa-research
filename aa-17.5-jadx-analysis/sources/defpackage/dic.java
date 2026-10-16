package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class dic {
    public final List a;

    public dic(List list) {
        this.a = list;
        int i = did.a;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            String strA = ((dhz) list.get(i2)).a();
            i2++;
            int size2 = list.size();
            for (int i3 = i2; i3 < size2; i3++) {
                if (affa.f(strA, ((dhz) list.get(i3)).a())) {
                    ArrayList arrayList = new ArrayList();
                    int size3 = list.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        if (affa.f(((dhz) list.get(i4)).a(), strA)) {
                            arrayList.add(list.get(i4));
                        }
                    }
                    dka.c("'" + strA + "' must be unique. Actual [" + arrayList + "]");
                }
            }
        }
        int size4 = this.a.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((dhz) this.a.get(i5)).c();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dic) && affa.f(this.a, ((dic) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Settings(settings=" + this.a + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dic(dhz... dhzVarArr) {
        dhzVarArr.getClass();
        List listAsList = Arrays.asList(dhzVarArr);
        listAsList.getClass();
        this(listAsList);
    }
}
