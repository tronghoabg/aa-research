package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ahoh {
    public static final defpackage.ahog Companion = new defpackage.ahog(null);
    private static final defpackage.ahoj ROOT_NAME = defpackage.ahoj.special("<root>");
    private static final java.util.regex.Pattern SPLIT_BY_DOTS;
    private final java.lang.String fqName;
    private transient defpackage.ahoh parent;
    private transient defpackage.ahof safe;
    private transient defpackage.ahoj shortName;

    static {
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("\\.");
        patternCompile.getClass();
        SPLIT_BY_DOTS = patternCompile;
    }

    public ahoh(java.lang.String str, defpackage.ahof ahofVar) {
        str.getClass();
        ahofVar.getClass();
        this.fqName = str;
        this.safe = ahofVar;
    }

    private final void compute() {
        int iIndexOfLastDotWithBackticksSupport = indexOfLastDotWithBackticksSupport(this.fqName);
        java.lang.String str = this.fqName;
        if (iIndexOfLastDotWithBackticksSupport < 0) {
            this.shortName = defpackage.ahoj.guessByFirstCharacter(str);
            this.parent = defpackage.ahof.ROOT.toUnsafe();
            return;
        }
        java.lang.String strSubstring = str.substring(iIndexOfLastDotWithBackticksSupport + 1);
        strSubstring.getClass();
        this.shortName = defpackage.ahoj.guessByFirstCharacter(strSubstring);
        java.lang.String strSubstring2 = this.fqName.substring(0, iIndexOfLastDotWithBackticksSupport);
        strSubstring2.getClass();
        this.parent = new defpackage.ahoh(strSubstring2);
    }

    private final int indexOfLastDotWithBackticksSupport(java.lang.String str) {
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

    private static final java.util.List<defpackage.ahoj> pathSegments$collectSegmentsOf(defpackage.ahoh ahohVar) {
        if (ahohVar.isRoot()) {
            return new java.util.ArrayList();
        }
        java.util.List<defpackage.ahoj> listPathSegments$collectSegmentsOf = pathSegments$collectSegmentsOf(ahohVar.parent());
        listPathSegments$collectSegmentsOf.add(ahohVar.shortName());
        return listPathSegments$collectSegmentsOf;
    }

    public final java.lang.String asString() {
        return this.fqName;
    }

    public final defpackage.ahoh child(defpackage.ahoj ahojVar) {
        java.lang.String strAsString;
        ahojVar.getClass();
        if (isRoot()) {
            strAsString = ahojVar.asString();
        } else {
            strAsString = this.fqName + '.' + ahojVar.asString();
        }
        strAsString.getClass();
        return new defpackage.ahoh(strAsString, this, ahojVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ahoh) && defpackage.afga.f(this.fqName, ((defpackage.ahoh) obj).fqName);
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }

    public final boolean isRoot() {
        return this.fqName.length() == 0;
    }

    public final boolean isSafe() {
        return this.safe != null || defpackage.afzh.D(asString(), '<', 0) < 0;
    }

    public final defpackage.ahoh parent() {
        defpackage.ahoh ahohVar = this.parent;
        if (ahohVar != null) {
            return ahohVar;
        }
        if (isRoot()) {
            throw new java.lang.IllegalStateException("root");
        }
        compute();
        defpackage.ahoh ahohVar2 = this.parent;
        ahohVar2.getClass();
        return ahohVar2;
    }

    public final java.util.List<defpackage.ahoj> pathSegments() {
        return pathSegments$collectSegmentsOf(this);
    }

    public final defpackage.ahoj shortName() {
        defpackage.ahoj ahojVar = this.shortName;
        if (ahojVar != null) {
            return ahojVar;
        }
        if (isRoot()) {
            throw new java.lang.IllegalStateException("root");
        }
        compute();
        defpackage.ahoj ahojVar2 = this.shortName;
        ahojVar2.getClass();
        return ahojVar2;
    }

    public final defpackage.ahoj shortNameOrSpecial() {
        return isRoot() ? ROOT_NAME : shortName();
    }

    public final boolean startsWith(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        if (isRoot()) {
            return false;
        }
        int iD = defpackage.afzh.D(this.fqName, '.', 0);
        if (iD == -1) {
            iD = this.fqName.length();
        }
        int i = iD;
        java.lang.String strAsString = ahojVar.asString();
        strAsString.getClass();
        return i == strAsString.length() && defpackage.afzh.f(this.fqName, 0, strAsString, 0, i, false);
    }

    public final defpackage.ahof toSafe() {
        defpackage.ahof ahofVar = this.safe;
        if (ahofVar != null) {
            return ahofVar;
        }
        defpackage.ahof ahofVar2 = new defpackage.ahof(this);
        this.safe = ahofVar2;
        return ahofVar2;
    }

    public java.lang.String toString() {
        if (!isRoot()) {
            return this.fqName;
        }
        java.lang.String strAsString = ROOT_NAME.asString();
        strAsString.getClass();
        return strAsString;
    }

    public /* synthetic */ ahoh(java.lang.String str, defpackage.ahoh ahohVar, defpackage.ahoj ahojVar, defpackage.affu affuVar) {
        this(str, ahohVar, ahojVar);
    }

    public ahoh(java.lang.String str) {
        str.getClass();
        this.fqName = str;
    }

    private ahoh(java.lang.String str, defpackage.ahoh ahohVar, defpackage.ahoj ahojVar) {
        this.fqName = str;
        this.parent = ahohVar;
        this.shortName = ahojVar;
    }
}
