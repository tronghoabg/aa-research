package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agwh {
    public static boolean a(java.lang.CharSequence charSequence) {
        if (charSequence != null) {
            for (int i = 0; i < charSequence.length(); i++) {
                if (!java.lang.Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(java.lang.CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static int c(int i, java.lang.Object obj) {
        return (i * 37) + (obj != null ? obj.hashCode() : 0);
    }

    public static final java.util.List<defpackage.agfl> copyValueParameters(java.util.Collection<? extends defpackage.aihl> collection, java.util.Collection<? extends defpackage.agfl> collection2, defpackage.agbv agbvVar) {
        collection.getClass();
        collection2.getClass();
        agbvVar.getClass();
        collection.size();
        collection2.size();
        java.util.List<defpackage.afau> listBc = defpackage.afga.bc(collection, collection2);
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(listBc, 10));
        for (defpackage.afau afauVar : listBc) {
            defpackage.aihl aihlVar = (defpackage.aihl) afauVar.a;
            defpackage.agfl agflVar = (defpackage.agfl) afauVar.b;
            int index = agflVar.getIndex();
            defpackage.aggk annotations = agflVar.getAnnotations();
            defpackage.ahoj name = agflVar.getName();
            name.getClass();
            boolean zDeclaresDefaultValue = agflVar.declaresDefaultValue();
            boolean zIsCrossinline = agflVar.isCrossinline();
            boolean zIsNoinline = agflVar.isNoinline();
            defpackage.aihl arrayElementType = agflVar.getVarargElementType() != null ? defpackage.ahwz.getModule(agbvVar).getBuiltIns().getArrayElementType(aihlVar) : null;
            defpackage.agex source = agflVar.getSource();
            source.getClass();
            arrayList.add(new defpackage.agjy(agbvVar, null, index, annotations, name, aihlVar, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, arrayElementType, source));
        }
        return arrayList;
    }

    public static boolean d(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (!defpackage.a.an(objArr[i], objArr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static final defpackage.agzo getParentJavaStaticClassScope(defpackage.agca agcaVar) {
        agcaVar.getClass();
        defpackage.agca superClassNotAny = defpackage.ahwz.getSuperClassNotAny(agcaVar);
        if (superClassNotAny == null) {
            return null;
        }
        defpackage.ahye staticScope = superClassNotAny.getStaticScope();
        defpackage.agzo agzoVar = staticScope instanceof defpackage.agzo ? (defpackage.agzo) staticScope : null;
        return agzoVar == null ? getParentJavaStaticClassScope(superClassNotAny) : agzoVar;
    }
}
