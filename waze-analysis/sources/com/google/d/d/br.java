package com.google.d.d;

import java.io.Serializable;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class br implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Object f7464a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7465b;

    br(bs bsVar) {
        Object[] objArr = new Object[bsVar.size()];
        Object[] objArr2 = new Object[bsVar.size()];
        fu fuVarListIterator = bsVar.entrySet().listIterator();
        int i2 = 0;
        while (fuVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) fuVarListIterator.next();
            objArr[i2] = entry.getKey();
            objArr2[i2] = entry.getValue();
            i2++;
        }
        this.f7464a = objArr;
        this.f7465b = objArr2;
    }

    bq a(int i2) {
        return new bq(i2);
    }

    final Object readResolve() {
        Object obj = this.f7464a;
        boolean z = obj instanceof ci;
        Object obj2 = this.f7465b;
        if (z) {
            ci ciVar = (ci) obj;
            bq bqVarA = a(ciVar.size());
            fu fuVarListIterator = ciVar.listIterator();
            fu fuVarListIterator2 = ((bh) obj2).listIterator();
            while (fuVarListIterator.hasNext()) {
                bqVarA.d(fuVarListIterator.next(), fuVarListIterator2.next());
            }
            return bqVarA.b();
        }
        Object[] objArr = (Object[]) obj;
        Object[] objArr2 = (Object[]) obj2;
        bq bqVarA2 = a(objArr.length);
        for (int i2 = 0; i2 < objArr.length; i2++) {
            bqVarA2.d(objArr[i2], objArr2[i2]);
        }
        return bqVarA2.b();
    }
}
