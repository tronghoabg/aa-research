package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class acld {
    public final java.lang.String a;
    public final boolean b;
    public final defpackage.ackn c;
    public final defpackage.ackr d;

    public acld(java.lang.String str, java.nio.charset.Charset charset, boolean z, defpackage.ackr ackrVar) {
        this.a = str;
        this.b = z;
        this.c = new defpackage.ackn(str, charset);
        this.d = ackrVar;
    }

    static defpackage.ackv a(defpackage.aclc aclcVar) {
        int iOrdinal = aclcVar.ordinal();
        if (iOrdinal != 0) {
            return iOrdinal != 1 ? defpackage.ackv.b(40) : defpackage.ackv.b(26);
        }
        return defpackage.ackv.b(9);
    }

    static final void d(defpackage.ackz[][][] ackzVarArr, int i, defpackage.ackz ackzVar) {
        defpackage.ackz[] ackzVarArr2 = ackzVarArr[i + ackzVar.d][ackzVar.c];
        defpackage.acks acksVar = defpackage.acks.TERMINATOR;
        defpackage.acks acksVar2 = ackzVar.a;
        int iOrdinal = acksVar2.ordinal();
        char c = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                c = 1;
            } else if (iOrdinal == 4) {
                c = 3;
            } else {
                if (iOrdinal != 6) {
                    throw new java.lang.IllegalStateException("Illegal mode ".concat(acksVar2.toString()));
                }
                c = 0;
            }
        }
        defpackage.ackz ackzVar2 = ackzVarArr2[c];
        if (ackzVar2 != null) {
            if (ackzVar2.f <= ackzVar.f) {
                return;
            }
        }
        ackzVarArr2[c] = ackzVar;
    }

    static final boolean e(defpackage.acks acksVar, char c) {
        int iOrdinal = acksVar.ordinal();
        if (iOrdinal == 1) {
            return c >= '0' && c <= '9';
        }
        if (iOrdinal == 2) {
            return defpackage.ackx.a(c) != -1;
        }
        if (iOrdinal == 4) {
            return true;
        }
        if (iOrdinal != 6) {
            return false;
        }
        return defpackage.ackx.e(java.lang.String.valueOf(c));
    }

    final defpackage.aclb b(defpackage.ackv ackvVar) throws defpackage.ackk {
        int i;
        java.lang.String str = this.a;
        int length = str.length();
        defpackage.ackn acknVar = this.c;
        defpackage.ackz[][][] ackzVarArr = (defpackage.ackz[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) defpackage.ackz.class, length + 1, acknVar.a(), 4);
        c(ackvVar, ackzVarArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < acknVar.a(); i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    defpackage.ackz ackzVar = ackzVarArr[i2][i3][i4];
                    if (ackzVar != null && i2 < length) {
                        c(ackvVar, ackzVarArr, i2, ackzVar);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < acknVar.a(); i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                defpackage.ackz ackzVar2 = ackzVarArr[length][i8][i9];
                if (ackzVar2 != null && (i = ackzVar2.f) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new defpackage.aclb(this, ackvVar, ackzVarArr[length][i5][i7]);
        }
        throw new defpackage.ackk(defpackage.a.bp(str, "Internal error: failed to encode \"", "\""));
    }

    final void c(defpackage.ackv ackvVar, defpackage.ackz[][][] ackzVarArr, int i, defpackage.ackz ackzVar) {
        java.lang.String str;
        int i2;
        defpackage.ackn acknVar = this.c;
        int i3 = acknVar.b;
        int iA = acknVar.a();
        int i4 = 0;
        if (i3 >= 0 && acknVar.c(this.a.charAt(i), i3)) {
            iA = i3 + 1;
            i4 = i3;
        }
        int i5 = iA;
        while (true) {
            str = this.a;
            if (i4 >= i5) {
                break;
            }
            if (acknVar.c(str.charAt(i), i4)) {
                d(ackzVarArr, i, new defpackage.ackz(this, defpackage.acks.BYTE, i, i4, 1, ackzVar, ackvVar));
            }
            i4++;
        }
        defpackage.acks acksVar = defpackage.acks.KANJI;
        if (e(acksVar, str.charAt(i))) {
            d(ackzVarArr, i, new defpackage.ackz(this, acksVar, i, 0, 1, ackzVar, ackvVar));
        }
        int length = str.length();
        defpackage.acks acksVar2 = defpackage.acks.ALPHANUMERIC;
        int i6 = 2;
        if (e(acksVar2, str.charAt(i))) {
            int i7 = i + 1;
            d(ackzVarArr, i, new defpackage.ackz(this, acksVar2, i, 0, (i7 >= length || !e(acksVar2, str.charAt(i7))) ? 1 : 2, ackzVar, ackvVar));
        }
        defpackage.acks acksVar3 = defpackage.acks.NUMERIC;
        if (e(acksVar3, str.charAt(i))) {
            int i8 = i + 1;
            if (i8 >= length || !e(acksVar3, str.charAt(i8))) {
                i2 = 1;
            } else {
                int i9 = i + 2;
                if (i9 < length && e(acksVar3, str.charAt(i9))) {
                    i6 = 3;
                }
                i2 = i6;
            }
            d(ackzVarArr, i, new defpackage.ackz(this, acksVar3, i, 0, i2, ackzVar, ackvVar));
        }
    }
}
