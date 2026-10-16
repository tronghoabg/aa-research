package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ahoj implements java.lang.Comparable<defpackage.ahoj> {
    private final java.lang.String name;
    private final boolean special;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    private ahoj(java.lang.String str, boolean z) {
        if (str == null) {
            $$$reportNull$$$0(0);
        }
        this.name = str;
        this.special = z;
    }

    public static defpackage.ahoj guessByFirstCharacter(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(9);
        }
        return str.startsWith("<") ? special(str) : identifier(str);
    }

    public static defpackage.ahoj identifier(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(5);
        }
        return new defpackage.ahoj(str, false);
    }

    public static boolean isValidIdentifier(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static defpackage.ahoj special(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(8);
        }
        if (str.startsWith("<")) {
            return new defpackage.ahoj(str, true);
        }
        throw new java.lang.IllegalArgumentException("special name must start with '<': ".concat(java.lang.String.valueOf(str)));
    }

    public java.lang.String asString() {
        java.lang.String str = this.name;
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        return str;
    }

    public java.lang.String asStringStripSpecialMarkers() {
        if (isSpecial()) {
            java.lang.String strSubstring = asString().substring(1, asString().length() - 1);
            if (strSubstring == null) {
                $$$reportNull$$$0(3);
            }
            return strSubstring;
        }
        java.lang.String strAsString = asString();
        if (strAsString == null) {
            $$$reportNull$$$0(4);
        }
        return strAsString;
    }

    @Override // java.lang.Comparable
    public int compareTo(defpackage.ahoj ahojVar) {
        return this.name.compareTo(ahojVar.name);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ahoj)) {
            return false;
        }
        defpackage.ahoj ahojVar = (defpackage.ahoj) obj;
        return this.special == ahojVar.special && this.name.equals(ahojVar.name);
    }

    public java.lang.String getIdentifier() {
        if (this.special) {
            toString();
            throw new java.lang.IllegalStateException("not identifier: ".concat(toString()));
        }
        java.lang.String strAsString = asString();
        if (strAsString == null) {
            $$$reportNull$$$0(2);
        }
        return strAsString;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + (this.special ? 1 : 0);
    }

    public boolean isSpecial() {
        return this.special;
    }

    public java.lang.String toString() {
        return this.name;
    }
}
