package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class akak implements Cloneable, Serializable, ajoy {
    private static final long serialVersionUID = -2768352615787625448L;
    public final akbh a;
    public final int b;
    private final String c;

    public akak(akbh akbhVar) throws ajpr {
        ahgm.e(akbhVar, "Char array buffer");
        int iA = akbhVar.a(58);
        if (iA == -1) {
            throw new ajpr("Invalid header: ".concat(akbhVar.toString()));
        }
        String strD = akbhVar.d(0, iA);
        if (strD.isEmpty()) {
            throw new ajpr("Invalid header: ".concat(akbhVar.toString()));
        }
        this.a = akbhVar;
        this.c = strD;
        this.b = iA + 1;
    }

    @Override // defpackage.ajoy
    public final ajzy[] a() throws ajpr {
        akbh akbhVar = this.a;
        akao akaoVar = new akao(0, akbhVar.b);
        akaoVar.a(this.b);
        return akaa.a.b(akbhVar, akaoVar);
    }

    @Override // defpackage.ajpp
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ajpp
    public final String c() {
        akbh akbhVar = this.a;
        return akbhVar.d(this.b, akbhVar.b);
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String toString() {
        return this.a.toString();
    }
}
