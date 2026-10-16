package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class ytb {
    public final int a;
    public final defpackage.yqq b;

    protected ytb(defpackage.yqq yqqVar, int i) {
        if (yqqVar == null) {
            throw new java.lang.IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "invalid index: "));
        }
        this.a = i;
        this.b = yqqVar;
    }

    public abstract void a(defpackage.ytf ytfVar, java.lang.Object obj);
}
