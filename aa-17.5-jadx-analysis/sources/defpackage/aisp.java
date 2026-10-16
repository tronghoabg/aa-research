package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class aisp implements Serializable {
    public final Pattern a;

    /* JADX WARN: Illegal instructions before constructor call */
    public aisp(String str, byte[] bArr) {
        Pattern patternCompile = Pattern.compile(str, 66);
        patternCompile.getClass();
        this(patternCompile);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.a;
        String strPattern = pattern.pattern();
        strPattern.getClass();
        return new aisn(strPattern, pattern.flags());
    }

    public final String a() {
        String strPattern = this.a.pattern();
        strPattern.getClass();
        return strPattern;
    }

    public final String b(CharSequence charSequence, String str) {
        charSequence.getClass();
        String strReplaceAll = this.a.matcher(charSequence).replaceAll(str);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final aisj c(CharSequence charSequence, int i) {
        Matcher matcherRegion = this.a.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        matcherRegion.getClass();
        return new aism(matcherRegion, charSequence);
    }

    public final aisj d(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new aism(matcher, charSequence);
        }
        return null;
    }

    public final boolean e(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).find();
    }

    public final boolean f(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).matches();
    }

    public final aisj g(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        return aihs.a(matcher, 0, charSequence);
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aisp(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this(patternCompile);
    }

    public aisp(Pattern pattern) {
        this.a = pattern;
    }
}
