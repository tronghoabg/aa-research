package com.google.d.d;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class co extends cg {

    /* renamed from: d, reason: collision with root package name */
    private final Comparator f7505d;

    public co(Comparator comparator) {
        com.google.d.b.an.B(comparator);
        this.f7505d = comparator;
    }

    @Override // com.google.d.d.cg, com.google.d.d.bf, com.google.d.d.bg
    public final /* synthetic */ void b(Object obj) {
        super.b(obj);
    }

    public final cq j() {
        fc fcVar;
        Object[] objArrCopyOf = this.f7446a;
        int i2 = this.f7447b;
        Comparator comparator = this.f7505d;
        if (i2 == 0) {
            fcVar = cq.E(comparator);
        } else {
            fo.s(objArrCopyOf, i2);
            Arrays.sort(objArrCopyOf, 0, i2, comparator);
            int i3 = 1;
            for (int i4 = 1; i4 < i2; i4++) {
                Object obj = objArrCopyOf[i4];
                if (comparator.compare(obj, objArrCopyOf[i3 - 1]) != 0) {
                    objArrCopyOf[i3] = obj;
                    i3++;
                }
            }
            Arrays.fill(objArrCopyOf, i3, i2, (Object) null);
            if (i3 < (objArrCopyOf.length >> 1)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            }
            fcVar = new fc(bn.l(objArrCopyOf, i3), comparator);
        }
        this.f7447b = fcVar.size();
        this.f7448c = true;
        return fcVar;
    }

    public final void k(Object obj) {
        super.b(obj);
    }

    public final void l(Object... objArr) {
        super.g(objArr);
    }
}
