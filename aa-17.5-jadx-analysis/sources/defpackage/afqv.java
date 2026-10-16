package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class afqv extends afkb {
    public afqv(afqw afqwVar) {
        super(afqwVar);
    }

    @Override // defpackage.agha, defpackage.agbk
    public afko<?> visitConstructorDescriptor(agbh agbhVar, afak afakVar) {
        agbhVar.getClass();
        afakVar.getClass();
        Objects.toString(agbhVar);
        throw new IllegalStateException("No constructors should appear here: ".concat(agbhVar.toString()));
    }
}
