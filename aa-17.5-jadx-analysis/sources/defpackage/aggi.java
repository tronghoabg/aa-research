package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class aggi extends aggt {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggi(aiei aieiVar, agbi agbiVar, agfk agfkVar, ahnj ahnjVar, aijg aijgVar, boolean z, int i, agdx agdxVar, agec agecVar) {
        super(aieiVar, agbiVar, agfkVar, ahnjVar, aijgVar, z, i, agdxVar, agecVar);
        if (aieiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(2);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(3);
        }
        if (aijgVar == null) {
            $$$reportNull$$$0(4);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(5);
        }
        if (agecVar == null) {
            $$$reportNull$$$0(6);
        }
    }

    @Override // defpackage.aggy
    public String toString() {
        String strConcat = "";
        String str = true != isReified() ? "" : "reified ";
        if (getVariance() != aijg.INVARIANT) {
            aijg variance = getVariance();
            Objects.toString(variance);
            strConcat = String.valueOf(variance).concat(" ");
        }
        return String.format("%s%s%s", str, strConcat, getName());
    }
}
