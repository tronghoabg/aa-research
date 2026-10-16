package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class ahhd implements defpackage.ahgf {
    private final java.util.List<java.lang.String> strings = new java.util.ArrayList();

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i == 1) {
            objArr[0] = "enumEntryName";
        } else if (i == 2) {
            objArr[0] = "classLiteralValue";
        } else if (i != 3) {
            objArr[0] = "enumClassId";
        } else {
            objArr[0] = "classId";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
        if (i == 2) {
            objArr[2] = "visitClassLiteral";
        } else if (i != 3) {
            objArr[2] = "visitEnum";
        } else {
            objArr[2] = "visitAnnotation";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.ahgf
    public void visit(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            this.strings.add((java.lang.String) obj);
        }
    }

    @Override // defpackage.ahgf
    public defpackage.ahge visitAnnotation(defpackage.ahod ahodVar) {
        if (ahodVar != null) {
            return null;
        }
        $$$reportNull$$$0(3);
        return null;
    }

    @Override // defpackage.ahgf
    public void visitClassLiteral(defpackage.ahvg ahvgVar) {
        if (ahvgVar == null) {
            $$$reportNull$$$0(2);
        }
    }

    @Override // defpackage.ahgf
    public void visitEnd() {
        visitEnd((java.lang.String[]) this.strings.toArray(new java.lang.String[0]));
    }

    protected abstract void visitEnd(java.lang.String[] strArr);

    @Override // defpackage.ahgf
    public void visitEnum(defpackage.ahod ahodVar, defpackage.ahoj ahojVar) {
        if (ahodVar == null) {
            $$$reportNull$$$0(0);
        }
        if (ahojVar == null) {
            $$$reportNull$$$0(1);
        }
    }
}
