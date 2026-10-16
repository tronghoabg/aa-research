package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahhj implements defpackage.ahge {
    final /* synthetic */ defpackage.ahhk this$0;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i == 1) {
            objArr[0] = "enumClassId";
        } else if (i == 2) {
            objArr[0] = "enumEntryName";
        } else if (i != 3) {
            objArr[0] = "classLiteralValue";
        } else {
            objArr[0] = "classId";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
        if (i == 1 || i == 2) {
            objArr[2] = "visitEnum";
        } else if (i != 3) {
            objArr[2] = "visitClassLiteral";
        } else {
            objArr[2] = "visitAnnotation";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private ahhj(defpackage.ahhk ahhkVar) {
        this.this$0 = ahhkVar;
    }

    private defpackage.ahgf dataArrayVisitor() {
        return new defpackage.ahhh(this);
    }

    private defpackage.ahgf stringsArrayVisitor() {
        return new defpackage.ahhi(this);
    }

    @Override // defpackage.ahge
    public void visit(defpackage.ahoj ahojVar, java.lang.Object obj) {
        if (ahojVar == null) {
            return;
        }
        java.lang.String strAsString = ahojVar.asString();
        if ("version".equals(strAsString)) {
            if (obj instanceof int[]) {
                this.this$0.metadataVersionArray = (int[]) obj;
            }
        } else if ("multifileClassName".equals(strAsString)) {
            this.this$0.extraString = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        }
    }

    @Override // defpackage.ahge
    public defpackage.ahge visitAnnotation(defpackage.ahoj ahojVar, defpackage.ahod ahodVar) {
        if (ahodVar != null) {
            return null;
        }
        $$$reportNull$$$0(3);
        return null;
    }

    @Override // defpackage.ahge
    public defpackage.ahgf visitArray(defpackage.ahoj ahojVar) {
        java.lang.String strAsString = ahojVar != null ? ahojVar.asString() : null;
        if ("data".equals(strAsString) || "filePartClassNames".equals(strAsString)) {
            return dataArrayVisitor();
        }
        if ("strings".equals(strAsString)) {
            return stringsArrayVisitor();
        }
        return null;
    }

    @Override // defpackage.ahge
    public void visitClassLiteral(defpackage.ahoj ahojVar, defpackage.ahvg ahvgVar) {
        if (ahvgVar == null) {
            $$$reportNull$$$0(0);
        }
    }

    @Override // defpackage.ahge
    public void visitEnum(defpackage.ahoj ahojVar, defpackage.ahod ahodVar, defpackage.ahoj ahojVar2) {
        if (ahodVar == null) {
            $$$reportNull$$$0(1);
        }
        if (ahojVar2 == null) {
            $$$reportNull$$$0(2);
        }
    }

    @Override // defpackage.ahge
    public void visitEnd() {
    }
}
