package defpackage;

/* loaded from: classes2.dex */
public class aivj extends aivo implements aivh {
    private final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aivj(aivh aivhVar) {
        aivo aivoVarF;
        super(true);
        boolean z = true;
        I(aivhVar);
        aitk aitkVarF = F();
        aitl aitlVar = aitkVarF instanceof aitl ? (aitl) aitkVarF : null;
        if (aitlVar == null || (aivoVarF = aitlVar.f()) == null) {
            z = false;
            break;
        }
        while (!aivoVarF.hB()) {
            aitk aitkVarF2 = aivoVarF.F();
            aitl aitlVar2 = aitkVarF2 instanceof aitl ? (aitl) aitkVarF2 : null;
            if (aitlVar2 == null || (aivoVarF = aitlVar2.f()) == null) {
                z = false;
                break;
            }
        }
        this.a = z;
    }

    @Override // defpackage.aivo
    public final boolean hB() {
        return this.a;
    }

    @Override // defpackage.aivo
    public final boolean hw() {
        return true;
    }
}
