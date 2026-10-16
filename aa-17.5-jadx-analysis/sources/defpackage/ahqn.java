package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ahqn implements ahqp {
    public static final ahqn INSTANCE = new ahqn();

    private ahqn() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [agbd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [agbi] */
    /* JADX WARN: Type inference failed for: r1v2, types: [agbi] */
    @Override // defpackage.ahqp
    public String renderClassifier(agbd agbdVar, ahre ahreVar) {
        agbdVar.getClass();
        ahreVar.getClass();
        if (agbdVar instanceof agee) {
            ahnj name = ((agee) agbdVar).getName();
            name.getClass();
            return ahreVar.renderName(name, false);
        }
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(agbdVar.getName());
            agbdVar = agbdVar.getContainingDeclaration();
        } while (agbdVar instanceof agba);
        return ahsi.renderFqName(new afbm(arrayList));
    }
}
