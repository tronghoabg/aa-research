package S;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class k extends ff.j implements Q.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10821a;

    /* renamed from: b, reason: collision with root package name */
    public final c f10822b;

    public /* synthetic */ k(c cVar, int i5) {
        this.f10821a = i5;
        this.f10822b = cVar;
    }

    @Override // ff.AbstractC2646a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f10821a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!(entry instanceof Map.Entry)) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.f10822b;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f10822b.containsKey(obj);
        }
    }

    @Override // ff.AbstractC2646a
    public final int getSize() {
        switch (this.f10821a) {
            case 0:
                c cVar = this.f10822b;
                cVar.getClass();
                return cVar.f10801b;
            default:
                c cVar2 = this.f10822b;
                cVar2.getClass();
                return cVar2.f10801b;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f10821a) {
            case 0:
                c cVar = this.f10822b;
                o[] oVarArr = new o[8];
                for (int i5 = 0; i5 < 8; i5++) {
                    oVarArr[i5] = new p(0);
                }
                return new l(cVar.f10800a, oVarArr);
            default:
                c cVar2 = this.f10822b;
                o[] oVarArr2 = new o[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    oVarArr2[i10] = new p(1);
                }
                return new l(cVar2.f10800a, oVarArr2);
        }
    }
}
