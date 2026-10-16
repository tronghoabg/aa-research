package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fch implements java.lang.AutoCloseable {
    public final defpackage.fbs a;

    public fch(defpackage.fbs fbsVar) {
        this.a = fbsVar;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    public final defpackage.fbr a(java.lang.String str) {
        java.lang.String strSubstring;
        int i;
        str.getClass();
        defpackage.fbs fbsVar = this.a;
        if (!fbsVar.h()) {
            defpackage.csc.l(21, "connection is closed");
            throw new defpackage.afap();
        }
        java.lang.String string = defpackage.afzh.k(str).toString();
        string.getClass();
        int length = string.length() - 2;
        int i2 = -1;
        int i3 = 1;
        if (length >= 0) {
            int iD = 0;
            loop0: while (iD < length) {
                char cCharAt = string.charAt(iD);
                if (defpackage.afga.b(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iD2 = iD + 1;
                            if (string.charAt(iD2) == '*') {
                                do {
                                    iD2 = defpackage.afzh.D(string, '*', iD2 + 1);
                                    if (iD2 >= 0) {
                                        i = iD2 + 1;
                                        if (i >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (string.charAt(i) != '/');
                                iD = iD2 + 2;
                            }
                        }
                        i2 = iD;
                        break;
                    }
                    if (string.charAt(iD + 1) != '-') {
                        i2 = iD;
                        break;
                    }
                    iD = defpackage.afzh.D(string, '\n', iD + 2);
                    if (iD < 0) {
                        break;
                    }
                }
                iD++;
            }
        }
        defpackage.fci fciVar = null;
        if (i2 < 0 || i2 > string.length()) {
            strSubstring = null;
        } else {
            strSubstring = string.substring(i2, java.lang.Math.min(i2 + 3, string.length()));
            strSubstring.getClass();
        }
        if (strSubstring == null) {
            return new defpackage.fck(fbsVar, str);
        }
        if (!defpackage.afzh.R("END", strSubstring) && !defpackage.afzh.R("COM", strSubstring)) {
            if (defpackage.afzh.R("ROL", strSubstring)) {
                if (defpackage.afzh.u(string, " TO ", true)) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
            } else if (!defpackage.afzh.R("BEG", strSubstring)) {
                i3 = 0;
            } else if (defpackage.afzh.u(string, "EXCLUSIVE", true)) {
                i3 = 3;
            } else {
                i3 = defpackage.afzh.u(string, "IMMEDIATE", true) ? 4 : 5;
            }
        }
        if (i3 != 0) {
            return new defpackage.fcm(fbsVar, str, i3);
        }
        if (defpackage.afzh.R("PRA", strSubstring)) {
            java.lang.String lowerCase = string.toLowerCase(java.util.Locale.ROOT);
            lowerCase.getClass();
            if (defpackage.afzh.u(defpackage.afzh.o(lowerCase, "journal_mode", ""), "=", false)) {
                fciVar = defpackage.fci.a;
            }
        }
        if (fciVar instanceof defpackage.fci) {
            return new defpackage.fcj(fbsVar, str, new defpackage.fcl(fbsVar, str));
        }
        return (defpackage.afzh.R("SEL", strSubstring) || defpackage.afzh.R("PRA", strSubstring) || defpackage.afzh.R("WIT", strSubstring)) ? new defpackage.fcl(fbsVar, str) : new defpackage.fck(fbsVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
