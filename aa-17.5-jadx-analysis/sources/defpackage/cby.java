package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class cby implements Iterator, afgc {
    public final cbx a;

    public cby(cbw cbwVar) {
        ccf[] ccfVarArr = new ccf[8];
        for (int i = 0; i < 8; i++) {
            ccfVarArr[i] = new cci(this);
        }
        this.a = new cbx(cbwVar, ccfVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (Map.Entry) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
