package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class io implements defpackage.hs {
    final /* synthetic */ defpackage.ip a;

    public io(defpackage.ip ipVar) {
        this.a = ipVar;
    }

    @Override // defpackage.hs
    public final void a(defpackage.hh hhVar, boolean z) {
        if (hhVar instanceof ib) {
            hhVar.a().i(false);
        }
        defpackage.hs hsVar = this.a.e;
        if (hsVar != null) {
            hsVar.a(hhVar, z);
        }
    }

    @Override // defpackage.hs
    public final boolean b(defpackage.hh hhVar) {
        defpackage.ip ipVar = this.a;
        if (hhVar == ipVar.c) {
            return false;
        }
        defpackage.hj hjVar = ((ib) hhVar).l;
        defpackage.hs hsVar = ipVar.e;
        if (hsVar != null) {
            return hsVar.b(hhVar);
        }
        return false;
    }
}
