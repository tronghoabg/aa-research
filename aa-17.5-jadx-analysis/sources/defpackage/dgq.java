package defpackage;

/* loaded from: classes.dex */
public final class dgq implements dgo {
    private final CharSequence a;
    private final dgp b;

    public dgq(CharSequence charSequence, dgp dgpVar) {
        this.a = charSequence;
        this.b = dgpVar;
    }

    @Override // defpackage.dgo
    public final int b(int i) {
        do {
            i = this.b.a(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }

    @Override // defpackage.dgo
    public final int c(int i) {
        CharSequence charSequence;
        do {
            i = this.b.a(i);
            if (i != -1) {
                charSequence = this.a;
                if (i == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.dgo
    public final int e(int i) {
        do {
            i = this.b.b(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }

    @Override // defpackage.dgo
    public final int f(int i) {
        do {
            i = this.b.b(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i)));
        return i;
    }
}
