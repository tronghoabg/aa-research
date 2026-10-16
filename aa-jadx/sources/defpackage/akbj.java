package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akbj implements java.util.Iterator {
    protected java.lang.String a;
    protected java.lang.String b;
    protected int c = a(-1);
    protected final defpackage.akbf d;

    public akbj(defpackage.akbf akbfVar) {
        this.d = akbfVar;
    }

    protected static final boolean c(char c) {
        if (java.lang.Character.isLetterOrDigit(c)) {
            return true;
        }
        return !java.lang.Character.isISOControl(c) && " ,;=()<>@:\\\"/[]?{}\t".indexOf(c) < 0;
    }

    protected static final boolean d(char c) {
        return c == ',';
    }

    protected static final boolean e(char c) {
        return c == '\t' || java.lang.Character.isSpaceChar(c);
    }

    protected final int a(int i) throws defpackage.ajqr {
        char cCharAt;
        boolean z;
        if (i < 0) {
            defpackage.akbf akbfVar = this.d;
            if (!akbfVar.hasNext()) {
                return -1;
            }
            this.a = akbfVar.b().c();
            i = 0;
        } else {
            int length = this.a.length();
            loop4: while (true) {
                boolean z2 = false;
                while (true) {
                    if (z2 || i >= length) {
                        break loop4;
                    }
                    cCharAt = this.a.charAt(i);
                    if (d(cCharAt)) {
                        z2 = true;
                    }
                }
                if (!e(cCharAt)) {
                    if (c(cCharAt)) {
                        throw new defpackage.ajqr("Tokens without separator (pos " + i + "): " + this.a);
                    }
                    throw new defpackage.ajqr("Invalid character after token (pos " + i + "): " + this.a);
                }
                i++;
            }
        }
        boolean z3 = false;
        while (!z3) {
            java.lang.String str = this.a;
            if (str == null) {
                i = -1;
                break;
            }
            while (true) {
                z = false;
                while (!z) {
                    if (i >= str.length()) {
                        defpackage.akbf akbfVar2 = this.d;
                        if (!akbfVar2.hasNext()) {
                            this.a = null;
                            break;
                        }
                        this.a = akbfVar2.b().c();
                        i = 0;
                        break;
                    }
                    char cCharAt2 = this.a.charAt(i);
                    if (d(cCharAt2) || e(cCharAt2)) {
                        i++;
                    } else {
                        if (!c(this.a.charAt(i))) {
                            throw new defpackage.ajqr("Invalid character before token (pos " + i + "): " + this.a);
                        }
                        z = true;
                    }
                }
                break;
            }
            z3 = z;
        }
        if (i < 0) {
            this.b = null;
            return -1;
        }
        int length2 = this.a.length();
        int i2 = i + 1;
        while (i2 < length2 && c(this.a.charAt(i2))) {
            i2++;
        }
        this.b = this.a.substring(i, i2);
        return i2;
    }

    public final java.lang.String b() throws defpackage.ajqr, java.util.NoSuchElementException {
        java.lang.String str = this.b;
        if (str == null) {
            throw new java.util.NoSuchElementException("Iteration already finished.");
        }
        this.c = a(this.c);
        return str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() throws defpackage.ajqr, java.util.NoSuchElementException {
        return b();
    }

    @Override // java.util.Iterator
    public final void remove() throws java.lang.UnsupportedOperationException {
        throw new java.lang.UnsupportedOperationException("Removing tokens is not supported.");
    }
}
