package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bwf implements defpackage.afer {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public bwf(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.afer
    public final /* synthetic */ java.lang.Object invoke() {
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i != 0) {
            return ((defpackage.agn) obj).d();
        }
        java.util.List list = ((defpackage.bwg) obj).a;
        defpackage.aau aauVar = new defpackage.aau(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.bzj bzjVar = (defpackage.bzj) list.get(i2);
            java.lang.Object obj2 = bzjVar.b;
            defpackage.byy.b(aauVar, obj2 != null ? new defpackage.bwl(java.lang.Integer.valueOf(bzjVar.a), obj2) : java.lang.Integer.valueOf(bzjVar.a), bzjVar);
        }
        return new defpackage.byy(aauVar);
    }
}
