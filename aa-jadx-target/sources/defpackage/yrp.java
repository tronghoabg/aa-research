package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class yrp {
    private static final defpackage.yrp a = new defpackage.yrj();

    public static defpackage.yrp g(defpackage.yqy yqyVar, defpackage.yqy yqyVar2) {
        int iB = yqyVar2.b();
        if (iB == 0) {
            return a;
        }
        return iB <= 28 ? new defpackage.yrn(yqyVar, yqyVar2) : new yro(yqyVar, yqyVar2);
    }

    public abstract int a();

    public abstract java.lang.Object b(defpackage.ypx ypxVar);

    public abstract java.util.Set c();

    public abstract void d(defpackage.yrf yrfVar, java.lang.Object obj);
}
