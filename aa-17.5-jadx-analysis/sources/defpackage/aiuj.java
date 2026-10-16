package defpackage;

/* loaded from: classes3.dex */
public final class aiuj extends ajcw {
    public final aisv b;

    public aiuj(afco afcoVar, afck afckVar) {
        super(afcoVar, afckVar);
        this.b = new aisv(0, aisy.a);
    }

    @Override // defpackage.ajcw, defpackage.aisz
    protected final void f(Object obj) {
        aisv aisvVar;
        do {
            aisvVar = this.b;
            int i = aisvVar.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                afck afckVar = this.c;
                ajcb.a(affa.s(afckVar), ahng.a(obj, afckVar));
                return;
            }
        } while (!aisvVar.b(0, 2));
    }

    @Override // defpackage.ajcw, defpackage.aivo
    protected final void l(Object obj) {
        f(obj);
    }
}
