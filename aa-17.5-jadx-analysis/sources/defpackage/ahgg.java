package defpackage;

/* loaded from: classes3.dex */
final class ahgg implements ahfe {
    final /* synthetic */ ahgk this$0;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "enumClassId";
        } else if (i == 2) {
            objArr[0] = "enumEntryName";
        } else if (i != 3) {
            objArr[0] = "classLiteralValue";
        } else {
            objArr[0] = "classId";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
        if (i == 1 || i == 2) {
            objArr[2] = "visitEnum";
        } else if (i != 3) {
            objArr[2] = "visitClassLiteral";
        } else {
            objArr[2] = "visitAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private ahgg(ahgk ahgkVar) {
        this.this$0 = ahgkVar;
    }

    private ahff dataArrayVisitor() {
        return new ahge(this);
    }

    private ahff stringsArrayVisitor() {
        return new ahgf(this);
    }

    @Override // defpackage.ahfe
    public void visit(ahnj ahnjVar, Object obj) {
        if (ahnjVar == null) {
            return;
        }
        String strAsString = ahnjVar.asString();
        if ("k".equals(strAsString)) {
            if (obj instanceof Integer) {
                this.this$0.headerKind = ahga.getById(((Integer) obj).intValue());
                return;
            }
            return;
        }
        if ("mv".equals(strAsString)) {
            if (obj instanceof int[]) {
                this.this$0.metadataVersionArray = (int[]) obj;
                return;
            }
            return;
        }
        if ("xs".equals(strAsString)) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.isEmpty()) {
                    return;
                }
                this.this$0.extraString = str;
                return;
            }
            return;
        }
        if ("xi".equals(strAsString)) {
            if (obj instanceof Integer) {
                this.this$0.extraInt = ((Integer) obj).intValue();
                return;
            }
            return;
        }
        if ("pn".equals(strAsString) && (obj instanceof String)) {
            String str2 = (String) obj;
            if (str2.isEmpty()) {
                return;
            }
            this.this$0.packageName = str2;
        }
    }

    @Override // defpackage.ahfe
    public ahfe visitAnnotation(ahnj ahnjVar, ahnd ahndVar) {
        if (ahndVar != null) {
            return null;
        }
        $$$reportNull$$$0(3);
        return null;
    }

    @Override // defpackage.ahfe
    public ahff visitArray(ahnj ahnjVar) {
        String strAsString = ahnjVar != null ? ahnjVar.asString() : null;
        if ("d1".equals(strAsString)) {
            return dataArrayVisitor();
        }
        if ("d2".equals(strAsString)) {
            return stringsArrayVisitor();
        }
        return null;
    }

    @Override // defpackage.ahfe
    public void visitClassLiteral(ahnj ahnjVar, ahug ahugVar) {
        if (ahugVar == null) {
            $$$reportNull$$$0(0);
        }
    }

    @Override // defpackage.ahfe
    public void visitEnum(ahnj ahnjVar, ahnd ahndVar, ahnj ahnjVar2) {
        if (ahndVar == null) {
            $$$reportNull$$$0(1);
        }
        if (ahnjVar2 == null) {
            $$$reportNull$$$0(2);
        }
    }

    public /* synthetic */ ahgg(ahgk ahgkVar, ahgc ahgcVar) {
        this(ahgkVar);
    }

    @Override // defpackage.ahfe
    public void visitEnd() {
    }
}
