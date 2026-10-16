package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bvv extends defpackage.bvm {
    private final defpackage.byo a;

    public bvv(defpackage.byo byoVar, defpackage.afer aferVar) {
        super(aferVar);
        this.a = byoVar;
    }

    @Override // defpackage.bvm
    public final defpackage.bxk b(java.lang.Object obj) {
        return new defpackage.bxk(this, obj, obj == null, this.a, null, true);
    }
}
