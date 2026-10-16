package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ahxd {
    private defpackage.ahof fqName;
    private final java.lang.String internalName;

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str;
        int i2;
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i != 5) {
            switch (i) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    private ahxd(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        this.internalName = str;
    }

    public static defpackage.ahxd byClassId(defpackage.ahod ahodVar) {
        if (ahodVar == null) {
            $$$reportNull$$$0(1);
        }
        return new defpackage.ahxd(internalNameByClassId(ahodVar));
    }

    public static defpackage.ahxd byFqNameWithoutInnerClasses(defpackage.ahof ahofVar) {
        if (ahofVar == null) {
            $$$reportNull$$$0(4);
        }
        defpackage.ahxd ahxdVar = new defpackage.ahxd(ahofVar.asString().replace('.', '/'));
        ahxdVar.fqName = ahofVar;
        return ahxdVar;
    }

    public static defpackage.ahxd byInternalName(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(0);
        }
        return new defpackage.ahxd(str);
    }

    public static java.lang.String internalNameByClassId(defpackage.ahod ahodVar) {
        if (ahodVar == null) {
            $$$reportNull$$$0(2);
        }
        defpackage.ahof packageFqName = ahodVar.getPackageFqName();
        java.lang.String strReplace = ahodVar.getRelativeClassName().asString().replace('.', '$');
        if (!packageFqName.isRoot()) {
            strReplace = packageFqName.asString().replace('.', '/') + "/" + strReplace;
        }
        if (strReplace == null) {
            $$$reportNull$$$0(3);
        }
        return strReplace;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.internalName.equals(((defpackage.ahxd) obj).internalName);
    }

    public defpackage.ahof getFqNameForTopLevelClassMaybeWithDollars() {
        return new defpackage.ahof(this.internalName.replace('/', '.'));
    }

    public java.lang.String getInternalName() {
        java.lang.String str = this.internalName;
        if (str == null) {
            $$$reportNull$$$0(10);
        }
        return str;
    }

    public defpackage.ahof getPackageFqName() {
        int iLastIndexOf = this.internalName.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new defpackage.ahof(this.internalName.substring(0, iLastIndexOf).replace('/', '.'));
        }
        defpackage.ahof ahofVar = defpackage.ahof.ROOT;
        if (ahofVar == null) {
            $$$reportNull$$$0(9);
        }
        return ahofVar;
    }

    public int hashCode() {
        return this.internalName.hashCode();
    }

    public java.lang.String toString() {
        return this.internalName;
    }
}
