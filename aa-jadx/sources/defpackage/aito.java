package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aito implements java.io.Serializable {
    public final java.util.regex.Pattern a;

    /* JADX WARN: Illegal instructions before constructor call */
    public aito(java.lang.String str, byte[] bArr) {
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(str, 66);
        patternCompile.getClass();
        this(patternCompile);
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() {
        java.util.regex.Pattern pattern = this.a;
        java.lang.String strPattern = pattern.pattern();
        strPattern.getClass();
        return new defpackage.aitm(strPattern, pattern.flags());
    }

    public final java.lang.String a() {
        java.lang.String strPattern = this.a.pattern();
        strPattern.getClass();
        return strPattern;
    }

    public final java.lang.String b(java.lang.CharSequence charSequence, java.lang.String str) {
        charSequence.getClass();
        java.lang.String strReplaceAll = this.a.matcher(charSequence).replaceAll(str);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final defpackage.aiti c(java.lang.CharSequence charSequence, int i) {
        java.util.regex.Matcher matcherRegion = this.a.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        matcherRegion.getClass();
        return new defpackage.aitl(matcherRegion, charSequence);
    }

    public final defpackage.aiti d(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.util.regex.Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new defpackage.aitl(matcher, charSequence);
        }
        return null;
    }

    public final boolean e(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).find();
    }

    public final boolean f(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).matches();
    }

    public final defpackage.aiti g(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.util.regex.Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        return defpackage.ahxk.a(matcher, 0, charSequence);
    }

    public final java.lang.String toString() {
        java.lang.String string = this.a.toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aito(java.lang.String str) {
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(str);
        patternCompile.getClass();
        this(patternCompile);
    }

    public aito(java.util.regex.Pattern pattern) {
        this.a = pattern;
    }
}
