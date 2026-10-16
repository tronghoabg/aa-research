package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahui {
    private static final defpackage.ahui SUCCESS = new defpackage.ahui(defpackage.ahuh.OVERRIDABLE, com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.SUCCESS);
    private final java.lang.String debugMessage;
    private final defpackage.ahuh overridable;

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 3 : 2];
        if (i == 1 || i == 2) {
            objArr[0] = "debugMessage";
        } else if (i == 3) {
            objArr[0] = "success";
        } else if (i != 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
        } else {
            objArr[0] = "debugMessage";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                break;
            case 5:
                objArr[1] = "getResult";
                break;
            case 6:
                objArr[1] = "getDebugMessage";
                break;
            default:
                objArr[1] = "success";
                break;
        }
        if (i == 1) {
            objArr[2] = "incompatible";
        } else if (i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new java.lang.IllegalStateException(str2);
        }
        throw new java.lang.IllegalArgumentException(str2);
    }

    public ahui(defpackage.ahuh ahuhVar, java.lang.String str) {
        if (ahuhVar == null) {
            $$$reportNull$$$0(3);
        }
        if (str == null) {
            $$$reportNull$$$0(4);
        }
        this.overridable = ahuhVar;
        this.debugMessage = str;
    }

    public static defpackage.ahui conflict(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(2);
        }
        return new defpackage.ahui(defpackage.ahuh.CONFLICT, str);
    }

    public static defpackage.ahui incompatible(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        return new defpackage.ahui(defpackage.ahuh.INCOMPATIBLE, str);
    }

    public static defpackage.ahui success() {
        defpackage.ahui ahuiVar = SUCCESS;
        if (ahuiVar == null) {
            $$$reportNull$$$0(0);
        }
        return ahuiVar;
    }

    public defpackage.ahuh getResult() {
        defpackage.ahuh ahuhVar = this.overridable;
        if (ahuhVar == null) {
            $$$reportNull$$$0(5);
        }
        return ahuhVar;
    }

    public java.lang.String toString() {
        return this.overridable + ": " + this.debugMessage;
    }
}
