package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ccb<K, V> extends afax<K> implements Set<K>, Collection<K>, j$.util.Set<K>, afgc {
    private final cbu a;
    private final /* synthetic */ int b;

    public ccb(cbu cbuVar, int i) {
        this.b = i;
        this.a = cbuVar;
    }

    @Override // defpackage.afam
    public final int a() {
        int i = this.b;
        return this.a.a();
    }

    @Override // defpackage.afam, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.b == 0) {
            return this.a.containsKey(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        cbu cbuVar = this.a;
        V v = cbuVar.get(entry.getKey());
        return v != null ? affa.f(v, entry.getValue()) : entry.getValue() == null && cbuVar.containsKey(entry.getKey());
    }

    @Override // defpackage.afax, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = 0;
        if (this.b != 0) {
            ccf[] ccfVarArr = new ccf[8];
            while (i < 8) {
                ccfVarArr[i] = new ccg();
                i++;
            }
            return new cbv(this.a.b, ccfVarArr);
        }
        ccf[] ccfVarArr2 = new ccf[8];
        while (i < 8) {
            ccfVarArr2[i] = new cch();
            i++;
        }
        return new cbv(this.a.b, ccfVarArr2);
    }
}
