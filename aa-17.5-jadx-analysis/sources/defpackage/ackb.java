package defpackage;

import java.lang.reflect.Array;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
final class ackb {
    public final String a;
    public final boolean b;
    public final acjl c;
    public final acjp d;

    public ackb(String str, Charset charset, boolean z, acjp acjpVar) {
        this.a = str;
        this.b = z;
        this.c = new acjl(str, charset);
        this.d = acjpVar;
    }

    static acjt a(acka ackaVar) {
        int iOrdinal = ackaVar.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? acjt.b(40) : acjt.b(26) : acjt.b(9);
    }

    static final void d(acjx[][][] acjxVarArr, int i, acjx acjxVar) {
        acjx[] acjxVarArr2 = acjxVarArr[i + acjxVar.d][acjxVar.c];
        acjq acjqVar = acjq.TERMINATOR;
        acjq acjqVar2 = acjxVar.a;
        int iOrdinal = acjqVar2.ordinal();
        char c = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                c = 1;
            } else if (iOrdinal == 4) {
                c = 3;
            } else {
                if (iOrdinal != 6) {
                    throw new IllegalStateException("Illegal mode ".concat(acjqVar2.toString()));
                }
                c = 0;
            }
        }
        acjx acjxVar2 = acjxVarArr2[c];
        if (acjxVar2 != null) {
            if (acjxVar2.f <= acjxVar.f) {
                return;
            }
        }
        acjxVarArr2[c] = acjxVar;
    }

    static final boolean e(acjq acjqVar, char c) {
        int iOrdinal = acjqVar.ordinal();
        if (iOrdinal == 1) {
            return c >= '0' && c <= '9';
        }
        if (iOrdinal == 2) {
            return acjv.a(c) != -1;
        }
        if (iOrdinal == 4) {
            return true;
        }
        if (iOrdinal != 6) {
            return false;
        }
        return acjv.e(String.valueOf(c));
    }

    final acjz b(acjt acjtVar) throws acji {
        int i;
        String str = this.a;
        int length = str.length();
        acjl acjlVar = this.c;
        acjx[][][] acjxVarArr = (acjx[][][]) Array.newInstance((Class<?>) acjx.class, length + 1, acjlVar.a(), 4);
        c(acjtVar, acjxVarArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < acjlVar.a(); i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    acjx acjxVar = acjxVarArr[i2][i3][i4];
                    if (acjxVar != null && i2 < length) {
                        c(acjtVar, acjxVarArr, i2, acjxVar);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < acjlVar.a(); i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                acjx acjxVar2 = acjxVarArr[length][i8][i9];
                if (acjxVar2 != null && (i = acjxVar2.f) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new acjz(this, acjtVar, acjxVarArr[length][i5][i7]);
        }
        throw new acji(a.bq(str, "Internal error: failed to encode \"", "\""));
    }

    final void c(acjt acjtVar, acjx[][][] acjxVarArr, int i, acjx acjxVar) {
        String str;
        int i2;
        acjl acjlVar = this.c;
        int i3 = acjlVar.b;
        int iA = acjlVar.a();
        int i4 = 0;
        if (i3 >= 0 && acjlVar.c(this.a.charAt(i), i3)) {
            iA = i3 + 1;
            i4 = i3;
        }
        int i5 = iA;
        while (true) {
            str = this.a;
            if (i4 >= i5) {
                break;
            }
            if (acjlVar.c(str.charAt(i), i4)) {
                d(acjxVarArr, i, new acjx(this, acjq.BYTE, i, i4, 1, acjxVar, acjtVar));
            }
            i4++;
        }
        acjq acjqVar = acjq.KANJI;
        if (e(acjqVar, str.charAt(i))) {
            d(acjxVarArr, i, new acjx(this, acjqVar, i, 0, 1, acjxVar, acjtVar));
        }
        int length = str.length();
        acjq acjqVar2 = acjq.ALPHANUMERIC;
        int i6 = 2;
        if (e(acjqVar2, str.charAt(i))) {
            int i7 = i + 1;
            d(acjxVarArr, i, new acjx(this, acjqVar2, i, 0, (i7 >= length || !e(acjqVar2, str.charAt(i7))) ? 1 : 2, acjxVar, acjtVar));
        }
        acjq acjqVar3 = acjq.NUMERIC;
        if (e(acjqVar3, str.charAt(i))) {
            int i8 = i + 1;
            if (i8 >= length || !e(acjqVar3, str.charAt(i8))) {
                i2 = 1;
            } else {
                int i9 = i + 2;
                if (i9 < length && e(acjqVar3, str.charAt(i9))) {
                    i6 = 3;
                }
                i2 = i6;
            }
            d(acjxVarArr, i, new acjx(this, acjqVar3, i, 0, i2, acjxVar, acjtVar));
        }
    }
}
