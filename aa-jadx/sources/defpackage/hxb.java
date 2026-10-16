package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hxb implements java.lang.Appendable {
    private final java.lang.Appendable a;
    private boolean b = true;

    public hxb(java.lang.Appendable appendable) {
        this.a = appendable;
    }

    private static final java.lang.CharSequence a(java.lang.CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
        boolean z = false;
        if (this.b) {
            this.b = false;
            this.a.append("  ");
        }
        java.lang.CharSequence charSequenceA = a(charSequence);
        if (charSequenceA.length() > 0 && charSequenceA.charAt(i2 - 1) == '\n') {
            z = true;
        }
        this.b = z;
        this.a.append(charSequenceA, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence charSequence) throws java.io.IOException {
        java.lang.CharSequence charSequenceA = a(charSequence);
        append(charSequenceA, 0, charSequenceA.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(char c) throws java.io.IOException {
        if (this.b) {
            this.b = false;
            this.a.append("  ");
        }
        this.b = c == '\n';
        this.a.append(c);
        return this;
    }
}
