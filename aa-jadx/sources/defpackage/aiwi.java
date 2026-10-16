package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class aiwi extends defpackage.aiwn implements defpackage.aiwg {
    private final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiwi(defpackage.aiwg aiwgVar) {
        defpackage.aiwn aiwnVarF;
        super(true);
        boolean z = true;
        I(aiwgVar);
        defpackage.aiuk aiukVarF = F();
        defpackage.aiul aiulVar = aiukVarF instanceof defpackage.aiul ? (defpackage.aiul) aiukVarF : null;
        if (aiulVar == null || (aiwnVarF = aiulVar.f()) == null) {
            z = false;
            break;
        }
        while (!aiwnVarF.gN()) {
            defpackage.aiuk aiukVarF2 = aiwnVarF.F();
            defpackage.aiul aiulVar2 = aiukVarF2 instanceof defpackage.aiul ? (defpackage.aiul) aiukVarF2 : null;
            if (aiulVar2 == null || (aiwnVarF = aiulVar2.f()) == null) {
                z = false;
                break;
            }
        }
        this.a = z;
    }

    @Override // defpackage.aiwn
    public final boolean gI() {
        return true;
    }

    @Override // defpackage.aiwn
    public final boolean gN() {
        return this.a;
    }
}
