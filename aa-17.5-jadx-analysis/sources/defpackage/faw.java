package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class faw {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public faw(String str, String str2, String str3, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof faw)) {
            return false;
        }
        faw fawVar = (faw) obj;
        if (affa.f(this.a, fawVar.a) && affa.f(this.b, fawVar.b) && affa.f(this.c, fawVar.c) && affa.f(this.d, fawVar.d)) {
            return affa.f(this.e, fawVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return afyh.H(afyh.Q("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + crt.n(woy.cb(this.d)) + "\n            |   referenceColumnNames = {" + crt.m(woy.cb(this.e)) + "\n            |}\n        "));
    }
}
