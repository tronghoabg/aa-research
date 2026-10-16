package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akbe implements defpackage.akbn {
    public static final defpackage.akbe a;
    public final defpackage.ajqt b = defpackage.ajqm.c;

    static {
        new defpackage.akbe();
        a = new defpackage.akbe();
    }

    protected static final void b(defpackage.akch akchVar, defpackage.akbo akboVar) {
        int i = akboVar.b;
        while (i < akboVar.a && defpackage.akbz.a(akchVar.charAt(i))) {
            i++;
        }
        akboVar.a(i);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090 A[Catch: IndexOutOfBoundsException -> 0x014b, TryCatch #0 {IndexOutOfBoundsException -> 0x014b, blocks: (B:3:0x0004, B:10:0x0023, B:14:0x0030, B:16:0x0035, B:21:0x0042, B:24:0x004d, B:26:0x0058, B:29:0x005f, B:30:0x0067, B:32:0x0073, B:45:0x0095, B:48:0x00a1, B:49:0x00a5, B:52:0x00ad, B:54:0x00b7, B:55:0x00ba, B:56:0x00d2, B:57:0x00d3, B:59:0x00d9, B:61:0x00e0, B:63:0x00e6, B:64:0x00fe, B:37:0x007f, B:39:0x0084, B:43:0x008d, B:44:0x0090, B:65:0x00ff, B:66:0x010e, B:69:0x011f, B:70:0x012e, B:67:0x010f, B:68:0x011e, B:71:0x012f, B:72:0x013c, B:73:0x013d, B:74:0x014a), top: B:77:0x0004, inners: #1, #2, #3 }] */
    @Override // defpackage.akbn
    public final defpackage.akbi a(defpackage.akch akchVar, defpackage.akbo akboVar) throws defpackage.ajqr {
        int i = akboVar.b;
        int i2 = akboVar.a;
        try {
            java.lang.String str = this.b.d;
            int length = str.length();
            b(akchVar, akboVar);
            int i3 = akboVar.b;
            int i4 = i3 + length;
            if (i4 + 4 > i2) {
                throw new defpackage.ajqr("Not a valid protocol version: ".concat(akchVar.c(i, i2)));
            }
            boolean z = true;
            for (int i5 = 0; z && i5 < length; i5++) {
                z = akchVar.charAt(i3 + i5) == str.charAt(i5);
            }
            if (z) {
                z = akchVar.charAt(i4) == '/';
            }
            if (!z) {
                throw new defpackage.ajqr("Not a valid protocol version: ".concat(akchVar.c(i, i2)));
            }
            int i6 = i3 + length + 1;
            int iB = akchVar.b(46, i6, i2);
            if (iB == -1) {
                throw new defpackage.ajqr("Invalid protocol version number: ".concat(akchVar.c(i, i2)));
            }
            try {
                int i7 = java.lang.Integer.parseInt(akchVar.d(i6, iB));
                int i8 = iB + 1;
                int iB2 = akchVar.b(32, i8, i2);
                if (iB2 == -1) {
                    iB2 = i2;
                }
                try {
                    int i9 = java.lang.Integer.parseInt(akchVar.d(i8, iB2));
                    akboVar.a(iB2);
                    defpackage.ajqt ajqmVar = this.b;
                    if (i7 != ((defpackage.ajqm) ajqmVar).e || i9 != ((defpackage.ajqm) ajqmVar).f) {
                        if (i7 != 1) {
                            if (i7 == 0 || i9 != 9) {
                                ajqmVar = new defpackage.ajqm(i7, i9);
                            } else {
                                ajqmVar = defpackage.ajqm.a;
                            }
                        } else if (i9 == 0) {
                            ajqmVar = defpackage.ajqm.b;
                        } else if (i9 == 1) {
                            ajqmVar = defpackage.ajqm.c;
                        } else if (i7 == 0) {
                            ajqmVar = new defpackage.ajqm(i7, i9);
                        } else {
                            ajqmVar = new defpackage.ajqm(i7, i9);
                        }
                    }
                    b(akchVar, akboVar);
                    int i10 = akboVar.b;
                    int iB3 = akchVar.b(32, i10, i2);
                    if (iB3 < 0) {
                        iB3 = i2;
                    }
                    java.lang.String strD = akchVar.d(i10, iB3);
                    for (int i11 = 0; i11 < strD.length(); i11++) {
                        if (!java.lang.Character.isDigit(strD.charAt(i11))) {
                            throw new defpackage.ajqr("Status line contains invalid status code: " + akchVar.c(i, i2));
                        }
                    }
                    try {
                        return new defpackage.akbi(ajqmVar, java.lang.Integer.parseInt(strD), iB3 < i2 ? akchVar.d(iB3, i2) : "");
                    } catch (java.lang.NumberFormatException unused) {
                        throw new defpackage.ajqr("Status line contains invalid status code: " + akchVar.c(i, i2));
                    }
                } catch (java.lang.NumberFormatException unused2) {
                    throw new defpackage.ajqr("Invalid protocol minor version number: ".concat(akchVar.c(i, i2)));
                }
            } catch (java.lang.NumberFormatException unused3) {
                throw new defpackage.ajqr("Invalid protocol major version number: ".concat(akchVar.c(i, i2)));
            }
        } catch (java.lang.IndexOutOfBoundsException unused4) {
            throw new defpackage.ajqr("Invalid status line: ".concat(akchVar.c(i, i2)));
        }
    }
}
