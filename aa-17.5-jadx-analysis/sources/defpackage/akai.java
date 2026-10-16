package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class akai implements Cloneable, Serializable {
    private static final long serialVersionUID = -2443303766890459269L;
    public final ajpt a;
    public final int b;
    public final String c;

    public akai(ajpt ajptVar, int i, String str) {
        ahgm.e(ajptVar, "Version");
        this.a = ajptVar;
        ahgm.d(i, "Status code");
        this.b = i;
        this.c = str;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String toString() {
        akbh akbhVarB = akad.b(null);
        ajpt ajptVar = this.a;
        int iA = akad.a(ajptVar) + 5;
        String str = this.c;
        if (str != null) {
            iA += str.length();
        }
        akbhVarB.j(iA);
        akad.c(akbhVarB, ajptVar);
        akbhVarB.e(' ');
        akbhVarB.f(Integer.toString(this.b));
        akbhVarB.e(' ');
        if (str != null) {
            akbhVarB.f(str);
        }
        return akbhVarB.toString();
    }
}
