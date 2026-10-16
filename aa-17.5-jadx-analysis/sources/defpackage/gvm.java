package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class gvm extends gwc {
    public final geu a;
    public final aizk b = aizq.e(0, 1, 2, 1);
    private final aiyk c = new jyc(new jxz(this.n, 6), this.o, new grz(this, 3, (short[]) null), 5);

    public gvm(geu geuVar) {
        this.a = geuVar;
    }

    @Override // defpackage.gwc
    public final aiyk a() {
        return this.c;
    }

    public final fza d(gvn gvnVar, gzc gzcVar) {
        fzg fzgVar;
        if (gzcVar == gzc.b || (fzgVar = gvnVar.a) == null) {
            return null;
        }
        geu geuVar = this.a;
        fyy fyyVar = fyy.a;
        return fzc.d(fzgVar, geuVar, fwn.c(gzcVar));
    }

    public final List e(List list, int i) {
        int iD = fvq.d(list);
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                woy.bo();
            }
            arrayList.add(fvr.h((fvu) obj, this.a, null, i2 == i, fwh.c, null, null, false, iD, 114));
            i2 = i3;
        }
        return arrayList;
    }

    @Override // defpackage.gwc
    public final void f() {
        this.b.c(afak.a);
    }
}
