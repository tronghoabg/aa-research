package defpackage;

/* loaded from: classes2.dex */
final class aivm extends aivk {
    private final aivo a;
    private final aivn c;
    private final aitl f;
    private final Object g;

    public aivm(aivo aivoVar, aivn aivnVar, aitl aitlVar, Object obj) {
        this.a = aivoVar;
        this.c = aivnVar;
        this.f = aitlVar;
        this.g = obj;
    }

    @Override // defpackage.aivk
    public final void b(Throwable th) {
        boolean z = aitz.a;
        aivo aivoVar = this.a;
        aivn aivnVar = this.c;
        aitl aitlVar = this.f;
        aitl aitlVarQ = aivo.Q(aitlVar);
        Object obj = this.g;
        if (aitlVarQ == null || !aivoVar.P(aivnVar, aitlVarQ, obj)) {
            aivnVar.a.k(2);
            aitl aitlVarQ2 = aivo.Q(aitlVar);
            if (aitlVarQ2 == null || !aivoVar.P(aivnVar, aitlVarQ2, obj)) {
                aivoVar.l(aivoVar.hM(aivnVar, obj));
            }
        }
    }

    @Override // defpackage.aivk
    public final boolean c() {
        return false;
    }
}
