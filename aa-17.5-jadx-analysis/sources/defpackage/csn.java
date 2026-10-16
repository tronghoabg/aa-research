package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
final class csn implements cvj {
    private final String b;
    private final cvj[] c;
    private final cuq d;
    private final cuq e;

    public csn(String str, cvj[] cvjVarArr) {
        this.b = str;
        this.c = cvjVarArr;
        ArrayList arrayList = new ArrayList(cvjVarArr.length);
        for (cvj cvjVar : cvjVarArr) {
            arrayList.add(cvjVar.a());
        }
        cuq[] cuqVarArr = (cuq[]) arrayList.toArray(new cuq[0]);
        this.d = new cur((cuq[]) Arrays.copyOf(cuqVarArr, cuqVarArr.length), 1);
        cvj[] cvjVarArr2 = this.c;
        ArrayList arrayList2 = new ArrayList(cvjVarArr2.length);
        for (cvj cvjVar2 : cvjVarArr2) {
            arrayList2.add(cvjVar2.b());
        }
        cuq[] cuqVarArr2 = (cuq[]) arrayList2.toArray(new cuq[0]);
        this.e = new cur((cuq[]) Arrays.copyOf(cuqVarArr2, cuqVarArr2.length), 1);
    }

    @Override // defpackage.cvj
    public final cuq a() {
        return this.d;
    }

    @Override // defpackage.cvj
    public final cuq b() {
        return this.e;
    }

    public final String toString() {
        return this.b;
    }
}
