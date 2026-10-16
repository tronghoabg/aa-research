package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class yfu {
    Object[] a;
    int b;
    zre c;

    public yfu(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }

    private final void a(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, yff.f(length, i2));
        }
    }

    public yfy b() {
        return d(true);
    }

    public final yfy d(boolean z) {
        zre zreVar;
        zre zreVar2;
        if (z && (zreVar2 = this.c) != null) {
            throw zreVar2.g();
        }
        ylx ylxVarA = ylx.a(this.b, this.a, this);
        if (!z || (zreVar = this.c) == null) {
            return ylxVarA;
        }
        throw zreVar.g();
    }

    public void e(Object obj, Object obj2) {
        a(this.b + 1);
        wub.E(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }

    public final void f(yfu yfuVar) {
        yfuVar.getClass();
        a(this.b + yfuVar.b);
        Object[] objArr = yfuVar.a;
        Object[] objArr2 = this.a;
        int i = this.b;
        int i2 = yfuVar.b;
        System.arraycopy(objArr, 0, objArr2, i + i, i2 + i2);
        this.b += yfuVar.b;
    }

    public final void g(Iterable iterable) {
        if (iterable instanceof Collection) {
            a(this.b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            e(entry.getKey(), entry.getValue());
        }
    }

    public final void h(Map map) {
        g(map.entrySet());
    }

    public yfu() {
        throw null;
    }
}
