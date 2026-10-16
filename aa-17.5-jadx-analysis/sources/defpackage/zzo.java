package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class zzo extends zza {
    @Override // defpackage.zza
    protected final void b(zzf zzfVar) {
        this.b.b(zzfVar, true);
    }

    @Override // defpackage.zza
    protected final boolean c(zzf zzfVar) {
        return this.b.d(zzfVar, true);
    }

    @Override // defpackage.zza
    public final boolean d() {
        return true;
    }

    @Override // defpackage.zza
    public final boolean e() {
        return true;
    }

    @Override // defpackage.zza
    public final boolean f() {
        return true;
    }

    @Override // defpackage.zza
    protected final boolean g(zzf zzfVar) {
        return this.b.c(zzfVar, true);
    }

    @Override // defpackage.zza
    public final int h(long j, LinkedList linkedList, List list) {
        sb sbVar;
        sb sbVar2;
        Iterator it = linkedList.iterator();
        while (true) {
            sbVar = null;
            if (!it.hasNext()) {
                sbVar2 = null;
                break;
            }
            sbVar2 = (sb) it.next();
            if (sbVar2.k() == 2) {
                break;
            }
        }
        ListIterator listIterator = linkedList.listIterator(linkedList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            sb sbVar3 = (sb) listIterator.previous();
            if (sbVar3.k() == 2) {
                sbVar = sbVar3;
                break;
            }
        }
        if (sbVar2 == null || sbVar == null || sbVar.l() - j > 300) {
            return 1;
        }
        return Math.max(Math.max(Math.abs(sbVar.g(0) - sbVar2.g(0)) / sbVar.h(), Math.abs(sbVar.i(0) - sbVar2.i(0)) / sbVar.j()), Math.max(Math.abs(sbVar.g(1) - sbVar2.g(1)) / sbVar.h(), Math.abs(sbVar.i(1) - sbVar2.i(1)) / sbVar.j())) > 0.125f ? 1 : 3;
    }
}
