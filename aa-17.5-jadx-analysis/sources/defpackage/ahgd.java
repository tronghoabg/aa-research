package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
abstract class ahgd implements ahff {
    private final List<String> strings = new ArrayList();

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
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
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.ahff
    public void visit(Object obj) {
        if (obj instanceof String) {
            this.strings.add((String) obj);
        }
    }

    @Override // defpackage.ahff
    public ahfe visitAnnotation(ahnd ahndVar) {
        if (ahndVar != null) {
            return null;
        }
        $$$reportNull$$$0(3);
        return null;
    }

    @Override // defpackage.ahff
    public void visitClassLiteral(ahug ahugVar) {
        if (ahugVar == null) {
            $$$reportNull$$$0(2);
        }
    }

    @Override // defpackage.ahff
    public void visitEnd() {
        visitEnd((String[]) this.strings.toArray(new String[0]));
    }

    protected abstract void visitEnd(String[] strArr);

    @Override // defpackage.ahff
    public void visitEnum(ahnd ahndVar, ahnj ahnjVar) {
        if (ahndVar == null) {
            $$$reportNull$$$0(0);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(1);
        }
    }
}
