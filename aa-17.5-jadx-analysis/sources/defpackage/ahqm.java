package defpackage;

/* loaded from: classes3.dex */
public final class ahqm implements ahqp {
    public static final ahqm INSTANCE = new ahqm();

    private ahqm() {
    }

    @Override // defpackage.ahqp
    public String renderClassifier(agbd agbdVar, ahre ahreVar) {
        agbdVar.getClass();
        ahreVar.getClass();
        if (agbdVar instanceof agee) {
            ahnj name = ((agee) agbdVar).getName();
            name.getClass();
            return ahreVar.renderName(name, false);
        }
        ahnh fqName = ahst.getFqName(agbdVar);
        fqName.getClass();
        return ahreVar.renderFqName(fqName);
    }
}
