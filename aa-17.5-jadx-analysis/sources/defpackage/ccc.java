package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ccc<K, V> extends afam<V> implements Collection<V>, j$.util.Collection<V>, afgc {
    private final cbu a;

    public ccc(cbu cbuVar) {
        this.a = cbuVar;
    }

    @Override // defpackage.afam
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.afam, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        ccf[] ccfVarArr = new ccf[8];
        for (int i = 0; i < 8; i++) {
            ccfVarArr[i] = new ccj();
        }
        return new cbv(this.a.b, ccfVarArr);
    }
}
