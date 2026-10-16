package S;

import ff.AbstractC2646a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m extends AbstractC2646a {

    /* renamed from: a, reason: collision with root package name */
    public final c f10823a;

    public m(c cVar) {
        this.f10823a = cVar;
    }

    @Override // ff.AbstractC2646a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f10823a.containsValue(obj);
    }

    @Override // ff.AbstractC2646a
    public final int getSize() {
        c cVar = this.f10823a;
        cVar.getClass();
        return cVar.f10801b;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c cVar = this.f10823a;
        o[] oVarArr = new o[8];
        for (int i5 = 0; i5 < 8; i5++) {
            oVarArr[i5] = new p(2);
        }
        return new l(cVar.f10800a, oVarArr);
    }
}
