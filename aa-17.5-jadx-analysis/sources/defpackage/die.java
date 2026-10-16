package defpackage;

/* loaded from: classes.dex */
public final class die implements Comparable {
    public static final die a;
    public static final die b;
    public static final die c;
    public static final die d;
    public static final die e;
    public static final die f;
    public static final die g;
    public static final die h;
    public static final die i;
    public static final die j;
    public static final die k;
    public static final die l;
    public static final die m;
    public static final die n;
    public final int o;

    static {
        die dieVar = new die(100);
        a = dieVar;
        die dieVar2 = new die(200);
        b = dieVar2;
        die dieVar3 = new die(300);
        c = dieVar3;
        die dieVar4 = new die(400);
        d = dieVar4;
        die dieVar5 = new die(500);
        e = dieVar5;
        die dieVar6 = new die(600);
        f = dieVar6;
        die dieVar7 = new die(700);
        g = dieVar7;
        die dieVar8 = new die(800);
        h = dieVar8;
        die dieVar9 = new die(900);
        i = dieVar9;
        j = dieVar;
        k = dieVar4;
        l = dieVar5;
        m = dieVar6;
        n = dieVar7;
        woy.bi(dieVar, dieVar2, dieVar3, dieVar4, dieVar5, dieVar6, dieVar7, dieVar8, dieVar9);
    }

    public die(int i2) {
        this.o = i2;
        if (i2 <= 0 || i2 >= 1001) {
            dka.c(a.bp(i2, "Font weight can be in range [1, 1000]. Current value: "));
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(die dieVar) {
        return affa.b(this.o, dieVar.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof die) && this.o == ((die) obj).o;
    }

    public final int hashCode() {
        return this.o;
    }

    public final String toString() {
        return "FontWeight(weight=" + this.o + ")";
    }
}
