package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class fax {
    public final String a;
    public final boolean b;
    public final List c;
    public List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public fax(String str, boolean z, List list, List list2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fax)) {
            return false;
        }
        fax faxVar = (fax) obj;
        if (this.b != faxVar.b || !affa.f(this.c, faxVar.c) || !affa.f(this.d, faxVar.d)) {
            return false;
        }
        String str = this.a;
        return afyh.g(str, "index_", false) ? afyh.g(faxVar.a, "index_", false) : affa.f(str, faxVar.a);
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((afyh.g(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return afyh.H(afyh.Q("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + crt.n(this.c) + "\n            |   orders = {" + crt.m(this.d) + "\n            |}\n        "));
    }
}
