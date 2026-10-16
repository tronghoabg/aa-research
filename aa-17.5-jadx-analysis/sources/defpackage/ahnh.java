package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ahnh {
    public static final ahng Companion = new ahng(null);
    private static final ahnj ROOT_NAME = ahnj.special("<root>");
    private static final Pattern SPLIT_BY_DOTS;
    private final String fqName;
    private transient ahnh parent;
    private transient ahnf safe;
    private transient ahnj shortName;

    static {
        Pattern patternCompile = Pattern.compile("\\.");
        patternCompile.getClass();
        SPLIT_BY_DOTS = patternCompile;
    }

    public ahnh(String str, ahnf ahnfVar) {
        str.getClass();
        ahnfVar.getClass();
        this.fqName = str;
        this.safe = ahnfVar;
    }

    private final void compute() {
        int iIndexOfLastDotWithBackticksSupport = indexOfLastDotWithBackticksSupport(this.fqName);
        String str = this.fqName;
        if (iIndexOfLastDotWithBackticksSupport < 0) {
            this.shortName = ahnj.guessByFirstCharacter(str);
            this.parent = ahnf.ROOT.toUnsafe();
            return;
        }
        String strSubstring = str.substring(iIndexOfLastDotWithBackticksSupport + 1);
        strSubstring.getClass();
        this.shortName = ahnj.guessByFirstCharacter(strSubstring);
        String strSubstring2 = this.fqName.substring(0, iIndexOfLastDotWithBackticksSupport);
        strSubstring2.getClass();
        this.parent = new ahnh(strSubstring2);
    }

    private final int indexOfLastDotWithBackticksSupport(String str) {
        int length = str.length() - 1;
        boolean z = false;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt == '.') {
                if (!z) {
                    return length;
                }
                cCharAt = '.';
            }
            if (cCharAt == '`') {
                z = !z;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        return -1;
    }

    private static final List<ahnj> pathSegments$collectSegmentsOf(ahnh ahnhVar) {
        if (ahnhVar.isRoot()) {
            return new ArrayList();
        }
        List<ahnj> listPathSegments$collectSegmentsOf = pathSegments$collectSegmentsOf(ahnhVar.parent());
        listPathSegments$collectSegmentsOf.add(ahnhVar.shortName());
        return listPathSegments$collectSegmentsOf;
    }

    public final String asString() {
        return this.fqName;
    }

    public final ahnh child(ahnj ahnjVar) {
        String strAsString;
        ahnjVar.getClass();
        if (isRoot()) {
            strAsString = ahnjVar.asString();
        } else {
            strAsString = this.fqName + '.' + ahnjVar.asString();
        }
        strAsString.getClass();
        return new ahnh(strAsString, this, ahnjVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahnh) && affa.f(this.fqName, ((ahnh) obj).fqName);
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }

    public final boolean isRoot() {
        return this.fqName.length() == 0;
    }

    public final boolean isSafe() {
        return this.safe != null || afyh.D(asString(), '<', 0) < 0;
    }

    public final ahnh parent() {
        ahnh ahnhVar = this.parent;
        if (ahnhVar != null) {
            return ahnhVar;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        compute();
        ahnh ahnhVar2 = this.parent;
        ahnhVar2.getClass();
        return ahnhVar2;
    }

    public final List<ahnj> pathSegments() {
        return pathSegments$collectSegmentsOf(this);
    }

    public final ahnj shortName() {
        ahnj ahnjVar = this.shortName;
        if (ahnjVar != null) {
            return ahnjVar;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        compute();
        ahnj ahnjVar2 = this.shortName;
        ahnjVar2.getClass();
        return ahnjVar2;
    }

    public final ahnj shortNameOrSpecial() {
        return isRoot() ? ROOT_NAME : shortName();
    }

    public final boolean startsWith(ahnj ahnjVar) {
        ahnjVar.getClass();
        if (isRoot()) {
            return false;
        }
        int iD = afyh.D(this.fqName, '.', 0);
        if (iD == -1) {
            iD = this.fqName.length();
        }
        int i = iD;
        String strAsString = ahnjVar.asString();
        strAsString.getClass();
        return i == strAsString.length() && afyh.f(this.fqName, 0, strAsString, 0, i, false);
    }

    public final ahnf toSafe() {
        ahnf ahnfVar = this.safe;
        if (ahnfVar != null) {
            return ahnfVar;
        }
        ahnf ahnfVar2 = new ahnf(this);
        this.safe = ahnfVar2;
        return ahnfVar2;
    }

    public String toString() {
        if (!isRoot()) {
            return this.fqName;
        }
        String strAsString = ROOT_NAME.asString();
        strAsString.getClass();
        return strAsString;
    }

    public /* synthetic */ ahnh(String str, ahnh ahnhVar, ahnj ahnjVar, afeu afeuVar) {
        this(str, ahnhVar, ahnjVar);
    }

    public ahnh(String str) {
        str.getClass();
        this.fqName = str;
    }

    private ahnh(String str, ahnh ahnhVar, ahnj ahnjVar) {
        this.fqName = str;
        this.parent = ahnhVar;
        this.shortName = ahnjVar;
    }
}
