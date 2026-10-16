package defpackage;

/* loaded from: classes.dex */
public final class vqe {
    public vqf a;
    public vpy b;
    public final vqd c = new vqd();

    public vqe(vqk vqkVar, vqq vqqVar, aezk aezkVar, aezk aezkVar2) {
        int i = 3;
        xyc xycVarL = wub.L(new vks(aezkVar, i));
        xyc xycVarL2 = wub.L(new vks(aezkVar2, i));
        if (!((Boolean) xycVarL2.gu()).booleanValue()) {
            d(vqkVar, xycVarL, xycVarL2);
            c(vqqVar, xycVarL, xycVarL2);
        } else if (((Boolean) xycVarL.gu()).booleanValue()) {
            c(vqqVar, xycVarL, xycVarL2);
        } else {
            d(vqkVar, xycVarL, xycVarL2);
        }
    }

    private final void c(vqq vqqVar, xyc xycVar, xyc xycVar2) {
        this.b = new vpy(new vqc(this, xycVar2, xycVar, vqqVar, 0));
        vqqVar.g.add(this.b);
    }

    private final void d(vqk vqkVar, xyc xycVar, xyc xycVar2) {
        vqf vqfVar = new vqf(new vqc(this, xycVar2, xycVar, vqkVar, 1));
        this.a = vqfVar;
        vqkVar.a(vqfVar);
    }

    public final void a(vqa vqaVar) {
        this.c.b.add(vqaVar);
    }

    public final void b(vqa vqaVar) {
        this.c.b.remove(vqaVar);
    }
}
