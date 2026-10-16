package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class abpi implements Iterator {
    private final ArrayDeque a;
    private abmp b;

    public abpi(abms abmsVar) {
        if (!(abmsVar instanceof abpk)) {
            this.a = null;
            this.b = (abmp) abmsVar;
            return;
        }
        abpk abpkVar = (abpk) abmsVar;
        ArrayDeque arrayDeque = new ArrayDeque(abpkVar.f);
        this.a = arrayDeque;
        arrayDeque.push(abpkVar);
        this.b = b(abpkVar.c);
    }

    private final abmp b(abms abmsVar) {
        while (abmsVar instanceof abpk) {
            abpk abpkVar = (abpk) abmsVar;
            this.a.push(abpkVar);
            int[] iArr = abpk.a;
            abmsVar = abpkVar.c;
        }
        return (abmp) abmsVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final abmp next() {
        abmp abmpVarB;
        abmp abmpVar = this.b;
        if (abmpVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            abmpVarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            abpk abpkVar = (abpk) arrayDeque.pop();
            int[] iArr = abpk.a;
            abmpVarB = b(abpkVar.e);
        } while (abmpVarB.B());
        this.b = abmpVarB;
        return abmpVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
