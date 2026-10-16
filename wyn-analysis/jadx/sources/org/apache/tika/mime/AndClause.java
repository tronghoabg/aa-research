package org.apache.tika.mime;

import R8.v;
import java.util.Arrays;

/* loaded from: classes5.dex */
class AndClause implements Clause {
    private final Clause[] clauses;

    public AndClause(Clause... clauseArr) {
        this.clauses = clauseArr;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        for (Clause clause : this.clauses) {
            if (!clause.eval(bArr)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        int size = 0;
        for (Clause clause : this.clauses) {
            size += clause.size();
        }
        return size;
    }

    public String toString() {
        return v.f("and", Arrays.toString(this.clauses));
    }
}
