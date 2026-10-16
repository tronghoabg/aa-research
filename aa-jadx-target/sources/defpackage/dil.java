package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dil implements java.lang.Comparable {
    public static final defpackage.dil a;
    public static final defpackage.dil b;
    public static final defpackage.dil c;
    public static final defpackage.dil d;
    public static final defpackage.dil e;
    public static final defpackage.dil f;
    public static final defpackage.dil g;
    public static final defpackage.dil h;
    public static final defpackage.dil i;
    public static final defpackage.dil j;
    public static final defpackage.dil k;
    public static final defpackage.dil l;
    public static final defpackage.dil m;
    public static final defpackage.dil n;
    public final int o;

    static {
        defpackage.dil dilVar = new defpackage.dil(100);
        a = dilVar;
        defpackage.dil dilVar2 = new defpackage.dil(200);
        b = dilVar2;
        defpackage.dil dilVar3 = new defpackage.dil(300);
        c = dilVar3;
        defpackage.dil dilVar4 = new defpackage.dil(400);
        d = dilVar4;
        defpackage.dil dilVar5 = new defpackage.dil(500);
        e = dilVar5;
        defpackage.dil dilVar6 = new defpackage.dil(600);
        f = dilVar6;
        defpackage.dil dilVar7 = new defpackage.dil(700);
        g = dilVar7;
        defpackage.dil dilVar8 = new defpackage.dil(800);
        h = dilVar8;
        defpackage.dil dilVar9 = new defpackage.dil(900);
        i = dilVar9;
        j = dilVar;
        k = dilVar4;
        l = dilVar5;
        m = dilVar6;
        n = dilVar7;
        defpackage.afga.ac(dilVar, dilVar2, dilVar3, dilVar4, dilVar5, dilVar6, dilVar7, dilVar8, dilVar9);
    }

    public dil(int i2) {
        this.o = i2;
        if (i2 <= 0 || i2 >= 1001) {
            defpackage.dki.c(defpackage.a.bo(i2, "Font weight can be in range [1, 1000]. Current value: "));
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.dil dilVar) {
        return defpackage.afga.b(this.o, dilVar.o);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.dil) && this.o == ((defpackage.dil) obj).o;
    }

    public final int hashCode() {
        return this.o;
    }

    public final java.lang.String toString() {
        return "FontWeight(weight=" + this.o + ")";
    }
}
