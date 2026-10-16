package org.apache.tika.mime;

import java.util.Iterator;
import java.util.List;
import ka.AbstractC3256n;

/* loaded from: classes5.dex */
class MinShouldMatchClause implements Clause {
    private final List<Clause> clauses;
    private final int min;

    public MinShouldMatchClause(int i5, List<Clause> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("clauses must be not null with size > 0");
        }
        if (i5 > list.size()) {
            throw new IllegalArgumentException(N0.a.e("min (", i5, ") cannot be > clauses.size (", list.size(), ")"));
        }
        if (i5 <= 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "min cannot be <= 0: "));
        }
        this.min = i5;
        this.clauses = list;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        Iterator<Clause> it = this.clauses.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (it.next().eval(bArr) && (i5 = i5 + 1) >= this.min) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        Iterator<Clause> it = this.clauses.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().size());
        }
        return iMax;
    }

    public String toString() {
        return "minShouldMatch (min: " + this.min + ") " + this.clauses;
    }
}
