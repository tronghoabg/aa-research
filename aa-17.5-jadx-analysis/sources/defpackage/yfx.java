package defpackage;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
class yfx implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public yfx(yfy yfyVar) {
        Object[] objArr = new Object[yfyVar.size()];
        Object[] objArr2 = new Object[yfyVar.size()];
        yno it = yfyVar.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public yfu a(int i) {
        return new yfu(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        boolean z = obj instanceof ygr;
        Object obj2 = this.b;
        if (z) {
            ygr ygrVar = (ygr) obj;
            yfu yfuVarA = a(ygrVar.size());
            yno it = ygrVar.iterator();
            yno it2 = ((yfg) obj2).iterator();
            while (it.hasNext()) {
                yfuVarA.e(it.next(), it2.next());
            }
            return yfuVarA.b();
        }
        Object[] objArr = (Object[]) obj;
        yfu yfuVarA2 = a(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            yfuVarA2.e(objArr[i], ((Object[]) obj2)[i]);
        }
        return yfuVarA2.b();
    }
}
