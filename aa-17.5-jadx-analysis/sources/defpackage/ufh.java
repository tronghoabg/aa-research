package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ufh {
    public final toq a;
    public final ukb[] b;

    public ufh(toq toqVar, long[] jArr) {
        this.a = toqVar;
        this.b = new ukb[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            this.b[i] = new ukb(jArr[i]);
        }
    }

    public final List a(List list) {
        ArrayList arrayListS = yrm.S(list.size());
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            toq toqVar = (toq) it.next();
            int iC = toqVar.c() + i;
            ukb[] ukbVarArr = this.b;
            arrayListS.add(new ufh(toqVar, ukbVarArr == null ? null : (ukb[]) Arrays.copyOfRange(ukbVarArr, i, iC)));
            i = iC - 2;
        }
        return arrayListS;
    }

    public final List b(boolean z) {
        toq toqVarA = this.a;
        int iC = toqVarA.c();
        top topVar = new top(iC, 0, 0, 0);
        topVar.d = toqVarA.i;
        too tooVar = new too();
        boolean z2 = false;
        for (int i = 0; i < iC; i++) {
            int i2 = true != z ? -1 : 0;
            toqVarA.o(i, tooVar);
            if (z) {
                int i3 = tooVar.a;
                if (i3 < i2) {
                    tooVar.a = i3 + 1073741824;
                    z2 = true;
                }
            } else {
                int i4 = tooVar.a;
                if (i4 > i2) {
                    tooVar.a = i4 - 1073741824;
                    z2 = true;
                }
            }
            topVar.c(tooVar);
        }
        if (z2) {
            toqVarA = topVar.a();
        }
        return a(toqVarA.m(true != z ? -1073741824 : 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ufh) {
            ufh ufhVar = (ufh) obj;
            if (this.a.equals(ufhVar.a) && Arrays.equals(this.b, ufhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(Arrays.hashCode(this.b)));
    }

    public ufh(toq toqVar, ukb[] ukbVarArr) {
        this.a = toqVar;
        this.b = ukbVarArr;
    }

    public ufh(toq toqVar) {
        this.a = toqVar;
        this.b = null;
    }
}
