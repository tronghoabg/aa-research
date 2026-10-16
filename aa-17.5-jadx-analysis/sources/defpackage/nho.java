package defpackage;

/* loaded from: classes.dex */
public final class nho extends lhk {
    final /* synthetic */ nhr a;

    public nho(nhr nhrVar) {
        this.a = nhrVar;
    }

    @Override // defpackage.lhk, defpackage.lhl
    public final void c() {
        nhr nhrVar = this.a;
        if (!nhrVar.isAdded()) {
            ((ype) nhr.b.h()).u("Trying to register education when rail is not added");
        } else {
            nfy.a().b(nhrVar.getViewLifecycleOwner(), new niu(nhrVar, 1));
            nhrVar.e = true;
        }
    }
}
