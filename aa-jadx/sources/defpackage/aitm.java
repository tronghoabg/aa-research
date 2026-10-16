package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aitm implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.lang.String a;
    private final int b;

    public aitm(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }

    private final java.lang.Object readResolve() {
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(this.a, this.b);
        patternCompile.getClass();
        return new defpackage.aito(patternCompile);
    }
}
