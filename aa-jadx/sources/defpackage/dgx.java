package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dgx implements defpackage.dgv {
    private final java.lang.CharSequence a;
    private final defpackage.dgw b;

    public dgx(java.lang.CharSequence charSequence, defpackage.dgw dgwVar) {
        this.a = charSequence;
        this.b = dgwVar;
    }

    @Override // defpackage.dgv
    public final int b(int i) {
        do {
            i = this.b.a(i);
            if (i == -1) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }

    @Override // defpackage.dgv
    public final int c(int i) {
        java.lang.CharSequence charSequence;
        do {
            i = this.b.a(i);
            if (i != -1) {
                charSequence = this.a;
                if (i == charSequence.length()) {
                }
            }
            return -1;
        } while (java.lang.Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.dgv
    public final int e(int i) {
        do {
            i = this.b.b(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }

    @Override // defpackage.dgv
    public final int f(int i) {
        do {
            i = this.b.b(i);
            if (i == -1) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(this.a.charAt(i)));
        return i;
    }
}
