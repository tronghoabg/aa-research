package Bf;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f1695a;

    public i(Pattern pattern) {
        this.f1695a = pattern;
    }

    public final Af.j a(CharSequence input) {
        AbstractC3340k.e(input, "input");
        if (input.length() >= 0) {
            return new Af.j(new g(0, this, input), h.f1694a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + input.length());
    }

    public final boolean b(String input) {
        AbstractC3340k.e(input, "input");
        return this.f1695a.matcher(input).matches();
    }

    public final String c(String input, String replacement) {
        AbstractC3340k.e(input, "input");
        AbstractC3340k.e(replacement, "replacement");
        String strReplaceAll = this.f1695a.matcher(input).replaceAll(replacement);
        AbstractC3340k.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f1695a.toString();
        AbstractC3340k.d(string, "toString(...)");
        return string;
    }

    public i(String pattern) {
        AbstractC3340k.e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC3340k.d(patternCompile, "compile(...)");
        this.f1695a = patternCompile;
    }
}
