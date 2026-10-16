package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class il extends defpackage.ky {
    final /* synthetic */ defpackage.im a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(defpackage.im imVar, android.view.View view) {
        super(view);
        this.a = imVar;
    }

    @Override // defpackage.ky
    public final hx a() {
        in inVar = this.a.a.i;
        if (inVar == null) {
            return null;
        }
        return inVar.a();
    }

    @Override // defpackage.ky
    public final boolean b() {
        this.a.a.m();
        return true;
    }

    @Override // defpackage.ky
    public final boolean c() {
        defpackage.ip ipVar = this.a.a;
        if (ipVar.l != null) {
            return false;
        }
        ipVar.k();
        return true;
    }
}
