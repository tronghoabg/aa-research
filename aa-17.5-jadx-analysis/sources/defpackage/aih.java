package defpackage;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
final class aih implements agr {
    private final List a;

    public aih(List list) {
        this.a = list;
    }

    private final aezu f(long j) {
        Object objPrevious;
        List list = this.a;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((Number) ((aezu) objPrevious).a).longValue() <= j) {
                break;
            }
        }
        aezu aezuVar = (aezu) objPrevious;
        return aezuVar == null ? (aezu) woy.bF(list) : aezuVar;
    }

    @Override // defpackage.agn
    public final long a(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        aezu aezuVar = (aezu) woy.bK(this.a);
        return ((Number) aezuVar.a).longValue() + ((agr) aezuVar.b).a(aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final /* synthetic */ aei b(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return afp.o(this, aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei c(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        aezu aezuVarF = f(j);
        return ((agr) aezuVarF.b).c(j - ((Number) aezuVarF.a).longValue(), aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei d(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        aezu aezuVarF = f(j);
        return ((agr) aezuVarF.b).d(j - ((Number) aezuVarF.a).longValue(), aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final /* synthetic */ boolean e() {
        return false;
    }
}
