package kotlin.reflect.jvm.internal.impl.renderer;

import Bf.r;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class RenderingUtilsKt {
    @NotNull
    public static final String render(@NotNull Name name) {
        AbstractC3340k.e(name, "<this>");
        if (!shouldBeEscaped(name)) {
            String strAsString = name.asString();
            AbstractC3340k.d(strAsString, "asString(...)");
            return strAsString;
        }
        StringBuilder sb2 = new StringBuilder();
        String strAsString2 = name.asString();
        AbstractC3340k.d(strAsString2, "asString(...)");
        sb2.append("`".concat(strAsString2));
        sb2.append('`');
        return sb2.toString();
    }

    @NotNull
    public static final String renderFqName(@NotNull List<Name> pathSegments) {
        AbstractC3340k.e(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        for (Name name : pathSegments) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(render(name));
        }
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        return string;
    }

    @Nullable
    public static final String replacePrefixesInTypeRepresentations(@NotNull String lowerRendered, @NotNull String lowerPrefix, @NotNull String upperRendered, @NotNull String upperPrefix, @NotNull String foldedPrefix) {
        AbstractC3340k.e(lowerRendered, "lowerRendered");
        AbstractC3340k.e(lowerPrefix, "lowerPrefix");
        AbstractC3340k.e(upperRendered, "upperRendered");
        AbstractC3340k.e(upperPrefix, "upperPrefix");
        AbstractC3340k.e(foldedPrefix, "foldedPrefix");
        if (!r.k0(lowerRendered, lowerPrefix, false) || !r.k0(upperRendered, upperPrefix, false)) {
            return null;
        }
        String strSubstring = lowerRendered.substring(lowerPrefix.length());
        AbstractC3340k.d(strSubstring, "substring(...)");
        String strSubstring2 = upperRendered.substring(upperPrefix.length());
        AbstractC3340k.d(strSubstring2, "substring(...)");
        String strConcat = foldedPrefix.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!typeStringsDifferOnlyInNullability(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    private static final boolean shouldBeEscaped(Name name) {
        String strAsString = name.asString();
        AbstractC3340k.d(strAsString, "asString(...)");
        if (KeywordStringsGenerated.KEYWORDS.contains(strAsString)) {
            return true;
        }
        for (int i5 = 0; i5 < strAsString.length(); i5++) {
            char cCharAt = strAsString.charAt(i5);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return strAsString.length() == 0 || !Character.isJavaIdentifierStart(strAsString.codePointAt(0));
    }

    public static final boolean typeStringsDifferOnlyInNullability(@NotNull String lower, @NotNull String upper) {
        AbstractC3340k.e(lower, "lower");
        AbstractC3340k.e(upper, "upper");
        if (lower.equals(r.h0(upper, "?", "", false))) {
            return true;
        }
        if (r.b0(upper, "?", false) && AbstractC3340k.a(lower.concat("?"), upper)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(lower);
        sb2.append(")?");
        return AbstractC3340k.a(sb2.toString(), upper);
    }

    @NotNull
    public static final String render(@NotNull FqNameUnsafe fqNameUnsafe) {
        AbstractC3340k.e(fqNameUnsafe, "<this>");
        List<Name> listPathSegments = fqNameUnsafe.pathSegments();
        AbstractC3340k.d(listPathSegments, "pathSegments(...)");
        return renderFqName(listPathSegments);
    }
}
