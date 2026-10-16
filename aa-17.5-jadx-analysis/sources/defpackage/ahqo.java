package defpackage;

/* loaded from: classes3.dex */
public final class ahqo implements ahqp {
    public static final ahqo INSTANCE = new ahqo();

    private ahqo() {
    }

    private final String qualifiedNameForSourceCode(agbd agbdVar) {
        ahnj name = agbdVar.getName();
        name.getClass();
        String strRender$default = ahnk.render$default(name, false, 1, null);
        if (!(agbdVar instanceof agee)) {
            agbi containingDeclaration = agbdVar.getContainingDeclaration();
            containingDeclaration.getClass();
            String strQualifierName = qualifierName(containingDeclaration);
            if (strQualifierName != null && !affa.f(strQualifierName, "")) {
                return strQualifierName + '.' + strRender$default;
            }
        }
        return strRender$default;
    }

    private final String qualifierName(agbi agbiVar) {
        if (agbiVar instanceof agba) {
            return qualifiedNameForSourceCode((agbd) agbiVar);
        }
        if (agbiVar instanceof agdc) {
            return ahnk.render(((agdc) agbiVar).getFqName().toUnsafe());
        }
        return null;
    }

    @Override // defpackage.ahqp
    public String renderClassifier(agbd agbdVar, ahre ahreVar) {
        agbdVar.getClass();
        ahreVar.getClass();
        return qualifiedNameForSourceCode(agbdVar);
    }
}
