package h.n;

import h.g.b.x;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class l implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f48250a;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(String str, m mVar) {
        x.f(str, "pattern");
        x.f(mVar, "option");
        int iA = mVar.a();
        Pattern patternCompile = Pattern.compile(str, (iA & 2) != 0 ? iA | 64 : iA);
        x.e(patternCompile, "compile(...)");
        this(patternCompile);
    }

    public static /* synthetic */ g h(l lVar, CharSequence charSequence) {
        return lVar.d(charSequence, 0);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.f48250a;
        String strPattern = pattern.pattern();
        x.e(strPattern, "pattern(...)");
        return new k(strPattern, pattern.flags());
    }

    public final String a() {
        String strPattern = this.f48250a.pattern();
        x.e(strPattern, "pattern(...)");
        return strPattern;
    }

    public final String b(CharSequence charSequence, String str) {
        x.f(charSequence, "input");
        x.f(str, "replacement");
        String strReplaceAll = this.f48250a.matcher(charSequence).replaceAll(str);
        x.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String c(CharSequence charSequence, h.g.a.l lVar) {
        x.f(charSequence, "input");
        x.f(lVar, "transform");
        g gVarH = h(this, charSequence);
        if (gVarH == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int iIntValue = 0;
        do {
            sb.append(charSequence, iIntValue, gVarH.c().getStart().intValue());
            sb.append((CharSequence) lVar.invoke(gVarH));
            iIntValue = gVarH.c().getEndInclusive().intValue() + 1;
            gVarH = gVarH.d();
            if (iIntValue >= length) {
                break;
            }
        } while (gVarH != null);
        if (iIntValue < length) {
            sb.append(charSequence, iIntValue, length);
        }
        String string = sb.toString();
        x.e(string, "toString(...)");
        return string;
    }

    public final g d(CharSequence charSequence, int i2) {
        x.f(charSequence, "input");
        Matcher matcher = this.f48250a.matcher(charSequence);
        x.e(matcher, "matcher(...)");
        return o.an(matcher, i2, charSequence);
    }

    public final g e(CharSequence charSequence) {
        x.f(charSequence, "input");
        Matcher matcher = this.f48250a.matcher(charSequence);
        x.e(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new j(matcher, charSequence);
        }
        return null;
    }

    public final boolean f(CharSequence charSequence) {
        x.f(charSequence, "input");
        return this.f48250a.matcher(charSequence).find();
    }

    public final boolean g(CharSequence charSequence) {
        x.f(charSequence, "input");
        return this.f48250a.matcher(charSequence).matches();
    }

    public final String i(CharSequence charSequence) {
        x.f(charSequence, "input");
        x.f("", "replacement");
        String strReplaceFirst = this.f48250a.matcher(charSequence).replaceFirst("");
        x.e(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    public final List j(CharSequence charSequence) {
        x.f(charSequence, "input");
        Matcher matcher = this.f48250a.matcher(charSequence);
        if (!matcher.find()) {
            return h.a.i.d(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.f48250a.toString();
        x.e(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(String str) {
        x.f(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        x.e(patternCompile, "compile(...)");
        this(patternCompile);
    }

    public l(Pattern pattern) {
        x.f(pattern, "nativePattern");
        this.f48250a = pattern;
    }
}
