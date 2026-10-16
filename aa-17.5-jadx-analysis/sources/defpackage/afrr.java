package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class afrr extends afkb {
    public afrr(afrt afrtVar) {
        super(afrtVar);
    }

    @Override // defpackage.agha, defpackage.agbk
    public afko<?> visitConstructorDescriptor(agbh agbhVar, afak afakVar) {
        agbhVar.getClass();
        afakVar.getClass();
        Objects.toString(agbhVar);
        throw new IllegalStateException("No constructors should appear here: ".concat(agbhVar.toString()));
    }
}
