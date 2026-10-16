package defpackage;

/* loaded from: classes2.dex */
public final class fmo implements aiyl {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public fmo(fml fmlVar, fod fodVar, int i) {
        this.c = i;
        this.a = fmlVar;
        this.b = fodVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [cwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [fml, java.lang.Object] */
    @Override // defpackage.aiyl
    public final /* synthetic */ Object a(Object obj, afck afckVar) {
        int i = this.c;
        if (i == 0) {
            this.a.e((fod) this.b, (flq) obj);
            return afak.a;
        }
        if (i != 1) {
            Boolean bool = (Boolean) obj;
            jwl jwlVar = (jwl) this.b;
            yop yopVarL = jwlVar.d.l();
            bool.getClass();
            yopVarL.P("Parked constraint changed to %s dispatched to app %s", bool.booleanValue(), ((gmh) ((jwq) this.a).c).a);
            jwlVar.b = bool.booleanValue();
            jwlVar.h.a(6);
            return afak.a;
        }
        asd asdVar = (asd) obj;
        if (asdVar instanceof asi) {
            ((afft) this.b).a++;
        } else if ((asdVar instanceof asj) || (asdVar instanceof ash)) {
            afft afftVar = (afft) this.b;
            afftVar.a--;
        }
        boolean z = ((afft) this.b).a > 0;
        ?? r3 = this.a;
        brt brtVar = (brt) r3;
        if (brtVar.d != z) {
            brtVar.d = z;
            cjn.u(r3);
        }
        return afak.a;
    }

    public fmo(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
