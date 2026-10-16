package defpackage;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class zzj extends zza {
    @Override // defpackage.zza
    protected final void b(zzf zzfVar) {
        this.b.b(zzfVar, false);
    }

    @Override // defpackage.zza
    protected final boolean c(zzf zzfVar) {
        return this.b.d(zzfVar, false);
    }

    @Override // defpackage.zza
    public final boolean e() {
        return true;
    }

    @Override // defpackage.zza
    protected final boolean g(zzf zzfVar) {
        return this.b.c(zzfVar, false);
    }

    @Override // defpackage.zza
    public final int h(long j, LinkedList linkedList, List list) {
        if (linkedList.size() < 3) {
            return 2;
        }
        sb sbVar = (sb) linkedList.getLast();
        float fE = sbVar.e();
        ListIterator listIterator = linkedList.listIterator(linkedList.size());
        sb sbVar2 = sbVar;
        while (listIterator.hasPrevious()) {
            sb sbVar3 = (sb) listIterator.previous();
            if (sbVar3.k() != sbVar.k()) {
                break;
            }
            if (Math.abs(a.I(fE, sbVar3.e())) > 0.17453292f) {
                return 1;
            }
            sbVar2 = sbVar3;
        }
        return Math.abs(sbVar2.f() - sbVar.f()) / ((sbVar.h() + sbVar.j()) * 0.5f) < (true != list.isEmpty() ? 0.2f : 0.1f) ? 2 : 3;
    }
}
