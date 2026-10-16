package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bzw extends defpackage.cbd {
    public static final defpackage.bzw a = new defpackage.bzw();

    private bzw() {
        super(0, 2);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        int i = ((defpackage.cda) cbgVar.c(0)).a;
        java.util.List list = (java.util.List) cbgVar.c(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = list.get(i2);
            int i3 = i + i2;
            buqVar.i(i3, obj);
            buqVar.j(i3, obj);
        }
    }
}
