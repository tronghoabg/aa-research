package defpackage;

/* loaded from: classes.dex */
public abstract class bim implements djq {
    public bik b;

    @Override // defpackage.djq
    public /* synthetic */ void b(cjb cjbVar) {
        throw null;
    }

    @Override // defpackage.djq
    public /* synthetic */ void c() {
        throw null;
    }

    public abstract void e();

    @Override // defpackage.djq
    public /* synthetic */ void h(djv djvVar, djn djnVar, dft dftVar, afec afecVar, cjb cjbVar, cjb cjbVar2) {
        throw null;
    }

    @Override // defpackage.djq
    public final void i() {
        sm smVarB;
        bik bikVar = this.b;
        if (bikVar == null || (smVarB = bikVar.b()) == null) {
            return;
        }
        smVarB.q();
    }

    @Override // defpackage.djq
    public final void j() {
        sm smVarB;
        bik bikVar = this.b;
        if (bikVar == null || (smVarB = bikVar.b()) == null) {
            return;
        }
        smVarB.r();
    }

    public final void k(bik bikVar) {
        if (this.b != null) {
            asl.d("Expected textInputModifierNode to be null");
        }
        this.b = bikVar;
    }

    public final void l(bik bikVar) {
        bik bikVar2 = this.b;
        if (bikVar2 != bikVar) {
            asl.d(a.bt(bikVar2, bikVar, "Expected textInputModifierNode to be ", " but was "));
        }
        this.b = null;
    }
}
