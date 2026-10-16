package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nih extends defpackage.lhr {
    final /* synthetic */ defpackage.nik a;

    public nih(defpackage.nik nikVar) {
        this.a = nikVar;
    }

    @Override // defpackage.lhr, defpackage.lhs
    public final void c() {
        defpackage.nik nikVar = this.a;
        if (!nikVar.isAdded()) {
            ((defpackage.yqj) defpackage.nik.b.h()).u("Trying to register education when rail is not added");
        } else {
            defpackage.ngr.a().b(nikVar.getViewLifecycleOwner(), new defpackage.njq(nikVar, 1));
            nikVar.e = true;
        }
    }
}
