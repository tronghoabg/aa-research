package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class akfe {
    private final ArrayList a = new ArrayList();
    private Object b;

    private final Object G() {
        Object akerVar = this.b;
        if (akerVar == null) {
            ArrayList arrayList = this.a;
            if (arrayList.size() == 2) {
                Object obj = arrayList.get(0);
                Object obj2 = arrayList.get(1);
                if (obj == null) {
                    akerVar = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    akerVar = obj;
                }
            }
            if (akerVar == null) {
                akerVar = new aker(arrayList);
            }
            this.b = akerVar;
        }
        return akerVar;
    }

    private static final void H(akfm akfmVar) {
        if (akfmVar == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private static final boolean I(Object obj) {
        if (obj instanceof akfl) {
            return ((obj instanceof aker) && ((aker) obj).b == null) ? false : true;
        }
        return false;
    }

    static void b(Appendable appendable, int i) throws IOException {
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                appendable.append((char) 65533);
            }
        }
    }

    static boolean c(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    static boolean d(CharSequence charSequence, int i, String str) {
        char upperCase;
        char upperCase2;
        int length = charSequence.length() - i;
        int length2 = str.length();
        if (length < length2) {
            return false;
        }
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt = charSequence.charAt(i + i2);
            char cCharAt2 = str.charAt(i2);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    public final void A(int i) {
        n(akch.t, i, 2);
    }

    public final void B(int i) {
        n(akch.h, i, 2);
    }

    public final void C(int i) {
        n(akch.v, i, 2);
    }

    public final void D(int i) {
        n(akch.l, i, 2);
    }

    public final void E(int i, int i2) {
        t(akch.k, i, i2);
    }

    public final void F(int i, int i2) {
        t(akch.f, i, i2);
    }

    public final akep a() {
        Object objG = G();
        akfn akfnVar = (!(objG instanceof akfn) || ((objG instanceof aker) && ((aker) objG).a == null)) ? null : (akfn) objG;
        akfl akflVar = I(objG) ? (akfl) objG : null;
        if (akfnVar == null && akflVar == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new akep(akfnVar, akflVar);
    }

    public final akfm e() {
        Object objG = G();
        if (I(objG)) {
            return akfm.b((akfl) objG);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public final void f(Object obj) {
        this.b = null;
        ArrayList arrayList = this.a;
        arrayList.add(obj);
        arrayList.add(obj);
    }

    public final void g(akfn akfnVar, akfl akflVar) {
        this.b = null;
        ArrayList arrayList = this.a;
        arrayList.add(akfnVar);
        arrayList.add(akflVar);
    }

    public final void h(akch akchVar) {
        f(new akey(akchVar, true));
    }

    public final void i(akch akchVar) {
        f(new akey(akchVar, false));
    }

    public final void j(boolean z) {
        f(new akfb(null, "Z", z, 2));
    }

    public final void k(akep akepVar) {
        if (akepVar == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        g(akepVar.a, akepVar.b);
    }

    public final void l(akfm akfmVar) {
        H(akfmVar);
        g(null, akfi.b(akfmVar));
    }

    public final void m(akfm[] akfmVarArr) {
        int length = akfmVarArr.length;
        akfl[] akflVarArr = new akfl[length];
        int i = 0;
        while (i < length - 1) {
            akfl akflVarB = akfi.b(akfmVarArr[i]);
            akflVarArr[i] = akflVarB;
            if (akflVarB == null) {
                throw new IllegalArgumentException("Incomplete parser array");
            }
            i++;
        }
        akflVarArr[i] = akfi.b(akfmVarArr[i]);
        g(null, new akeu(akflVarArr));
    }

    public final void n(akch akchVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i <= 1) {
            f(new akfd(akchVar, i2, false));
        } else {
            f(new akew(akchVar, i2, false, i));
        }
    }

    public final void o(akch akchVar, int i) {
        f(new akes(akchVar, i));
    }

    public final void p(akch akchVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        f(new aket(akchVar, i, i2));
    }

    public final void q(char c) {
        f(new akeq(c));
    }

    public final void r(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                f(new akex(str));
            } else {
                f(new akeq(str.charAt(0)));
            }
        }
    }

    public final void s(akfm akfmVar) {
        H(akfmVar);
        g(null, new akeu(new akfl[]{akfi.b(akfmVar), null}));
    }

    public final void t(akch akchVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i <= 1) {
            f(new akfd(akchVar, i2, true));
        } else {
            f(new akew(akchVar, i2, true, i));
        }
    }

    public final void u(String str, boolean z, int i) {
        f(new akfb(str, str, z, i));
    }

    public final void v(int i) {
        n(akch.i, i, 2);
    }

    public final void w(int i) {
        n(akch.m, i, 1);
    }

    public final void x(int i) {
        n(akch.g, i, 3);
    }

    public final void y(int i, int i2) {
        p(akch.u, i, i2);
    }

    public final void z(int i) {
        n(akch.r, i, 2);
    }
}
