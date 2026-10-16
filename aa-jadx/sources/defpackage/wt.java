package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wt {
    public static final defpackage.wt a;
    public final int b;
    public final int c;

    static {
        defpackage.euf eufVar = new defpackage.euf(null, null);
        eufVar.a = 4;
        eufVar.e();
        a = new defpackage.wt(eufVar);
        defpackage.euf eufVar2 = new defpackage.euf(null, null);
        eufVar2.a = 5;
        eufVar2.e();
    }

    public wt(defpackage.euf eufVar) {
        this.b = eufVar.a;
        this.c = eufVar.b;
    }
}
