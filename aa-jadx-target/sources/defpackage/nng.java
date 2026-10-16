package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nng {
    public boolean a;
    private final defpackage.gja b;

    public nng(defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.afer aferVar3, defpackage.afer aferVar4) {
        this.b = new defpackage.gja(new defpackage.bxn(aferVar2, this, 18, null), new defpackage.bxn(this, aferVar3, 19), new defpackage.axl(this, aferVar, aferVar4, 7), new defpackage.bxn(this, aferVar4, 20));
    }

    public final defpackage.gja a(java.lang.Object obj, java.lang.Object obj2, defpackage.bve bveVar, int i) {
        if ((i & 1) != 0) {
            obj = defpackage.afbk.a;
        }
        if ((i & 2) != 0) {
            obj2 = defpackage.afbk.a;
        }
        defpackage.gja gjaVar = this.b;
        gjaVar.b(new java.lang.Object[]{obj, obj2}, bveVar);
        return gjaVar;
    }
}
